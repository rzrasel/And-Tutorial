package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class C0408b implements SafeParcelable {
    public static final C0411e CREATOR = new C0411e();
    int f2039a;
    int f2040b;
    long f2041c;
    private final int f2042d;

    C0408b(int i, int i2, int i3, long j) {
        this.f2042d = i;
        this.f2039a = i2;
        this.f2040b = i3;
        this.f2041c = j;
    }

    private static String m2779a(int i) {
        switch (i) {
            case 0:
                return "STATUS_SUCCESSFUL";
            case 2:
                return "STATUS_TIMED_OUT_ON_SCAN";
            case 3:
                return "STATUS_NO_INFO_IN_DATABASE";
            case 4:
                return "STATUS_INVALID_SCAN";
            case 5:
                return "STATUS_UNABLE_TO_QUERY_DATABASE";
            case 6:
                return "STATUS_SCANS_DISABLED_IN_SETTINGS";
            case 7:
                return "STATUS_LOCATION_DISABLED_IN_SETTINGS";
            case 8:
                return "STATUS_IN_PROGRESS";
            default:
                return "STATUS_UNKNOWN";
        }
    }

    final int m2780a() {
        return this.f2042d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0408b)) {
            return false;
        }
        C0408b c0408b = (C0408b) obj;
        return this.f2039a == c0408b.f2039a && this.f2040b == c0408b.f2040b && this.f2041c == c0408b.f2041c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2039a), Integer.valueOf(this.f2040b), Long.valueOf(this.f2041c)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationStatus[cell status: ").append(C0408b.m2779a(this.f2039a));
        stringBuilder.append(", wifi status: ").append(C0408b.m2779a(this.f2040b));
        stringBuilder.append(", elapsed realtime ns: ").append(this.f2041c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0411e.m2783a(this, parcel);
    }
}
