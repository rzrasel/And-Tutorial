package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public abstract class aay extends tc implements aax {
    public aay() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ahg com_google_android_gms_internal_ahg = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface zzcy;
        IBinder readStrongBinder;
        switch (i) {
            case 1:
                zzcy = zzcy();
                parcel2.writeNoException();
                uc.m6694a(parcel2, zzcy);
                break;
            case 2:
                aaq com_google_android_gms_internal_aaq;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    com_google_android_gms_internal_aaq = null;
                } else {
                    zzcy = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    com_google_android_gms_internal_aaq = zzcy instanceof aaq ? (aaq) zzcy : new aas(readStrongBinder);
                }
                zzb(com_google_android_gms_internal_aaq);
                parcel2.writeNoException();
                break;
            case 3:
                agt com_google_android_gms_internal_agv;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzcy = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    com_google_android_gms_internal_agv = zzcy instanceof agt ? (agt) zzcy : new agv(readStrongBinder);
                }
                zza(com_google_android_gms_internal_agv);
                parcel2.writeNoException();
                break;
            case 4:
                agx com_google_android_gms_internal_agz;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzcy = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    com_google_android_gms_internal_agz = zzcy instanceof agx ? (agx) zzcy : new agz(readStrongBinder);
                }
                zza(com_google_android_gms_internal_agz);
                parcel2.writeNoException();
                break;
            case 5:
                ahd com_google_android_gms_internal_ahd;
                aha com_google_android_gms_internal_ahc;
                String readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    com_google_android_gms_internal_ahd = null;
                } else {
                    zzcy = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if (zzcy instanceof ahd) {
                        com_google_android_gms_internal_ahd = (ahd) zzcy;
                    } else {
                        Object com_google_android_gms_internal_ahf = new ahf(readStrongBinder);
                    }
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    zzcy = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    com_google_android_gms_internal_ahc = zzcy instanceof aha ? (aha) zzcy : new ahc(readStrongBinder2);
                }
                zza(readString, com_google_android_gms_internal_ahd, com_google_android_gms_internal_ahc);
                parcel2.writeNoException();
                break;
            case 6:
                zza((zzot) uc.m6693a(parcel, zzot.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                abn com_google_android_gms_internal_abp;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzcy = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    com_google_android_gms_internal_abp = zzcy instanceof abn ? (abn) zzcy : new abp(readStrongBinder);
                }
                zzb(com_google_android_gms_internal_abp);
                parcel2.writeNoException();
                break;
            case 8:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzcy = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    com_google_android_gms_internal_ahg = zzcy instanceof ahg ? (ahg) zzcy : new ahi(readStrongBinder);
                }
                zza(com_google_android_gms_internal_ahg, (zzjb) uc.m6693a(parcel, zzjb.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                zza((PublisherAdViewOptions) uc.m6693a(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
