package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C1528p;
import java.util.concurrent.Callable;

final class adp implements Callable<Void> {
    private /* synthetic */ Context f4915a;

    adp(Context context) {
        this.f4915a = context;
    }

    public final /* synthetic */ Object call() {
        adm zzen = zzbv.zzen();
        Context context = this.f4915a;
        if (!zzen.f4858c) {
            synchronized (zzen.f4856a) {
                if (zzen.f4858c) {
                } else {
                    try {
                        Context b = C1528p.m3915b(context);
                        if (b != null || context == null) {
                            context = b;
                        } else {
                            b = context.getApplicationContext();
                            if (b != null) {
                                context = b;
                            }
                        }
                        if (context == null) {
                        } else {
                            zzbv.zzel();
                            zzen.f4859d = context.getSharedPreferences("google_ads_flags", 0);
                            zzen.f4858c = true;
                            zzen.f4857b.open();
                        }
                    } finally {
                        zzen.f4857b.open();
                    }
                }
            }
        }
        return null;
    }
}
