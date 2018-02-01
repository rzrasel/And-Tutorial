package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class dh implements Creator<zzaek> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    i = lg.m5944d(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzaek(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaek[i];
    }
}
