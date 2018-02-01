package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable {
    public static final C0409c CREATOR = new C0409c();
    int f2028a;
    int f2029b;
    private final int f2030c;

    public DetectedActivity(int i, int i2, int i3) {
        this.f2030c = i;
        this.f2028a = i2;
        this.f2029b = i3;
    }

    public final int m2776a() {
        return this.f2030c;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DetectedActivity [type=");
        int i = this.f2028a;
        if (i > 8) {
            i = 4;
        }
        return stringBuilder.append(i).append(", confidence=").append(this.f2029b).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0409c.m2781a(this, parcel);
    }
}
