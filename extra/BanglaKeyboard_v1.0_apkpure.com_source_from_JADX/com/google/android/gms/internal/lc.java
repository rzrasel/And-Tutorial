package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class lc implements Creator {
    static void m2531a(hg hgVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1083b(parcel, 1, hgVar.f1569b, false);
        C0261c.m1082b(parcel, 1000, hgVar.f1568a);
        C0261c.m1073a(parcel, 2, hgVar.m2152a(), false);
        C0261c.m1075a(parcel, 3, hgVar.m2153b());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    list = C0259a.m1044c(parcel, readInt, hm.CREATOR);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    z = C0259a.m1046d(parcel, readInt);
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
            return new hg(i, list, str, z);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new hg[i];
    }
}
