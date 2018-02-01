package com.google.android.gms.internal;

import com.google.android.gms.internal.oz.C1641c;
import com.google.android.gms.internal.oz.C1641c.C1640b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class pu {
    private static final Logger f6980a = Logger.getLogger(pu.class.getName());

    static {
        try {
            pj.m6382a();
            py.m6450a();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            f6980a.logp(Level.SEVERE, "com.google.cloud.crypto.tink.hybrid.HybridEncryptFactory", "<clinit>", new StringBuilder(String.valueOf(valueOf).length() + 30).append("cannot register key managers: ").append(valueOf).toString());
        }
    }

    public static op m6437a(or orVar) {
        oy oyVar = oy.f6897a;
        C1641c c1641c = orVar.f6877a;
        if (c1641c.f6926b.size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int i = c1641c.f6925a;
        byte b = (byte) 0;
        for (C1640b c1640b : c1641c.f6926b) {
            if ((c1640b.f6919a != null ? (byte) 1 : (byte) 0) == (byte) 0) {
                throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(c1640b.f6920b)}));
            } else if (c1640b.m6340d() == pf.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(c1640b.f6920b)}));
            } else if (c1640b.m6338b() == pc.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(c1640b.f6920b)}));
            } else if (c1640b.f6920b <= 0) {
                throw new GeneralSecurityException(String.format("key has a non-positive key id: %d", new Object[]{Integer.valueOf(c1640b.f6920b)}));
            } else {
                byte b2;
                if (c1640b.m6338b() != pc.ENABLED || c1640b.f6920b != i) {
                    b2 = b;
                } else if (b != (byte) 0) {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                } else {
                    b2 = (byte) 1;
                }
                b = b2;
            }
        }
        if (b == (byte) 0) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        ow owVar = new ow();
        for (C1640b c1640b2 : orVar.f6877a.f6926b) {
            if (c1640b2.m6338b() == pc.ENABLED) {
                byte[] array;
                Object a = oyVar.m6310a(c1640b2.m6335a().f6910a, c1640b2.m6335a().f6911b);
                switch (ok.f6842a[c1640b2.m6340d().ordinal()]) {
                    case 1:
                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(c1640b2.f6920b).array();
                        break;
                    case 2:
                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(c1640b2.f6920b).array();
                        break;
                    case 3:
                        array = oj.f6841a;
                        break;
                    default:
                        throw new GeneralSecurityException("unknown output prefix type");
                }
                ox oxVar = new ox(a, array, c1640b2.m6338b());
                List arrayList = new ArrayList();
                arrayList.add(oxVar);
                String str = new String(oxVar.f6895b, ow.f6891a);
                arrayList = (List) owVar.f6892b.put(str, Collections.unmodifiableList(arrayList));
                if (arrayList != null) {
                    List arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    arrayList2.add(oxVar);
                    owVar.f6892b.put(str, Collections.unmodifiableList(arrayList2));
                }
                if (c1640b2.f6920b == orVar.f6877a.f6925a) {
                    owVar.f6893c = oxVar;
                }
            }
        }
        return new pv(owVar);
    }

    public static void m6438a() {
        oy.f6897a.m6311a("type.googleapis.com/google.cloud.crypto.tink.EciesAeadHkdfPublicKey", new pt());
    }
}
