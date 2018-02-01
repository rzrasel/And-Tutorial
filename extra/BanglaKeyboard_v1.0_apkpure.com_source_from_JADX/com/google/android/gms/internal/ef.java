package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ef implements Parcelable {
    @Deprecated
    public static final Creator CREATOR = new gw();
    private String f1243a;
    private String f1244b;
    private String f1245c;

    @Deprecated
    ef(Parcel parcel) {
        this.f1243a = parcel.readString();
        this.f1244b = parcel.readString();
        this.f1245c = parcel.readString();
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1243a);
        parcel.writeString(this.f1244b);
        parcel.writeString(this.f1245c);
    }
}
