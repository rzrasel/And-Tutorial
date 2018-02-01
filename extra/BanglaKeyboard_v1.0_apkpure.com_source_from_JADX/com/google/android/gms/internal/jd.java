package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.internal.fc.C0363a;
import java.util.List;

public final class jd implements Creator {
    static void m2472a(C0363a c0363a, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, c0363a.m1964a(), false);
        C0261c.m1082b(parcel, 1000, c0363a.m1968e());
        C0261c.m1074a(parcel, 2, c0363a.m1967d(), false);
        C0261c.m1082b(parcel, 3, c0363a.m1965b());
        C0261c.m1073a(parcel, 4, c0363a.m1966c(), false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a = C0259a.m1038a(parcel);
        List list = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    list = C0259a.m1061s(parcel, readInt);
                    break;
                case 3:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 1000:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C0363a(i2, str2, list, i, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0363a[i];
    }
}
