package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.C0312a;
import java.util.List;

public class LogicalFilter implements SafeParcelable, C0312a {
    public static final Creator CREATOR = new C0321g();
    final Operator f688a;
    final List f689b;
    final int f690c;

    LogicalFilter(int i, Operator operator, List list) {
        this.f690c = i;
        this.f688a = operator;
        this.f689b = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0321g.m1136a(this, parcel, i);
    }
}
