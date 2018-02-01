package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class afp implements Creator<zzot> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = lg.m5937a(parcel);
        zzmd com_google_android_gms_internal_zzmd = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 3:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 4:
                    z = lg.m5943c(parcel, readInt);
                    break;
                case 5:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 6:
                    com_google_android_gms_internal_zzmd = (zzmd) lg.m5939a(parcel, readInt, zzmd.CREATOR);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzot(i3, z2, i2, z, i, com_google_android_gms_internal_zzmd);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzot[i];
    }
}
