package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.orange.studio.banglatype.C1722e.C1721b;
import com.orange.studio.banglatype.C1732m.C1731a;
import com.orange.studio.banglatype.InterstitialHelperBase.AudioServiceReceiver;
import java.util.Random;

public final class C1723f {
    private static bw f8300a = new bw();
    private static C1733n f8301b = new C1733n();
    private static bx f8302c = new bx();
    private static C1734o f8303d = new C1734o();
    private static InterstitialHelperBase f8304e;
    private static int f8305f;
    private static Activity f8306g;
    private static boolean f8307h;

    static void m7460a() {
        bx.m7456b();
        C1734o.m7513a();
        bw.m7447g();
        C1733n.m7510d();
    }

    static void m7461a(Activity activity) {
        new StringBuilder("onActivityCreated: ").append(activity);
        new StringBuilder("Setting mActivity: ").append(activity).append(", was: ").append(f8306g);
        f8306g = activity;
        C1723f.m7476h(activity);
    }

    public static boolean m7462a(Activity activity, ViewGroup viewGroup) {
        bw.m7440b();
        int i = C1721b.f8296a;
        bw.m7440b();
        C1704x f = C1723f.m7473f();
        if (f == null) {
            return false;
        }
        C1723f.m7475g(activity);
        return f.mo2390a(activity, viewGroup, i);
    }

    public static boolean m7463a(Activity activity, ViewGroup viewGroup, int i) {
        bw.m7440b();
        C1704x f = C1723f.m7473f();
        if (f == null) {
            return false;
        }
        C1723f.m7475g(activity);
        return f.mo2390a(activity, viewGroup, i);
    }

    public static boolean m7464a(Activity activity, Runnable runnable) {
        boolean z = true;
        boolean z2 = false;
        if (f8304e == null || !f8307h) {
            Log.w("AdManager", "showInterstitialAd called without any ad network selected, calling initializeInterstitial() to select one and initialize it...");
            C1723f.m7476h(activity);
        }
        if (f8304e != null && f8307h) {
            if (!(System.currentTimeMillis() > activity.getSharedPreferences("com.orange.studio.banglatype.interstitial", 0).getLong("interstitialAdExpiration", -1))) {
                z = false;
            }
            if (z) {
                int nextInt;
                if (f8304e.mo2413b()) {
                    new StringBuilder("Ready to show, calling ").append(f8304e.getClass().getSimpleName()).append(".showInterstitial()");
                    Editor edit = activity.getSharedPreferences("com.orange.studio.banglatype.interstitial", 0).edit();
                    edit.putLong("interstitialAdExpiration", System.currentTimeMillis() + 120000);
                    edit.apply();
                    nextInt = new Random().nextInt(3) + 2;
                    Editor edit2 = activity.getSharedPreferences("com.orange.studio.banglatype.interstitial", 0).edit();
                    edit2.putInt("interstitialAdEventCount", nextInt);
                    edit2.apply();
                    z2 = f8304e.m7152a(runnable);
                    runnable = null;
                } else {
                    new StringBuilder("Not ready to show an ad yet. mNotReadyCounter = ").append(f8305f);
                    nextInt = f8305f + 1;
                    f8305f = nextInt;
                    if (nextInt > 3) {
                        Log.w("AdManager", "Too many not readies in a row, switching to another ad network.");
                        C1723f.m7467c();
                    }
                }
            }
        }
        if (!(z2 || runnable == null)) {
            runnable.run();
        }
        return z2;
    }

    static void m7465b() {
    }

    static void m7466b(Activity activity) {
        new StringBuilder("onActivityStarted: ").append(activity);
        C1733n.m7506b();
        bw.m7445e();
        new StringBuilder("activity ").append(activity == f8306g ? "matches mActivity" : "does not match mActivity");
        new StringBuilder("mInterstitialInitialized: ").append(f8307h);
        if (!(activity == f8306g && f8307h)) {
            new StringBuilder("Setting mActivity: ").append(activity).append(", was: ").append(f8306g);
            f8306g = activity;
            C1723f.m7476h(activity);
        }
        if (!(activity == f8306g || f8307h)) {
            new StringBuilder("Setting mActivity: ").append(activity).append(", was: ").append(f8306g);
            f8306g = activity;
            C1723f.m7476h(activity);
        }
        if (f8306g == activity && f8304e != null && InterstitialHelperBase.f7913d && InterstitialHelperBase.f7915f == null) {
            IntentFilter intentFilter = new IntentFilter("");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            InterstitialHelperBase.f7915f = new AudioServiceReceiver();
            activity.registerReceiver(InterstitialHelperBase.f7915f, intentFilter);
        }
    }

    static void m7467c() {
        f8305f = 0;
        f8307h = false;
        f8304e = bx.m7455a();
        new StringBuilder("SELECTED: ").append(f8304e != null ? f8304e.getClass().getSimpleName() : "(null)");
    }

