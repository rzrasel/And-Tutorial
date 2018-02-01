package com.bumptech.glide.p041g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.bumptech.glide.load.C1145c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class C1144a {
    private static final ConcurrentHashMap<String, C1145c> f3414a = new ConcurrentHashMap();

    public static C1145c m3121a(Context context) {
        String packageName = context.getPackageName();
        C1145c c1145c = (C1145c) f3414a.get(packageName);
        if (c1145c != null) {
            return c1145c;
        }
        C1145c b = C1144a.m3122b(context);
        c1145c = (C1145c) f3414a.putIfAbsent(packageName, b);
        return c1145c == null ? b : c1145c;
    }

    private static C1145c m3122b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return new C1147c(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
    }
}
