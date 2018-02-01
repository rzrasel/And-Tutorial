package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ih.C0390h;
import java.util.HashSet;
import java.util.Set;

public final class lu implements Creator {
    static void m2559a(C0390h c0390h, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = c0390h.m2358e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, c0390h.m2359f());
        }
        if (e.contains(Integer.valueOf(3))) {
            C0261c.m1082b(parcel, 3, C0390h.m2351h());
        }
        if (e.contains(Integer.valueOf(4))) {
            C0261c.m1073a(parcel, 4, c0390h.m2362j(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0261c.m1073a(parcel, 5, c0390h.m2360g(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0261c.m1082b(parcel, 6, c0390h.m2361i());
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 3:
                    C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str2 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0390h(hashSet, i2, str2, i, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0390h[i];
    }
}
