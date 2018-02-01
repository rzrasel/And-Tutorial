package com.google.android.gms.internal;

import java.util.List;

public final class ri extends rs {
    private List<Long> f7047d = null;

    public ri(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 31);
    }

    protected final void mo2232a() {
        this.b.f6469p = Long.valueOf(-1);
        this.b.f6470q = Long.valueOf(-1);
        if (this.f7047d == null) {
            this.f7047d = (List) this.c.invoke(null, new Object[]{this.a.m6083a()});
        }
        if (this.f7047d != null && this.f7047d.size() == 2) {
            synchronized (this.b) {
                this.b.f6469p = Long.valueOf(((Long) this.f7047d.get(0)).longValue());
                this.b.f6470q = Long.valueOf(((Long) this.f7047d.get(1)).longValue());
            }
        }
    }
}
