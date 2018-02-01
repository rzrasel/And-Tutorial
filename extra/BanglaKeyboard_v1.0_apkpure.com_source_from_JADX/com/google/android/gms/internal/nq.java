package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

final class nq implements ComponentCallbacks {
    final /* synthetic */ np f1989a;

    nq(np npVar) {
        this.f1989a = npVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (this.f1989a.f1984b != null && this.f1989a.f1984b.f1999i != null && this.f1989a.f1984b.f1999i.f1339b != null) {
            this.f1989a.f1984b.f1999i.f1339b.m2086a();
        }
    }

    public final void onLowMemory() {
    }
}
