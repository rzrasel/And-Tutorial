package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fn extends ft {
    private /* synthetic */ Context f6107a;
    private /* synthetic */ fu f6108b;

    fn(Context context, fu fuVar) {
        this.f6107a = context;
        this.f6108b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6107a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putLong("first_ad_req_time_ms", sharedPreferences.getLong("first_ad_req_time_ms", 0));
        if (this.f6108b != null) {
            this.f6108b.mo2089a(bundle);
        }
    }
}
