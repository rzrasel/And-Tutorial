package android.databinding;

import java.util.ArrayList;
import java.util.List;

public class C0018b<C, T, A> implements Cloneable {
    private List<C> f14a = new ArrayList();
    private long f15b = 0;
    private long[] f16c;
    private int f17d;
    private final C0013a<C, T, A> f18e;

    public static abstract class C0013a<C, T, A> {
        public abstract void mo3a(C c, T t, int i);
    }

    public C0018b(C0013a<C, T, A> c0013a) {
        this.f18e = c0013a;
    }

    private synchronized C0018b<C, T, A> m9a() {
        C0018b<C, T, A> c0018b;
        CloneNotSupportedException e;
        try {
            c0018b = (C0018b) super.clone();
            try {
                c0018b.f15b = 0;
                c0018b.f16c = null;
                c0018b.f17d = 0;
                c0018b.f14a = new ArrayList();
                int size = this.f14a.size();
                for (int i = 0; i < size; i++) {
                    if (!m13a(i)) {
                        c0018b.f14a.add(this.f14a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return c0018b;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            c0018b = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return c0018b;
        }
        return c0018b;
    }

    private void m10a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f14a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    private void m11a(T t, int i, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f18e.mo3a(this.f14a.get(i2), t, i);
            }
            j2 <<= 1;
            i2++;
        }
    }

    private void m12a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m11a(t, i, 0, Math.min(64, this.f14a.size()), this.f15b);
            return;
        }
        long j = this.f16c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f14a.size(), i3 + 64);
        m12a(t, i, a, i2 - 1);
        m11a(t, i, i3, min, j);
    }

    private boolean m13a(int i) {
        if (i < 64) {
            return ((1 << i) & this.f15b) != 0;
        } else {
            if (this.f16c == null) {
                return false;
            }
            int i2 = (i / 64) - 1;
            return i2 >= this.f16c.length ? false : (this.f16c[i2] & (1 << (i % 64))) != 0;
        }
    }

    public final synchronized void m14a(C c) {
        if (c == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        int lastIndexOf = this.f14a.lastIndexOf(c);
        if (lastIndexOf < 0 || m13a(lastIndexOf)) {
            this.f14a.add(c);
        }
    }

    public final synchronized void m15a(T t, int i) {
        this.f17d++;
        int size = this.f14a.size();
        int length = this.f16c == null ? -1 : this.f16c.length - 1;
        m12a(t, i, null, length);
        m11a(t, i, (length + 2) * 64, size, 0);
        this.f17d--;
        if (this.f17d == 0) {
            if (this.f16c != null) {
                for (length = this.f16c.length - 1; length >= 0; length--) {
                    long j = this.f16c[length];
                    if (j != 0) {
                        m10a((length + 1) * 64, j);
                        this.f16c[length] = 0;
                    }
                }
            }
            if (this.f15b != 0) {
                m10a(0, this.f15b);
                this.f15b = 0;
            }
        }
    }

    public final synchronized void m16b(C c) {
        if (this.f17d == 0) {
            this.f14a.remove(c);
        } else {
            int lastIndexOf = this.f14a.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                if (lastIndexOf < 64) {
                    this.f15b = (1 << lastIndexOf) | this.f15b;
                } else {
                    int i = (lastIndexOf / 64) - 1;
                    if (this.f16c == null) {
                        this.f16c = new long[(this.f14a.size() / 64)];
                    } else if (this.f16c.length < i) {
                        Object obj = new long[(this.f14a.size() / 64)];
                        System.arraycopy(this.f16c, 0, obj, 0, this.f16c.length);
                        this.f16c = obj;
                    }
                    long j = 1 << (lastIndexOf % 64);
                    long[] jArr = this.f16c;
                    jArr[i] = j | jArr[i];
                }
            }
        }
    }

    public /* synthetic */ Object clone() {
        return m9a();
    }
}
