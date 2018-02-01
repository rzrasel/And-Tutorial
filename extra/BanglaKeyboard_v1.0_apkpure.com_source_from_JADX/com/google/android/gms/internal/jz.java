package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class jz implements Creator {
    static void m2499a(gg ggVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, ggVar.m2106a());
        Parcel e = ggVar.m2110e();
        if (e != null) {
            int a2 = C0261c.m1064a(parcel, 2);
            parcel.appendFrom(e, 0, e.dataSize());
            C0261c.m1081b(parcel, a2);
        }
        C0261c.m1072a(parcel, 3, ggVar.m2111f(), i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        gd gdVar = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    parcel2 = C0259a.m1062t(parcel, readInt);
                    break;
                case 3:
                    gdVar = (gd) C0259a.m1040a(parcel, readInt, gd.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new gg(i, parcel2, gdVar);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new gg[i];
    }
}
