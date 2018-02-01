package com.google.android.gms.internal;

import com.google.android.gms.internal.on.C1622a;
import com.google.android.gms.internal.on.C1624b;
import com.google.android.gms.internal.on.C1626c;
import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1635a.C1634b;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

final class pw implements oq<ou, C1622a, C1624b> {
    pw() {
    }

    private static C1622a m6440a(C1624b c1624b) {
        if (c1624b.f6870a < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m6442a(c1624b.m6268a());
        return (C1622a) C1622a.m6258b().m6251a().m6252a(c1624b.m6268a()).m6253a(ry.m6517a(qu.m6475a(c1624b.f6870a))).m6104e();
    }

    private static ou m6441a(C1622a c1622a) {
        qv.m6479b(c1622a.f6865a);
        if (c1622a.f6866b.mo2239a() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m6442a(c1622a.m6261a());
        oh a = c1622a.m6261a().m6274a();
        Key secretKeySpec = new SecretKeySpec(c1622a.f6866b.m6528c(), "HMAC");
        int i = c1622a.m6261a().f6874a;
        switch (px.f6982a[a.ordinal()]) {
            case 1:
                return new qt("HMACSHA1", secretKeySpec, i);
            case 2:
                return new qt("HMACSHA256", secretKeySpec, i);
            case 3:
                return new qt("HMACSHA512", secretKeySpec, i);
            default:
                throw new GeneralSecurityException("unknown hash");
        }
    }

    private static void m6442a(C1626c c1626c) {
        if (c1626c.f6874a < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch (px.f6982a[c1626c.m6274a().ordinal()]) {
            case 1:
                if (c1626c.f6874a > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 2:
                if (c1626c.f6874a > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 3:
                if (c1626c.f6874a > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            default:
                throw new GeneralSecurityException("unknown hash type");
        }
    }

    private static ou m6443d(ry ryVar) {
        try {
            return m6441a(C1622a.m6254a(ryVar));
        } catch (tf e) {
            throw new GeneralSecurityException("invalid Hmac key");
        }
    }

    private static C1622a m6444e(ry ryVar) {
        try {
            return m6440a(C1624b.m6265a(ryVar));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid Hmac key format", e);
        }
    }

    public final /* synthetic */ Object mo2222a(ry ryVar) {
        return m6443d(ryVar);
    }

    public final /* synthetic */ Object mo2223a(tl tlVar) {
        return m6441a((C1622a) tlVar);
    }

    public final /* synthetic */ tl mo2224b(ry ryVar) {
        return m6444e(ryVar);
    }

    public final /* synthetic */ tl mo2225b(tl tlVar) {
        return m6440a((C1624b) tlVar);
    }

    public final C1635a mo2226c(ry ryVar) {
        return (C1635a) C1635a.m6321b().m6315a("type.googleapis.com/google.cloud.crypto.tink.HmacKey").m6314a(m6444e(ryVar).mo2216g()).m6313a(C1634b.SYMMETRIC).m6104e();
    }
}
