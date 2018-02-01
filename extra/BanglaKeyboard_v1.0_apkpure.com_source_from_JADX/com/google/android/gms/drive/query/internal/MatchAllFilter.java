package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.C0312a;

public class MatchAllFilter implements SafeParcelable, C0312a {
    public static final C0322h CREATOR = new C0322h();
    final int f691a;

    public MatchAllFilter() {
        this(1);
    }

    MatchAllFilter(int i) {
        this.f691a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0322h.m1137a(this, parcel);
    }
}
