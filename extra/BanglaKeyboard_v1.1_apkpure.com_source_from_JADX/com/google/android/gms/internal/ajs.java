package com.google.android.gms.internal;

import android.os.Handler;
import java.util.LinkedList;
import java.util.List;

@aqv
final class ajs {
    final List<akr> f5215a = new LinkedList();

    ajs() {
    }

    final void m4604a(aks com_google_android_gms_internal_aks) {
        Handler handler = gb.f6131a;
        for (akr com_google_android_gms_internal_akq : this.f5215a) {
            handler.post(new akq(com_google_android_gms_internal_akq, com_google_android_gms_internal_aks));
        }
        this.f5215a.clear();
    }
}
