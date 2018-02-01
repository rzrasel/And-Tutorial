package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.je;

public class CreateFileRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0287t();
    final int f600a;
    final DriveId f601b;
    final MetadataBundle f602c;
    final Contents f603d;

    CreateFileRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents) {
        this.f600a = i;
        this.f601b = (DriveId) je.m2473a((Object) driveId);
        this.f602c = (MetadataBundle) je.m2473a((Object) metadataBundle);
        this.f603d = (Contents) je.m2473a((Object) contents);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0287t.m1108a(this, parcel, i);
    }
}
