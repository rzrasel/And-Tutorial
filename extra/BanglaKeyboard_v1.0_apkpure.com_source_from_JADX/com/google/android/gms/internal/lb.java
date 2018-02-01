package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class lb implements Creator {
    static void m2530a(hd hdVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, hdVar.m2145f(), false);
        C0261c.m1082b(parcel, 1000, hdVar.m2140a());
        C0261c.m1069a(parcel, 2, hdVar.m2146g());
        short b = hdVar.m2141b();
        C0261c.m1068a(parcel, 3, 4);
        parcel.writeInt(b);
        C0261c.m1066a(parcel, 4, hdVar.m2142c());
        C0261c.m1066a(parcel, 5, hdVar.m2143d());
        C0261c.m1067a(parcel, 6, hdVar.m2144e());
        C0261c.m1082b(parcel, 7, hdVar.m2147h());
        C0261c.m1082b(parcel, 8, hdVar.m2148i());
        C0261c.m1082b(parcel, 9, hdVar.m2149j());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        short s = (short) 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 3:
                    C0259a.m1041a(parcel, readInt, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    d = C0259a.m1052j(parcel, readInt);
                    break;
                case 5:
                    d2 = C0259a.m1052j(parcel, readInt);
                    break;
                case 6:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                case 7:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 8:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 9:
                    i4 = C0259a.m1048f(parcel, readInt);
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
            return new hd(i, str, i2, s, d, d2, f, j, i3, i4);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new hd[i];
    }
}
