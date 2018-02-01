package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class ax {
    static final ba f170a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f170a = new az();
        } else {
            f170a = new ay();
        }
    }

    public static int m391a(ViewConfiguration viewConfiguration) {
        return f170a.mo226a(viewConfiguration);
    }
}
