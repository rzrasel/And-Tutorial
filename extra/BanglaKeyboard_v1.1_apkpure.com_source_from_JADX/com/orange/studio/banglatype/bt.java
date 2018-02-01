package com.orange.studio.banglatype;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.WindowManager;

public final class bt {
    private static final int[] f8241a = new int[]{R.attr.cardBackgroundColor};
    private static final int[] f8242b = new int[]{16842801};
    private static final int[] f8243c = new int[1];
    private static final ThreadLocal<TypedValue> f8244d = new ThreadLocal();

    public static float m7418a(Context context) {
        float f = 1.0f;
        if (context == null) {
            return 1.0f;
        }
        f8243c[0] = R.attr.feature_aspect_ratio;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8243c);
            f = obtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
            obtainStyledAttributes.recycle();
            return f;
        } catch (NotFoundException e) {
            return f;
        }
    }

    public static int m7419a(Context context, int i) {
        return m7434g(context, i);
    }

    public static int m7420a(Context context, String str) {
        int i = 0;
        try {
            String packageName = context.getPackageName();
            i = context.getPackageManager().getActivityInfo(new ComponentName(packageName, packageName + "." + str), 128).getThemeResource();
        } catch (NameNotFoundException e) {
        }
        return i;
    }

    public static int m7421a(Toolbar toolbar) {
        return toolbar != null ? m7434g(toolbar.getContext(), 16842806) : 0;
    }

    public static int m7422a(Toolbar toolbar, int i) {
        return toolbar != null ? m7434g(toolbar.getContext(), i) : 0;
    }

    public static boolean m7423a() {
        return VERSION.SDK_INT <= 19;
    }

    public static boolean m7424a(String str) {
        return str != null && str.startsWith("android.resource://");
    }

    public static int m7425b(Context context, int i) {
        return m7435h(context, i);
    }

    public static ContextThemeWrapper m7426b(Context context, String str) {
        return new ContextThemeWrapper(context, m7420a(context, str));
    }

    public static boolean m7427b(Context context) {
        if (context instanceof Activity) {
            Point point = new Point();
            ((Activity) context).getWindowManager().getDefaultDisplay().getSize(point);
            return point.x > point.y;
        } else if (context != null) {
            r2 = context.getResources().getDisplayMetrics();
            return r2.widthPixels > r2.heightPixels;
        } else {
            r2 = Resources.getSystem().getDisplayMetrics();
            return r2.widthPixels > r2.heightPixels;
        }
    }

    public static int m7428c(Context context, int i) {
        return m7431d(context, i);
    }

    @TargetApi(17)
    public static Point m7429c(Context context) {
        if (VERSION.SDK_INT < 14) {
            throw new RuntimeException("Unsupported Android version.");
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        try {
            defaultDisplay.getRealSize(point);
        } catch (NoSuchMethodError e) {
            point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        return point;
    }

    @TargetApi(17)
    public static int m7430d(Context context) {
        if (VERSION.SDK_INT < 14) {
            throw new RuntimeException("Unsupported Android version.");
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        try {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return point.y;
        } catch (NoSuchMethodError e) {
            return defaultDisplay.getHeight();
        }
    }

    public static int m7431d(Context context, int i) {
        int i2 = 0;
        if (context == null || i == 0) {
            return 0;
        }
        f8243c[0] = i;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8243c);
            i2 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            return i2;
        } catch (NotFoundException e) {
            return i2;
        }
    }

    public static String m7432e(Context context, int i) {
        String str = null;
        if (context != null) {
            Resources resources = context.getResources();
            try {
                str = "android.resource://" + resources.getResourcePackageName(i) + '/' + resources.getResourceTypeName(i) + '/' + resources.getResourceEntryName(i);
            } catch (NotFoundException e) {
                Log.isLoggable("ThemeUtils", 5);
            }
        }
        return str;
    }

    public static String m7433f(Context context, int i) {
        if (context == null || i == 0) {
            return null;
        }
        Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        return (!theme.resolveAttribute(i, typedValue, true) || typedValue.string == null) ? null : typedValue.string.toString();
    }

    private static int m7434g(Context context, int i) {
        int i2 = 0;
        if (context == null) {
            return 0;
        }
        f8243c[0] = i;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8243c);
            i2 = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return i2;
        } catch (NotFoundException e) {
            return i2;
        }
    }

    private static int m7435h(Context context, int i) {
        int i2 = 0;
        if (context == null) {
            return 0;
        }
        f8243c[0] = i;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8243c);
            i2 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
            return i2;
        } catch (NotFoundException e) {
            return i2;
        }
    }
}
