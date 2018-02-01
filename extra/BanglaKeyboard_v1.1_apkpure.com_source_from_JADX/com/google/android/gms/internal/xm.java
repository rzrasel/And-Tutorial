package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class xm implements ActivityLifecycleCallbacks {
    private final Application f7426a;
    private final WeakReference<ActivityLifecycleCallbacks> f7427b;
    private boolean f7428c = false;

    public xm(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f7427b = new WeakReference(activityLifecycleCallbacks);
        this.f7426a = application;
    }

    private final void m6990a(xu xuVar) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f7427b.get();
            if (activityLifecycleCallbacks != null) {
                xuVar.mo2327a(activityLifecycleCallbacks);
            } else if (!this.f7428c) {
                this.f7426a.unregisterActivityLifecycleCallbacks(this);
                this.f7428c = true;
            }
        } catch (Exception e) {
            id.m5372a(6);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m6990a(new xn(activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m6990a(new xt(activity));
    }

    public final void onActivityPaused(Activity activity) {
        m6990a(new xq(activity));
    }

    public final void onActivityResumed(Activity activity) {
        m6990a(new xp(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m6990a(new xs(activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m6990a(new xo(activity));
    }

    public final void onActivityStopped(Activity activity) {
        m6990a(new xr(activity));
    }
}
