package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class xs implements xu {
    private /* synthetic */ Activity f7435a;
    private /* synthetic */ Bundle f7436b;

    xs(Activity activity, Bundle bundle) {
        this.f7435a = activity;
        this.f7436b = bundle;
    }

    public final void mo2327a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f7435a, this.f7436b);
    }
}
