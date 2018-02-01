package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1538g;
import java.util.List;

@TargetApi(14)
@aqv
public final class yd extends Thread {
    boolean f7477a = false;
    final Object f7478b;
    final xx f7479c;
    final aqt f7480d;
    final int f7481e;
    final int f7482f;
    final int f7483g;
    final int f7484h;
    final int f7485i;
    final int f7486j;
    final int f7487k;
    final boolean f7488l;
    private boolean f7489m = false;
    private boolean f7490n = false;
    private final int f7491o;
    private final String f7492p;

    public yd(xx xxVar, aqt com_google_android_gms_internal_aqt) {
        this.f7479c = xxVar;
        this.f7480d = com_google_android_gms_internal_aqt;
        this.f7478b = new Object();
        this.f7481e = ((Integer) zzbv.zzen().m4217a(ado.f4872K)).intValue();
        this.f7482f = ((Integer) zzbv.zzen().m4217a(ado.f4873L)).intValue();
        this.f7483g = ((Integer) zzbv.zzen().m4217a(ado.f4874M)).intValue();
        this.f7484h = ((Integer) zzbv.zzen().m4217a(ado.f4875N)).intValue();
        this.f7485i = ((Integer) zzbv.zzen().m4217a(ado.f4878Q)).intValue();
        this.f7486j = ((Integer) zzbv.zzen().m4217a(ado.f4880S)).intValue();
        this.f7487k = ((Integer) zzbv.zzen().m4217a(ado.f4881T)).intValue();
        this.f7491o = ((Integer) zzbv.zzen().m4217a(ado.f4876O)).intValue();
        this.f7492p = (String) zzbv.zzen().m4217a(ado.f4883V);
        this.f7488l = ((Boolean) zzbv.zzen().m4217a(ado.f4885X)).booleanValue();
        setName("ContentFetchTask");
    }

    private static boolean m7027b() {
        try {
            Context b = zzbv.zzed().m7010b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        PowerManager powerManager = (PowerManager) b.getSystemService("power");
                        if (powerManager == null ? false : powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            zzbv.zzee().m5336a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void m7028c() {
        synchronized (this.f7478b) {
            this.f7477a = true;
            new StringBuilder(42).append("ContentFetchThread: paused, mPause = ").append(this.f7477a);
            id.m5372a(3);
        }
    }

    final yh m7029a(View view, xw xwVar) {
        int i = 0;
        if (view == null) {
            return new yh(0, 0);
        }
        Context b = zzbv.zzed().m7010b();
        if (b != null) {
            String str = (String) view.getTag(b.getResources().getIdentifier((String) zzbv.zzen().m4217a(ado.f4882U), "id", b.getPackageName()));
            if (!(TextUtils.isEmpty(this.f7492p) || str == null || !str.equals(this.f7492p))) {
                return new yh(0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new yh(0, 0);
            }
            xwVar.m7003b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new yh(1, 0);
        } else if ((view instanceof WebView) && !(view instanceof jf)) {
            xwVar.m7002b();
            WebView webView = (WebView) view;
            if (C1538g.m3944d()) {
                xwVar.m7002b();
                webView.post(new yf(this, xwVar, webView, globalVisibleRect));
                r0 = 1;
            } else {
                r0 = 0;
            }
            return r0 != 0 ? new yh(0, 1) : new yh(0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new yh(0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            for (r0 = 0; r0 < viewGroup.getChildCount(); r0++) {
                yh a = m7029a(viewGroup.getChildAt(r0), xwVar);
                i2 += a.f7501a;
                i += a.f7502b;
            }
            return new yh(i2, i);
        }
    }

    public final void m7030a() {
        synchronized (this.f7478b) {
            if (this.f7489m) {
                id.m5372a(3);
                return;
            }
            this.f7489m = true;
            start();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r5 = this;
        r4 = 6;
    L_0x0001:
        r0 = m7027b();	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        if (r0 == 0) goto L_0x0082;
    L_0x0007:
        r0 = com.google.android.gms.ads.internal.zzbv.zzed();	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r1 = r0.m7008a();	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        if (r1 != 0) goto L_0x0033;
    L_0x0011:
        r0 = 3;
        com.google.android.gms.internal.id.m5372a(r0);	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r5.m7028c();	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
    L_0x0018:
        r0 = r5.f7491o;	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r0 = r0 * 1000;
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
    L_0x0020:
        r1 = r5.f7478b;
        monitor-enter(r1);
    L_0x0023:
        r0 = r5.f7477a;	 Catch:{ all -> 0x008d }
        if (r0 == 0) goto L_0x008a;
    L_0x0027:
        r0 = 3;
        com.google.android.gms.internal.id.m5372a(r0);	 Catch:{ InterruptedException -> 0x0031 }
        r0 = r5.f7478b;	 Catch:{ InterruptedException -> 0x0031 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0031 }
        goto L_0x0023;
    L_0x0031:
        r0 = move-exception;
        goto L_0x0023;
    L_0x0033:
        if (r1 == 0) goto L_0x0018;
    L_0x0035:
        r0 = 0;
        r2 = r1.getWindow();	 Catch:{ Exception -> 0x0067, InterruptedException -> 0x0062 }
        if (r2 == 0) goto L_0x0055;
    L_0x003c:
        r2 = r1.getWindow();	 Catch:{ Exception -> 0x0067, InterruptedException -> 0x0062 }
        r2 = r2.getDecorView();	 Catch:{ Exception -> 0x0067, InterruptedException -> 0x0062 }
        if (r2 == 0) goto L_0x0055;
    L_0x0046:
        r1 = r1.getWindow();	 Catch:{ Exception -> 0x0067, InterruptedException -> 0x0062 }
        r1 = r1.getDecorView();	 Catch:{ Exception -> 0x0067, InterruptedException -> 0x0062 }
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r0 = r1.findViewById(r2);	 Catch:{ Exception -> 0x0067, InterruptedException -> 0x0062 }
    L_0x0055:
        if (r0 == 0) goto L_0x0018;
    L_0x0057:
        if (r0 == 0) goto L_0x0018;
    L_0x0059:
        r1 = new com.google.android.gms.internal.ye;	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r1.<init>(r5, r0);	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r0.post(r1);	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        goto L_0x0018;
    L_0x0062:
        r0 = move-exception;
        com.google.android.gms.internal.id.m5372a(r4);
        goto L_0x0020;
    L_0x0067:
        r1 = move-exception;
        r2 = com.google.android.gms.ads.internal.zzbv.zzee();	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r3 = "ContentFetchTask.extractContent";
        r2.m5336a(r1, r3);	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r1 = 3;
        com.google.android.gms.internal.id.m5372a(r1);	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        goto L_0x0055;
    L_0x0076:
        r0 = move-exception;
        com.google.android.gms.internal.id.m5372a(r4);
        r1 = r5.f7480d;
        r2 = "ContentFetchTask.run";
        r1.mo2018a(r0, r2);
        goto L_0x0020;
    L_0x0082:
        r0 = 3;
        com.google.android.gms.internal.id.m5372a(r0);	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        r5.m7028c();	 Catch:{ InterruptedException -> 0x0062, Exception -> 0x0076 }
        goto L_0x0018;
    L_0x008a:
        monitor-exit(r1);	 Catch:{ all -> 0x008d }
        goto L_0x0001;
    L_0x008d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.yd.run():void");
    }
}
