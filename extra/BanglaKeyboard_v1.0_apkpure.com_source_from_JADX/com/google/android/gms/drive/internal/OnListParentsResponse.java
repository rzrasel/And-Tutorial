package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnListParentsResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0273f();
    final int f626a;
    final DataHolder f627b;

    OnListParentsResponse(int i, DataHolder dataHolder) {
        this.f626a = i;
        this.f627b = dataHolder;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0273f.m1094a(this, parcel, i);
    }
}
