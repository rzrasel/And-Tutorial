package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class lr {
    static CountDownLatch f6584a = new CountDownLatch(1);
    private static boolean f6585b = false;
    private static MessageDigest f6586c = null;
    private static final Object f6587d = new Object();
    private static final Object f6588e = new Object();

    static String m5988a(kz kzVar, String str, boolean z) {
        byte[] a;
        byte[] a2 = vb.m5895a((vb) kzVar);
        if (((Boolean) zzbv.zzen().m4217a(ado.bx)).booleanValue()) {
            a = z ? m5994a(a2, str, true) : m5993a(a2, str);
        } else if (md.f6594a == null) {
            throw new GeneralSecurityException();
        } else {
            a = md.f6594a.mo2228a(a2, str != null ? str.getBytes() : new byte[0]);
            vb lnVar = new ln();
            lnVar.f6574a = new byte[][]{a};
            lnVar.f6576c = Integer.valueOf(2);
            a = vb.m5895a(lnVar);
        }
        return lp.m5984a(a, true);
    }

    static String m5989a(String str, String str2) {
        ((Boolean) zzbv.zzen().m4217a(ado.bn)).booleanValue();
        byte[] b = m5997b(str, str2);
        return b != null ? lp.m5984a(b, true) : Integer.toString(7);
    }

    static void m5991a() {
        synchronized (f6588e) {
            if (!f6585b) {
                f6585b = true;
                new Thread(new mc()).start();
            }
        }
    }

    public static byte[] m5992a(byte[] bArr) {
        byte[] digest;
        synchronized (f6587d) {
            MessageDigest b = m5995b();
            if (b == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            b.reset();
            b.update(bArr);
            digest = f6586c.digest();
        }
        return digest;
    }

    private static byte[] m5993a(byte[] bArr, String str) {
        Vector b = m5996b(bArr);
        if (b == null || b.size() == 0) {
            return m5994a(vb.m5895a(m5998c()), str, true);
        }
        vb lnVar = new ln();
        lnVar.f6574a = new byte[b.size()][];
        Iterator it = b.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            lnVar.f6574a[i] = m5994a((byte[]) it.next(), str, false);
            i = i2;
        }
        lnVar.f6575b = m5992a(bArr);
        return vb.m5895a(lnVar);
    }

    private static byte[] m5994a(byte[] bArr, String str, boolean z) {
        byte[] bArr2;
        byte[] array;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = vb.m5895a(m5998c());
        }
        if (bArr.length < i) {
            bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(m5992a(array)).put(array).array();
        }
        bArr2 = new byte[256];
        new me().m6014a(array, bArr2);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new rr(str.getBytes("UTF-8")).m6507a(bArr2);
        }
        return bArr2;
    }

    private static MessageDigest m5995b() {
        m5991a();
        boolean z = false;
        try {
            z = f6584a.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        return (z && f6586c != null) ? f6586c : null;
    }

    private static Vector<byte[]> m5996b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector();
        int i = 0;
        while (i < length) {
            int i2 = i * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i2, bArr.length - i2 > 255 ? i2 + 255 : bArr.length));
                i++;
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] m5997b(String str, String str2) {
        vb leVar = new le();
        try {
            leVar.f6560a = str.length() < 3 ? str.getBytes("ISO-8859-1") : lp.m5985a(str, true);
            leVar.f6561b = str2.length() < 3 ? str2.getBytes("ISO-8859-1") : lp.m5985a(str2, true);
            return vb.m5895a(leVar);
        } catch (GeneralSecurityException e) {
            return null;
        } catch (UnsupportedEncodingException e2) {
            return null;
        }
    }

    private static kz m5998c() {
        kz kzVar = new kz();
        kzVar.f6464k = Long.valueOf(4096);
        return kzVar;
    }
}
