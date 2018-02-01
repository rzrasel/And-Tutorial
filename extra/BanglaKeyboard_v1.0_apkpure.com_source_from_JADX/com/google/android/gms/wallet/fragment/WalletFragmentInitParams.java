package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams implements SafeParcelable {
    public static final Creator CREATOR = new C0552f();
    final int f2495a;
    private String f2496b;
    private MaskedWalletRequest f2497c;
    private int f2498d;
    private MaskedWallet f2499e;

    private WalletFragmentInitParams() {
        this.f2495a = 1;
        this.f2498d = -1;
    }

    WalletFragmentInitParams(int i, String str, MaskedWalletRequest maskedWalletRequest, int i2, MaskedWallet maskedWallet) {
        this.f2495a = i;
        this.f2496b = str;
        this.f2497c = maskedWalletRequest;
        this.f2498d = i2;
        this.f2499e = maskedWallet;
    }

    public final String m3781a() {
        return this.f2496b;
    }

    public final MaskedWalletRequest m3782b() {
        return this.f2497c;
    }

    public final int m3783c() {
        return this.f2498d;
    }

    public final MaskedWallet m3784d() {
        return this.f2499e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0552f.m3812a(this, parcel, i);
    }
}
