package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;

public final class Scope extends zzbcc implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C1484a();
    private int f4512a;
    private final String f4513b;

    Scope(int i, String str) {
        C1516t.m3863a(str, (Object) "scopeUri must not be null or empty");
        this.f4512a = i;
        this.f4513b = str;
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.f4513b.equals(((Scope) obj).f4513b);
    }

    public final int hashCode() {
        return this.f4513b.hashCode();
    }

    public final String toString() {
        return this.f4513b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f4512a);
        li.m5961a(parcel, 2, this.f4513b);
        li.m5967b(parcel, a);
    }
}
