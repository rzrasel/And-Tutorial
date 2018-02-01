package com.rac.stuido.banglakeyboard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class C0570e extends DataSetObservable {
    private static final String f2802a = C0570e.class.getSimpleName();
    private static final Object f2803b = new Object();
    private static final Map f2804c = new HashMap();
    private static final Executor f2805q = Executors.newSingleThreadExecutor();
    private final Object f2806d = new Object();
    private final List f2807e = new ArrayList();
    private final List f2808f = new ArrayList();
    private final Context f2809g;
    private final String f2810h;
    private Intent f2811i;
    private C0572g f2812j = new C0573h();
    private int f2813k = 50;
    private boolean f2814l = true;
    private boolean f2815m = false;
    private boolean f2816n = true;
    private final Handler f2817o = new Handler();
    private C0567m f2818p;

    private C0570e(Context context, String str) {
        this.f2809g = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f2810h = str;
        } else {
            this.f2810h = str + ".xml";
        }
    }

    public static C0570e m4015a(Context context, String str) {
        C0570e c0570e;
        synchronized (f2803b) {
            c0570e = (C0570e) f2804c.get(str);
            if (c0570e == null) {
                c0570e = new C0570e(context, str);
                f2804c.put(str, c0570e);
            }
            synchronized (c0570e.f2806d) {
                if (c0570e.f2814l && c0570e.f2816n) {
                    c0570e.f2814l = false;
                    c0570e.f2815m = true;
                    if (!TextUtils.isEmpty(c0570e.f2810h)) {
                        f2805q.execute(new C0575j(c0570e, (byte) 0));
                    }
                }
            }
        }
        return c0570e;
    }

    private boolean m4017a(C0574i c0574i) {
        boolean add;
        synchronized (this.f2806d) {
            add = this.f2808f.add(c0574i);
            if (add) {
                this.f2816n = true;
                m4023e();
                synchronized (this.f2806d) {
                    if (!this.f2815m) {
                        throw new IllegalStateException("No preceding call to #readHistoricalData");
                    } else if (this.f2816n) {
                        this.f2816n = false;
                        this.f2814l = true;
                        if (!TextUtils.isEmpty(this.f2810h)) {
                            f2805q.execute(new C0577l());
                        }
                    }
                }
                m4022d();
            }
        }
        return add;
    }

    private void m4022d() {
        synchronized (this.f2806d) {
            if (!(this.f2812j == null || this.f2807e.isEmpty())) {
                C0572g c0572g = this.f2812j;
                Intent intent = this.f2811i;
                c0572g.mo1373a(this.f2807e, Collections.unmodifiableList(this.f2808f));
                notifyChanged();
            }
        }
    }

    private void m4023e() {
        List list = this.f2808f;
        int size = list.size() - this.f2813k;
        if (size > 0) {
            this.f2816n = true;
            for (int i = 0; i < size; i++) {
                list.remove(0);
            }
        }
    }

    public final int m4028a() {
        int size;
        synchronized (this.f2806d) {
            size = this.f2807e.size();
        }
        return size;
    }

    public final int m4029a(ResolveInfo resolveInfo) {
        List list = this.f2807e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C0571f) list.get(i)).f2819a == resolveInfo) {
                return i;
            }
        }
        return -1;
    }

    public final ResolveInfo m4030a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f2806d) {
            resolveInfo = ((C0571f) this.f2807e.get(i)).f2819a;
        }
        return resolveInfo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4031a(android.content.Intent r8) {
        /*
        r7 = this;
        r0 = 0;
        r2 = r7.f2806d;
        monitor-enter(r2);
        r1 = r7.f2811i;	 Catch:{ all -> 0x0042 }
        if (r1 != r8) goto L_0x000a;
    L_0x0008:
        monitor-exit(r2);	 Catch:{ all -> 0x0042 }
    L_0x0009:
        return;
    L_0x000a:
        r7.f2811i = r8;	 Catch:{ all -> 0x0042 }
        r1 = r7.f2807e;	 Catch:{ all -> 0x0042 }
        r1.clear();	 Catch:{ all -> 0x0042 }
        r1 = r7.f2811i;	 Catch:{ all -> 0x0042 }
        if (r1 == 0) goto L_0x0045;
    L_0x0015:
        r1 = r7.f2809g;	 Catch:{ all -> 0x0042 }
        r1 = r1.getPackageManager();	 Catch:{ all -> 0x0042 }
        r3 = r7.f2811i;	 Catch:{ all -> 0x0042 }
        r4 = 0;
        r3 = r1.queryIntentActivities(r3, r4);	 Catch:{ all -> 0x0042 }
        r4 = r3.size();	 Catch:{ all -> 0x0042 }
        r1 = r0;
    L_0x0027:
        if (r1 >= r4) goto L_0x003d;
    L_0x0029:
        r0 = r3.get(r1);	 Catch:{ all -> 0x0042 }
        r0 = (android.content.pm.ResolveInfo) r0;	 Catch:{ all -> 0x0042 }
        r5 = r7.f2807e;	 Catch:{ all -> 0x0042 }
        r6 = new com.rac.stuido.banglakeyboard.f;	 Catch:{ all -> 0x0042 }
        r6.<init>(r7, r0);	 Catch:{ all -> 0x0042 }
        r5.add(r6);	 Catch:{ all -> 0x0042 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0027;
    L_0x003d:
        r7.m4022d();	 Catch:{ all -> 0x0042 }
    L_0x0040:
        monitor-exit(r2);	 Catch:{ all -> 0x0042 }
        goto L_0x0009;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0045:
        r7.notifyChanged();	 Catch:{ all -> 0x0042 }
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rac.stuido.banglakeyboard.e.a(android.content.Intent):void");
    }

    public final void m4032a(C0567m c0567m) {
        this.f2818p = c0567m;
    }

    public final Intent m4033b(int i) {
        C0571f c0571f = (C0571f) this.f2807e.get(i);
        ComponentName componentName = new ComponentName(c0571f.f2819a.activityInfo.packageName, c0571f.f2819a.activityInfo.name);
        Intent intent = new Intent(this.f2811i);
        intent.setComponent(componentName);
        if (this.f2818p != null) {
            Intent intent2 = new Intent(intent);
            if (this.f2818p.mo1371a()) {
                return null;
            }
        }
        m4017a(new C0574i(componentName, System.currentTimeMillis(), 1.0f));
        return intent;
    }

    public final ResolveInfo m4034b() {
        synchronized (this.f2806d) {
            if (this.f2807e.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0571f) this.f2807e.get(0)).f2819a;
            return resolveInfo;
        }
    }

    public final void m4035c(int i) {
        C0571f c0571f = (C0571f) this.f2807e.get(i);
        C0571f c0571f2 = (C0571f) this.f2807e.get(0);
        m4017a(new C0574i(new ComponentName(c0571f.f2819a.activityInfo.packageName, c0571f.f2819a.activityInfo.name), System.currentTimeMillis(), c0571f2 != null ? (c0571f2.f2820b - c0571f.f2820b) + 5.0f : 1.0f));
    }
}
