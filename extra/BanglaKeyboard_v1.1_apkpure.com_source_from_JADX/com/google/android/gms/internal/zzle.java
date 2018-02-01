package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@aqv
public final class zzle extends zzbcc {
    public static final Creator<zzle> CREATOR = new acc();
    public final int f7770a;

    public zzle(int i) {
        this.f7770a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 2, this.f7770a);
        li.m5967b(parcel, a);
    }
}
