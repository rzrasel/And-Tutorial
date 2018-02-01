package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p013a.cj;

public final class CircleOptions implements SafeParcelable {
    public static final C0481e CREATOR = new C0481e();
    private final int f2130a;
    private LatLng f2131b;
    private double f2132c;
    private float f2133d;
    private int f2134e;
    private int f2135f;
    private float f2136g;
    private boolean f2137h;

    public CircleOptions() {
        this.f2131b = null;
        this.f2132c = 0.0d;
        this.f2133d = 10.0f;
        this.f2134e = -16777216;
        this.f2135f = 0;
        this.f2136g = 0.0f;
        this.f2137h = true;
        this.f2130a = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.f2131b = null;
        this.f2132c = 0.0d;
        this.f2133d = 10.0f;
        this.f2134e = -16777216;
        this.f2135f = 0;
        this.f2136g = 0.0f;
        this.f2137h = true;
        this.f2130a = i;
        this.f2131b = latLng;
        this.f2132c = d;
        this.f2133d = f;
        this.f2134e = i2;
        this.f2135f = i3;
        this.f2136g = f2;
        this.f2137h = z;
    }

    final int m3215a() {
        return this.f2130a;
    }

    public final LatLng m3216b() {
        return this.f2131b;
    }

    public final double m3217c() {
        return this.f2132c;
    }

    public final float m3218d() {
        return this.f2133d;
    }

    public final int describeContents() {
        return 0;
    }

    public final int m3219e() {
        return this.f2134e;
    }

    public final int m3220f() {
        return this.f2135f;
    }

    public final float m3221g() {
        return this.f2136g;
    }

    public final boolean m3222h() {
        return this.f2137h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2130a);
            C0261c.m1072a(parcel, 2, this.f2131b, i, false);
            C0261c.m1066a(parcel, 3, this.f2132c);
            C0261c.m1067a(parcel, 4, this.f2133d);
            C0261c.m1082b(parcel, 5, this.f2134e);
            C0261c.m1082b(parcel, 6, this.f2135f);
            C0261c.m1067a(parcel, 7, this.f2136g);
            C0261c.m1075a(parcel, 8, this.f2137h);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0481e.m3543a(this, parcel, i);
    }
}
