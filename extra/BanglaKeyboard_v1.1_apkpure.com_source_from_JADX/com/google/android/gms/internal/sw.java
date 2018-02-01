package com.google.android.gms.internal;

final class sw implements sz {
    int f7111a = 0;

    sw() {
    }

    public final int mo2276a(boolean z, int i, boolean z2, int i2) {
        this.f7111a = (this.f7111a * 53) + i;
        return i;
    }

    public final ry mo2277a(boolean z, ry ryVar, boolean z2, ry ryVar2) {
        this.f7111a = (this.f7111a * 53) + ryVar.hashCode();
        return ryVar;
    }

    public final <T> te<T> mo2278a(te<T> teVar, te<T> teVar2) {
        this.f7111a = (this.f7111a * 53) + teVar.hashCode();
        return teVar;
    }

    public final <T extends tl> T mo2279a(T t, T t2) {
        int i;
        if (t == null) {
            i = 37;
        } else if (t instanceof sq) {
            Object obj = (sq) t;
            if (obj.d == 0) {
                int i2 = this.f7111a;
                this.f7111a = 0;
                obj.mo2219a(sy.f7114b, (Object) this, obj);
                obj.f6753e = mo2280a(obj.f6753e, obj.f6753e);
                obj.d = this.f7111a;
                this.f7111a = i2;
            }
            i = obj.d;
        } else {
            i = t.hashCode();
        }
        this.f7111a = i + (this.f7111a * 53);
        return t;
    }

    public final ue mo2280a(ue ueVar, ue ueVar2) {
        this.f7111a = (this.f7111a * 53) + ueVar.hashCode();
        return ueVar;
    }

    public final String mo2281a(boolean z, String str, boolean z2, String str2) {
        this.f7111a = (this.f7111a * 53) + str.hashCode();
        return str;
    }
}
