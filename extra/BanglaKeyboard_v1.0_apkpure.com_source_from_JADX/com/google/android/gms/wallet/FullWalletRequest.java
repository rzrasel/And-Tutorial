package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0555g();
    String f2407a;
    String f2408b;
    Cart f2409c;
    private final int f2410d;

    FullWalletRequest() {
        this.f2410d = 1;
    }

    FullWalletRequest(int i, String str, String str2, Cart cart) {
        this.f2410d = i;
        this.f2407a = str;
        this.f2408b = str2;
        this.f2409c = cart;
    }

    public final int m3751a() {
        return this.f2410d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0555g.m3815a(this, parcel, i);
    }
}
