package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

@aqv
public final class C1589n extends C1588u {
    private final WeakReference<C1574d> f6666a;

    public C1589n(C1574d c1574d) {
        this.f6666a = new WeakReference(c1574d);
    }

    public final void mo2203a(zzaao com_google_android_gms_internal_zzaao) {
        C1574d c1574d = (C1574d) this.f6666a.get();
        if (c1574d != null) {
            c1574d.mo2019a(com_google_android_gms_internal_zzaao);
        }
    }
}
