package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;

public final class zzc extends zzbcc {
    public static final Creator<zzc> CREATOR = new C1492f();
    private String f4661a;
    private int f4662b;

    public zzc(String str, int i) {
        this.f4661a = str;
        this.f4662b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 1, this.f4661a);
        li.m5956a(parcel, 2, this.f4662b);
        li.m5967b(parcel, a);
    }
}
