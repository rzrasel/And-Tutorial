package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1560c implements Callable<Boolean> {
    private /* synthetic */ SharedPreferences f4687a;
    private /* synthetic */ String f4688b;
    private /* synthetic */ Boolean f4689c;

    C1560c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f4687a = sharedPreferences;
        this.f4688b = str;
        this.f4689c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f4687a.getBoolean(this.f4688b, this.f4689c.booleanValue()));
    }
}
