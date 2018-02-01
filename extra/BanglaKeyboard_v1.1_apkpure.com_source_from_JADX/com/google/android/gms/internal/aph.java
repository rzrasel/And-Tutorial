package com.google.android.gms.internal;

final class aph implements Runnable {
    private /* synthetic */ ee f5546a;
    private /* synthetic */ apg f5547b;

    aph(apg com_google_android_gms_internal_apg, ee eeVar) {
        this.f5547b = com_google_android_gms_internal_apg;
        this.f5546a = eeVar;
    }

    public final void run() {
        this.f5547b.f5543a.zzb(this.f5546a);
    }
}
