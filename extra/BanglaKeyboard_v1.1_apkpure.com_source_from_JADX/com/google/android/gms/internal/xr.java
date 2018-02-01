package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class xr implements xu {
    private /* synthetic */ Activity f7434a;

    xr(Activity activity) {
        this.f7434a = activity;
    }

    public final void mo2327a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f7434a);
    }
}
