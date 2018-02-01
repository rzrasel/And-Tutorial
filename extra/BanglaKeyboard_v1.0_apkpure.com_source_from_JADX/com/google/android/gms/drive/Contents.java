package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Contents implements SafeParcelable {
    public static final Creator CREATOR = new C0264a();
    final int f562a;
    final ParcelFileDescriptor f563b;
    final int f564c;
    final int f565d;
    final DriveId f566e;
    private boolean f567f = false;
    private boolean f568g = false;
    private boolean f569h = false;

    Contents(int i, ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, DriveId driveId) {
        this.f562a = i;
        this.f563b = parcelFileDescriptor;
        this.f564c = i2;
        this.f565d = i3;
        this.f566e = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0264a.m1085a(this, parcel, i);
    }
}
