package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet implements SafeParcelable {
    public static final Creator CREATOR = new C0559k();
    String f2444a;
    String f2445b;
    String[] f2446c;
    String f2447d;
    Address f2448e;
    Address f2449f;
    LoyaltyWalletObject[] f2450g;
    OfferWalletObject[] f2451h;
    UserAddress f2452i;
    UserAddress f2453j;
    InstrumentInfo[] f2454k;
    private final int f2455l;

    private MaskedWallet() {
        this.f2455l = 2;
    }

    MaskedWallet(int i, String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f2455l = i;
        this.f2444a = str;
        this.f2445b = str2;
        this.f2446c = strArr;
        this.f2447d = str3;
        this.f2448e = address;
        this.f2449f = address2;
        this.f2450g = loyaltyWalletObjectArr;
        this.f2451h = offerWalletObjectArr;
        this.f2452i = userAddress;
        this.f2453j = userAddress2;
        this.f2454k = instrumentInfoArr;
    }

    public final int m3757a() {
        return this.f2455l;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0559k.m3819a(this, parcel, i);
    }
}
