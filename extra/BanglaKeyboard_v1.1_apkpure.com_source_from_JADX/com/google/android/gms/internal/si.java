package com.google.android.gms.internal;

public abstract class si {
    int f7079a;
    int f7080b;
    private int f7081c;

    private si() {
        this.f7080b = 100;
        this.f7081c = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static si m6551a(byte[] bArr) {
        return m6552a(bArr, 0, bArr.length, false);
    }

    static si m6552a(byte[] bArr, int i, int i2, boolean z) {
        si sjVar = new sj(bArr, i, i2, z, (byte) 0);
        try {
            sjVar.mo2253c(i2);
            return sjVar;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int mo2248a();

    public abstract <T extends sq<T, ?>> T mo2249a(T t, sm smVar);

    public abstract void mo2250a(int i);

    public abstract int mo2251b();

    public abstract boolean mo2252b(int i);

    public abstract int mo2253c(int i);

    public abstract String mo2254c();

    public abstract ry mo2255d();

    public abstract void mo2256d(int i);

    public abstract int mo2257e();

    public abstract void mo2258e(int i);

    abstract long mo2259f();

    public abstract boolean mo2260g();

    public abstract int mo2261h();
}
