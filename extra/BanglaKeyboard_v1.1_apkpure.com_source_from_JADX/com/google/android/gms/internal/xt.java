package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class xt implements xu {
    private /* synthetic */ Activity f7437a;

    xt(Activity activity) {
        this.f7437a = activity;
    }

    public final void mo2327a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f7437a);
    }
}
