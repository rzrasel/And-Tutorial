package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class cz implements SafeParcelable {
    public static final em CREATOR = new em();
    public final int f1170a;
    public final String f1171b;
    public final String f1172c;
    public final List f1173d;
    public final int f1174e;
    public final List f1175f;
    public final long f1176g;
    public final boolean f1177h;
    public final long f1178i;
    public final List f1179j;
    public final long f1180k;
    public final int f1181l;
    public final String f1182m;
    public final long f1183n;
    public final String f1184o;
    public final boolean f1185p;
    public final String f1186q;
    public final String f1187r;

    public cz(int i) {
        this(7, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null);
    }

    public cz(int i, long j) {
        this(7, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null);
    }

    cz(int i, String str, String str2, List list, int i2, List list2, long j, boolean z, long j2, List list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6) {
        this.f1170a = i;
        this.f1171b = str;
        this.f1172c = str2;
        this.f1173d = list != null ? Collections.unmodifiableList(list) : null;
        this.f1174e = i2;
        this.f1175f = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f1176g = j;
        this.f1177h = z;
        this.f1178i = j2;
        this.f1179j = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f1180k = j3;
        this.f1181l = i3;
        this.f1182m = str3;
        this.f1183n = j4;
        this.f1184o = str4;
        this.f1185p = z2;
        this.f1186q = str5;
        this.f1187r = str6;
    }

    public cz(String str, String str2, List list, List list2, long j, List list3, int i, String str3, long j2, String str4, boolean z, String str5, String str6) {
        this(7, str, str2, list, -2, list2, j, false, -1, list3, -1, i, str3, j2, str4, z, str5, str6);
    }

    public cz(String str, String str2, List list, List list2, long j, boolean z, List list3, long j2, int i, String str3, long j3, String str4, String str5) {
        this(7, str, str2, list, -2, list2, j, z, -1, list3, j2, i, str3, j3, str4, false, null, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        em.m1939a(this, parcel);
    }
}
