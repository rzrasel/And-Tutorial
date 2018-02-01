package com.google.android.gms.internal;

import java.util.Map;

final class ay implements ail {
    private /* synthetic */ ax f5707a;

    ay(ax axVar) {
        this.f5707a = axVar;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        synchronized (this.f5707a.f5699a) {
            if (this.f5707a.f5702d.isDone()) {
            } else if (this.f5707a.f5700b.equals(map.get("request_id"))) {
                bd bdVar = new bd(1, map);
                String str = bdVar.f5748d;
                String valueOf = String.valueOf(bdVar.f5745a);
                id.m5370a(new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(valueOf).length()).append("Invalid ").append(str).append(" request error: ").append(valueOf).toString());
                this.f5707a.f5702d.m3633b(bdVar);
            }
        }
    }
}
