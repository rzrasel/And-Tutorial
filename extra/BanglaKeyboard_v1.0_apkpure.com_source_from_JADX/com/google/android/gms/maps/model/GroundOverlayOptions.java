package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p013a.cj;
import com.google.android.gms.p007a.C0205o;

public final class GroundOverlayOptions implements SafeParcelable {
    public static final C0482f CREATOR = new C0482f();
    private final int f2138a;
    private C0477a f2139b;
    private LatLng f2140c;
    private float f2141d;
    private float f2142e;
    private LatLngBounds f2143f;
    private float f2144g;
    private float f2145h;
    private boolean f2146i;
    private float f2147j;
    private float f2148k;
    private float f2149l;

    public GroundOverlayOptions() {
        this.f2146i = true;
        this.f2147j = 0.0f;
        this.f2148k = 0.5f;
        this.f2149l = 0.5f;
        this.f2138a = 1;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.f2146i = true;
        this.f2147j = 0.0f;
        this.f2148k = 0.5f;
        this.f2149l = 0.5f;
        this.f2138a = i;
        this.f2139b = new C0477a(C0205o.m862a(iBinder));
        this.f2140c = latLng;
        this.f2141d = f;
        this.f2142e = f2;
        this.f2143f = latLngBounds;
        this.f2144g = f3;
        this.f2145h = f4;
        this.f2146i = z;
        this.f2147j = f5;
        this.f2148k = f6;
        this.f2149l = f7;
    }

    final IBinder m3223a() {
        return this.f2139b.f2226a.asBinder();
    }

    final int m3224b() {
        return this.f2138a;
    }

    public final LatLng m3225c() {
        return this.f2140c;
    }

    public final float m3226d() {
        return this.f2141d;
    }

    public final int describeContents() {
        return 0;
    }

    public final float m3227e() {
        return this.f2142e;
    }

    public final LatLngBounds m3228f() {
        return this.f2143f;
    }

    public final float m3229g() {
        return this.f2144g;
    }

    public final float m3230h() {
        return this.f2145h;
    }

    public final float m3231i() {
        return this.f2147j;
    }

    public final float m3232j() {
        return this.f2148k;
    }

    public final float m3233k() {
        return this.f2149l;
    }

    public final boolean m3234l() {
        return this.f2146i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2138a);
            C0261c.m1071a(parcel, 2, m3223a());
            C0261c.m1072a(parcel, 3, this.f2140c, i, false);
            C0261c.m1067a(parcel, 4, this.f2141d);
            C0261c.m1067a(parcel, 5, this.f2142e);
            C0261c.m1072a(parcel, 6, this.f2143f, i, false);
            C0261c.m1067a(parcel, 7, this.f2144g);
            C0261c.m1067a(parcel, 8, this.f2145h);
            C0261c.m1075a(parcel, 9, this.f2146i);
            C0261c.m1067a(parcel, 10, this.f2147j);
            C0261c.m1067a(parcel, 11, this.f2148k);
            C0261c.m1067a(parcel, 12, this.f2149l);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0482f.m3545a(this, parcel, i);
    }
}
