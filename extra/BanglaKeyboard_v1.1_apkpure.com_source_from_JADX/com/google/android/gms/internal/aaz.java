package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class aaz extends sd implements aax {
    aaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) publisherAdViewOptions);
        m3583b(9, b_);
    }

    public final void zza(agt com_google_android_gms_internal_agt) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_agt);
        m3583b(3, b_);
    }

    public final void zza(agx com_google_android_gms_internal_agx) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_agx);
        m3583b(4, b_);
    }

    public final void zza(ahg com_google_android_gms_internal_ahg, zzjb com_google_android_gms_internal_zzjb) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_ahg);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        m3583b(8, b_);
    }

    public final void zza(zzot com_google_android_gms_internal_zzot) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzot);
        m3583b(6, b_);
    }

    public final void zza(String str, ahd com_google_android_gms_internal_ahd, aha com_google_android_gms_internal_aha) {
        Parcel b_ = b_();
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_ahd);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aha);
        m3583b(5, b_);
    }

    public final void zzb(aaq com_google_android_gms_internal_aaq) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aaq);
        m3583b(2, b_);
    }

    public final void zzb(abn com_google_android_gms_internal_abn) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_abn);
        m3583b(7, b_);
    }

    public final aat zzcy() {
        aat com_google_android_gms_internal_aat;
        Parcel a = m3582a(1, b_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_aat = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            com_google_android_gms_internal_aat = queryLocalInterface instanceof aat ? (aat) queryLocalInterface : new aav(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_aat;
    }
}
