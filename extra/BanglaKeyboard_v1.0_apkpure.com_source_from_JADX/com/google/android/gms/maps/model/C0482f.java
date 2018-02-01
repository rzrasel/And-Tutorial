package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0482f implements Creator {
    public static GroundOverlayOptions m3544a(Parcel parcel) {
        boolean z = false;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        int a = C0259a.m1038a(parcel);
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        LatLng latLng = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    iBinder = C0259a.m1055m(parcel, readInt);
                    break;
                case 3:
                    latLng = (LatLng) C0259a.m1040a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f7 = C0259a.m1051i(parcel, readInt);
                    break;
                case 5:
                    f6 = C0259a.m1051i(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C0259a.m1040a(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f5 = C0259a.m1051i(parcel, readInt);
                    break;
                case 8:
                    f4 = C0259a.m1051i(parcel, readInt);
                    break;
                case 9:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 10:
                    f3 = C0259a.m1051i(parcel, readInt);
                    break;
                case 11:
                    f2 = C0259a.m1051i(parcel, readInt);
                    break;
                case 12:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GroundOverlayOptions(i, iBinder, latLng, f7, f6, latLngBounds, f5, f4, z, f3, f2, f);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3545a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, groundOverlayOptions.m3224b());
        C0261c.m1071a(parcel, 2, groundOverlayOptions.m3223a());
        C0261c.m1072a(parcel, 3, groundOverlayOptions.m3225c(), i, false);
        C0261c.m1067a(parcel, 4, groundOverlayOptions.m3226d());
        C0261c.m1067a(parcel, 5, groundOverlayOptions.m3227e());
        C0261c.m1072a(parcel, 6, groundOverlayOptions.m3228f(), i, false);
        C0261c.m1067a(parcel, 7, groundOverlayOptions.m3229g());
        C0261c.m1067a(parcel, 8, groundOverlayOptions.m3230h());
        C0261c.m1075a(parcel, 9, groundOverlayOptions.m3234l());
        C0261c.m1067a(parcel, 10, groundOverlayOptions.m3231i());
        C0261c.m1067a(parcel, 11, groundOverlayOptions.m3232j());
        C0261c.m1067a(parcel, 12, groundOverlayOptions.m3233k());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0482f.m3544a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
