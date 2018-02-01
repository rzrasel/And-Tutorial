package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fh extends ft {
    private /* synthetic */ Context f6096a;

    fh(Context context) {
        this.f6096a = context;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6096a.getSharedPreferences("admob", 0).edit();
        edit.remove("native_advanced_settings");
        edit.apply();
    }
}
