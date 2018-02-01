package com.google.android.gms.internal;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;

public final class rd extends rs {
    public rd(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 24);
    }

    private final void m6491c() {
        AdvertisingIdClient c = this.a.m6089c();
        if (c != null) {
            try {
                Info info = c.getInfo();
                String a = pd.m6373a(info.getId());
                if (a != null) {
                    synchronized (this.b) {
                        this.b.f6442M = a;
                        this.b.f6444O = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.b.f6443N = Integer.valueOf(5);
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    protected final void mo2232a() {
        if (this.a.m6088b()) {
            m6491c();
            return;
        }
        synchronized (this.b) {
            this.b.f6442M = (String) this.c.invoke(null, new Object[]{this.a.f6728b});
        }
    }

    public final Void mo2233b() {
        if (this.a.f6738l) {
            return super.mo2233b();
        }
        if (this.a.m6088b()) {
            m6491c();
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return mo2233b();
    }
}
