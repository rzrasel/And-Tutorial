package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0553g implements Creator {
    static void m3813a(WalletFragmentOptions walletFragmentOptions, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, walletFragmentOptions.f2500a);
        C0261c.m1082b(parcel, 2, walletFragmentOptions.m3786a());
        C0261c.m1082b(parcel, 3, walletFragmentOptions.m3788b());
        C0261c.m1072a(parcel, 4, walletFragmentOptions.m3789c(), i, false);
        C0261c.m1082b(parcel, 5, walletFragmentOptions.m3790d());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 1;
        int i2 = 0;
        int a = C0259a.m1038a(parcel);
        WalletFragmentStyle walletFragmentStyle = null;
        int i3 = 1;
        int i4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    walletFragmentStyle = (WalletFragmentStyle) C0259a.m1040a(parcel, readInt, WalletFragmentStyle.CREATOR);
                    break;
                case 5:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new WalletFragmentOptions(i4, i3, i2, walletFragmentStyle, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentOptions[i];
    }
}
