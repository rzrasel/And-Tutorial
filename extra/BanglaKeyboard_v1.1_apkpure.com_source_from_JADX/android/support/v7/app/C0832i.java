package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C0811f.C0827b;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.view.C0941f.C0940a;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

class C0832i extends C0831h {
    boolean f2515p = true;
    private int f2516x = -100;
    private boolean f2517y;
    private C0836b f2518z;

    class C0828a extends C0827b {
        final /* synthetic */ C0832i f2512c;

        C0828a(C0832i c0832i, Callback callback) {
            this.f2512c = c0832i;
            super(c0832i, callback);
        }

        final ActionMode m2404a(ActionMode.Callback callback) {
            Object c0940a = new C0940a(this.f2512c.b, callback);
            C0852b a = this.f2512c.mo760a((C0806a) c0940a);
            return a != null ? c0940a.m2743b(a) : null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f2512c.f2515p ? m2404a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    final class C0836b {
        C0848p f2521a;
        boolean f2522b;
        BroadcastReceiver f2523c;
        IntentFilter f2524d;
        final /* synthetic */ C0832i f2525e;

        class C08351 extends BroadcastReceiver {
            final /* synthetic */ C0836b f2520a;

            C08351(C0836b c0836b) {
                this.f2520a = c0836b;
            }

            public final void onReceive(Context context, Intent intent) {
                C0836b c0836b = this.f2520a;
                boolean a = c0836b.f2521a.m2455a();
                if (a != c0836b.f2522b) {
                    c0836b.f2522b = a;
                    c0836b.f2525e.mo759k();
                }
            }
        }

        C0836b(C0832i c0832i, C0848p c0848p) {
            this.f2525e = c0832i;
            this.f2521a = c0848p;
            this.f2522b = c0848p.m2455a();
        }

        final void m2419a() {
            if (this.f2523c != null) {
                this.f2525e.b.unregisterReceiver(this.f2523c);
                this.f2523c = null;
            }
        }
    }

    C0832i(Context context, Window window, C0233d c0233d) {
        super(context, window, c0233d);
    }

    private void m2406s() {
        if (this.f2518z == null) {
            Context context = this.b;
            if (C0848p.f2567a == null) {
                Context applicationContext = context.getApplicationContext();
                C0848p.f2567a = new C0848p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2518z = new C0836b(this, C0848p.f2567a);
        }
    }

    private boolean m2407t() {
        if (!this.f2517y || !(this.b instanceof Activity)) {
            return false;
        }
        try {
            return (this.b.getPackageManager().getActivityInfo(new ComponentName(this.b, this.b.getClass()), 0).configChanges & 512) == 0;
        } catch (NameNotFoundException e) {
            return true;
        }
    }

    Callback mo798a(Callback callback) {
        return new C0828a(this, callback);
    }

    public final void mo763a(Bundle bundle) {
        super.mo763a(bundle);
        if (bundle != null && this.f2516x == -100) {
            this.f2516x = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public final void mo754b(Bundle bundle) {
        super.mo754b(bundle);
        if (this.f2516x != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f2516x);
        }
    }

    public final void mo755d() {
        super.mo755d();
        mo759k();
    }

    public final void mo756e() {
        super.mo756e();
        if (this.f2518z != null) {
            this.f2518z.m2419a();
        }
    }

    int mo799f(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                m2406s();
                C0836b c0836b = this.f2518z;
                c0836b.f2522b = c0836b.f2521a.m2455a();
                return c0836b.f2522b ? 2 : 1;
            default:
                return i;
        }
    }

    public final void mo757h() {
        super.mo757h();
        if (this.f2518z != null) {
            this.f2518z.m2419a();
        }
    }

    public final boolean mo759k() {
        boolean z;
        int i = this.f2516x != -100 ? this.f2516x : C0810e.f2436a;
        int f = mo799f(i);
        if (f != -1) {
            Resources resources = this.b.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            f = f == 2 ? 32 : 16;
            if (i2 != f) {
                if (m2407t()) {
                    ((Activity) this.b).recreate();
                } else {
                    Configuration configuration2 = new Configuration(configuration);
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    configuration2.uiMode = f | (configuration2.uiMode & -49);
                    resources.updateConfiguration(configuration2, displayMetrics);
                    if (VERSION.SDK_INT < 26) {
                        if (VERSION.SDK_INT >= 24) {
                            C0839m.m2427c(resources);
                        } else if (VERSION.SDK_INT >= 23) {
                            C0839m.m2426b(resources);
                        } else if (VERSION.SDK_INT >= 21) {
                            C0839m.m2424a(resources);
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (i == 0) {
            m2406s();
            C0836b c0836b = this.f2518z;
            c0836b.m2419a();
            if (c0836b.f2523c == null) {
                c0836b.f2523c = new C08351(c0836b);
            }
            if (c0836b.f2524d == null) {
                c0836b.f2524d = new IntentFilter();
                c0836b.f2524d.addAction("android.intent.action.TIME_SET");
                c0836b.f2524d.addAction("android.intent.action.TIMEZONE_CHANGED");
                c0836b.f2524d.addAction("android.intent.action.TIME_TICK");
            }
            c0836b.f2525e.b.registerReceiver(c0836b.f2523c, c0836b.f2524d);
        }
        this.f2517y = true;
        return z;
    }
}
