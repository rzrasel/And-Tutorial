package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class bu extends cd {
    private final Context f5832a;
    private final Object f5833b;
    private final zzajk f5834c;
    private final bv f5835d;

    public bu(Context context, zzv com_google_android_gms_ads_internal_zzv, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk) {
        this(context, com_google_android_gms_internal_zzajk, new bv(context, com_google_android_gms_ads_internal_zzv, zzjb.m7108b(), com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk));
    }

    private bu(Context context, zzajk com_google_android_gms_internal_zzajk, bv bvVar) {
        this.f5833b = new Object();
        this.f5832a = context;
        this.f5834c = com_google_android_gms_internal_zzajk;
        this.f5835d = bvVar;
    }

    public final void mo1719a() {
        synchronized (this.f5833b) {
            bv bvVar = this.f5835d;
            C1516t.m3867b("showAd must be called on the main UI thread.");
            if (bvVar.m5162d()) {
                bvVar.f5839i = true;
                dc a = bvVar.mo2024a(bvVar.zzams.zzato.f5967p);
                if (!(a == null || a.f5906a == null)) {
                    try {
                        a.f5906a.mo1906a(bvVar.f5840j);
                        a.f5906a.mo1911f();
                    } catch (Throwable e) {
                        id.m5371a("Could not call showVideo.", e);
                    }
                }
            } else {
                id.m5370a("The reward video has not loaded.");
            }
        }
    }

    public final void mo1720a(C1398a c1398a) {
        synchronized (this.f5833b) {
            this.f5835d.pause();
        }
    }

    public final void mo1721a(ch chVar) {
        synchronized (this.f5833b) {
            this.f5835d.zza(chVar);
        }
    }

    public final void mo1722a(zzadp com_google_android_gms_internal_zzadp) {
        synchronized (this.f5833b) {
            this.f5835d.m5160a(com_google_android_gms_internal_zzadp);
        }
    }

    public final void mo1723a(String str) {
        id.m5370a("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public final void mo1724a(boolean z) {
        synchronized (this.f5833b) {
            this.f5835d.setImmersiveMode(z);
        }
    }

    public final void mo1725b(C1398a c1398a) {
        synchronized (this.f5833b) {
            if (c1398a == null) {
                Object obj = null;
            } else {
                Context context = (Context) C1401c.m3585a(c1398a);
            }
            if (obj != null) {
                try {
                    for (dc dcVar : this.f5835d.f5838h.values()) {
                        try {
                            dcVar.f5906a.mo1896a(C1401c.m3584a(obj));
                        } catch (RemoteException e) {
                            id.m5372a(6);
                        }
                    }
                } catch (Throwable e2) {
                    id.m5371a("Unable to extract updated context.", e2);
                }
            }
            this.f5835d.resume();
        }
    }

    public final boolean mo1726b() {
        boolean d;
        synchronized (this.f5833b) {
            d = this.f5835d.m5162d();
        }
        return d;
    }

    public final void mo1727c() {
        mo1720a(null);
    }

    public final void mo1728c(C1398a c1398a) {
        synchronized (this.f5833b) {
            this.f5835d.destroy();
        }
    }

    public final void mo1729d() {
        mo1725b(null);
    }

    public final void mo1730e() {
        mo1728c(null);
    }

    public final String mo1731f() {
        String mediationAdapterClassName;
        synchronized (this.f5833b) {
            mediationAdapterClassName = this.f5835d.getMediationAdapterClassName();
        }
        return mediationAdapterClassName;
    }
}
