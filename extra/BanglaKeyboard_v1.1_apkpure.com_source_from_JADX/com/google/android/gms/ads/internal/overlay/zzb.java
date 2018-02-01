package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.lg;

public final class zzb implements Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        int a = lg.m5937a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str7 = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    str6 = lg.m5947g(parcel, readInt);
                    break;
                case 4:
                    str5 = lg.m5947g(parcel, readInt);
                    break;
                case 5:
                    str4 = lg.m5947g(parcel, readInt);
                    break;
                case 6:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                case 7:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 8:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 9:
                    intent = (Intent) lg.m5939a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzc(str7, str6, str5, str4, str3, str2, str, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
