package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final C0407a CREATOR = new C0407a();
    List f2024a;
    long f2025b;
    long f2026c;
    private final int f2027d = 1;

    public ActivityRecognitionResult(List list, long j, long j2) {
        this.f2024a = list;
        this.f2025b = j;
        this.f2026c = j2;
    }

    public final int m2775a() {
        return this.f2027d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.f2024a + ", timeMillis=" + this.f2025b + ", elapsedRealtimeMillis=" + this.f2026c + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0407a.m2778a(this, parcel);
    }
}
