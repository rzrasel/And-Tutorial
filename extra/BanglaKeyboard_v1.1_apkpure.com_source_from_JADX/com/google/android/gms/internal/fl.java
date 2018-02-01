package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fl extends ft {
    private /* synthetic */ Context f6103a;
    private /* synthetic */ fu f6104b;

    fl(Context context, fu fuVar) {
        this.f6103a = context;
        this.f6104b = fuVar;
        super();
    }

    public final void mo1475a() {
        SharedPreferences sharedPreferences = this.f6103a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("request_in_session_count", sharedPreferences.getInt("request_in_session_count", -1));
        if (this.f6104b != null) {
            this.f6104b.mo2089a(bundle);
        }
    }
}
