package com.google.android.gms.internal;

final class ct {
    final Runnable f1150a;
    volatile boolean f1151b = false;

    public ct(cs csVar) {
        this.f1150a = new cu(this, csVar);
    }

    public final void m1839a() {
        fz.f1434a.postDelayed(this.f1150a, 250);
    }
}
