package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class C1577do implements Creator<zzaes> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        boolean z = false;
        int a = lg.m5937a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 4:
                    z4 = lg.m5943c(parcel, readInt);
                    break;
                case 5:
                    z3 = lg.m5943c(parcel, readInt);
                    break;
                case 6:
                    list = lg.m5952l(parcel, readInt);
                    break;
                case 7:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 8:
                    z = lg.m5943c(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzaes(str2, str, z4, z3, list, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaes[i];
    }
}
