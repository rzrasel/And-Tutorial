package com.google.android.gms.internal;

import com.google.android.gms.internal.nu.C1591a;
import com.google.android.gms.internal.nu.C1593b;
import com.google.android.gms.internal.oa.C1608a;
import com.google.android.gms.internal.oa.C1610b;
import com.google.android.gms.internal.oz.C1637b;
import java.security.GeneralSecurityException;

final class pq {
    final int f6965a;
    final int f6966b;
    C1608a f6967c;
    C1591a f6968d;
    int f6969e;

    public pq(C1637b c1637b) {
        String str = c1637b.f6915a;
        if (str.equals("type.googleapis.com/google.cloud.crypto.tink.AesGcmKey")) {
            try {
                C1610b a = C1610b.m6207a(c1637b.f6916b);
                this.f6965a = pr.f6970a;
                this.f6967c = (C1608a) oy.f6897a.m6308a(c1637b);
                this.f6966b = a.f6799b;
            } catch (Throwable e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (str.equals("type.googleapis.com/google.cloud.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C1593b a2 = C1593b.m6137a(c1637b.f6916b);
                this.f6965a = pr.f6971b;
                this.f6968d = (C1591a) oy.f6897a.m6308a(c1637b);
                this.f6969e = a2.m6139a().f6772a;
                this.f6966b = a2.m6142b().f6870a + this.f6969e;
            } catch (Throwable e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String str2 = "unsupported AEAD DEM key type: ";
            str = String.valueOf(str);
            throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }
}
