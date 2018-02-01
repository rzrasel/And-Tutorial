package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class qb implements nt {
    private final SecretKeySpec f6991a;

    public qb(byte[] bArr) {
        this.f6991a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] mo2227a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((bArr.length + 12) + 16)];
        Object a = qu.m6475a(12);
        System.arraycopy(a, 0, obj, 0, 12);
        Cipher cipher = (Cipher) qj.f7005a.m6465a("AES/GCM/NoPadding");
        cipher.init(1, this.f6991a, new GCMParameterSpec(128, a));
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, obj, 12);
        return obj;
    }
}
