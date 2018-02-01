package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public class StreetViewPanoramaLocation implements SafeParcelable {
    public static final C0491o CREATOR = new C0491o();
    public final StreetViewPanoramaLink[] f2194a;
    public final LatLng f2195b;
    public final String f2196c;
    private final int f2197d;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f2197d = i;
        this.f2194a = streetViewPanoramaLinkArr;
        this.f2195b = latLng;
        this.f2196c = str;
    }

    final int m3269a() {
        return this.f2197d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f2196c.equals(streetViewPanoramaLocation.f2196c) && this.f2195b.equals(streetViewPanoramaLocation.f2195b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2195b, this.f2196c});
    }

    public String toString() {
        return jb.m2469a(this).m2471a("panoId", this.f2196c).m2471a("position", this.f2195b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0491o.m3560a(this, parcel, i);
    }
}
