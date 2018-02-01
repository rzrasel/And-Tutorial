package android.support.v4.p017e;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

final class C0465d {
    private static Method f1495a;
    private static Method f1496b;

    static {
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f1495a = cls.getMethod("getScript", new Class[]{String.class});
                f1496b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Throwable e) {
            f1495a = null;
            f1496b = null;
            Log.w("ICUCompatIcs", e);
        }
    }

    private static String m1204a(String str) {
        try {
            if (f1495a != null) {
                return (String) f1495a.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        } catch (Throwable e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return null;
    }

    public static String m1205a(Locale locale) {
        String b = C0465d.m1206b(locale);
        return b != null ? C0465d.m1204a(b) : null;
    }

    private static String m1206b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f1496b != null) {
                return (String) f1496b.invoke(null, new Object[]{locale2});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        } catch (Throwable e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return locale2;
    }
}
