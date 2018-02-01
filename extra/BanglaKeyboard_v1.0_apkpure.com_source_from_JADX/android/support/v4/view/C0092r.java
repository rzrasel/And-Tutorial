package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class C0092r {
    static final C0093v f187a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f187a = new C0096u();
        } else {
            f187a = new C0094s();
        }
    }

    public static boolean m475a(KeyEvent keyEvent) {
        return f187a.mo262b(keyEvent.getMetaState());
    }

    public static boolean m476b(KeyEvent keyEvent) {
        return f187a.mo263c(keyEvent.getMetaState());
    }

    public static void m477c(KeyEvent keyEvent) {
        f187a.mo261a(keyEvent);
    }
}
