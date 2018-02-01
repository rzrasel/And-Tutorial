package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class ho implements SafeParcelable {
    public static final Creator CREATOR = new lg();
    final int f1637a;
    private final String f1638b;
    private final LatLng f1639c;
    private final String f1640d;
    private final List f1641e;
    private final String f1642f;
    private final String f1643g;

    ho(int i, String str, LatLng latLng, String str2, List list, String str3, String str4) {
        this.f1637a = i;
        this.f1638b = str;
        this.f1639c = latLng;
        this.f1640d = str2;
        this.f1641e = new ArrayList(list);
        this.f1642f = str3;
        this.f1643g = str4;
    }

    public final String m2164a() {
        return this.f1638b;
    }

    public final LatLng m2165b() {
        return this.f1639c;
    }

    public final String m2166c() {
        return this.f1640d;
    }

    public final List m2167d() {
        return this.f1641e;
    }

    public int describeContents() {
        return 0;
    }

    public final String m2168e() {
        return this.f1642f;
    }

    public final String m2169f() {
        return this.f1643g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        lg.m2535a(this, parcel, i);
    }
}
