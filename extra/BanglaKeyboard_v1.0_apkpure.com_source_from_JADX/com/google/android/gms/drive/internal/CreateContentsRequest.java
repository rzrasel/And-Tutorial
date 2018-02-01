package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CreateContentsRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0285r();
    final int f594a;

    public CreateContentsRequest() {
        this(1);
    }

    CreateContentsRequest(int i) {
        this.f594a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0285r.m1106a(this, parcel);
    }
}
