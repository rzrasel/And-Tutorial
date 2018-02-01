package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fm extends ft {
    private /* synthetic */ Context f6105a;
    private /* synthetic */ long f6106b;

    fm(Context context, long j) {
        this.f6105a = context;
        this.f6106b = j;
        super();
    }

    public final void mo1475a() {
        Editor edit = this.f6105a.getSharedPreferences("admob", 0).edit();
        edit.putLong("first_ad_req_time_ms", this.f6106b);
        edit.apply();
    }
}
