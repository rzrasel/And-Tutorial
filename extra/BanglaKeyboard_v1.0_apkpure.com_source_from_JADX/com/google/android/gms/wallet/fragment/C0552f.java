package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class C0552f implements Creator {
    static void m3812a(WalletFragmentInitParams walletFragmentInitParams, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, walletFragmentInitParams.f2495a);
        C0261c.m1073a(parcel, 2, walletFragmentInitParams.m3781a(), false);
        C0261c.m1072a(parcel, 3, walletFragmentInitParams.m3782b(), i, false);
        C0261c.m1082b(parcel, 4, walletFragmentInitParams.m3783c());
        C0261c.m1072a(parcel, 5, walletFragmentInitParams.m3784d(), i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        MaskedWallet maskedWallet = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        int i2 = -1;
        MaskedWalletRequest maskedWalletRequest = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    maskedWalletRequest = (MaskedWalletRequest) C0259a.m1040a(parcel, readInt, MaskedWalletRequest.CREATOR);
                    break;
                case 4:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    maskedWallet = (MaskedWallet) C0259a.m1040a(parcel, readInt, MaskedWallet.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new WalletFragmentInitParams(i, str, maskedWalletRequest, i2, maskedWallet);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentInitParams[i];
    }
}
