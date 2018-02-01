package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AuthorizeAccessRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0282o();
    final int f584a;
    final long f585b;
    final DriveId f586c;

    AuthorizeAccessRequest(int i, long j, DriveId driveId) {
        this.f584a = i;
        this.f585b = j;
        this.f586c = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0282o.m1103a(this, parcel, i);
    }
}
