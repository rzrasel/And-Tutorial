package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class xz implements anc {
    private final Executor f7460a;

    public xz(Handler handler) {
        this.f7460a = new za(handler);
    }

    public final void mo2328a(afv<?> com_google_android_gms_internal_afv_, ajz<?> com_google_android_gms_internal_ajz_) {
        mo2329a(com_google_android_gms_internal_afv_, com_google_android_gms_internal_ajz_, null);
    }

    public final void mo2329a(afv<?> com_google_android_gms_internal_afv_, ajz<?> com_google_android_gms_internal_ajz_, Runnable runnable) {
        com_google_android_gms_internal_afv_.f5075h = true;
        com_google_android_gms_internal_afv_.m4467a("post-response");
        this.f7460a.execute(new zx(com_google_android_gms_internal_afv_, com_google_android_gms_internal_ajz_, runnable));
    }

    public final void mo2330a(afv<?> com_google_android_gms_internal_afv_, C1569b c1569b) {
        com_google_android_gms_internal_afv_.m4467a("post-error");
        this.f7460a.execute(new zx(com_google_android_gms_internal_afv_, new ajz(c1569b), null));
    }
}
