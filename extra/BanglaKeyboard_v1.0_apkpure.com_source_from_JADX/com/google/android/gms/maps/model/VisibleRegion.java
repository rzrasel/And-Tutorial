package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import com.google.android.gms.maps.p013a.cj;
import java.util.Arrays;

public final class VisibleRegion implements SafeParcelable {
    public static final C0498v CREATOR = new C0498v();
    public final LatLng f2211a;
    public final LatLng f2212b;
    public final LatLng f2213c;
    public final LatLng f2214d;
    public final LatLngBounds f2215e;
    private final int f2216f;

    VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f2216f = i;
        this.f2211a = latLng;
        this.f2212b = latLng2;
        this.f2213c = latLng3;
        this.f2214d = latLng4;
        this.f2215e = latLngBounds;
    }

    final int m3278a() {
        return this.f2216f;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f2211a.equals(visibleRegion.f2211a) && this.f2212b.equals(visibleRegion.f2212b) && this.f2213c.equals(visibleRegion.f2213c) && this.f2214d.equals(visibleRegion.f2214d) && this.f2215e.equals(visibleRegion.f2215e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2211a, this.f2212b, this.f2213c, this.f2214d, this.f2215e});
    }

    public final String toString() {
        return jb.m2469a(this).m2471a("nearLeft", this.f2211a).m2471a("nearRight", this.f2212b).m2471a("farLeft", this.f2213c).m2471a("farRight", this.f2214d).m2471a("latLngBounds", this.f2215e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2216f);
            C0261c.m1072a(parcel, 2, this.f2211a, i, false);
            C0261c.m1072a(parcel, 3, this.f2212b, i, false);
            C0261c.m1072a(parcel, 4, this.f2213c, i, false);
            C0261c.m1072a(parcel, 5, this.f2214d, i, false);
            C0261c.m1072a(parcel, 6, this.f2215e, i, false);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0498v.m3568a(this, parcel, i);
    }
}
