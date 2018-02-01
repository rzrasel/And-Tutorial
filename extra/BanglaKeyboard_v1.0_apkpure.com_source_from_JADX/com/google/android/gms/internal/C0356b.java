package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class C0356b implements OnGlobalLayoutListener, OnScrollChangedListener {
    private static final long f1023m = TimeUnit.MILLISECONDS.toNanos(100);
    private final Object f1024a;
    private final WeakReference f1025b;
    private WeakReference f1026c;
    private final WeakReference f1027d;
    private final ny f1028e;
    private final Context f1029f;
    private final C0369i f1030g;
    private boolean f1031h;
    private final WindowManager f1032i;
    private final PowerManager f1033j;
    private final KeyguardManager f1034k;
    private C0353h f1035l;
    private long f1036n;
    private boolean f1037o;
    private BroadcastReceiver f1038p;
    private HashSet f1039q;

    public C0356b(ak akVar, ez ezVar) {
        this(akVar, ezVar, ezVar.f1339b.m2099h(), ezVar.f1339b, new C0392k(ezVar.f1339b.getContext(), ezVar.f1339b.m2099h()));
    }

    private C0356b(ak akVar, ez ezVar, dx dxVar, View view, C0369i c0369i) {
        this.f1024a = new Object();
        this.f1036n = Long.MIN_VALUE;
        this.f1039q = new HashSet();
        this.f1025b = new WeakReference(ezVar);
        this.f1027d = new WeakReference(view);
        this.f1026c = new WeakReference(null);
        this.f1037o = true;
        this.f1028e = new ny(Integer.toString(ezVar.hashCode()), dxVar, akVar.f935b, ezVar.f1347j);
        this.f1030g = c0369i;
        this.f1032i = (WindowManager) view.getContext().getSystemService("window");
        this.f1033j = (PowerManager) view.getContext().getApplicationContext().getSystemService("power");
        this.f1034k = (KeyguardManager) view.getContext().getSystemService("keyguard");
        this.f1029f = view.getContext().getApplicationContext();
        c0369i.mo933a("http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
        this.f1030g.mo932a(new C0358c(this));
        C0369i c0369i2 = this.f1030g;
        c0369i2.mo934a("/updateActiveView", new C0361e(this));
        c0369i2.mo934a("/activeViewPingSent", new C0362f(this));
        c0369i2.mo934a("/visibilityChanged", new C0365g(this));
        c0369i2.mo934a("/viewabilityChanged", aq.f999a);
        "Tracking ad unit: " + this.f1028e.f2018c;
        gb.m2071a(4);
    }

    private static int m1659a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    protected static void m1660a(C0369i c0369i) {
        c0369i.mo936b("/viewabilityChanged");
        c0369i.mo936b("/visibilityChanged");
        c0369i.mo936b("/activeViewPingSent");
        c0369i.mo936b("/updateActiveView");
    }

    private void m1661a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        this.f1030g.mo935a("AFMA_updateActiveView", jSONObject2);
    }

    private void m1665e() {
        if (this.f1035l != null) {
            this.f1035l.mo821a(this);
        }
    }

    private JSONObject m1666f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f1028e.f2019d).put("activeViewJSON", this.f1028e.f2017b).put("timestamp", TimeUnit.NANOSECONDS.toMillis(System.nanoTime())).put("adFormat", this.f1028e.f2016a).put("hashCode", this.f1028e.f2018c);
        return jSONObject;
    }

    protected final void m1667a() {
        synchronized (this.f1024a) {
            if (this.f1038p != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f1038p = new C0359d(this);
            this.f1029f.registerReceiver(this.f1038p, intentFilter);
        }
    }

    public final void m1668a(C0353h c0353h) {
        synchronized (this.f1024a) {
            this.f1035l = c0353h;
        }
    }

    public final void m1669a(nx nxVar) {
        this.f1039q.add(nxVar);
    }

    protected final void m1670a(boolean z) {
        Iterator it = this.f1039q.iterator();
        while (it.hasNext()) {
            ((nx) it.next()).mo999a(z);
        }
    }

    public final void m1671b() {
        synchronized (this.f1024a) {
            if (this.f1037o) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f1026c.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                synchronized (this.f1024a) {
                    if (this.f1038p != null) {
                        this.f1029f.unregisterReceiver(this.f1038p);
                        this.f1038p = null;
                    }
                }
                try {
                    JSONObject f = m1666f();
                    f.put("doneReasonCode", "u");
                    m1661a(f);
                } catch (JSONException e) {
                    gb.m2071a(6);
                }
                this.f1037o = false;
                m1665e();
                "Untracked ad unit: " + this.f1028e.f2018c;
                gb.m2071a(4);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m1672b(boolean r14) {
        /*
        r13 = this;
        r2 = r13.f1024a;
        monitor-enter(r2);
        r0 = r13.f1031h;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r13.f1037o;	 Catch:{ all -> 0x001e }
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r2);	 Catch:{ all -> 0x001e }
    L_0x000c:
        return;
    L_0x000d:
        r0 = java.lang.System.nanoTime();	 Catch:{ all -> 0x001e }
        if (r14 == 0) goto L_0x0021;
    L_0x0013:
        r3 = r13.f1036n;	 Catch:{ all -> 0x001e }
        r5 = f1023m;	 Catch:{ all -> 0x001e }
        r3 = r3 + r5;
        r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0021;
    L_0x001c:
        monitor-exit(r2);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0021:
        r13.f1036n = r0;	 Catch:{ all -> 0x001e }
        r0 = r13.f1025b;	 Catch:{ all -> 0x001e }
        r0 = r0.get();	 Catch:{ all -> 0x001e }
        r0 = (com.google.android.gms.internal.ez) r0;	 Catch:{ all -> 0x001e }
        r1 = r13.f1027d;	 Catch:{ all -> 0x001e }
        r1 = r1.get();	 Catch:{ all -> 0x001e }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x0037;
    L_0x0035:
        if (r0 != 0) goto L_0x003f;
    L_0x0037:
        r0 = 1;
    L_0x0038:
        if (r0 == 0) goto L_0x0041;
    L_0x003a:
        r13.m1671b();	 Catch:{ all -> 0x001e }
        monitor-exit(r2);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
    L_0x003f:
        r0 = 0;
        goto L_0x0038;
    L_0x0041:
        r0 = 2;
        r0 = new int[r0];	 Catch:{ JSONException -> 0x01f6 }
        r3 = 2;
        r3 = new int[r3];	 Catch:{ JSONException -> 0x01f6 }
        r1.getLocationOnScreen(r0);	 Catch:{ JSONException -> 0x01f6 }
        r1.getLocationInWindow(r3);	 Catch:{ JSONException -> 0x01f6 }
        r3 = r13.m1666f();	 Catch:{ JSONException -> 0x01f6 }
        r4 = r1.getContext();	 Catch:{ JSONException -> 0x01f6 }
        r4 = r4.getResources();	 Catch:{ JSONException -> 0x01f6 }
        r4 = r4.getDisplayMetrics();	 Catch:{ JSONException -> 0x01f6 }
        r5 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x01f6 }
        r5.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r6 = 0;
        r6 = r0[r6];	 Catch:{ JSONException -> 0x01f6 }
        r5.left = r6;	 Catch:{ JSONException -> 0x01f6 }
        r6 = 1;
        r0 = r0[r6];	 Catch:{ JSONException -> 0x01f6 }
        r5.top = r0;	 Catch:{ JSONException -> 0x01f6 }
        r0 = r5.left;	 Catch:{ JSONException -> 0x01f6 }
        r6 = r1.getWidth();	 Catch:{ JSONException -> 0x01f6 }
        r0 = r0 + r6;
        r5.right = r0;	 Catch:{ JSONException -> 0x01f6 }
        r0 = r5.top;	 Catch:{ JSONException -> 0x01f6 }
        r6 = r1.getHeight();	 Catch:{ JSONException -> 0x01f6 }
        r0 = r0 + r6;
        r5.bottom = r0;	 Catch:{ JSONException -> 0x01f6 }
        r0 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x01f6 }
        r0.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r6 = r13.f1032i;	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.getDefaultDisplay();	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.getWidth();	 Catch:{ JSONException -> 0x01f6 }
        r0.right = r6;	 Catch:{ JSONException -> 0x01f6 }
        r6 = r13.f1032i;	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.getDefaultDisplay();	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.getHeight();	 Catch:{ JSONException -> 0x01f6 }
        r0.bottom = r6;	 Catch:{ JSONException -> 0x01f6 }
        r6 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x01f6 }
        r6.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r7 = 0;
        r7 = r1.getGlobalVisibleRect(r6, r7);	 Catch:{ JSONException -> 0x01f6 }
        r8 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x01f6 }
        r8.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r1.getLocalVisibleRect(r8);	 Catch:{ JSONException -> 0x01f6 }
        r9 = "viewBox";
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x01f6 }
        r10.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r11 = "top";
        r12 = r0.top;	 Catch:{ JSONException -> 0x01f6 }
        r12 = com.google.android.gms.internal.C0356b.m1659a(r12, r4);	 Catch:{ JSONException -> 0x01f6 }
        r10 = r10.put(r11, r12);	 Catch:{ JSONException -> 0x01f6 }
        r11 = "bottom";
        r12 = r0.bottom;	 Catch:{ JSONException -> 0x01f6 }
        r12 = com.google.android.gms.internal.C0356b.m1659a(r12, r4);	 Catch:{ JSONException -> 0x01f6 }
        r10 = r10.put(r11, r12);	 Catch:{ JSONException -> 0x01f6 }
        r11 = "left";
        r12 = r0.left;	 Catch:{ JSONException -> 0x01f6 }
        r12 = com.google.android.gms.internal.C0356b.m1659a(r12, r4);	 Catch:{ JSONException -> 0x01f6 }
        r10 = r10.put(r11, r12);	 Catch:{ JSONException -> 0x01f6 }
        r11 = "right";
        r0 = r0.right;	 Catch:{ JSONException -> 0x01f6 }
        r0 = com.google.android.gms.internal.C0356b.m1659a(r0, r4);	 Catch:{ JSONException -> 0x01f6 }
        r0 = r10.put(r11, r0);	 Catch:{ JSONException -> 0x01f6 }
        r0 = r3.put(r9, r0);	 Catch:{ JSONException -> 0x01f6 }
        r9 = "adBox";
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x01f6 }
        r10.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r11 = "top";
        r12 = r5.top;	 Catch:{ JSONException -> 0x01f6 }
        r12 = com.google.android.gms.internal.C0356b.m1659a(r12, r4);	 Catch:{ JSONException -> 0x01f6 }
        r10 = r10.put(r11, r12);	 Catch:{ JSONException -> 0x01f6 }
        r11 = "bottom";
        r12 = r5.bottom;	 Catch:{ JSONException -> 0x01f6 }
        r12 = com.google.android.gms.internal.C0356b.m1659a(r12, r4);	 Catch:{ JSONException -> 0x01f6 }
        r10 = r10.put(r11, r12);	 Catch:{ JSONException -> 0x01f6 }
        r11 = "left";
        r12 = r5.left;	 Catch:{ JSONException -> 0x01f6 }
        r12 = com.google.android.gms.internal.C0356b.m1659a(r12, r4);	 Catch:{ JSONException -> 0x01f6 }
        r10 = r10.put(r11, r12);	 Catch:{ JSONException -> 0x01f6 }
        r11 = "right";
        r5 = r5.right;	 Catch:{ JSONException -> 0x01f6 }
        r5 = com.google.android.gms.internal.C0356b.m1659a(r5, r4);	 Catch:{ JSONException -> 0x01f6 }
        r5 = r10.put(r11, r5);	 Catch:{ JSONException -> 0x01f6 }
        r0 = r0.put(r9, r5);	 Catch:{ JSONException -> 0x01f6 }
        r5 = "globalVisibleBox";
        r9 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x01f6 }
        r9.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r10 = "top";
        r11 = r6.top;	 Catch:{ JSONException -> 0x01f6 }
        r11 = com.google.android.gms.internal.C0356b.m1659a(r11, r4);	 Catch:{ JSONException -> 0x01f6 }
        r9 = r9.put(r10, r11);	 Catch:{ JSONException -> 0x01f6 }
        r10 = "bottom";
        r11 = r6.bottom;	 Catch:{ JSONException -> 0x01f6 }
        r11 = com.google.android.gms.internal.C0356b.m1659a(r11, r4);	 Catch:{ JSONException -> 0x01f6 }
        r9 = r9.put(r10, r11);	 Catch:{ JSONException -> 0x01f6 }
        r10 = "left";
        r11 = r6.left;	 Catch:{ JSONException -> 0x01f6 }
        r11 = com.google.android.gms.internal.C0356b.m1659a(r11, r4);	 Catch:{ JSONException -> 0x01f6 }
        r9 = r9.put(r10, r11);	 Catch:{ JSONException -> 0x01f6 }
        r10 = "right";
        r6 = r6.right;	 Catch:{ JSONException -> 0x01f6 }
        r6 = com.google.android.gms.internal.C0356b.m1659a(r6, r4);	 Catch:{ JSONException -> 0x01f6 }
        r6 = r9.put(r10, r6);	 Catch:{ JSONException -> 0x01f6 }
        r0 = r0.put(r5, r6);	 Catch:{ JSONException -> 0x01f6 }
        r5 = "localVisibleBox";
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x01f6 }
        r6.<init>();	 Catch:{ JSONException -> 0x01f6 }
        r9 = "top";
        r10 = r8.top;	 Catch:{ JSONException -> 0x01f6 }
        r10 = com.google.android.gms.internal.C0356b.m1659a(r10, r4);	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.put(r9, r10);	 Catch:{ JSONException -> 0x01f6 }
        r9 = "bottom";
        r10 = r8.bottom;	 Catch:{ JSONException -> 0x01f6 }
        r10 = com.google.android.gms.internal.C0356b.m1659a(r10, r4);	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.put(r9, r10);	 Catch:{ JSONException -> 0x01f6 }
        r9 = "left";
        r10 = r8.left;	 Catch:{ JSONException -> 0x01f6 }
        r10 = com.google.android.gms.internal.C0356b.m1659a(r10, r4);	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.put(r9, r10);	 Catch:{ JSONException -> 0x01f6 }
        r9 = "right";
        r8 = r8.right;	 Catch:{ JSONException -> 0x01f6 }
        r8 = com.google.android.gms.internal.C0356b.m1659a(r8, r4);	 Catch:{ JSONException -> 0x01f6 }
        r6 = r6.put(r9, r8);	 Catch:{ JSONException -> 0x01f6 }
        r0 = r0.put(r5, r6);	 Catch:{ JSONException -> 0x01f6 }
        r5 = "screenDensity";
        r4 = r4.density;	 Catch:{ JSONException -> 0x01f6 }
        r8 = (double) r4;	 Catch:{ JSONException -> 0x01f6 }
        r4 = r0.put(r5, r8);	 Catch:{ JSONException -> 0x01f6 }
        r5 = "isVisible";
        r0 = r1.getVisibility();	 Catch:{ JSONException -> 0x01f6 }
        if (r0 != 0) goto L_0x01f4;
    L_0x01aa:
        if (r7 == 0) goto L_0x01f4;
    L_0x01ac:
        r0 = r1.isShown();	 Catch:{ JSONException -> 0x01f6 }
        if (r0 == 0) goto L_0x01f4;
    L_0x01b2:
        r0 = r13.f1033j;	 Catch:{ JSONException -> 0x01f6 }
        r0 = r0.isScreenOn();	 Catch:{ JSONException -> 0x01f6 }
        if (r0 == 0) goto L_0x01f4;
    L_0x01ba:
        r0 = r13.f1034k;	 Catch:{ JSONException -> 0x01f6 }
        r0 = r0.inKeyguardRestrictedInputMode();	 Catch:{ JSONException -> 0x01f6 }
        if (r0 != 0) goto L_0x01f4;
    L_0x01c2:
        r0 = 1;
    L_0x01c3:
        r4.put(r5, r0);	 Catch:{ JSONException -> 0x01f6 }
        r13.m1661a(r3);	 Catch:{ JSONException -> 0x01f6 }
    L_0x01c9:
        r0 = r13.f1027d;	 Catch:{ all -> 0x001e }
        r0 = r0.get();	 Catch:{ all -> 0x001e }
        r0 = (android.view.View) r0;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x01ee;
    L_0x01d3:
        r1 = r13.f1026c;	 Catch:{ all -> 0x001e }
        r1 = r1.get();	 Catch:{ all -> 0x001e }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ all -> 0x001e }
        r0 = r0.getViewTreeObserver();	 Catch:{ all -> 0x001e }
        if (r0 == r1) goto L_0x01ee;
    L_0x01e1:
        r1 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x001e }
        r1.<init>(r0);	 Catch:{ all -> 0x001e }
        r13.f1026c = r1;	 Catch:{ all -> 0x001e }
        r0.addOnScrollChangedListener(r13);	 Catch:{ all -> 0x001e }
        r0.addOnGlobalLayoutListener(r13);	 Catch:{ all -> 0x001e }
    L_0x01ee:
        r13.m1665e();	 Catch:{ all -> 0x001e }
        monitor-exit(r2);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
    L_0x01f4:
        r0 = 0;
        goto L_0x01c3;
    L_0x01f6:
        r0 = move-exception;
        r0 = 6;
        com.google.android.gms.internal.gb.m2071a(r0);	 Catch:{ all -> 0x001e }
        goto L_0x01c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.b.b(boolean):void");
    }

    protected final void m1673c() {
        m1672b(false);
    }

    public final boolean m1674d() {
        boolean z;
        synchronized (this.f1024a) {
            z = this.f1037o;
        }
        return z;
    }

    public final void onGlobalLayout() {
        m1672b(false);
    }

    public final void onScrollChanged() {
        m1672b(true);
    }
}
