package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class cn implements Creator<zzadp> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        String str = null;
        zzix com_google_android_gms_internal_zzix = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    com_google_android_gms_internal_zzix = (zzix) lg.m5939a(parcel, readInt, zzix.CREATOR);
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
        return new zzadp(com_google_android_gms_internal_zzix, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzadp[i];
    }
}
