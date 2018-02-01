package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public final class ConflictEvent implements SafeParcelable, DriveEvent {
    public static final Creator CREATOR = new C0267b();
    final int f578a;
    final DriveId f579b;

    ConflictEvent(int i, DriveId driveId) {
        this.f578a = i;
        this.f579b = driveId;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("ConflictEvent [id=%s]", new Object[]{this.f579b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0267b.m1088a(this, parcel, i);
    }
}
