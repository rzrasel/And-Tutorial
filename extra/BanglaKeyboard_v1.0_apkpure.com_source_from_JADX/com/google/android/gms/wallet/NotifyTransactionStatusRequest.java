package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class NotifyTransactionStatusRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0561m();
    final int f2471a;
    String f2472b;
    int f2473c;
    String f2474d;

    NotifyTransactionStatusRequest() {
        this.f2471a = 1;
    }

    NotifyTransactionStatusRequest(int i, String str, int i2, String str2) {
        this.f2471a = i;
        this.f2472b = str;
        this.f2473c = i2;
        this.f2474d = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0561m.m3821a(this, parcel);
    }
}
