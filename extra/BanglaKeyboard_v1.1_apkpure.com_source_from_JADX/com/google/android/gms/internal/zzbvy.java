package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbvy extends zzbcc {
    public static final Creator<zzbvy> CREATOR = new ly();
    private int f7711a;
    private String f7712b;
    private String f7713c;

    zzbvy(int i, String str, String str2) {
        this.f7711a = i;
        this.f7712b = str;
        this.f7713c = str2;
    }

    public zzbvy(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f7711a);
        li.m5961a(parcel, 2, this.f7712b);
        li.m5961a(parcel, 3, this.f7713c);
        li.m5967b(parcel, a);
    }
}
