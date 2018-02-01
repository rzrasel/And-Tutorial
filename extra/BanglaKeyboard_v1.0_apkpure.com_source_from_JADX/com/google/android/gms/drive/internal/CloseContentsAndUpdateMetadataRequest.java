package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CloseContentsAndUpdateMetadataRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0283p();
    final int f587a;
    final DriveId f588b;
    final MetadataBundle f589c;
    final Contents f590d;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents) {
        this.f587a = i;
        this.f588b = driveId;
        this.f589c = metadataBundle;
        this.f590d = contents;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0283p.m1104a(this, parcel, i);
    }
}
