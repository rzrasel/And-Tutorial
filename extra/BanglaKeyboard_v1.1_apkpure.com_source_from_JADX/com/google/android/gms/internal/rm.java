package com.google.android.gms.internal;

public final class rm extends rs {
    public rm(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 48);
    }

    protected final void mo2232a() {
        this.b.f6434E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.f6728b})).booleanValue();
        synchronized (this.b) {
            if (booleanValue) {
                this.b.f6434E = Integer.valueOf(1);
            } else {
                this.b.f6434E = Integer.valueOf(0);
            }
        }
    }
}
