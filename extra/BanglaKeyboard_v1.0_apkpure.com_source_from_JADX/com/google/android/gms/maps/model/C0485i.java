package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0485i implements Creator {
    public static MarkerOptions m3550a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
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
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    iBinder = C0259a.m1055m(parcel, readInt);
                    break;
                case 6:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                case 7:
                    f2 = C0259a.m1051i(parcel, readInt);
                    break;
                case 8:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 9:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 10:
                    z3 = C0259a.m1046d(parcel, readInt);
                    break;
                case 11:
                    f3 = C0259a.m1051i(parcel, readInt);
                    break;
                case 12:
                    f4 = C0259a.m1051i(parcel, readInt);
                    break;
                case 13:
                    f5 = C0259a.m1051i(parcel, readInt);
                    break;
                case 14:
                    f6 = C0259a.m1051i(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3551a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, markerOptions.m3237a());
        C0261c.m1072a(parcel, 2, markerOptions.m3239c(), i, false);
        C0261c.m1073a(parcel, 3, markerOptions.m3240d(), false);
        C0261c.m1073a(parcel, 4, markerOptions.m3241e(), false);
        C0261c.m1071a(parcel, 5, markerOptions.m3238b());
        C0261c.m1067a(parcel, 6, markerOptions.m3242f());
        C0261c.m1067a(parcel, 7, markerOptions.m3243g());
        C0261c.m1075a(parcel, 8, markerOptions.m3244h());
        C0261c.m1075a(parcel, 9, markerOptions.m3245i());
        C0261c.m1075a(parcel, 10, markerOptions.m3246j());
        C0261c.m1067a(parcel, 11, markerOptions.m3247k());
        C0261c.m1067a(parcel, 12, markerOptions.m3248l());
        C0261c.m1067a(parcel, 13, markerOptions.m3249m());
        C0261c.m1067a(parcel, 14, markerOptions.m3250n());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0485i.m3550a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
