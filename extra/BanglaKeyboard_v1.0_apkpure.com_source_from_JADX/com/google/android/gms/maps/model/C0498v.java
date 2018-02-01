package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0498v implements Creator {
    public static VisibleRegion m3567a(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    latLng4 = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    latLng3 = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    latLng2 = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    latLng = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C0259a.m1040a(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3568a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, visibleRegion.m3278a());
        C0261c.m1072a(parcel, 2, visibleRegion.f2211a, i, false);
        C0261c.m1072a(parcel, 3, visibleRegion.f2212b, i, false);
        C0261c.m1072a(parcel, 4, visibleRegion.f2213c, i, false);
        C0261c.m1072a(parcel, 5, visibleRegion.f2214d, i, false);
        C0261c.m1072a(parcel, 6, visibleRegion.f2215e, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0498v.m3567a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
