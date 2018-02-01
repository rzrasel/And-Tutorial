package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.Map;

final class aig implements ail {
    aig() {
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        zzm h = jfVar.mo2160h();
        if (h != null) {
            h.close();
            return;
        }
        h = jfVar.mo2161i();
        if (h != null) {
            h.close();
        } else {
            id.m5370a("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
