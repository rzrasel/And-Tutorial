package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class InstrumentInfo implements SafeParcelable {
    public static final Creator CREATOR = new C0556h();
    private final int f2411a;
    private String f2412b;
    private String f2413c;

    InstrumentInfo(int i, String str, String str2) {
        this.f2411a = i;
        this.f2412b = str;
        this.f2413c = str2;
    }

    public final int m3752a() {
        return this.f2411a;
    }

    public final String m3753b() {
        return this.f2412b;
    }

    public final String m3754c() {
        return this.f2413c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0556h.m3816a(this, parcel);
    }
}
