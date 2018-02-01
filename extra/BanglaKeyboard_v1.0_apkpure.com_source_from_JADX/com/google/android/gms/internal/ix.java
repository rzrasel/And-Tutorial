package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ix implements SafeParcelable {
    public static final Creator CREATOR = new lw();
    String[] f1841a;
    byte[][] f1842b;
    private final int f1843c;

    ix() {
        this(1, new String[0], new byte[0][]);
    }

    ix(int i, String[] strArr, byte[][] bArr) {
        this.f1843c = i;
        this.f1841a = strArr;
        this.f1842b = bArr;
    }

    public final int m2465a() {
        return this.f1843c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        lw.m2561a(this, parcel);
    }
}
