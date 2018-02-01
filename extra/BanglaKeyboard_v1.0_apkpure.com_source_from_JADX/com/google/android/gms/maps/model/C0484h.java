package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0484h implements Creator {
    public static LatLng m3548a(Parcel parcel) {
        double d = 0.0d;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        double d2 = 0.0d;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    d2 = C0259a.m1052j(parcel, readInt);
                    break;
                case 3:
                    d = C0259a.m1052j(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LatLng(i, d2, d);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3549a(LatLng latLng, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, latLng.m3235a());
        C0261c.m1066a(parcel, 2, latLng.f2150a);
        C0261c.m1066a(parcel, 3, latLng.f2151b);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0484h.m3548a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
