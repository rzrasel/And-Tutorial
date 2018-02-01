package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public final class C0260b extends RuntimeException {
    public C0260b(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
