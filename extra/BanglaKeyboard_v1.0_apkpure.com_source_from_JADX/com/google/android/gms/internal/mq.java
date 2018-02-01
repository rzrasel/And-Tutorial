package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class mq implements Creator {
    static void m2624a(jy jyVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, jyVar.m2498a());
        C0261c.m1073a(parcel, 2, jyVar.f1876a, false);
        C0261c.m1073a(parcel, 3, jyVar.f1877b, false);
        C0261c.m1072a(parcel, 4, jyVar.f1878c, i, false);
        C0261c.m1072a(parcel, 5, jyVar.f1879d, i, false);
        C0261c.m1072a(parcel, 6, jyVar.f1880e, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        jw jwVar = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        jw jwVar2 = null;
        ju juVar = null;
        String str = null;
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
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    juVar = (ju) C0259a.m1040a(parcel, readInt, ju.CREATOR);
                    break;
                case 5:
                    jwVar2 = (jw) C0259a.m1040a(parcel, readInt, jw.CREATOR);
                    break;
                case 6:
                    jwVar = (jw) C0259a.m1040a(parcel, readInt, jw.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new jy(i, str2, str, juVar, jwVar2, jwVar);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jy[i];
    }
}
