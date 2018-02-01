package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ga.C0366a;
import com.google.android.gms.internal.gd.C0368b;

public final class jt implements Creator {
    static void m2493a(C0368b c0368b, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, c0368b.f1450a);
        C0261c.m1073a(parcel, 2, c0368b.f1451b, false);
        C0261c.m1072a(parcel, 3, c0368b.f1452c, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C0366a c0366a = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    c0366a = (C0366a) C0259a.m1040a(parcel, readInt, C0366a.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0368b(i, str, c0366a);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0368b[i];
    }
}
