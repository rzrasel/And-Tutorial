package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.lg;

public final class zzar implements Creator<zzaq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = lg.m5937a(parcel);
        String str = null;
        float f = 0.0f;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z4 = lg.m5943c(parcel, readInt);
                    break;
                case 3:
                    z3 = lg.m5943c(parcel, readInt);
                    break;
                case 4:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 5:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 6:
                    f = lg.m5946f(parcel, readInt);
                    break;
                case 7:
                    i = lg.m5944d(parcel, readInt);
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
        return new zzaq(z4, z3, str, z2, f, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaq[i];
    }
}
