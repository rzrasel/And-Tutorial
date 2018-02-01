package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class le implements Creator {
    static void m2533a(hk hkVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1000, hkVar.f1579b);
        C0261c.m1072a(parcel, 2, hkVar.m2158a(), i, false);
        C0261c.m1069a(parcel, 3, hkVar.m2159b());
        C0261c.m1082b(parcel, 4, hkVar.m2160c());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        hg hgVar = null;
        long j = hk.f1578a;
        int i2 = 102;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 2:
                    hgVar = (hg) C0259a.m1040a(parcel, readInt, hg.CREATOR);
                    break;
                case 3:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 4:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 1000:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new hk(i, hgVar, j, i2);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new hk[i];
    }
}
