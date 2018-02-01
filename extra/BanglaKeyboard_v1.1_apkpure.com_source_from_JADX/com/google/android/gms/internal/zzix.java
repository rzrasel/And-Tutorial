package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1514r;
import java.util.Arrays;
import java.util.List;

@aqv
public final class zzix extends zzbcc {
    public static final Creator<zzix> CREATOR = new zw();
    public final int f7740a;
    public final long f7741b;
    public final Bundle f7742c;
    public final int f7743d;
    public final List<String> f7744e;
    public final boolean f7745f;
    public final int f7746g;
    public final boolean f7747h;
    public final String f7748i;
    public final zzlz f7749j;
    public final Location f7750k;
    public final String f7751l;
    public final Bundle f7752m;
    public final Bundle f7753n;
    public final List<String> f7754o;
    public final String f7755p;
    public final String f7756q;
    public final boolean f7757r;

    public zzix(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzlz com_google_android_gms_internal_zzlz, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f7740a = i;
        this.f7741b = j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f7742c = bundle;
        this.f7743d = i2;
        this.f7744e = list;
        this.f7745f = z;
        this.f7746g = i3;
        this.f7747h = z2;
        this.f7748i = str;
        this.f7749j = com_google_android_gms_internal_zzlz;
        this.f7750k = location;
        this.f7751l = str2;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.f7752m = bundle2;
        this.f7753n = bundle3;
        this.f7754o = list2;
        this.f7755p = str3;
        this.f7756q = str4;
        this.f7757r = z3;
    }

    public static void m7104a(zzix com_google_android_gms_internal_zzix) {
        com_google_android_gms_internal_zzix.f7752m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", com_google_android_gms_internal_zzix.f7742c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzix)) {
            return false;
        }
        zzix com_google_android_gms_internal_zzix = (zzix) obj;
        return this.f7740a == com_google_android_gms_internal_zzix.f7740a && this.f7741b == com_google_android_gms_internal_zzix.f7741b && C1514r.m3858a(this.f7742c, com_google_android_gms_internal_zzix.f7742c) && this.f7743d == com_google_android_gms_internal_zzix.f7743d && C1514r.m3858a(this.f7744e, com_google_android_gms_internal_zzix.f7744e) && this.f7745f == com_google_android_gms_internal_zzix.f7745f && this.f7746g == com_google_android_gms_internal_zzix.f7746g && this.f7747h == com_google_android_gms_internal_zzix.f7747h && C1514r.m3858a(this.f7748i, com_google_android_gms_internal_zzix.f7748i) && C1514r.m3858a(this.f7749j, com_google_android_gms_internal_zzix.f7749j) && C1514r.m3858a(this.f7750k, com_google_android_gms_internal_zzix.f7750k) && C1514r.m3858a(this.f7751l, com_google_android_gms_internal_zzix.f7751l) && C1514r.m3858a(this.f7752m, com_google_android_gms_internal_zzix.f7752m) && C1514r.m3858a(this.f7753n, com_google_android_gms_internal_zzix.f7753n) && C1514r.m3858a(this.f7754o, com_google_android_gms_internal_zzix.f7754o) && C1514r.m3858a(this.f7755p, com_google_android_gms_internal_zzix.f7755p) && C1514r.m3858a(this.f7756q, com_google_android_gms_internal_zzix.f7756q) && this.f7757r == com_google_android_gms_internal_zzix.f7757r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7740a), Long.valueOf(this.f7741b), this.f7742c, Integer.valueOf(this.f7743d), this.f7744e, Boolean.valueOf(this.f7745f), Integer.valueOf(this.f7746g), Boolean.valueOf(this.f7747h), this.f7748i, this.f7749j, this.f7750k, this.f7751l, this.f7752m, this.f7753n, this.f7754o, this.f7755p, this.f7756q, Boolean.valueOf(this.f7757r)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f7740a);
        li.m5957a(parcel, 2, this.f7741b);
        li.m5958a(parcel, 3, this.f7742c);
        li.m5956a(parcel, 4, this.f7743d);
        li.m5962a(parcel, 5, this.f7744e);
        li.m5963a(parcel, 6, this.f7745f);
        li.m5956a(parcel, 7, this.f7746g);
        li.m5963a(parcel, 8, this.f7747h);
        li.m5961a(parcel, 9, this.f7748i);
        li.m5960a(parcel, 10, this.f7749j, i);
        li.m5960a(parcel, 11, this.f7750k, i);
        li.m5961a(parcel, 12, this.f7751l);
        li.m5958a(parcel, 13, this.f7752m);
        li.m5958a(parcel, 14, this.f7753n);
        li.m5962a(parcel, 15, this.f7754o);
        li.m5961a(parcel, 16, this.f7755p);
        li.m5961a(parcel, 17, this.f7756q);
        li.m5963a(parcel, 18, this.f7757r);
        li.m5967b(parcel, a);
    }
}
