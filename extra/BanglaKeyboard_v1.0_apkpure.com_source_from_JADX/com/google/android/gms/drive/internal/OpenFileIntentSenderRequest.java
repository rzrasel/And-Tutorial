package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenFileIntentSenderRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0277j();
    final int f635a;
    final String f636b;
    final String[] f637c;
    final DriveId f638d;

    OpenFileIntentSenderRequest(int i, String str, String[] strArr, DriveId driveId) {
        this.f635a = i;
        this.f636b = str;
        this.f637c = strArr;
        this.f638d = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0277j.m1098a(this, parcel, i);
    }
}
