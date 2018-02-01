package android.support.v4.p018f;

import android.os.Build.VERSION;
import java.util.Objects;

public final class C0493i {
    private static final C0491b f1557a;

    private static class C0491b {
        private C0491b() {
        }

        public boolean mo484a(Object obj, Object obj2) {
            return obj == obj2 || (obj != null && obj.equals(obj2));
        }
    }

    private static class C0492a extends C0491b {
        private C0492a() {
            super();
        }

        public final boolean mo484a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f1557a = new C0492a();
        } else {
            f1557a = new C0491b();
        }
    }

    public static boolean m1286a(Object obj, Object obj2) {
        return f1557a.mo484a(obj, obj2);
    }
}
