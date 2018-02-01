package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kk implements SafeParcelable {
    public static final Creator CREATOR = new mu();
    final int f1918a;
    private final String f1919b;
    private final String f1920c;

    kk(int i, String str, String str2) {
        this.f1918a = i;
        this.f1919b = str;
        this.f1920c = str2;
    }

    public final String m2523a() {
        return this.f1919b;
    }

    public final String m2524b() {
        return this.f1920c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj;
        return kkVar.f1919b.equals(this.f1919b) && kkVar.f1920c.equals(this.f1920c);
    }

    public int hashCode() {
        return ((this.f1919b.hashCode() + 629) * 37) + this.f1920c.hashCode();
    }

    public String toString() {
        return "NodeParcelable{" + this.f1919b + "," + this.f1920c + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        mu.m2629a(this, parcel);
    }
}
