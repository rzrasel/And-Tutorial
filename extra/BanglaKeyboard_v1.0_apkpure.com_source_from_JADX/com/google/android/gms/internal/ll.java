package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ih.C0374a;
import com.google.android.gms.internal.ih.C0380b;
import com.google.android.gms.internal.ih.C0382c;
import com.google.android.gms.internal.ih.C0384d;
import com.google.android.gms.internal.ih.C0386f;
import com.google.android.gms.internal.ih.C0388g;
import com.google.android.gms.internal.ih.C0390h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ll implements Creator {
    static void m2550a(ih ihVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = ihVar.m2373e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, ihVar.m2374f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0261c.m1073a(parcel, 2, ihVar.m2375g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0261c.m1072a(parcel, 3, ihVar.m2376h(), i, true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0261c.m1073a(parcel, 4, ihVar.m2377i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0261c.m1073a(parcel, 5, ihVar.m2378j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0261c.m1082b(parcel, 6, ihVar.m2379k());
        }
        if (e.contains(Integer.valueOf(7))) {
            C0261c.m1072a(parcel, 7, ihVar.m2380l(), i, true);
        }
        if (e.contains(Integer.valueOf(8))) {
            C0261c.m1073a(parcel, 8, ihVar.m2381m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            C0261c.m1073a(parcel, 9, ihVar.m2382n(), true);
        }
        if (e.contains(Integer.valueOf(12))) {
            C0261c.m1082b(parcel, 12, ihVar.m2383o());
        }
        if (e.contains(Integer.valueOf(14))) {
            C0261c.m1073a(parcel, 14, ihVar.m2384p(), true);
        }
        if (e.contains(Integer.valueOf(15))) {
            C0261c.m1072a(parcel, 15, ihVar.m2385q(), i, true);
        }
        if (e.contains(Integer.valueOf(16))) {
            C0261c.m1075a(parcel, 16, ihVar.m2386r());
        }
        if (e.contains(Integer.valueOf(19))) {
            C0261c.m1072a(parcel, 19, ihVar.m2388t(), i, true);
        }
        if (e.contains(Integer.valueOf(18))) {
            C0261c.m1073a(parcel, 18, ihVar.m2387s(), true);
        }
        if (e.contains(Integer.valueOf(21))) {
            C0261c.m1082b(parcel, 21, ihVar.m2390v());
        }
        if (e.contains(Integer.valueOf(20))) {
            C0261c.m1073a(parcel, 20, ihVar.m2389u(), true);
        }
        if (e.contains(Integer.valueOf(23))) {
            C0261c.m1083b(parcel, 23, ihVar.m2392x(), true);
        }
        if (e.contains(Integer.valueOf(22))) {
            C0261c.m1083b(parcel, 22, ihVar.m2391w(), true);
        }
        if (e.contains(Integer.valueOf(25))) {
            C0261c.m1082b(parcel, 25, ihVar.m2394z());
        }
        if (e.contains(Integer.valueOf(24))) {
            C0261c.m1082b(parcel, 24, ihVar.m2393y());
        }
        if (e.contains(Integer.valueOf(27))) {
            C0261c.m1073a(parcel, 27, ihVar.m2364B(), true);
        }
        if (e.contains(Integer.valueOf(26))) {
            C0261c.m1073a(parcel, 26, ihVar.m2363A(), true);
        }
        if (e.contains(Integer.valueOf(29))) {
            C0261c.m1075a(parcel, 29, ihVar.m2366D());
        }
        if (e.contains(Integer.valueOf(28))) {
            C0261c.m1083b(parcel, 28, ihVar.m2365C(), true);
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str = null;
        C0374a c0374a = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        C0380b c0380b = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        C0382c c0382c = null;
        boolean z = false;
        String str7 = null;
        C0384d c0384d = null;
        String str8 = null;
        int i4 = 0;
        List list = null;
        List list2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        List list3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    C0374a c0374a2 = (C0374a) C0259a.m1040a(parcel, readInt, C0374a.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    c0374a = c0374a2;
                    break;
                case 4:
                    str2 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i2 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    C0380b c0380b2 = (C0380b) C0259a.m1040a(parcel, readInt, C0380b.CREATOR);
                    hashSet.add(Integer.valueOf(7));
                    c0380b = c0380b2;
                    break;
                case 8:
                    str4 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str5 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 12:
                    i3 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case 14:
                    str6 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    C0382c c0382c2 = (C0382c) C0259a.m1040a(parcel, readInt, C0382c.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    c0382c = c0382c2;
                    break;
                case 16:
                    z = C0259a.m1046d(parcel, readInt);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 18:
                    str7 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case 19:
                    C0384d c0384d2 = (C0384d) C0259a.m1040a(parcel, readInt, (Creator) C0384d.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    c0384d = c0384d2;
                    break;
                case 20:
                    str8 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    i4 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    list = C0259a.m1044c(parcel, readInt, C0386f.CREATOR);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    list2 = C0259a.m1044c(parcel, readInt, C0388g.CREATOR);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    i5 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    i6 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str9 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str10 = C0259a.m1054l(parcel, readInt);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    list3 = C0259a.m1044c(parcel, readInt, C0390h.CREATOR);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    z2 = C0259a.m1046d(parcel, readInt);
                    hashSet.add(Integer.valueOf(29));
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ih(hashSet, i, str, c0374a, str2, str3, i2, c0380b, str4, str5, i3, str6, c0382c, z, str7, c0384d, str8, i4, list, list2, i5, i6, str9, str10, list3, z2);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ih[i];
    }
}
