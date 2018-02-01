package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0480d implements Creator {
    public static CameraPosition m3540a(Parcel parcel) {
        float f = 0.0f;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
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
                    f3 = C0259a.m1051i(parcel, readInt);
                    break;
                case 4:
                    f2 = C0259a.m1051i(parcel, readInt);
                    break;
                case 5:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CameraPosition(i, latLng, f3, f2, f);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3541a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, cameraPosition.m3214a());
        C0261c.m1072a(parcel, 2, cameraPosition.f2125a, i, false);
        C0261c.m1067a(parcel, 3, cameraPosition.f2126b);
        C0261c.m1067a(parcel, 4, cameraPosition.f2127c);
        C0261c.m1067a(parcel, 5, cameraPosition.f2128d);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0480d.m3540a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
