package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C1528p;

final class zzd {
    private SharedPreferences zzamm;

    zzd(Context context) {
        try {
            Context b = C1528p.m3915b(context);
            this.zzamm = b == null ? null : b.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.zzamm = null;
        }
    }

    final boolean getBoolean(String str, boolean z) {
        boolean z2 = false;
        try {
            if (this.zzamm != null) {
                z2 = this.zzamm.getBoolean(str, false);
            }
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
        }
        return z2;
    }

    final float getFloat(String str, float f) {
        float f2 = 0.0f;
        try {
            if (this.zzamm != null) {
                f2 = this.zzamm.getFloat(str, 0.0f);
            }
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
        }
        return f2;
    }
}
