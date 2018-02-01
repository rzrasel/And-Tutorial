package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1564g implements Callable<Long> {
    private /* synthetic */ SharedPreferences f4693a;
    private /* synthetic */ String f4694b;
    private /* synthetic */ Long f4695c;

    C1564g(SharedPreferences sharedPreferences, String str, Long l) {
        this.f4693a = sharedPreferences;
        this.f4694b = str;
        this.f4695c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f4693a.getLong(this.f4694b, this.f4695c.longValue()));
    }
}
