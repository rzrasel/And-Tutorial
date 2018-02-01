package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class C0487k implements Creator {
    public static PolylineOptions m3554a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        List list = null;
        boolean z2 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    list = C0259a.m1044c(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f2 = C0259a.m1051i(parcel, readInt);
                    break;
                case 4:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                case 6:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 7:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PolylineOptions(i2, list, f2, i, f, z2, z);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3555a(PolylineOptions polylineOptions, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, polylineOptions.m3260a());
        C0261c.m1083b(parcel, 2, polylineOptions.m3261b(), false);
        C0261c.m1067a(parcel, 3, polylineOptions.m3262c());
        C0261c.m1082b(parcel, 4, polylineOptions.m3263d());
        C0261c.m1067a(parcel, 5, polylineOptions.m3264e());
        C0261c.m1075a(parcel, 6, polylineOptions.m3265f());
        C0261c.m1075a(parcel, 7, polylineOptions.m3266g());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0487k.m3554a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
