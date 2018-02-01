package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class SortOrder implements SafeParcelable {
    public static final Creator CREATOR = new C0314c();
    final List f665a;
    final int f666b;

    SortOrder(int i, List list) {
        this.f666b = i;
        this.f665a = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0314c.m1129a(this, parcel);
    }
}
