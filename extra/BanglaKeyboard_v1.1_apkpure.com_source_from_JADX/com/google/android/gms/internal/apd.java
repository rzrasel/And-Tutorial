package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1538g;

@aqv
public final class apd {
    public static gp m5022a(Context context, zza com_google_android_gms_ads_internal_zza, ef efVar, nh nhVar, jf jfVar, amc com_google_android_gms_internal_amc, ape com_google_android_gms_internal_ape, aec com_google_android_gms_internal_aec) {
        gp com_google_android_gms_internal_apj;
        zzaao com_google_android_gms_internal_zzaao = efVar.f5979b;
        if (com_google_android_gms_internal_zzaao.f7661g) {
            com_google_android_gms_internal_apj = new apj(context, efVar, com_google_android_gms_internal_amc, com_google_android_gms_internal_ape, com_google_android_gms_internal_aec, jfVar);
        } else if (com_google_android_gms_internal_zzaao.f7673s || (com_google_android_gms_ads_internal_zza instanceof zzbc)) {
            com_google_android_gms_internal_apj = (com_google_android_gms_internal_zzaao.f7673s && (com_google_android_gms_ads_internal_zza instanceof zzbc)) ? new apl(context, (zzbc) com_google_android_gms_ads_internal_zza, efVar, nhVar, com_google_android_gms_internal_ape, com_google_android_gms_internal_aec) : new apg(efVar, com_google_android_gms_internal_ape);
        } else {
            com_google_android_gms_internal_apj = (((Boolean) zzbv.zzen().m4217a(ado.aa)).booleanValue() && C1538g.m3944d() && !C1538g.m3945e() && jfVar != null && jfVar.mo2162j().f7761d) ? new api(context, efVar, jfVar, com_google_android_gms_internal_ape) : new apf(context, efVar, jfVar, com_google_android_gms_internal_ape);
        }
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(com_google_android_gms_internal_apj.getClass().getName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(3);
        com_google_android_gms_internal_apj.mo1474g();
        return com_google_android_gms_internal_apj;
    }
}
