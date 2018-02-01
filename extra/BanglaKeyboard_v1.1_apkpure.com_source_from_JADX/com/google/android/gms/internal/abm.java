package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;

public final class abm extends sd implements abk {
    abm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final aax createAdLoaderBuilder(C1398a c1398a, String str, amc com_google_android_gms_internal_amc, int i) {
        aax com_google_android_gms_internal_aax;
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_amc);
        b_.writeInt(i);
        Parcel a = m3582a(3, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_aax = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            com_google_android_gms_internal_aax = queryLocalInterface instanceof aax ? (aax) queryLocalInterface : new aaz(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_aax;
    }

    public final aoi createAdOverlay(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_ = m3582a(8, b_);
        aoi zzt = aoj.zzt(b_.readStrongBinder());
        b_.recycle();
        return zzt;
    }

    public final abc createBannerAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, int i) {
        abc com_google_android_gms_internal_abc;
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_amc);
        b_.writeInt(i);
        Parcel a = m3582a(1, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_abc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            com_google_android_gms_internal_abc = queryLocalInterface instanceof abc ? (abc) queryLocalInterface : new abe(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_abc;
    }

    public final aor createInAppPurchaseManager(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_ = m3582a(7, b_);
        aor a = aos.m5012a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }

    public final abc createInterstitialAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, int i) {
        abc com_google_android_gms_internal_abc;
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_amc);
        b_.writeInt(i);
        Parcel a = m3582a(2, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_abc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            com_google_android_gms_internal_abc = queryLocalInterface instanceof abc ? (abc) queryLocalInterface : new abe(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_abc;
    }

    public final agc createNativeAdViewDelegate(C1398a c1398a, C1398a c1398a2) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6694a(b_, (IInterface) c1398a2);
        b_ = m3582a(5, b_);
        agc a = agd.m4146a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }

    public final cc createRewardedVideoAd(C1398a c1398a, amc com_google_android_gms_internal_amc, int i) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_amc);
        b_.writeInt(i);
        b_ = m3582a(6, b_);
        cc a = cd.m4165a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }

    public final abc createSearchAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, int i) {
        abc com_google_android_gms_internal_abc;
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        b_.writeString(str);
        b_.writeInt(i);
        Parcel a = m3582a(10, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_abc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            com_google_android_gms_internal_abc = queryLocalInterface instanceof abc ? (abc) queryLocalInterface : new abe(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_abc;
    }

    public final abq getMobileAdsSettingsManager(C1398a c1398a) {
        abq com_google_android_gms_internal_abq;
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        Parcel a = m3582a(4, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_abq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            com_google_android_gms_internal_abq = queryLocalInterface instanceof abq ? (abq) queryLocalInterface : new abs(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_abq;
    }

    public final abq getMobileAdsSettingsManagerWithClientJarVersion(C1398a c1398a, int i) {
        abq com_google_android_gms_internal_abq;
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeInt(i);
        Parcel a = m3582a(9, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_abq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            com_google_android_gms_internal_abq = queryLocalInterface instanceof abq ? (abq) queryLocalInterface : new abs(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_abq;
    }
}
