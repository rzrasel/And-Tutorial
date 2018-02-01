package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FieldWithSortOrder implements SafeParcelable {
    public static final C0317c CREATOR = new C0317c();
    final String f674a;
    final boolean f675b;
    final int f676c;

    FieldWithSortOrder(int i, String str, boolean z) {
        this.f676c = i;
        this.f674a = str;
        this.f675b = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0317c.m1132a(this, parcel);
    }
}
