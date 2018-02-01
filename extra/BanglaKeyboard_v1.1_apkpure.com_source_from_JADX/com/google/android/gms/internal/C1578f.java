package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

@aqv
public abstract class C1578f implements C1574d, gp<Void> {
    private final it<zzaak> f6078a;
    private final C1574d f6079b;
    private final Object f6080c = new Object();

    public C1578f(it<zzaak> itVar, C1574d c1574d) {
        this.f6078a = itVar;
        this.f6079b = c1574d;
    }

    public final void mo2019a(zzaao com_google_android_gms_internal_zzaao) {
        synchronized (this.f6080c) {
            this.f6079b.mo2019a(com_google_android_gms_internal_zzaao);
            mo2123d();
        }
    }

    final boolean m5400a(C1572q c1572q, zzaak com_google_android_gms_internal_zzaak) {
        try {
            c1572q.mo2003a(com_google_android_gms_internal_zzaak, new C1589n(this));
            return true;
        } catch (Throwable th) {
            id.m5371a("Could not fetch ad response from ad request service due to an Exception.", th);
            zzbv.zzee().m5336a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f6079b.mo2019a(new zzaao(0));
            return false;
        }
    }

    public abstract void mo2123d();

    public abstract C1572q mo2124e();

    public final void mo1473f() {
        mo2123d();
    }

    public final /* synthetic */ Object mo1474g() {
        C1572q e = mo2124e();
        if (e == null) {
            this.f6079b.mo2019a(new zzaao(0));
            mo2123d();
        } else {
            this.f6078a.zza(new C1579g(this, e), new C1580h(this));
        }
        return null;
    }
}
