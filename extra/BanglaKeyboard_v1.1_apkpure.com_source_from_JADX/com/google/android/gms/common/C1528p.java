package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.UserManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import com.google.android.gms.C1404a.C1396a;
import com.google.android.gms.common.internal.C1513q;
import com.google.android.gms.common.util.C1536e;
import com.google.android.gms.common.util.C1538g;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C1528p {
    @Deprecated
    public static final int f4626a = 11220000;
    static final AtomicBoolean f4627b = new AtomicBoolean();
    private static boolean f4628c = false;
    private static boolean f4629d = false;
    private static boolean f4630e = false;
    private static boolean f4631f = false;
    private static final AtomicBoolean f4632g = new AtomicBoolean();

    @Deprecated
    public static int m3912a(Context context) {
        int a;
        boolean z;
        int i;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(C1396a.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || f4632g.get())) {
            a = C1513q.m3856a(context);
            if (a == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (a != f4626a) {
                String str = "com.google.android.gms.version";
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(f4626a).append(" but found ").append(a).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(str).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
        if (!C1538g.m3946f() || C1536e.m3938a(context)) {
            if (C1536e.f4658a == null) {
                z = (VERSION.SDK_INT >= 20 ? 1 : 0) != 0 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
                C1536e.f4658a = Boolean.valueOf(z);
            }
            if (C1536e.f4658a.booleanValue()) {
                a = 1;
                if (a == 0) {
                    if (C1536e.f4659b == null) {
                        z = context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
                        C1536e.f4659b = Boolean.valueOf(z);
                    }
                    if (!C1536e.f4659b.booleanValue()) {
                        i = 1;
                        packageInfo = null;
                        if (i != 0) {
                            try {
                                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                            } catch (NameNotFoundException e) {
                                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                                return 9;
                            }
                        }
                        packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                        C1529q.m3918a(context);
                        if (i == 0) {
                            if (C1529q.m3917a(packageInfo, C1524l.f4625a) != null) {
                                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                                return 9;
                            }
                            if (C1529q.m3917a(packageInfo2, C1529q.m3917a(packageInfo, C1524l.f4625a)) == null) {
                                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                                return 9;
                            }
                        } else if (C1529q.m3917a(packageInfo2, C1524l.f4625a) == null) {
                            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                            return 9;
                        }
                        if (packageInfo2.versionCode / 1000 >= f4626a / 1000) {
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f4626a + " but found " + packageInfo2.versionCode);
                            return 2;
                        }
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (Throwable e2) {
                                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                                return 1;
                            }
                        }
                        return applicationInfo.enabled ? 3 : 0;
                    }
                }
                i = 0;
                packageInfo = null;
                if (i != 0) {
                    packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                C1529q.m3918a(context);
                if (i == 0) {
                    if (C1529q.m3917a(packageInfo, C1524l.f4625a) != null) {
                        if (C1529q.m3917a(packageInfo2, C1529q.m3917a(packageInfo, C1524l.f4625a)) == null) {
                            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                            return 9;
                        }
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                } else if (C1529q.m3917a(packageInfo2, C1524l.f4625a) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
                if (packageInfo2.versionCode / 1000 >= f4626a / 1000) {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                    }
                }
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f4626a + " but found " + packageInfo2.versionCode);
                return 2;
            }
        }
        a = 0;
        if (a == 0) {
            if (C1536e.f4659b == null) {
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                }
                C1536e.f4659b = Boolean.valueOf(z);
            }
            if (C1536e.f4659b.booleanValue()) {
                i = 1;
                packageInfo = null;
                if (i != 0) {
                    packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                C1529q.m3918a(context);
                if (i == 0) {
                    if (C1529q.m3917a(packageInfo, C1524l.f4625a) != null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    if (C1529q.m3917a(packageInfo2, C1529q.m3917a(packageInfo, C1524l.f4625a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                } else if (C1529q.m3917a(packageInfo2, C1524l.f4625a) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
                if (packageInfo2.versionCode / 1000 >= f4626a / 1000) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f4626a + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                }
                if (applicationInfo.enabled) {
                }
            }
        }
        i = 0;
        packageInfo = null;
        if (i != 0) {
            packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
        }
        try {
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1529q.m3918a(context);
            if (i == 0) {
                if (C1529q.m3917a(packageInfo, C1524l.f4625a) != null) {
                    if (C1529q.m3917a(packageInfo2, C1529q.m3917a(packageInfo, C1524l.f4625a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                }
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (C1529q.m3917a(packageInfo2, C1524l.f4625a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (packageInfo2.versionCode / 1000 >= f4626a / 1000) {
                applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                }
                if (applicationInfo.enabled) {
                }
            }
            Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f4626a + " but found " + packageInfo2.versionCode);
            return 2;
        } catch (NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static boolean m3913a(Context context, int i) {
        return i == 18 ? true : i == 1 ? C1528p.m3914a(context, "com.google.android.gms") : false;
    }

    @TargetApi(21)
    private static boolean m3914a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C1538g.m3945e()) {
            for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, FragmentTransaction.TRANSIT_EXIT_MASK);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                Object obj;
                if (C1538g.m3943c()) {
                    Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
                    if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                        obj = 1;
                        if (obj == null) {
                            return true;
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static Context m3915b(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    public static int m3916c(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return i;
        }
    }
}
