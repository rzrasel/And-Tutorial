package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class C1647s extends sd implements C1572q {
    C1647s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final zzaao mo2002a(zzaak com_google_android_gms_internal_zzaak) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzaak);
        Parcel a = m3582a(1, b_);
        zzaao com_google_android_gms_internal_zzaao = (zzaao) uc.m6693a(a, zzaao.CREATOR);
        a.recycle();
        return com_google_android_gms_internal_zzaao;
    }

    public final void mo2003a(zzaak com_google_android_gms_internal_zzaak, C1587t c1587t) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzaak);
        uc.m6694a(b_, (IInterface) c1587t);
        m3583b(2, b_);
    }

    public final void mo2004a(zzabd com_google_android_gms_internal_zzabd, C1655w c1655w) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzabd);
        uc.m6694a(b_, (IInterface) c1655w);
        m3583b(3, b_);
    }
}
