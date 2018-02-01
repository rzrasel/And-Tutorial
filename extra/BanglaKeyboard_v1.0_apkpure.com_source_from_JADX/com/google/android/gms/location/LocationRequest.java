package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class LocationRequest implements SafeParcelable {
    public static final C0410d CREATOR = new C0410d();
    int f2031a;
    long f2032b;
    long f2033c;
    boolean f2034d;
    long f2035e;
    int f2036f;
    float f2037g;
    private final int f2038h;

    public LocationRequest() {
        this.f2038h = 1;
        this.f2031a = 102;
        this.f2032b = 3600000;
        this.f2033c = 600000;
        this.f2034d = false;
        this.f2035e = Long.MAX_VALUE;
        this.f2036f = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2037g = 0.0f;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f) {
        this.f2038h = i;
        this.f2031a = i2;
        this.f2032b = j;
        this.f2033c = j2;
        this.f2034d = z;
        this.f2035e = j3;
        this.f2036f = i3;
        this.f2037g = f;
    }

    final int m2777a() {
        return this.f2038h;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f2031a == locationRequest.f2031a && this.f2032b == locationRequest.f2032b && this.f2033c == locationRequest.f2033c && this.f2034d == locationRequest.f2034d && this.f2035e == locationRequest.f2035e && this.f2036f == locationRequest.f2036f && this.f2037g == locationRequest.f2037g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2031a), Long.valueOf(this.f2032b), Long.valueOf(this.f2033c), Boolean.valueOf(this.f2034d), Long.valueOf(this.f2035e), Integer.valueOf(this.f2036f), Float.valueOf(this.f2037g)});
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append("Request[");
        switch (this.f2031a) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        append.append(str);
        if (this.f2031a != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.f2032b + "ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.f2033c + "ms");
        if (this.f2035e != Long.MAX_VALUE) {
            long elapsedRealtime = this.f2035e - SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(elapsedRealtime + "ms");
        }
        if (this.f2036f != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            stringBuilder.append(" num=").append(this.f2036f);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0410d.m2782a(this, parcel);
    }
}
