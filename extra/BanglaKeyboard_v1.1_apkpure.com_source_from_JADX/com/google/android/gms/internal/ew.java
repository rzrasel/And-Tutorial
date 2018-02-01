package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class ew extends ft {
    private /* synthetic */ Context f6070a;
    private /* synthetic */ boolean f6071b;

    ew(Context context, boolean z) {
        this.f6070a = context;
        this.f6071b = z;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6070a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("use_https", this.f6071b);
        edit.apply();
    }
}
