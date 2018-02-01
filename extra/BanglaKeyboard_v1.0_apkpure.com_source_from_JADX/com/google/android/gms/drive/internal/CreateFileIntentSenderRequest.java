package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0286s();
    final int f595a;
    final MetadataBundle f596b;
    final int f597c;
    final String f598d;
    final DriveId f599e;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadataBundle, int i2, String str, DriveId driveId) {
        this.f595a = i;
        this.f596b = metadataBundle;
        this.f597c = i2;
        this.f598d = str;
        this.f599e = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0286s.m1107a(this, parcel, i);
    }
}
