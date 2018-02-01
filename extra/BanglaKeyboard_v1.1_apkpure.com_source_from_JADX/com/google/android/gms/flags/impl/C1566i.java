package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class C1566i implements Callable<String> {
    private /* synthetic */ SharedPreferences f4696a;
    private /* synthetic */ String f4697b;
    private /* synthetic */ String f4698c;

    C1566i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f4696a = sharedPreferences;
        this.f4697b = str;
        this.f4698c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f4696a.getString(this.f4697b, this.f4698c);
    }
}
