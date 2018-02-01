package com.google.android.gms.internal;

public final class rh extends rs {
    private static volatile String f7045d = null;
    private static final Object f7046e = new Object();

    public rh(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 1);
    }

    protected final void mo2232a() {
        this.b.f6454a = "E";
        if (f7045d == null) {
            synchronized (f7046e) {
                if (f7045d == null) {
                    f7045d = (String) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f6454a = f7045d;
        }
    }
}
