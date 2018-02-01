package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.nc;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.zzajk;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@aqv
public final class zzah implements nc, Runnable {
    private final List<Object[]> f4304a;
    private final AtomicReference<nc> f4305b;
    private Context f4306c;
    private zzajk f4307d;
    private CountDownLatch f4308e;

    private zzah(Context context, zzajk com_google_android_gms_internal_zzajk) {
        this.f4304a = new Vector();
        this.f4305b = new AtomicReference();
        this.f4308e = new CountDownLatch(1);
        this.f4306c = context;
        this.f4307d = com_google_android_gms_internal_zzajk;
        aak.m4022a();
        if (hz.m5626b()) {
            fv.m5425a((Runnable) this);
        } else {
            run();
        }
    }

    public zzah(zzbw com_google_android_gms_ads_internal_zzbw) {
        this(com_google_android_gms_ads_internal_zzbw.zzaie, com_google_android_gms_ads_internal_zzbw.zzatj);
    }

    private static Context m3714a(Context context) {
        if (!((Boolean) zzbv.zzen().m4217a(ado.f4894f)).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private final boolean m3715a() {
        try {
            this.f4308e.await();
            return true;
        } catch (Throwable e) {
            id.m5371a("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void m3716b() {
        if (!this.f4304a.isEmpty()) {
            for (Object[] objArr : this.f4304a) {
                if (objArr.length == 1) {
                    ((nc) this.f4305b.get()).zza((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((nc) this.f4305b.get()).zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f4304a.clear();
        }
    }

    public final void run() {
        try {
            boolean z = (((Boolean) zzbv.zzen().m4217a(ado.az)).booleanValue() || (this.f4307d.f7709d ? 1 : null) == null) ? false : true;
            this.f4305b.set(ng.m6057a(this.f4307d.f7706a, m3714a(this.f4306c), z));
        } finally {
            this.f4308e.countDown();
            this.f4306c = null;
            this.f4307d = null;
        }
    }

    public final String zza(Context context) {
        if (m3715a()) {
            nc ncVar = (nc) this.f4305b.get();
            if (ncVar != null) {
                m3716b();
                return ncVar.zza(m3714a(context));
            }
        }
        return "";
    }

    public final String zza(Context context, String str, View view) {
        if (m3715a()) {
            nc ncVar = (nc) this.f4305b.get();
            if (ncVar != null) {
                m3716b();
                return ncVar.zza(m3714a(context), str, view);
            }
        }
        return "";
    }

    public final void zza(int i, int i2, int i3) {
        nc ncVar = (nc) this.f4305b.get();
        if (ncVar != null) {
            m3716b();
            ncVar.zza(i, i2, i3);
            return;
        }
        this.f4304a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void zza(MotionEvent motionEvent) {
        nc ncVar = (nc) this.f4305b.get();
        if (ncVar != null) {
            m3716b();
            ncVar.zza(motionEvent);
            return;
        }
        this.f4304a.add(new Object[]{motionEvent});
    }
}
