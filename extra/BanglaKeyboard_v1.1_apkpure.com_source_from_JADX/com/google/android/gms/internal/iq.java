package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final class iq implements Executor {
    iq() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
