package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.lg;
import java.util.List;

public final class C1531b implements Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        List list = null;
        String str2 = null;
        long j2 = 0;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
        long j3 = 0;
        String str5 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    j = lg.m5945e(parcel, readInt);
                    break;
                case 4:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 5:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 6:
                    list = lg.m5952l(parcel, readInt);
                    break;
                case 8:
                    j2 = lg.m5945e(parcel, readInt);
                    break;
                case 10:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                case 11:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 12:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 13:
                    str4 = lg.m5947g(parcel, readInt);
                    break;
                case 14:
                    i4 = lg.m5944d(parcel, readInt);
                    break;
                case 15:
                    f = lg.m5946f(parcel, readInt);
                    break;
                case 16:
                    j3 = lg.m5945e(parcel, readInt);
                    break;
                case 17:
                    str5 = lg.m5947g(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
