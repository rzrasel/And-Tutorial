package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ak {
    public static final C1705a f8140a = C1705a.m7295a();

    public enum C1705a {
        GOOGLE_PLAY(0),
        AMAZON_APP_STORE(1),
        SAMSUNG_APP_STORE(2);
        
        private final int f8139d;

        private C1705a(int i) {
            this.f8139d = i;
        }

        public static C1705a m7295a() {
            return GOOGLE_PLAY.f8139d == 0 ? GOOGLE_PLAY : AMAZON_APP_STORE.f8139d == 0 ? AMAZON_APP_STORE : SAMSUNG_APP_STORE.f8139d == 0 ? SAMSUNG_APP_STORE : GOOGLE_PLAY;
        }
    }

    public static Intent m7296a(Context context) {
        Intent intent = null;
        if (context != null) {
            int i;
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            if (f8140a != C1705a.AMAZON_APP_STORE) {
                i = (Build.MANUFACTURER.equals("Amazon") && (Build.MODEL.equals("Kindle Fire") || Build.MODEL.startsWith("KF"))) ? 1 : 0;
                if (i == 0) {
                    i = 0;
                    if (i == 0) {
                        intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(R.string.share_app_amazon), new Object[]{context.getString(R.string.app_name), "http://www.amazon.com/gp/mas/dl/android?p=" + context.getPackageName()}));
                    } else {
                        if ((f8140a != C1705a.SAMSUNG_APP_STORE ? 1 : 0) == 0) {
                            intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(R.string.share_app_samsung), new Object[]{context.getString(R.string.app_name), "http://www.samsungapps.com/appquery/appDetail.as?appId=" + context.getPackageName()}));
                        } else {
                            intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(R.string.share_app_google), new Object[]{context.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + context.getPackageName()}));
                        }
                    }
                }
            }
            i = 1;
            if (i == 0) {
                if (f8140a != C1705a.SAMSUNG_APP_STORE) {
                }
                if ((f8140a != C1705a.SAMSUNG_APP_STORE ? 1 : 0) == 0) {
                    intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(R.string.share_app_google), new Object[]{context.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + context.getPackageName()}));
                } else {
                    intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(R.string.share_app_samsung), new Object[]{context.getString(R.string.app_name), "http://www.samsungapps.com/appquery/appDetail.as?appId=" + context.getPackageName()}));
                }
            } else {
                intent.putExtra("android.intent.extra.TEXT", String.format(context.getString(R.string.share_app_amazon), new Object[]{context.getString(R.string.app_name), "http://www.amazon.com/gp/mas/dl/android?p=" + context.getPackageName()}));
            }
        }
        return intent;
    }

    public static void m7297a(Context context, String str) {
        try {
            m7298a(context, str, "android.intent.category.BROWSABLE", "com.android.browser", "com.android.browser.BrowserActivity");
        } catch (ActivityNotFoundException e) {
            try {
                m7298a(context, str, "android.intent.category.BROWSABLE", "com.google.android.browser", "com.google.android.browser.BrowserActivity");
            } catch (ActivityNotFoundException e2) {
                m7301c(context, str);
            } catch (SecurityException e3) {
                m7301c(context, str);
            }
        } catch (SecurityException e4) {
            try {
                m7301c(context, str);
            } catch (ActivityNotFoundException e5) {
            } catch (SecurityException e6) {
            }
        }
    }

    private static void m7298a(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str != null && !str.equals("")) {
            intent.setData(Uri.parse(str));
            intent.addCategory(str2);
            intent.setClassName(str3, str4);
            context.startActivity(intent);
        }
    }

    public static boolean m7299a(String str) {
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

    public static boolean m7300b(Context context, String str) {
        if (!m7299a(str) || str == null || str.equals("")) {
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
            host = context.getResources().getString(R.string.activity_launcher_name);
            if (!host.equals("")) {
                str2 = context.getPackageName() + "." + host;
            }
        } else {
            str2 = C1709b.m7362a(context, host);
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
                    intent.putExtra("com.orange.studio.banglatype.NAVIGATION_PAGE", path);
                }
                if (context instanceof Activity) {
                    C1735p.m7518a((Activity) context, intent);
                } else {
                    context.startActivity(intent);
                }
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

    private static void m7301c(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str != null && !str.equals("")) {
            intent.setData(Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            context.startActivity(intent);
        }
    }
}
