package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;

@aqv
final class akw {
    private final Object[] f5243a;

    akw(zzix com_google_android_gms_internal_zzix, String str, int i) {
        this.f5243a = zzp.zza((String) zzbv.zzen().m4217a(ado.aG), com_google_android_gms_internal_zzix, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akw)) {
            return false;
        }
        return Arrays.equals(this.f5243a, ((akw) obj).f5243a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5243a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f5243a);
        return new StringBuilder(String.valueOf(arrays).length() + 24).append("[InterstitialAdPoolKey ").append(arrays).append("]").toString();
    }
}
