package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.ju;
import java.util.ArrayList;

public final class LoyaltyWalletObject implements SafeParcelable {
    public static final Creator CREATOR = new C0558j();
    String f2421a;
    String f2422b;
    String f2423c;
    String f2424d;
    String f2425e;
    String f2426f;
    String f2427g;
    String f2428h;
    String f2429i;
    String f2430j;
    int f2431k;
    ArrayList f2432l;
    ju f2433m;
    ArrayList f2434n;
    String f2435o;
    String f2436p;
    ArrayList f2437q;
    boolean f2438r;
    ArrayList f2439s;
    ArrayList f2440t;
    ArrayList f2441u;
    jo f2442v;
    private final int f2443w;

    LoyaltyWalletObject() {
        this.f2443w = 4;
        this.f2432l = new ArrayList();
        this.f2434n = new ArrayList();
        this.f2437q = new ArrayList();
        this.f2439s = new ArrayList();
        this.f2440t = new ArrayList();
        this.f2441u = new ArrayList();
    }

    LoyaltyWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, ArrayList arrayList, ju juVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, jo joVar) {
        this.f2443w = i;
        this.f2421a = str;
        this.f2422b = str2;
        this.f2423c = str3;
        this.f2424d = str4;
        this.f2425e = str5;
        this.f2426f = str6;
        this.f2427g = str7;
        this.f2428h = str8;
        this.f2429i = str9;
        this.f2430j = str10;
        this.f2431k = i2;
        this.f2432l = arrayList;
        this.f2433m = juVar;
        this.f2434n = arrayList2;
        this.f2435o = str11;
        this.f2436p = str12;
        this.f2437q = arrayList3;
        this.f2438r = z;
        this.f2439s = arrayList4;
        this.f2440t = arrayList5;
        this.f2441u = arrayList6;
        this.f2442v = joVar;
    }

    public final int m3756a() {
        return this.f2443w;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0558j.m3818a(this, parcel, i);
    }
}
