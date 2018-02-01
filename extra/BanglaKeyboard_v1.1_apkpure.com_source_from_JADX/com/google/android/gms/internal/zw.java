package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class zw implements Creator<zzix> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        zzlz com_google_android_gms_internal_zzlz = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    j = lg.m5945e(parcel, readInt);
                    break;
                case 3:
                    bundle = lg.m5949i(parcel, readInt);
                    break;
                case 4:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 5:
                    list = lg.m5952l(parcel, readInt);
                    break;
                case 6:
                    z = lg.m5943c(parcel, readInt);
                    break;
                case 7:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 8:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 9:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 10:
                    com_google_android_gms_internal_zzlz = (zzlz) lg.m5939a(parcel, readInt, zzlz.CREATOR);
                    break;
                case 11:
                    location = (Location) lg.m5939a(parcel, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 13:
                    bundle2 = lg.m5949i(parcel, readInt);
                    break;
                case 14:
                    bundle3 = lg.m5949i(parcel, readInt);
                    break;
                case 15:
                    list2 = lg.m5952l(parcel, readInt);
                    break;
                case 16:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                case 17:
                    str4 = lg.m5947g(parcel, readInt);
                    break;
                case 18:
                    z3 = lg.m5943c(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzix(i, j, bundle, i2, list, z, i3, z2, str, com_google_android_gms_internal_zzlz, location, str2, bundle2, bundle3, list2, str3, str4, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzix[i];
    }
}
