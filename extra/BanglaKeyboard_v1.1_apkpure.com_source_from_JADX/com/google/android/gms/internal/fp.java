package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fp extends ft {
    private /* synthetic */ Context f6111a;
    private /* synthetic */ boolean f6112b;

    fp(Context context, boolean z) {
        this.f6111a = context;
        this.f6112b = z;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6111a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("content_url_opted_out", this.f6112b);
        edit.apply();
    }
}
