package com.google.android.gms.internal;

import com.google.android.gms.internal.ny.C1601a;
import com.google.android.gms.internal.ny.C1603b;
import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1635a.C1634b;
import java.security.GeneralSecurityException;

final class pm implements oq<nt, C1601a, C1603b> {
    pm() {
    }

    private static nt m6402a(C1601a c1601a) {
        qv.m6479b(c1601a.f6780a);
        qv.m6476a(c1601a.f6781b.mo2239a());
        if (c1601a.m6179a().f6789a == 12 || c1601a.m6179a().f6789a == 16) {
            return new qa(c1601a.f6781b.m6528c(), c1601a.m6179a().f6789a);
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    private static C1601a m6403a(C1603b c1603b) {
        qv.m6476a(c1603b.f6785a);
        if (c1603b.m6185a().f6789a == 12 || c1603b.m6185a().f6789a == 16) {
            return (C1601a) C1601a.m6177b().m6172a(ry.m6517a(qu.m6475a(c1603b.f6785a))).m6171a(c1603b.m6185a()).m6170a().m6104e();
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    private static nt m6404d(ry ryVar) {
        try {
            return m6402a(C1601a.m6173a(ryVar));
        } catch (tf e) {
            throw new GeneralSecurityException("invalid AesEax key");
        }
    }

    private static C1601a m6405e(ry ryVar) {
        try {
            return m6403a(C1603b.m6183a(ryVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesEax key format", e);
        }
    }

    public final /* synthetic */ Object mo2222a(ry ryVar) {
        return m6404d(ryVar);
    }

    public final /* synthetic */ tl mo2224b(ry ryVar) {
        return m6405e(ryVar);
    }

    public final /* synthetic */ tl mo2225b(tl tlVar) {
        return m6403a((C1603b) tlVar);
    }

    public final C1635a mo2226c(ry ryVar) {
        return (C1635a) C1635a.m6321b().m6315a("type.googleapis.com/google.cloud.crypto.tink.AesEaxKey").m6314a(m6405e(ryVar).mo2216g()).m6313a(C1634b.SYMMETRIC).m6104e();
    }
}
