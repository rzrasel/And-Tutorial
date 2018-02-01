package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.p013a.ae;

public final class StreetViewPanoramaOptions implements SafeParcelable {
    public static final C0445h CREATOR = new C0445h();
    private final int f2056a;
    private StreetViewPanoramaCamera f2057b;
    private String f2058c;
    private LatLng f2059d;
    private Integer f2060e;
    private Boolean f2061f;
    private Boolean f2062g;
    private Boolean f2063h;
    private Boolean f2064i;
    private Boolean f2065j;

    public StreetViewPanoramaOptions() {
        this.f2061f = Boolean.valueOf(true);
        this.f2062g = Boolean.valueOf(true);
        this.f2063h = Boolean.valueOf(true);
        this.f2064i = Boolean.valueOf(true);
        this.f2056a = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f2061f = Boolean.valueOf(true);
        this.f2062g = Boolean.valueOf(true);
        this.f2063h = Boolean.valueOf(true);
        this.f2064i = Boolean.valueOf(true);
        this.f2056a = i;
        this.f2057b = streetViewPanoramaCamera;
        this.f2059d = latLng;
        this.f2060e = num;
        this.f2058c = str;
        this.f2061f = ae.m2869a(b);
        this.f2062g = ae.m2869a(b2);
        this.f2063h = ae.m2869a(b3);
        this.f2064i = ae.m2869a(b4);
        this.f2065j = ae.m2869a(b5);
    }

    final int m2796a() {
        return this.f2056a;
    }

    final byte m2797b() {
        return ae.m2868a(this.f2061f);
    }

    final byte m2798c() {
        return ae.m2868a(this.f2062g);
    }

    final byte m2799d() {
        return ae.m2868a(this.f2063h);
    }

    public final int describeContents() {
        return 0;
    }

    final byte m2800e() {
        return ae.m2868a(this.f2064i);
    }

    final byte m2801f() {
        return ae.m2868a(this.f2065j);
    }

    public final StreetViewPanoramaCamera m2802g() {
        return this.f2057b;
    }

    public final LatLng m2803h() {
        return this.f2059d;
    }

    public final Integer m2804i() {
        return this.f2060e;
    }

    public final String m2805j() {
        return this.f2058c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0445h.m3174a(this, parcel, i);
    }
}
