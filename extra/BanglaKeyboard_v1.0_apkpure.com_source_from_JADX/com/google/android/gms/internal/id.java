package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class id extends ir {
    private hy f1713a;

    public id(hy hyVar) {
        this.f1713a = hyVar;
    }

    public final void mo901a(int i, IBinder iBinder, Bundle bundle) {
        je.m2474a((Object) "onPostInitComplete can be called only once per call to getServiceFromBroker", this.f1713a);
        this.f1713a.m1919a(i, iBinder, bundle);
        this.f1713a = null;
    }
}
