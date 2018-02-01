package com.google.android.gms.internal;

import java.io.IOException;

public final class ny {

    public static final class C1601a extends sq<C1601a, C1600a> implements tn {
        private static final C1601a f6778g;
        private static volatile tp<C1601a> f6779h;
        int f6780a;
        ry f6781b = ry.f7068a;
        private C1605c f6782c;

        public static final class C1600a extends sr<C1601a, C1600a> implements tn {
            private C1600a() {
                super(C1601a.f6778g);
            }

            public final C1600a m6170a() {
                m6102c();
                ((C1601a) this.a).f6780a = 0;
                return this;
            }

            public final C1600a m6171a(C1605c c1605c) {
                m6102c();
                C1601a.m6175a((C1601a) this.a, c1605c);
                return this;
            }

            public final C1600a m6172a(ry ryVar) {
                m6102c();
                C1601a.m6176a((C1601a) this.a, ryVar);
                return this;
            }
        }

        static {
            sq c1601a = new C1601a();
            f6778g = c1601a;
            c1601a.mo2219a(sy.f7116d, null, null);
            c1601a.f6753e.f7159a = false;
        }

        private C1601a() {
        }

        public static C1601a m6173a(ry ryVar) {
            return (C1601a) sq.m6117a(f6778g, ryVar);
        }

        static /* synthetic */ void m6175a(C1601a c1601a, C1605c c1605c) {
            if (c1605c == null) {
                throw new NullPointerException();
            }
            c1601a.f6782c = c1605c;
        }

        static /* synthetic */ void m6176a(C1601a c1601a, ry ryVar) {
            if (ryVar == null) {
                throw new NullPointerException();
            }
            c1601a.f6781b = ryVar;
        }

        public static C1600a m6177b() {
            sq sqVar = f6778g;
            sr srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
            srVar.m6100a(sqVar);
            return (C1600a) srVar;
        }

