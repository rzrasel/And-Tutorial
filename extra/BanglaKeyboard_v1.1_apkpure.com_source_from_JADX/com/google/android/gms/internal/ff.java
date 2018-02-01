package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class ff extends ft {
    private /* synthetic */ Context f6092a;
    private /* synthetic */ fu f6093b;

    ff(Context context, fu fuVar) {
        this.f6092a = context;
        this.f6093b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6092a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedPreferences.getBoolean("use_https", true));
        if (this.f6093b != null) {
            this.f6093b.mo2089a(bundle);
        }
    }
}
