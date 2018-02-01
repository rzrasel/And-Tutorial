package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class C1582if implements Creator<zzajk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = lg.m5937a(parcel);
        String str = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 4:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 5:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 6:
                    z = lg.m5943c(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzajk(str, i2, i, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzajk[i];
    }
}
