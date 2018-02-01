package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class C0445h implements Creator {
    public static StreetViewPanoramaOptions m3173a(Parcel parcel) {
        byte b = (byte) 0;
        int a = C0259a.m1038a(parcel);
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        Integer num = null;
        LatLng latLng = null;
        String str = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C0259a.m1040a(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    Integer num2;
                    readInt = C0259a.m1039a(parcel, readInt);
                    if (readInt == 0) {
                        num2 = null;
                    } else {
                        C0259a.m1045c(parcel, readInt);
                        num2 = Integer.valueOf(parcel.readInt());
                    }
                    num = num2;
                    break;
                case 6:
                    b5 = C0259a.m1047e(parcel, readInt);
                    break;
                case 7:
                    b4 = C0259a.m1047e(parcel, readInt);
                    break;
                case 8:
                    b3 = C0259a.m1047e(parcel, readInt);
                    break;
                case 9:
                    b2 = C0259a.m1047e(parcel, readInt);
                    break;
                case 10:
                    b = C0259a.m1047e(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaOptions(i, streetViewPanoramaCamera, str, latLng, num, b5, b4, b3, b2, b);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3174a(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, streetViewPanoramaOptions.m2796a());
        C0261c.m1072a(parcel, 2, streetViewPanoramaOptions.m2802g(), i, false);
        C0261c.m1073a(parcel, 3, streetViewPanoramaOptions.m2805j(), false);
        C0261c.m1072a(parcel, 4, streetViewPanoramaOptions.m2803h(), i, false);
        Integer i2 = streetViewPanoramaOptions.m2804i();
        if (i2 != null) {
            C0261c.m1068a(parcel, 5, 4);
            parcel.writeInt(i2.intValue());
        }
        C0261c.m1065a(parcel, 6, streetViewPanoramaOptions.m2797b());
        C0261c.m1065a(parcel, 7, streetViewPanoramaOptions.m2798c());
        C0261c.m1065a(parcel, 8, streetViewPanoramaOptions.m2799d());
        C0261c.m1065a(parcel, 9, streetViewPanoramaOptions.m2800e());
        C0261c.m1065a(parcel, 10, streetViewPanoramaOptions.m2801f());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0445h.m3173a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
