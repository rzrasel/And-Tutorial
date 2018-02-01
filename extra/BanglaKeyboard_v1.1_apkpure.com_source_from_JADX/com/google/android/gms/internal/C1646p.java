package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class C1646p implements Creator<zzaaq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        boolean z = false;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = lg.m5943c(parcel, readInt);
                    break;
                case 3:
                    list = lg.m5952l(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzaaq(z, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaaq[i];
    }
}
