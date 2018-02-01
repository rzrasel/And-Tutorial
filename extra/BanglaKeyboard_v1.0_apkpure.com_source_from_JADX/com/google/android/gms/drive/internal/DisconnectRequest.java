package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DisconnectRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0289v();
    final int f607a;

    public DisconnectRequest() {
        this(1);
    }

    DisconnectRequest(int i) {
        this.f607a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0289v.m1110a(this, parcel);
    }
}
