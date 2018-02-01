package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ih.C0380b;
import com.google.android.gms.internal.ih.C0380b.C0376a;
import com.google.android.gms.internal.ih.C0380b.C0378b;
import java.util.HashSet;
import java.util.Set;

public final class ln implements Creator {
    static void m2552a(C0380b c0380b, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = c0380b.m2296e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, c0380b.m2297f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0261c.m1072a(parcel, 2, c0380b.m2298g(), i, true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0261c.m1072a(parcel, 3, c0380b.m2299h(), i, true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0261c.m1082b(parcel, 4, c0380b.m2300i());
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C0378b c0378b = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        C0376a c0376a = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    C0376a c0376a2 = (C0376a) C0259a.m1040a(parcel, readInt, C0376a.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    c0376a = c0376a2;
                    break;
                case 3:
                    C0378b c0378b2 = (C0378b) C0259a.m1040a(parcel, readInt, C0378b.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    c0378b = c0378b2;
                    break;
                case 4:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0380b(hashSet, i2, c0376a, c0378b, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0380b[i];
    }
}
