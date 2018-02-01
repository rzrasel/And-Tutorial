package com.google.android.gms.internal;

final class apm implements Runnable {
    private /* synthetic */ ee f5566a;
    private /* synthetic */ apl f5567b;

    apm(apl com_google_android_gms_internal_apl, ee eeVar) {
        this.f5567b = com_google_android_gms_internal_apl;
        this.f5566a = eeVar;
    }

    public final void run() {
        this.f5567b.f5560a.zzb(this.f5566a);
    }
}
