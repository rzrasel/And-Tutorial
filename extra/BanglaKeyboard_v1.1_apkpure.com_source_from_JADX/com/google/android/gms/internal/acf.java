package com.google.android.gms.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.concurrent.atomic.AtomicBoolean;

@aqv
public final class acf {
    public final AtomicBoolean f4800a;
    public final VideoController f4801b;
    public AdListener f4802c;
    public AdSize[] f4803d;
    public AppEventListener f4804e;
    public Correlator f4805f;
    public abc f4806g;
    public OnCustomRenderedAdLoadedListener f4807h;
    public VideoOptions f4808i;
    public boolean f4809j;
    private final ama f4810k;
    private final zy f4811l;
    private aam f4812m;
    private zq f4813n;
    private String f4814o;
    private ViewGroup f4815p;
    private int f4816q;

    public acf(ViewGroup viewGroup) {
        this(viewGroup, null, false, zy.f7584a, 0, (byte) 0);
    }

    public acf(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zy.f7584a, i, (byte) 0);
    }

    public acf(ViewGroup viewGroup, AttributeSet attributeSet, int i) {
        this(viewGroup, attributeSet, false, zy.f7584a, i, (byte) 0);
    }

    public acf(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zy.f7584a, 0, (byte) 0);
    }

    private acf(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zy zyVar, int i) {
        this.f4810k = new ama();
        this.f4801b = new VideoController();
        this.f4812m = new acg(this);
        this.f4815p = viewGroup;
        this.f4811l = zyVar;
        this.f4806g = null;
        this.f4800a = new AtomicBoolean(false);
        this.f4816q = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzje com_google_android_gms_internal_zzje = new zzje(context, attributeSet);
                if (z || com_google_android_gms_internal_zzje.f7768a.length == 1) {
                    this.f4803d = com_google_android_gms_internal_zzje.f7768a;
                    this.f4814o = com_google_android_gms_internal_zzje.f7769b;
                    if (viewGroup.isInEditMode()) {
                        aak.m4022a();
                        AdSize adSize = this.f4803d[0];
                        int i2 = this.f4816q;
                        zzjb com_google_android_gms_internal_zzjb = new zzjb(context, adSize);
                        com_google_android_gms_internal_zzjb.f7767j = m4107a(i2);
                        hz.m5619a(viewGroup, com_google_android_gms_internal_zzjb, "Ads by Google", -16777216, -1);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
            } catch (IllegalArgumentException e) {
                aak.m4022a();
                hz.m5620a(viewGroup, new zzjb(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private acf(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zy zyVar, int i, byte b) {
        this(viewGroup, attributeSet, z, zyVar, i);
    }

    private static zzjb m4106a(Context context, AdSize[] adSizeArr, int i) {
        zzjb com_google_android_gms_internal_zzjb = new zzjb(context, adSizeArr);
        com_google_android_gms_internal_zzjb.f7767j = m4107a(i);
        return com_google_android_gms_internal_zzjb;
    }

    private static boolean m4107a(int i) {
        return i == 1;
    }

    public final void m4108a() {
        try {
            if (this.f4806g != null) {
                this.f4806g.destroy();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to destroy AdView.", e);
        }
    }

    public final void m4109a(AdListener adListener) {
        this.f4802c = adListener;
        aam com_google_android_gms_internal_aam = this.f4812m;
        synchronized (com_google_android_gms_internal_aam.f4749a) {
            com_google_android_gms_internal_aam.f4750b = adListener;
        }
    }

    public final void m4110a(VideoOptions videoOptions) {
        this.f4808i = videoOptions;
        try {
            if (this.f4806g != null) {
                this.f4806g.zza(videoOptions == null ? null : new zzmd(videoOptions));
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set video options.", e);
        }
    }

    public final void m4111a(AppEventListener appEventListener) {
        try {
            this.f4804e = appEventListener;
            if (this.f4806g != null) {
                this.f4806g.zza(appEventListener != null ? new aaa(appEventListener) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the AppEventListener.", e);
        }
    }

    public final void m4112a(acd com_google_android_gms_internal_acd) {
        try {
            if (this.f4806g == null) {
                if ((this.f4803d == null || this.f4814o == null) && this.f4806g == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f4815p.getContext();
                zzjb a = m4106a(context, this.f4803d, this.f4816q);
                this.f4806g = "search_v2".equals(a.f7758a) ? (abc) aab.m3997a(context, false, new aad(aak.m4023b(), context, a, this.f4814o)) : (abc) aab.m3997a(context, false, new aac(aak.m4023b(), context, a, this.f4814o, this.f4810k));
                this.f4806g.zza(new zs(this.f4812m));
                if (this.f4813n != null) {
                    this.f4806g.zza(new zr(this.f4813n));
                }
                if (this.f4804e != null) {
                    this.f4806g.zza(new aaa(this.f4804e));
                }
                if (this.f4807h != null) {
                    this.f4806g.zza(new ael(this.f4807h));
                }
                if (this.f4805f != null) {
                    this.f4806g.zza(this.f4805f.zzba());
                }
                if (this.f4808i != null) {
                    this.f4806g.zza(new zzmd(this.f4808i));
                }
                this.f4806g.setManualImpressionsEnabled(this.f4809j);
                try {
                    C1398a zzbk = this.f4806g.zzbk();
                    if (zzbk != null) {
                        this.f4815p.addView((View) C1401c.m3585a(zzbk));
                    }
                } catch (Throwable e) {
                    id.m5371a("Failed to get an ad frame.", e);
                }
            }
            if (this.f4806g.zzb(zy.m7086a(this.f4815p.getContext(), com_google_android_gms_internal_acd))) {
                this.f4810k.f5393a = com_google_android_gms_internal_acd.f4776h;
            }
        } catch (Throwable e2) {
            id.m5371a("Failed to load ad.", e2);
        }
    }

    public final void m4113a(zq zqVar) {
        try {
            this.f4813n = zqVar;
            if (this.f4806g != null) {
                this.f4806g.zza(zqVar != null ? new zr(zqVar) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the AdClickListener.", e);
        }
    }

    public final void m4114a(String str) {
        if (this.f4814o != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f4814o = str;
    }

    public final void m4115a(AdSize... adSizeArr) {
        if (this.f4803d != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m4118b(adSizeArr);
    }

    public final boolean m4116a(abc com_google_android_gms_internal_abc) {
        if (com_google_android_gms_internal_abc == null) {
            return false;
        }
        try {
            C1398a zzbk = com_google_android_gms_internal_abc.zzbk();
            if (zzbk == null) {
                return false;
            }
            if (((View) C1401c.m3585a(zzbk)).getParent() != null) {
                return false;
            }
            this.f4815p.addView((View) C1401c.m3585a(zzbk));
            this.f4806g = com_google_android_gms_internal_abc;
            return true;
        } catch (Throwable e) {
            id.m5371a("Failed to get an ad frame.", e);
            return false;
        }
    }

    public final AdSize m4117b() {
        try {
            if (this.f4806g != null) {
                zzjb zzbl = this.f4806g.zzbl();
                if (zzbl != null) {
                    return zzbl.m7110c();
                }
            }
        } catch (Throwable e) {
            id.m5371a("Failed to get the current AdSize.", e);
        }
        return this.f4803d != null ? this.f4803d[0] : null;
    }

    public final void m4118b(AdSize... adSizeArr) {
        this.f4803d = adSizeArr;
        try {
            if (this.f4806g != null) {
                this.f4806g.zza(m4106a(this.f4815p.getContext(), this.f4803d, this.f4816q));
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the ad size.", e);
        }
        this.f4815p.requestLayout();
    }

    public final String m4119c() {
        if (this.f4814o == null && this.f4806g != null) {
            try {
                this.f4814o = this.f4806g.getAdUnitId();
            } catch (Throwable e) {
                id.m5371a("Failed to get ad unit id.", e);
            }
        }
        return this.f4814o;
    }

    public final void m4120d() {
        try {
            if (this.f4806g != null) {
                this.f4806g.pause();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to call pause.", e);
        }
    }

    public final void m4121e() {
        try {
            if (this.f4806g != null) {
                this.f4806g.resume();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to call resume.", e);
        }
    }

    public final String m4122f() {
        try {
            if (this.f4806g != null) {
                return this.f4806g.zzch();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public final boolean m4123g() {
        try {
            if (this.f4806g != null) {
                return this.f4806g.isLoading();
            }
        } catch (Throwable e) {
            id.m5371a("Failed to check if ad is loading.", e);
        }
        return false;
    }

    public final abv m4124h() {
        abv com_google_android_gms_internal_abv = null;
        if (this.f4806g != null) {
            try {
                com_google_android_gms_internal_abv = this.f4806g.getVideoController();
            } catch (Throwable e) {
                id.m5371a("Failed to retrieve VideoController.", e);
            }
        }
        return com_google_android_gms_internal_abv;
    }
}
