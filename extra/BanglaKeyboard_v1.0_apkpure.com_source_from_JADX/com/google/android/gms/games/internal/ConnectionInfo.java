package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConnectionInfo implements SafeParcelable {
    public static final C0332a CREATOR = new C0332a();
    private final int f752a;
    private final String f753b;
    private final int f754c;

    public ConnectionInfo(int i, String str, int i2) {
        this.f752a = i;
        this.f753b = str;
        this.f754c = i2;
    }

    public final int m1264a() {
        return this.f752a;
    }

    public final String m1265b() {
        return this.f753b;
    }

    public final int m1266c() {
        return this.f754c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0332a.m1267a(this, parcel);
    }
}
