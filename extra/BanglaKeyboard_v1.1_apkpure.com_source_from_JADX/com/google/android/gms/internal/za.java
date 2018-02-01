package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

final class za implements Executor {
    private /* synthetic */ Handler f7542a;

    za(Handler handler) {
        this.f7542a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f7542a.post(runnable);
    }
}
