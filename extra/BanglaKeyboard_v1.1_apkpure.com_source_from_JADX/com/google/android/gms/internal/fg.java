package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fg extends ft {
    private /* synthetic */ Context f6094a;
    private /* synthetic */ fu f6095b;

    fg(Context context, fu fuVar) {
        this.f6094a = context;
        this.f6095b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6094a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("native_advanced_settings", sharedPreferences.getString("native_advanced_settings", "{}"));
        if (this.f6095b != null) {
            this.f6095b.mo2089a(bundle);
        }
    }
}
