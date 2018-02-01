package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class MaskedWalletRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0560l();
    String f2456a;
    boolean f2457b;
    boolean f2458c;
    boolean f2459d;
    String f2460e;
    String f2461f;
    String f2462g;
    Cart f2463h;
    boolean f2464i;
    boolean f2465j;
    CountrySpecification[] f2466k;
    boolean f2467l;
    boolean f2468m;
    ArrayList f2469n;
    private final int f2470o;

    MaskedWalletRequest() {
        this.f2470o = 3;
        this.f2467l = true;
        this.f2468m = true;
    }

    MaskedWalletRequest(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList arrayList) {
        this.f2470o = i;
        this.f2456a = str;
        this.f2457b = z;
        this.f2458c = z2;
        this.f2459d = z3;
        this.f2460e = str2;
        this.f2461f = str3;
        this.f2462g = str4;
        this.f2463h = cart;
        this.f2464i = z4;
        this.f2465j = z5;
        this.f2466k = countrySpecificationArr;
        this.f2467l = z6;
        this.f2468m = z7;
        this.f2469n = arrayList;
    }

    public final int m3758a() {
        return this.f2470o;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0560l.m3820a(this, parcel, i);
    }
}
