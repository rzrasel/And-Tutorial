package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ih.C0388g;
import java.util.HashSet;
import java.util.Set;

public final class lt implements Creator {
    static void m2558a(C0388g c0388g, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = c0388g.m2347e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, c0388g.m2348f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0261c.m1075a(parcel, 2, c0388g.m2349g());
        }
        if (e.contains(Integer.valueOf(3))) {
            C0261c.m1073a(parcel, 3, c0388g.m2350h(), true);
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    z = C0259a.m1046d(parcel, readInt);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0388g(hashSet, i, z, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0388g[i];
    }
}
