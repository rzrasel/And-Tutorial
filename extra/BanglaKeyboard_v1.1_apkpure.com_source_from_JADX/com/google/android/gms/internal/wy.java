package com.google.android.gms.internal;

public final class wy implements aoc {
    private int f7385a;
    private int f7386b;
    private final int f7387c;
    private final float f7388d;

    public wy() {
        this((byte) 0);
    }

    private wy(byte b) {
        this.f7385a = 2500;
        this.f7387c = 1;
        this.f7388d = 1.0f;
    }

    public final int mo2324a() {
        return this.f7385a;
    }

    public final void mo2325a(C1569b c1569b) {
        this.f7386b++;
        this.f7385a = (int) (((float) this.f7385a) + (((float) this.f7385a) * this.f7388d));
        if ((this.f7386b <= this.f7387c ? 1 : null) == null) {
            throw c1569b;
        }
    }

    public final int mo2326b() {
        return this.f7386b;
    }
}
