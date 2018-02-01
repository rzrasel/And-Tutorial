package com.google.android.gms.internal;

import java.io.IOException;

public final class on {

    public static final class C1622a extends sq<C1622a, C1621a> implements tn {
        private static final C1622a f6863g;
        private static volatile tp<C1622a> f6864h;
        int f6865a;
        ry f6866b = ry.f7068a;
        private C1626c f6867c;

        public static final class C1621a extends sr<C1622a, C1621a> implements tn {
            private C1621a() {
                super(C1622a.f6863g);
            }

            public final C1621a m6251a() {
                m6102c();
                ((C1622a) this.a).f6865a = 0;
                return this;
            }

            public final C1621a m6252a(C1626c c1626c) {
                m6102c();
                C1622a.m6256a((C1622a) this.a, c1626c);
                return this;
            }

            public final C1621a m6253a(ry ryVar) {
                m6102c();
                C1622a.m6257a((C1622a) this.a, ryVar);
                return this;
            }
        }

        static {
            sq c1622a = new C1622a();
            f6863g = c1622a;
            c1622a.mo2219a(sy.f7116d, null, null);
            c1622a.f6753e.f7159a = false;
        }

        private C1622a() {
        }

        public static C1622a m6254a(ry ryVar) {
            return (C1622a) sq.m6117a(f6863g, ryVar);
        }

        static /* synthetic */ void m6256a(C1622a c1622a, C1626c c1626c) {
            if (c1626c == null) {
                throw new NullPointerException();
            }
            c1622a.f6867c = c1626c;
        }

        static /* synthetic */ void m6257a(C1622a c1622a, ry ryVar) {
            if (ryVar == null) {
                throw new NullPointerException();
            }
            c1622a.f6866b = ryVar;
        }

        public static C1621a m6258b() {
            sq sqVar = f6863g;
            sr srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
            srVar.m6100a(sqVar);
            return (C1621a) srVar;
        }

        public static C1622a m6259d() {
            return f6863g;
        }

