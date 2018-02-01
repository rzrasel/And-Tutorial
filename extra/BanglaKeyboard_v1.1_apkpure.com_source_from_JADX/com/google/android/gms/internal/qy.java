package com.google.android.gms.internal;

public final class qy extends rs {
    private static volatile String f7032d = null;
    private static final Object f7033e = new Object();

    public qy(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 29);
    }

    protected final void mo2232a() {
        this.b.f6468o = "E";
        if (f7032d == null) {
            synchronized (f7033e) {
                if (f7032d == null) {
                    f7032d = (String) this.c.invoke(null, new Object[]{this.a.m6083a()});
                }
            }
        }
        synchronized (this.b) {
            this.b.f6468o = lp.m5984a(f7032d.getBytes(), true);
        }
    }
}
