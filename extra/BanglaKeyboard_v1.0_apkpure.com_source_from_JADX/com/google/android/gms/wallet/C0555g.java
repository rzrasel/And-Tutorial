package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0555g implements Creator {
    static void m3815a(FullWalletRequest fullWalletRequest, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, fullWalletRequest.m3751a());
        C0261c.m1073a(parcel, 2, fullWalletRequest.f2407a, false);
        C0261c.m1073a(parcel, 3, fullWalletRequest.f2408b, false);
        C0261c.m1072a(parcel, 4, fullWalletRequest.f2409c, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Cart cart = null;
        int a = C0259a.m1038a(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
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
                    cart = (Cart) C0259a.m1040a(parcel, readInt, Cart.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new FullWalletRequest(i, str, str2, cart);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FullWalletRequest[i];
    }
}
