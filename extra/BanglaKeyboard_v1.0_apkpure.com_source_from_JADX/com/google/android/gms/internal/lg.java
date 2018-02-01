package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public final class lg implements Creator {
    static void m2535a(ho hoVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, hoVar.m2164a(), false);
        C0261c.m1082b(parcel, 1000, hoVar.f1637a);
        C0261c.m1072a(parcel, 2, hoVar.m2165b(), i, false);
        C0261c.m1073a(parcel, 3, hoVar.m2166c(), false);
        C0261c.m1083b(parcel, 4, hoVar.m2167d(), false);
        C0261c.m1073a(parcel, 5, hoVar.m2168e(), false);
        C0261c.m1073a(parcel, 6, hoVar.m2169f(), false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str2 = null;
        List list = null;
        String str3 = null;
        LatLng latLng = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    latLng = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    list = C0259a.m1044c(parcel, readInt, hm.CREATOR);
                    break;
                case 5:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    str = C0259a.m1054l(parcel, readInt);
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
            return new ho(i, str4, latLng, str3, list, str2, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ho[i];
    }
}
