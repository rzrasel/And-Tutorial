package com.google.android.gms.internal;

import java.io.IOException;

public final class nw {

    public static final class C1595a extends sq<C1595a, C1594a> implements tn {
        private static final C1595a f6765g;
        private static volatile tp<C1595a> f6766h;
        int f6767a;
        ry f6768b = ry.f7068a;
        private C1599c f6769c;

        public static final class C1594a extends sr<C1595a, C1594a> implements tn {
            private C1594a() {
                super(C1595a.f6765g);
            }

            public final C1594a m6144a() {
                m6102c();
                ((C1595a) this.a).f6767a = 0;
                return this;
            }

            public final C1594a m6145a(C1599c c1599c) {
                m6102c();
                C1595a.m6149a((C1595a) this.a, c1599c);
                return this;
            }

            public final C1594a m6146a(ry ryVar) {
                m6102c();
                C1595a.m6150a((C1595a) this.a, ryVar);
                return this;
            }
        }

        static {
            sq c1595a = new C1595a();
            f6765g = c1595a;
            c1595a.mo2219a(sy.f7116d, null, null);
            c1595a.f6753e.f7159a = false;
        }

        private C1595a() {
        }

        public static C1595a m6147a(ry ryVar) {
            return (C1595a) sq.m6117a(f6765g, ryVar);
        }

        static /* synthetic */ void m6149a(C1595a c1595a, C1599c c1599c) {
            if (c1599c == null) {
                throw new NullPointerException();
            }
            c1595a.f6769c = c1599c;
        }

        static /* synthetic */ void m6150a(C1595a c1595a, ry ryVar) {
            if (ryVar == null) {
                throw new NullPointerException();
            }
            c1595a.f6768b = ryVar;
        }

        public static C1594a m6151b() {
            sq sqVar = f6765g;
            sr srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
            srVar.m6100a(sqVar);
            return (C1594a) srVar;
        }

        public static C1595a m6152d() {
            return f6765g;
        }

