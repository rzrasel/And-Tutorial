package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

public final class C0696z {
    public final Object f2001a;

    private C0696z(Object obj) {
        this.f2001a = obj;
    }

    static C0696z m1991a(Object obj) {
        return obj == null ? null : new C0696z(obj);
    }

    static Object m1992a(C0696z c0696z) {
        return c0696z == null ? null : c0696z.f2001a;
    }

    public final int m1993a() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f2001a).getSystemWindowInsetLeft() : 0;
    }

    public final C0696z m1994a(int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 20 ? new C0696z(((WindowInsets) this.f2001a).replaceSystemWindowInsets(i, i2, i3, i4)) : null;
    }

    public final int m1995b() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f2001a).getSystemWindowInsetTop() : 0;
    }

    public final int m1996c() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f2001a).getSystemWindowInsetRight() : 0;
    }

    public final int m1997d() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f2001a).getSystemWindowInsetBottom() : 0;
    }

    public final boolean m1998e() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.f2001a).isConsumed() : false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0696z c0696z = (C0696z) obj;
        return this.f2001a == null ? c0696z.f2001a == null : this.f2001a.equals(c0696z.f2001a);
    }

    public final C0696z m1999f() {
        return VERSION.SDK_INT >= 20 ? new C0696z(((WindowInsets) this.f2001a).consumeSystemWindowInsets()) : null;
    }

    public final int hashCode() {
        return this.f2001a == null ? 0 : this.f2001a.hashCode();
    }
}
