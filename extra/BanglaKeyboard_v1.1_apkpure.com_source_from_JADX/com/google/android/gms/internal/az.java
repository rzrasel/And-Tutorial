package com.google.android.gms.internal;

import java.util.Map;

final class az implements ail {
    private /* synthetic */ ax f5708a;

    az(ax axVar) {
        this.f5708a = axVar;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        synchronized (this.f5708a.f5699a) {
            if (this.f5708a.f5702d.isDone()) {
                return;
            }
            bd bdVar = new bd(-2, map);
            if (this.f5708a.f5700b.equals(bdVar.f5750f)) {
                String str = bdVar.f5752h;
                if (str == null) {
                    id.m5370a("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (str.contains("%40mediation_adapters%40")) {
                    String replaceAll = str.replaceAll("%40mediation_adapters%40", ep.m5369a(jfVar.getContext(), (String) map.get("check_adapters"), this.f5708a.f5701c));
                    bdVar.f5752h = replaceAll;
                    str = "Ad request URL modified to ";
                    replaceAll = String.valueOf(replaceAll);
                    if (replaceAll.length() != 0) {
                        str.concat(replaceAll);
                    } else {
                        replaceAll = new String(str);
                    }
                    es.m5373a();
                }
                this.f5708a.f5702d.m3633b(bdVar);
                return;
            }
        }
    }
}
