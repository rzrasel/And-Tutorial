package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public final class C1586m implements Creator<zzaak> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        int i = 0;
        Bundle bundle = null;
        zzix com_google_android_gms_internal_zzix = null;
        zzjb com_google_android_gms_internal_zzjb = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzajk com_google_android_gms_internal_zzajk = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        zzot com_google_android_gms_internal_zzot = null;
        List list3 = null;
        long j2 = 0;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        zzle com_google_android_gms_internal_zzle = null;
        boolean z6 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z7 = false;
        List list4 = null;
        String str15 = null;
        List list5 = null;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    bundle = lg.m5949i(parcel, readInt);
                    break;
                case 3:
                    com_google_android_gms_internal_zzix = (zzix) lg.m5939a(parcel, readInt, zzix.CREATOR);
                    break;
                case 4:
                    com_google_android_gms_internal_zzjb = (zzjb) lg.m5939a(parcel, readInt, zzjb.CREATOR);
                    break;
                case 5:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) lg.m5939a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) lg.m5939a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 9:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                case 10:
                    str4 = lg.m5947g(parcel, readInt);
                    break;
                case 11:
                    com_google_android_gms_internal_zzajk = (zzajk) lg.m5939a(parcel, readInt, zzajk.CREATOR);
                    break;
                case 12:
                    bundle2 = lg.m5949i(parcel, readInt);
                    break;
                case 13:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 14:
                    list = lg.m5952l(parcel, readInt);
                    break;
                case 15:
                    bundle3 = lg.m5949i(parcel, readInt);
                    break;
                case 16:
                    z = lg.m5943c(parcel, readInt);
                    break;
                case 18:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 19:
                    i4 = lg.m5944d(parcel, readInt);
                    break;
                case 20:
                    f = lg.m5946f(parcel, readInt);
                    break;
                case 21:
                    str5 = lg.m5947g(parcel, readInt);
                    break;
                case 25:
                    j = lg.m5945e(parcel, readInt);
                    break;
                case 26:
                    str6 = lg.m5947g(parcel, readInt);
                    break;
                case 27:
                    list2 = lg.m5952l(parcel, readInt);
                    break;
                case 28:
                    str7 = lg.m5947g(parcel, readInt);
                    break;
                case 29:
                    com_google_android_gms_internal_zzot = (zzot) lg.m5939a(parcel, readInt, zzot.CREATOR);
                    break;
                case 30:
                    list3 = lg.m5952l(parcel, readInt);
                    break;
                case 31:
                    j2 = lg.m5945e(parcel, readInt);
                    break;
                case 33:
                    str8 = lg.m5947g(parcel, readInt);
                    break;
                case 34:
                    f2 = lg.m5946f(parcel, readInt);
                    break;
                case 35:
                    i5 = lg.m5944d(parcel, readInt);
                    break;
                case 36:
                    i6 = lg.m5944d(parcel, readInt);
                    break;
                case 37:
                    z3 = lg.m5943c(parcel, readInt);
                    break;
                case 38:
                    z4 = lg.m5943c(parcel, readInt);
                    break;
                case 39:
                    str9 = lg.m5947g(parcel, readInt);
                    break;
                case 40:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 41:
                    str10 = lg.m5947g(parcel, readInt);
                    break;
                case 42:
                    z5 = lg.m5943c(parcel, readInt);
                    break;
                case 43:
                    i7 = lg.m5944d(parcel, readInt);
                    break;
                case 44:
                    bundle4 = lg.m5949i(parcel, readInt);
                    break;
                case 45:
                    str11 = lg.m5947g(parcel, readInt);
                    break;
                case 46:
                    com_google_android_gms_internal_zzle = (zzle) lg.m5939a(parcel, readInt, zzle.CREATOR);
                    break;
                case 47:
                    z6 = lg.m5943c(parcel, readInt);
                    break;
                case 48:
                    bundle5 = lg.m5949i(parcel, readInt);
                    break;
                case 49:
                    str12 = lg.m5947g(parcel, readInt);
                    break;
                case 50:
                    str13 = lg.m5947g(parcel, readInt);
                    break;
                case 51:
                    str14 = lg.m5947g(parcel, readInt);
                    break;
                case 52:
                    z7 = lg.m5943c(parcel, readInt);
                    break;
                case 53:
                    int a2 = lg.m5938a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        list4 = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (readInt = 0; readInt < readInt2; readInt++) {
                            list4.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + a2);
                        break;
                    }
                    list4 = null;
                    break;
                case 54:
                    str15 = lg.m5947g(parcel, readInt);
                    break;
                case 55:
                    list5 = lg.m5952l(parcel, readInt);
                    break;
                case 56:
                    i8 = lg.m5944d(parcel, readInt);
                    break;
                case 57:
                    z8 = lg.m5943c(parcel, readInt);
                    break;
                case 58:
                    z9 = lg.m5943c(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzaak(i, bundle, com_google_android_gms_internal_zzix, com_google_android_gms_internal_zzjb, str, applicationInfo, packageInfo, str2, str3, str4, com_google_android_gms_internal_zzajk, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, com_google_android_gms_internal_zzot, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, com_google_android_gms_internal_zzle, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaak[i];
    }
}
