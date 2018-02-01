package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fj extends ft {
    private /* synthetic */ Context f6099a;
    private /* synthetic */ fu f6100b;

    fj(Context context, fu fuVar) {
        this.f6099a = context;
        this.f6100b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6099a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putLong("app_last_background_time_ms", sharedPreferences.getLong("app_last_background_time_ms", 0));
        if (this.f6100b != null) {
            this.f6100b.mo2089a(bundle);
        }
    }
}
