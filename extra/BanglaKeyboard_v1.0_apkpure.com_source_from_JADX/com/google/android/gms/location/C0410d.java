package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0410d implements Creator {
    static void m2782a(LocationRequest locationRequest, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, locationRequest.f2031a);
        C0261c.m1082b(parcel, 1000, locationRequest.m2777a());
        C0261c.m1069a(parcel, 2, locationRequest.f2032b);
        C0261c.m1069a(parcel, 3, locationRequest.f2033c);
        C0261c.m1075a(parcel, 4, locationRequest.f2034d);
        C0261c.m1069a(parcel, 5, locationRequest.f2035e);
        C0261c.m1082b(parcel, 6, locationRequest.f2036f);
        C0261c.m1067a(parcel, 7, locationRequest.f2037g);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        int i2 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        float f = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 3:
                    j2 = C0259a.m1049g(parcel, readInt);
                    break;
                case 4:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 5:
                    j3 = C0259a.m1049g(parcel, readInt);
                    break;
                case 6:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                case 1000:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LocationRequest(i3, i, j, j2, z, j3, i2, f);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
