package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class C0747g {
    private static final C0745b f2255a;

    static class C0745b {
        C0745b() {
        }

        public void mo712a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    static class C0746a extends C0745b {
        C0746a() {
        }

        public final void mo712a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f2255a = new C0746a();
        } else {
            f2255a = new C0745b();
        }
    }

    public static void m2144a(EdgeEffect edgeEffect, float f, float f2) {
        f2255a.mo712a(edgeEffect, f, f2);
    }
}
