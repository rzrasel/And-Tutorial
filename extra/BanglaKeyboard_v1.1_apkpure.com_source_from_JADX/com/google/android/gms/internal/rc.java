package com.google.android.gms.internal;

public final class rc extends rs {
    private long f7039d;

    public rc(np npVar, String str, String str2, kz kzVar, long j, int i) {
        super(npVar, str, str2, kzVar, i, 25);
        this.f7039d = j;
    }

    protected final void mo2232a() {
        long longValue = ((Long) this.c.invoke(null, new Object[0])).longValue();
        synchronized (this.b) {
            this.b.f6445P = Long.valueOf(longValue);
            if (this.f7039d != 0) {
                this.b.f6463j = Long.valueOf(longValue - this.f7039d);
                this.b.f6466m = Long.valueOf(this.f7039d);
            }
        }
    }
}
