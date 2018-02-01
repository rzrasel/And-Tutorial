package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

final class cu implements Runnable {
    final /* synthetic */ cs f1152a;
    final /* synthetic */ ct f1153b;
    private final WeakReference f1154c = new WeakReference(this.f1152a);

    cu(ct ctVar, cs csVar) {
        this.f1153b = ctVar;
        this.f1152a = csVar;
    }

    public final void run() {
        cs csVar = (cs) this.f1154c.get();
        if (!this.f1153b.f1151b && csVar != null) {
            csVar.m1838e();
            this.f1153b.m1839a();
        }
    }
}
