package com.orange.studio.banglatype;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.orange.studio.banglatype.C1740s.C1739a;

public abstract class InterstitialHelperBase {
    static AudioItem f7912c;
    static boolean f7913d;
    static Context f7914e;
    static AudioServiceReceiver f7915f;
    private Runnable f7916a;
    boolean f7917b = true;

    public static class AudioServiceReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("".equals(intent.getAction())) {
                    switch (C1739a.valueOf(intent.getStringExtra(""))) {
                        case Paused:
                            if (InterstitialHelperBase.f7913d) {
                                InterstitialHelperBase.f7912c = (AudioItem) intent.getParcelableExtra("");
                                InterstitialHelperBase.f7913d = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    private void m7149f() {
        if (this.f7916a != null) {
            this.f7916a.run();
            this.f7916a = null;
        }
    }

    protected abstract int mo2410a();

    protected abstract boolean mo2411a(Activity activity);

    public final boolean m7152a(Runnable runnable) {
        this.f7916a = runnable;
        if (mo2410a() == bm.f8223a) {
            m7149f();
            C1723f.m7467c();
        }
        boolean c = mo2414c();
        if (!c || mo2410a() == bm.f8224b) {
            m7149f();
            C1723f.m7467c();
        }
        return c;
    }

    protected void mo2412b(Activity activity) {
    }

    protected abstract boolean mo2413b();

    protected abstract boolean mo2414c();

    protected final void m7156d() {
        if (mo2410a() == bm.f8225c || mo2410a() == bm.f8226d) {
            m7149f();
        }
        C1723f.m7467c();
    }

    protected final void m7157e() {
        if (mo2410a() == bm.f8226d) {
            m7149f();
        }
        C1723f.m7467c();
    }
}
