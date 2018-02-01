package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class xq implements xu {
    private /* synthetic */ Activity f7433a;

    xq(Activity activity) {
        this.f7433a = activity;
    }

    public final void mo2327a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f7433a);
    }
}
