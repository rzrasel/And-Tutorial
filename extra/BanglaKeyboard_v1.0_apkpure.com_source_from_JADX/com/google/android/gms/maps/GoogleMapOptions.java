package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0326f;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.p013a.ae;
import com.google.android.gms.maps.p013a.cj;

public final class GoogleMapOptions implements SafeParcelable {
    public static final C0440c CREATOR = new C0440c();
    private final int f2043a;
    private Boolean f2044b;
    private Boolean f2045c;
    private int f2046d;
    private CameraPosition f2047e;
    private Boolean f2048f;
    private Boolean f2049g;
    private Boolean f2050h;
    private Boolean f2051i;
    private Boolean f2052j;
    private Boolean f2053k;

    public GoogleMapOptions() {
        this.f2046d = -1;
        this.f2043a = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        this.f2046d = -1;
        this.f2043a = i;
        this.f2044b = ae.m2869a(b);
        this.f2045c = ae.m2869a(b2);
        this.f2046d = i2;
        this.f2047e = cameraPosition;
        this.f2048f = ae.m2869a(b3);
        this.f2049g = ae.m2869a(b4);
        this.f2050h = ae.m2869a(b5);
        this.f2051i = ae.m2869a(b6);
        this.f2052j = ae.m2869a(b7);
        this.f2053k = ae.m2869a(b8);
    }

    public static GoogleMapOptions m2784a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0326f.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.f2046d = obtainAttributes.getInt(0, -1);
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.f2044b = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.f2045c = Boolean.valueOf(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(6)) {
            googleMapOptions.f2049g = Boolean.valueOf(obtainAttributes.getBoolean(6, true));
        }
        if (obtainAttributes.hasValue(7)) {
            googleMapOptions.f2053k = Boolean.valueOf(obtainAttributes.getBoolean(7, true));
        }
        if (obtainAttributes.hasValue(8)) {
            googleMapOptions.f2050h = Boolean.valueOf(obtainAttributes.getBoolean(8, true));
        }
        if (obtainAttributes.hasValue(9)) {
            googleMapOptions.f2052j = Boolean.valueOf(obtainAttributes.getBoolean(9, true));
        }
        if (obtainAttributes.hasValue(11)) {
            googleMapOptions.f2051i = Boolean.valueOf(obtainAttributes.getBoolean(11, true));
        }
        if (obtainAttributes.hasValue(10)) {
            googleMapOptions.f2048f = Boolean.valueOf(obtainAttributes.getBoolean(10, true));
        }
        googleMapOptions.f2047e = CameraPosition.m3213a(context, attributeSet);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    final int m2785a() {
        return this.f2043a;
    }

    final byte m2786b() {
        return ae.m2868a(this.f2044b);
    }

    final byte m2787c() {
        return ae.m2868a(this.f2045c);
    }

    final byte m2788d() {
        return ae.m2868a(this.f2048f);
    }

    public final int describeContents() {
        return 0;
    }

    final byte m2789e() {
        return ae.m2868a(this.f2049g);
    }

    final byte m2790f() {
        return ae.m2868a(this.f2050h);
    }

    final byte m2791g() {
        return ae.m2868a(this.f2051i);
    }

    final byte m2792h() {
        return ae.m2868a(this.f2052j);
    }

    final byte m2793i() {
        return ae.m2868a(this.f2053k);
    }

    public final int m2794j() {
        return this.f2046d;
    }

    public final CameraPosition m2795k() {
        return this.f2047e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (cj.m2951a()) {
            int a = C0261c.m1064a(parcel, 20293);
            C0261c.m1082b(parcel, 1, this.f2043a);
            C0261c.m1065a(parcel, 2, ae.m2868a(this.f2044b));
            C0261c.m1065a(parcel, 3, ae.m2868a(this.f2045c));
            C0261c.m1082b(parcel, 4, this.f2046d);
            C0261c.m1072a(parcel, 5, this.f2047e, i, false);
            C0261c.m1065a(parcel, 6, ae.m2868a(this.f2048f));
            C0261c.m1065a(parcel, 7, ae.m2868a(this.f2049g));
            C0261c.m1065a(parcel, 8, ae.m2868a(this.f2050h));
            C0261c.m1065a(parcel, 9, ae.m2868a(this.f2051i));
            C0261c.m1065a(parcel, 10, ae.m2868a(this.f2052j));
            C0261c.m1065a(parcel, 11, ae.m2868a(this.f2053k));
            C0261c.m1081b(parcel, a);
            return;
        }
        C0440c.m3158a(this, parcel, i);
    }
}
