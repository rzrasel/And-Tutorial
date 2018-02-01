package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class C0559k implements Creator {
    static void m3819a(MaskedWallet maskedWallet, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, maskedWallet.m3757a());
        C0261c.m1073a(parcel, 2, maskedWallet.f2444a, false);
        C0261c.m1073a(parcel, 3, maskedWallet.f2445b, false);
        C0261c.m1078a(parcel, 4, maskedWallet.f2446c);
        C0261c.m1073a(parcel, 5, maskedWallet.f2447d, false);
        C0261c.m1072a(parcel, 6, maskedWallet.f2448e, i, false);
        C0261c.m1072a(parcel, 7, maskedWallet.f2449f, i, false);
        C0261c.m1077a(parcel, 8, maskedWallet.f2450g, i);
        C0261c.m1077a(parcel, 9, maskedWallet.f2451h, i);
        C0261c.m1072a(parcel, 10, maskedWallet.f2452i, i, false);
        C0261c.m1072a(parcel, 11, maskedWallet.f2453j, i, false);
        C0261c.m1077a(parcel, 12, maskedWallet.f2454k, i);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
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
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    strArr = C0259a.m1060r(parcel, readInt);
                    break;
                case 5:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    address = (Address) C0259a.m1040a(parcel, readInt, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) C0259a.m1040a(parcel, readInt, Address.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) C0259a.m1043b(parcel, readInt, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) C0259a.m1043b(parcel, readInt, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) C0259a.m1040a(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) C0259a.m1040a(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 12:
                    instrumentInfoArr = (InstrumentInfo[]) C0259a.m1043b(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new MaskedWallet(i, str, str2, strArr, str3, address, address2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
