package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

final class au {
    static void m3649a(Context context, String str, String str2, String str3) {
        Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            new Thread(new av(edit)).start();
        }
    }
}
