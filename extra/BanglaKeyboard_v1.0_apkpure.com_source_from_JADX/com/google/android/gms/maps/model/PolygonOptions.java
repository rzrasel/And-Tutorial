package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p013a.cj;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
    public static final C0486j CREATOR = new C0486j();
    private final int f2170a;
    private final List f2171b;
    private final List f2172c;
    private float f2173d;
    private int f2174e;
    private int f2175f;
    private float f2176g;
    private boolean f2177h;
    private boolean f2178i;

    public PolygonOptions() {
        this.f2173d = 10.0f;
        this.f2174e = -16777216;
        this.f2175f = 0;
        this.f2176g = 0.0f;
        this.f2177h = true;
        this.f2178i = false;
        this.f2170a = 1;
        this.f2171b = new ArrayList();
        this.f2172c = new ArrayList();
    }

    PolygonOptions(int i, List list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.f2173d = 10.0f;
        this.f2174e = -16777216;
        this.f2175f = 0;
        this.f2176g = 0.0f;
        this.f2177h = true;
        this.f2178i = false;
        this.f2170a = i;
        this.f2171b = list;
        this.f2172c = list2;
        this.f2173d = f;
        this.f2174e = i2;
        this.f2175f = i3;
        this.f2176g = f2;
        this.f2177h = z;
        this.f2178i = z2;
    }

    final int m3251a() {
        return this.f2170a;
    }

    final List m3252b() {
        return this.f2172c;
    }

    public final List m3253c() {
        return this.f2171b;
    }

    public final float m3254d() {
        return this.f2173d;
    }

    public final int describeContents() {
        return 0;
    }

    public final int m3255e() {
        return this.f2174e;
    }

    public final int m3256f() {
        return this.f2175f;
    }

    public final float m3257g() {
        return this.f2176g;
    }

    public final boolean m3258h() {
        return this.f2177h;
    }

    public final boolean m3259i() {
        return this.f2178i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2170a);
            C0261c.m1083b(parcel, 2, this.f2171b, false);
            C0261c.m1080a(parcel, this.f2172c);
            C0261c.m1067a(parcel, 4, this.f2173d);
            C0261c.m1082b(parcel, 5, this.f2174e);
            C0261c.m1082b(parcel, 6, this.f2175f);
            C0261c.m1067a(parcel, 7, this.f2176g);
            C0261c.m1075a(parcel, 8, this.f2177h);
            C0261c.m1075a(parcel, 9, this.f2178i);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0486j.m3552a(this, parcel);
    }
}
