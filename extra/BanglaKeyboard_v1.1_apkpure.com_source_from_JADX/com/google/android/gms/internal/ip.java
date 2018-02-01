package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class ip implements Executor {
    private final Handler f6264a = new Handler(Looper.getMainLooper());

    ip() {
    }

    public final void execute(Runnable runnable) {
        this.f6264a.post(runnable);
    }
}
