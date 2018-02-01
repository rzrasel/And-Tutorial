package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class em implements Creator {
    public static cz m1938a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
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
                    list = C0259a.m1061s(parcel, readInt);
                    break;
                case 5:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 6:
                    list2 = C0259a.m1061s(parcel, readInt);
                    break;
                case 7:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 8:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 9:
                    j2 = C0259a.m1049g(parcel, readInt);
                    break;
                case 10:
                    list3 = C0259a.m1061s(parcel, readInt);
                    break;
                case 11:
                    j3 = C0259a.m1049g(parcel, readInt);
                    break;
                case 12:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 13:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 14:
                    j4 = C0259a.m1049g(parcel, readInt);
                    break;
                case 15:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 18:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 19:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 21:
                    str6 = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new cz(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m1939a(cz czVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, czVar.f1170a);
        C0261c.m1073a(parcel, 2, czVar.f1171b, false);
        C0261c.m1073a(parcel, 3, czVar.f1172c, false);
        C0261c.m1074a(parcel, 4, czVar.f1173d, false);
        C0261c.m1082b(parcel, 5, czVar.f1174e);
        C0261c.m1074a(parcel, 6, czVar.f1175f, false);
        C0261c.m1069a(parcel, 7, czVar.f1176g);
        C0261c.m1075a(parcel, 8, czVar.f1177h);
        C0261c.m1069a(parcel, 9, czVar.f1178i);
        C0261c.m1074a(parcel, 10, czVar.f1179j, false);
        C0261c.m1069a(parcel, 11, czVar.f1180k);
        C0261c.m1082b(parcel, 12, czVar.f1181l);
        C0261c.m1073a(parcel, 13, czVar.f1182m, false);
        C0261c.m1069a(parcel, 14, czVar.f1183n);
        C0261c.m1073a(parcel, 15, czVar.f1184o, false);
        C0261c.m1073a(parcel, 19, czVar.f1186q, false);
        C0261c.m1075a(parcel, 18, czVar.f1185p);
        C0261c.m1073a(parcel, 21, czVar.f1187r, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m1938a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cz[i];
    }
}
