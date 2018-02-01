package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class uy implements Cloneable {
    List<vd> f7243a = new ArrayList();
    private uw<?, ?> f7244b;
    private Object f7245c;

    uy() {
    }

    private final byte[] m6800b() {
        byte[] bArr = new byte[m6802a()];
        m6803a(ut.m6774a(bArr, bArr.length));
        return bArr;
    }

    private uy m6801c() {
        uy uyVar = new uy();
        try {
            uyVar.f7244b = this.f7244b;
            if (this.f7243a == null) {
                uyVar.f7243a = null;
            } else {
                uyVar.f7243a.addAll(this.f7243a);
            }
            if (this.f7245c != null) {
                if (this.f7245c instanceof vb) {
                    uyVar.f7245c = (vb) ((vb) this.f7245c).clone();
                } else if (this.f7245c instanceof byte[]) {
                    uyVar.f7245c = ((byte[]) this.f7245c).clone();
                } else if (this.f7245c instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f7245c;
                    r4 = new byte[bArr.length][];
                    uyVar.f7245c = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.f7245c instanceof boolean[]) {
                    uyVar.f7245c = ((boolean[]) this.f7245c).clone();
                } else if (this.f7245c instanceof int[]) {
                    uyVar.f7245c = ((int[]) this.f7245c).clone();
                } else if (this.f7245c instanceof long[]) {
                    uyVar.f7245c = ((long[]) this.f7245c).clone();
                } else if (this.f7245c instanceof float[]) {
                    uyVar.f7245c = ((float[]) this.f7245c).clone();
                } else if (this.f7245c instanceof double[]) {
                    uyVar.f7245c = ((double[]) this.f7245c).clone();
                } else if (this.f7245c instanceof vb[]) {
                    vb[] vbVarArr = (vb[]) this.f7245c;
                    r4 = new vb[vbVarArr.length];
                    uyVar.f7245c = r4;
                    for (r2 = 0; r2 < vbVarArr.length; r2++) {
                        r4[r2] = (vb) vbVarArr[r2].clone();
                    }
                }
            }
            return uyVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    final int m6802a() {
        int i = 0;
        int i2;
        if (this.f7245c != null) {
            uw uwVar = this.f7244b;
            Object obj = this.f7245c;
            if (!uwVar.f7236c) {
                return uwVar.m6796a(obj);
            }
            int length = Array.getLength(obj);
            for (i2 = 0; i2 < length; i2++) {
                if (Array.get(obj, i2) != null) {
                    i += uwVar.m6796a(Array.get(obj, i2));
                }
            }
            return i;
        }
        i2 = 0;
        for (vd vdVar : this.f7243a) {
            i2 = (vdVar.f7250b.length + (ut.m6783c(vdVar.f7249a) + 0)) + i2;
        }
        return i2;
    }

    final void m6803a(ut utVar) {
        if (this.f7245c != null) {
            uw uwVar = this.f7244b;
            Object obj = this.f7245c;
            if (uwVar.f7236c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        uwVar.m6797a(obj2, utVar);
                    }
                }
                return;
            }
            uwVar.m6797a(obj, utVar);
            return;
        }
        for (vd vdVar : this.f7243a) {
            utVar.m6793b(vdVar.f7249a);
            utVar.m6794b(vdVar.f7250b);
        }
    }

    public final /* synthetic */ Object clone() {
        return m6801c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uy)) {
            return false;
        }
        uy uyVar = (uy) obj;
        if (this.f7245c != null && uyVar.f7245c != null) {
            return this.f7244b == uyVar.f7244b ? !this.f7244b.f7234a.isArray() ? this.f7245c.equals(uyVar.f7245c) : this.f7245c instanceof byte[] ? Arrays.equals((byte[]) this.f7245c, (byte[]) uyVar.f7245c) : this.f7245c instanceof int[] ? Arrays.equals((int[]) this.f7245c, (int[]) uyVar.f7245c) : this.f7245c instanceof long[] ? Arrays.equals((long[]) this.f7245c, (long[]) uyVar.f7245c) : this.f7245c instanceof float[] ? Arrays.equals((float[]) this.f7245c, (float[]) uyVar.f7245c) : this.f7245c instanceof double[] ? Arrays.equals((double[]) this.f7245c, (double[]) uyVar.f7245c) : this.f7245c instanceof boolean[] ? Arrays.equals((boolean[]) this.f7245c, (boolean[]) uyVar.f7245c) : Arrays.deepEquals((Object[]) this.f7245c, (Object[]) uyVar.f7245c) : false;
        } else {
            if (this.f7243a != null && uyVar.f7243a != null) {
                return this.f7243a.equals(uyVar.f7243a);
            }
            try {
                return Arrays.equals(m6800b(), uyVar.m6800b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m6800b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
