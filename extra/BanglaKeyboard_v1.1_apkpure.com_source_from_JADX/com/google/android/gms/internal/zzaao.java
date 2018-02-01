package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

@aqv
public final class zzaao extends zzbcc {
    public static final Creator<zzaao> CREATOR = new C1606o();
    public final zzaek f7637A;
    public final List<String> f7638B;
    public final List<String> f7639C;
    public final boolean f7640D;
    public final zzaaq f7641E;
    public final boolean f7642F;
    public String f7643G;
    public final List<String> f7644H;
    public final boolean f7645I;
    public final String f7646J;
    public final zzaes f7647K;
    public final String f7648L;
    public final boolean f7649M;
    public final boolean f7650N;
    private zzaak f7651O;
    private int f7652P;
    private zzaba f7653Q;
    private Bundle f7654R;
    public final String f7655a;
    public String f7656b;
    public final List<String> f7657c;
    public final int f7658d;
    public final List<String> f7659e;
    public final long f7660f;
    public final boolean f7661g;
    public final long f7662h;
    public final List<String> f7663i;
    public final long f7664j;
    public final int f7665k;
    public final String f7666l;
    public final long f7667m;
    public final String f7668n;
    public final boolean f7669o;
    public final String f7670p;
    public final String f7671q;
    public final boolean f7672r;
    public final boolean f7673s;
    public final boolean f7674t;
    public final boolean f7675u;
    public final boolean f7676v;
    public String f7677w;
    public final String f7678x;
    public final boolean f7679y;
    public final boolean f7680z;

