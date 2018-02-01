package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem implements SafeParcelable {
    public static final Creator CREATOR = new C0557i();
    String f2414a;
    String f2415b;
    String f2416c;
    String f2417d;
    int f2418e;
    String f2419f;
    private final int f2420g;

    LineItem() {
        this.f2420g = 1;
        this.f2418e = 0;
    }

    LineItem(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.f2420g = i;
        this.f2414a = str;
        this.f2415b = str2;
        this.f2416c = str3;
        this.f2417d = str4;
        this.f2418e = i2;
        this.f2419f = str5;
    }

    public final int m3755a() {
        return this.f2420g;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0557i.m3817a(this, parcel);
    }
}
