package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.C1528p;

public class zzb {
    private static zzb zzamj;
    private final Context zzaie;

    private zzb(Context context) {
        this.zzaie = context;
    }

    private final void zza(Info info, boolean z) {
        if (Math.random() <= ((double) new zzd(this.zzaie).getFloat("gads:ad_id_use_shared_preference:ping_ratio", 0.0f))) {
            new Thread(new zzc(info, z)).start();
        }
    }

    public static zzb zze(Context context) {
        zzb com_google_android_gms_ads_identifier_zzb;
        synchronized (zzb.class) {
            if (zzamj == null) {
                zzamj = new zzb(context);
            }
            com_google_android_gms_ads_identifier_zzb = zzamj;
        }
        return com_google_android_gms_ads_identifier_zzb;
    }

    public final Info getInfo() {
        Info info = null;
        Context b = C1528p.m3915b(this.zzaie);
        if (b == null) {
            zza(null, false);
        } else {
            SharedPreferences sharedPreferences = b.getSharedPreferences("adid_settings", 0);
            if (sharedPreferences == null) {
                zza(null, false);
            } else {
                if (sharedPreferences.contains("adid_key") && sharedPreferences.contains("enable_limit_ad_tracking")) {
                    info = new Info(sharedPreferences.getString("adid_key", ""), sharedPreferences.getBoolean("enable_limit_ad_tracking", false));
                }
                zza(info, true);
            }
        }
        return info;
    }
}
