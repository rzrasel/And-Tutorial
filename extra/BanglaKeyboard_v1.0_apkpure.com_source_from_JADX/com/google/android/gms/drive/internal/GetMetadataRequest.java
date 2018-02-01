package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0290w();
    final int f608a;
    final DriveId f609b;

    GetMetadataRequest(int i, DriveId driveId) {
        this.f608a = i;
        this.f609b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0290w.m1111a(this, parcel, i);
    }
}
