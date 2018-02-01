package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0481e implements Creator {
    public static CircleOptions m3542a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    latLng = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = C0259a.m1052j(parcel, readInt);
                    break;
                case 4:
                    f2 = C0259a.m1051i(parcel, readInt);
                    break;
                case 5:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 6:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                case 8:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3543a(CircleOptions circleOptions, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, circleOptions.m3215a());
        C0261c.m1072a(parcel, 2, circleOptions.m3216b(), i, false);
        C0261c.m1066a(parcel, 3, circleOptions.m3217c());
        C0261c.m1067a(parcel, 4, circleOptions.m3218d());
        C0261c.m1082b(parcel, 5, circleOptions.m3219e());
        C0261c.m1082b(parcel, 6, circleOptions.m3220f());
        C0261c.m1067a(parcel, 7, circleOptions.m3221g());
        C0261c.m1075a(parcel, 8, circleOptions.m3222h());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0481e.m3542a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
