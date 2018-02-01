package com.google.android.gms.internal;

public final class rf extends rs {
    private static volatile Long f7042d = null;
    private static final Object f7043e = new Object();

    public rf(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 22);
    }

    protected final void mo2232a() {
        if (f7042d == null) {
            synchronized (f7043e) {
                if (f7042d == null) {
                    f7042d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f6465l = f7042d;
        }
    }
}
