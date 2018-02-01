package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ni {
    private final ng f1976a;
    private final SecureRandom f1977b = null;

    public ni(ng ngVar) {
        this.f1976a = ngVar;
    }

    public final byte[] m2674a(String str) {
        try {
            byte[] a = this.f1976a.mo895a(str);
            if (a.length != 32) {
                throw new nj(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (Throwable e) {
            throw new nj(this, e);
        }
    }

    public final byte[] m2675a(byte[] bArr, String str) {
        if (bArr.length != 16) {
            throw new nj(this);
        }
        try {
            byte[] a = this.f1976a.mo895a(str);
            if (a.length <= 16) {
                throw new nj(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(a);
        } catch (Throwable e) {
            throw new nj(this, e);
        } catch (Throwable e2) {
            throw new nj(this, e2);
        } catch (Throwable e22) {
            throw new nj(this, e22);
        } catch (Throwable e222) {
            throw new nj(this, e222);
        } catch (Throwable e2222) {
            throw new nj(this, e2222);
        } catch (Throwable e22222) {
            throw new nj(this, e22222);
        } catch (Throwable e222222) {
            throw new nj(this, e222222);
        }
    }
}
