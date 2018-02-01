package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ih.C0384d;
import java.util.HashSet;
import java.util.Set;

public final class lr implements Creator {
    static void m2556a(C0384d c0384d, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = c0384d.m2316e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, c0384d.m2317f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0261c.m1073a(parcel, 2, c0384d.m2318g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0261c.m1073a(parcel, 3, c0384d.m2319h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0261c.m1073a(parcel, 4, c0384d.m2320i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0261c.m1073a(parcel, 5, c0384d.m2321j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0261c.m1073a(parcel, 6, c0384d.m2322k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            C0261c.m1073a(parcel, 7, c0384d.m2323l(), true);
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str6 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str5 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str4 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str2 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(6));
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
            return new C0384d(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0384d[i];
    }
}
