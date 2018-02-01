package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import java.util.Arrays;

public class StreetViewPanoramaCamera implements SafeParcelable {
    public static final C0489m CREATOR = new C0489m();
    public final float f2186a;
    public final float f2187b;
    public final float f2188c;
    private final int f2189d;
    private StreetViewPanoramaOrientation f2190e;

    StreetViewPanoramaCamera(int i, float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        je.m2479b(z, "Tilt needs to be between -90 and 90 inclusive");
        this.f2189d = i;
        this.f2186a = f;
        this.f2187b = 0.0f + f2;
        this.f2188c = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        C0492p c0492p = new C0492p();
        c0492p.f2233b = f2;
        c0492p.f2232a = f3;
        this.f2190e = new StreetViewPanoramaOrientation(c0492p.f2233b, c0492p.f2232a);
    }

    final int m3267a() {
        return this.f2189d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f2186a) == Float.floatToIntBits(streetViewPanoramaCamera.f2186a) && Float.floatToIntBits(this.f2187b) == Float.floatToIntBits(streetViewPanoramaCamera.f2187b) && Float.floatToIntBits(this.f2188c) == Float.floatToIntBits(streetViewPanoramaCamera.f2188c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2186a), Float.valueOf(this.f2187b), Float.valueOf(this.f2188c)});
    }

    public String toString() {
        return jb.m2469a(this).m2471a("zoom", Float.valueOf(this.f2186a)).m2471a("tilt", Float.valueOf(this.f2187b)).m2471a("bearing", Float.valueOf(this.f2188c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0489m.m3557a(this, parcel);
    }
}
