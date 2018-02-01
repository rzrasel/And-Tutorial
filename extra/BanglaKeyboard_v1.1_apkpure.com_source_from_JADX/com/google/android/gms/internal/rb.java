package com.google.android.gms.internal;

public final class rb extends rs {
    private static volatile Long f7037d = null;
    private static final Object f7038e = new Object();

    public rb(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 44);
    }

    protected final void mo2232a() {
        if (f7037d == null) {
            synchronized (f7038e) {
                if (f7037d == null) {
                    f7037d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f6430A = f7037d;
        }
    }
}
