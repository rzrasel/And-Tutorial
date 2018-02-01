package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.ConditionVariable;

@aqv
public final class adm {
    final Object f4856a = new Object();
    final ConditionVariable f4857b = new ConditionVariable();
    volatile boolean f4858c = false;
    SharedPreferences f4859d = null;

    public final <T> T m4217a(ade<T> com_google_android_gms_internal_ade_T) {
        if (this.f4857b.block(5000)) {
            if (!this.f4858c || this.f4859d == null) {
                synchronized (this.f4856a) {
                    if (!this.f4858c || this.f4859d == null) {
                        T t = com_google_android_gms_internal_ade_T.f4852c;
                        return t;
                    }
                }
            }
            return ht.m5600a(new adn(this, com_google_android_gms_internal_ade_T));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
