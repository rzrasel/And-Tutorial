package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public final class amh extends sd implements amf {
    amh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final C1398a mo1895a() {
        Parcel a = m3582a(2, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void mo1896a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(21, b_);
    }

    public final void mo1897a(C1398a c1398a, dd ddVar, List<String> list) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6694a(b_, (IInterface) ddVar);
        b_.writeStringList(list);
        m3583b(23, b_);
    }

    public final void mo1898a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, ami com_google_android_gms_internal_ami) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_ami);
        m3583b(3, b_);
    }

    public final void mo1899a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, dd ddVar, String str2) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) ddVar);
        b_.writeString(str2);
        m3583b(10, b_);
    }

    public final void mo1900a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        b_.writeString(str2);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_ami);
        m3583b(7, b_);
    }

    public final void mo1901a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami, zzot com_google_android_gms_internal_zzot, List<String> list) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        b_.writeString(str2);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_ami);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzot);
        b_.writeStringList(list);
        m3583b(14, b_);
    }

    public final void mo1902a(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, zzix com_google_android_gms_internal_zzix, String str, ami com_google_android_gms_internal_ami) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_ami);
        m3583b(1, b_);
    }

    public final void mo1903a(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        b_.writeString(str2);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_ami);
        m3583b(6, b_);
    }

    public final void mo1904a(zzix com_google_android_gms_internal_zzix, String str) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        m3583b(11, b_);
    }

    public final void mo1905a(zzix com_google_android_gms_internal_zzix, String str, String str2) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeString(str);
        b_.writeString(str2);
        m3583b(20, b_);
    }

    public final void mo1906a(boolean z) {
        Parcel b_ = b_();
        uc.m6696a(b_, z);
        m3583b(25, b_);
    }

    public final void mo1907b() {
        m3583b(4, b_());
    }

    public final void mo1908c() {
        m3583b(5, b_());
    }

    public final void mo1909d() {
        m3583b(8, b_());
    }

    public final void mo1910e() {
        m3583b(9, b_());
    }

    public final void mo1911f() {
        m3583b(12, b_());
    }

    public final boolean mo1912g() {
        Parcel a = m3582a(13, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final amo mo1913h() {
        amo com_google_android_gms_internal_amo;
        Parcel a = m3582a(15, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_amo = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            com_google_android_gms_internal_amo = queryLocalInterface instanceof amo ? (amo) queryLocalInterface : new amq(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_amo;
    }

    public final amr mo1914i() {
        amr com_google_android_gms_internal_amr;
        Parcel a = m3582a(16, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_amr = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            com_google_android_gms_internal_amr = queryLocalInterface instanceof amr ? (amr) queryLocalInterface : new amt(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_amr;
    }

    public final Bundle mo1915j() {
        Parcel a = m3582a(17, b_());
        Bundle bundle = (Bundle) uc.m6693a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle mo1916k() {
        Parcel a = m3582a(18, b_());
        Bundle bundle = (Bundle) uc.m6693a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle mo1917l() {
        Parcel a = m3582a(19, b_());
        Bundle bundle = (Bundle) uc.m6693a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final boolean mo1918m() {
        Parcel a = m3582a(22, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final agp mo1919n() {
        Parcel a = m3582a(24, b_());
        agp a2 = agq.m4363a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final abv mo1920o() {
        Parcel a = m3582a(26, b_());
        abv a2 = abw.m4063a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
