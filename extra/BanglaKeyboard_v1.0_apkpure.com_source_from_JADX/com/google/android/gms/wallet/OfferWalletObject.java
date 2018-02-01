package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class OfferWalletObject implements SafeParcelable {
    public static final Creator CREATOR = new C0562n();
    String f2475a;
    String f2476b;
    private final int f2477c;

    OfferWalletObject() {
        this.f2477c = 2;
    }

    OfferWalletObject(int i, String str, String str2) {
        this.f2477c = i;
        this.f2475a = str;
        this.f2476b = str2;
    }

    public final int m3759a() {
        return this.f2477c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0562n.m3822a(this, parcel);
    }
}
