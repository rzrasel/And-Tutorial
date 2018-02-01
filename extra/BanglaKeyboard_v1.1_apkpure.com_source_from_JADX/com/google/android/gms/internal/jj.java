package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzm;

final class jj implements Runnable {
    private /* synthetic */ jg f6317a;

    jj(jg jgVar) {
        this.f6317a = jgVar;
    }

    public final void run() {
        this.f6317a.f6287a.mo2131A();
        zzm h = this.f6317a.f6287a.mo2160h();
        if (h != null) {
            h.zzmo();
        }
        if (this.f6317a.f6291e != null) {
            this.f6317a.f6291e.mo1468a();
            this.f6317a.f6291e = null;
        }
    }
}
