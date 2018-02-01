package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnListEntriesResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0272e();
    final int f623a;
    final DataHolder f624b;
    final boolean f625c;

    OnListEntriesResponse(int i, DataHolder dataHolder, boolean z) {
        this.f623a = i;
        this.f624b = dataHolder;
        this.f625c = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0272e.m1093a(this, parcel, i);
    }
}
