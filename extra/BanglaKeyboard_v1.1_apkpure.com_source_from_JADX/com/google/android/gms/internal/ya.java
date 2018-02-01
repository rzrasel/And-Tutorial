package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
public final class ya implements ActivityLifecycleCallbacks {
    Activity f7466a;
    public Context f7467b;
    final Object f7468c = new Object();
    final List<yc> f7469d = new ArrayList();
    public boolean f7470e = false;
    public long f7471f;
    private boolean f7472g = true;
    private boolean f7473h = false;
    private final List<yp> f7474i = new ArrayList();
    private Runnable f7475j;

    public final void m7026a(Activity activity) {
        synchronized (this.f7468c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f7466a = activity;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f7468c) {
            if (this.f7466a == null) {
                return;
            }
            if (this.f7466a.equals(activity)) {
                this.f7466a = null;
            }
            Iterator it = this.f7474i.iterator();
            while (it.hasNext()) {
                try {
                    if (((yp) it.next()).m7039a()) {
                        it.remove();
                    }
                } catch (Throwable e) {
                    zzbv.zzee().m5336a(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    id.m5372a(6);
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m7026a(activity);
        synchronized (this.f7468c) {
            Iterator it = this.f7474i.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.f7473h = true;
        if (this.f7475j != null) {
            gb.f6131a.removeCallbacks(this.f7475j);
        }
        Handler handler = gb.f6131a;
        Runnable ybVar = new yb(this);
        this.f7475j = ybVar;
        handler.postDelayed(ybVar, this.f7471f);
    }

    public final void onActivityResumed(Activity activity) {
        boolean z = false;
        m7026a(activity);
        this.f7473h = false;
        if (!this.f7472g) {
            z = true;
        }
        this.f7472g = true;
        if (this.f7475j != null) {
            gb.f6131a.removeCallbacks(this.f7475j);
        }
        synchronized (this.f7468c) {
            Iterator it = this.f7474i.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (z) {
                for (yc d : this.f7469d) {
                    try {
                        d.mo2090d(true);
                    } catch (Exception e) {
                        id.m5372a(6);
                    }
                }
            } else {
                id.m5372a(3);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m7026a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
