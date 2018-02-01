package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0352b implements Creator {
    static void m1610a(UserAddress userAddress, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, userAddress.m1608a());
        C0261c.m1073a(parcel, 2, userAddress.f860a, false);
        C0261c.m1073a(parcel, 3, userAddress.f861b, false);
        C0261c.m1073a(parcel, 4, userAddress.f862c, false);
        C0261c.m1073a(parcel, 5, userAddress.f863d, false);
        C0261c.m1073a(parcel, 6, userAddress.f864e, false);
        C0261c.m1073a(parcel, 7, userAddress.f865f, false);
        C0261c.m1073a(parcel, 8, userAddress.f866g, false);
        C0261c.m1073a(parcel, 9, userAddress.f867h, false);
        C0261c.m1073a(parcel, 10, userAddress.f868i, false);
        C0261c.m1073a(parcel, 11, userAddress.f869j, false);
        C0261c.m1073a(parcel, 12, userAddress.f870k, false);
        C0261c.m1073a(parcel, 13, userAddress.f871l, false);
        C0261c.m1075a(parcel, 14, userAddress.f872m);
        C0261c.m1073a(parcel, 15, userAddress.f873n, false);
        C0261c.m1073a(parcel, 16, userAddress.f874o, false);
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
        String str11 = null;
        String str12 = null;
        boolean z = false;
        String str13 = null;
        String str14 = null;
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
                    str11 = C0259a.m1054l(parcel, readInt);
                    break;
                case 13:
                    str12 = C0259a.m1054l(parcel, readInt);
                    break;
                case 14:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 15:
                    str13 = C0259a.m1054l(parcel, readInt);
                    break;
                case 16:
                    str14 = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new UserAddress(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAddress[i];
    }
}
