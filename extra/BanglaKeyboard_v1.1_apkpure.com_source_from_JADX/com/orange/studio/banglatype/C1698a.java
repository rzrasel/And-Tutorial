package com.orange.studio.banglatype;

import java.util.Arrays;

public abstract class C1698a<E> {
    private final int f8027a;
    private final int f8028b;
    private E[] f8029c;
    private int[] f8030d;
    private int f8031e;

    protected abstract E mo2401a();

    public final void m7217a(int i, int i2) {
        int i3 = 0;
        if (this.f8029c != null && i > this.f8029c.length) {
            int i4 = this.f8027a * ((i / this.f8027a) + 1);
            if (this.f8030d != null) {
                if (this.f8029c == null || this.f8029c.length < this.f8030d.length) {
                    throw new IllegalStateException("positions.length > elements.length");
                }
                Object[] a = mo2403a(i4);
                int[] iArr = new int[i4];
                Arrays.fill(iArr, -1);
                while (i3 < this.f8030d.length) {
                    int i5 = this.f8030d[i3];
                    if (i5 != -1) {
                        int i6 = i5 % i4;
                        a[i6] = this.f8029c[i3];
                        iArr[i6] = i5;
                    } else {
                        Object obj = this.f8029c[i3];
                        if (obj != null) {
                            mo2402a(obj);
                        }
                    }
                    i3++;
                }
                this.f8029c = a;
                this.f8030d = iArr;
            } else if (this.f8029c != null) {
                Object a2 = mo2403a(i4);
                System.arraycopy(this.f8029c, 0, a2, 0, this.f8029c.length);
                this.f8029c = a2;
            }
        }
        if (this.f8029c == null) {
            if (i2 <= this.f8028b) {
                this.f8029c = mo2403a(i2);
                this.f8030d = null;
            } else {
                i3 = Math.max(i, this.f8027a);
                this.f8029c = mo2403a(i3);
                this.f8030d = new int[i3];
                Arrays.fill(this.f8030d, -1);
            }
        }
        this.f8031e = i2;
    }

    protected abstract void mo2402a(E e);

    protected abstract E[] mo2403a(int i);

    public final E m7220b(int i) {
        m7217a(this.f8029c != null ? this.f8029c.length : this.f8027a, this.f8031e);
        if (this.f8029c != null) {
            if (this.f8029c.length < this.f8031e) {
                int length = i % this.f8029c.length;
                if (this.f8029c[length] == null) {
                    this.f8029c[length] = mo2401a();
                } else if (this.f8030d == null || this.f8030d[length] != i) {
                    mo2402a(this.f8029c[length]);
                }
                if (this.f8030d != null) {
                    this.f8030d[length] = i;
                }
            } else if (this.f8029c[i] == null) {
                this.f8029c[i] = mo2401a();
            }
        }
        return null;
    }
}
