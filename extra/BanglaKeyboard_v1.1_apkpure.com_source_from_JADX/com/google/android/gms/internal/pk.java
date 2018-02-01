package com.google.android.gms.internal;

import com.google.android.gms.internal.nu.C1591a;
import com.google.android.gms.internal.nu.C1593b;
import com.google.android.gms.internal.nw.C1595a;
import com.google.android.gms.internal.on.C1622a;
import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1635a.C1634b;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;

class pk implements oq<nt, C1591a, C1593b> {
    private static final Logger f6961a = Logger.getLogger(pk.class.getName());

    static {
        try {
            oy.f6897a.m6311a("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey", new pl());
            py.m6450a();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            f6961a.logp(Level.SEVERE, "com.google.cloud.crypto.tink.aead.AesCtrHmacAeadKeyManager", "<clinit>", new StringBuilder(String.valueOf(valueOf).length() + 30).append("cannot register key managers: ").append(valueOf).toString());
        }
    }

    pk() {
    }

    private static nt m6383a(C1591a c1591a) {
        qv.m6479b(c1591a.f6757a);
        return new qi((qs) oy.f6897a.m6312b("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey", c1591a.m6132a()), (ou) oy.f6897a.m6312b("type.googleapis.com/google.cloud.crypto.tink.HmacKey", c1591a.m6135b()), c1591a.m6135b().m6261a().f6874a);
    }

    private static C1591a m6384a(C1593b c1593b) {
        return (C1591a) C1591a.m6130d().m6108a((C1595a) oy.f6897a.m6309a("type.googleapis.com/google.cloud.crypto.tink.AesCtrKey", c1593b.m6139a())).m6109a((C1622a) oy.f6897a.m6309a("type.googleapis.com/google.cloud.crypto.tink.HmacKey", c1593b.m6142b())).m6107a(0).m6104e();
    }

    private static nt m6385d(ry ryVar) {
        try {
            return m6383a(C1591a.m6126a(ryVar));
        } catch (tf e) {
            throw new GeneralSecurityException("invalid AesCtrHmacAead key");
        }
    }

    private static C1591a m6386e(ry ryVar) {
        try {
            return m6384a(C1593b.m6137a(ryVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid AesCtrHmacAead key format", e);
        }
    }

    public final /* synthetic */ Object mo2222a(ry ryVar) {
        return m6385d(ryVar);
    }

    public final /* synthetic */ tl mo2224b(ry ryVar) {
        return m6386e(ryVar);
    }

    public final /* synthetic */ tl mo2225b(tl tlVar) {
        return m6384a((C1593b) tlVar);
    }

    public final C1635a mo2226c(ry ryVar) {
        return (C1635a) C1635a.m6321b().m6315a("type.googleapis.com/google.cloud.crypto.tink.AesCtrHmacAeadKey").m6314a(m6386e(ryVar).mo2216g()).m6313a(C1634b.SYMMETRIC).m6104e();
    }
}
