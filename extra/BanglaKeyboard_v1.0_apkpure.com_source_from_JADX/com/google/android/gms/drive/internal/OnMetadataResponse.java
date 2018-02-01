package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0274g();
    final int f628a;
    final MetadataBundle f629b;

    OnMetadataResponse(int i, MetadataBundle metadataBundle) {
        this.f628a = i;
        this.f629b = metadataBundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0274g.m1095a(this, parcel, i);
    }
}
