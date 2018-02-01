package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0483g implements Creator {
    public static LatLngBounds m3546a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        LatLng latLng = null;
        int i = 0;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    latLng = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LatLngBounds(i, latLng, latLng2);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3547a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, latLngBounds.m3236a());
        C0261c.m1072a(parcel, 2, latLngBounds.f2153a, i, false);
        C0261c.m1072a(parcel, 3, latLngBounds.f2154b, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0483g.m3546a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
