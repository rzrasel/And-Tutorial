package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0489m implements Creator {
    public static StreetViewPanoramaCamera m3556a(Parcel parcel) {
        float f = 0.0f;
        int a = C0259a.m1038a(parcel);
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
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
                    f3 = C0259a.m1051i(parcel, readInt);
                    break;
                case 4:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaCamera(i, f2, f3, f);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3557a(StreetViewPanoramaCamera streetViewPanoramaCamera, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, streetViewPanoramaCamera.m3267a());
        C0261c.m1067a(parcel, 2, streetViewPanoramaCamera.f2186a);
        C0261c.m1067a(parcel, 3, streetViewPanoramaCamera.f2187b);
        C0261c.m1067a(parcel, 4, streetViewPanoramaCamera.f2188c);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0489m.m3556a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
