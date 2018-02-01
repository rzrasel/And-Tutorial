package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.lang.ref.WeakReference;
import java.util.Map;

@aqv
public final class aez extends afe {
    private amo f5029e;
    private amr f5030f;
    private final afb f5031g;
    private afa f5032h;
    private boolean f5033i;
    private Object f5034j;

    private aez(Context context, afb com_google_android_gms_internal_afb, nh nhVar, afc com_google_android_gms_internal_afc) {
        super(context, com_google_android_gms_internal_afb, null, nhVar, null, com_google_android_gms_internal_afc, null, null);
        this.f5033i = false;
        this.f5034j = new Object();
        this.f5031g = com_google_android_gms_internal_afb;
    }

    public aez(Context context, afb com_google_android_gms_internal_afb, nh nhVar, amo com_google_android_gms_internal_amo, afc com_google_android_gms_internal_afc) {
        this(context, com_google_android_gms_internal_afb, nhVar, com_google_android_gms_internal_afc);
        this.f5029e = com_google_android_gms_internal_amo;
    }

    public aez(Context context, afb com_google_android_gms_internal_afb, nh nhVar, amr com_google_android_gms_internal_amr, afc com_google_android_gms_internal_afc) {
        this(context, com_google_android_gms_internal_afb, nhVar, com_google_android_gms_internal_afc);
        this.f5030f = com_google_android_gms_internal_amr;
    }

    public final View mo1799a(OnClickListener onClickListener, boolean z) {
        synchronized (this.f5034j) {
            if (this.f5032h != null) {
                View a = this.f5032h.mo1799a(onClickListener, z);
                return a;
            }
            C1398a n;
            try {
                if (this.f5029e != null) {
                    n = this.f5029e.mo1937n();
                } else {
                    if (this.f5030f != null) {
                        n = this.f5030f.mo1953k();
                    }
                    n = null;
                }
            } catch (Throwable e) {
                id.m5371a("Failed to call getAdChoicesContent", e);
            }
            if (n != null) {
                a = (View) C1401c.m3585a(n);
                return a;
            }
            return null;
        }
    }

    public final void mo1804a(View view, Map<String, WeakReference<View>> map) {
        C1516t.m3867b("recordImpression must be called on the main UI thread.");
        synchronized (this.f5034j) {
            this.f5020d = true;
            if (this.f5032h != null) {
                this.f5032h.mo1804a(view, (Map) map);
                this.f5031g.recordImpression();
            } else {
                try {
                    if (this.f5029e != null && !this.f5029e.mo1933j()) {
                        this.f5029e.mo1932i();
                        this.f5031g.recordImpression();
                    } else if (!(this.f5030f == null || this.f5030f.mo1950h())) {
                        this.f5030f.mo1949g();
                        this.f5031g.recordImpression();
                    }
                } catch (Throwable e) {
                    id.m5371a("Failed to call recordImpression", e);
                }
            }
        }
    }

    public final void mo1805a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C1516t.m3867b("performClick must be called on the main UI thread.");
        synchronized (this.f5034j) {
            if (this.f5032h != null) {
                this.f5032h.mo1805a(view, map, bundle, view2);
                this.f5031g.onAdClicked();
            } else {
                try {
                    if (!(this.f5029e == null || this.f5029e.mo1934k())) {
                        this.f5029e.mo1922a(C1401c.m3584a((Object) view));
                        this.f5031g.onAdClicked();
                    }
                    if (!(this.f5030f == null || this.f5030f.mo1951i())) {
                        this.f5030f.mo1941a(C1401c.m3584a((Object) view));
                        this.f5031g.onAdClicked();
                    }
                } catch (Throwable e) {
                    id.m5371a("Failed to call performClick", e);
                }
            }
        }
    }

    public final void mo1816a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f5034j) {
            this.f5033i = true;
            try {
                if (this.f5029e != null) {
                    this.f5029e.mo1924b(C1401c.m3584a((Object) view));
                } else if (this.f5030f != null) {
                    this.f5030f.mo1943b(C1401c.m3584a((Object) view));
                }
            } catch (Throwable e) {
                id.m5371a("Failed to call prepareAd", e);
            }
            this.f5033i = false;
        }
    }

    public final void m4433a(afa com_google_android_gms_internal_afa) {
        synchronized (this.f5034j) {
            this.f5032h = com_google_android_gms_internal_afa;
        }
    }

    public final boolean mo1806a() {
        boolean a;
        synchronized (this.f5034j) {
            if (this.f5032h != null) {
                a = this.f5032h.mo1806a();
            } else {
                a = this.f5031g.zzco();
            }
        }
        return a;
    }

    public final void mo1809b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f5034j) {
            try {
                if (this.f5029e != null) {
                    this.f5029e.mo1926c(C1401c.m3584a((Object) view));
                } else if (this.f5030f != null) {
                    this.f5030f.mo1945c(C1401c.m3584a((Object) view));
                }
            } catch (Throwable e) {
                id.m5371a("Failed to call untrackView", e);
            }
        }
    }

    public final boolean m4436b() {
        boolean z;
        synchronized (this.f5034j) {
            z = this.f5033i;
        }
        return z;
    }

    public final afa m4437c() {
        afa com_google_android_gms_internal_afa;
        synchronized (this.f5034j) {
            com_google_android_gms_internal_afa = this.f5032h;
        }
        return com_google_android_gms_internal_afa;
    }

    public final jf mo1817d() {
        return null;
    }

    public final void mo1812e() {
    }
}
