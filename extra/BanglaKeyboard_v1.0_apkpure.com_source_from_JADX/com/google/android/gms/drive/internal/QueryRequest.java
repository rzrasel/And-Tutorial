package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0278k();
    final int f639a;
    final Query f640b;

    QueryRequest(int i, Query query) {
        this.f639a = i;
        this.f640b = query;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0278k.m1099a(this, parcel, i);
    }
}
