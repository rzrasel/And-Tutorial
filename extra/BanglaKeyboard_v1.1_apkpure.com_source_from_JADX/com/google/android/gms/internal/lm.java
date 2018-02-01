package com.google.android.gms.internal;

import android.content.Context;

public final class lm {
    private static lm f6572b = new lm();
    private ll f6573a = null;

    public static ll m5976a(Context context) {
        return f6572b.m5977b(context);
    }

    private final synchronized ll m5977b(Context context) {
        if (this.f6573a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6573a = new ll(context);
        }
        return this.f6573a;
    }
}
