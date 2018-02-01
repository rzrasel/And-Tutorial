package com.google.android.gms.drive.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AddEventListenerRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0268a();
    final int f580a;
    final DriveId f581b;
    final int f582c;
    final PendingIntent f583d;

    AddEventListenerRequest(int i, DriveId driveId, int i2, PendingIntent pendingIntent) {
        this.f580a = i;
        this.f581b = driveId;
        this.f582c = i2;
        this.f583d = pendingIntent;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0268a.m1089a(this, parcel, i);
    }
}
