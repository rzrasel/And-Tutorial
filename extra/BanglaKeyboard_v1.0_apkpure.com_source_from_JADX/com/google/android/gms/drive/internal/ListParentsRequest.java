package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ListParentsRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0291x();
    final int f610a;
    final DriveId f611b;

    ListParentsRequest(int i, DriveId driveId) {
        this.f610a = i;
        this.f611b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0291x.m1112a(this, parcel, i);
    }
}
