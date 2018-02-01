package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1514r;

@aqv
public final class bt extends ca {
    private final String f5830a;
    private final int f5831b;

    public bt(String str, int i) {
        this.f5830a = str;
        this.f5831b = i;
    }

    public final String mo2022a() {
        return this.f5830a;
    }

    public final int mo2023b() {
        return this.f5831b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        return C1514r.m3858a(this.f5830a, btVar.f5830a) && C1514r.m3858a(Integer.valueOf(this.f5831b), Integer.valueOf(btVar.f5831b));
    }
}
