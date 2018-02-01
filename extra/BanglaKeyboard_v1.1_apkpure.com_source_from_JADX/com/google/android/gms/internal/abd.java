package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class abd extends tc implements abc {
    public abd() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static abc zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof abc ? (abc) queryLocalInterface : new abe(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ch chVar = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface zzbk;
        boolean isReady;
        IBinder readStrongBinder;
        String mediationAdapterClassName;
        switch (i) {
            case 1:
                zzbk = zzbk();
                parcel2.writeNoException();
                uc.m6694a(parcel2, zzbk);
                break;
            case 2:
                destroy();
                parcel2.writeNoException();
                break;
            case 3:
                isReady = isReady();
                parcel2.writeNoException();
                uc.m6696a(parcel2, isReady);
                break;
            case 4:
                isReady = zzb((zzix) uc.m6693a(parcel, zzix.CREATOR));
                parcel2.writeNoException();
                uc.m6696a(parcel2, isReady);
                break;
            case 5:
                pause();
                parcel2.writeNoException();
                break;
            case 6:
                resume();
                parcel2.writeNoException();
                break;
            case 7:
                aaq com_google_android_gms_internal_aas;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    com_google_android_gms_internal_aas = zzbk instanceof aaq ? (aaq) zzbk : new aas(readStrongBinder);
                }
                zza(com_google_android_gms_internal_aas);
                parcel2.writeNoException();
                break;
            case 8:
                abh com_google_android_gms_internal_abj;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    com_google_android_gms_internal_abj = zzbk instanceof abh ? (abh) zzbk : new abj(readStrongBinder);
                }
                zza(com_google_android_gms_internal_abj);
                parcel2.writeNoException();
                break;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                break;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                break;
            case 11:
                zzbn();
                parcel2.writeNoException();
                break;
            case 12:
                Parcelable zzbl = zzbl();
                parcel2.writeNoException();
                uc.m6699b(parcel2, zzbl);
                break;
            case 13:
                zza((zzjb) uc.m6693a(parcel, zzjb.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                aop com_google_android_gms_internal_aoq;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    com_google_android_gms_internal_aoq = zzbk instanceof aop ? (aop) zzbk : new aoq(readStrongBinder);
                }
                zza(com_google_android_gms_internal_aoq);
                parcel2.writeNoException();
                break;
            case 15:
                aou com_google_android_gms_internal_aov;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    com_google_android_gms_internal_aov = zzbk instanceof aou ? (aou) zzbk : new aov(readStrongBinder);
                }
                zza(com_google_android_gms_internal_aov, parcel.readString());
                parcel2.writeNoException();
                break;
            case 18:
                mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                break;
            case 19:
                aei com_google_android_gms_internal_aek;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    com_google_android_gms_internal_aek = zzbk instanceof aei ? (aei) zzbk : new aek(readStrongBinder);
                }
                zza(com_google_android_gms_internal_aek);
                parcel2.writeNoException();
                break;
            case 20:
                aan com_google_android_gms_internal_aap;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    com_google_android_gms_internal_aap = zzbk instanceof aan ? (aan) zzbk : new aap(readStrongBinder);
                }
                zza(com_google_android_gms_internal_aap);
                parcel2.writeNoException();
                break;
            case 21:
                abn com_google_android_gms_internal_abp;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    com_google_android_gms_internal_abp = zzbk instanceof abn ? (abn) zzbk : new abp(readStrongBinder);
                }
                zza(com_google_android_gms_internal_abp);
                parcel2.writeNoException();
                break;
            case 22:
                setManualImpressionsEnabled(uc.m6697a(parcel));
                parcel2.writeNoException();
                break;
            case 23:
                isReady = isLoading();
                parcel2.writeNoException();
                uc.m6696a(parcel2, isReady);
                break;
            case 24:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    zzbk = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    chVar = zzbk instanceof ch ? (ch) zzbk : new cj(readStrongBinder);
                }
                zza(chVar);
                parcel2.writeNoException();
                break;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                break;
            case 26:
                zzbk = getVideoController();
                parcel2.writeNoException();
                uc.m6694a(parcel2, zzbk);
                break;
            case 29:
                zza((zzmd) uc.m6693a(parcel, zzmd.CREATOR));
                parcel2.writeNoException();
                break;
            case 30:
                zza((zzle) uc.m6693a(parcel, zzle.CREATOR));
                parcel2.writeNoException();
                break;
            case 31:
                mediationAdapterClassName = getAdUnitId();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                break;
            case 32:
                zzbk = zzbw();
                parcel2.writeNoException();
                uc.m6694a(parcel2, zzbk);
                break;
            case 33:
                zzbk = zzbx();
                parcel2.writeNoException();
                uc.m6694a(parcel2, zzbk);
                break;
            case 34:
                setImmersiveMode(uc.m6697a(parcel));
                parcel2.writeNoException();
                break;
            case 35:
                mediationAdapterClassName = zzch();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                break;
            default:
                return false;
        }
        return true;
    }
}
