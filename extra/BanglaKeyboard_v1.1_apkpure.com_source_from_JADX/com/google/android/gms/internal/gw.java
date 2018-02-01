package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

final class gw implements Runnable {
    private /* synthetic */ gq f6172a;

    gw(gq gqVar) {
        this.f6172a = gqVar;
    }

    public final void run() {
        gx zzej = zzbv.zzej();
        Context context = this.f6172a.f6148a;
        String str = this.f6172a.f6150c;
        String str2 = this.f6172a.f6151d;
        if (zzej.m5575b(context, str, str2)) {
            id.m5372a(3);
            gx.m5569a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzej.m5576c(context, str, str2);
    }
}
