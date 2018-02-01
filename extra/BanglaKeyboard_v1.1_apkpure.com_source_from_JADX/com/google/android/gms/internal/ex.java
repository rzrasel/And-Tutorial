package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class ex extends ft {
    private /* synthetic */ Context f6072a;
    private /* synthetic */ String f6073b;

    ex(Context context, String str) {
        this.f6072a = context;
        this.f6073b = str;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6072a.getSharedPreferences("admob", 0).edit();
        edit.putString("content_vertical_hashes", this.f6073b);
        edit.apply();
    }
}
