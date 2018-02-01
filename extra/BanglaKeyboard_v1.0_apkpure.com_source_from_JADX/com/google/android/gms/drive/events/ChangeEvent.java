package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public final class ChangeEvent implements SafeParcelable, ResourceEvent {
    public static final Creator CREATOR = new C0266a();
    final int f575a;
    final DriveId f576b;
    final int f577c;

    ChangeEvent(int i, DriveId driveId, int i2) {
        this.f575a = i;
        this.f576b = driveId;
        this.f577c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("ChangeEvent [id=%s,changeFlags=%x]", new Object[]{this.f576b, Integer.valueOf(this.f577c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0266a.m1087a(this, parcel, i);
    }
}
