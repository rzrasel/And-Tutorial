package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class C0544d implements SafeParcelable {
    public static final Creator CREATOR = new C0545e();
    LoyaltyWalletObject f2483a;
    private final int f2484b;

    C0544d() {
        this.f2484b = 1;
    }

    C0544d(int i, LoyaltyWalletObject loyaltyWalletObject) {
        this.f2484b = i;
        this.f2483a = loyaltyWalletObject;
    }

    public final int m3764a() {
        return this.f2484b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0545e.m3765a(this, parcel, i);
    }
}
