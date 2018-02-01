package com.google.android.gms.internal;

public final class sx implements sz {
    public static final sx f7112a = new sx();

    private sx() {
    }

    public final int mo2276a(boolean z, int i, boolean z2, int i2) {
        return z2 ? i2 : i;
    }

    public final ry mo2277a(boolean z, ry ryVar, boolean z2, ry ryVar2) {
        return z2 ? ryVar2 : ryVar;
    }

    public final <T> te<T> mo2278a(te<T> teVar, te<T> teVar2) {
        int size = teVar.size();
        int size2 = teVar2.size();
        if (size > 0 && size2 > 0) {
            if (!teVar.mo2235a()) {
                teVar = teVar.mo2284a(size2 + size);
            }
            teVar.addAll(teVar2);
        }
        return size > 0 ? teVar : teVar2;
    }

    public final <T extends tl> T mo2279a(T t, T t2) {
        return (t == null || t2 == null) ? t == null ? t2 : t : t.mo2218i().mo2210a(t2).mo2214f();
    }

    public final ue mo2280a(ue ueVar, ue ueVar2) {
        return ueVar2 == ue.m6701a() ? ueVar : ue.m6702a(ueVar, ueVar2);
    }

    public final String mo2281a(boolean z, String str, boolean z2, String str2) {
        return z2 ? str2 : str;
    }
}
