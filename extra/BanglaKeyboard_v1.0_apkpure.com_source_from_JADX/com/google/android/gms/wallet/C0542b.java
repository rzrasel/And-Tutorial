package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.ArrayList;

public final class C0542b implements Creator {
    static void m3762a(Cart cart, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, cart.m3748a());
        C0261c.m1073a(parcel, 2, cart.f2390a, false);
        C0261c.m1073a(parcel, 3, cart.f2391b, false);
        C0261c.m1083b(parcel, 4, cart.f2392c, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C0259a.m1038a(parcel);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    arrayList = C0259a.m1044c(parcel, readInt, LineItem.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new Cart(i, str2, str, arrayList);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Cart[i];
    }
}
