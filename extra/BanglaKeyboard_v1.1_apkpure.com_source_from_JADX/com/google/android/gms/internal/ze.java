package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ze implements Creator<zzie> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        Bundle bundle = null;
        int a = lg.m5937a(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    j2 = lg.m5945e(parcel, readInt);
                    break;
                case 4:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                case 5:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 6:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 7:
                    bundle = lg.m5949i(parcel, readInt);
                    break;
                case 8:
                    z = lg.m5943c(parcel, readInt);
                    break;
                case 9:
                    j = lg.m5945e(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzie(str4, j2, str3, str2, str, bundle, z, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzie[i];
    }
}
