package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.actionbarsherlock.view.Menu;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fo {
    private static final Object f1407a = new Object();
    private static boolean f1408b = true;
    private static String f1409c;
    private static boolean f1410d = false;

    private static String m1986a(Context context, String str) {
        String str2;
        synchronized (f1407a) {
            if (f1409c != null) {
                str2 = f1409c;
            } else {
                if (VERSION.SDK_INT >= 17) {
                    f1409c = WebSettings.getDefaultUserAgent(context);
                } else if (fz.m2036b()) {
                    f1409c = m2011d(context);
                } else {
                    fz.f1434a.post(new fp(context));
                    while (f1409c == null) {
                        try {
                            f1407a.wait();
                        } catch (InterruptedException e) {
                            str2 = f1409c;
                        }
                    }
                }
                str2 = f1409c + " (Mobile; " + str + ")";
                f1409c = str2;
            }
        }
        return str2;
    }

    public static String m1987a(Readable readable) {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence allocate = CharBuffer.allocate(2048);
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return stringBuilder.toString();
            }
            allocate.flip();
            stringBuilder.append(allocate, 0, read);
        }
    }

    public static String m1988a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static Map m1989a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.parseUrl(uri.toString());
        for (ParameterValuePair parameterValuePair : urlQuerySanitizer.getParameterList()) {
            hashMap.put(parameterValuePair.mParameter, parameterValuePair.mValue);
        }
        return hashMap;
    }

    private static JSONArray m1990a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m1997a(jSONArray, a);
        }
        return jSONArray;
    }

    private static JSONObject m1991a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m1998a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static JSONObject m1992a(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m1998a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: " + e.getMessage());
        }
    }

    public static void m1993a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m1986a(context, str));
    }

    public static void m1994a(Context context, String str, List list) {
        for (String fyVar : list) {
            fl.m1985a(new fy(context, str, fyVar).f1199e);
        }
    }

    public static void m1995a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m1986a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public static void m1996a(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            webView.onPause();
        }
    }

    private static void m1997a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m1991a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m1992a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m1990a((Collection) obj));
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : objArr) {
                m1997a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private static void m1998a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m1991a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m1992a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m1990a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m1990a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static boolean m1999a() {
        return f1408b;
    }

    public static boolean m2000a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, Menu.CATEGORY_CONTAINER);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            gb.m2069a("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean z;
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            gb.m2069a(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            gb.m2069a(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
            gb.m2069a(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            gb.m2069a(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
            gb.m2069a(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            gb.m2069a(String.format(str, new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        gb.m2069a(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    public static boolean m2001a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    public static boolean m2002a(ClassLoader classLoader, Class cls, String str) {
        boolean z = false;
        try {
            z = cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
        }
        return z;
    }

    public static int m2004b() {
        return VERSION.SDK_INT >= 9 ? 6 : 0;
    }

    public static void m2006b(Context context) {
        if (!f1410d) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new fq(), intentFilter);
            f1410d = true;
        }
    }

    public static void m2007b(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            webView.onResume();
        }
    }

    public static int m2008c() {
        return VERSION.SDK_INT >= 9 ? 7 : 1;
    }

    private static String m2011d(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }
}
