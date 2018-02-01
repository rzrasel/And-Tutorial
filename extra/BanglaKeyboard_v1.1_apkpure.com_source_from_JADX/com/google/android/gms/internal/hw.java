package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class hw implements Callable<String> {
    private /* synthetic */ Context f6228a;
    private /* synthetic */ Context f6229b;

    hw(Context context, Context context2) {
        this.f6228a = context;
        this.f6229b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        int i = 0;
        if (this.f6228a != null) {
            es.m5373a();
            sharedPreferences = this.f6228a.getSharedPreferences("admob_user_agent", 0);
        } else {
            es.m5373a();
            sharedPreferences = this.f6229b.getSharedPreferences("admob_user_agent", 0);
            i = 1;
        }
        CharSequence string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            es.m5373a();
            string = WebSettings.getDefaultUserAgent(this.f6229b);
            if (i != 0) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                es.m5373a();
            }
        }
        return string;
    }
}
