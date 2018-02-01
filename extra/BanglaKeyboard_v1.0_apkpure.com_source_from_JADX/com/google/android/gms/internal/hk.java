package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class hk implements SafeParcelable {
    public static final le CREATOR = new le();
    static final long f1578a = TimeUnit.HOURS.toMillis(1);
    final int f1579b;
    private final hg f1580c;
    private final long f1581d;
    private final int f1582e;

    public hk(int i, hg hgVar, long j, int i2) {
        this.f1579b = i;
        this.f1580c = hgVar;
        this.f1581d = j;
        this.f1582e = i2;
    }

    public final hg m2158a() {
        return this.f1580c;
    }

    public final long m2159b() {
        return this.f1581d;
    }

    public final int m2160c() {
        return this.f1582e;
    }

    public final int describeContents() {
        le leVar = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        return this.f1580c.equals(hkVar.f1580c) && this.f1581d == hkVar.f1581d && this.f1582e == hkVar.f1582e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1580c, Long.valueOf(this.f1581d), Integer.valueOf(this.f1582e)});
    }

    public final String toString() {
        return jb.m2469a(this).m2471a("filter", this.f1580c).m2471a("interval", Long.valueOf(this.f1581d)).m2471a("priority", Integer.valueOf(this.f1582e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        le leVar = CREATOR;
        le.m2533a(this, parcel, i);
    }
}
