package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public final class aga extends sd implements afy {
    aga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final C1398a mo1750a() {
        Parcel a = m3582a(1, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Uri mo1751b() {
        Parcel a = m3582a(2, b_());
        Uri uri = (Uri) uc.m6693a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    public final double mo1752c() {
        Parcel a = m3582a(3, b_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
