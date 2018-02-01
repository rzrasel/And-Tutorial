package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class acw implements Creator<zzlz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        int i9 = 0;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 3:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 4:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 5:
                    i4 = lg.m5944d(parcel, readInt);
                    break;
                case 6:
                    i5 = lg.m5944d(parcel, readInt);
                    break;
                case 7:
                    i6 = lg.m5944d(parcel, readInt);
                    break;
                case 8:
                    i7 = lg.m5944d(parcel, readInt);
                    break;
                case 9:
                    i8 = lg.m5944d(parcel, readInt);
                    break;
                case 10:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 11:
                    i9 = lg.m5944d(parcel, readInt);
                    break;
                case 12:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 13:
                    i10 = lg.m5944d(parcel, readInt);
                    break;
                case 14:
                    i11 = lg.m5944d(parcel, readInt);
                    break;
                case 15:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzlz(i, i2, i3, i4, i5, i6, i7, i8, str, i9, str2, i10, i11, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlz[i];
    }
}
