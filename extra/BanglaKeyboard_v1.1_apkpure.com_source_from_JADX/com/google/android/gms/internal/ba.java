package com.google.android.gms.internal;

import java.util.Map;

final class ba implements ail {
    private /* synthetic */ ax f5709a;

    ba(ax axVar) {
        this.f5709a = axVar;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        synchronized (this.f5709a.f5699a) {
            if (this.f5709a.f5702d.isDone()) {
                return;
            }
            bd bdVar = new bd(-2, map);
            if (this.f5709a.f5700b.equals(bdVar.f5750f)) {
                this.f5709a.f5702d.m3633b(bdVar);
                return;
            }
        }
    }
}
