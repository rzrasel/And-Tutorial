package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.actionbarsherlock.view.Menu;
import java.util.Locale;

public final class ey {
    public final int f1319a;
    public final boolean f1320b;
    public final boolean f1321c;
    public final String f1322d;
    public final String f1323e;
    public final boolean f1324f;
    public final boolean f1325g;
    public final boolean f1326h;
    public final String f1327i;
    public final String f1328j;
    public final int f1329k;
    public final int f1330l;
    public final int f1331m;
    public final int f1332n;
    public final int f1333o;
    public final int f1334p;
    public final float f1335q;
    public final int f1336r;
    public final int f1337s;

    public ey(Context context) {
        int type;
        boolean z = true;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packageManager = context.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.f1319a = audioManager.getMode();
        this.f1320b = m1960a(packageManager, "geo:0,0?q=donuts") != null;
        if (m1960a(packageManager, "http://www.google.com") == null) {
            z = false;
        }
        this.f1321c = z;
        this.f1322d = telephonyManager.getNetworkOperator();
        this.f1323e = locale.getCountry();
        this.f1324f = fz.m2035a();
        this.f1325g = audioManager.isMusicActive();
        this.f1326h = audioManager.isSpeakerphoneOn();
        this.f1327i = locale.getLanguage();
        this.f1328j = m1961a(packageManager);
        this.f1329k = audioManager.getStreamVolume(3);
        if (fo.m2001a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
        } else {
            type = -2;
        }
        this.f1330l = type;
        this.f1331m = telephonyManager.getNetworkType();
        this.f1332n = telephonyManager.getPhoneType();
        this.f1333o = audioManager.getRingerMode();
        this.f1334p = audioManager.getStreamVolume(2);
        this.f1335q = displayMetrics.density;
        this.f1336r = displayMetrics.widthPixels;
        this.f1337s = displayMetrics.heightPixels;
    }

    private static ResolveInfo m1960a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), Menu.CATEGORY_CONTAINER);
    }

    private static String m1961a(PackageManager packageManager) {
        String str = null;
        ResolveInfo a = m1960a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a != null) {
            ActivityInfo activityInfo = a.activityInfo;
            if (activityInfo != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo != null) {
                        str = packageInfo.versionCode + "." + activityInfo.packageName;
                    }
                } catch (NameNotFoundException e) {
                }
            }
        }
        return str;
    }
}
