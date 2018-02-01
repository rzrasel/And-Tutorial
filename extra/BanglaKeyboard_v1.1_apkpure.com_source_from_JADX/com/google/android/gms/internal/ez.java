package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class ez extends ft {
    private /* synthetic */ Context f6076a;
    private /* synthetic */ fu f6077b;

    ez(Context context, fu fuVar) {
        this.f6076a = context;
        this.f6077b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6076a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("auto_collect_location", sharedPreferences.getBoolean("auto_collect_location", false));
        if (this.f6077b != null) {
            this.f6077b.mo2089a(bundle);
        }
    }
}
