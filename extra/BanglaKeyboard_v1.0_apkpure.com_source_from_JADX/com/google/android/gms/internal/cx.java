package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class cx implements SafeParcelable {
    public static final ej CREATOR = new ej();
    public final int f1157a;
    public final Bundle f1158b;
    public final ah f1159c;
    public final ak f1160d;
    public final String f1161e;
    public final ApplicationInfo f1162f;
    public final PackageInfo f1163g;
    public final String f1164h;
    public final String f1165i;
    public final String f1166j;
    public final dx f1167k;
    public final Bundle f1168l;

    cx(int i, Bundle bundle, ah ahVar, ak akVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, dx dxVar, Bundle bundle2) {
        this.f1157a = i;
        this.f1158b = bundle;
        this.f1159c = ahVar;
        this.f1160d = akVar;
        this.f1161e = str;
        this.f1162f = applicationInfo;
        this.f1163g = packageInfo;
        this.f1164h = str2;
        this.f1165i = str3;
        this.f1166j = str4;
        this.f1167k = dxVar;
        this.f1168l = bundle2;
    }

    private cx(Bundle bundle, ah ahVar, ak akVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, dx dxVar, Bundle bundle2) {
        this(2, bundle, ahVar, akVar, str, applicationInfo, packageInfo, str2, str3, str4, dxVar, bundle2);
    }

    public cx(ei eiVar, String str) {
        this(eiVar.f1261a, eiVar.f1262b, eiVar.f1263c, eiVar.f1264d, eiVar.f1265e, eiVar.f1266f, str, eiVar.f1267g, eiVar.f1268h, eiVar.f1270j, eiVar.f1269i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ej.m1934a(this, parcel, i);
    }
}
