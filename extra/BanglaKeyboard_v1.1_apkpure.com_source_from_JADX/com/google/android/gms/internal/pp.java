package com.google.android.gms.internal;

import com.google.android.gms.internal.os.C1628a;
import com.google.android.gms.internal.os.C1630b;
import com.google.android.gms.internal.os.C1632c;
import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1635a.C1634b;
import com.google.android.gms.internal.oz.C1637b;
import java.security.GeneralSecurityException;

final class pp implements oq<nt, C1628a, C1630b> {
    pp() {
    }

    private static nt m6420a(C1628a c1628a) {
        qv.m6479b(c1628a.f6881a);
        oy oyVar = oy.f6897a;
        C1632c a = c1628a.m6291a();
        C1635a d = a.f6888a == null ? C1635a.m6322d() : a.f6888a;
        nt ntVar = (nt) oyVar.m6310a(d.f6910a, d.f6911b);
        C1632c a2 = c1628a.m6291a();
        return new po(a2.f6889b == null ? C1637b.m6328a() : a2.f6889b, ntVar);
    }

    private static C1628a m6421a(C1630b c1630b) {
        return (C1628a) C1628a.m6289b().m6285a(c1630b.f6885a == null ? C1632c.m6300a() : c1630b.f6885a).m6284a().m6104e();
    }

    private static nt m6422d(ry ryVar) {
        try {
            return m6420a(C1628a.m6286a(ryVar));
        } catch (tf e) {
            throw new GeneralSecurityException("invalid KMSEnvelopeAead key");
        }
    }

    private static C1628a m6423e(ry ryVar) {
        try {
            return m6421a(C1630b.m6296a(ryVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid KmsEnvelopeAead key format", e);
        }
    }

    public final /* synthetic */ Object mo2222a(ry ryVar) {
        return m6422d(ryVar);
    }

    public final /* synthetic */ tl mo2224b(ry ryVar) {
        return m6423e(ryVar);
    }

    public final /* synthetic */ tl mo2225b(tl tlVar) {
        return m6421a((C1630b) tlVar);
    }

    public final C1635a mo2226c(ry ryVar) {
        return (C1635a) C1635a.m6321b().m6315a("type.googleapis.com/google.cloud.crypto.tink.KmsEnvelopeAeadKey").m6314a(m6423e(ryVar).mo2216g()).m6313a(C1634b.REMOTE).m6104e();
    }
}
