package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fa extends ft {
    private /* synthetic */ Context f6081a;
    private /* synthetic */ int f6082b;

    fa(Context context, int i) {
        this.f6081a = context;
        this.f6082b = i;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6081a.getSharedPreferences("admob", 0).edit();
        edit.putInt("version_code", this.f6082b);
        edit.apply();
    }
}
