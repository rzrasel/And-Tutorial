package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

final class ap implements ar {
    final /* synthetic */ Map f2306a;
    final /* synthetic */ Map f2307b;
    final /* synthetic */ Map f2308c;
    final /* synthetic */ Map f2309d;
    final /* synthetic */ ao f2310e;

    ap(ao aoVar, Map map, Map map2, Map map3, Map map4) {
        this.f2310e = aoVar;
        this.f2306a = map;
        this.f2307b = map2;
        this.f2308c = map3;
        this.f2309d = map4;
    }

    public final void mo1321a(am amVar, Set set, Set set2, aj ajVar) {
        List list = (List) this.f2306a.get(amVar);
        this.f2307b.get(amVar);
        if (list != null) {
            set.addAll(list);
            ajVar.mo1337c();
        }
        list = (List) this.f2308c.get(amVar);
        this.f2309d.get(amVar);
        if (list != null) {
            set2.addAll(list);
            ajVar.mo1338d();
        }
    }
}
