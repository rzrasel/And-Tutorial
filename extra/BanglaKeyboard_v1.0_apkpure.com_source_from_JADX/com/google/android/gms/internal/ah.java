package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class ah implements SafeParcelable {
    public static final C0400o CREATOR = new C0400o();
    public final int f914a;
    public final long f915b;
    public final Bundle f916c;
    public final int f917d;
    public final List f918e;
    public final boolean f919f;
    public final int f920g;
    public final boolean f921h;
    public final String f922i;
    public final av f923j;
    public final Location f924k;
    public final String f925l;

    public ah(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, av avVar, Location location, String str2) {
        this.f914a = i;
        this.f915b = j;
        this.f916c = bundle;
        this.f917d = i2;
        this.f918e = list;
        this.f919f = z;
        this.f920g = i3;
        this.f921h = z2;
        this.f922i = str;
        this.f923j = avVar;
        this.f924k = location;
        this.f925l = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0400o.m2749a(this, parcel, i);
    }
}
