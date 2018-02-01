package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class xn implements xu {
    private /* synthetic */ Activity f7429a;
    private /* synthetic */ Bundle f7430b;

    xn(Activity activity, Bundle bundle) {
        this.f7429a = activity;
        this.f7430b = bundle;
    }

    public final void mo2327a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f7429a, this.f7430b);
    }
}
