package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import com.google.android.gms.maps.p013a.cj;
import java.util.Arrays;

public final class LatLngBounds implements SafeParcelable {
    public static final C0483g CREATOR = new C0483g();
    public final LatLng f2153a;
    public final LatLng f2154b;
    private final int f2155c;

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        je.m2474a((Object) latLng, (Object) "null southwest");
        je.m2474a((Object) latLng2, (Object) "null northeast");
        String str = "southern latitude exceeds northern latitude (%s > %s)";
        Object[] objArr = new Object[]{Double.valueOf(latLng.f2150a), Double.valueOf(latLng2.f2150a)};
        if ((latLng2.f2150a >= latLng.f2150a ? 1 : 0) == 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        this.f2155c = i;
        this.f2153a = latLng;
        this.f2154b = latLng2;
    }

    final int m3236a() {
        return this.f2155c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f2153a.equals(latLngBounds.f2153a) && this.f2154b.equals(latLngBounds.f2154b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2153a, this.f2154b});
    }

    public final String toString() {
        return jb.m2469a(this).m2471a("southwest", this.f2153a).m2471a("northeast", this.f2154b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2155c);
            C0261c.m1072a(parcel, 2, this.f2153a, i, false);
            C0261c.m1072a(parcel, 3, this.f2154b, i, false);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0483g.m3547a(this, parcel, i);
    }
}
