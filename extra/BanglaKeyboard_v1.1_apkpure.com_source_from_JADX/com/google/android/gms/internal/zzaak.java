package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@aqv
public final class zzaak extends zzbcc {
    public static final Creator<zzaak> CREATOR = new C1586m();
    public final long f7585A;
    public final String f7586B;
    public final float f7587C;
    public final int f7588D;
    public final int f7589E;
    public final boolean f7590F;
    public final boolean f7591G;
    public final String f7592H;
    public final boolean f7593I;
    public final String f7594J;
    public final boolean f7595K;
    public final int f7596L;
    public final Bundle f7597M;
    public final String f7598N;
    public final zzle f7599O;
    public final boolean f7600P;
    public final Bundle f7601Q;
    public final String f7602R;
    public final String f7603S;
    public final String f7604T;
    public final boolean f7605U;
    public final List<Integer> f7606V;
    public final String f7607W;
    public final List<String> f7608X;
    public final int f7609Y;
    public final boolean f7610Z;
    public final int f7611a;
    public final boolean aa;
    public final Bundle f7612b;
    public final zzix f7613c;
    public final zzjb f7614d;
    public final String f7615e;
    public final ApplicationInfo f7616f;
    public final PackageInfo f7617g;
    public final String f7618h;
    public final String f7619i;
    public final String f7620j;
    public final zzajk f7621k;
    public final Bundle f7622l;
    public final int f7623m;
    public final List<String> f7624n;
    public final Bundle f7625o;
    public final boolean f7626p;
    public final int f7627q;
    public final int f7628r;
    public final float f7629s;
    public final String f7630t;
    public final long f7631u;
    public final String f7632v;
    public final List<String> f7633w;
    public final String f7634x;
    public final zzot f7635y;
    public final List<String> f7636z;

    zzaak(int i, Bundle bundle, zzix com_google_android_gms_internal_zzix, zzjb com_google_android_gms_internal_zzjb, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzajk com_google_android_gms_internal_zzajk, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzot com_google_android_gms_internal_zzot, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzle com_google_android_gms_internal_zzle, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9) {
        this.f7611a = i;
        this.f7612b = bundle;
        this.f7613c = com_google_android_gms_internal_zzix;
        this.f7614d = com_google_android_gms_internal_zzjb;
        this.f7615e = str;
        this.f7616f = applicationInfo;
        this.f7617g = packageInfo;
        this.f7618h = str2;
        this.f7619i = str3;
        this.f7620j = str4;
        this.f7621k = com_google_android_gms_internal_zzajk;
        this.f7622l = bundle2;
        this.f7623m = i2;
        this.f7624n = list;
        this.f7636z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f7625o = bundle3;
        this.f7626p = z;
        this.f7627q = i3;
        this.f7628r = i4;
        this.f7629s = f;
        this.f7630t = str5;
        this.f7631u = j;
        this.f7632v = str6;
        this.f7633w = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f7634x = str7;
        this.f7635y = com_google_android_gms_internal_zzot;
        this.f7585A = j2;
        this.f7586B = str8;
        this.f7587C = f2;
        this.f7593I = z2;
        this.f7588D = i5;
        this.f7589E = i6;
        this.f7590F = z3;
        this.f7591G = z4;
        this.f7592H = str9;
        this.f7594J = str10;
        this.f7595K = z5;
        this.f7596L = i7;
        this.f7597M = bundle4;
        this.f7598N = str11;
        this.f7599O = com_google_android_gms_internal_zzle;
        this.f7600P = z6;
        this.f7601Q = bundle5;
        this.f7602R = str12;
        this.f7603S = str13;
        this.f7604T = str14;
        this.f7605U = z7;
        this.f7606V = list4;
        this.f7607W = str15;
        this.f7608X = list5;
        this.f7609Y = i8;
        this.f7610Z = z8;
        this.aa = z9;
    }

    private zzaak(Bundle bundle, zzix com_google_android_gms_internal_zzix, zzjb com_google_android_gms_internal_zzjb, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzajk com_google_android_gms_internal_zzajk, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzot com_google_android_gms_internal_zzot, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzle com_google_android_gms_internal_zzle, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9) {
        this(24, bundle, com_google_android_gms_internal_zzix, com_google_android_gms_internal_zzjb, str, applicationInfo, packageInfo, str2, str3, str4, com_google_android_gms_internal_zzajk, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, com_google_android_gms_internal_zzot, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, com_google_android_gms_internal_zzle, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9);
    }

