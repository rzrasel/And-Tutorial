package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public class C0514h implements SafeParcelable {
    public static final C0513g CREATOR = new C0513g();
    private final int f2258a;
    private final String f2259b;
    private final String[] f2260c;
    private final String[] f2261d;
    private final String[] f2262e;
    private final String f2263f;
    private final String f2264g;
    private final String f2265h;
    private final String f2266i;
    private final PlusCommonExtras f2267j;

    C0514h(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.f2258a = i;
        this.f2259b = str;
        this.f2260c = strArr;
        this.f2261d = strArr2;
        this.f2262e = strArr3;
        this.f2263f = str2;
        this.f2264g = str3;
        this.f2265h = str4;
        this.f2266i = str5;
        this.f2267j = plusCommonExtras;
    }

    public final int m3597a() {
        return this.f2258a;
    }

    public final String m3598b() {
        return this.f2259b;
    }

    public final String[] m3599c() {
        return this.f2260c;
    }

    public final String[] m3600d() {
        return this.f2261d;
    }

    public int describeContents() {
        return 0;
    }

    public final String[] m3601e() {
        return this.f2262e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0514h)) {
            return false;
        }
        C0514h c0514h = (C0514h) obj;
        return this.f2258a == c0514h.f2258a && jb.m2470a(this.f2259b, c0514h.f2259b) && Arrays.equals(this.f2260c, c0514h.f2260c) && Arrays.equals(this.f2261d, c0514h.f2261d) && Arrays.equals(this.f2262e, c0514h.f2262e) && jb.m2470a(this.f2263f, c0514h.f2263f) && jb.m2470a(this.f2264g, c0514h.f2264g) && jb.m2470a(this.f2265h, c0514h.f2265h) && jb.m2470a(this.f2266i, c0514h.f2266i) && jb.m2470a(this.f2267j, c0514h.f2267j);
    }

    public final String m3602f() {
        return this.f2263f;
    }

    public final String m3603g() {
        return this.f2264g;
    }

    public final String m3604h() {
        return this.f2265h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2258a), this.f2259b, this.f2260c, this.f2261d, this.f2262e, this.f2263f, this.f2264g, this.f2265h, this.f2266i, this.f2267j});
    }

    public final String m3605i() {
        return this.f2266i;
    }

    public final PlusCommonExtras m3606j() {
        return this.f2267j;
    }

    public String toString() {
        return jb.m2469a(this).m2471a("versionCode", Integer.valueOf(this.f2258a)).m2471a("accountName", this.f2259b).m2471a("requestedScopes", this.f2260c).m2471a("visibleActivities", this.f2261d).m2471a("requiredFeatures", this.f2262e).m2471a("packageNameForAuth", this.f2263f).m2471a("callingPackageName", this.f2264g).m2471a("applicationName", this.f2265h).m2471a("extra", this.f2267j.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0513g.m3596a(this, parcel, i);
    }
}
