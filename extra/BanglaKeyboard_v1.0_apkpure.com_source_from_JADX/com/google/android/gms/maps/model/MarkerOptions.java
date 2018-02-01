package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p013a.cj;
import com.google.android.gms.p007a.C0205o;

public final class MarkerOptions implements SafeParcelable {
    public static final C0485i CREATOR = new C0485i();
    private final int f2156a;
    private LatLng f2157b;
    private String f2158c;
    private String f2159d;
    private C0477a f2160e;
    private float f2161f;
    private float f2162g;
    private boolean f2163h;
    private boolean f2164i;
    private boolean f2165j;
    private float f2166k;
    private float f2167l;
    private float f2168m;
    private float f2169n;

    public MarkerOptions() {
        this.f2161f = 0.5f;
        this.f2162g = 1.0f;
        this.f2164i = true;
        this.f2165j = false;
        this.f2166k = 0.0f;
        this.f2167l = 0.5f;
        this.f2168m = 0.0f;
        this.f2169n = 1.0f;
        this.f2156a = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6) {
        this.f2161f = 0.5f;
        this.f2162g = 1.0f;
        this.f2164i = true;
        this.f2165j = false;
        this.f2166k = 0.0f;
        this.f2167l = 0.5f;
        this.f2168m = 0.0f;
        this.f2169n = 1.0f;
        this.f2156a = i;
        this.f2157b = latLng;
        this.f2158c = str;
        this.f2159d = str2;
        this.f2160e = iBinder == null ? null : new C0477a(C0205o.m862a(iBinder));
        this.f2161f = f;
        this.f2162g = f2;
        this.f2163h = z;
        this.f2164i = z2;
        this.f2165j = z3;
        this.f2166k = f3;
        this.f2167l = f4;
        this.f2168m = f5;
        this.f2169n = f6;
    }

    final int m3237a() {
        return this.f2156a;
    }

    final IBinder m3238b() {
        return this.f2160e == null ? null : this.f2160e.f2226a.asBinder();
    }

    public final LatLng m3239c() {
        return this.f2157b;
    }

    public final String m3240d() {
        return this.f2158c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m3241e() {
        return this.f2159d;
    }

    public final float m3242f() {
        return this.f2161f;
    }

    public final float m3243g() {
        return this.f2162g;
    }

    public final boolean m3244h() {
        return this.f2163h;
    }

    public final boolean m3245i() {
        return this.f2164i;
    }

    public final boolean m3246j() {
        return this.f2165j;
    }

    public final float m3247k() {
        return this.f2166k;
    }

    public final float m3248l() {
        return this.f2167l;
    }

    public final float m3249m() {
        return this.f2168m;
    }

    public final float m3250n() {
        return this.f2169n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2156a);
            C0261c.m1072a(parcel, 2, this.f2157b, i, false);
            C0261c.m1073a(parcel, 3, this.f2158c, false);
            C0261c.m1073a(parcel, 4, this.f2159d, false);
            C0261c.m1071a(parcel, 5, m3238b());
            C0261c.m1067a(parcel, 6, this.f2161f);
            C0261c.m1067a(parcel, 7, this.f2162g);
            C0261c.m1075a(parcel, 8, this.f2163h);
            C0261c.m1075a(parcel, 9, this.f2164i);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0485i.m3551a(this, parcel, i);
    }
}
