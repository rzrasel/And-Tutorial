package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.sd;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public final class C1510l extends sd implements C1495j {
    C1510l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final C1398a mo1651a() {
        Parcel a = m3582a(1, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int mo1652b() {
        Parcel a = m3582a(2, b_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
