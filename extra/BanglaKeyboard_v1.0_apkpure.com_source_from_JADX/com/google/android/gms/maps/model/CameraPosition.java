package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0326f;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import com.google.android.gms.maps.p013a.cj;
import java.util.Arrays;

public final class CameraPosition implements SafeParcelable {
    public static final C0480d CREATOR = new C0480d();
    public final LatLng f2125a;
    public final float f2126b;
    public final float f2127c;
    public final float f2128d;
    private final int f2129e;

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        je.m2474a((Object) latLng, (Object) "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        je.m2479b(z, "Tilt needs to be between 0 and 90 inclusive");
        this.f2129e = i;
        this.f2125a = latLng;
        this.f2126b = f;
        this.f2127c = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.f2128d = f3 % 360.0f;
    }

    private CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static CameraPosition m3213a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0326f.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(2) ? obtainAttributes.getFloat(2, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 0.0f) : 0.0f));
        C0479c c0479c = new C0479c();
        c0479c.f2228a = latLng;
        if (obtainAttributes.hasValue(5)) {
            c0479c.f2229b = obtainAttributes.getFloat(5, 0.0f);
        }
        if (obtainAttributes.hasValue(1)) {
            c0479c.f2231d = obtainAttributes.getFloat(1, 0.0f);
        }
        if (obtainAttributes.hasValue(4)) {
            c0479c.f2230c = obtainAttributes.getFloat(4, 0.0f);
        }
        return new CameraPosition(c0479c.f2228a, c0479c.f2229b, c0479c.f2230c, c0479c.f2231d);
    }

    final int m3214a() {
        return this.f2129e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f2125a.equals(cameraPosition.f2125a) && Float.floatToIntBits(this.f2126b) == Float.floatToIntBits(cameraPosition.f2126b) && Float.floatToIntBits(this.f2127c) == Float.floatToIntBits(cameraPosition.f2127c) && Float.floatToIntBits(this.f2128d) == Float.floatToIntBits(cameraPosition.f2128d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2125a, Float.valueOf(this.f2126b), Float.valueOf(this.f2127c), Float.valueOf(this.f2128d)});
    }

    public final String toString() {
        return jb.m2469a(this).m2471a("target", this.f2125a).m2471a("zoom", Float.valueOf(this.f2126b)).m2471a("tilt", Float.valueOf(this.f2127c)).m2471a("bearing", Float.valueOf(this.f2128d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2129e);
            C0261c.m1072a(parcel, 2, this.f2125a, i, false);
            C0261c.m1067a(parcel, 3, this.f2126b);
            C0261c.m1067a(parcel, 4, this.f2127c);
            C0261c.m1067a(parcel, 5, this.f2128d);
            C0261c.m1081b(parcel, a);
            return;
        }
        C0480d.m3541a(this, parcel, i);
    }
}
