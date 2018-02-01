package com.google.android.gms.internal;

import android.content.Context;

public final class acj implements Runnable {
    private /* synthetic */ Context f4836a;
    private /* synthetic */ aci f4837b;

    public acj(aci com_google_android_gms_internal_aci, Context context) {
        this.f4837b = com_google_android_gms_internal_aci;
        this.f4836a = context;
    }

    public final void run() {
        this.f4837b.m4136a(this.f4836a);
    }
}
