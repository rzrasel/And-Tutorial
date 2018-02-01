package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.aab;
import com.google.android.gms.internal.aaf;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.aat;
import com.google.android.gms.internal.aax;
import com.google.android.gms.internal.acd;
import com.google.android.gms.internal.ahk;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ahm;
import com.google.android.gms.internal.ahn;
import com.google.android.gms.internal.aho;
import com.google.android.gms.internal.ama;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zs;
import com.google.android.gms.internal.zy;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzot;

public class AdLoader {
    private final zy f3921a;
    private final Context f3922b;
    private final aat f3923c;

    public static class Builder {
        private final Context f3919a;
        private final aax f3920b;

        private Builder(Context context, aax com_google_android_gms_internal_aax) {
            this.f3919a = context;
            this.f3920b = com_google_android_gms_internal_aax;
        }

        public Builder(Context context, String str) {
            this((Context) C1516t.m3861a((Object) context, (Object) "context cannot be null"), (aax) aab.m3997a(context, false, new aaf(aak.m4023b(), context, str, new ama())));
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.f3919a, this.f3920b.zzcy());
            } catch (RemoteException e) {
                id.m5372a(6);
                return null;
            }
        }

        public Builder forAppInstallAd(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.f3920b.zza(new ahk(onAppInstallAdLoadedListener));
            } catch (Throwable e) {
                id.m5371a("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forContentAd(OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.f3920b.zza(new ahl(onContentAdLoadedListener));
            } catch (Throwable e) {
                id.m5371a("Failed to add content ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, OnCustomClickListener onCustomClickListener) {
            try {
                this.f3920b.zza(str, new ahn(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new ahm(onCustomClickListener));
            } catch (Throwable e) {
                id.m5371a("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f3920b.zza(new aho(onPublisherAdViewLoadedListener), new zzjb(this.f3919a, adSizeArr));
            } catch (Throwable e) {
                id.m5371a("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.f3920b.zzb(new zs(adListener));
            } catch (Throwable e) {
                id.m5371a("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withCorrelator(Correlator correlator) {
            C1516t.m3860a((Object) correlator);
            try {
                this.f3920b.zzb(correlator.zzba());
            } catch (Throwable e) {
                id.m5371a("Failed to set correlator.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.f3920b.zza(new zzot(nativeAdOptions));
            } catch (Throwable e) {
                id.m5371a("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.f3920b.zza(publisherAdViewOptions);
            } catch (Throwable e) {
                id.m5371a("Failed to specify DFP banner ad options", e);
            }
            return this;
        }
    }

    AdLoader(Context context, aat com_google_android_gms_internal_aat) {
        this(context, com_google_android_gms_internal_aat, zy.f7584a);
    }

    private AdLoader(Context context, aat com_google_android_gms_internal_aat, zy zyVar) {
        this.f3922b = context;
        this.f3923c = com_google_android_gms_internal_aat;
        this.f3921a = zyVar;
    }

    private final void m3589a(acd com_google_android_gms_internal_acd) {
        try {
            this.f3923c.zzd(zy.m7086a(this.f3922b, com_google_android_gms_internal_acd));
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public String getMediationAdapterClassName() {
        try {
            return this.f3923c.zzch();
        } catch (Throwable e) {
            id.m5371a("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.f3923c.isLoading();
        } catch (Throwable e) {
            id.m5371a("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        m3589a(adRequest.zzaz());
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        m3589a(publisherAdRequest.zzaz());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.f3923c.zza(zy.m7086a(this.f3922b, adRequest.zzaz()), i);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }
}
