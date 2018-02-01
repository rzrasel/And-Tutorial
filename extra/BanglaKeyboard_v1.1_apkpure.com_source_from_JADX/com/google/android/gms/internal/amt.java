package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public final class amt extends sd implements amr {
    amt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String mo1940a() {
        Parcel a = m3582a(2, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1941a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(9, b_);
    }

    public final List mo1942b() {
        Parcel a = m3582a(3, b_());
        List b = uc.m6698b(a);
        a.recycle();
        return b;
    }

    public final void mo1943b(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(10, b_);
    }

    public final String mo1944c() {
        Parcel a = m3582a(4, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1945c(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(14, b_);
    }

    public final afy mo1946d() {
        Parcel a = m3582a(5, b_());
        afy a2 = afz.m4268a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String mo1947e() {
        Parcel a = m3582a(6, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String mo1948f() {
        Parcel a = m3582a(7, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1949g() {
        m3583b(8, b_());
    }

    public final boolean mo1950h() {
        Parcel a = m3582a(11, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final boolean mo1951i() {
        Parcel a = m3582a(12, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final Bundle mo1952j() {
        Parcel a = m3582a(13, b_());
        Bundle bundle = (Bundle) uc.m6693a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final C1398a mo1953k() {
        Parcel a = m3582a(15, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final abv mo1954l() {
        Parcel a = m3582a(16, b_());
        abv a2 = abw.m4063a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aft mo1955m() {
        Parcel a = m3582a(19, b_());
        aft a2 = afu.m4262a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C1398a mo1956n() {
        Parcel a = m3582a(20, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
