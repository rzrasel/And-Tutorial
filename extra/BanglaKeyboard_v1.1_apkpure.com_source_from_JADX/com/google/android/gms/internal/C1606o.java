package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class C1606o implements Creator<zzaao> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        zzaba com_google_android_gms_internal_zzaba = null;
        String str7 = null;
        String str8 = null;
        boolean z8 = false;
        boolean z9 = false;
        zzaek com_google_android_gms_internal_zzaek = null;
        List list4 = null;
        List list5 = null;
        boolean z10 = false;
        zzaaq com_google_android_gms_internal_zzaaq = null;
        boolean z11 = false;
        String str9 = null;
        List list6 = null;
        boolean z12 = false;
        String str10 = null;
        zzaes com_google_android_gms_internal_zzaes = null;
        String str11 = null;
        boolean z13 = false;
        boolean z14 = false;
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    str2 = lg.m5947g(parcel, readInt);
                    break;
                case 4:
                    list = lg.m5952l(parcel, readInt);
                    break;
                case 5:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 6:
                    list2 = lg.m5952l(parcel, readInt);
                    break;
                case 7:
                    j = lg.m5945e(parcel, readInt);
                    break;
                case 8:
                    z = lg.m5943c(parcel, readInt);
                    break;
                case 9:
                    j2 = lg.m5945e(parcel, readInt);
                    break;
                case 10:
                    list3 = lg.m5952l(parcel, readInt);
                    break;
                case 11:
                    j3 = lg.m5945e(parcel, readInt);
                    break;
                case 12:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 13:
                    str3 = lg.m5947g(parcel, readInt);
                    break;
                case 14:
                    j4 = lg.m5945e(parcel, readInt);
                    break;
                case 15:
                    str4 = lg.m5947g(parcel, readInt);
                    break;
                case 18:
                    z2 = lg.m5943c(parcel, readInt);
                    break;
                case 19:
                    str5 = lg.m5947g(parcel, readInt);
                    break;
                case 21:
                    str6 = lg.m5947g(parcel, readInt);
                    break;
                case 22:
                    z3 = lg.m5943c(parcel, readInt);
                    break;
                case 23:
                    z4 = lg.m5943c(parcel, readInt);
                    break;
                case 24:
                    z5 = lg.m5943c(parcel, readInt);
                    break;
                case 25:
                    z6 = lg.m5943c(parcel, readInt);
                    break;
                case 26:
                    z7 = lg.m5943c(parcel, readInt);
                    break;
                case 28:
                    com_google_android_gms_internal_zzaba = (zzaba) lg.m5939a(parcel, readInt, zzaba.CREATOR);
                    break;
                case 29:
                    str7 = lg.m5947g(parcel, readInt);
                    break;
                case 30:
                    str8 = lg.m5947g(parcel, readInt);
                    break;
                case 31:
                    z8 = lg.m5943c(parcel, readInt);
                    break;
                case 32:
                    z9 = lg.m5943c(parcel, readInt);
                    break;
                case 33:
                    com_google_android_gms_internal_zzaek = (zzaek) lg.m5939a(parcel, readInt, zzaek.CREATOR);
                    break;
                case 34:
                    list4 = lg.m5952l(parcel, readInt);
                    break;
                case 35:
                    list5 = lg.m5952l(parcel, readInt);
                    break;
                case 36:
                    z10 = lg.m5943c(parcel, readInt);
                    break;
                case 37:
                    com_google_android_gms_internal_zzaaq = (zzaaq) lg.m5939a(parcel, readInt, zzaaq.CREATOR);
                    break;
                case 38:
                    z11 = lg.m5943c(parcel, readInt);
                    break;
                case 39:
                    str9 = lg.m5947g(parcel, readInt);
                    break;
                case 40:
                    list6 = lg.m5952l(parcel, readInt);
                    break;
                case 42:
                    z12 = lg.m5943c(parcel, readInt);
                    break;
                case 43:
                    str10 = lg.m5947g(parcel, readInt);
                    break;
                case 44:
                    com_google_android_gms_internal_zzaes = (zzaes) lg.m5939a(parcel, readInt, zzaes.CREATOR);
                    break;
                case 45:
                    str11 = lg.m5947g(parcel, readInt);
                    break;
                case 46:
                    z13 = lg.m5943c(parcel, readInt);
                    break;
                case 47:
                    z14 = lg.m5943c(parcel, readInt);
                    break;
                case 48:
                    bundle = lg.m5949i(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzaao(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, com_google_android_gms_internal_zzaba, str7, str8, z8, z9, com_google_android_gms_internal_zzaek, list4, list5, z10, com_google_android_gms_internal_zzaaq, z11, str9, list6, z12, str10, com_google_android_gms_internal_zzaes, str11, z13, z14, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaao[i];
    }
}
