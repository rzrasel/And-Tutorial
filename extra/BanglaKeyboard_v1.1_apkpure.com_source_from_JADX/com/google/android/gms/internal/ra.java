package com.google.android.gms.internal;

public final class ra extends rs {
    public ra(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 5);
    }

    protected final void mo2232a() {
        this.b.f6457d = Long.valueOf(-1);
        this.b.f6458e = Long.valueOf(-1);
        int[] iArr = (int[]) this.c.invoke(null, new Object[]{this.a.m6083a()});
        synchronized (this.b) {
            this.b.f6457d = Long.valueOf((long) iArr[0]);
            this.b.f6458e = Long.valueOf((long) iArr[1]);
        }
    }
}
