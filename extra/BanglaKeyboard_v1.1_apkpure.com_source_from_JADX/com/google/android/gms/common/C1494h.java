package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;

final class C1494h {
    private static final Object f4533a = new Object();
    private static Context f4534b;

    static synchronized void m3807a(Context context) {
        synchronized (C1494h.class) {
            if (f4534b != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f4534b = context.getApplicationContext();
            }
        }
    }
}
