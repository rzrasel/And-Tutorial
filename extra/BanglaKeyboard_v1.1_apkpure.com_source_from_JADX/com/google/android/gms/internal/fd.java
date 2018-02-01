package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fd extends ft {
    private /* synthetic */ Context f6088a;
    private /* synthetic */ fu f6089b;

    fd(Context context, fu fuVar) {
        this.f6088a = context;
        this.f6089b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6088a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("app_settings_json", sharedPreferences.getString("app_settings_json", ""));
        bundle.putLong("app_settings_last_update_ms", sharedPreferences.getLong("app_settings_last_update_ms", 0));
        if (this.f6089b != null) {
            this.f6089b.mo2089a(bundle);
        }
    }
}
