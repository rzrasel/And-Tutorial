package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aqv
public final class apl extends eq {
    final ape f5560a;
    private final zzaao f5561b;
    private final ef f5562c;
    private final apt f5563d;
    private final Object f5564f;
    private Future<ee> f5565g;

    public apl(Context context, zzbc com_google_android_gms_ads_internal_zzbc, ef efVar, nh nhVar, ape com_google_android_gms_internal_ape, aec com_google_android_gms_internal_aec) {
        this(efVar, com_google_android_gms_internal_ape, new apt(context, com_google_android_gms_ads_internal_zzbc, new he(context), nhVar, efVar, com_google_android_gms_internal_aec));
    }

    private apl(ef efVar, ape com_google_android_gms_internal_ape, apt com_google_android_gms_internal_apt) {
        this.f5564f = new Object();
        this.f5562c = efVar;
        this.f5561b = efVar.f5979b;
        this.f5560a = com_google_android_gms_internal_ape;
        this.f5563d = com_google_android_gms_internal_apt;
    }

    public final void mo1475a() {
        ee eeVar;
        int i = -2;
        try {
            synchronized (this.f5564f) {
                this.f5565g = fv.m5426a(fv.f6119a, this.f5563d);
            }
            eeVar = (ee) this.f5565g.get(60000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            id.m5370a("Timed out waiting for native ad.");
            i = 2;
            this.f5565g.cancel(true);
            eeVar = null;
        } catch (ExecutionException e2) {
            i = 0;
            eeVar = null;
        } catch (InterruptedException e3) {
            i = 0;
            eeVar = null;
        } catch (CancellationException e4) {
            i = 0;
            eeVar = null;
        }
        if (eeVar == null) {
            eeVar = new ee(this.f5562c.f5978a.f7613c, null, null, i, null, null, this.f5561b.f7665k, this.f5561b.f7664j, this.f5562c.f5978a.f7619i, false, null, null, null, null, null, this.f5561b.f7662h, this.f5562c.f5981d, this.f5561b.f7660f, this.f5562c.f5983f, this.f5561b.f7667m, this.f5561b.f7668n, this.f5562c.f5985h, null, null, null, null, this.f5562c.f5979b.f7640D, this.f5562c.f5979b.f7641E, null, null, this.f5561b.f7648L, this.f5562c.f5986i);
        }
        gb.f6131a.post(new apm(this, eeVar));
    }

    public final void mo1476b() {
        synchronized (this.f5564f) {
            if (this.f5565g != null) {
                this.f5565g.cancel(true);
            }
        }
    }
}
