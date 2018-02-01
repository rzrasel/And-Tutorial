package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

@aqv
public final class zzabd extends zzbcc {
    public static final Creator<zzabd> CREATOR = new ab();
    private Bundle f7686a;
    private zzajk f7687b;
    private ApplicationInfo f7688c;
    private String f7689d;
    private List<String> f7690e;
    private PackageInfo f7691f;
    private String f7692g;

    public zzabd(Bundle bundle, zzajk com_google_android_gms_internal_zzajk, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2) {
        this.f7686a = bundle;
        this.f7687b = com_google_android_gms_internal_zzajk;
        this.f7689d = str;
        this.f7688c = applicationInfo;
        this.f7690e = list;
        this.f7691f = packageInfo;
        this.f7692g = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5958a(parcel, 1, this.f7686a);
        li.m5960a(parcel, 2, this.f7687b, i);
        li.m5960a(parcel, 3, this.f7688c, i);
        li.m5961a(parcel, 4, this.f7689d);
        li.m5962a(parcel, 5, this.f7690e);
        li.m5960a(parcel, 6, this.f7691f, i);
        li.m5961a(parcel, 7, this.f7692g);
        li.m5967b(parcel, a);
    }
}
