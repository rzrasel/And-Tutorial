package com.google.android.gms.internal;

final class apb implements Runnable {
    private /* synthetic */ ee f5540a;
    private /* synthetic */ aoy f5541b;

    apb(aoy com_google_android_gms_internal_aoy, ee eeVar) {
        this.f5541b = com_google_android_gms_internal_aoy;
        this.f5540a = eeVar;
    }

    public final void run() {
        synchronized (this.f5541b.f5530c) {
            aoy com_google_android_gms_internal_aoy = this.f5541b;
            com_google_android_gms_internal_aoy.f5528a.zzb(this.f5540a);
        }
    }
}
