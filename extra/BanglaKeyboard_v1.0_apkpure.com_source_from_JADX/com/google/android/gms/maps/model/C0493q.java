package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0493q implements Creator {
    public static StreetViewPanoramaOrientation m3561a(Parcel parcel) {
        float f = 0.0f;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        float f2 = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    f2 = C0259a.m1051i(parcel, readInt);
                    break;
                case 3:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaOrientation(i, f2, f);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3562a(StreetViewPanoramaOrientation streetViewPanoramaOrientation, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, streetViewPanoramaOrientation.m3270a());
        C0261c.m1067a(parcel, 2, streetViewPanoramaOrientation.f2198a);
        C0261c.m1067a(parcel, 3, streetViewPanoramaOrientation.f2199b);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0493q.m3561a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
