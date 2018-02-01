package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fq extends ft {
    private /* synthetic */ Context f6113a;
    private /* synthetic */ fu f6114b;

    fq(Context context, fu fuVar) {
        this.f6113a = context;
        this.f6114b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6113a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("content_url_opted_out", sharedPreferences.getBoolean("content_url_opted_out", true));
        if (this.f6114b != null) {
            this.f6114b.mo2089a(bundle);
        }
    }
}