        public final C1599c m6154a() {
            return this.f6769c == null ? C1599c.m6165a() : this.f6769c;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (nx.f6777a[i - 1]) {
                case 1:
                    return new C1595a();
                case 2:
                    return f6765g;
                case 3:
                    return null;
                case 4:
                    return new C1594a();
                case 5:
                    sz szVar = (sz) obj;
                    C1595a c1595a = (C1595a) obj2;
                    this.f6767a = szVar.mo2276a(this.f6767a != 0, this.f6767a, c1595a.f6767a != 0, c1595a.f6767a);
                    this.f6769c = (C1599c) szVar.mo2279a(this.f6769c, c1595a.f6769c);
                    boolean z2 = this.f6768b != ry.f7068a;
                    ry ryVar = this.f6768b;
                    if (c1595a.f6768b == ry.f7068a) {
                        z = false;
                    }
                    this.f6768b = szVar.mo2277a(z2, ryVar, z, c1595a.f6768b);
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
                                    this.f6767a = siVar.mo2251b();
                                    break;
                                case 18:
                                    sr srVar;
                                    if (this.f6769c != null) {
                                        sq sqVar = this.f6769c;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1598a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6769c = (C1599c) siVar.mo2249a(C1599c.m6165a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6769c);
                                    this.f6769c = (C1599c) srVar.m6103d();
                                    break;
                                case 26:
                                    this.f6768b = siVar.mo2255d();
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
                    if (f6766h == null) {
                        synchronized (C1595a.class) {
                            if (f6766h == null) {
                                f6766h = new ss(f6765g);
                            }
                        }
                    }
                    return f6766h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6765g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6767a != 0) {
                skVar.mo2273b(1, this.f6767a);
            }
            if (this.f6769c != null) {
                skVar.mo2266a(2, this.f6769c == null ? C1599c.m6165a() : this.f6769c);
            }
            if (!this.f6768b.m6527b()) {
                skVar.mo2265a(3, this.f6768b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6767a != 0) {
                    i = sk.m6588c(1, this.f6767a) + 0;
                }
                if (this.f6769c != null) {
                    i += sk.m6586b(2, this.f6769c == null ? C1599c.m6165a() : this.f6769c);
                }
                if (!this.f6768b.m6527b()) {
                    i += sk.m6585b(3, this.f6768b);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1597b extends sq<C1597b, C1596a> implements tn {
        private static final C1597b f6770c;
        private static volatile tp<C1597b> f6771g;
        int f6772a;
        private C1599c f6773b;

        public static final class C1596a extends sr<C1597b, C1596a> implements tn {
            private C1596a() {
                super(C1597b.f6770c);
            }
        }

        static {
            sq c1597b = new C1597b();
            f6770c = c1597b;
            c1597b.mo2219a(sy.f7116d, null, null);
            c1597b.f6753e.f7159a = false;
        }

        private C1597b() {
        }

        public static C1597b m6158a(ry ryVar) {
            return (C1597b) sq.m6117a(f6770c, ryVar);
        }

        public static C1597b m6159b() {
            return f6770c;
        }

        public final C1599c m6161a() {
            return this.f6773b == null ? C1599c.m6165a() : this.f6773b;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (nx.f6777a[i - 1]) {
                case 1:
                    return new C1597b();
                case 2:
                    return f6770c;
                case 3:
                    return null;
                case 4:
                    return new C1596a();
                case 5:
                    sz szVar = (sz) obj;
                    C1597b c1597b = (C1597b) obj2;
                    this.f6773b = (C1599c) szVar.mo2279a(this.f6773b, c1597b.f6773b);
                    boolean z2 = this.f6772a != 0;
                    int i2 = this.f6772a;
                    if (c1597b.f6772a == 0) {
                        z = false;
                    }
                    this.f6772a = szVar.mo2276a(z2, i2, z, c1597b.f6772a);
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
                                    if (this.f6773b != null) {
                                        sq sqVar = this.f6773b;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1598a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6773b = (C1599c) siVar.mo2249a(C1599c.m6165a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6773b);
                                    this.f6773b = (C1599c) srVar.m6103d();
                                    break;
                                case 16:
                                    this.f6772a = siVar.mo2251b();
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
                    if (f6771g == null) {
                        synchronized (C1597b.class) {
                            if (f6771g == null) {
                                f6771g = new ss(f6770c);
                            }
                        }
                    }
                    return f6771g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6770c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6773b != null) {
                skVar.mo2266a(1, this.f6773b == null ? C1599c.m6165a() : this.f6773b);
            }
            if (this.f6772a != 0) {
                skVar.mo2273b(2, this.f6772a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6773b != null) {
                    i = sk.m6586b(1, this.f6773b == null ? C1599c.m6165a() : this.f6773b) + 0;
                }
                if (this.f6772a != 0) {
                    i += sk.m6588c(2, this.f6772a);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1599c extends sq<C1599c, C1598a> implements tn {
        private static final C1599c f6774b;
        private static volatile tp<C1599c> f6775c;
        int f6776a;

        public static final class C1598a extends sr<C1599c, C1598a> implements tn {
            private C1598a() {
                super(C1599c.f6774b);
            }
        }

        static {
            sq c1599c = new C1599c();
            f6774b = c1599c;
            c1599c.mo2219a(sy.f7116d, null, null);
            c1599c.f6753e.f7159a = false;
        }

        private C1599c() {
        }

        public static C1599c m6165a() {
            return f6774b;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            byte b = (byte) 0;
            switch (nx.f6777a[i - 1]) {
                case 1:
                    return new C1599c();
                case 2:
                    return f6774b;
                case 3:
                    return null;
                case 4:
                    return new C1598a();
                case 5:
                    sz szVar = (sz) obj;
                    C1599c c1599c = (C1599c) obj2;
                    boolean z2 = this.f6776a != 0;
                    int i2 = this.f6776a;
                    if (c1599c.f6776a == 0) {
                        z = false;
                    }
                    this.f6776a = szVar.mo2276a(z2, i2, z, c1599c.f6776a);
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
                                    this.f6776a = siVar.mo2251b();
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
                    if (f6775c == null) {
                        synchronized (C1599c.class) {
                            if (f6775c == null) {
                                f6775c = new ss(f6774b);
                            }
                        }
                    }
                    return f6775c;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6774b;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6776a != 0) {
                skVar.mo2273b(1, this.f6776a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6776a != 0) {
                    i = sk.m6588c(1, this.f6776a) + 0;
                }
                this.f = i;
            }
            return i;
        }
    }
}
