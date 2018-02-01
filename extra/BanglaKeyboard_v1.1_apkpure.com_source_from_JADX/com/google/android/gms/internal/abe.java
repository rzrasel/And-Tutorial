package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public final class abe extends sd implements abc {
    abe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void destroy() {
        m3583b(2, b_());
    }

    public final String getAdUnitId() {
        Parcel a = m3582a(31, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getMediationAdapterClassName() {
        Parcel a = m3582a(18, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final abv getVideoController() {
        abv com_google_android_gms_internal_abv;
        Parcel a = m3582a(26, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_abv = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            com_google_android_gms_internal_abv = queryLocalInterface instanceof abv ? (abv) queryLocalInterface : new aby(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_abv;
    }

    public final boolean isLoading() {
        Parcel a = m3582a(23, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final boolean isReady() {
        Parcel a = m3582a(3, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final void pause() {
        m3583b(5, b_());
    }

    public final void resume() {
        m3583b(6, b_());
    }

    public final void setImmersiveMode(boolean z) {
        Parcel b_ = b_();
        uc.m6696a(b_, z);
        m3583b(34, b_);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Parcel b_ = b_();
        uc.m6696a(b_, z);
        m3583b(22, b_);
    }

    public final void setUserId(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        m3583b(25, b_);
    }

    public final void showInterstitial() {
        m3583b(9, b_());
    }

    public final void stopLoading() {
        m3583b(10, b_());
    }

    public final void zza(aan com_google_android_gms_internal_aan) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aan);
        m3583b(20, b_);
    }

    public final void zza(aaq com_google_android_gms_internal_aaq) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aaq);
        m3583b(7, b_);
    }

    public final void zza(abh com_google_android_gms_internal_abh) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_abh);
        m3583b(8, b_);
    }

    public final void zza(abn com_google_android_gms_internal_abn) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_abn);
        m3583b(21, b_);
    }

    public final void zza(aei com_google_android_gms_internal_aei) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aei);
        m3583b(19, b_);
    }

    public final void zza(aop com_google_android_gms_internal_aop) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aop);
        m3583b(14, b_);
    }

    public final void zza(aou com_google_android_gms_internal_aou, String str) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aou);
        b_.writeString(str);
        m3583b(15, b_);
    }

    public final void zza(ch chVar) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) chVar);
        m3583b(24, b_);
    }

    public final void zza(zzjb com_google_android_gms_internal_zzjb) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        m3583b(13, b_);
    }

    public final void zza(zzle com_google_android_gms_internal_zzle) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzle);
        m3583b(30, b_);
    }

    public final void zza(zzmd com_google_android_gms_internal_zzmd) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzmd);
        m3583b(29, b_);
    }

    public final boolean zzb(zzix com_google_android_gms_internal_zzix) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_ = m3582a(4, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }

    public final C1398a zzbk() {
        Parcel a = m3582a(1, b_());
        C1398a a2 = C1399a.m3581a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final zzjb zzbl() {
        Parcel a = m3582a(12, b_());
        zzjb com_google_android_gms_internal_zzjb = (zzjb) uc.m6693a(a, zzjb.CREATOR);
        a.recycle();
        return com_google_android_gms_internal_zzjb;
    }

    public final void zzbn() {
        m3583b(11, b_());
    }

    public final abh zzbw() {
        abh com_google_android_gms_internal_abh;
        Parcel a = m3582a(32, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_abh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            com_google_android_gms_internal_abh = queryLocalInterface instanceof abh ? (abh) queryLocalInterface : new abj(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_abh;
    }

    public final aaq zzbx() {
        aaq com_google_android_gms_internal_aaq;
        Parcel a = m3582a(33, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_aaq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            com_google_android_gms_internal_aaq = queryLocalInterface instanceof aaq ? (aaq) queryLocalInterface : new aas(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_aaq;
    }

    public final String zzch() {
        Parcel a = m3582a(35, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
