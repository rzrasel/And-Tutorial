package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class zzbn {
    private final Handler f4374a;

    public zzbn(Handler handler) {
        this.f4374a = handler;
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.f4374a.postDelayed(runnable, j);
    }

    public final void removeCallbacks(Runnable runnable) {
        this.f4374a.removeCallbacks(runnable);
    }
}
