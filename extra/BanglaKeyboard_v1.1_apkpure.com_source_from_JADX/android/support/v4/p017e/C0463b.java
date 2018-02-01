package android.support.v4.p017e;

import android.os.Build.VERSION;
import java.util.Locale;

public final class C0463b {
    private static final C0461b f1493a;

    static class C0461b {
        C0461b() {
        }

        public String mo471a(Locale locale) {
            return C0465d.m1205a(locale);
        }
    }

    static class C0462a extends C0461b {
        C0462a() {
        }

        public final String mo471a(Locale locale) {
            return C0464c.m1203a(locale);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1493a = new C0462a();
        } else {
            f1493a = new C0461b();
        }
    }

    public static String m1202a(Locale locale) {
        return f1493a.mo471a(locale);
    }
}
