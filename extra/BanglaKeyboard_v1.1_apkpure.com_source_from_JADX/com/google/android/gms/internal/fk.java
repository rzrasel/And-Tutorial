package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fk extends ft {
    private /* synthetic */ Context f6101a;
    private /* synthetic */ int f6102b;

    fk(Context context, int i) {
        this.f6101a = context;
        this.f6102b = i;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6101a.getSharedPreferences("admob", 0).edit();
        edit.putInt("request_in_session_count", this.f6102b);
        edit.apply();
    }
}
