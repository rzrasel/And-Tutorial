package android.support.v4.view.p002a;

import android.os.Build.VERSION;
import java.util.List;

public final class C0056h {
    private static final C0057i f149a;
    private final Object f150b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f149a = new C0062l();
        } else if (VERSION.SDK_INT >= 16) {
            f149a = new C0059j();
        } else {
            f149a = new C0058n();
        }
    }

    public C0056h() {
        this.f150b = f149a.mo190a(this);
    }

    public C0056h(Object obj) {
        this.f150b = obj;
    }

    public static C0049a m255b() {
        return null;
    }

    public static boolean m256c() {
        return false;
    }

    public static List m257d() {
        return null;
    }

    public static C0049a m258e() {
        return null;
    }

    public final Object m259a() {
        return this.f150b;
    }
}
