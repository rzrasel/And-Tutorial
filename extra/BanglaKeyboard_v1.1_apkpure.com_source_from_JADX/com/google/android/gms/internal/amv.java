package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@aqv
public final class amv extends amg {
    private final MediationAdapter f5401a;
    private amw f5402b;

    public amv(MediationAdapter mediationAdapter) {
        this.f5401a = mediationAdapter;
    }

    private final Bundle m4884a(String str, zzix com_google_android_gms_internal_zzix, String str2) {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    valueOf = (String) keys.next();
                    bundle2.putString(valueOf, jSONObject.getString(valueOf));
                }
                bundle = bundle2;
            }
            if (this.f5401a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (com_google_android_gms_internal_zzix != null) {
                    bundle.putInt("tagForChildDirectedTreatment", com_google_android_gms_internal_zzix.f7746g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            id.m5371a("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final C1398a mo1895a() {
        if (this.f5401a instanceof MediationBannerAdapter) {
            try {
                return C1401c.m3584a(((MediationBannerAdapter) this.f5401a).getBannerView());
            } catch (Throwable th) {
                id.m5371a("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void mo1896a(C1398a c1398a) {
        try {
            ((OnContextChangedListener) this.f5401a).onContextChanged((Context) C1401c.m3585a(c1398a));
        } catch (Throwable th) {
            id.m5372a(3);
        }
    }

    public final void mo1897a(C1398a c1398a, dd ddVar, List<String> list) {
        String str;
        if (this.f5401a instanceof InitializableMediationRewardedVideoAdAdapter) {
            id.m5372a(3);
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f5401a;
                List arrayList = new ArrayList();
                for (String str2 : list) {
                    arrayList.add(m4884a(str2, null, null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) C1401c.m3585a(c1398a), new dg(ddVar), arrayList);
            } catch (Throwable th) {
                id.m5371a("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            str2 = "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            throw new RemoteException();
        }
    }

    public final void mo1898a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, ami com_google_android_gms_internal_ami) {
        mo1900a(c1398a, com_google_android_gms_internal_zzix, str, null, com_google_android_gms_internal_ami);
    }

    public final void mo1899a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, dd ddVar, String str2) {
        if (this.f5401a instanceof MediationRewardedVideoAdAdapter) {
            id.m5372a(3);
            try {
                Bundle bundle;
                MediationAdRequest mediationAdRequest;
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5401a;
                Bundle a = m4884a(str2, com_google_android_gms_internal_zzix, null);
                if (com_google_android_gms_internal_zzix != null) {
                    amu com_google_android_gms_internal_amu = new amu(com_google_android_gms_internal_zzix.f7741b == -1 ? null : new Date(com_google_android_gms_internal_zzix.f7741b), com_google_android_gms_internal_zzix.f7743d, com_google_android_gms_internal_zzix.f7744e != null ? new HashSet(com_google_android_gms_internal_zzix.f7744e) : null, com_google_android_gms_internal_zzix.f7750k, com_google_android_gms_internal_zzix.f7745f, com_google_android_gms_internal_zzix.f7746g, com_google_android_gms_internal_zzix.f7757r);
                    if (com_google_android_gms_internal_zzix.f7752m != null) {
                        bundle = com_google_android_gms_internal_zzix.f7752m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                        mediationAdRequest = com_google_android_gms_internal_amu;
                    } else {
                        bundle = null;
                        Object obj = com_google_android_gms_internal_amu;
                    }
                } else {
                    bundle = null;
                    mediationAdRequest = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) C1401c.m3585a(c1398a), mediationAdRequest, str, new dg(ddVar), a, bundle);
            } catch (Throwable th) {
                id.m5371a("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void mo1900a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami) {
        if (this.f5401a instanceof MediationInterstitialAdapter) {
            id.m5372a(3);
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f5401a;
                mediationInterstitialAdapter.requestInterstitialAd((Context) C1401c.m3585a(c1398a), new amw(com_google_android_gms_internal_ami), m4884a(str, com_google_android_gms_internal_zzix, str2), new amu(com_google_android_gms_internal_zzix.f7741b == -1 ? null : new Date(com_google_android_gms_internal_zzix.f7741b), com_google_android_gms_internal_zzix.f7743d, com_google_android_gms_internal_zzix.f7744e != null ? new HashSet(com_google_android_gms_internal_zzix.f7744e) : null, com_google_android_gms_internal_zzix.f7750k, com_google_android_gms_internal_zzix.f7745f, com_google_android_gms_internal_zzix.f7746g, com_google_android_gms_internal_zzix.f7757r), com_google_android_gms_internal_zzix.f7752m != null ? com_google_android_gms_internal_zzix.f7752m.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                id.m5371a("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void mo1901a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami, zzot com_google_android_gms_internal_zzot, List<String> list) {
        if (this.f5401a instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f5401a;
                amz com_google_android_gms_internal_amz = new amz(com_google_android_gms_internal_zzix.f7741b == -1 ? null : new Date(com_google_android_gms_internal_zzix.f7741b), com_google_android_gms_internal_zzix.f7743d, com_google_android_gms_internal_zzix.f7744e != null ? new HashSet(com_google_android_gms_internal_zzix.f7744e) : null, com_google_android_gms_internal_zzix.f7750k, com_google_android_gms_internal_zzix.f7745f, com_google_android_gms_internal_zzix.f7746g, com_google_android_gms_internal_zzot, list, com_google_android_gms_internal_zzix.f7757r);
                Bundle bundle = com_google_android_gms_internal_zzix.f7752m != null ? com_google_android_gms_internal_zzix.f7752m.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f5402b = new amw(com_google_android_gms_internal_ami);
                mediationNativeAdapter.requestNativeAd((Context) C1401c.m3585a(c1398a), this.f5402b, m4884a(str, com_google_android_gms_internal_zzix, str2), com_google_android_gms_internal_amz, bundle);
            } catch (Throwable th) {
                id.m5371a("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void mo1902a(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, zzix com_google_android_gms_internal_zzix, String str, ami com_google_android_gms_internal_ami) {
        mo1903a(c1398a, com_google_android_gms_internal_zzjb, com_google_android_gms_internal_zzix, str, null, com_google_android_gms_internal_ami);
    }

    public final void mo1903a(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami) {
        if (this.f5401a instanceof MediationBannerAdapter) {
            id.m5372a(3);
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5401a;
                mediationBannerAdapter.requestBannerAd((Context) C1401c.m3585a(c1398a), new amw(com_google_android_gms_internal_ami), m4884a(str, com_google_android_gms_internal_zzix, str2), zzb.zza(com_google_android_gms_internal_zzjb.f7762e, com_google_android_gms_internal_zzjb.f7759b, com_google_android_gms_internal_zzjb.f7758a), new amu(com_google_android_gms_internal_zzix.f7741b == -1 ? null : new Date(com_google_android_gms_internal_zzix.f7741b), com_google_android_gms_internal_zzix.f7743d, com_google_android_gms_internal_zzix.f7744e != null ? new HashSet(com_google_android_gms_internal_zzix.f7744e) : null, com_google_android_gms_internal_zzix.f7750k, com_google_android_gms_internal_zzix.f7745f, com_google_android_gms_internal_zzix.f7746g, com_google_android_gms_internal_zzix.f7757r), com_google_android_gms_internal_zzix.f7752m != null ? com_google_android_gms_internal_zzix.f7752m.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                id.m5371a("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void mo1904a(zzix com_google_android_gms_internal_zzix, String str) {
        mo1905a(com_google_android_gms_internal_zzix, str, null);
    }

    public final void mo1905a(zzix com_google_android_gms_internal_zzix, String str, String str2) {
        if (this.f5401a instanceof MediationRewardedVideoAdAdapter) {
            id.m5372a(3);
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5401a;
                mediationRewardedVideoAdAdapter.loadAd(new amu(com_google_android_gms_internal_zzix.f7741b == -1 ? null : new Date(com_google_android_gms_internal_zzix.f7741b), com_google_android_gms_internal_zzix.f7743d, com_google_android_gms_internal_zzix.f7744e != null ? new HashSet(com_google_android_gms_internal_zzix.f7744e) : null, com_google_android_gms_internal_zzix.f7750k, com_google_android_gms_internal_zzix.f7745f, com_google_android_gms_internal_zzix.f7746g, com_google_android_gms_internal_zzix.f7757r), m4884a(str, com_google_android_gms_internal_zzix, str2), com_google_android_gms_internal_zzix.f7752m != null ? com_google_android_gms_internal_zzix.f7752m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                id.m5371a("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void mo1906a(boolean z) {
        if (this.f5401a instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) this.f5401a).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                id.m5371a("Could not set immersive mode.", th);
                return;
            }
        }
        String str = "MediationAdapter is not an OnImmersiveModeUpdatedListener: ";
        String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(4);
    }

    public final void mo1907b() {
        if (this.f5401a instanceof MediationInterstitialAdapter) {
            id.m5372a(3);
            try {
                ((MediationInterstitialAdapter) this.f5401a).showInterstitial();
            } catch (Throwable th) {
                id.m5371a("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void mo1908c() {
        try {
            this.f5401a.onDestroy();
        } catch (Throwable th) {
            id.m5371a("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void mo1909d() {
        try {
            this.f5401a.onPause();
        } catch (Throwable th) {
            id.m5371a("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void mo1910e() {
        try {
            this.f5401a.onResume();
        } catch (Throwable th) {
            id.m5371a("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void mo1911f() {
        if (this.f5401a instanceof MediationRewardedVideoAdAdapter) {
            id.m5372a(3);
            try {
                ((MediationRewardedVideoAdAdapter) this.f5401a).showVideo();
            } catch (Throwable th) {
                id.m5371a("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final boolean mo1912g() {
        if (this.f5401a instanceof MediationRewardedVideoAdAdapter) {
            id.m5372a(3);
            try {
                return ((MediationRewardedVideoAdAdapter) this.f5401a).isInitialized();
            } catch (Throwable th) {
                id.m5371a("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final amo mo1913h() {
        NativeAdMapper nativeAdMapper = this.f5402b.f5403a;
        return nativeAdMapper instanceof NativeAppInstallAdMapper ? new amx((NativeAppInstallAdMapper) nativeAdMapper) : null;
    }

    public final amr mo1914i() {
        NativeAdMapper nativeAdMapper = this.f5402b.f5403a;
        return nativeAdMapper instanceof NativeContentAdMapper ? new amy((NativeContentAdMapper) nativeAdMapper) : null;
    }

    public final Bundle mo1915j() {
        if (this.f5401a instanceof zzals) {
            return ((zzals) this.f5401a).zzlu();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
        id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final Bundle mo1916k() {
        if (this.f5401a instanceof zzalt) {
            return ((zzalt) this.f5401a).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.f5401a.getClass().getCanonicalName());
        id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final Bundle mo1917l() {
        return new Bundle();
    }

    public final boolean mo1918m() {
        return this.f5401a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final agp mo1919n() {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f5402b.f5404b;
        return nativeCustomTemplateAd instanceof ags ? ((ags) nativeCustomTemplateAd).f5099a : null;
    }

    public final abv mo1920o() {
        if (!(this.f5401a instanceof zza)) {
            return null;
        }
        try {
            return ((zza) this.f5401a).getVideoController();
        } catch (Throwable th) {
            id.m5371a("Could not get video controller.", th);
            return null;
        }
    }
}
