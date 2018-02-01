package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class FullWallet implements SafeParcelable {
    public static final Creator CREATOR = new C0546f();
    String f2396a;
    String f2397b;
    ProxyCard f2398c;
    String f2399d;
    Address f2400e;
    Address f2401f;
    String[] f2402g;
    UserAddress f2403h;
    UserAddress f2404i;
    InstrumentInfo[] f2405j;
    private final int f2406k;

    private FullWallet() {
        this.f2406k = 1;
    }

    FullWallet(int i, String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f2406k = i;
        this.f2396a = str;
        this.f2397b = str2;
        this.f2398c = proxyCard;
        this.f2399d = str3;
        this.f2400e = address;
        this.f2401f = address2;
        this.f2402g = strArr;
        this.f2403h = userAddress;
        this.f2404i = userAddress2;
        this.f2405j = instrumentInfoArr;
    }

    public final int m3750a() {
        return this.f2406k;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0546f.m3766a(this, parcel, i);
    }
}
