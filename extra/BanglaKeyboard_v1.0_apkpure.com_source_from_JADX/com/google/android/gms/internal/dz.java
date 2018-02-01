package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public final class dz implements Runnable {
    protected final ge f1227a;
    protected boolean f1228b;
    protected boolean f1229c;
    private final Handler f1230d;
    private final long f1231e;
    private long f1232f;
    private gk f1233g;
    private final int f1234h;
    private final int f1235i;

    private dz(gk gkVar, ge geVar, int i, int i2) {
        this.f1231e = 200;
        this.f1232f = 50;
        this.f1230d = new Handler(Looper.getMainLooper());
        this.f1227a = geVar;
        this.f1233g = gkVar;
        this.f1228b = false;
        this.f1229c = false;
        this.f1234h = i2;
        this.f1235i = i;
    }

    public dz(gk gkVar, ge geVar, int i, int i2, byte b) {
        this(gkVar, geVar, i, i2);
    }

    static /* synthetic */ long m1884c(dz dzVar) {
        long j = dzVar.f1232f - 1;
        dzVar.f1232f = j;
        return j;
    }

    public final void m1889a() {
        this.f1230d.postDelayed(this, this.f1231e);
    }

    public final void m1890a(cz czVar) {
        this.f1227a.setWebViewClient(new gv(this, this.f1227a, czVar.f1186q));
        this.f1227a.loadDataWithBaseURL(TextUtils.isEmpty(czVar.f1171b) ? null : fo.m1988a(czVar.f1171b), czVar.f1172c, "text/html", "UTF-8", null);
    }

    public final synchronized void m1891b() {
        this.f1228b = true;
    }

    public final synchronized boolean m1892c() {
        return this.f1228b;
    }

    public final boolean m1893d() {
        return this.f1229c;
    }

    public final void run() {
        if (this.f1227a == null || m1892c()) {
            this.f1233g.mo867a(this.f1227a);
        } else {
            new ea(this, this.f1227a).execute(new Void[0]);
        }
    }
}
