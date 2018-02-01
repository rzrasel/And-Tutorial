package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.lg;

public final class C1491e implements Creator<ConnectionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) lg.m5939a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 4:
                    str = lg.m5947g(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new ConnectionResult(i2, i, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
