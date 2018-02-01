package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.C0326f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentOptions implements SafeParcelable {
    public static final Creator CREATOR = new C0553g();
    final int f2500a;
    private int f2501b;
    private int f2502c;
    private WalletFragmentStyle f2503d;
    private int f2504e;

    private WalletFragmentOptions() {
        this.f2500a = 1;
    }

    WalletFragmentOptions(int i, int i2, int i3, WalletFragmentStyle walletFragmentStyle, int i4) {
        this.f2500a = i;
        this.f2501b = i2;
        this.f2502c = i3;
        this.f2503d = walletFragmentStyle;
        this.f2504e = i4;
    }

    public static WalletFragmentOptions m3785a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0326f.WalletFragmentOptions);
        int i = obtainStyledAttributes.getInt(0, 0);
        int i2 = obtainStyledAttributes.getInt(1, 1);
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        int i3 = obtainStyledAttributes.getInt(3, 1);
        obtainStyledAttributes.recycle();
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.f2502c = i;
        walletFragmentOptions.f2501b = i2;
        walletFragmentOptions.f2503d = new WalletFragmentStyle().m3795a(resourceId);
        walletFragmentOptions.f2503d.m3796a(context);
        walletFragmentOptions.f2504e = i3;
        return walletFragmentOptions;
    }

    public final int m3786a() {
        return this.f2501b;
    }

    public final void m3787a(Context context) {
        if (this.f2503d != null) {
            this.f2503d.m3796a(context);
        }
    }

    public final int m3788b() {
        return this.f2502c;
    }

    public final WalletFragmentStyle m3789c() {
        return this.f2503d;
    }

    public final int m3790d() {
        return this.f2504e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0553g.m3813a(this, parcel, i);
    }
}
