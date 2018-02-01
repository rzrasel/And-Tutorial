package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.ga.C0366a;

public final class jr implements Creator {
    static void m2491a(C0366a c0366a, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, c0366a.m2047a());
        C0261c.m1082b(parcel, 2, c0366a.m2050b());
        C0261c.m1075a(parcel, 3, c0366a.m2051c());
        C0261c.m1082b(parcel, 4, c0366a.m2052d());
        C0261c.m1075a(parcel, 5, c0366a.m2053e());
        C0261c.m1073a(parcel, 6, c0366a.m2054f(), false);
        C0261c.m1082b(parcel, 7, c0366a.m2055g());
        C0261c.m1073a(parcel, 8, c0366a.m2057i(), false);
        C0261c.m1072a(parcel, 9, c0366a.m2059k(), i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        fv fvVar = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 4:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 6:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 8:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 9:
                    fvVar = (fv) C0259a.m1040a(parcel, readInt, fv.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0366a(i4, i3, z2, i2, z, str2, i, str, fvVar);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0366a[i];
    }
}
