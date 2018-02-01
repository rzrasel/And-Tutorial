package android.support.v4.p017e;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class C0474g {
    @Deprecated
    public static final Locale f1510a = new Locale("", "");

    public static int m1217a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (!(locale == null || locale.equals(f1510a))) {
            String a = C0463b.m1202a(locale);
            if (a == null) {
                switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                    case (byte) 1:
                    case (byte) 2:
                        return 1;
                    default:
                        return 0;
                }
            } else if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
