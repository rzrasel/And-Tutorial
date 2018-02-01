package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.ads.internal.js.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@aqv
public final class wj implements wr {
    public final Object f7330a = new Object();
    public final WeakHashMap<ee, wk> f7331b = new WeakHashMap();
    private final ArrayList<wk> f7332c = new ArrayList();
    private final Context f7333d;
    private final zzajk f7334e;
    private final zzl f7335f;

    public wj(Context context, zzajk com_google_android_gms_internal_zzajk, zzl com_google_android_gms_ads_internal_js_zzl) {
        this.f7333d = context.getApplicationContext();
        this.f7334e = com_google_android_gms_internal_zzajk;
        this.f7335f = com_google_android_gms_ads_internal_js_zzl;
    }

    private final boolean m6913d(ee eeVar) {
        boolean z;
        synchronized (this.f7330a) {
            wk wkVar = (wk) this.f7331b.get(eeVar);
            z = wkVar != null && wkVar.m6939c();
        }
        return z;
    }

    public final void m6914a(ee eeVar) {
        synchronized (this.f7330a) {
            wk wkVar = (wk) this.f7331b.get(eeVar);
            if (wkVar != null) {
                wkVar.m6935b();
            }
        }
    }

    public final void mo2317a(wk wkVar) {
        synchronized (this.f7330a) {
            if (!wkVar.m6939c()) {
                this.f7332c.remove(wkVar);
                Iterator it = this.f7331b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == wkVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void m6916a(zzjb com_google_android_gms_internal_zzjb, ee eeVar) {
        jf jfVar = eeVar.f5953b;
        if (jfVar == null) {
            throw null;
        }
        m6917a(com_google_android_gms_internal_zzjb, eeVar, (View) jfVar);
    }

    public final void m6917a(zzjb com_google_android_gms_internal_zzjb, ee eeVar, View view) {
        m6919a(com_google_android_gms_internal_zzjb, eeVar, new wq(view, eeVar), null);
    }

    public final void m6918a(zzjb com_google_android_gms_internal_zzjb, ee eeVar, View view, zzai com_google_android_gms_ads_internal_js_zzai) {
        m6919a(com_google_android_gms_internal_zzjb, eeVar, new wq(view, eeVar), com_google_android_gms_ads_internal_js_zzai);
    }

    public final void m6919a(zzjb com_google_android_gms_internal_zzjb, ee eeVar, xv xvVar, zzai com_google_android_gms_ads_internal_js_zzai) {
        synchronized (this.f7330a) {
            wk wkVar;
            if (m6913d(eeVar)) {
                wkVar = (wk) this.f7331b.get(eeVar);
            } else {
                wkVar = new wk(this.f7333d, com_google_android_gms_internal_zzjb, eeVar, this.f7334e, xvVar);
                synchronized (wkVar.f7336a) {
                    wkVar.f7338c = this;
                }
                this.f7331b.put(eeVar, wkVar);
                this.f7332c.add(wkVar);
            }
            if (com_google_android_gms_ads_internal_js_zzai != null) {
                wkVar.m6936b(new ws(wkVar, com_google_android_gms_ads_internal_js_zzai));
            } else {
                wkVar.m6936b(new ww(wkVar, this.f7335f, this.f7333d));
            }
        }
    }

    public final void m6920b(ee eeVar) {
        synchronized (this.f7330a) {
            wk wkVar = (wk) this.f7331b.get(eeVar);
            if (wkVar != null) {
                wkVar.m6941e();
            }
        }
    }

    public final void m6921c(ee eeVar) {
        synchronized (this.f7330a) {
            wk wkVar = (wk) this.f7331b.get(eeVar);
            if (wkVar != null) {
                wkVar.m6942f();
            }
        }
    }
}
