package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class hg implements SafeParcelable {
    public static final lc CREATOR = new lc();
    final int f1568a;
    final List f1569b;
    private final String f1570c;
    private final boolean f1571d;
    private final Set f1572e;

    hg(int i, List list, String str, boolean z) {
        this.f1568a = i;
        this.f1569b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        if (str == null) {
            str = "";
        }
        this.f1570c = str;
        this.f1571d = z;
        if (this.f1569b.isEmpty()) {
            this.f1572e = Collections.emptySet();
        } else {
            this.f1572e = Collections.unmodifiableSet(new HashSet(this.f1569b));
        }
    }

    @Deprecated
    public final String m2152a() {
        return this.f1570c;
    }

    public final boolean m2153b() {
        return this.f1571d;
    }

    public final int describeContents() {
        lc lcVar = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        return this.f1572e.equals(hgVar.f1572e) && this.f1571d == hgVar.f1571d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1572e, Boolean.valueOf(this.f1571d)});
    }

    public final String toString() {
        return jb.m2469a(this).m2471a("types", this.f1572e).m2471a("requireOpenNow", Boolean.valueOf(this.f1571d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        lc lcVar = CREATOR;
        lc.m2531a(this, parcel);
    }
}
