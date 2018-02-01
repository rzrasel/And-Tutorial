package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@aqv
public final class zzajk extends zzbcc {
    public static final Creator<zzajk> CREATOR = new C1582if();
    public String f7706a;
    public int f7707b;
    public int f7708c;
    public boolean f7709d;
    public boolean f7710e;

    public zzajk(int i, int i2, boolean z) {
        this(i, i2, z, false);
    }

    private zzajk(int i, int i2, boolean z, boolean z2) {
        String str = "afma-sdk-a-v";
        String str2 = z ? "0" : "1";
        this(new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(str2).length()).append(str).append(i).append(".").append(i2).append(".").append(str2).toString(), i, i2, z, z2);
    }

    public zzajk(int i, boolean z) {
        this(11220000, i, true, z);
    }

    zzajk(String str, int i, int i2, boolean z, boolean z2) {
        this.f7706a = str;
        this.f7707b = i;
        this.f7708c = i2;
        this.f7709d = z;
        this.f7710e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f7706a);
        li.m5956a(parcel, 3, this.f7707b);
        li.m5956a(parcel, 4, this.f7708c);
        li.m5963a(parcel, 5, this.f7709d);
        li.m5963a(parcel, 6, this.f7710e);
        li.m5967b(parcel, a);
    }
}
