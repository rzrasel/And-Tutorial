package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

public final class C0588b {
    public static void m1560a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void m1561a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
