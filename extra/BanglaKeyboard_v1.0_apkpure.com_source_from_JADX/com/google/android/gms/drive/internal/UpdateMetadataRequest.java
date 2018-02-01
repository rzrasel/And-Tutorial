package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class UpdateMetadataRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0281n();
    final int f646a;
    final DriveId f647b;
    final MetadataBundle f648c;

    UpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.f646a = i;
        this.f647b = driveId;
        this.f648c = metadataBundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0281n.m1102a(this, parcel, i);
    }
}
