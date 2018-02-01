package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import java.util.Arrays;

public class StreetViewPanoramaOrientation implements SafeParcelable {
    public static final C0493q CREATOR = new C0493q();
    public final float f2198a;
    public final float f2199b;
    private final int f2200c;

    public StreetViewPanoramaOrientation(float f, float f2) {
        this(1, f, f2);
    }

    StreetViewPanoramaOrientation(int i, float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        je.m2479b(z, "Tilt needs to be between -90 and 90 inclusive");
        this.f2200c = i;
        this.f2198a = 0.0f + f;
        if (((double) f2) <= 0.0d) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.f2199b = f2 % 360.0f;
    }

    final int m3270a() {
        return this.f2200c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f2198a) == Float.floatToIntBits(streetViewPanoramaOrientation.f2198a) && Float.floatToIntBits(this.f2199b) == Float.floatToIntBits(streetViewPanoramaOrientation.f2199b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2198a), Float.valueOf(this.f2199b)});
    }

    public String toString() {
        return jb.m2469a(this).m2471a("tilt", Float.valueOf(this.f2198a)).m2471a("bearing", Float.valueOf(this.f2199b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0493q.m3562a(this, parcel);
    }
}
