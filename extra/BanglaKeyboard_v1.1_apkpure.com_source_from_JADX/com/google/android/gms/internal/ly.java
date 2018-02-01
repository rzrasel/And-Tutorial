package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ly implements Creator<zzbvy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = lg.m5937a(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    str = lg.m5947g(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzbvy(i, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvy[i];
    }
}
