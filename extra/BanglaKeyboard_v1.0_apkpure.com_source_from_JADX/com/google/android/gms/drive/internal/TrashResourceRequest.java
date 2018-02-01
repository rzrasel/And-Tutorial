package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class TrashResourceRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0280m();
    final int f644a;
    final DriveId f645b;

    TrashResourceRequest(int i, DriveId driveId) {
        this.f644a = i;
        this.f645b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0280m.m1101a(this, parcel, i);
    }
}
