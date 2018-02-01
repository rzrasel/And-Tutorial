package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fi extends ft {
    private /* synthetic */ Context f6097a;
    private /* synthetic */ long f6098b;

    fi(Context context, long j) {
        this.f6097a = context;
        this.f6098b = j;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6097a.getSharedPreferences("admob", 0).edit();
        edit.putLong("app_last_background_time_ms", this.f6098b);
        edit.apply();
    }
}
