package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0557i implements Creator {
    static void m3817a(LineItem lineItem, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, lineItem.m3755a());
        C0261c.m1073a(parcel, 2, lineItem.f2414a, false);
        C0261c.m1073a(parcel, 3, lineItem.f2415b, false);
        C0261c.m1073a(parcel, 4, lineItem.f2416c, false);
        C0261c.m1073a(parcel, 5, lineItem.f2417d, false);
        C0261c.m1082b(parcel, 6, lineItem.f2418e);
        C0261c.m1073a(parcel, 7, lineItem.f2419f, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a = C0259a.m1038a(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LineItem(i2, str5, str4, str3, str2, i, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LineItem[i];
    }
}
