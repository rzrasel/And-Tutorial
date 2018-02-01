package com.google.android.gms.internal;

import com.google.android.gms.internal.oz.C1637b;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class oy {
    public static final oy f6897a = new oy();
    private final ConcurrentMap<String, oq> f6898b = new ConcurrentHashMap();

    protected oy() {
    }

    final <P, K extends tl, F extends tl> oq<P, K, F> m6307a(String str) {
        oq<P, K, F> oqVar = (oq) this.f6898b.get(str);
        if (oqVar != null) {
            return oqVar;
        }
        String str2 = "unsupported key type: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public final <P, K extends tl, F extends tl> K m6308a(C1637b c1637b) {
        return m6307a(c1637b.f6915a).mo2224b(c1637b.f6916b);
    }

    public final <P, K extends tl, F extends tl> K m6309a(String str, F f) {
        return m6307a(str).mo2225b((tl) f);
    }

    final <P, K extends tl, F extends tl> P m6310a(String str, ry ryVar) {
        return m6307a(str).mo2222a(ryVar);
    }

    public final <P, K extends tl, F extends tl> boolean m6311a(String str, oq<P, K, F> oqVar) {
        return ((oq) this.f6898b.putIfAbsent(str, oqVar)) == null;
    }

    public final <P, K extends tl, F extends tl> P m6312b(String str, K k) {
        return m6307a(str).mo2223a((tl) k);
    }
}
