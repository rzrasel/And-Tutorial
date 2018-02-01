package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class vu extends vy {
    private final ng f7319a;
    private final nh f7320b;
    private final ne f7321c;
    private boolean f7322d = false;

    public vu(String str, Context context) {
        this.f7319a = ng.m6057a(str, context, false);
        this.f7320b = new nh(this.f7319a);
        this.f7321c = ne.m6052a(context);
    }

    private final C1398a m6862a(C1398a c1398a, C1398a c1398a2, boolean z) {
        try {
            Uri uri = (Uri) C1401c.m3585a(c1398a);
            Context context = (Context) C1401c.m3585a(c1398a2);
            return C1401c.m3584a(z ? this.f7320b.m6061a(uri, context, null, false, null) : this.f7320b.m6060a(uri, context, null));
        } catch (ni e) {
            return null;
        }
    }

    public final C1398a mo2295a(C1398a c1398a, C1398a c1398a2) {
        return m6862a(c1398a, c1398a2, true);
    }

    public final String mo2296a() {
        return "ms";
    }

    public final String mo2297a(C1398a c1398a, String str) {
        return this.f7319a.zza((Context) C1401c.m3585a(c1398a), str, null);
    }

    public final String mo2298a(C1398a c1398a, byte[] bArr) {
        Context context = (Context) C1401c.m3585a(c1398a);
        String a = this.f7319a.m6041a(context, bArr);
        if (this.f7321c == null || !this.f7322d) {
            return a;
        }
        String a2 = ne.m6053a(a, this.f7321c.m6041a(context, bArr));
        this.f7322d = false;
        return a2;
    }

    public final void mo2299a(String str) {
        this.f7320b.f6706c = str.split(",");
    }

    public final void mo2300a(String str, String str2) {
        nh nhVar = this.f7320b;
        nhVar.f6704a = str;
        nhVar.f6705b = str2;
    }

    public final boolean mo2301a(C1398a c1398a) {
        return this.f7320b.m6063a((Uri) C1401c.m3585a(c1398a));
    }

    public final boolean mo2302a(String str, boolean z) {
        if (this.f7321c == null) {
            return false;
        }
        this.f7321c.f6702q = new Info(str, z);
        this.f7322d = true;
        return true;
    }

    public final C1398a mo2303b(C1398a c1398a, C1398a c1398a2) {
        return m6862a(c1398a, c1398a2, false);
    }

    public final boolean mo2304b(C1398a c1398a) {
        return this.f7320b.m6064b((Uri) C1401c.m3585a(c1398a));
    }

    public final String mo2305c(C1398a c1398a) {
        return mo2298a(c1398a, null);
    }

    public final void mo2306d(C1398a c1398a) {
        this.f7320b.m6062a((MotionEvent) C1401c.m3585a(c1398a));
    }
}
