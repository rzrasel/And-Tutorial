package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p013a.cj;

public final class Tile implements SafeParcelable {
    public static final C0494r CREATOR = new C0494r();
    public final int f2201a;
    public final int f2202b;
    public final byte[] f2203c;
    private final int f2204d;

    public Tile() {
        this(1, -1, -1, null);
    }

    Tile(int i, int i2, int i3, byte[] bArr) {
        this.f2204d = i;
        this.f2201a = i2;
        this.f2202b = i3;
        this.f2203c = bArr;
    }

    final int m3271a() {
        return this.f2204d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2204d);
            C0261c.m1082b(parcel, 2, this.f2201a);
            C0261c.m1082b(parcel, 3, this.f2202b);
            C0261c.m1076a(parcel, 4, this.f2203c);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0494r.m3564a(this, parcel);
    }
}
