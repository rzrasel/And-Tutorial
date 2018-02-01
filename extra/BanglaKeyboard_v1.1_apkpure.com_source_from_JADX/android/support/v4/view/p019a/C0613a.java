package android.support.v4.view.p019a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class C0613a {
    private static final C0610c f1882a;

    static class C0610c {
        C0610c() {
        }

        public int mo587a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        public void mo588a(AccessibilityEvent accessibilityEvent, int i) {
        }
    }

    static class C0611a extends C0610c {
        C0611a() {
        }
    }

    static class C0612b extends C0611a {
        C0612b() {
        }

        public final int mo587a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        public final void mo588a(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f1882a = new C0612b();
        } else if (VERSION.SDK_INT >= 16) {
            f1882a = new C0611a();
        } else {
            f1882a = new C0610c();
        }
    }

    public static int m1613a(AccessibilityEvent accessibilityEvent) {
        return f1882a.mo587a(accessibilityEvent);
    }

    public static void m1614a(AccessibilityEvent accessibilityEvent, int i) {
        f1882a.mo588a(accessibilityEvent, i);
    }
}
