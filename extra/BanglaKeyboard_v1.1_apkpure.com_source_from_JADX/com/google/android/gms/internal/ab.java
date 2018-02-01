package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class ab implements Creator<zzabd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = lg.m5937a(parcel);
        PackageInfo packageInfo = null;
        List list = null;
        String str2 = null;
        ApplicationInfo applicationInfo = null;
        zzajk com_google_android_gms_internal_zzajk = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    bundle = lg.m5949i(parcel, readInt);
                    break;
                case 2:
                    com_google_android_gms_internal_zzajk = (zzajk) lg.m5939a(parcel, readInt, zzajk.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) lg.m5939a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 5:
                    list = lg.m5952l(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) lg.m5939a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str = lg.m5947g(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzabd(bundle, com_google_android_gms_internal_zzajk, applicationInfo, str2, list, packageInfo, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzabd[i];
    }
}