        public final C1626c m6261a() {
            return this.f6867c == null ? C1626c.m6272b() : this.f6867c;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (oo.f6876a[i - 1]) {
                case 1:
                    return new C1622a();
                case 2:
                    return f6863g;
                case 3:
                    return null;
                case 4:
                    return new C1621a();
                case 5:
                    sz szVar = (sz) obj;
                    C1622a c1622a = (C1622a) obj2;
                    this.f6865a = szVar.mo2276a(this.f6865a != 0, this.f6865a, c1622a.f6865a != 0, c1622a.f6865a);
                    this.f6867c = (C1626c) szVar.mo2279a(this.f6867c, c1622a.f6867c);
                    boolean z2 = this.f6866b != ry.f7068a;
                    ry ryVar = this.f6866b;
                    if (c1622a.f6866b == ry.f7068a) {
                        z = false;
                    }
                    this.f6866b = szVar.mo2277a(z2, ryVar, z, c1622a.f6866b);
                    return this;
                case 6:
                    si siVar = (si) obj;
                    sm smVar = (sm) obj2;
                    byte b = (byte) 0;
                    while (b == (byte) 0) {
                        try {
                            int a = siVar.mo2248a();
                            switch (a) {
                                case 0:
                                    b = true;
                                    break;
                                case 8:
                                    this.f6865a = siVar.mo2251b();
                                    break;
                                case 18:
                                    sr srVar;
                                    if (this.f6867c != null) {
                                        sq sqVar = this.f6867c;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1625a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6867c = (C1626c) siVar.mo2249a(C1626c.m6272b(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6867c);
                                    this.f6867c = (C1626c) srVar.m6103d();
                                    break;
                                case 26:
                                    this.f6866b = siVar.mo2255d();
                                    break;
                                default:
                                    if (!siVar.mo2252b(a)) {
                                        b = true;
                                        break;
                                    }
                                    break;
                            }
                        } catch (Throwable e) {
                            e.f7130a = this;
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            Throwable tfVar = new tf(e2.getMessage());
                            tfVar.f7130a = this;
                            throw new RuntimeException(tfVar);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f6864h == null) {
                        synchronized (C1622a.class) {
                            if (f6864h == null) {
                                f6864h = new ss(f6863g);
                            }
                        }
                    }
                    return f6864h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6863g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6865a != 0) {
                skVar.mo2273b(1, this.f6865a);
            }
            if (this.f6867c != null) {
                skVar.mo2266a(2, this.f6867c == null ? C1626c.m6272b() : this.f6867c);
            }
            if (!this.f6866b.m6527b()) {
                skVar.mo2265a(3, this.f6866b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6865a != 0) {
                    i = sk.m6588c(1, this.f6865a) + 0;
                }
                if (this.f6867c != null) {
                    i += sk.m6586b(2, this.f6867c == null ? C1626c.m6272b() : this.f6867c);
                }
                if (!this.f6866b.m6527b()) {
                    i += sk.m6585b(3, this.f6866b);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1624b extends sq<C1624b, C1623a> implements tn {
        private static final C1624b f6868c;
        private static volatile tp<C1624b> f6869g;
        int f6870a;
        private C1626c f6871b;

        public static final class C1623a extends sr<C1624b, C1623a> implements tn {
            private C1623a() {
                super(C1624b.f6868c);
            }
        }

        static {
            sq c1624b = new C1624b();
            f6868c = c1624b;
            c1624b.mo2219a(sy.f7116d, null, null);
            c1624b.f6753e.f7159a = false;
        }

        private C1624b() {
        }

        public static C1624b m6265a(ry ryVar) {
            return (C1624b) sq.m6117a(f6868c, ryVar);
        }

        public static C1624b m6266b() {
            return f6868c;
        }

        public final C1626c m6268a() {
            return this.f6871b == null ? C1626c.m6272b() : this.f6871b;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (oo.f6876a[i - 1]) {
                case 1:
                    return new C1624b();
                case 2:
                    return f6868c;
                case 3:
                    return null;
                case 4:
                    return new C1623a();
                case 5:
                    sz szVar = (sz) obj;
                    C1624b c1624b = (C1624b) obj2;
                    this.f6871b = (C1626c) szVar.mo2279a(this.f6871b, c1624b.f6871b);
                    boolean z2 = this.f6870a != 0;
                    int i2 = this.f6870a;
                    if (c1624b.f6870a == 0) {
                        z = false;
                    }
                    this.f6870a = szVar.mo2276a(z2, i2, z, c1624b.f6870a);
                    return this;
                case 6:
                    si siVar = (si) obj;
                    sm smVar = (sm) obj2;
                    byte b = (byte) 0;
                    while (b == (byte) 0) {
                        try {
                            int a = siVar.mo2248a();
                            switch (a) {
                                case 0:
                                    b = true;
                                    break;
                                case 10:
                                    sr srVar;
                                    if (this.f6871b != null) {
                                        sq sqVar = this.f6871b;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1625a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6871b = (C1626c) siVar.mo2249a(C1626c.m6272b(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6871b);
                                    this.f6871b = (C1626c) srVar.m6103d();
                                    break;
                                case 16:
                                    this.f6870a = siVar.mo2251b();
                                    break;
                                default:
                                    if (!siVar.mo2252b(a)) {
                                        b = true;
                                        break;
                                    }
                                    break;
                            }
                        } catch (Throwable e) {
                            e.f7130a = this;
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            Throwable tfVar = new tf(e2.getMessage());
                            tfVar.f7130a = this;
                            throw new RuntimeException(tfVar);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f6869g == null) {
                        synchronized (C1624b.class) {
                            if (f6869g == null) {
                                f6869g = new ss(f6868c);
                            }
                        }
                    }
                    return f6869g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6868c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6871b != null) {
                skVar.mo2266a(1, this.f6871b == null ? C1626c.m6272b() : this.f6871b);
            }
            if (this.f6870a != 0) {
                skVar.mo2273b(2, this.f6870a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6871b != null) {
                    i = sk.m6586b(1, this.f6871b == null ? C1626c.m6272b() : this.f6871b) + 0;
                }
                if (this.f6870a != 0) {
                    i += sk.m6588c(2, this.f6870a);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1626c extends sq<C1626c, C1625a> implements tn {
        private static final C1626c f6872c;
        private static volatile tp<C1626c> f6873g;
        int f6874a;
        private int f6875b;

        public static final class C1625a extends sr<C1626c, C1625a> implements tn {
            private C1625a() {
                super(C1626c.f6872c);
            }
        }

        static {
            sq c1626c = new C1626c();
            f6872c = c1626c;
            c1626c.mo2219a(sy.f7116d, null, null);
            c1626c.f6753e.f7159a = false;
        }

        private C1626c() {
        }

        public static C1626c m6272b() {
            return f6872c;
        }

        public final oh m6274a() {
            oh a = oh.m6222a(this.f6875b);
            return a == null ? oh.UNRECOGNIZED : a;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            byte b = (byte) 0;
            switch (oo.f6876a[i - 1]) {
                case 1:
                    return new C1626c();
                case 2:
                    return f6872c;
                case 3:
                    return null;
                case 4:
                    return new C1625a();
                case 5:
                    sz szVar = (sz) obj;
                    C1626c c1626c = (C1626c) obj2;
                    this.f6875b = szVar.mo2276a(this.f6875b != 0, this.f6875b, c1626c.f6875b != 0, c1626c.f6875b);
                    boolean z2 = this.f6874a != 0;
                    int i2 = this.f6874a;
                    if (c1626c.f6874a == 0) {
                        z = false;
                    }
                    this.f6874a = szVar.mo2276a(z2, i2, z, c1626c.f6874a);
                    return this;
                case 6:
                    si siVar = (si) obj;
                    while (b == (byte) 0) {
                        try {
                            int a = siVar.mo2248a();
                            switch (a) {
                                case 0:
                                    b = (byte) 1;
                                    break;
                                case 8:
                                    this.f6875b = siVar.mo2257e();
                                    break;
                                case 16:
                                    this.f6874a = siVar.mo2251b();
                                    break;
                                default:
                                    if (!siVar.mo2252b(a)) {
                                        b = (byte) 1;
                                        break;
                                    }
                                    break;
                            }
                        } catch (Throwable e) {
                            e.f7130a = this;
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            Throwable tfVar = new tf(e2.getMessage());
                            tfVar.f7130a = this;
                            throw new RuntimeException(tfVar);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f6873g == null) {
                        synchronized (C1626c.class) {
                            if (f6873g == null) {
                                f6873g = new ss(f6872c);
                            }
                        }
                    }
                    return f6873g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6872c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6875b != oh.UNKNOWN_HASH.m6223a()) {
                skVar.mo2273b(1, this.f6875b);
            }
            if (this.f6874a != 0) {
                skVar.mo2273b(2, this.f6874a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6875b != oh.UNKNOWN_HASH.m6223a()) {
                    i = sk.m6591d(1, this.f6875b) + 0;
                }
                if (this.f6874a != 0) {
                    i += sk.m6588c(2, this.f6874a);
                }
                this.f = i;
            }
            return i;
        }
    }
}
