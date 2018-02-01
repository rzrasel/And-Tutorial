package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final class C1468w implements Runnable {
    private /* synthetic */ Drawable f4146a;
    private /* synthetic */ C1467v f4147b;

    C1468w(C1467v c1467v, Drawable drawable) {
        this.f4147b = c1467v;
        this.f4146a = drawable;
    }

    public final void run() {
        this.f4147b.f4145a.f4246c.getWindow().setBackgroundDrawable(this.f4146a);
    }
}
