package com.google.android.gms.internal;

public abstract class vb {
    protected volatile int f6410S = -1;

    static <T extends vb> T m5894a(T t, byte[] bArr, int i) {
        try {
            us usVar = new us(bArr, i);
            t.mo2198a(usVar);
            usVar.m6755a(0);
            return t;
        } catch (va e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final byte[] m5895a(vb vbVar) {
        byte[] bArr = new byte[vbVar.m5901e()];
        try {
            ut a = ut.m6774a(bArr, bArr.length);
            vbVar.mo2195a(a);
            if (a.f7233a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.f7233a.remaining())}));
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    protected int mo2194a() {
        return 0;
    }

    public abstract vb mo2198a(us usVar);

    public void mo2195a(ut utVar) {
    }

    public vb mo2196c() {
        return (vb) super.clone();
    }

    public /* synthetic */ Object clone() {
        return mo2196c();
    }

    public final int m5900d() {
        if (this.f6410S < 0) {
            m5901e();
        }
        return this.f6410S;
    }

    public final int m5901e() {
        int a = mo2194a();
        this.f6410S = a;
        return a;
    }

    public String toString() {
        return vc.m6810a(this);
    }
}
