package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ih.C0374a;
import java.util.HashSet;
import java.util.Set;

public final class lm implements Creator {
    static void m2551a(C0374a c0374a, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        Set e = c0374a.m2265e();
        if (e.contains(Integer.valueOf(1))) {
            C0261c.m1082b(parcel, 1, c0374a.m2266f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0261c.m1082b(parcel, 2, c0374a.m2267g());
        }
        if (e.contains(Integer.valueOf(3))) {
            C0261c.m1082b(parcel, 3, c0374a.m2268h());
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C0259a.m1038a(parcel);
        Set hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i3 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    i2 = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i = C0259a.m1048f(parcel, readInt);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0374a(hashSet, i3, i2, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0374a[i];
    }
}
