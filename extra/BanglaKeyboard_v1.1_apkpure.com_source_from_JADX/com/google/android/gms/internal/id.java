package com.google.android.gms.internal;

import android.util.Log;
import com.google.ads.AdRequest;

@aqv
public class id {
    public static void m5370a(String str) {
        if (m5372a(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }

    public static void m5371a(String str, Throwable th) {
        if (m5372a(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean m5372a(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }
}
