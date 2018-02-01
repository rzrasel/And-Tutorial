package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0491o implements Creator {
    public static StreetViewPanoramaLocation m3559a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        LatLng latLng = null;
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C0259a.m1043b(parcel, readInt, StreetViewPanoramaLink.CREATOR);
                    break;
                case 3:
                    latLng = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaLocation(i, streetViewPanoramaLinkArr, latLng, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3560a(StreetViewPanoramaLocation streetViewPanoramaLocation, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, streetViewPanoramaLocation.m3269a());
        C0261c.m1077a(parcel, 2, streetViewPanoramaLocation.f2194a, i);
        C0261c.m1072a(parcel, 3, streetViewPanoramaLocation.f2195b, i, false);
        C0261c.m1073a(parcel, 4, streetViewPanoramaLocation.f2196c, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0491o.m3559a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
