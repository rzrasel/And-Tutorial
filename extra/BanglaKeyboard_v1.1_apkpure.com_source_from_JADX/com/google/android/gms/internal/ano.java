package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.zzb;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@aqv
public final class ano {
    public static int m4978a(ErrorCode errorCode) {
        switch (anp.f5445a[errorCode.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    public static AdSize m4979a(zzjb com_google_android_gms_internal_zzjb) {
        int i = 0;
        AdSize[] adSizeArr = new AdSize[]{AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
        while (i < 6) {
            if (adSizeArr[i].getWidth() == com_google_android_gms_internal_zzjb.f7762e && adSizeArr[i].getHeight() == com_google_android_gms_internal_zzjb.f7759b) {
                return adSizeArr[i];
            }
            i++;
        }
        return new AdSize(zzb.zza(com_google_android_gms_internal_zzjb.f7762e, com_google_android_gms_internal_zzjb.f7759b, com_google_android_gms_internal_zzjb.f7758a));
    }

    public static MediationAdRequest m4980a(zzix com_google_android_gms_internal_zzix) {
        Gender gender;
        Set hashSet = com_google_android_gms_internal_zzix.f7744e != null ? new HashSet(com_google_android_gms_internal_zzix.f7744e) : null;
        Date date = new Date(com_google_android_gms_internal_zzix.f7741b);
        switch (com_google_android_gms_internal_zzix.f7743d) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.UNKNOWN;
                break;
        }
        return new MediationAdRequest(date, gender, hashSet, com_google_android_gms_internal_zzix.f7745f, com_google_android_gms_internal_zzix.f7750k);
    }
}
