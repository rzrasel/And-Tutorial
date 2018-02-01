package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class xo implements xu {
    private /* synthetic */ Activity f7431a;

    xo(Activity activity) {
        this.f7431a = activity;
    }

    public final void mo2327a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f7431a);
    }
}
