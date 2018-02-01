package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.el;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ao {
    private static final ad f2294a = new ad(ay.m3656a(), true);
    private final C0531p f2295b;
    private final Map f2296c;
    private final Map f2297d;
    private final Map f2298e;
    private final bb f2299f;
    private final bb f2300g;
    private final Set f2301h;
    private final C0517b f2302i;
    private final Map f2303j;
    private volatile String f2304k;
    private int f2305l;

    private ad m3635a(el elVar, Set set, az azVar) {
        if (!elVar.f1283l) {
            return new ad(elVar, true);
        }
        el a;
        int i;
        ad a2;
        switch (elVar.f1272a) {
            case 2:
                a = ak.m3634a(elVar);
                a.f1274c = new el[elVar.f1274c.length];
                for (i = 0; i < elVar.f1274c.length; i++) {
                    a2 = m3635a(elVar.f1274c[i], set, azVar.mo1316a());
                    if (a2 == f2294a) {
                        return f2294a;
                    }
                    a.f1274c[i] = (el) a2.f2273a;
                }
                return new ad(a, false);
            case 3:
                a = ak.m3634a(elVar);
                if (elVar.f1275d.length != elVar.f1276e.length) {
                    "Invalid serving value: " + elVar.toString();
                    C0535t.m3730a();
                    return f2294a;
                }
                a.f1275d = new el[elVar.f1275d.length];
                a.f1276e = new el[elVar.f1275d.length];
                for (i = 0; i < elVar.f1275d.length; i++) {
                    a2 = m3635a(elVar.f1275d[i], set, azVar.mo1317b());
                    ad a3 = m3635a(elVar.f1276e[i], set, azVar.mo1318c());
                    if (a2 == f2294a || a3 == f2294a) {
                        return f2294a;
                    }
                    a.f1275d[i] = (el) a2.f2273a;
                    a.f1276e[i] = (el) a3.f2273a;
                }
                return new ad(a, false);
            case 4:
                if (set.contains(elVar.f1277f)) {
                    "Macro cycle detected.  Current macro reference: " + elVar.f1277f + ".  Previous macro references: " + set.toString() + ".";
                    C0535t.m3730a();
                    return f2294a;
                }
                set.add(elVar.f1277f);
                a2 = ba.m3674a(m3638a(elVar.f1277f, set, azVar.mo1320e()), elVar.f1282k);
                set.remove(elVar.f1277f);
                return a2;
            case 7:
                a = ak.m3634a(elVar);
                a.f1281j = new el[elVar.f1281j.length];
                for (i = 0; i < elVar.f1281j.length; i++) {
                    a2 = m3635a(elVar.f1281j[i], set, azVar.mo1319d());
                    if (a2 == f2294a) {
                        return f2294a;
                    }
                    a.f1281j[i] = (el) a2.f2273a;
                }
                return new ad(a, false);
            default:
                "Unknown type: " + elVar.f1272a;
                C0535t.m3730a();
                return f2294a;
        }
    }

    private ad m3636a(al alVar, Set set, ag agVar) {
        ad a = m3639a(this.f2297d, alVar, set, agVar);
        Object b = ay.m3659b((el) a.f2273a);
        ay.m3657a(b);
        return new ad(b, a.f2274b);
    }

    private ad m3637a(am amVar, Set set, aj ajVar) {
        boolean z = true;
        for (al a : amVar.f2287b) {
            ad a2 = m3636a(a, set, ajVar.mo1335a());
            if (((Boolean) a2.f2273a).booleanValue()) {
                ay.m3657a(Boolean.valueOf(false));
                return new ad(Boolean.valueOf(false), a2.f2274b);
            }
            boolean z2 = z && a2.f2274b;
            z = z2;
        }
        for (al a3 : amVar.f2286a) {
            a2 = m3636a(a3, set, ajVar.mo1336b());
            if (((Boolean) a2.f2273a).booleanValue()) {
                z = z && a2.f2274b;
            } else {
                ay.m3657a(Boolean.valueOf(false));
                return new ad(Boolean.valueOf(false), a2.f2274b);
            }
        }
        ay.m3657a(Boolean.valueOf(true));
        return new ad(Boolean.valueOf(true), z);
    }

    private ad m3638a(String str, Set set, C0536v c0536v) {
        this.f2305l++;
        as asVar = (as) this.f2300g.m3675a();
        if (asVar == null || this.f2295b.m3723b()) {
            at atVar = (at) this.f2303j.get(str);
            if (atVar == null) {
                m3642a() + "Invalid macro: " + str;
                C0535t.m3730a();
                this.f2305l--;
                return f2294a;
            }
            al alVar;
            ad a = m3640a(atVar.f2314a, atVar.f2315b, atVar.f2317d, atVar.f2316c, atVar.f2318e, set, c0536v.mo1332b());
            if (((Set) a.f2273a).isEmpty()) {
                alVar = atVar.f2319f;
            } else {
                if (((Set) a.f2273a).size() > 1) {
                    C0535t.m3731a(m3642a() + "Multiple macros active for macroName " + str);
                }
                alVar = (al) ((Set) a.f2273a).iterator().next();
            }
            if (alVar == null) {
                this.f2305l--;
                return f2294a;
            }
            ad a2 = m3639a(this.f2298e, alVar, set, c0536v.mo1331a());
            boolean z = a.f2274b && a2.f2274b;
            ad adVar = a2 == f2294a ? f2294a : new ad(a2.f2273a, z);
            el elVar = alVar.f2285b;
            if (adVar.f2274b) {
                bb bbVar = this.f2300g;
                as asVar2 = new as(adVar, elVar);
            }
            m3643a(elVar, set);
            this.f2305l--;
            return adVar;
        }
        m3643a(asVar.f2313b, set);
        this.f2305l--;
        return asVar.f2312a;
    }

    private ad m3639a(Map map, al alVar, Set set, ag agVar) {
        el elVar = (el) Collections.unmodifiableMap(alVar.f2284a).get(ap.FUNCTION.toString());
        if (elVar == null) {
            C0535t.m3730a();
            return f2294a;
        }
        String str = elVar.f1278g;
        C0532q c0532q = (C0532q) map.get(str);
        if (c0532q == null) {
            str + " has no backing implementation.";
            C0535t.m3730a();
            return f2294a;
        }
        ad adVar = (ad) this.f2299f.m3675a();
        if (adVar != null && !this.f2295b.m3723b()) {
            return adVar;
        }
        Map hashMap = new HashMap();
        Object obj = 1;
        for (Entry entry : Collections.unmodifiableMap(alVar.f2284a).entrySet()) {
            entry.getKey();
            ai a = agVar.mo1333a();
            el elVar2 = (el) entry.getValue();
            entry.getValue();
            ad a2 = m3635a(elVar2, set, a.mo1334a());
            if (a2 == f2294a) {
                return f2294a;
            }
            Object obj2;
            if (a2.f2274b) {
                alVar.f2284a.put((String) entry.getKey(), (el) a2.f2273a);
                obj2 = obj;
            } else {
                obj2 = null;
            }
            hashMap.put(entry.getKey(), a2.f2273a);
            obj = obj2;
        }
        if (hashMap.keySet().containsAll(c0532q.f2374a)) {
            boolean z = obj != null && c0532q.m3724a();
            ad adVar2 = new ad(c0532q.m3725b(), z);
            if (z) {
                bb bbVar = this.f2299f;
            }
            Object obj3 = adVar2.f2273a;
            return adVar2;
        }
        "Incorrect keys for function " + str + " required " + c0532q.f2374a + " had " + hashMap.keySet();
        C0535t.m3730a();
        return f2294a;
    }

    private ad m3640a(Set set, Map map, Map map2, Map map3, Map map4, Set set2, an anVar) {
        return m3641a(set, set2, new ap(this, map, map2, map3, map4), anVar);
    }

    private ad m3641a(Set set, Set set2, ar arVar, an anVar) {
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z = true;
        for (am amVar : set) {
            aj a = anVar.mo1315a();
            ad a2 = m3637a(amVar, set2, a);
            if (((Boolean) a2.f2273a).booleanValue()) {
                arVar.mo1321a(amVar, hashSet, hashSet2, a);
            }
            boolean z2 = z && a2.f2274b;
            z = z2;
        }
        hashSet.removeAll(hashSet2);
        return new ad(hashSet, z);
    }

    private String m3642a() {
        if (this.f2305l <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.f2305l));
        for (int i = 2; i < this.f2305l; i++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    private void m3643a(el elVar, Set set) {
        if (elVar != null) {
            ad a = m3635a(elVar, set, new ac());
            if (a != f2294a) {
                Object c = ay.m3661c((el) a.f2273a);
                if (c instanceof Map) {
                    this.f2302i.m3672a((Map) c);
                } else if (c instanceof List) {
                    for (Object c2 : (List) c2) {
                        if (c2 instanceof Map) {
                            this.f2302i.m3672a((Map) c2);
                        } else {
                            C0535t.m3731a("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    C0535t.m3731a("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    private synchronized void m3644b(String str) {
        this.f2304k = str;
    }

    public final synchronized void m3645a(String str) {
        m3644b(str);
        bf a = this.f2295b.m3722a().m3721a();
        for (al a2 : (Set) m3641a(this.f2301h, new HashSet(), new aq(this), a.m3682b()).f2273a) {
            m3639a(this.f2296c, a2, new HashSet(), a.m3681a());
        }
        m3644b(null);
    }
}
