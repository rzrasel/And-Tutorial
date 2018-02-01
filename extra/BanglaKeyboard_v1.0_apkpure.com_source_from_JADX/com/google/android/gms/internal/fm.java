package com.google.android.gms.internal;

import android.os.Process;

final class fm implements Runnable {
    final /* synthetic */ Runnable f1405a;

    fm(Runnable runnable) {
        this.f1405a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f1405a.run();
    }
}
