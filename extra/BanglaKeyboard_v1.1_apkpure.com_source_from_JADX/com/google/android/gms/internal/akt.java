package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Random;

final class akt extends aar {
    private final aaq f5238a;

    akt(aaq com_google_android_gms_internal_aaq) {
        this.f5238a = com_google_android_gms_internal_aaq;
    }

    public final void mo1688a() {
        if (ald.m4676a()) {
            int intValue = ((Integer) zzbv.zzen().m4217a(ado.aM)).intValue();
            int intValue2 = ((Integer) zzbv.zzen().m4217a(ado.aN)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                zzbv.zzep().m4666a();
            } else {
                gb.f6131a.postDelayed(aku.f5239a, (long) (new Random().nextInt(intValue2 + 1) + intValue));
            }
        }
        this.f5238a.mo1688a();
    }

    public final void mo1689a(int i) {
        this.f5238a.mo1689a(i);
    }

    public final void mo1690b() {
        this.f5238a.mo1690b();
    }

    public final void mo1691c() {
        this.f5238a.mo1691c();
    }

    public final void mo1692d() {
        this.f5238a.mo1692d();
    }

    public final void mo1693e() {
        this.f5238a.mo1693e();
    }

    public final void mo1694f() {
        this.f5238a.mo1694f();
    }
}
