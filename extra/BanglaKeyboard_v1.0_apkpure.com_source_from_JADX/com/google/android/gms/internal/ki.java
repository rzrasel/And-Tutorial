package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ki implements SafeParcelable {
    public static final Creator CREATOR = new mt();
    final int f1913a;
    private final int f1914b;
    private final String f1915c;
    private final byte[] f1916d;
    private final String f1917e;

    ki(int i, int i2, String str, byte[] bArr, String str2) {
        this.f1913a = i;
        this.f1914b = i2;
        this.f1915c = str;
        this.f1916d = bArr;
        this.f1917e = str2;
    }

    public final int m2519a() {
        return this.f1914b;
    }

    public final String m2520b() {
        return this.f1915c;
    }

    public final byte[] m2521c() {
        return this.f1916d;
    }

    public final String m2522d() {
        return this.f1917e;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MessageEventParcelable[" + this.f1914b + "," + this.f1915c + (this.f1916d == null ? "null" : Integer.valueOf(this.f1916d.length)) + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        mt.m2628a(this, parcel);
    }
}
