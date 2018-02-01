package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class bb {
    static final be f171a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            f171a = new bf();
        } else if (i >= 14) {
            f171a = new bd();
        } else if (i >= 11) {
            f171a = new bc();
        } else {
            f171a = new bg();
        }
    }

    public static void m426a(ViewGroup viewGroup) {
        f171a.mo238a(viewGroup);
    }
}
