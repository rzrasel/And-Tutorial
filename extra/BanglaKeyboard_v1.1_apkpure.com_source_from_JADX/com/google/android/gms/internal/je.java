package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.common.internal.C1516t;

@aqv
public final class je {
    final jf f6277a;
    final Context f6278b;
    final ViewGroup f6279c;
    zzaa f6280d;

    public je(Context context, ViewGroup viewGroup, jf jfVar) {
        this(context, viewGroup, jfVar, (byte) 0);
    }

    private je(Context context, ViewGroup viewGroup, jf jfVar, byte b) {
        this.f6278b = context;
        this.f6279c = viewGroup;
        this.f6277a = jfVar;
        this.f6280d = null;
    }

    public final zzaa m5666a() {
        C1516t.m3867b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f6280d;
    }

    public final void m5667b() {
        C1516t.m3867b("onDestroy must be called from the UI thread.");
        if (this.f6280d != null) {
            this.f6280d.destroy();
            this.f6279c.removeView(this.f6280d);
            this.f6280d = null;
        }
    }
}
