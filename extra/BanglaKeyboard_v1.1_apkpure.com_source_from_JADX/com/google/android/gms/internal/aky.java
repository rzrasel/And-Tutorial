package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzam;
import com.google.android.gms.ads.internal.zzbv;

final class aky {
    zzam f5249a;
    zzix f5250b;
    ajs f5251c;
    long f5252d;
    boolean f5253e;
    boolean f5254f;
    private /* synthetic */ akx f5255g;

    aky(akx com_google_android_gms_internal_akx, ajr com_google_android_gms_internal_ajr) {
        this.f5255g = com_google_android_gms_internal_akx;
        this.f5249a = new zzam(com_google_android_gms_internal_ajr.f5211a.getApplicationContext(), new zzjb(), com_google_android_gms_internal_akx.f5246c, com_google_android_gms_internal_ajr.f5212b, com_google_android_gms_internal_ajr.f5213c, com_google_android_gms_internal_ajr.f5214d);
        this.f5251c = new ajs();
        ajs com_google_android_gms_internal_ajs = this.f5251c;
        zza com_google_android_gms_ads_internal_zza = this.f5249a;
        com_google_android_gms_ads_internal_zza.zza(new ajt(com_google_android_gms_internal_ajs));
        com_google_android_gms_ads_internal_zza.zza(new akc(com_google_android_gms_internal_ajs));
        com_google_android_gms_ads_internal_zza.zza(new ake(com_google_android_gms_internal_ajs));
        com_google_android_gms_ads_internal_zza.zza(new akg(com_google_android_gms_internal_ajs));
        com_google_android_gms_ads_internal_zza.zza(new aki(com_google_android_gms_internal_ajs));
    }

    aky(akx com_google_android_gms_internal_akx, ajr com_google_android_gms_internal_ajr, zzix com_google_android_gms_internal_zzix) {
        this(com_google_android_gms_internal_akx, com_google_android_gms_internal_ajr);
        this.f5250b = com_google_android_gms_internal_zzix;
    }

    final boolean m4668a() {
        if (this.f5253e) {
            return false;
        }
        zzix c = akv.m4664c(this.f5250b != null ? this.f5250b : this.f5255g.f5245b);
        String str = "_skipMediation";
        Bundle bundle = c.f7752m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        c.f7742c.putBoolean(str, true);
        this.f5254f = this.f5249a.zzb(c);
        this.f5253e = true;
        this.f5252d = zzbv.zzeg().mo1669a();
        return true;
    }
}
