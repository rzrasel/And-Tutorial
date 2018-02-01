package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@aqv
public final class zzadp extends zzbcc {
    public static final Creator<zzadp> CREATOR = new cn();
    public final zzix f7694a;
    public final String f7695b;

    public zzadp(zzix com_google_android_gms_internal_zzix, String str) {
        this.f7694a = com_google_android_gms_internal_zzix;
        this.f7695b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5960a(parcel, 2, this.f7694a, i);
        li.m5961a(parcel, 3, this.f7695b);
        li.m5967b(parcel, a);
    }
}
