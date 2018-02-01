package android.support.v4.p017e;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

final class C0464c {
    private static Method f1494a;

    static {
        try {
            f1494a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static String m1203a(Locale locale) {
        try {
            return ((Locale) f1494a.invoke(null, new Object[]{locale})).getScript();
        } catch (Throwable e) {
            Log.w("ICUCompatApi21", e);
            return locale.getScript();
        } catch (Throwable e2) {
            Log.w("ICUCompatApi21", e2);
            return locale.getScript();
        }
    }
}
