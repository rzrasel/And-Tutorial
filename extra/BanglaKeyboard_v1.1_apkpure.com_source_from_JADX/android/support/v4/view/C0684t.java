package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class C0684t {
    static final C0681c f1987a;

    static class C0681c {
        C0681c() {
        }

        public int mo689a(ViewGroup viewGroup) {
            return 0;
        }
    }

    static class C0682a extends C0681c {
        C0682a() {
        }

        public final int mo689a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }
    }

    static class C0683b extends C0682a {
        C0683b() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1987a = new C0683b();
        } else if (VERSION.SDK_INT >= 18) {
            f1987a = new C0682a();
        } else {
            f1987a = new C0681c();
        }
    }

    @Deprecated
    public static void m1959a(ViewGroup viewGroup) {
        viewGroup.setMotionEventSplittingEnabled(false);
    }

    public static int m1960b(ViewGroup viewGroup) {
        return f1987a.mo689a(viewGroup);
    }
}
