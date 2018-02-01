package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p013a.cj;

public final class LatLng implements SafeParcelable {
    public static final C0484h CREATOR = new C0484h();
    public final double f2150a;
    public final double f2151b;
    private final int f2152c;

    public LatLng(double d, double d2) {
        this(1, d, d2);
    }

    LatLng(int i, double d, double d2) {
        this.f2152c = i;
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.f2151b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f2151b = d2;
        }
        this.f2150a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    final int m3235a() {
        return this.f2152c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f2150a) == Double.doubleToLongBits(latLng.f2150a) && Double.doubleToLongBits(this.f2151b) == Double.doubleToLongBits(latLng.f2151b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2150a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2151b);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.f2150a + "," + this.f2151b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2152c);
            C0261c.m1066a(parcel, 2, this.f2150a);
            C0261c.m1066a(parcel, 3, this.f2151b);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0484h.m3549a(this, parcel);
    }
}
