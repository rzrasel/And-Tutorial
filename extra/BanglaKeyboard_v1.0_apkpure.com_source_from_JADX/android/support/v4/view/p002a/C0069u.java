package android.support.v4.view.p002a;

import android.os.Build.VERSION;

public final class C0069u {
    private static final C0070x f157a;
    private final Object f158b;

    static {
        if (VERSION.SDK_INT >= 16) {
            f157a = new C0074y();
        } else if (VERSION.SDK_INT >= 15) {
            f157a = new C0073w();
        } else if (VERSION.SDK_INT >= 14) {
            f157a = new C0072v();
        } else {
            f157a = new C0071z();
        }
    }

    private C0069u(Object obj) {
        this.f158b = obj;
    }

    public static C0069u m278a() {
        return new C0069u(f157a.mo198a());
    }

    public final void m279a(int i) {
        f157a.mo201b(this.f158b, i);
    }

    public final void m280a(boolean z) {
        f157a.mo200a(this.f158b, z);
    }

    public final void m281b(int i) {
        f157a.mo199a(this.f158b, i);
    }

    public final void m282c(int i) {
        f157a.mo202c(this.f158b, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0069u c0069u = (C0069u) obj;
        return this.f158b == null ? c0069u.f158b == null : this.f158b.equals(c0069u.f158b);
    }

    public final int hashCode() {
        return this.f158b == null ? 0 : this.f158b.hashCode();
    }
}
