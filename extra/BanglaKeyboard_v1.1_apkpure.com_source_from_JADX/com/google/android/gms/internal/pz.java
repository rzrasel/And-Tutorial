package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class pz implements qs {
    private final SecretKeySpec f6984a;
    private final int f6985b;
    private final int f6986c = ((Cipher) qj.f7005a.m6465a("AES/CTR/NoPadding")).getBlockSize();

    public pz(byte[] bArr, int i) {
        this.f6984a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f6986c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f6985b = i;
    }

    public final byte[] mo2229a(byte[] bArr) {
        if (bArr.length > ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f6985b) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f6985b));
        }
        Object obj = new byte[(this.f6985b + bArr.length)];
        Object a = qu.m6475a(this.f6985b);
        System.arraycopy(a, 0, obj, 0, this.f6985b);
        int length = bArr.length;
        int i = this.f6985b;
        Cipher cipher = (Cipher) qj.f7005a.m6465a("AES/CTR/NoPadding");
        Object obj2 = new byte[this.f6986c];
        System.arraycopy(a, 0, obj2, 0, this.f6985b);
        cipher.init(1, this.f6984a, new IvParameterSpec(obj2));
        if (cipher.doFinal(bArr, 0, length, obj, i) == length) {
            return obj;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
