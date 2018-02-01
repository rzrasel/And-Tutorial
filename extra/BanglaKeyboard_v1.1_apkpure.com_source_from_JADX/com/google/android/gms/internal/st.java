package com.google.android.gms.internal;

final class st implements sz {
    static final st f7108a = new st();
    private static su f7109b = new su();

    private st() {
    }

    public final int mo2276a(boolean z, int i, boolean z2, int i2) {
        if (z == z2 && i == i2) {
            return i;
        }
        throw f7109b;
    }

    public final ry mo2277a(boolean z, ry ryVar, boolean z2, ry ryVar2) {
        if (z == z2 && ryVar.equals(ryVar2)) {
            return ryVar;
        }
        throw f7109b;
    }

    public final <T> te<T> mo2278a(te<T> teVar, te<T> teVar2) {
        if (teVar.equals(teVar2)) {
            return teVar;
        }
        throw f7109b;
    }

    public final <T extends tl> T mo2279a(T t, T t2) {
        if (t == null && t2 == null) {
            return null;
        }
        if (t == null || t2 == null) {
            throw f7109b;
        }
        T t3 = (sq) t;
        if (t3 == t2 || !((sq) t3.mo2219a(sy.f7119g, null, null)).getClass().isInstance(t2)) {
            return t;
        }
        Object obj = (sq) t2;
        t3.mo2219a(sy.f7114b, (Object) this, obj);
        t3.f6753e = mo2280a(t3.f6753e, obj.f6753e);
        return t;
    }

    public final ue mo2280a(ue ueVar, ue ueVar2) {
        if (ueVar.equals(ueVar2)) {
            return ueVar;
        }
        throw f7109b;
    }

    public final String mo2281a(boolean z, String str, boolean z2, String str2) {
        if (z == z2 && str.equals(str2)) {
            return str;
        }
        throw f7109b;
    }
}
