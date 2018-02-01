package android.support.v4.view.p019a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

public final class C0643f {
    private static final C0640c f1927a;
    private final AccessibilityRecord f1928b;

    static class C0640c {
        C0640c() {
        }

        public void mo629a(AccessibilityRecord accessibilityRecord, int i) {
        }

        public void mo630b(AccessibilityRecord accessibilityRecord, int i) {
        }
    }

    static class C0641a extends C0640c {
        C0641a() {
        }

        public final void mo629a(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        public final void mo630b(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    static class C0642b extends C0641a {
        C0642b() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f1927a = new C0642b();
        } else if (VERSION.SDK_INT >= 15) {
            f1927a = new C0641a();
        } else {
            f1927a = new C0640c();
        }
    }

    public static void m1736a(AccessibilityRecord accessibilityRecord, int i) {
        f1927a.mo629a(accessibilityRecord, i);
    }

    public static void m1737b(AccessibilityRecord accessibilityRecord, int i) {
        f1927a.mo630b(accessibilityRecord, i);
    }

    @Deprecated
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
        C0643f c0643f = (C0643f) obj;
        return this.f1928b == null ? c0643f.f1928b == null : this.f1928b.equals(c0643f.f1928b);
    }

    @Deprecated
    public final int hashCode() {
        return this.f1928b == null ? 0 : this.f1928b.hashCode();
    }
}
