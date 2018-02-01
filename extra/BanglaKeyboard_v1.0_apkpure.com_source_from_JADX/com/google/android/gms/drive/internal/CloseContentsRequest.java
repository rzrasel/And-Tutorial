package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0284q();
    final int f591a;
    final Contents f592b;
    final Boolean f593c;

    CloseContentsRequest(int i, Contents contents, Boolean bool) {
        this.f591a = i;
        this.f592b = contents;
        this.f593c = bool;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0284q.m1105a(this, parcel, i);
    }
}
