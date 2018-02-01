package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.C0312a;

public class NotFilter implements SafeParcelable, C0312a {
    public static final Creator CREATOR = new C0323i();
    final FilterHolder f692a;
    final int f693b;

    NotFilter(int i, FilterHolder filterHolder) {
        this.f693b = i;
        this.f692a = filterHolder;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0323i.m1138a(this, parcel, i);
    }
}
