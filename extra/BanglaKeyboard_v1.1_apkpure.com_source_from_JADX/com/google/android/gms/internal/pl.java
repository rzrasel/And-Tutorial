package com.google.android.gms.internal;

import com.google.android.gms.internal.nw.C1595a;
import com.google.android.gms.internal.nw.C1597b;
import com.google.android.gms.internal.nw.C1599c;
import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1635a.C1634b;
import java.security.GeneralSecurityException;

final class pl implements oq<qs, C1595a, C1597b> {
    pl() {
    }

    private static C1595a m6392a(C1597b c1597b) {
        qv.m6476a(c1597b.f6772a);
        m6394a(c1597b.m6161a());
        return (C1595a) C1595a.m6151b().m6145a(c1597b.m6161a()).m6146a(ry.m6517a(qu.m6475a(c1597b.f6772a))).m6144a().m6104e();
    }

    private static pz m6393a(C1595a c1595a) {
        qv.m6479b(c1595a.f6767a);
        qv.m6476a(c1595a.f6768b.mo2239a());
        m6394a(c1595a.m6154a());
        return new pz(c1595a.f6768b.m6528c(), c1595a.m6154a().f6776a);
    }

    private static void m6394a(C1599c c1599c) {
        if (c1599c.f6776a < 12 || c1599c.f6776a > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    private static pz m6395d(ry ryVar) {
        try {
            return m6393a(C1595a.m6147a(ryVar));
        } catch (tf e) {
            throw new GeneralSecurityException("invalid AesCtr Key");
        }
    }

    private static C1595a m6396e(ry ryVar) {
        try {
            return m6392a(C1597b.m6158a(ryVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesCtr key format", e);
        }
    }

    public final /* synthetic */ Object mo2222a(ry ryVar) {
        return m6395d(ryVar);
    }

    public final /* synthetic */ Object mo2223a(tl tlVar) {
        return m6393a((C1595a) tlVar);
    }

    public final /* synthetic */ tl mo2224b(ry ryVar) {
        return m6396e(ryVar);
    }

    public final /* synthetic */ tl mo2225b(tl tlVar) {
        return m6392a((C1597b) tlVar);
    }

    public final C1635a mo2226c(ry ryVar) {
        return (C1635a) C1635a.m6321b().m6315a("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey").m6314a(m6396e(ryVar).mo2216g()).m6313a(C1634b.SYMMETRIC).m6104e();
    }
}
