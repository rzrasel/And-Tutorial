package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0541a implements Creator {
    static void m3761a(Address address, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, address.m3747a());
        C0261c.m1073a(parcel, 2, address.f2378a, false);
        C0261c.m1073a(parcel, 3, address.f2379b, false);
        C0261c.m1073a(parcel, 4, address.f2380c, false);
        C0261c.m1073a(parcel, 5, address.f2381d, false);
        C0261c.m1073a(parcel, 6, address.f2382e, false);
        C0261c.m1073a(parcel, 7, address.f2383f, false);
        C0261c.m1073a(parcel, 8, address.f2384g, false);
        C0261c.m1073a(parcel, 9, address.f2385h, false);
        C0261c.m1073a(parcel, 10, address.f2386i, false);
        C0261c.m1075a(parcel, 11, address.f2387j);
        C0261c.m1073a(parcel, 12, address.f2388k, false);
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
        boolean z = false;
        String str10 = null;
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
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 12:
                    str10 = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new Address(i, str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Address[i];
    }
}
