package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0276i();
    final int f632a;
    final DriveId f633b;
    final int f634c;

    OpenContentsRequest(int i, DriveId driveId, int i2) {
        this.f632a = i;
        this.f633b = driveId;
        this.f634c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0276i.m1097a(this, parcel, i);
    }
}
