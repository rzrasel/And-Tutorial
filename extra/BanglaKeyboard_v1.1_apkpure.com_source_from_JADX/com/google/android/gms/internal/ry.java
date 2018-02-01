package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.Iterator;

public abstract class ry implements Serializable, Iterable<Byte> {
    public static final ry f7068a = new sg(ta.f7126b);
    private static final sc f7069c;
    int f7070b = 0;

    static {
        byte b = (byte) 1;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException e) {
            b = (byte) 0;
        }
        f7069c = b != (byte) 0 ? new sh() : new sa();
    }

    ry() {
    }

    static int m6515a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static ry m6516a(String str) {
        return new sg(str.getBytes(ta.f7125a));
    }

    public static ry m6517a(byte[] bArr) {
        return m6518a(bArr, 0, bArr.length);
    }

    public static ry m6518a(byte[] bArr, int i, int i2) {
        return new sg(f7069c.mo2237a(bArr, i, i2));
    }

    static ry m6519b(byte[] bArr) {
        return new sg(bArr);
    }

    static se m6520c(int i) {
        return new se(i);
    }

    public abstract byte mo2238a(int i);

    public abstract int mo2239a();

    protected abstract int mo2240a(int i, int i2);

    abstract void mo2241a(rx rxVar);

    protected abstract void mo2242a(byte[] bArr, int i);

    public abstract ry mo2244b(int i);

    public final boolean m6527b() {
        return mo2239a() == 0;
    }

    public final byte[] m6528c() {
        int a = mo2239a();
        if (a == 0) {
            return ta.f7126b;
        }
        byte[] bArr = new byte[a];
        mo2242a(bArr, a);
        return bArr;
    }

    public abstract si mo2245d();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f7070b;
        if (i == 0) {
            i = mo2239a();
            i = mo2240a(i, i);
            if (i == 0) {
                i = 1;
            }
            this.f7070b = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new rz(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo2239a())});
    }
}
