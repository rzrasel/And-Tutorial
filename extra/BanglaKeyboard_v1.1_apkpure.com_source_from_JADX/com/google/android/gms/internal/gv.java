package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

final class gv implements Runnable {
    private /* synthetic */ gq f6171a;

    gv(gq gqVar) {
        this.f6171a = gqVar;
    }

    public final void run() {
        gx zzej = zzbv.zzej();
        Context context = this.f6171a.f6148a;
        String str = this.f6171a.f6150c;
        String str2 = this.f6171a.f6151d;
        if (!zzej.m5573a(context, str, str2)) {
            gx.m5569a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzej.f6173a)) {
            id.m5372a(3);
            gx.m5569a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzej.f6173a)) {
            id.m5372a(3);
            zzej.m5576c(context, str, str2);
        } else if ("0".equals(zzej.f6173a)) {
            id.m5372a(3);
            gx.m5569a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }
}
