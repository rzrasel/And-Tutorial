package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fo extends ft {
    private /* synthetic */ Context f6109a;
    private /* synthetic */ fu f6110b;

    fo(Context context, fu fuVar) {
        this.f6109a = context;
        this.f6110b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6109a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("webview_cache_version", sharedPreferences.getInt("webview_cache_version", 0));
        if (this.f6110b != null) {
            this.f6110b.mo2089a(bundle);
        }
    }
}