        public final C1605c m6179a() {
            return this.f6782c == null ? C1605c.m6189a() : this.f6782c;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (nz.f6790a[i - 1]) {
                case 1:
                    return new C1601a();
                case 2:
                    return f6778g;
                case 3:
                    return null;
                case 4:
                    return new C1600a();
                case 5:
                    sz szVar = (sz) obj;
                    C1601a c1601a = (C1601a) obj2;
                    this.f6780a = szVar.mo2276a(this.f6780a != 0, this.f6780a, c1601a.f6780a != 0, c1601a.f6780a);
                    this.f6782c = (C1605c) szVar.mo2279a(this.f6782c, c1601a.f6782c);
                    boolean z2 = this.f6781b != ry.f7068a;
                    ry ryVar = this.f6781b;
                    if (c1601a.f6781b == ry.f7068a) {
                        z = false;
                    }
                    this.f6781b = szVar.mo2277a(z2, ryVar, z, c1601a.f6781b);
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
                                    this.f6780a = siVar.mo2251b();
                                    break;
                                case 18:
                                    sr srVar;
                                    if (this.f6782c != null) {
                                        sq sqVar = this.f6782c;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1604a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6782c = (C1605c) siVar.mo2249a(C1605c.m6189a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6782c);
                                    this.f6782c = (C1605c) srVar.m6103d();
                                    break;
                                case 26:
                                    this.f6781b = siVar.mo2255d();
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
                    if (f6779h == null) {
                        synchronized (C1601a.class) {
                            if (f6779h == null) {
                                f6779h = new ss(f6778g);
                            }
                        }
                    }
                    return f6779h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6778g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6780a != 0) {
                skVar.mo2273b(1, this.f6780a);
            }
            if (this.f6782c != null) {
                skVar.mo2266a(2, this.f6782c == null ? C1605c.m6189a() : this.f6782c);
            }
            if (!this.f6781b.m6527b()) {
                skVar.mo2265a(3, this.f6781b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6780a != 0) {
                    i = sk.m6588c(1, this.f6780a) + 0;
                }
                if (this.f6782c != null) {
                    i += sk.m6586b(2, this.f6782c == null ? C1605c.m6189a() : this.f6782c);
                }
                if (!this.f6781b.m6527b()) {
                    i += sk.m6585b(3, this.f6781b);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1603b extends sq<C1603b, C1602a> implements tn {
        private static final C1603b f6783c;
        private static volatile tp<C1603b> f6784g;
        int f6785a;
        private C1605c f6786b;

        public static final class C1602a extends sr<C1603b, C1602a> implements tn {
            private C1602a() {
                super(C1603b.f6783c);
            }
        }

        static {
            sq c1603b = new C1603b();
            f6783c = c1603b;
            c1603b.mo2219a(sy.f7116d, null, null);
            c1603b.f6753e.f7159a = false;
        }

        private C1603b() {
        }

        public static C1603b m6183a(ry ryVar) {
            return (C1603b) sq.m6117a(f6783c, ryVar);
        }

        public final C1605c m6185a() {
            return this.f6786b == null ? C1605c.m6189a() : this.f6786b;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (nz.f6790a[i - 1]) {
                case 1:
                    return new C1603b();
                case 2:
                    return f6783c;
                case 3:
                    return null;
                case 4:
                    return new C1602a();
                case 5:
                    sz szVar = (sz) obj;
                    C1603b c1603b = (C1603b) obj2;
                    this.f6786b = (C1605c) szVar.mo2279a(this.f6786b, c1603b.f6786b);
                    boolean z2 = this.f6785a != 0;
                    int i2 = this.f6785a;
                    if (c1603b.f6785a == 0) {
                        z = false;
                    }
                    this.f6785a = szVar.mo2276a(z2, i2, z, c1603b.f6785a);
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
                                    if (this.f6786b != null) {
                                        sq sqVar = this.f6786b;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1604a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6786b = (C1605c) siVar.mo2249a(C1605c.m6189a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6786b);
                                    this.f6786b = (C1605c) srVar.m6103d();
                                    break;
                                case 16:
                                    this.f6785a = siVar.mo2251b();
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
                    if (f6784g == null) {
                        synchronized (C1603b.class) {
                            if (f6784g == null) {
                                f6784g = new ss(f6783c);
                            }
                        }
                    }
                    return f6784g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6783c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6786b != null) {
                skVar.mo2266a(1, this.f6786b == null ? C1605c.m6189a() : this.f6786b);
            }
            if (this.f6785a != 0) {
                skVar.mo2273b(2, this.f6785a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6786b != null) {
                    i = sk.m6586b(1, this.f6786b == null ? C1605c.m6189a() : this.f6786b) + 0;
                }
                if (this.f6785a != 0) {
                    i += sk.m6588c(2, this.f6785a);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1605c extends sq<C1605c, C1604a> implements tn {
        private static final C1605c f6787b;
        private static volatile tp<C1605c> f6788c;
        int f6789a;

        public static final class C1604a extends sr<C1605c, C1604a> implements tn {
            private C1604a() {
                super(C1605c.f6787b);
            }
        }

        static {
            sq c1605c = new C1605c();
            f6787b = c1605c;
            c1605c.mo2219a(sy.f7116d, null, null);
            c1605c.f6753e.f7159a = false;
        }

        private C1605c() {
        }

        public static C1605c m6189a() {
            return f6787b;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            byte b = (byte) 0;
            switch (nz.f6790a[i - 1]) {
                case 1:
                    return new C1605c();
                case 2:
                    return f6787b;
                case 3:
                    return null;
                case 4:
                    return new C1604a();
                case 5:
                    sz szVar = (sz) obj;
                    C1605c c1605c = (C1605c) obj2;
                    boolean z2 = this.f6789a != 0;
                    int i2 = this.f6789a;
                    if (c1605c.f6789a == 0) {
                        z = false;
                    }
                    this.f6789a = szVar.mo2276a(z2, i2, z, c1605c.f6789a);
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
                                    this.f6789a = siVar.mo2251b();
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
                    if (f6788c == null) {
                        synchronized (C1605c.class) {
                            if (f6788c == null) {
                                f6788c = new ss(f6787b);
                            }
                        }
                    }
                    return f6788c;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6787b;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6789a != 0) {
                skVar.mo2273b(1, this.f6789a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6789a != 0) {
                    i = sk.m6588c(1, this.f6789a) + 0;
                }
                this.f = i;
            }
            return i;
        }
    }
}
