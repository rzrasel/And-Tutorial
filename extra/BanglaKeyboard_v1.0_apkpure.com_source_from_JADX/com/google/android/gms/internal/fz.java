package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.actionbarsherlock.view.Menu;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public final class fz {
    public static final Handler f1434a = new Handler(Looper.getMainLooper());

    public static int m2028a(Context context, int i) {
        return m2029a(context.getResources().getDisplayMetrics(), i);
    }

    public static int m2029a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static String m2030a(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (string == null || m2035a()) {
            string = "emulator";
        }
        return m2031a(string);
    }

    public static String m2031a(String str) {
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

    public static void m2032a(ViewGroup viewGroup, ak akVar, String str) {
        m2033a(viewGroup, akVar, str, -16777216, -1);
    }

    private static void m2033a(ViewGroup viewGroup, ak akVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m2028a(context, 3);
            frameLayout.addView(textView, new LayoutParams(akVar.f940g - a, akVar.f937d - a, 17));
            viewGroup.addView(frameLayout, akVar.f940g, akVar.f937d);
        }
    }

    public static void m2034a(ViewGroup viewGroup, ak akVar, String str, String str2) {
        gb.m2069a(str2);
        m2033a(viewGroup, akVar, str, Menu.CATEGORY_MASK, -16777216);
    }

    public static boolean m2035a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean m2036b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
