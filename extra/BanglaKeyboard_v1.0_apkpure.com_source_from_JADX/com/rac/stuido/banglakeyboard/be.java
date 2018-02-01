package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.actionbarsherlock.C0126R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class be {
    public static final bf f2693a = bf.m3949a();

    public static Intent m3943a(Context context) {
        Intent intent = null;
        if (context != null) {
            int i;
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            if (f2693a != bf.AMAZON_APP_STORE) {
                i = (Build.MANUFACTURER.equals("Amazon") && (Build.MODEL.equals("Kindle Fire") || Build.MODEL.startsWith("KF"))) ? 1 : 0;
                if (i == 0) {
                    i = 0;
                    if (i == 0) {
                        intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(C0126R.string.share_app_amazon), new Object[]{context.getString(C0126R.string.app_name), "http://www.amazon.com/gp/mas/dl/android?p=" + context.getPackageName()}));
                    } else {
                        if ((f2693a != bf.SAMSUNG_APP_STORE ? 1 : 0) == 0) {
                            intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(C0126R.string.share_app_samsung), new Object[]{context.getString(C0126R.string.app_name), "http://www.samsungapps.com/appquery/appDetail.as?appId=" + context.getPackageName()}));
                        } else {
                            intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(C0126R.string.share_app_google), new Object[]{context.getString(C0126R.string.app_name), "https://play.google.com/store/apps/details?id=" + context.getPackageName()}));
                        }
                    }
                }
            }
            i = 1;
            if (i == 0) {
                if (f2693a != bf.SAMSUNG_APP_STORE) {
                }
                if ((f2693a != bf.SAMSUNG_APP_STORE ? 1 : 0) == 0) {
                    intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(C0126R.string.share_app_google), new Object[]{context.getString(C0126R.string.app_name), "https://play.google.com/store/apps/details?id=" + context.getPackageName()}));
                } else {
                    intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(C0126R.string.share_app_samsung), new Object[]{context.getString(C0126R.string.app_name), "http://www.samsungapps.com/appquery/appDetail.as?appId=" + context.getPackageName()}));
                }
            } else {
                intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(C0126R.string.share_app_amazon), new Object[]{context.getString(C0126R.string.app_name), "http://www.amazon.com/gp/mas/dl/android?p=" + context.getPackageName()}));
            }
        }
        "createAppShareIntent: " + intent;
        return intent;
    }

    public static void m3944a(Context context, String str) {
        try {
            m3945a(context, str, "android.intent.category.BROWSABLE", "com.android.browser", "com.android.browser.BrowserActivity");
        } catch (ActivityNotFoundException e) {
            try {
                m3945a(context, str, "android.intent.category.BROWSABLE", "com.google.android.browser", "com.google.android.browser.BrowserActivity");
            } catch (ActivityNotFoundException e2) {
                m3948c(context, str);
            } catch (SecurityException e3) {
                m3948c(context, str);
            }
        } catch (SecurityException e4) {
            try {
                m3948c(context, str);
            } catch (ActivityNotFoundException e5) {
            } catch (SecurityException e6) {
            }
        }
    }

    private static void m3945a(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str != null && !str.equals("")) {
            intent.setData(Uri.parse(str));
            intent.addCategory(str2);
            intent.setClassName(str3, str4);
            context.startActivity(intent);
        }
    }

    public static boolean m3946a(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String str2 = null;
        if (parse != null) {
            str2 = parse.getScheme();
        }
        return str2 != null && str2.equals("andromo");
    }

    public static boolean m3947b(Context context, String str) {
        if (!m3946a(str) || str == null || str.equals("")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return false;
        }
        String host = parse.getHost();
        String path = parse.getPath();
        String str2 = "";
        if (host.equalsIgnoreCase("dashboard")) {
            host = context.getResources().getString(C0126R.string.activity_launcher_name);
            if (!host.equals("")) {
                str2 = context.getPackageName() + "." + host;
            }
        } else {
            str2 = C0566b.m3933a(context, host);
        }
        if (str2.equals("")) {
            return false;
        }
        try {
            Class cls = Class.forName(str2);
            if (Activity.class.isAssignableFrom(cls)) {
                Intent intent = new Intent(context, cls);
                intent.addFlags(67108864);
                if (!(path == null || path.equals(""))) {
                    intent.putExtra("com.rac.stuido.banglakeyboard.NAVIGATION_PAGE", path);
                }
                context.startActivity(intent);
                return true;
            }
            Object newInstance = cls.newInstance();
            boolean z = false;
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals("runIntent")) {
                    try {
                        method.invoke(newInstance, new Object[]{context});
                        z = true;
                    } catch (InvocationTargetException e) {
                        z = false;
                    }
                }
            }
            return z;
        } catch (ClassNotFoundException e2) {
            return false;
        } catch (InstantiationException e3) {
            return false;
        } catch (IllegalAccessException e4) {
            return false;
        }
    }

    private static void m3948c(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str != null && !str.equals("")) {
            intent.setData(Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            context.startActivity(intent);
        }
    }
}
