package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class ac extends C1502n {
    private C1518v f4544a;
    private final int f4545b;

    public ac(C1518v c1518v, int i) {
        this.f4544a = c1518v;
        this.f4545b = i;
    }

    public final void mo1654a() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void mo1655a(int i, IBinder iBinder, Bundle bundle) {
        C1516t.m3861a(this.f4544a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.f4544a.m3893a(i, iBinder, bundle, this.f4545b);
        this.f4544a = null;
    }
}
