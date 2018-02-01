package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ih.C0386f;
import java.util.HashSet;
import java.util.Set;

public final class ls implements Creator {
    static void m2557a(C0386f c0386f, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = c0386f.m2330e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, c0386f.m2331f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0261c.m1073a(parcel, 2, c0386f.m2332g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0261c.m1073a(parcel, 3, c0386f.m2333h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0261c.m1073a(parcel, 4, c0386f.m2334i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0261c.m1073a(parcel, 5, c0386f.m2335j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0261c.m1073a(parcel, 6, c0386f.m2336k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            C0261c.m1075a(parcel, 7, c0386f.m2337l());
        }
        if (e.contains(Integer.valueOf(8))) {
            C0261c.m1073a(parcel, 8, c0386f.m2338m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            C0261c.m1073a(parcel, 9, c0386f.m2339n(), true);
        }
        if (e.contains(Integer.valueOf(10))) {
            C0261c.m1082b(parcel, 10, c0386f.m2340o());
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str7 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str6 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str5 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str4 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str3 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    z = C0259a.m1046d(parcel, readInt);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case 8:
                    str2 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 10:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(10));
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0386f(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0386f[i];
    }
}
