package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

public final class ku {
    public static aiy m5893a(Context context) {
        kp kqVar;
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = new StringBuilder(String.valueOf(packageName).length() + 12).append(packageName).append("/").append(context.getPackageManager().getPackageInfo(packageName, 0).versionCode).toString();
        } catch (NameNotFoundException e) {
        }
        if (VERSION.SDK_INT >= 9) {
            kqVar = new kq();
        } else {
            Object iuVar = new iu(AndroidHttpClient.newInstance(str));
        }
        aiy com_google_android_gms_internal_aiy = new aiy(new ev(file, (byte) 0), new bx(kqVar), (byte) 0);
        com_google_android_gms_internal_aiy.m4576a();
        return com_google_android_gms_internal_aiy;
    }
}