    public zzaao(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null);
    }

    public zzaao(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null);
    }

    zzaao(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaba com_google_android_gms_internal_zzaba, String str7, String str8, boolean z8, boolean z9, zzaek com_google_android_gms_internal_zzaek, List<String> list4, List<String> list5, boolean z10, zzaaq com_google_android_gms_internal_zzaaq, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaes com_google_android_gms_internal_zzaes, String str11, boolean z13, boolean z14, Bundle bundle) {
        this.f7652P = i;
        this.f7655a = str;
        this.f7656b = str2;
        this.f7657c = list != null ? Collections.unmodifiableList(list) : null;
        this.f7658d = i2;
        this.f7659e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f7660f = j;
        this.f7661g = z;
        this.f7662h = j2;
        this.f7663i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f7664j = j3;
        this.f7665k = i3;
        this.f7666l = str3;
        this.f7667m = j4;
        this.f7668n = str4;
        this.f7669o = z2;
        this.f7670p = str5;
        this.f7671q = str6;
        this.f7672r = z3;
        this.f7673s = z4;
        this.f7674t = z5;
        this.f7675u = z6;
        this.f7649M = z13;
        this.f7676v = z7;
        this.f7653Q = com_google_android_gms_internal_zzaba;
        this.f7677w = str7;
        this.f7678x = str8;
        if (this.f7656b == null && this.f7653Q != null) {
            zzabo com_google_android_gms_internal_zzabo = (zzabo) this.f7653Q.m7089a(zzabo.CREATOR);
            if (!(com_google_android_gms_internal_zzabo == null || TextUtils.isEmpty(com_google_android_gms_internal_zzabo.f7693a))) {
                this.f7656b = com_google_android_gms_internal_zzabo.f7693a;
            }
        }
        this.f7679y = z8;
        this.f7680z = z9;
        this.f7637A = com_google_android_gms_internal_zzaek;
        this.f7638B = list4;
        this.f7639C = list5;
        this.f7640D = z10;
        this.f7641E = com_google_android_gms_internal_zzaaq;
        this.f7642F = z11;
        this.f7643G = str9;
        this.f7644H = list6;
        this.f7645I = z12;
        this.f7646J = str10;
        this.f7647K = com_google_android_gms_internal_zzaes;
        this.f7648L = str11;
        this.f7650N = z14;
        this.f7654R = bundle;
    }

    public zzaao(zzaak com_google_android_gms_internal_zzaak, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzaek com_google_android_gms_internal_zzaek, List<String> list4, List<String> list5, boolean z10, zzaaq com_google_android_gms_internal_zzaaq, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzaes com_google_android_gms_internal_zzaes, String str10, boolean z13, boolean z14) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, com_google_android_gms_internal_zzaek, list4, list5, z10, com_google_android_gms_internal_zzaaq, z11, str8, list6, z12, str9, com_google_android_gms_internal_zzaes, str10, z13, z14, null);
        this.f7651O = com_google_android_gms_internal_zzaak;
    }

    public zzaao(zzaak com_google_android_gms_internal_zzaak, String str, String str2, List<String> list, List<String> list2, long j, boolean z, List<String> list3, long j2, int i, String str3, long j3, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, String str6, boolean z6, boolean z7, zzaek com_google_android_gms_internal_zzaek, List<String> list4, List<String> list5, boolean z8, zzaaq com_google_android_gms_internal_zzaaq, boolean z9, String str7, List<String> list6, boolean z10, String str8, zzaes com_google_android_gms_internal_zzaes, String str9, boolean z11, boolean z12) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j2, i, str3, j3, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z6, z7, com_google_android_gms_internal_zzaek, list4, list5, z8, com_google_android_gms_internal_zzaaq, z9, str7, list6, z10, str8, com_google_android_gms_internal_zzaes, str9, z11, z12, null);
        this.f7651O = com_google_android_gms_internal_zzaak;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (!(this.f7651O == null || this.f7651O.f7611a < 9 || TextUtils.isEmpty(this.f7656b))) {
            this.f7653Q = new zzaba(new zzabo(this.f7656b));
            this.f7656b = null;
        }
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f7652P);
        li.m5961a(parcel, 2, this.f7655a);
        li.m5961a(parcel, 3, this.f7656b);
        li.m5962a(parcel, 4, this.f7657c);
        li.m5956a(parcel, 5, this.f7658d);
        li.m5962a(parcel, 6, this.f7659e);
        li.m5957a(parcel, 7, this.f7660f);
        li.m5963a(parcel, 8, this.f7661g);
        li.m5957a(parcel, 9, this.f7662h);
        li.m5962a(parcel, 10, this.f7663i);
        li.m5957a(parcel, 11, this.f7664j);
        li.m5956a(parcel, 12, this.f7665k);
        li.m5961a(parcel, 13, this.f7666l);
        li.m5957a(parcel, 14, this.f7667m);
        li.m5961a(parcel, 15, this.f7668n);
        li.m5963a(parcel, 18, this.f7669o);
        li.m5961a(parcel, 19, this.f7670p);
        li.m5961a(parcel, 21, this.f7671q);
        li.m5963a(parcel, 22, this.f7672r);
        li.m5963a(parcel, 23, this.f7673s);
        li.m5963a(parcel, 24, this.f7674t);
        li.m5963a(parcel, 25, this.f7675u);
        li.m5963a(parcel, 26, this.f7676v);
        li.m5960a(parcel, 28, this.f7653Q, i);
        li.m5961a(parcel, 29, this.f7677w);
        li.m5961a(parcel, 30, this.f7678x);
        li.m5963a(parcel, 31, this.f7679y);
        li.m5963a(parcel, 32, this.f7680z);
        li.m5960a(parcel, 33, this.f7637A, i);
        li.m5962a(parcel, 34, this.f7638B);
        li.m5962a(parcel, 35, this.f7639C);
        li.m5963a(parcel, 36, this.f7640D);
        li.m5960a(parcel, 37, this.f7641E, i);
        li.m5963a(parcel, 38, this.f7642F);
        li.m5961a(parcel, 39, this.f7643G);
        li.m5962a(parcel, 40, this.f7644H);
        li.m5963a(parcel, 42, this.f7645I);
        li.m5961a(parcel, 43, this.f7646J);
        li.m5960a(parcel, 44, this.f7647K, i);
        li.m5961a(parcel, 45, this.f7648L);
        li.m5963a(parcel, 46, this.f7649M);
        li.m5963a(parcel, 47, this.f7650N);
        li.m5958a(parcel, 48, this.f7654R);
        li.m5967b(parcel, a);
    }
}
