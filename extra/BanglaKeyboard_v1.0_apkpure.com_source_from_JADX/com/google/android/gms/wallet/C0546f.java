package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class C0546f implements Creator {
    static void m3766a(FullWallet fullWallet, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, fullWallet.m3750a());
        C0261c.m1073a(parcel, 2, fullWallet.f2396a, false);
        C0261c.m1073a(parcel, 3, fullWallet.f2397b, false);
        C0261c.m1072a(parcel, 4, fullWallet.f2398c, i, false);
        C0261c.m1073a(parcel, 5, fullWallet.f2399d, false);
        C0261c.m1072a(parcel, 6, fullWallet.f2400e, i, false);
        C0261c.m1072a(parcel, 7, fullWallet.f2401f, i, false);
        C0261c.m1078a(parcel, 8, fullWallet.f2402g);
        C0261c.m1072a(parcel, 9, fullWallet.f2403h, i, false);
        C0261c.m1072a(parcel, 10, fullWallet.f2404i, i, false);
        C0261c.m1077a(parcel, 11, fullWallet.f2405j, i);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        InstrumentInfo[] instrumentInfoArr = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        String[] strArr = null;
        Address address = null;
        Address address2 = null;
        String str = null;
        ProxyCard proxyCard = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    proxyCard = (ProxyCard) C0259a.m1040a(parcel, readInt, ProxyCard.CREATOR);
                    break;
                case 5:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    address2 = (Address) C0259a.m1040a(parcel, readInt, Address.CREATOR);
                    break;
                case 7:
                    address = (Address) C0259a.m1040a(parcel, readInt, Address.CREATOR);
                    break;
                case 8:
                    strArr = C0259a.m1060r(parcel, readInt);
                    break;
                case 9:
                    userAddress2 = (UserAddress) C0259a.m1040a(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) C0259a.m1040a(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) C0259a.m1043b(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new FullWallet(i, str3, str2, proxyCard, str, address2, address, strArr, userAddress2, userAddress, instrumentInfoArr);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FullWallet[i];
    }
}
