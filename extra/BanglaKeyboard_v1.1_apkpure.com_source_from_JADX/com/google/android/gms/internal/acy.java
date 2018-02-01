package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class acy implements Creator<zzmd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = lg.m5937a(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 3:
                    z = lg.m5943c(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzmd(z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmd[i];
    }
}
