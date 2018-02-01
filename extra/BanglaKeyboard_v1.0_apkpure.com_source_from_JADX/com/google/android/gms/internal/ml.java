package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class ml implements Creator {
    static void m2619a(jp jpVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, jpVar.m2490a());
        C0261c.m1082b(parcel, 2, jpVar.f1860a);
        C0261c.m1073a(parcel, 3, jpVar.f1861b, false);
        C0261c.m1066a(parcel, 4, jpVar.f1862c);
        C0261c.m1073a(parcel, 5, jpVar.f1863d, false);
        C0261c.m1069a(parcel, 6, jpVar.f1864e);
        C0261c.m1082b(parcel, 7, jpVar.f1865f);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        double d = 0.0d;
        long j = 0;
        int i2 = -1;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    d = C0259a.m1052j(parcel, readInt);
                    break;
                case 5:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 7:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new jp(i3, i, str2, d, str, j, i2);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jp[i];
    }
}
