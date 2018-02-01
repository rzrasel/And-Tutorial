package com.orange.studio.banglatype;

import android.app.Activity;
import android.view.View;

public final class bw implements C1716d {
    private static ah f8247A;
    private static aw f8248B;
    private static ar f8249C;
    private static as f8250D;
    private static C1730l f8251E;
    private static bp f8252F;
    private static C1729k f8253G;
    private static C1728j f8254H;
    private static bs f8255I;
    private static final int f8256J = Math.max(m7442c(), 9);
    static final boolean f8257a = false;
    static final boolean f8258b = true;
    static boolean f8259c;
    static int f8260d = -1;
    static int f8261e = -1;
    static int f8262f;
    private static int f8263g = -1;
    private static int f8264h = -1;
    private static int f8265i = -1;
    private static int f8266j = -1;
    private static int f8267k = -1;
    private static int f8268l = -1;
    private static int f8269m = -1;
    private static int f8270n = -1;
    private static int f8271o = -1;
    private static int f8272p = -1;
    private static int f8273q = -1;
    private static int f8274r = -1;
    private static int f8275s = -1;
    private static int f8276t = -1;
    private static int f8277u = -1;
    private static int f8278v = -1;
    private static int f8279w = -1;
    private static int f8280x = -1;
    private static boolean f8281y = false;
    private static C1724g f8282z;

    static void m7439a(Activity activity) {
        if (f8282z != null) {
            f8282z.mo2407a(activity);
        }
        if (f8247A != null) {
            f8247A.mo2407a(activity);
        }
        if (f8248B != null) {
            f8248B.mo2407a(activity);
        }
        if (f8249C != null) {
            f8249C.mo2407a(activity);
        }
        if (f8250D != null) {
            f8250D.mo2407a(activity);
        }
        if (f8251E != null) {
            f8251E.mo2407a(activity);
        }
        if (f8252F != null) {
            f8252F.mo2407a(activity);
        }
        if (f8253G != null) {
            f8253G.mo2407a(activity);
        }
        if (f8254H != null) {
            f8254H.mo2407a(activity);
        }
        if (f8255I != null) {
            f8255I.mo2407a(activity);
        }
    }

    static void m7440b() {
        if (f8259c) {
            f8281y = false;
            f8260d = -1;
            f8273q = -1;
            f8274r = -1;
            f8275s = -1;
            f8261e = -1;
            f8276t = -1;
            f8277u = -1;
            f8278v = -1;
            f8279w = -1;
            f8280x = -1;
        }
        f8259c = false;
    }

    static void m7441b(Activity activity) {
        if (f8282z != null) {
            f8282z.mo2408b(activity);
        }
        if (f8247A != null) {
            f8247A.mo2408b(activity);
        }
        if (f8248B != null) {
            f8248B.mo2408b(activity);
        }
        if (f8249C != null) {
            f8249C.mo2408b(activity);
        }
        if (f8250D != null) {
            f8250D.mo2408b(activity);
        }
        if (f8251E != null) {
            f8251E.mo2408b(activity);
        }
        if (f8252F != null) {
            f8252F.mo2408b(activity);
        }
        if (f8253G != null) {
            f8253G.mo2408b(activity);
        }
        if (f8254H != null) {
            f8254H.mo2408b(activity);
        }
        if (f8255I != null) {
            f8255I.mo2408b(activity);
        }
    }

    public static int m7442c() {
        int i = 0;
        if (!f8259c) {
            i = 1;
        }
        return f8257a ? i + 1 : i;
    }

    static void m7443c(Activity activity) {
        if (f8282z != null) {
            f8282z.mo2409c(activity);
        }
        if (f8247A != null) {
            f8247A.mo2409c(activity);
        }
        if (f8248B != null) {
            f8248B.mo2409c(activity);
        }
        if (f8249C != null) {
            f8249C.mo2409c(activity);
        }
        if (f8250D != null) {
            f8250D.mo2409c(activity);
        }
        if (f8251E != null) {
            f8251E.mo2409c(activity);
        }
        if (f8252F != null) {
            f8252F.mo2409c(activity);
        }
        if (f8253G != null) {
            f8253G.mo2409c(activity);
        }
        if (f8254H != null) {
            f8254H.mo2409c(activity);
        }
        if (f8255I != null) {
            f8255I.mo2409c(activity);
        }
    }

