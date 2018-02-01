package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class afw extends sd implements aft {
    afw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String mo1748a() {
        Parcel a = m3582a(2, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List<afy> mo1749b() {
        Parcel a = m3582a(3, b_());
        List b = uc.m6698b(a);
        a.recycle();
        return b;
    }
}
