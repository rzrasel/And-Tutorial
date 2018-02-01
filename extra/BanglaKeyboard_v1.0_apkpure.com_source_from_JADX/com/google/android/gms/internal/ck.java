package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class ck implements Creator {
    static void m1788a(cb cbVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, cbVar.f1092a);
        C0261c.m1073a(parcel, 2, cbVar.f1093b, false);
        C0261c.m1073a(parcel, 3, cbVar.f1094c, false);
        C0261c.m1073a(parcel, 4, cbVar.f1095d, false);
        C0261c.m1073a(parcel, 5, cbVar.f1096e, false);
        C0261c.m1073a(parcel, 6, cbVar.f1097f, false);
        C0261c.m1073a(parcel, 7, cbVar.f1098g, false);
        C0261c.m1073a(parcel, 8, cbVar.f1099h, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str7 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str6 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 8:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new cb(i, str7, str6, str5, str4, str3, str2, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cb[i];
    }
}
