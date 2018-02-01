package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.jf;

@aqv
public final class zzad extends zzz {
    public final zzy zza(Context context, jf jfVar, int i, boolean z, aec com_google_android_gms_internal_aec, zzaq com_google_android_gms_ads_internal_overlay_zzaq) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Object obj = (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) ? 1 : null;
        if (obj == null) {
            return null;
        }
        return new zzd(context, z, jfVar.mo2162j().f7761d, com_google_android_gms_ads_internal_overlay_zzaq, new zzar(context, jfVar.mo2169n(), jfVar.mo2183u(), com_google_android_gms_internal_aec, jfVar.mo2185w()));
    }
}
