package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ga.C0366a;
import com.google.android.gms.plus.p010a.p011a.C0371b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class ie extends ga implements SafeParcelable, C0371b {
    public static final lk CREATOR = new lk();
    private static final HashMap f1714a;
    private final Set f1715b;
    private final int f1716c;
    private String f1717d;
    private ic f1718e;
    private String f1719f;
    private ic f1720g;
    private String f1721h;

    static {
        HashMap hashMap = new HashMap();
        f1714a = hashMap;
        hashMap.put("id", C0366a.m2046d("id", 2));
        f1714a.put("result", C0366a.m2041a("result", 4, ic.class));
        f1714a.put("startDate", C0366a.m2046d("startDate", 5));
        f1714a.put("target", C0366a.m2041a("target", 6, ic.class));
        f1714a.put("type", C0366a.m2046d("type", 7));
    }

    public ie() {
        this.f1716c = 1;
        this.f1715b = new HashSet();
    }

    ie(Set set, int i, String str, ic icVar, String str2, ic icVar2, String str3) {
        this.f1715b = set;
        this.f1716c = i;
        this.f1717d = str;
        this.f1718e = icVar;
        this.f1719f = str2;
        this.f1720g = icVar2;
        this.f1721h = str3;
    }

    public final /* synthetic */ Object mo701a() {
        return this;
    }

    protected final boolean mo899a(C0366a c0366a) {
        return this.f1715b.contains(Integer.valueOf(c0366a.m2055g()));
    }

    protected final Object mo900b(C0366a c0366a) {
        switch (c0366a.m2055g()) {
            case 2:
                return this.f1717d;
            case 4:
                return this.f1718e;
            case 5:
                return this.f1719f;
            case 6:
                return this.f1720g;
            case 7:
                return this.f1721h;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
        }
    }

    public final HashMap mo890b() {
        return f1714a;
    }

    protected final Object mo891c() {
        return null;
    }

    protected final boolean mo892d() {
        return false;
    }

    public final int describeContents() {
        lk lkVar = CREATOR;
        return 0;
    }

    final Set m2251e() {
        return this.f1715b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ie)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ie ieVar = (ie) obj;
        for (C0366a c0366a : f1714a.values()) {
            if (mo899a(c0366a)) {
                if (!ieVar.mo899a(c0366a)) {
                    return false;
                }
                if (!mo900b(c0366a).equals(ieVar.mo900b(c0366a))) {
                    return false;
                }
            } else if (ieVar.mo899a(c0366a)) {
                return false;
            }
        }
        return true;
    }

    final int m2252f() {
        return this.f1716c;
    }

    public final String m2253g() {
        return this.f1717d;
    }

    final ic m2254h() {
        return this.f1718e;
    }

    public final int hashCode() {
        int i = 0;
        for (C0366a c0366a : f1714a.values()) {
            int hashCode;
            if (mo899a(c0366a)) {
                hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public final String m2255i() {
        return this.f1719f;
    }

    final ic m2256j() {
        return this.f1720g;
    }

    public final String m2257k() {
        return this.f1721h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        lk lkVar = CREATOR;
        lk.m2549a(this, parcel, i);
    }
}
