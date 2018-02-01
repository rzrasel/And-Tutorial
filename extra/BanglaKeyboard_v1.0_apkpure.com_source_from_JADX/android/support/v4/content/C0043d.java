package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class C0043d {
    private static final C0044e f47a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            f47a = new C0047h();
        } else if (i >= 11) {
            f47a = new C0046g();
        } else {
            f47a = new C0045f();
        }
    }

    public static Intent m52a(ComponentName componentName) {
        return f47a.mo144a(componentName);
    }
}
