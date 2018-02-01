package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.aet;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.id;
import java.util.List;

final class C1473t implements Runnable {
    private /* synthetic */ afc f4276a;
    private /* synthetic */ int f4277b;
    private /* synthetic */ List f4278c;
    private /* synthetic */ zzbc f4279d;

    C1473t(zzbc com_google_android_gms_ads_internal_zzbc, afc com_google_android_gms_internal_afc, int i, List list) {
        this.f4279d = com_google_android_gms_ads_internal_zzbc;
        this.f4276a = com_google_android_gms_internal_afc;
        this.f4277b = i;
        this.f4278c = list;
    }

    public final void run() {
        boolean z = true;
        try {
            zzbc com_google_android_gms_ads_internal_zzbc;
            if ((this.f4276a instanceof aet) && this.f4279d.zzams.f4428i != null) {
                com_google_android_gms_ads_internal_zzbc = this.f4279d;
                if (this.f4277b == this.f4278c.size() - 1) {
                    z = false;
                }
                com_google_android_gms_ads_internal_zzbc.c = z;
                this.f4279d.zzams.f4428i.mo1861a((aet) this.f4276a);
            } else if (!(this.f4276a instanceof aer) || this.f4279d.zzams.f4427h == null) {
                zza com_google_android_gms_ads_internal_zza = this.f4279d;
                if (this.f4277b == this.f4278c.size() - 1) {
                    z = false;
                }
                com_google_android_gms_ads_internal_zza.mo1629a(3, z);
            } else {
                com_google_android_gms_ads_internal_zzbc = this.f4279d;
                if (this.f4277b == this.f4278c.size() - 1) {
                    z = false;
                }
                com_google_android_gms_ads_internal_zzbc.c = z;
                this.f4279d.zzams.f4427h.mo1860a((aer) this.f4276a);
            }
        } catch (Throwable e) {
            id.m5371a("Could not call onAppInstallAdLoaded or onContentAdLoaded method", e);
        }
    }
}
