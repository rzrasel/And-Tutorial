package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public class StreetViewPanoramaLink implements SafeParcelable {
    public static final C0490n CREATOR = new C0490n();
    public final String f2191a;
    public final float f2192b;
    private final int f2193c;

    StreetViewPanoramaLink(int i, String str, float f) {
        this.f2193c = i;
        this.f2191a = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.f2192b = f % 360.0f;
    }

    final int m3268a() {
        return this.f2193c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f2191a.equals(streetViewPanoramaLink.f2191a) && Float.floatToIntBits(this.f2192b) == Float.floatToIntBits(streetViewPanoramaLink.f2192b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2191a, Float.valueOf(this.f2192b)});
    }

    public String toString() {
        return jb.m2469a(this).m2471a("panoId", this.f2191a).m2471a("bearing", Float.valueOf(this.f2192b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0490n.m3558a(this, parcel);
    }
}
