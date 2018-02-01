package com.google.android.gms.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class sk extends rx {
    static final Logger f7090a = Logger.getLogger(sk.class.getName());
    static final boolean f7091b = uf.m6720a();

    static class C1648a extends sk {
        private final byte[] f7092c;
        private final int f7093d;
        private final int f7094e;
        private int f7095f;

        C1648a(byte[] bArr, int i) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((i | 0) | (bArr.length - (i + 0))) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i)}));
            } else {
                this.f7092c = bArr;
                this.f7093d = 0;
                this.f7095f = 0;
                this.f7094e = i + 0;
            }
        }

        public final int mo2262a() {
            return this.f7094e - this.f7095f;
        }

        public final void mo2263a(int i) {
            if (i >= 0) {
                mo2272b(i);
            } else {
                mo2267a((long) i);
            }
        }

        public final void mo2264a(int i, int i2) {
            mo2272b((i << 3) | i2);
        }

        public final void mo2265a(int i, ry ryVar) {
            mo2264a(i, 2);
            mo2268a(ryVar);
        }

        public final void mo2266a(int i, tl tlVar) {
            mo2264a(i, 2);
            mo2269a(tlVar);
        }

        public final void mo2267a(long j) {
            byte[] bArr;
            int i;
            if (!sk.f7091b || mo2262a() < 10) {
                while ((j & -128) != 0) {
                    try {
                        bArr = this.f7092c;
                        i = this.f7095f;
                        this.f7095f = i + 1;
                        bArr[i] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (Throwable e) {
                        throw new C1649b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7095f), Integer.valueOf(this.f7094e), Integer.valueOf(1)}), e);
                    }
                }
                bArr = this.f7092c;
                i = this.f7095f;
                this.f7095f = i + 1;
                bArr[i] = (byte) ((int) j);
                return;
            }
            while ((j & -128) != 0) {
                bArr = this.f7092c;
                i = this.f7095f;
                this.f7095f = i + 1;
                uf.m6719a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            bArr = this.f7092c;
            i = this.f7095f;
            this.f7095f = i + 1;
            uf.m6719a(bArr, (long) i, (byte) ((int) j));
        }

        public final void mo2268a(ry ryVar) {
            mo2272b(ryVar.mo2239a());
            ryVar.mo2241a((rx) this);
        }

        public final void mo2269a(tl tlVar) {
            mo2272b(tlVar.mo2221c());
            tlVar.mo2220a(this);
        }

        public final void mo2270a(String str) {
            mo2264a(1, 2);
            mo2274b(str);
        }

        public final void mo2271a(byte[] bArr, int i, int i2) {
            mo2275b(bArr, i, i2);
        }

        public final void mo2272b(int i) {
            byte[] bArr;
            int i2;
            if (!sk.f7091b || mo2262a() < 10) {
                while ((i & -128) != 0) {
                    try {
                        bArr = this.f7092c;
                        i2 = this.f7095f;
                        this.f7095f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (Throwable e) {
                        throw new C1649b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7095f), Integer.valueOf(this.f7094e), Integer.valueOf(1)}), e);
                    }
                }
                bArr = this.f7092c;
                i2 = this.f7095f;
                this.f7095f = i2 + 1;
                bArr[i2] = (byte) i;
                return;
            }
            while ((i & -128) != 0) {
                bArr = this.f7092c;
                i2 = this.f7095f;
                this.f7095f = i2 + 1;
                uf.m6719a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            bArr = this.f7092c;
            i2 = this.f7095f;
            this.f7095f = i2 + 1;
            uf.m6719a(bArr, (long) i2, (byte) i);
        }

        public final void mo2273b(int i, int i2) {
            mo2264a(i, 0);
            mo2263a(i2);
        }

        public final void mo2274b(String str) {
            int i = this.f7095f;
            try {
                int c = sk.m6587c(str.length() * 3);
                int c2 = sk.m6587c(str.length());
                if (c2 == c) {
                    this.f7095f = i + c2;
                    c = uh.m6737a(str, this.f7092c, this.f7095f, mo2262a());
                    this.f7095f = i;
                    mo2272b((c - i) - c2);
                    this.f7095f = c;
                    return;
                }
                mo2272b(uh.m6736a((CharSequence) str));
                this.f7095f = uh.m6737a(str, this.f7092c, this.f7095f, mo2262a());
            } catch (Throwable e) {
                this.f7095f = i;
                sk.f7090a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
                byte[] bytes = str.getBytes(ta.f7125a);
                try {
                    mo2272b(bytes.length);
                    mo2271a(bytes, 0, bytes.length);
                } catch (Throwable e2) {
                    throw new C1649b(e2);
                } catch (C1649b e3) {
                    throw e3;
                }
            } catch (Throwable e22) {
                throw new C1649b(e22);
            }
        }

        public final void mo2275b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f7092c, this.f7095f, i2);
                this.f7095f += i2;
            } catch (Throwable e) {
                throw new C1649b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7095f), Integer.valueOf(this.f7094e), Integer.valueOf(i2)}), e);
            }
        }
    }

    public static class C1649b extends IOException {
        C1649b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C1649b(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }

        C1649b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private sk() {
    }

    public static sk m6584a(byte[] bArr) {
        return new C1648a(bArr, bArr.length);
    }

    public static int m6585b(int i, ry ryVar) {
        int c = m6587c(i << 3);
        int a = ryVar.mo2239a();
        return c + (a + m6587c(a));
    }

    public static int m6586b(int i, tl tlVar) {
        int c = m6587c(i << 3);
        int c2 = tlVar.mo2221c();
        return c + (c2 + m6587c(c2));
    }

    public static int m6587c(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    public static int m6588c(int i, int i2) {
        return m6587c(i << 3) + m6590d(i2);
    }

    public static int m6589c(String str) {
        return m6587c(8) + m6592d(str);
    }

    private static int m6590d(int i) {
        return i >= 0 ? m6587c(i) : 10;
    }

    public static int m6591d(int i, int i2) {
        return m6587c(i << 3) + m6590d(i2);
    }

    private static int m6592d(String str) {
        int a;
        try {
            a = uh.m6736a((CharSequence) str);
        } catch (uk e) {
            a = str.getBytes(ta.f7125a).length;
        }
        return a + m6587c(a);
    }

    public abstract int mo2262a();

    public abstract void mo2263a(int i);

    public abstract void mo2264a(int i, int i2);

    public abstract void mo2265a(int i, ry ryVar);

    public abstract void mo2266a(int i, tl tlVar);

    public abstract void mo2267a(long j);

    public abstract void mo2268a(ry ryVar);

    public abstract void mo2269a(tl tlVar);

    public abstract void mo2270a(String str);

    public final void m6602b() {
        if (mo2262a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void mo2272b(int i);

    public abstract void mo2273b(int i, int i2);

    public abstract void mo2274b(String str);

    public abstract void mo2275b(byte[] bArr, int i, int i2);
}
