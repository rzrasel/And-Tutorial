package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public final class amq extends sd implements amo {
    amq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String mo1921a() {
        Parcel a = m3582a(2, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1922a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(11, b_);
    }

    public final List mo1923b() {
        Parcel a = m3582a(3, b_());
        List b = uc.m6698b(a);
        a.recycle();
        return b;
    }

    public final void mo1924b(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(12, b_);
    }

    public final String mo1925c() {
        Parcel a = m3582a(4, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1926c(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(16, b_);
    }

    public final afy mo1927d() {
        Parcel a = m3582a(5, b_());
        afy a2 = afz.m4268a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String mo1928e() {
        Parcel a = m3582a(6, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final double mo1929f() {
        Parcel a = m3582a(7, b_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final String mo1930g() {
        Parcel a = m3582a(8, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String mo1931h() {
        Parcel a = m3582a(9, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1932i() {
        m3583b(10, b_());
    }

    public final boolean mo1933j() {
        Parcel a = m3582a(13, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final boolean mo1934k() {
        Parcel a = m3582a(14, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final Bundle mo1935l() {
        Parcel a = m3582a(15, b_());
        Bundle bundle = (Bundle) uc.m6693a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final abv mo1936m() {
        Parcel a = m3582a(17, b_());
        abv a2 = abw.m4063a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C1398a mo1937n() {
        Parcel a = m3582a(18, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aft mo1938o() {
        Parcel a = m3582a(19, b_());
        aft a2 = afu.m4262a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C1398a mo1939p() {
        Parcel a = m3582a(20, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
