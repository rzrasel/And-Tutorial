package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@aqv
public final class ach {
    public AdListener f4818a;
    public abc f4819b;
    public String f4820c;
    public AppEventListener f4821d;
    public OnCustomRenderedAdLoadedListener f4822e;
    public Correlator f4823f;
    public RewardedVideoAdListener f4824g;
    public boolean f4825h;
    private final ama f4826i;
    private final Context f4827j;
    private final zy f4828k;
    private zq f4829l;
    private PublisherInterstitialAd f4830m;
    private boolean f4831n;

    public ach(Context context) {
        this(context, zy.f7584a, null);
    }

    public ach(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zy.f7584a, publisherInterstitialAd);
    }

    private ach(Context context, zy zyVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.f4826i = new ama();
        this.f4827j = context;
        this.f4828k = zyVar;
        this.f4830m = publisherInterstitialAd;
    }

    private final void m4125b(String str) {
        if (this.f4819b == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    public final void m4126a(AdListener adListener) {
        try {
            this.f4818a = adListener;
            if (this.f4819b != null) {
                this.f4819b.zza(adListener != null ? new zs(adListener) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the AdListener.", e);
        }
    }

    public final void m4127a(acd com_google_android_gms_internal_acd) {
        try {
            if (this.f4819b == null) {
                String str = "loadAd";
                if (this.f4820c == null) {
                    m4125b(str);
                }
                zzjb b = this.f4825h ? zzjb.m7108b() : new zzjb();
                aab b2 = aak.m4023b();
                Context context = this.f4827j;
                this.f4819b = (abc) aab.m3997a(context, false, new aae(b2, context, b, this.f4820c, this.f4826i));
                if (this.f4818a != null) {
                    this.f4819b.zza(new zs(this.f4818a));
                }
                if (this.f4829l != null) {
                    this.f4819b.zza(new zr(this.f4829l));
                }
                if (this.f4821d != null) {
                    this.f4819b.zza(new aaa(this.f4821d));
                }
                if (this.f4822e != null) {
                    this.f4819b.zza(new ael(this.f4822e));
                }
                if (this.f4823f != null) {
                    this.f4819b.zza(this.f4823f.zzba());
                }
                if (this.f4824g != null) {
                    this.f4819b.zza(new cm(this.f4824g));
                }
                this.f4819b.setImmersiveMode(this.f4831n);
            }
            if (this.f4819b.zzb(zy.m7086a(this.f4827j, com_google_android_gms_internal_acd))) {
                this.f4826i.f5393a = com_google_android_gms_internal_acd.f4776h;
            }
        } catch (Throwable e) {
            id.m5371a("Failed to load ad.", e);
        }
    }

    public final void m4128a(zq zqVar) {
        try {
            this.f4829l = zqVar;
            if (this.f4819b != null) {
                this.f4819b.zza(zqVar != null ? new zr(zqVar) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the AdClickListener.", e);
        }
    }

    public final void m4129a(String str) {
        if (this.f4820c != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f4820c = str;
    }

    public final void m4130a(boolean z) {
        try {
            this.f4831n = z;
            if (this.f4819b != null) {
                this.f4819b.setImmersiveMode(z);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set immersive mode", e);
        }
    }

    public final boolean m4131a() {
        boolean z = false;
        try {
            if (this.f4819b != null) {
                z = this.f4819b.isReady();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to check if ad is ready.", e);
        }
        return z;
    }

    public final boolean m4132b() {
        boolean z = false;
        try {
            if (this.f4819b != null) {
                z = this.f4819b.isLoading();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to check if ad is loading.", e);
        }
        return z;
    }

    public final String m4133c() {
        try {
            if (this.f4819b != null) {
                return this.f4819b.zzch();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public final void m4134d() {
        try {
            m4125b("show");
            this.f4819b.showInterstitial();
        } catch (Throwable e) {
            id.m5371a("Failed to show interstitial.", e);
        }
    }
}
