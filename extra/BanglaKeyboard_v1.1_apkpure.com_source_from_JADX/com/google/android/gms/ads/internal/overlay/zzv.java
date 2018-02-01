package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.internal.lg;
import com.google.android.gms.internal.zzajk;

public final class zzv implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        zzc com_google_android_gms_ads_internal_overlay_zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        zzajk com_google_android_gms_internal_zzajk = null;
        String str4 = null;
        zzaq com_google_android_gms_ads_internal_zzaq = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    com_google_android_gms_ads_internal_overlay_zzc = (zzc) lg.m5939a(parcel, readInt, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = lg.m5948h(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = lg.m5948h(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = lg.m5948h(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = lg.m5948h(parcel, readInt);
                    break;
                case 7:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 8:
                    z = lg.m5943c(parcel, readInt);
                    break;
                case 9:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 10:
                    iBinder5 = lg.m5948h(parcel, readInt);
                    break;
                case 11:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 12:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 13:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                case 14:
                    com_google_android_gms_internal_zzajk = (zzajk) lg.m5939a(parcel, readInt, zzajk.CREATOR);
                    break;
                case 16:
                    str4 = lg.m5947g(parcel, readInt);
                    break;
                case 17:
                    com_google_android_gms_ads_internal_zzaq = (zzaq) lg.m5939a(parcel, readInt, zzaq.CREATOR);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new AdOverlayInfoParcel(com_google_android_gms_ads_internal_overlay_zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, com_google_android_gms_internal_zzajk, str4, com_google_android_gms_ads_internal_zzaq);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
