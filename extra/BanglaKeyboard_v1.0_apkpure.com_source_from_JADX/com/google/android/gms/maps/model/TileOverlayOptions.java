package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.p014a.C0452y;
import com.google.android.gms.maps.model.p014a.C0476z;
import com.google.android.gms.maps.p013a.cj;

public final class TileOverlayOptions implements SafeParcelable {
    public static final C0497t CREATOR = new C0497t();
    private final int f2205a;
    private C0452y f2206b;
    private C0495u f2207c;
    private boolean f2208d;
    private float f2209e;
    private boolean f2210f;

    public TileOverlayOptions() {
        this.f2208d = true;
        this.f2210f = true;
        this.f2205a = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f, boolean z2) {
        this.f2208d = true;
        this.f2210f = true;
        this.f2205a = i;
        this.f2206b = C0476z.m3539a(iBinder);
        this.f2207c = this.f2206b == null ? null : new C0496s(this);
        this.f2208d = z;
        this.f2209e = f;
        this.f2210f = z2;
    }

    final int m3273a() {
        return this.f2205a;
    }

    final IBinder m3274b() {
        return this.f2206b.asBinder();
    }

    public final float m3275c() {
        return this.f2209e;
    }

    public final boolean m3276d() {
        return this.f2208d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean m3277e() {
        return this.f2210f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2205a);
            C0261c.m1071a(parcel, 2, m3274b());
            C0261c.m1075a(parcel, 3, this.f2208d);
            C0261c.m1067a(parcel, 4, this.f2209e);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0497t.m3566a(this, parcel);
    }
}
