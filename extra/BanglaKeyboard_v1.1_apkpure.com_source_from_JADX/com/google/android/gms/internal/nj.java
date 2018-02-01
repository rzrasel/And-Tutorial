package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class nj {
    private static Cipher f6709b = null;
    private static final Object f6710c = new Object();
    private static final Object f6711d = new Object();
    private final SecureRandom f6712a = null;

    public static String m6065a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 16) {
            throw new nk();
        }
        try {
            byte[] doFinal;
            byte[] iv;
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f6710c) {
                m6066a().init(1, secretKeySpec, null);
                doFinal = m6066a().doFinal(bArr2);
                iv = m6066a().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            doFinal = new byte[length];
            allocate.get(doFinal);
            return lp.m5984a(doFinal, false);
        } catch (Throwable e) {
            throw new nk(e);
        } catch (Throwable e2) {
            throw new nk(e2);
        } catch (Throwable e22) {
            throw new nk(e22);
        } catch (Throwable e222) {
            throw new nk(e222);
        } catch (Throwable e2222) {
            throw new nk(e2222);
        }
    }

    private static Cipher m6066a() {
        Cipher cipher;
        synchronized (f6711d) {
            if (f6709b == null) {
                f6709b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f6709b;
        }
        return cipher;
    }

    public static byte[] m6067a(String str) {
        try {
            byte[] a = lp.m5985a(str, false);
            if (a.length != 32) {
                throw new nk();
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (Throwable e) {
            throw new nk(e);
        }
    }

    public static byte[] m6068a(byte[] bArr, String str) {
        if (bArr.length != 16) {
            throw new nk();
        }
        try {
            byte[] a = lp.m5985a(str, false);
            if (a.length <= 16) {
                throw new nk();
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f6710c) {
                m6066a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                a = m6066a().doFinal(a);
            }
            return a;
        } catch (Throwable e) {
            throw new nk(e);
        } catch (Throwable e2) {
            throw new nk(e2);
        } catch (Throwable e22) {
            throw new nk(e22);
        } catch (Throwable e222) {
            throw new nk(e222);
        } catch (Throwable e2222) {
            throw new nk(e2222);
        } catch (Throwable e22222) {
            throw new nk(e22222);
        } catch (Throwable e222222) {
            throw new nk(e222222);
        }
    }
}
