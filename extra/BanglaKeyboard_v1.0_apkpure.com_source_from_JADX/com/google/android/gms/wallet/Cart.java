package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class Cart implements SafeParcelable {
    public static final Creator CREATOR = new C0542b();
    String f2390a;
    String f2391b;
    ArrayList f2392c;
    private final int f2393d;

    Cart() {
        this.f2393d = 1;
        this.f2392c = new ArrayList();
    }

    Cart(int i, String str, String str2, ArrayList arrayList) {
        this.f2393d = i;
        this.f2390a = str;
        this.f2391b = str2;
        this.f2392c = arrayList;
    }

    public final int m3748a() {
        return this.f2393d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0542b.m3762a(this, parcel);
    }
}
