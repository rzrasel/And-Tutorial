package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1536e;
import com.google.android.gms.common.util.C1538g;
import java.util.Locale;

public final class bf {
    private String f5785A;
    private boolean f5786B;
    private int f5787a;
    private boolean f5788b;
    private boolean f5789c;
    private int f5790d;
    private int f5791e;
    private int f5792f;
    private String f5793g;
    private int f5794h;
    private int f5795i;
    private int f5796j;
    private boolean f5797k;
    private int f5798l;
    private double f5799m;
    private boolean f5800n;
    private String f5801o;
    private String f5802p;
    private boolean f5803q;
    private boolean f5804r;
    private String f5805s;
    private boolean f5806t;
    private boolean f5807u;
    private String f5808v;
    private String f5809w;
    private float f5810x;
    private int f5811y;
    private int f5812z;

    public bf(Context context) {
        boolean z = true;
        PackageManager packageManager = context.getPackageManager();
        m5120a(context);
        m5121b(context);
        m5122c(context);
        Locale locale = Locale.getDefault();
        this.f5803q = m5118a(packageManager, "geo:0,0?q=donuts") != null;
        if (m5118a(packageManager, "http://www.google.com") == null) {
            z = false;
        }
        this.f5804r = z;
        this.f5805s = locale.getCountry();
        aak.m4022a();
        this.f5806t = hz.m5622a();
        this.f5807u = C1536e.m3938a(context);
        this.f5808v = locale.getLanguage();
        this.f5809w = m5119a(context, packageManager);
        this.f5785A = m5123d(context);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.f5810x = displayMetrics.density;
                this.f5811y = displayMetrics.widthPixels;
                this.f5812z = displayMetrics.heightPixels;
            }
        }
    }

    public bf(Context context, be beVar) {
        context.getPackageManager();
        m5120a(context);
        m5121b(context);
        m5122c(context);
        this.f5801o = Build.FINGERPRINT;
        this.f5802p = Build.DEVICE;
        boolean z = C1538g.m3941a() && aem.m4259a(context);
        this.f5786B = z;
        this.f5803q = beVar.f5760b;
        this.f5804r = beVar.f5761c;
        this.f5805s = beVar.f5763e;
        this.f5806t = beVar.f5764f;
        this.f5807u = beVar.f5765g;
        this.f5808v = beVar.f5768j;
        this.f5809w = beVar.f5769k;
        this.f5785A = beVar.f5770l;
        this.f5810x = beVar.f5777s;
        this.f5811y = beVar.f5778t;
        this.f5812z = beVar.f5779u;
    }

    private static ResolveInfo m5118a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String m5119a(Context context, PackageManager packageManager) {
        String str = null;
        ResolveInfo a = m5118a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a != null) {
            ActivityInfo activityInfo = a.activityInfo;
            if (activityInfo != null) {
                try {
                    PackageInfo b = lm.m5976a(context).m5975b(activityInfo.packageName, 0);
                    if (b != null) {
                        int i = b.versionCode;
                        String str2 = activityInfo.packageName;
                        str = new StringBuilder(String.valueOf(str2).length() + 12).append(i).append(".").append(str2).toString();
                    }
                } catch (NameNotFoundException e) {
                }
            }
        }
        return str;
    }

    private final void m5120a(Context context) {
        zzbv.zzea();
        AudioManager g = gb.m5492g(context);
        if (g != null) {
            try {
                this.f5787a = g.getMode();
                this.f5788b = g.isMusicActive();
                this.f5789c = g.isSpeakerphoneOn();
                this.f5790d = g.getStreamVolume(3);
                this.f5791e = g.getRingerMode();
                this.f5792f = g.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzbv.zzee().m5336a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f5787a = -2;
        this.f5788b = false;
        this.f5789c = false;
        this.f5790d = 0;
        this.f5791e = 0;
        this.f5792f = 0;
    }

    @TargetApi(16)
    private final void m5121b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5793g = telephonyManager.getNetworkOperator();
        this.f5795i = telephonyManager.getNetworkType();
        this.f5796j = telephonyManager.getPhoneType();
        this.f5794h = -2;
        this.f5797k = false;
        this.f5798l = -1;
        zzbv.zzea();
        if (gb.m5458a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f5794h = activeNetworkInfo.getType();
                this.f5798l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f5794h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f5797k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private final void m5122c(Context context) {
        boolean z = false;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.f5799m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f5800n = z;
            return;
        }
        this.f5799m = -1.0d;
        this.f5800n = false;
    }

    private static String m5123d(Context context) {
        String str = null;
        try {
            PackageInfo b = lm.m5976a(context).m5975b("com.android.vending", 128);
            if (b != null) {
                int i = b.versionCode;
                String str2 = b.packageName;
                str = new StringBuilder(String.valueOf(str2).length() + 12).append(i).append(".").append(str2).toString();
            }
        } catch (Exception e) {
        }
        return str;
    }

    public final be m5124a() {
        return new be(this.f5787a, this.f5803q, this.f5804r, this.f5793g, this.f5805s, this.f5806t, this.f5807u, this.f5788b, this.f5789c, this.f5808v, this.f5809w, this.f5785A, this.f5790d, this.f5794h, this.f5795i, this.f5796j, this.f5791e, this.f5792f, this.f5810x, this.f5811y, this.f5812z, this.f5799m, this.f5800n, this.f5797k, this.f5798l, this.f5801o, this.f5786B, this.f5802p);
    }
}
