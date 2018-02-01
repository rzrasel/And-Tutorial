package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.je;

public final class ParticipantResult implements SafeParcelable {
    public static final C0344e CREATOR = new C0344e();
    private final int f803a;
    private final String f804b;
    private final int f805c;
    private final int f806d;

    public ParticipantResult(int i, String str, int i2, int i3) {
        boolean z;
        this.f803a = i;
        this.f804b = (String) je.m2473a((Object) str);
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        je.m2476a(z);
        this.f805c = i2;
        this.f806d = i3;
    }

    public ParticipantResult(String str, int i, int i2) {
        this(1, str, i, i2);
    }

    public final int m1455a() {
        return this.f803a;
    }

    public final String m1456b() {
        return this.f804b;
    }

    public final int m1457c() {
        return this.f805c;
    }

    public final int m1458d() {
        return this.f806d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0344e.m1465a(this, parcel);
    }
}
