package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1568k implements Callable<SharedPreferences> {
    private /* synthetic */ Context f4700a;

    C1568k(Context context) {
        this.f4700a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f4700a.getSharedPreferences("google_sdk_flags", 0);
    }
}
