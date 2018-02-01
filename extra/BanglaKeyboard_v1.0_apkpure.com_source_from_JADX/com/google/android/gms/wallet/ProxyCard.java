package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard implements SafeParcelable {
    public static final Creator CREATOR = new C0563o();
    String f2478a;
    String f2479b;
    int f2480c;
    int f2481d;
    private final int f2482e;

    ProxyCard(int i, String str, String str2, int i2, int i3) {
        this.f2482e = i;
        this.f2478a = str;
        this.f2479b = str2;
        this.f2480c = i2;
        this.f2481d = i3;
    }

    public final int m3760a() {
        return this.f2482e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0563o.m3823a(this, parcel);
    }
}
