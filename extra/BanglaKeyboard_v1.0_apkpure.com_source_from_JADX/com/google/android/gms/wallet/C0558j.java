package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.js;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.jy;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public final class C0558j implements Creator {
    static void m3818a(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, loyaltyWalletObject.m3756a());
        C0261c.m1073a(parcel, 2, loyaltyWalletObject.f2421a, false);
        C0261c.m1073a(parcel, 3, loyaltyWalletObject.f2422b, false);
        C0261c.m1073a(parcel, 4, loyaltyWalletObject.f2423c, false);
        C0261c.m1073a(parcel, 5, loyaltyWalletObject.f2424d, false);
        C0261c.m1073a(parcel, 6, loyaltyWalletObject.f2425e, false);
        C0261c.m1073a(parcel, 7, loyaltyWalletObject.f2426f, false);
        C0261c.m1073a(parcel, 8, loyaltyWalletObject.f2427g, false);
        C0261c.m1073a(parcel, 9, loyaltyWalletObject.f2428h, false);
        C0261c.m1073a(parcel, 10, loyaltyWalletObject.f2429i, false);
        C0261c.m1073a(parcel, 11, loyaltyWalletObject.f2430j, false);
        C0261c.m1082b(parcel, 12, loyaltyWalletObject.f2431k);
        C0261c.m1083b(parcel, 13, loyaltyWalletObject.f2432l, false);
        C0261c.m1072a(parcel, 14, loyaltyWalletObject.f2433m, i, false);
        C0261c.m1083b(parcel, 15, loyaltyWalletObject.f2434n, false);
        C0261c.m1073a(parcel, 17, loyaltyWalletObject.f2436p, false);
        C0261c.m1073a(parcel, 16, loyaltyWalletObject.f2435o, false);
        C0261c.m1075a(parcel, 19, loyaltyWalletObject.f2438r);
        C0261c.m1083b(parcel, 18, loyaltyWalletObject.f2437q, false);
        C0261c.m1083b(parcel, 21, loyaltyWalletObject.f2440t, false);
        C0261c.m1083b(parcel, 20, loyaltyWalletObject.f2439s, false);
        C0261c.m1072a(parcel, 23, loyaltyWalletObject.f2442v, i, false);
        C0261c.m1083b(parcel, 22, loyaltyWalletObject.f2441u, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        ju juVar = null;
        ArrayList arrayList2 = new ArrayList();
        String str11 = null;
        String str12 = null;
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        jo joVar = null;
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
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    str6 = C0259a.m1054l(parcel, readInt);
                    break;
                case 8:
                    str7 = C0259a.m1054l(parcel, readInt);
                    break;
                case 9:
                    str8 = C0259a.m1054l(parcel, readInt);
                    break;
                case 10:
                    str9 = C0259a.m1054l(parcel, readInt);
                    break;
                case 11:
                    str10 = C0259a.m1054l(parcel, readInt);
                    break;
                case 12:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 13:
                    arrayList = C0259a.m1044c(parcel, readInt, jy.CREATOR);
                    break;
                case 14:
                    juVar = (ju) C0259a.m1040a(parcel, readInt, ju.CREATOR);
                    break;
                case 15:
                    arrayList2 = C0259a.m1044c(parcel, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = C0259a.m1054l(parcel, readInt);
                    break;
                case 17:
                    str12 = C0259a.m1054l(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = C0259a.m1044c(parcel, readInt, jm.CREATOR);
                    break;
                case 19:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 20:
                    arrayList4 = C0259a.m1044c(parcel, readInt, jw.CREATOR);
                    break;
                case 21:
                    arrayList5 = C0259a.m1044c(parcel, readInt, js.CREATOR);
                    break;
                case 22:
                    arrayList6 = C0259a.m1044c(parcel, readInt, jw.CREATOR);
                    break;
                case 23:
                    joVar = (jo) C0259a.m1040a(parcel, readInt, jo.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LoyaltyWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i2, arrayList, juVar, arrayList2, str11, str12, arrayList3, z, arrayList4, arrayList5, arrayList6, joVar);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
