package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.maps.model.CameraPosition;

public final class C0440c implements Creator {
    public static GoogleMapOptions m3157a(Parcel parcel) {
        byte b = (byte) 0;
        int a = C0259a.m1038a(parcel);
        CameraPosition cameraPosition = null;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        byte b6 = (byte) 0;
        int i = 0;
        byte b7 = (byte) 0;
        byte b8 = (byte) 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    b8 = C0259a.m1047e(parcel, readInt);
                    break;
                case 3:
                    b7 = C0259a.m1047e(parcel, readInt);
                    break;
                case 4:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C0259a.m1040a(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b6 = C0259a.m1047e(parcel, readInt);
                    break;
                case 7:
                    b5 = C0259a.m1047e(parcel, readInt);
                    break;
                case 8:
                    b4 = C0259a.m1047e(parcel, readInt);
                    break;
                case 9:
                    b3 = C0259a.m1047e(parcel, readInt);
                    break;
                case 10:
                    b2 = C0259a.m1047e(parcel, readInt);
                    break;
                case 11:
                    b = C0259a.m1047e(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GoogleMapOptions(i2, b8, b7, i, cameraPosition, b6, b5, b4, b3, b2, b);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3158a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, googleMapOptions.m2785a());
        C0261c.m1065a(parcel, 2, googleMapOptions.m2786b());
        C0261c.m1065a(parcel, 3, googleMapOptions.m2787c());
        C0261c.m1082b(parcel, 4, googleMapOptions.m2794j());
        C0261c.m1072a(parcel, 5, googleMapOptions.m2795k(), i, false);
        C0261c.m1065a(parcel, 6, googleMapOptions.m2788d());
        C0261c.m1065a(parcel, 7, googleMapOptions.m2789e());
        C0261c.m1065a(parcel, 8, googleMapOptions.m2790f());
        C0261c.m1065a(parcel, 9, googleMapOptions.m2791g());
        C0261c.m1065a(parcel, 10, googleMapOptions.m2792h());
        C0261c.m1065a(parcel, 11, googleMapOptions.m2793i());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0440c.m3157a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
