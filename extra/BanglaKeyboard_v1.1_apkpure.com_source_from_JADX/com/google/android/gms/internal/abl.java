package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class abl extends tc implements abk {
    public abl() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static abk asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof abk ? (abk) queryLocalInterface : new abm(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface createBannerAdManager;
        switch (i) {
            case 1:
                createBannerAdManager = createBannerAdManager(C1399a.m3581a(parcel.readStrongBinder()), (zzjb) uc.m6693a(parcel, zzjb.CREATOR), parcel.readString(), amd.m4741a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 2:
                createBannerAdManager = createInterstitialAdManager(C1399a.m3581a(parcel.readStrongBinder()), (zzjb) uc.m6693a(parcel, zzjb.CREATOR), parcel.readString(), amd.m4741a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 3:
                createBannerAdManager = createAdLoaderBuilder(C1399a.m3581a(parcel.readStrongBinder()), parcel.readString(), amd.m4741a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 4:
                createBannerAdManager = getMobileAdsSettingsManager(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 5:
                createBannerAdManager = createNativeAdViewDelegate(C1399a.m3581a(parcel.readStrongBinder()), C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 6:
                createBannerAdManager = createRewardedVideoAd(C1399a.m3581a(parcel.readStrongBinder()), amd.m4741a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 7:
                createBannerAdManager = createInAppPurchaseManager(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 8:
                createBannerAdManager = createAdOverlay(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 9:
                createBannerAdManager = getMobileAdsSettingsManagerWithClientJarVersion(C1399a.m3581a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            case 10:
                createBannerAdManager = createSearchAdManager(C1399a.m3581a(parcel.readStrongBinder()), (zzjb) uc.m6693a(parcel, zzjb.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                uc.m6694a(parcel2, createBannerAdManager);
                break;
            default:
                return false;
        }
        return true;
    }
}