    public zzaak(C1585l c1585l, long j, String str, String str2, String str3) {
        this(c1585l.f6502a, c1585l.f6503b, c1585l.f6504c, c1585l.f6505d, c1585l.f6506e, c1585l.f6507f, (String) ih.m5639a(c1585l.f6496Q, ""), c1585l.f6508g, c1585l.f6509h, c1585l.f6511j, c1585l.f6510i, c1585l.f6512k, c1585l.f6513l, c1585l.f6514m, c1585l.f6516o, c1585l.f6517p, c1585l.f6518q, c1585l.f6519r, c1585l.f6520s, c1585l.f6521t, c1585l.f6522u, c1585l.f6523v, c1585l.f6524w, c1585l.f6525x, c1585l.f6526y, j, c1585l.f6527z, c1585l.f6480A, c1585l.f6481B, c1585l.f6482C, c1585l.f6483D, c1585l.f6484E, c1585l.f6485F, (String) ih.m5640a(c1585l.f6486G, "", 1, TimeUnit.SECONDS), c1585l.f6487H, c1585l.f6488I, c1585l.f6489J, c1585l.f6490K, c1585l.f6491L, c1585l.f6492M, c1585l.f6493N, c1585l.f6494O, str, str2, str3, c1585l.f6495P, c1585l.f6497R, c1585l.f6498S, c1585l.f6515n, c1585l.f6499T, c1585l.f6500U, c1585l.f6501V);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f7611a);
        li.m5958a(parcel, 2, this.f7612b);
        li.m5960a(parcel, 3, this.f7613c, i);
        li.m5960a(parcel, 4, this.f7614d, i);
        li.m5961a(parcel, 5, this.f7615e);
        li.m5960a(parcel, 6, this.f7616f, i);
        li.m5960a(parcel, 7, this.f7617g, i);
        li.m5961a(parcel, 8, this.f7618h);
        li.m5961a(parcel, 9, this.f7619i);
        li.m5961a(parcel, 10, this.f7620j);
        li.m5960a(parcel, 11, this.f7621k, i);
        li.m5958a(parcel, 12, this.f7622l);
        li.m5956a(parcel, 13, this.f7623m);
        li.m5962a(parcel, 14, this.f7624n);
        li.m5958a(parcel, 15, this.f7625o);
        li.m5963a(parcel, 16, this.f7626p);
        li.m5956a(parcel, 18, this.f7627q);
        li.m5956a(parcel, 19, this.f7628r);
        li.m5955a(parcel, 20, this.f7629s);
        li.m5961a(parcel, 21, this.f7630t);
        li.m5957a(parcel, 25, this.f7631u);
        li.m5961a(parcel, 26, this.f7632v);
        li.m5962a(parcel, 27, this.f7633w);
        li.m5961a(parcel, 28, this.f7634x);
        li.m5960a(parcel, 29, this.f7635y, i);
        li.m5962a(parcel, 30, this.f7636z);
        li.m5957a(parcel, 31, this.f7585A);
        li.m5961a(parcel, 33, this.f7586B);
        li.m5955a(parcel, 34, this.f7587C);
        li.m5956a(parcel, 35, this.f7588D);
        li.m5956a(parcel, 36, this.f7589E);
        li.m5963a(parcel, 37, this.f7590F);
        li.m5963a(parcel, 38, this.f7591G);
        li.m5961a(parcel, 39, this.f7592H);
        li.m5963a(parcel, 40, this.f7593I);
        li.m5961a(parcel, 41, this.f7594J);
        li.m5963a(parcel, 42, this.f7595K);
        li.m5956a(parcel, 43, this.f7596L);
        li.m5958a(parcel, 44, this.f7597M);
        li.m5961a(parcel, 45, this.f7598N);
        li.m5960a(parcel, 46, this.f7599O, i);
        li.m5963a(parcel, 47, this.f7600P);
        li.m5958a(parcel, 48, this.f7601Q);
        li.m5961a(parcel, 49, this.f7602R);
        li.m5961a(parcel, 50, this.f7603S);
        li.m5961a(parcel, 51, this.f7604T);
        li.m5963a(parcel, 52, this.f7605U);
        List list = this.f7606V;
        if (list != null) {
            int a2 = li.m5954a(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            li.m5967b(parcel, a2);
        }
        li.m5961a(parcel, 54, this.f7607W);
        li.m5962a(parcel, 55, this.f7608X);
        li.m5956a(parcel, 56, this.f7609Y);
        li.m5963a(parcel, 57, this.f7610Z);
        li.m5963a(parcel, 58, this.aa);
        li.m5967b(parcel, a);
    }
}
