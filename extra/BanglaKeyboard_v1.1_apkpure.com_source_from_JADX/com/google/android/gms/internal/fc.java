package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fc extends ft {
    private /* synthetic */ Context f6085a;
    private /* synthetic */ String f6086b;
    private /* synthetic */ long f6087c;

    fc(Context context, String str, long j) {
        this.f6085a = context;
        this.f6086b = str;
        this.f6087c = j;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6085a.getSharedPreferences("admob", 0).edit();
        edit.putString("app_settings_json", this.f6086b);
        edit.putLong("app_settings_last_update_ms", this.f6087c);
        edit.apply();
    }
}
