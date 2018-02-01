package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C1493g;
import com.google.android.gms.common.util.C1538g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.StringTokenizer;

@aqv
public final class hz {
    public static final Handler f6240a = new Handler(Looper.getMainLooper());
    private static final String f6241b = AdView.class.getName();
    private static final String f6242c = InterstitialAd.class.getName();
    private static final String f6243d = PublisherAdView.class.getName();
    private static final String f6244e = PublisherInterstitialAd.class.getName();
    private static final String f6245f = SearchAdView.class.getName();
    private static final String f6246g = AdLoader.class.getName();

    public static int m5612a(Context context, int i) {
        return m5613a(context.getResources().getDisplayMetrics(), i);
    }

    public static int m5613a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static String m5614a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || m5622a()) {
            string = "emulator";
        }
        return m5615a(string);
    }

    public static String m5615a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest.getInstance("MD5").update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r1.digest())});
            } catch (NoSuchAlgorithmException e) {
                i++;
            }
        }
        return null;
    }

    public static String m5616a(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        for (int i = 0; i + 1 < stackTraceElementArr.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f6241b.equalsIgnoreCase(className2) || f6242c.equalsIgnoreCase(className2) || f6243d.equalsIgnoreCase(className2) || f6244e.equalsIgnoreCase(className2) || f6245f.equalsIgnoreCase(className2) || f6246g.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i + 1].getClassName();
                break;
            }
        }
        className = null;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder stringBuilder = new StringBuilder();
            int i2 = 2;
            if (stringTokenizer.hasMoreElements()) {
                CharSequence stringBuilder2;
                stringBuilder.append(stringTokenizer.nextToken());
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 <= 0 || !stringTokenizer.hasMoreElements()) {
                        stringBuilder2 = stringBuilder.toString();
                    } else {
                        stringBuilder.append(".").append(stringTokenizer.nextToken());
                        i2 = i3;
                    }
                }
                stringBuilder2 = stringBuilder.toString();
            }
            if (!(className == null || className.contains(r8))) {
                return className;
            }
        }
        return null;
    }

    public static void m5617a(Context context, String str, Bundle bundle) {
        m5618a(context, null, str, bundle, true, new ia());
    }

    public static void m5618a(Context context, String str, String str2, Bundle bundle, boolean z, ic icVar) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                C1493g.m3805a();
                str = C1493g.m3806b(context) + ".11220000";
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        icVar.mo2094a(appendQueryParameter.toString());
    }

    static void m5619a(ViewGroup viewGroup, zzjb com_google_android_gms_internal_zzjb, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m5612a(context, 3);
            frameLayout.addView(textView, new LayoutParams(com_google_android_gms_internal_zzjb.f7763f - a, com_google_android_gms_internal_zzjb.f7760c - a, 17));
            viewGroup.addView(frameLayout, com_google_android_gms_internal_zzjb.f7763f, com_google_android_gms_internal_zzjb.f7760c);
        }
    }

    public static void m5620a(ViewGroup viewGroup, zzjb com_google_android_gms_internal_zzjb, String str, String str2) {
        id.m5370a(str2);
        m5619a(viewGroup, com_google_android_gms_internal_zzjb, str, -65536, -16777216);
    }

    public static void m5621a(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static boolean m5622a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static int m5623b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m5624b(displayMetrics, i);
    }

    public static int m5624b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public static String m5625b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
    }

    public static boolean m5626b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean m5627c(Context context) {
        C1493g.m3805a();
        return C1493g.m3804a(context) == 0;
    }

    public static int m5628d(Context context) {
        return DynamiteModule.m3962b(context, ModuleDescriptor.MODULE_ID);
    }

    public static int m5629e(Context context) {
        return DynamiteModule.m3955a(context, ModuleDescriptor.MODULE_ID);
    }

    public static boolean m5630f(Context context) {
        C1493g.m3805a();
        int a = C1493g.m3804a(context);
        return a == 0 || a == 2;
    }

    public static boolean m5631g(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    public static boolean m5632h(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C1538g.m3942b()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
        } else {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == i && displayMetrics.widthPixels == i2;
    }

    public static int m5633i(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }
}
