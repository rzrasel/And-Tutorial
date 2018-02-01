package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0293z();
    final int f612a;
    final Contents f613b;

    OnContentsResponse(int i, Contents contents) {
        this.f612a = i;
        this.f613b = contents;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0293z.m1121a(this, parcel, i);
    }
}
