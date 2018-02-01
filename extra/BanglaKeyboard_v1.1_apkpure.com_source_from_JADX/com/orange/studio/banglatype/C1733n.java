package com.orange.studio.banglatype;

import android.app.Activity;
import android.view.View;

public final class C1733n implements C1716d {
    private static ar f8318A;
    private static as f8319B;
    private static C1730l f8320C;
    private static bp f8321D;
    private static C1729k f8322E;
    private static C1728j f8323F;
    private static bs f8324G;
    private static int f8325H;
    private static final int f8326I;
    private static final boolean f8327a = false;
    private static final boolean f8328b = false;
    private static int f8329c = -1;
    private static int f8330d = -1;
    private static int f8331e = -1;
    private static int f8332f = -1;
    private static int f8333g = 0;
    private static int f8334h = -1;
    private static int f8335i = -1;
    private static int f8336j = -1;
    private static int f8337k = -1;
    private static int f8338l = -1;
    private static int f8339m = -1;
    private static int f8340n = -1;
    private static int f8341o = -1;
    private static int f8342p = -1;
    private static int f8343q = -1;
    private static int f8344r = -1;
    private static int f8345s = -1;
    private static int f8346t = -1;
    private static int f8347u = -1;
    private static int f8348v = -1;
    private static boolean f8349w = false;
    private static C1724g f8350x;
    private static ah f8351y;
    private static aw f8352z;

    static {
        int i = 0;
        if (f8327a) {
            i = 1;
        }
        f8326I = Math.max(i, 9);
    }

    static void m7505a(Activity activity) {
        if (f8350x != null) {
            f8350x.mo2407a(activity);
        }
        if (f8351y != null) {
            f8351y.mo2407a(activity);
        }
        if (f8352z != null) {
            f8352z.mo2407a(activity);
        }
        if (f8318A != null) {
            f8318A.mo2407a(activity);
        }
        if (f8319B != null) {
            f8319B.mo2407a(activity);
        }
        if (f8320C != null) {
            f8320C.mo2407a(activity);
        }
        if (f8321D != null) {
            f8321D.mo2407a(activity);
        }
        if (f8322E != null) {
            f8322E.mo2407a(activity);
        }
        if (f8323F != null) {
            f8323F.mo2407a(activity);
        }
        if (f8324G != null) {
            f8324G.mo2407a(activity);
        }
    }

    static void m7506b() {
    }

    static void m7507b(Activity activity) {
        if (f8350x != null) {
            f8350x.mo2408b(activity);
        }
        if (f8351y != null) {
            f8351y.mo2408b(activity);
        }
        if (f8352z != null) {
            f8352z.mo2408b(activity);
        }
        if (f8318A != null) {
            f8318A.mo2408b(activity);
        }
        if (f8319B != null) {
            f8319B.mo2408b(activity);
        }
        if (f8320C != null) {
            f8320C.mo2408b(activity);
        }
        if (f8321D != null) {
            f8321D.mo2408b(activity);
        }
        if (f8322E != null) {
            f8322E.mo2408b(activity);
        }
        if (f8323F != null) {
            f8323F.mo2408b(activity);
        }
        if (f8324G != null) {
            f8324G.mo2408b(activity);
        }
    }

    static void m7508c() {
    }

    static void m7509c(Activity activity) {
        if (f8350x != null) {
            f8350x.mo2409c(activity);
        }
        if (f8351y != null) {
            f8351y.mo2409c(activity);
        }
        if (f8352z != null) {
            f8352z.mo2409c(activity);
        }
        if (f8318A != null) {
            f8318A.mo2409c(activity);
        }
        if (f8319B != null) {
            f8319B.mo2409c(activity);
        }
        if (f8320C != null) {
            f8320C.mo2409c(activity);
        }
        if (f8321D != null) {
            f8321D.mo2409c(activity);
        }
        if (f8322E != null) {
            f8322E.mo2409c(activity);
        }
        if (f8323F != null) {
            f8323F.mo2409c(activity);
        }
        if (f8324G != null) {
            f8324G.mo2409c(activity);
        }
    }

    static void m7510d() {
    }

    public final void mo2404a() {
        new StringBuilder("resetting mCurrentFallbackIndex from ").append(f8325H).append(" to 0");
        f8325H = 0;
    }

    public final void mo2405a(Activity activity, View view) {
        if (view != null) {
            C1704x c1704x;
            View a;
            new StringBuilder("getNextFallbackNetwork - mCurrentFallbackIndex is: ").append(f8325H);
            new StringBuilder("getNextFallbackNetwork starting from: ").append(f8325H + 1);
            int i = f8325H + 1;
            f8325H = i;
            while (i <= f8326I) {
                if (f8327a && i == 8) {
                    f8325H = i;
                    if (f8319B == null) {
                        f8319B = new as();
                    }
                    c1704x = f8319B;
                    if (c1704x != null) {
                        c1704x.f8130a = this;
                        c1704x.f8131b = true;
                    }
                    if (c1704x != null) {
                        a = C1722e.m7459a(view, c1704x.mo2391b());
                        if (a != null) {
                            c1704x.mo2389a(activity, a);
                        }
                    }
                }
                i++;
            }
            c1704x = null;
            if (c1704x != null) {
                c1704x.f8130a = this;
                c1704x.f8131b = true;
            }
            if (c1704x != null) {
                a = C1722e.m7459a(view, c1704x.mo2391b());
                if (a != null) {
                    c1704x.mo2389a(activity, a);
                }
            }
        }
    }
}
