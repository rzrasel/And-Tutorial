package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class ey extends ft {
    private /* synthetic */ Context f6074a;
    private /* synthetic */ boolean f6075b;

    ey(Context context, boolean z) {
        this.f6074a = context;
        this.f6075b = z;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6074a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("auto_collect_location", this.f6075b);
        edit.apply();
    }
}
