package com.google.android.gms.internal;

public abstract class fj {
    final Runnable f1199e = new fk(this);
    volatile Thread f1200f;

    public abstract void mo874a();

    public abstract void b_();

    public final void m1873e() {
        b_();
        if (this.f1200f != null) {
            this.f1200f.interrupt();
        }
    }
}
