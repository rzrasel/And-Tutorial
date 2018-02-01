package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.je;

public class CreateFolderRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0288u();
    final int f604a;
    final DriveId f605b;
    final MetadataBundle f606c;

    CreateFolderRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.f604a = i;
        this.f605b = (DriveId) je.m2473a((Object) driveId);
        this.f606c = (MetadataBundle) je.m2473a((Object) metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0288u.m1109a(this, parcel, i);
    }
}
