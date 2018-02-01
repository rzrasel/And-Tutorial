package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fe extends ft {
    private /* synthetic */ Context f6090a;
    private /* synthetic */ String f6091b;

    fe(Context context, String str) {
        this.f6090a = context;
        this.f6091b = str;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6090a.getSharedPreferences("admob", 0).edit();
        edit.putString("native_advanced_settings", this.f6091b);
        edit.apply();
    }
}
