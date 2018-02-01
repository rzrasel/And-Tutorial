package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class mm implements Creator {
    static void m2620a(jo joVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, joVar.m2489a());
        C0261c.m1073a(parcel, 2, joVar.f1855a, false);
        C0261c.m1072a(parcel, 3, joVar.f1856b, i, false);
        C0261c.m1073a(parcel, 4, joVar.f1857c, false);
        C0261c.m1072a(parcel, 5, joVar.f1858d, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ju juVar = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        jp jpVar = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    jpVar = (jp) C0259a.m1040a(parcel, readInt, jp.CREATOR);
                    break;
                case 4:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    juVar = (ju) C0259a.m1040a(parcel, readInt, ju.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new jo(i, str2, jpVar, str, juVar);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jo[i];
    }
}
