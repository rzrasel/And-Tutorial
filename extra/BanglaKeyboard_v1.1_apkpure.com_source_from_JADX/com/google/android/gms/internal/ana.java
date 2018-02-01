package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@aqv
public final class ana<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends amg {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f5429a;
    private final NETWORK_EXTRAS f5430b;

    public ana(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f5429a = mediationAdapter;
        this.f5430b = network_extras;
    }

    private final SERVER_PARAMETERS m4947a(String str) {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    hashMap.put(str2, jSONObject.getString(str2));
                }
            } catch (Throwable th) {
                id.m5371a("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f5429a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        MediationServerParameters mediationServerParameters = (MediationServerParameters) serverParametersType.newInstance();
        mediationServerParameters.load(hashMap);
        return mediationServerParameters;
    }

    public final C1398a mo1895a() {
        if (this.f5429a instanceof MediationBannerAdapter) {
            try {
                return C1401c.m3584a(((MediationBannerAdapter) this.f5429a).getBannerView());
            } catch (Throwable th) {
                id.m5371a("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5429a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void mo1896a(C1398a c1398a) {
    }

    public final void mo1897a(C1398a c1398a, dd ddVar, List<String> list) {
    }

    public final void mo1898a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, ami com_google_android_gms_internal_ami) {
        mo1900a(c1398a, com_google_android_gms_internal_zzix, str, null, com_google_android_gms_internal_ami);
    }

    public final void mo1899a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, dd ddVar, String str2) {
    }

    public final void mo1900a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami) {
        if (this.f5429a instanceof MediationInterstitialAdapter) {
            id.m5372a(3);
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f5429a;
                MediationInterstitialListener com_google_android_gms_internal_anb = new anb(com_google_android_gms_internal_ami);
                Activity activity = (Activity) C1401c.m3585a(c1398a);
                int i = com_google_android_gms_internal_zzix.f7746g;
                mediationInterstitialAdapter.requestInterstitialAd(com_google_android_gms_internal_anb, activity, m4947a(str), ano.m4980a(com_google_android_gms_internal_zzix), this.f5430b);
            } catch (Throwable th) {
                id.m5371a("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5429a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void mo1901a(C1398a c1398a, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami, zzot com_google_android_gms_internal_zzot, List<String> list) {
    }

    public final void mo1902a(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, zzix com_google_android_gms_internal_zzix, String str, ami com_google_android_gms_internal_ami) {
        mo1903a(c1398a, com_google_android_gms_internal_zzjb, com_google_android_gms_internal_zzix, str, null, com_google_android_gms_internal_ami);
    }

    public final void mo1903a(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, zzix com_google_android_gms_internal_zzix, String str, String str2, ami com_google_android_gms_internal_ami) {
        if (this.f5429a instanceof MediationBannerAdapter) {
            id.m5372a(3);
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5429a;
                MediationBannerListener com_google_android_gms_internal_anb = new anb(com_google_android_gms_internal_ami);
                Activity activity = (Activity) C1401c.m3585a(c1398a);
                int i = com_google_android_gms_internal_zzix.f7746g;
                mediationBannerAdapter.requestBannerAd(com_google_android_gms_internal_anb, activity, m4947a(str), ano.m4979a(com_google_android_gms_internal_zzjb), ano.m4980a(com_google_android_gms_internal_zzix), this.f5430b);
            } catch (Throwable th) {
                id.m5371a("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f5429a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void mo1904a(zzix com_google_android_gms_internal_zzix, String str) {
    }

    public final void mo1905a(zzix com_google_android_gms_internal_zzix, String str, String str2) {
    }

    public final void mo1906a(boolean z) {
    }

    public final void mo1907b() {
        if (this.f5429a instanceof MediationInterstitialAdapter) {
            id.m5372a(3);
            try {
                ((MediationInterstitialAdapter) this.f5429a).showInterstitial();
            } catch (Throwable th) {
                id.m5371a("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f5429a.getClass().getCanonicalName());
            id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void mo1908c() {
        try {
            this.f5429a.destroy();
        } catch (Throwable th) {
            id.m5371a("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void mo1909d() {
        throw new RemoteException();
    }

    public final void mo1910e() {
        throw new RemoteException();
    }

    public final void mo1911f() {
    }

    public final boolean mo1912g() {
        return true;
    }

    public final amo mo1913h() {
        return null;
    }

    public final amr mo1914i() {
        return null;
    }

    public final Bundle mo1915j() {
        return new Bundle();
    }

    public final Bundle mo1916k() {
        return new Bundle();
    }

    public final Bundle mo1917l() {
        return new Bundle();
    }

    public final boolean mo1918m() {
        return false;
    }

    public final agp mo1919n() {
        return null;
    }

    public final abv mo1920o() {
        return null;
    }
}
