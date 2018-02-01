package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class aj implements Creator {
    static void m1640a(av avVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, avVar.f1008a);
        C0261c.m1082b(parcel, 2, avVar.f1009b);
        C0261c.m1082b(parcel, 3, avVar.f1010c);
        C0261c.m1082b(parcel, 4, avVar.f1011d);
        C0261c.m1082b(parcel, 5, avVar.f1012e);
        C0261c.m1082b(parcel, 6, avVar.f1013f);
        C0261c.m1082b(parcel, 7, avVar.f1014g);
        C0261c.m1082b(parcel, 8, avVar.f1015h);
        C0261c.m1082b(parcel, 9, avVar.f1016i);
        C0261c.m1073a(parcel, 10, avVar.f1017j, false);
        C0261c.m1082b(parcel, 11, avVar.f1018k);
        C0261c.m1073a(parcel, 12, avVar.f1019l, false);
        C0261c.m1082b(parcel, 13, avVar.f1020m);
        C0261c.m1082b(parcel, 14, avVar.f1021n);
        C0261c.m1073a(parcel, 15, avVar.f1022o, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    i5 = C0259a.m1048f(parcel, readInt);
                    break;
                case 6:
                    i6 = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    i7 = C0259a.m1048f(parcel, readInt);
                    break;
                case 8:
                    i8 = C0259a.m1048f(parcel, readInt);
                    break;
                case 9:
                    i9 = C0259a.m1048f(parcel, readInt);
                    break;
                case 10:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 11:
                    i10 = C0259a.m1048f(parcel, readInt);
                    break;
                case 12:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 13:
                    i11 = C0259a.m1048f(parcel, readInt);
                    break;
                case 14:
                    i12 = C0259a.m1048f(parcel, readInt);
                    break;
                case 15:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new av(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new av[i];
    }
}
