package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class xp implements xu {
    private /* synthetic */ Activity f7432a;

    xp(Activity activity) {
        this.f7432a = activity;
    }

    public final void mo2327a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f7432a);
    }
}
