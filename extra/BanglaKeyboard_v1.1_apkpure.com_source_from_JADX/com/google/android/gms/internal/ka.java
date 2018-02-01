package com.google.android.gms.internal;

final class ka implements Runnable {
    private /* synthetic */ int f6392a;
    private /* synthetic */ int f6393b;
    private /* synthetic */ boolean f6394c;
    private /* synthetic */ boolean f6395d;
    private /* synthetic */ jy f6396e;

    ka(jy jyVar, int i, int i2, boolean z, boolean z2) {
        this.f6396e = jyVar;
        this.f6392a = i;
        this.f6393b = i2;
        this.f6394c = z;
        this.f6395d = z2;
    }

    public final void run() {
        boolean z = false;
        synchronized (this.f6396e.f6377a) {
            boolean z2 = this.f6392a != this.f6393b;
            boolean z3 = !this.f6396e.f6386j && this.f6393b == 1;
            boolean z4 = z2 && this.f6393b == 1;
            boolean z5 = z2 && this.f6393b == 2;
            boolean z6 = z2 && this.f6393b == 3;
            z2 = this.f6394c != this.f6395d;
            jy jyVar = this.f6396e;
            if (this.f6396e.f6386j || z3) {
                z = true;
            }
            jyVar.f6386j = z;
            if (this.f6396e.f6385i == null) {
                return;
            }
            if (z3) {
                try {
                    this.f6396e.f6385i.mo1708a();
                } catch (Throwable e) {
                    id.m5371a("Unable to call onVideoStart()", e);
                }
            }
            if (z4) {
                try {
                    this.f6396e.f6385i.mo1710b();
                } catch (Throwable e2) {
                    id.m5371a("Unable to call onVideoPlay()", e2);
                }
            }
            if (z5) {
                try {
                    this.f6396e.f6385i.mo1711c();
                } catch (Throwable e22) {
                    id.m5371a("Unable to call onVideoPause()", e22);
                }
            }
            if (z6) {
                try {
                    this.f6396e.f6385i.mo1712d();
                } catch (Throwable e222) {
                    id.m5371a("Unable to call onVideoEnd()", e222);
                }
            }
            if (z2) {
                try {
                    this.f6396e.f6385i.mo1709a(this.f6395d);
                } catch (Throwable e2222) {
                    id.m5371a("Unable to call onVideoMute()", e2222);
                }
            }
        }
    }
}
