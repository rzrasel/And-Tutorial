package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p013a.cj;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final C0487k CREATOR = new C0487k();
    private final int f2179a;
    private final List f2180b;
    private float f2181c;
    private int f2182d;
    private float f2183e;
    private boolean f2184f;
    private boolean f2185g;

    public PolylineOptions() {
        this.f2181c = 10.0f;
        this.f2182d = -16777216;
        this.f2183e = 0.0f;
        this.f2184f = true;
        this.f2185g = false;
        this.f2179a = 1;
        this.f2180b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2) {
        this.f2181c = 10.0f;
        this.f2182d = -16777216;
        this.f2183e = 0.0f;
        this.f2184f = true;
        this.f2185g = false;
        this.f2179a = i;
        this.f2180b = list;
        this.f2181c = f;
        this.f2182d = i2;
        this.f2183e = f2;
        this.f2184f = z;
        this.f2185g = z2;
    }

    final int m3260a() {
        return this.f2179a;
    }

    public final List m3261b() {
        return this.f2180b;
    }

    public final float m3262c() {
        return this.f2181c;
    }

    public final int m3263d() {
        return this.f2182d;
    }

    public final int describeContents() {
        return 0;
    }

    public final float m3264e() {
        return this.f2183e;
    }

    public final boolean m3265f() {
        return this.f2184f;
    }

    public final boolean m3266g() {
        return this.f2185g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2179a);
            C0261c.m1083b(parcel, 2, this.f2180b, false);
            C0261c.m1067a(parcel, 3, this.f2181c);
            C0261c.m1082b(parcel, 4, this.f2182d);
            C0261c.m1067a(parcel, 5, this.f2183e);
            C0261c.m1075a(parcel, 6, this.f2184f);
            C0261c.m1075a(parcel, 7, this.f2185g);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0487k.m3555a(this, parcel);
    }
}
