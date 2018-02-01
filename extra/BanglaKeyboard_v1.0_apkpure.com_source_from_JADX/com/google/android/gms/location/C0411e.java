package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0411e implements Creator {
    static void m2783a(C0408b c0408b, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, c0408b.f2039a);
        C0261c.m1082b(parcel, 1000, c0408b.m2780a());
        C0261c.m1082b(parcel, 2, c0408b.f2040b);
        C0261c.m1069a(parcel, 3, c0408b.f2041c);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 1;
        int a = C0259a.m1038a(parcel);
        int i2 = 0;
        long j = 0;
        int i3 = 1;
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
                    j = C0259a.m1049g(parcel, readInt);
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
            return new C0408b(i2, i3, i, j);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0408b[i];
    }
}
