package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public class PlusCommonExtras implements SafeParcelable {
    public static final C0510d CREATOR = new C0510d();
    public static String f2251a = "PlusCommonExtras";
    private final int f2252b;
    private String f2253c;
    private String f2254d;

    public PlusCommonExtras() {
        this.f2252b = 1;
        this.f2253c = "";
        this.f2254d = "";
    }

    PlusCommonExtras(int i, String str, String str2) {
        this.f2252b = i;
        this.f2253c = str;
        this.f2254d = str2;
    }

    public final int m3585a() {
        return this.f2252b;
    }

    public final String m3586b() {
        return this.f2253c;
    }

    public final String m3587c() {
        return this.f2254d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusCommonExtras)) {
            return false;
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
        return this.f2252b == plusCommonExtras.f2252b && jb.m2470a(this.f2253c, plusCommonExtras.f2253c) && jb.m2470a(this.f2254d, plusCommonExtras.f2254d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2252b), this.f2253c, this.f2254d});
    }

    public String toString() {
        return jb.m2469a(this).m2471a("versionCode", Integer.valueOf(this.f2252b)).m2471a("Gpsrc", this.f2253c).m2471a("ClientCallingPackage", this.f2254d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0510d.m3593a(this, parcel);
    }
}
