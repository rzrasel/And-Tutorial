package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C1516t;

@aqv
public final class ho {
    Handler f6213a = null;
    private HandlerThread f6214b = null;
    private int f6215c = 0;
    private final Object f6216d = new Object();

    public final Looper m5596a() {
        Looper looper;
        synchronized (this.f6216d) {
            if (this.f6215c != 0) {
                C1516t.m3861a(this.f6214b, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f6214b == null) {
                es.m5373a();
                this.f6214b = new HandlerThread("LooperProvider");
                this.f6214b.start();
                this.f6213a = new Handler(this.f6214b.getLooper());
                es.m5373a();
            } else {
                es.m5373a();
                this.f6216d.notifyAll();
            }
            this.f6215c++;
            looper = this.f6214b.getLooper();
        }
        return looper;
    }
}
