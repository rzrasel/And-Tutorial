package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

public final class C0560l implements Creator {
    static void m3820a(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, maskedWalletRequest.m3758a());
        C0261c.m1073a(parcel, 2, maskedWalletRequest.f2456a, false);
        C0261c.m1075a(parcel, 3, maskedWalletRequest.f2457b);
        C0261c.m1075a(parcel, 4, maskedWalletRequest.f2458c);
        C0261c.m1075a(parcel, 5, maskedWalletRequest.f2459d);
        C0261c.m1073a(parcel, 6, maskedWalletRequest.f2460e, false);
        C0261c.m1073a(parcel, 7, maskedWalletRequest.f2461f, false);
        C0261c.m1073a(parcel, 8, maskedWalletRequest.f2462g, false);
        C0261c.m1072a(parcel, 9, maskedWalletRequest.f2463h, i, false);
        C0261c.m1075a(parcel, 10, maskedWalletRequest.f2464i);
        C0261c.m1075a(parcel, 11, maskedWalletRequest.f2465j);
        C0261c.m1077a(parcel, 12, maskedWalletRequest.f2466k, i);
        C0261c.m1075a(parcel, 13, maskedWalletRequest.f2467l);
        C0261c.m1075a(parcel, 14, maskedWalletRequest.f2468m);
        C0261c.m1083b(parcel, 15, maskedWalletRequest.f2469n, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        boolean z4 = false;
        boolean z5 = false;
        CountrySpecification[] countrySpecificationArr = null;
        boolean z6 = true;
        boolean z7 = true;
        ArrayList arrayList = null;
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
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 4:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 5:
                    z3 = C0259a.m1046d(parcel, readInt);
                    break;
                case 6:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 8:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 9:
                    cart = (Cart) C0259a.m1040a(parcel, readInt, Cart.CREATOR);
                    break;
                case 10:
                    z4 = C0259a.m1046d(parcel, readInt);
                    break;
                case 11:
                    z5 = C0259a.m1046d(parcel, readInt);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) C0259a.m1043b(parcel, readInt, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z6 = C0259a.m1046d(parcel, readInt);
                    break;
                case 14:
                    z7 = C0259a.m1046d(parcel, readInt);
                    break;
                case 15:
                    arrayList = C0259a.m1044c(parcel, readInt, CountrySpecification.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new MaskedWalletRequest(i, str, z, z2, z3, str2, str3, str4, cart, z4, z5, countrySpecificationArr, z6, z7, arrayList);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
