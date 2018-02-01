package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;

public class Query implements SafeParcelable {
    public static final Creator CREATOR = new C0313b();
    final LogicalFilter f661a;
    final String f662b;
    final SortOrder f663c;
    final int f664d;

    Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder) {
        this.f664d = i;
        this.f661a = logicalFilter;
        this.f662b = str;
        this.f663c = sortOrder;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0313b.m1128a(this, parcel, i);
    }
}
