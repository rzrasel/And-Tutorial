package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C1516t;
import java.util.concurrent.atomic.AtomicBoolean;

@aqv
public abstract class aow implements gp<Void>, jk {
    protected final Context f5519a;
    protected final jf f5520b;
    protected zzaao f5521c;
    AtomicBoolean f5522d = new AtomicBoolean(true);
    private ape f5523e;
    private ef f5524f;
    private Runnable f5525g;
    private Object f5526h = new Object();

    protected aow(Context context, ef efVar, jf jfVar, ape com_google_android_gms_internal_ape) {
        this.f5519a = context;
        this.f5524f = efVar;
        this.f5521c = this.f5524f.f5979b;
        this.f5520b = jfVar;
        this.f5523e = com_google_android_gms_internal_ape;
    }

    protected abstract void mo2007a();

    protected void mo2008a(int i) {
        if (i != -2) {
            this.f5521c = new zzaao(i, this.f5521c.f7664j);
        }
        this.f5520b.mo2154d();
        ape com_google_android_gms_internal_ape = this.f5523e;
        zzaak com_google_android_gms_internal_zzaak = this.f5524f.f5978a;
        ape com_google_android_gms_internal_ape2 = com_google_android_gms_internal_ape;
        com_google_android_gms_internal_ape2.zzb(new ee(com_google_android_gms_internal_zzaak.f7613c, this.f5520b, this.f5521c.f7657c, i, this.f5521c.f7659e, this.f5521c.f7663i, this.f5521c.f7665k, this.f5521c.f7664j, com_google_android_gms_internal_zzaak.f7619i, this.f5521c.f7661g, null, null, null, null, null, this.f5521c.f7662h, this.f5524f.f5981d, this.f5521c.f7660f, this.f5524f.f5983f, this.f5521c.f7667m, this.f5521c.f7668n, this.f5524f.f5985h, null, this.f5521c.f7637A, this.f5521c.f7638B, this.f5521c.f7639C, this.f5521c.f7640D, this.f5521c.f7641E, null, this.f5521c.f7644H, this.f5521c.f7648L, this.f5524f.f5986i));
    }

    public final void mo1477a(jf jfVar, boolean z) {
        int i = 0;
        id.m5372a(3);
        if (this.f5522d.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo2008a(i);
            gb.f6131a.removeCallbacks(this.f5525g);
        }
    }

    public void mo1473f() {
        if (this.f5522d.getAndSet(false)) {
            this.f5520b.stopLoading();
            zzbv.zzec();
            gf.m5508a(this.f5520b);
            mo2008a(-1);
            gb.f6131a.removeCallbacks(this.f5525g);
        }
    }

    public final /* synthetic */ Object mo1474g() {
        C1516t.m3867b("Webview render task needs to be called on UI thread.");
        this.f5525g = new aox(this);
        gb.f6131a.postDelayed(this.f5525g, ((Long) zzbv.zzen().m4217a(ado.bk)).longValue());
        mo2007a();
        return null;
    }
}
