package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0270c();
    final int f617a;
    DriveId f618b;

    OnDriveIdResponse(int i, DriveId driveId) {
        this.f617a = i;
        this.f618b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0270c.m1091a(this, parcel, i);
    }
}
