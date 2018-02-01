package com.google.android.gms.internal;

import com.google.android.gms.internal.oa.C1608a;
import com.google.android.gms.internal.oa.C1610b;
import com.google.android.gms.internal.oa.C1612c;
import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1635a.C1634b;
import java.security.GeneralSecurityException;

final class pn implements oq<nt, C1608a, C1610b> {
    pn() {
    }

    private static C1608a m6411a(C1610b c1610b) {
        qv.m6476a(c1610b.f6799b);
        return (C1608a) C1608a.m6197a().m6196a(ry.m6517a(qu.m6475a(c1610b.f6799b))).m6195a(c1610b.f6798a == null ? C1612c.m6211a() : c1610b.f6798a).m6194a().m6104e();
    }

    private static nt m6412d(ry ryVar) {
        try {
            return new qb(C1608a.m6198a(ryVar).f6794b.m6528c());
        } catch (tf e) {
            throw new GeneralSecurityException("invalid AesGcm key");
        }
    }

    private static C1608a m6413e(ry ryVar) {
        try {
            return m6411a(C1610b.m6207a(ryVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesGcm key format", e);
        }
    }

    public final /* synthetic */ Object mo2222a(ry ryVar) {
        return m6412d(ryVar);
    }

    public final /* synthetic */ Object mo2223a(tl tlVar) {
        C1608a c1608a = (C1608a) tlVar;
        qv.m6479b(c1608a.f6793a);
        qv.m6476a(c1608a.f6794b.mo2239a());
        return new qb(c1608a.f6794b.m6528c());
    }

    public final /* synthetic */ tl mo2224b(ry ryVar) {
        return m6413e(ryVar);
    }

    public final /* synthetic */ tl mo2225b(tl tlVar) {
        return m6411a((C1610b) tlVar);
    }

    public final C1635a mo2226c(ry ryVar) {
        return (C1635a) C1635a.m6321b().m6315a("type.googleapis.com/google.cloud.crypto.tink.AesGcmKey").m6314a(m6413e(ryVar).mo2216g()).m6313a(C1634b.SYMMETRIC).m6104e();
    }
}
