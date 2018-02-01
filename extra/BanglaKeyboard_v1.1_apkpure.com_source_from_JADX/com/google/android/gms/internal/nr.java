package com.google.android.gms.internal;

final class nr implements Runnable {
    private /* synthetic */ int f6744a;
    private /* synthetic */ boolean f6745b;
    private /* synthetic */ np f6746c;

    nr(np npVar, int i, boolean z) {
        this.f6746c = npVar;
        this.f6744a = i;
        this.f6745b = z;
    }

    public final void run() {
        kz b = this.f6746c.m6087b(this.f6744a, this.f6745b);
        this.f6746c.f6733g = b;
        if (np.m6080a(this.f6744a, b)) {
            this.f6746c.m6085a(this.f6744a + 1, this.f6745b);
        }
    }
}
