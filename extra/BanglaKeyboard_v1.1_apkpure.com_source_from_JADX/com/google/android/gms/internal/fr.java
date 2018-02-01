package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fr extends ft {
    private /* synthetic */ Context f6115a;
    private /* synthetic */ String f6116b;

    fr(Context context, String str) {
        this.f6115a = context;
        this.f6116b = str;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6115a.getSharedPreferences("admob", 0).edit();
        edit.putString("content_url_hashes", this.f6116b);
        edit.apply();
    }
}
