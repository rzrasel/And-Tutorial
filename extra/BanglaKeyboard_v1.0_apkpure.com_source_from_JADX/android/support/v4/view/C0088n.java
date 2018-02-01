package android.support.v4.view;

import android.os.Build.VERSION;

public final class C0088n {
    static final C0089o f186a;

    static {
        if (VERSION.SDK_INT >= 17) {
            f186a = new C0091q();
        } else {
            f186a = new C0090p();
        }
    }

    public static int m471a(int i, int i2) {
        return f186a.mo260a(i, i2);
    }
}
