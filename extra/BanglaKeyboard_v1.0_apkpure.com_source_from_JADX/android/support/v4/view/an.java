package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class an {
    static final aw f168a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            f168a = new av();
        } else if (i >= 17) {
            f168a = new au();
        } else if (i >= 16) {
            f168a = new at();
        } else if (i >= 14) {
            f168a = new as();
        } else if (i >= 11) {
            f168a = new ar();
        } else if (i >= 9) {
            f168a = new aq();
        } else {
            f168a = new ao();
        }
    }

    public static void m327a(View view, int i, int i2, int i3, int i4) {
        f168a.mo210a(view, i, i2, i3, i4);
    }

    public static void m328a(View view, int i, Paint paint) {
        f168a.mo211a(view, i, paint);
    }

    public static void m329a(View view, Paint paint) {
        f168a.mo212a(view, paint);
    }

    public static void m330a(View view, C0075a c0075a) {
        f168a.mo213a(view, c0075a);
    }

    public static void m331a(View view, Runnable runnable) {
        f168a.mo214a(view, runnable);
    }

    public static boolean m332a(View view) {
        return f168a.mo215a(view);
    }

    public static boolean m333a(View view, int i) {
        return f168a.mo216a(view, i);
    }

    public static int m334b(View view) {
        return f168a.mo217b(view);
    }

    public static void m335b(View view, int i) {
        f168a.mo218b(view, i);
    }

    public static void m336c(View view) {
        f168a.mo219c(view);
    }

    public static int m337d(View view) {
        return f168a.mo220d(view);
    }

    public static int m338e(View view) {
        return f168a.mo221e(view);
    }

    public static int m339f(View view) {
        return f168a.mo222f(view);
    }

    public static ViewParent m340g(View view) {
        return f168a.mo223g(view);
    }

    public static boolean m341h(View view) {
        return f168a.mo224h(view);
    }
}
