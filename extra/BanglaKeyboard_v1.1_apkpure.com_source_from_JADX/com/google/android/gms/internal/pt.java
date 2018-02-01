package com.google.android.gms.internal;

import com.google.android.gms.internal.ol.C1616b;
import com.google.android.gms.internal.ol.C1618c;
import com.google.android.gms.internal.ol.C1620d;
import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1637b;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

final class pt implements oq<op, C1618c, Object> {
    pt() {
    }

    private static op m6430a(C1618c c1618c) {
        qv.m6479b(c1618c.f6853a);
        C1616b a = c1618c.m6240a();
        ph.m6381a(a.m6232a().m6246a());
        ph.m6380a(a.m6232a().m6249b());
        if (a.m6237d() == od.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        oy oyVar = oy.f6897a;
        C1637b a2 = a.m6235b().m6226a();
        oyVar.m6307a(a2.f6915a).mo2226c(a2.f6916b);
        C1620d a3 = c1618c.m6240a().m6232a();
        of a4 = a3.m6246a();
        byte[] c = c1618c.f6854b.m6528c();
        byte[] c2 = c1618c.f6855c.m6528c();
        ECParameterSpec a5 = ph.m6381a(a4);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, c), new BigInteger(1, c2));
        qc.m6460a(eCPoint, a5.getCurve());
        return new ps((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, a5)), a3.f6859a.m6528c(), ph.m6380a(a3.m6249b()), c1618c.m6240a().m6235b().m6226a(), c1618c.m6240a().m6237d());
    }

    private static op m6431d(ry ryVar) {
        try {
            return m6430a(C1618c.m6238a(ryVar));
        } catch (tf e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdfPublicKey.");
        }
    }

    public final /* synthetic */ Object mo2222a(ry ryVar) {
        return m6431d(ryVar);
    }

    public final /* synthetic */ tl mo2224b(ry ryVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final /* synthetic */ tl mo2225b(tl tlVar) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final C1635a mo2226c(ry ryVar) {
        throw new GeneralSecurityException("Not implemented.");
    }
}
