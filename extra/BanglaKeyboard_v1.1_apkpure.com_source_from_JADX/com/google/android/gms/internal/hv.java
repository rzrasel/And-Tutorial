package com.google.android.gms.internal;

import android.annotation.TargetApi;

@TargetApi(17)
@aqv
public final class hv {
    private static hv f6226b = null;
    String f6227a;

    private hv() {
    }

    public static hv m5603a() {
        if (f6226b == null) {
            f6226b = new hv();
        }
        return f6226b;
    }
}
