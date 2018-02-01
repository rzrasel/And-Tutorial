package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1562e implements Callable<Integer> {
    private /* synthetic */ SharedPreferences f4690a;
    private /* synthetic */ String f4691b;
    private /* synthetic */ Integer f4692c;

    C1562e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f4690a = sharedPreferences;
        this.f4691b = str;
        this.f4692c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f4690a.getInt(this.f4691b, this.f4692c.intValue()));
    }
}
