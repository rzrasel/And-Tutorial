package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDownloadProgressResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0269b();
    final int f614a;
    final long f615b;
    final long f616c;

    OnDownloadProgressResponse(int i, long j, long j2) {
        this.f614a = i;
        this.f615b = j;
        this.f616c = j2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0269b.m1090a(this, parcel);
    }
}
