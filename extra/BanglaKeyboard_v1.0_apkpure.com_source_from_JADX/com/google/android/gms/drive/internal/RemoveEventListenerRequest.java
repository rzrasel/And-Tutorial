package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemoveEventListenerRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0279l();
    final int f641a;
    final DriveId f642b;
    final int f643c;

    RemoveEventListenerRequest(int i, DriveId driveId, int i2) {
        this.f641a = i;
        this.f642b = driveId;
        this.f643c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0279l.m1100a(this, parcel, i);
    }
}
