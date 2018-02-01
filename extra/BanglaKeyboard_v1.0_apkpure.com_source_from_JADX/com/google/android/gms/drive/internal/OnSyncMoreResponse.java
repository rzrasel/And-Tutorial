package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnSyncMoreResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0275h();
    final int f630a;
    final boolean f631b;

    OnSyncMoreResponse(int i, boolean z) {
        this.f630a = i;
        this.f631b = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0275h.m1096a(this, parcel);
    }
}
