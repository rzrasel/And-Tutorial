package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zz implements Creator<zzjb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzjb[] com_google_android_gms_internal_zzjbArr = null;
        boolean z = false;
        int a = lg.m5937a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    i4 = lg.m5944d(parcel, readInt);
                    break;
                case 4:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 5:
                    z4 = lg.m5943c(parcel, readInt);
                    break;
                case 6:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 7:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 8:
                    com_google_android_gms_internal_zzjbArr = (zzjb[]) lg.m5942b(parcel, readInt, zzjb.CREATOR);
                    break;
                case 9:
                    z3 = lg.m5943c(parcel, readInt);
                    break;
                case 10:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 11:
                    z = lg.m5943c(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzjb(str, i4, i3, z4, i2, i, com_google_android_gms_internal_zzjbArr, z3, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjb[i];
    }
}
