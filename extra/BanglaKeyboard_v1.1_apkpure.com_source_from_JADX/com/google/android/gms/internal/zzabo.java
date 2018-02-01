package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@aqv
public final class zzabo extends zzbcc {
    public static final Creator<zzabo> CREATOR = new al();
    String f7693a;

    public zzabo(String str) {
        this.f7693a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f7693a);
        li.m5967b(parcel, a);
    }
}
