package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0497t implements Creator {
    public static TileOverlayOptions m3565a(Parcel parcel) {
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        IBinder iBinder = null;
        float f = 0.0f;
        boolean z2 = true;
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
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 4:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                case 5:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new TileOverlayOptions(i, iBinder, z, f, z2);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3566a(TileOverlayOptions tileOverlayOptions, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, tileOverlayOptions.m3273a());
        C0261c.m1071a(parcel, 2, tileOverlayOptions.m3274b());
        C0261c.m1075a(parcel, 3, tileOverlayOptions.m3276d());
        C0261c.m1067a(parcel, 4, tileOverlayOptions.m3275c());
        C0261c.m1075a(parcel, 5, tileOverlayOptions.m3277e());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0497t.m3565a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
