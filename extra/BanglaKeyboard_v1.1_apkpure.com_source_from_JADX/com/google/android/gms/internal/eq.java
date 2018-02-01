package com.google.android.gms.internal;

import java.util.concurrent.Future;

@aqv
public abstract class eq implements gp<Future> {
    private final Runnable f4014a = new er(this);
    private boolean f4015b = false;
    volatile Thread f4016e;

    public eq(byte b) {
    }

    public abstract void mo1475a();

    public abstract void mo1476b();

    public final void mo1473f() {
        mo1476b();
        if (this.f4016e != null) {
            this.f4016e.interrupt();
        }
    }

    public final /* synthetic */ Object mo1474g() {
        return this.f4015b ? fv.m5424a(1, this.f4014a) : fv.m5425a(this.f4014a);
    }

    public final Future m3624h() {
        return this.f4015b ? fv.m5424a(1, this.f4014a) : fv.m5425a(this.f4014a);
    }
}
