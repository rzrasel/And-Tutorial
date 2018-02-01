package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public final class agj extends sd implements agh {
    agj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public final String mo1753a() {
        Parcel a = m3582a(3, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1754a(Bundle bundle) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) bundle);
        m3583b(14, b_);
    }

    public final List mo1756b() {
        Parcel a = m3582a(4, b_());
        List b = uc.m6698b(a);
        a.recycle();
        return b;
    }

    public final boolean mo1757b(Bundle bundle) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) bundle);
        b_ = m3582a(15, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }

    public final String mo1758c() {
        Parcel a = m3582a(5, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1759c(Bundle bundle) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) bundle);
        m3583b(16, b_);
    }

    public final afy mo1760d() {
        afy com_google_android_gms_internal_afy;
        Parcel a = m3582a(6, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_afy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            com_google_android_gms_internal_afy = queryLocalInterface instanceof afy ? (afy) queryLocalInterface : new aga(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_afy;
    }

    public final String mo1761e() {
        Parcel a = m3582a(7, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final double mo1762f() {
        Parcel a = m3582a(8, b_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final String mo1763g() {
        Parcel a = m3582a(9, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String mo1764h() {
        Parcel a = m3582a(10, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final abv mo1765i() {
        Parcel a = m3582a(13, b_());
        abv a2 = abw.m4063a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C1398a mo1766j() {
        Parcel a = m3582a(2, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Bundle mo1770n() {
        Parcel a = m3582a(11, b_());
        Bundle bundle = (Bundle) uc.m6693a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final aft mo1772p() {
        aft com_google_android_gms_internal_aft;
        Parcel a = m3582a(17, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_aft = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            com_google_android_gms_internal_aft = queryLocalInterface instanceof aft ? (aft) queryLocalInterface : new afw(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_aft;
    }

    public final void mo1773q() {
        m3583b(12, b_());
    }
}
