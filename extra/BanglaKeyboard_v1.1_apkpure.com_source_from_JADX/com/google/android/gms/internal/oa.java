package com.google.android.gms.internal;

import java.io.IOException;

public final class oa {

    public static final class C1608a extends sq<C1608a, C1607a> implements tn {
        private static final C1608a f6791g;
        private static volatile tp<C1608a> f6792h;
        int f6793a;
        ry f6794b = ry.f7068a;
        private C1612c f6795c;

        public static final class C1607a extends sr<C1608a, C1607a> implements tn {
            private C1607a() {
                super(C1608a.f6791g);
            }

            public final C1607a m6194a() {
                m6102c();
                ((C1608a) this.a).f6793a = 0;
                return this;
            }

            public final C1607a m6195a(C1612c c1612c) {
                m6102c();
                C1608a.m6200a((C1608a) this.a, c1612c);
                return this;
            }

            public final C1607a m6196a(ry ryVar) {
                m6102c();
                C1608a.m6201a((C1608a) this.a, ryVar);
                return this;
            }
        }

        static {
            sq c1608a = new C1608a();
            f6791g = c1608a;
            c1608a.mo2219a(sy.f7116d, null, null);
            c1608a.f6753e.f7159a = false;
        }

        private C1608a() {
        }

        public static C1607a m6197a() {
            sq sqVar = f6791g;
            sr srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
            srVar.m6100a(sqVar);
            return (C1607a) srVar;
        }

        public static C1608a m6198a(ry ryVar) {
            return (C1608a) sq.m6117a(f6791g, ryVar);
        }

        static /* synthetic */ void m6200a(C1608a c1608a, C1612c c1612c) {
            if (c1612c == null) {
                throw new NullPointerException();
            }
            c1608a.f6795c = c1612c;
        }

        static /* synthetic */ void m6201a(C1608a c1608a, ry ryVar) {
            if (ryVar == null) {
                throw new NullPointerException();
            }
            c1608a.f6794b = ryVar;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (ob.f6802a[i - 1]) {
                case 1:
                    return new C1608a();
                case 2:
                    return f6791g;
                case 3:
                    return null;
                case 4:
                    return new C1607a();
                case 5:
                    sz szVar = (sz) obj;
                    C1608a c1608a = (C1608a) obj2;
                    this.f6793a = szVar.mo2276a(this.f6793a != 0, this.f6793a, c1608a.f6793a != 0, c1608a.f6793a);
                    this.f6795c = (C1612c) szVar.mo2279a(this.f6795c, c1608a.f6795c);
                    boolean z2 = this.f6794b != ry.f7068a;
                    ry ryVar = this.f6794b;
                    if (c1608a.f6794b == ry.f7068a) {
                        z = false;
                    }
                    this.f6794b = szVar.mo2277a(z2, ryVar, z, c1608a.f6794b);
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
                                    this.f6793a = siVar.mo2251b();
                                    break;
                                case 18:
                                    sr srVar;
                                    if (this.f6795c != null) {
                                        sq sqVar = this.f6795c;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1611a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6795c = (C1612c) siVar.mo2249a(C1612c.m6211a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6795c);
                                    this.f6795c = (C1612c) srVar.m6103d();
                                    break;
                                case 26:
                                    this.f6794b = siVar.mo2255d();
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
                    if (f6792h == null) {
                        synchronized (C1608a.class) {
                            if (f6792h == null) {
                                f6792h = new ss(f6791g);
                            }
                        }
                    }
                    return f6792h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6791g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6793a != 0) {
                skVar.mo2273b(1, this.f6793a);
            }
            if (this.f6795c != null) {
                skVar.mo2266a(2, this.f6795c == null ? C1612c.m6211a() : this.f6795c);
            }
            if (!this.f6794b.m6527b()) {
                skVar.mo2265a(3, this.f6794b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6793a != 0) {
                    i = sk.m6588c(1, this.f6793a) + 0;
                }
                if (this.f6795c != null) {
                    i += sk.m6586b(2, this.f6795c == null ? C1612c.m6211a() : this.f6795c);
                }
                if (!this.f6794b.m6527b()) {
                    i += sk.m6585b(3, this.f6794b);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1610b extends sq<C1610b, C1609a> implements tn {
        private static final C1610b f6796c;
        private static volatile tp<C1610b> f6797g;
        C1612c f6798a;
        int f6799b;

        public static final class C1609a extends sr<C1610b, C1609a> implements tn {
            private C1609a() {
                super(C1610b.f6796c);
            }
        }

        static {
            sq c1610b = new C1610b();
            f6796c = c1610b;
            c1610b.mo2219a(sy.f7116d, null, null);
            c1610b.f6753e.f7159a = false;
        }

        private C1610b() {
        }

        public static C1610b m6207a(ry ryVar) {
            return (C1610b) sq.m6117a(f6796c, ryVar);
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (ob.f6802a[i - 1]) {
                case 1:
                    return new C1610b();
                case 2:
                    return f6796c;
                case 3:
                    return null;
                case 4:
                    return new C1609a();
                case 5:
                    sz szVar = (sz) obj;
                    C1610b c1610b = (C1610b) obj2;
                    this.f6798a = (C1612c) szVar.mo2279a(this.f6798a, c1610b.f6798a);
                    boolean z2 = this.f6799b != 0;
                    int i2 = this.f6799b;
                    if (c1610b.f6799b == 0) {
                        z = false;
                    }
                    this.f6799b = szVar.mo2276a(z2, i2, z, c1610b.f6799b);
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
                                    if (this.f6798a != null) {
                                        sq sqVar = this.f6798a;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1611a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6798a = (C1612c) siVar.mo2249a(C1612c.m6211a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6798a);
                                    this.f6798a = (C1612c) srVar.m6103d();
                                    break;
                                case 16:
                                    this.f6799b = siVar.mo2251b();
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
                    if (f6797g == null) {
                        synchronized (C1610b.class) {
                            if (f6797g == null) {
                                f6797g = new ss(f6796c);
                            }
                        }
                    }
                    return f6797g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6796c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6798a != null) {
                skVar.mo2266a(1, this.f6798a == null ? C1612c.m6211a() : this.f6798a);
            }
            if (this.f6799b != 0) {
                skVar.mo2273b(2, this.f6799b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6798a != null) {
                    i = sk.m6586b(1, this.f6798a == null ? C1612c.m6211a() : this.f6798a) + 0;
                }
                if (this.f6799b != 0) {
                    i += sk.m6588c(2, this.f6799b);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1612c extends sq<C1612c, C1611a> implements tn {
        private static final C1612c f6800a;
        private static volatile tp<C1612c> f6801b;

        public static final class C1611a extends sr<C1612c, C1611a> implements tn {
            private C1611a() {
                super(C1612c.f6800a);
            }
        }

        static {
            sq c1612c = new C1612c();
            f6800a = c1612c;
            c1612c.mo2219a(sy.f7116d, null, null);
            c1612c.f6753e.f7159a = false;
        }

        private C1612c() {
        }

        public static C1612c m6211a() {
            return f6800a;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (ob.f6802a[i - 1]) {
                case 1:
                    return new C1612c();
                case 2:
                    return f6800a;
                case 3:
                    return null;
                case 4:
                    return new C1611a();
                case 5:
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
                    if (f6801b == null) {
                        synchronized (C1612c.class) {
                            if (f6801b == null) {
                                f6801b = new ss(f6800a);
                            }
                        }
                    }
                    return f6801b;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6800a;
        }

        public final void mo2220a(sk skVar) {
        }

        public final int mo2221c() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            this.f = 0;
            return 0;
        }
    }
}