    static void m7468c(Activity activity) {
        C1733n.m7508c();
        bw.m7446f();
        if (f8306g == activity && f8304e != null && InterstitialHelperBase.f7915f != null) {
            try {
                activity.unregisterReceiver(InterstitialHelperBase.f7915f);
            } catch (IllegalArgumentException e) {
                new StringBuilder("IllegalArgumentException calling unRegisterReceiver: ").append(e.getMessage());
                e.printStackTrace();
            }
            InterstitialHelperBase.f7915f = null;
        }
    }

    public static void m7469d() {
        if (f8304e != null) {
            new StringBuilder("Calling ").append(f8304e.getClass().getSimpleName()).append(".hideInterstitial()");
        }
    }

    static void m7470d(Activity activity) {
        C1733n.m7505a(activity);
        bw.m7439a(activity);
    }

    static void m7471e(Activity activity) {
        C1733n.m7507b(activity);
        bw.m7441b(activity);
    }

    static boolean m7472e() {
        return true;
    }

    private static C1704x m7473f() {
        C1716d c1716d = f8300a;
        C1704x c1704x = null;
        if (bw.f8258b) {
            int nextInt = new Random().nextInt(100);
            bw.m7444d();
            if (!bw.f8259c && nextInt < bw.f8260d) {
                c1704x = bw.m7448h();
            } else if (bw.f8257a && nextInt < bw.f8261e) {
                c1704x = bw.m7449i();
            }
            if (c1704x != null) {
                c1704x.f8130a = c1716d;
                c1704x.f8131b = false;
                bw.f8262f = 0;
            }
        }
        C1732m c1732m = C1731a.f8317a;
        return c1704x;
    }

    static void m7474f(Activity activity) {
        C1733n.m7509c(activity);
        bw.m7443c(activity);
        if (f8306g == activity) {
            if (f8304e != null) {
                f8304e.mo2412b(activity);
            }
            new StringBuilder("Setting mActivity: null, was: ").append(f8306g);
            f8306g = null;
        }
    }

    private static void m7475g(Activity activity) {
        if (activity != null) {
            int i = (f8300a == null || bw.m7442c() <= 0) ? 0 : 1;
            if (i != 0) {
                FrameLayout frameLayout;
                LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.contentAdLayout);
                if (linearLayout != null) {
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        int round = Math.round(((float) displayMetrics.heightPixels) / displayMetrics.density);
                        Math.round(((float) displayMetrics.widthPixels) / displayMetrics.density);
                        if (round > 720) {
                            LayoutParams layoutParams = linearLayout.getLayoutParams();
                            layoutParams.height = Math.round(90.0f * displayMetrics.density);
                            new StringBuilder("AdManager - 90dp height in pixels is ").append(layoutParams.height);
                            linearLayout.setLayoutParams(layoutParams);
                            frameLayout = (FrameLayout) activity.findViewById(R.id.bannerAdStaticContainer);
                            if (frameLayout != null) {
                                frameLayout.setPadding(0, Math.round(displayMetrics.density * 16.0f), 0, 0);
                            }
                        }
                    }
                }
                frameLayout = (FrameLayout) activity.findViewById(R.id.bannerAdStaticContainer);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                View findViewById = activity.findViewById(R.id.bannerDivider);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                String f = bt.m7433f(activity, R.attr.activity_background_image_url);
                new StringBuilder("activity_background_image_url: '").append(f).append("'");
                i = ((f == null || f.isEmpty()) && bt.m7431d(activity, R.attr.activity_background_image_drawable) == 0) ? 0 : 1;
                if (i != 0) {
                    findViewById = activity.findViewById(R.id.bannerScrim);
                    if (findViewById != null) {
                        findViewById.setBackground(bn.m7398a());
                        findViewById.setVisibility(0);
                    }
                }
            }
        }
    }

    private static void m7476h(Activity activity) {
        boolean z = false;
        f8307h = false;
        if (f8304e == null) {
            Log.w("AdManager", "initializeInterstitial called without any ad network selected, calling selectNextInterstitialNetwork()...");
            C1723f.m7467c();
        }
        if (f8304e != null) {
            if (activity.getSharedPreferences("com.orange.studio.banglatype.interstitial", 0).getLong("interstitialAdExpiration", -1) - System.currentTimeMillis() < 300000) {
                z = true;
            }
            if (z) {
                new StringBuilder("Ready to initialize, calling ").append(f8304e.getClass().getSimpleName()).append(".initializeInterstitial()");
                z = f8304e.mo2411a(activity);
                if (!z) {
                    Log.w("AdManager", "Initialize failed, calling selectNextInterstitialNetwork");
                    C1723f.m7467c();
                    if (f8304e != null) {
                        new StringBuilder("Second time's the charm, calling ").append(f8304e.getClass().getSimpleName()).append(".initializeInterstitial()");
                        z = f8304e.mo2411a(activity);
                    }
                }
                f8307h = z;
            }
        }
    }
}
