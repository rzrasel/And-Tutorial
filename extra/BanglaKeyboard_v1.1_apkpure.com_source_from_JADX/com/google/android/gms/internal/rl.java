package com.google.android.gms.internal;

public final class rl extends rs {
    private static volatile Long f7049d = null;
    private static final Object f7050e = new Object();

    public rl(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 33);
    }

    protected final void mo2232a() {
        if (f7049d == null) {
            synchronized (f7050e) {
                if (f7049d == null) {
                    f7049d = (Long) this.c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.f6471r = f7049d;
        }
    }
}
