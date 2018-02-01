package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public final class wm implements xv {
    private WeakReference<afa> f7361a;

    public wm(afa com_google_android_gms_internal_afa) {
        this.f7361a = new WeakReference(com_google_android_gms_internal_afa);
    }

    public final View mo2318a() {
        afa com_google_android_gms_internal_afa = (afa) this.f7361a.get();
        return com_google_android_gms_internal_afa != null ? com_google_android_gms_internal_afa.mo1813f() : null;
    }

    public final boolean mo2319b() {
        return this.f7361a.get() == null;
    }

    public final xv mo2320c() {
        return new wo((afa) this.f7361a.get());
    }
}
