package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class qa implements nt {
    private final byte[] f6987a;
    private final byte[] f6988b;
    private final SecretKeySpec f6989c;
    private final int f6990d;

    public qa(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f6990d = i;
            this.f6989c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f6989c);
            this.f6987a = m6454a(instance.doFinal(new byte[16]));
            this.f6988b = m6454a(this.f6987a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] m6453a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m6455b(bArr2, this.f6987a));
        }
        byte[] b;
        int i5 = 0;
        byte[] doFinal = cipher.doFinal(bArr2);
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2 + i5, i2 + i3);
        if (copyOfRange.length == 16) {
            b = m6455b(copyOfRange, this.f6987a);
        } else {
            bArr2 = Arrays.copyOf(this.f6988b, 16);
            while (i4 < copyOfRange.length) {
                bArr2[i4] = (byte) (bArr2[i4] ^ copyOfRange[i4]);
                i4++;
            }
            bArr2[copyOfRange.length] = (byte) (bArr2[copyOfRange.length] ^ 128);
            b = bArr2;
        }
        return cipher.doFinal(m6455b(doFinal, b));
    }

    private static byte[] m6454a(byte[] bArr) {
        int i;
        int i2 = 0;
        byte[] bArr2 = new byte[16];
        for (i = 0; i < 15; i++) {
            bArr2[i] = (byte) ((bArr[i] << 1) ^ ((bArr[i + 1] & 255) >>> 7));
        }
        i = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i2 = 135;
        }
        bArr2[15] = (byte) (i2 ^ i);
        return bArr2;
    }

    private static byte[] m6455b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] mo2227a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        if (bArr.length > (ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f6990d) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((this.f6990d + bArr.length) + 16)];
        Object a = qu.m6475a(this.f6990d);
        System.arraycopy(a, 0, obj, 0, this.f6990d);
        Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
        instance.init(1, this.f6989c);
        byte[] a2 = m6453a(instance, 0, a, 0, a.length);
        byte[] a3 = m6453a(instance, 1, bArr2, 0, bArr2.length);
        Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
        instance2.init(1, this.f6989c, new IvParameterSpec(a2));
        instance2.doFinal(bArr, 0, bArr.length, obj, this.f6990d);
        byte[] a4 = m6453a(instance, 2, obj, this.f6990d, bArr.length);
        int length = bArr.length + this.f6990d;
        while (i < 16) {
            obj[length + i] = (byte) ((a3[i] ^ a2[i]) ^ a4[i]);
            i++;
        }
        return obj;
    }
}
