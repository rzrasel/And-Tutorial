package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public final class vz extends sd implements vw {
    vz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    public final C1398a mo2295a(C1398a c1398a, C1398a c1398a2) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6694a(b_, (IInterface) c1398a2);
        b_ = m3582a(6, b_);
        C1398a a = C1399a.m3581a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }

    public final String mo2296a() {
        Parcel a = m3582a(1, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String mo2297a(C1398a c1398a, String str) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        b_ = m3582a(8, b_);
        String readString = b_.readString();
        b_.recycle();
        return readString;
    }

    public final String mo2298a(C1398a c1398a, byte[] bArr) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeByteArray(bArr);
        b_ = m3582a(12, b_);
        String readString = b_.readString();
        b_.recycle();
        return readString;
    }

    public final void mo2299a(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        m3583b(5, b_);
    }

    public final void mo2300a(String str, String str2) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        m3583b(2, b_);
    }

    public final boolean mo2301a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_ = m3582a(3, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }

    public final boolean mo2302a(String str, boolean z) {
        Parcel b_ = b_();
        b_.writeString(str);
        uc.m6696a(b_, z);
        b_ = m3582a(11, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }

    public final C1398a mo2303b(C1398a c1398a, C1398a c1398a2) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6694a(b_, (IInterface) c1398a2);
        b_ = m3582a(10, b_);
        C1398a a = C1399a.m3581a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }

    public final boolean mo2304b(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_ = m3582a(4, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }

    public final String mo2305c(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_ = m3582a(7, b_);
        String readString = b_.readString();
        b_.recycle();
        return readString;
    }

    public final void mo2306d(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(9, b_);
    }
}
