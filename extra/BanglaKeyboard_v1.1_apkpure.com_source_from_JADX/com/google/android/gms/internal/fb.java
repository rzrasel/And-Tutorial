package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fb extends ft {
    private /* synthetic */ Context f6083a;
    private /* synthetic */ fu f6084b;

    fb(Context context, fu fuVar) {
        this.f6083a = context;
        this.f6084b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6083a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("version_code", sharedPreferences.getInt("version_code", 0));
        if (this.f6084b != null) {
            this.f6084b.mo2089a(bundle);
        }
    }
}
