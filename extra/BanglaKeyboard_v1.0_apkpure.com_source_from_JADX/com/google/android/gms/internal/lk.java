package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.HashSet;
import java.util.Set;

public final class lk implements Creator {
    static void m2549a(ie ieVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = ieVar.m2251e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, ieVar.m2252f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0261c.m1073a(parcel, 2, ieVar.m2253g(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0261c.m1072a(parcel, 4, ieVar.m2254h(), i, true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0261c.m1073a(parcel, 5, ieVar.m2255i(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0261c.m1072a(parcel, 6, ieVar.m2256j(), i, true);
        }
        if (e.contains(Integer.valueOf(7))) {
            C0261c.m1073a(parcel, 7, ieVar.m2257k(), true);
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        ic icVar = null;
        String str2 = null;
        ic icVar2 = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            ic icVar3;
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str3 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 4:
                    icVar3 = (ic) C0259a.m1040a(parcel, readInt, ic.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    icVar2 = icVar3;
                    break;
                case 5:
                    str2 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    icVar3 = (ic) C0259a.m1040a(parcel, readInt, ic.CREATOR);
                    hashSet.add(Integer.valueOf(6));
                    icVar = icVar3;
                    break;
                case 7:
                    str = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(7));
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ie(hashSet, i, str3, icVar2, str2, icVar, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ie[i];
    }
}
