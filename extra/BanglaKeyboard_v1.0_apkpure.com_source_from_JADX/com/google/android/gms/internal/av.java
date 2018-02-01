package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.C0224a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class av implements SafeParcelable {
    public static final aj CREATOR = new aj();
    public final int f1008a;
    public final int f1009b;
    public final int f1010c;
    public final int f1011d;
    public final int f1012e;
    public final int f1013f;
    public final int f1014g;
    public final int f1015h;
    public final int f1016i;
    public final String f1017j;
    public final int f1018k;
    public final String f1019l;
    public final int f1020m;
    public final int f1021n;
    public final String f1022o;

    av(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.f1008a = i;
        this.f1009b = i2;
        this.f1010c = i3;
        this.f1011d = i4;
        this.f1012e = i5;
        this.f1013f = i6;
        this.f1014g = i7;
        this.f1015h = i8;
        this.f1016i = i9;
        this.f1017j = str;
        this.f1018k = i10;
        this.f1019l = str2;
        this.f1020m = i11;
        this.f1021n = i12;
        this.f1022o = str3;
    }

    public av(C0224a c0224a) {
        this.f1008a = 1;
        this.f1009b = c0224a.m929a();
        this.f1010c = c0224a.m930b();
        this.f1011d = c0224a.m931c();
        this.f1012e = c0224a.m932d();
        this.f1013f = c0224a.m933e();
        this.f1014g = c0224a.m934f();
        this.f1015h = c0224a.m935g();
        this.f1016i = c0224a.m936h();
        this.f1017j = c0224a.m937i();
        this.f1018k = c0224a.m938j();
        this.f1019l = c0224a.m939k();
        this.f1020m = c0224a.m940l();
        this.f1021n = c0224a.m941m();
        this.f1022o = c0224a.m942n();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aj.m1640a(this, parcel);
    }
}
