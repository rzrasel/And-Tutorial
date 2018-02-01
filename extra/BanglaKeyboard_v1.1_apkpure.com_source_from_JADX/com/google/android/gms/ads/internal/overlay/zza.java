package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;

@aqv
public final class zza {
    private static boolean m3673a(Context context, Intent intent, zzag com_google_android_gms_ads_internal_overlay_zzag) {
        try {
            String str = "Launching an intent: ";
            String valueOf = String.valueOf(intent.toURI());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            es.m5373a();
            zzbv.zzea();
            gb.m5446a(context, intent);
            if (com_google_android_gms_ads_internal_overlay_zzag != null) {
                com_google_android_gms_ads_internal_overlay_zzag.zzbm();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            id.m5370a(e.getMessage());
            return false;
        }
    }

    public static boolean zza(Context context, zzc com_google_android_gms_ads_internal_overlay_zzc, zzag com_google_android_gms_ads_internal_overlay_zzag) {
        if (com_google_android_gms_ads_internal_overlay_zzc == null) {
            id.m5370a("No intent data for launcher overlay.");
            return false;
        }
        ado.m4219a(context);
        if (com_google_android_gms_ads_internal_overlay_zzc.intent != null) {
            return m3673a(context, com_google_android_gms_ads_internal_overlay_zzc.intent, com_google_android_gms_ads_internal_overlay_zzag);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(com_google_android_gms_ads_internal_overlay_zzc.url)) {
            id.m5370a("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(com_google_android_gms_ads_internal_overlay_zzc.mimeType)) {
            intent.setData(Uri.parse(com_google_android_gms_ads_internal_overlay_zzc.url));
        } else {
            intent.setDataAndType(Uri.parse(com_google_android_gms_ads_internal_overlay_zzc.url), com_google_android_gms_ads_internal_overlay_zzc.mimeType);
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(com_google_android_gms_ads_internal_overlay_zzc.packageName)) {
            intent.setPackage(com_google_android_gms_ads_internal_overlay_zzc.packageName);
        }
        if (!TextUtils.isEmpty(com_google_android_gms_ads_internal_overlay_zzc.zzcfa)) {
            String[] split = com_google_android_gms_ads_internal_overlay_zzc.zzcfa.split("/", 2);
            if (split.length < 2) {
                String str = "Could not parse component name from open GMSG: ";
                String valueOf = String.valueOf(com_google_android_gms_ads_internal_overlay_zzc.zzcfa);
                id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        Object obj = com_google_android_gms_ads_internal_overlay_zzc.zzcfb;
        if (!TextUtils.isEmpty(obj)) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(obj);
            } catch (NumberFormatException e) {
                id.m5370a("Could not parse intent flags.");
                parseInt = 0;
            }
            intent.addFlags(parseInt);
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.cs)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbv.zzen().m4217a(ado.cr)).booleanValue()) {
                zzbv.zzea();
                gb.m5471b(context, intent);
            }
        }
        return m3673a(context, intent, com_google_android_gms_ads_internal_overlay_zzag);
    }
}
