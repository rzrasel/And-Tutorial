package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fs extends ft {
    private /* synthetic */ Context f6117a;
    private /* synthetic */ fu f6118b;

    fs(Context context, fu fuVar) {
        this.f6117a = context;
        this.f6118b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6117a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("content_url_hashes", sharedPreferences.getString("content_url_hashes", ""));
        if (this.f6118b != null) {
            this.f6118b.mo2089a(bundle);
        }
    }
}