    static void m7444d() {
        int i = 0;
        int c = m7442c();
        int i2 = !f8259c ? f8263g + 0 : 0;
        if (f8257a) {
            i2 += f8268l;
        }
        if (i2 != 100 && c > 0) {
            int i3;
            int i4 = 100 % c;
            i2 = c != 1 ? 100 / c : 100;
            if (f8259c) {
                i3 = i4;
            } else {
                f8263g = i2 + i4;
                i3 = 0;
            }
            if (f8257a) {
                f8268l = i2 + i3;
            }
        }
        if (!f8281y) {
            if (!f8259c) {
                f8260d = f8263g + 0;
                i = f8263g + 0;
            }
            if (f8257a) {
                f8261e = f8268l + i;
            }
            new StringBuilder("initAdPercentages mAdMobPercentage: ").append(f8263g);
            new StringBuilder("initAdPercentages mFacebookPercentage: ").append(f8264h);
            new StringBuilder("initAdPercentages mMillennialMediaPercentage: ").append(f8265i);
            new StringBuilder("initAdPercentages mJavascriptAdPercentage: ").append(f8266j);
            new StringBuilder("initAdPercentages mLeadBoltPercentage: ").append(f8268l);
            new StringBuilder("initAdPercentages mAmazonPercentage: ").append(f8269m);
            new StringBuilder("initAdPercentages mStartAppPercentage: ").append(f8270n);
            new StringBuilder("initAdPercentages mAirpushPercentage: ").append(f8271o);
            new StringBuilder("initAdPercentages mAirpush360Percentage: ").append(f8272p);
            new StringBuilder("initAdPercentages mStaticAdPercentage: ").append(f8267k);
            new StringBuilder("initAdPercentages mAdMobCutOff: ").append(f8260d);
            new StringBuilder("initAdPercentages mFacebookCutOff: ").append(f8273q);
            new StringBuilder("initAdPercentages mMillennialMediaCutOff: ").append(f8274r);
            new StringBuilder("initAdPercentages mJavascriptAdCutOff: ").append(f8275s);
            new StringBuilder("initAdPercentages mLeadBoltCutOff: ").append(f8261e);
            new StringBuilder("initAdPercentages mAmazonCutOff: ").append(f8276t);
            new StringBuilder("initAdPercentages mStartAppCutOff: ").append(f8277u);
            new StringBuilder("initAdPercentages mAirpushCutOff: ").append(f8278v);
            new StringBuilder("initAdPercentages mAirpush360CutOff: ").append(f8279w);
            new StringBuilder("initAdPercentages mStaticAdCutOff: ").append(f8280x);
        }
    }

    static void m7445e() {
    }

    static void m7446f() {
    }

    static void m7447g() {
    }

    static C1704x m7448h() {
        if (f8282z == null) {
            f8282z = new C1724g();
        }
        return f8282z;
    }

    static C1704x m7449i() {
        if (f8250D == null) {
            f8250D = new as();
        }
        return f8250D;
    }

    public final void mo2404a() {
        new StringBuilder("resetting mCurrentFallbackIndex from ").append(f8262f).append(" to 0");
        f8262f = 0;
    }

    public final void mo2405a(Activity activity, View view) {
        if (view != null) {
            C1704x i;
            new StringBuilder("getNextFallbackNetwork - mCurrentFallbackIndex is: ").append(f8262f);
            new StringBuilder("getNextFallbackNetwork starting from: ").append(f8262f + 1);
            int i2 = f8262f + 1;
            f8262f = i2;
            while (i2 <= f8256J) {
                if (f8259c || i2 != 1) {
                    if (f8257a && i2 == 8) {
                        f8262f = i2;
                        i = m7449i();
                        break;
                    }
                    i2++;
                } else {
                    f8262f = i2;
                    i = m7448h();
                    break;
                }
            }
            i = null;
            if (i != null) {
                i.f8130a = this;
                i.f8131b = false;
            }
            if (i != null) {
                View a = C1722e.m7459a(view, i.mo2391b());
                if (a != null) {
                    i.mo2389a(activity, a);
                }
            }
        }
    }
}
