package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C1519x;
import com.google.android.gms.common.internal.C1520y;

@aqv
public final class C1583j extends C1578f implements C1519x, C1520y {
    private Context f6268a;
    private zzajk f6269b;
    private it<zzaak> f6270c;
    private final C1574d f6271d;
    private final Object f6272e = new Object();
    private C1584k f6273f;

    public C1583j(Context context, zzajk com_google_android_gms_internal_zzajk, it<zzaak> itVar, C1574d c1574d) {
        super(itVar, c1574d);
        this.f6268a = context;
        this.f6269b = com_google_android_gms_internal_zzajk;
        this.f6270c = itVar;
        this.f6271d = c1574d;
        this.f6273f = new C1584k(context, ((Boolean) zzbv.zzen().m4217a(ado.f4863B)).booleanValue() ? zzbv.zzer().m5596a() : context.getMainLooper(), this, this, this.f6269b.f7708c);
        this.f6273f.m3897c();
    }

    public final void mo2126a() {
        mo1474g();
    }

    public final void mo2127b() {
        id.m5372a(3);
    }

    public final void mo2128c() {
        id.m5372a(3);
        new C1581i(this.f6268a, this.f6270c, this.f6271d).mo1474g();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        zzbv.zzea();
        gb.m5473b(this.f6268a, this.f6269b.f7706a, "gmob-apps", bundle, true);
    }

    public final void mo2123d() {
        synchronized (this.f6272e) {
            if (this.f6273f.m3898d() || this.f6273f.m3899e()) {
                this.f6273f.m3900f();
            }
            Binder.flushPendingCommands();
        }
    }

    public final C1572q mo2124e() {
        C1572q j;
        synchronized (this.f6272e) {
            try {
                j = this.f6273f.mo2192j();
            } catch (IllegalStateException e) {
                j = null;
                return j;
            } catch (DeadObjectException e2) {
                j = null;
                return j;
            }
        }
        return j;
    }
}
