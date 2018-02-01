package com.google.android.gms.internal;

import android.content.Context;

final class ara implements Runnable {
    private /* synthetic */ it f5684a;
    private /* synthetic */ aqy f5685b;

    ara(aqy com_google_android_gms_internal_aqy, it itVar) {
        this.f5685b = com_google_android_gms_internal_aqy;
        this.f5684a = itVar;
    }

    public final void run() {
        synchronized (this.f5685b.f5673b) {
            gp c1581i;
            aqy com_google_android_gms_internal_aqy = this.f5685b;
            C1574d c1574d = this.f5685b;
            zzajk com_google_android_gms_internal_zzajk = this.f5685b.f5672a.f6511j;
            it itVar = this.f5684a;
            Context context = c1574d.f5674c;
            if (new C1576c(context).mo2032a(com_google_android_gms_internal_zzajk)) {
                id.m5372a(3);
                c1581i = new C1581i(context, itVar, c1574d);
                c1581i.mo1474g();
            } else {
                id.m5372a(3);
                aak.m4022a();
                if (hz.m5627c(context)) {
                    c1581i = new C1583j(context, com_google_android_gms_internal_zzajk, itVar, c1574d);
                } else {
                    id.m5370a("Failed to connect to remote ad request service.");
                    c1581i = null;
                }
            }
            com_google_android_gms_internal_aqy.f5676f = c1581i;
            if (this.f5685b.f5676f == null) {
                this.f5685b.m5097a(0, "Could not start the ad request service.");
                gb.f6131a.removeCallbacks(this.f5685b.f5675d);
            }
        }
    }
}
