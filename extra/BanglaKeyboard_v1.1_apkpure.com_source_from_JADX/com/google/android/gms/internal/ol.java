package com.google.android.gms.internal;

import com.google.android.gms.internal.oz.C1637b;
import com.google.android.gms.internal.oz.C1637b.C1636a;
import java.io.IOException;

public final class ol {

    public static final class C1614a extends sq<C1614a, C1613a> implements tn {
        private static final C1614a f6843b;
        private static volatile tp<C1614a> f6844c;
        private C1637b f6845a;

        public static final class C1613a extends sr<C1614a, C1613a> implements tn {
            private C1613a() {
                super(C1614a.f6843b);
            }
        }

        static {
            sq c1614a = new C1614a();
            f6843b = c1614a;
            c1614a.mo2219a(sy.f7116d, null, null);
            c1614a.f6753e.f7159a = false;
        }

        private C1614a() {
        }

        public static C1614a m6224b() {
            return f6843b;
        }

        public final C1637b m6226a() {
            return this.f6845a == null ? C1637b.m6328a() : this.f6845a;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            switch (om.f6862a[i - 1]) {
                case 1:
                    return new C1614a();
                case 2:
                    return f6843b;
                case 3:
                    return null;
                case 4:
                    return new C1613a();
                case 5:
                    this.f6845a = (C1637b) ((sz) obj).mo2279a(this.f6845a, ((C1614a) obj2).f6845a);
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
                                    b = (byte) 1;
                                    break;
                                case 18:
                                    sr srVar;
                                    if (this.f6845a != null) {
                                        sq sqVar = this.f6845a;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1636a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6845a = (C1637b) siVar.mo2249a(C1637b.m6328a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6845a);
                                    this.f6845a = (C1637b) srVar.m6103d();
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
                    if (f6844c == null) {
                        synchronized (C1614a.class) {
                            if (f6844c == null) {
                                f6844c = new ss(f6843b);
                            }
                        }
                    }
                    return f6844c;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6843b;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6845a != null) {
                skVar.mo2266a(2, this.f6845a == null ? C1637b.m6328a() : this.f6845a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6845a != null) {
                    i = sk.m6586b(2, this.f6845a == null ? C1637b.m6328a() : this.f6845a) + 0;
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1616b extends sq<C1616b, C1615a> implements tn {
        private static final C1616b f6846g;
        private static volatile tp<C1616b> f6847h;
        private C1620d f6848a;
        private C1614a f6849b;
        private int f6850c;

        public static final class C1615a extends sr<C1616b, C1615a> implements tn {
            private C1615a() {
                super(C1616b.f6846g);
            }
        }

        static {
            sq c1616b = new C1616b();
            f6846g = c1616b;
            c1616b.mo2219a(sy.f7116d, null, null);
            c1616b.f6753e.f7159a = false;
        }

        private C1616b() {
        }

        public static C1616b m6230e() {
            return f6846g;
        }

        public final C1620d m6232a() {
            return this.f6848a == null ? C1620d.m6244d() : this.f6848a;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (om.f6862a[i - 1]) {
                case 1:
                    return new C1616b();
                case 2:
                    return f6846g;
                case 3:
                    return null;
                case 4:
                    return new C1615a();
                case 5:
                    sz szVar = (sz) obj;
                    C1616b c1616b = (C1616b) obj2;
                    this.f6848a = (C1620d) szVar.mo2279a(this.f6848a, c1616b.f6848a);
                    this.f6849b = (C1614a) szVar.mo2279a(this.f6849b, c1616b.f6849b);
                    boolean z2 = this.f6850c != 0;
                    int i2 = this.f6850c;
                    if (c1616b.f6850c == 0) {
                        z = false;
                    }
                    this.f6850c = szVar.mo2276a(z2, i2, z, c1616b.f6850c);
                    return this;
                case 6:
                    si siVar = (si) obj;
                    sm smVar = (sm) obj2;
                    byte b = (byte) 0;
                    while (b == (byte) 0) {
                        try {
                            int a = siVar.mo2248a();
                            sq sqVar;
                            sr srVar;
                            sr srVar2;
                            switch (a) {
                                case 0:
                                    b = true;
                                    break;
                                case 10:
                                    if (this.f6848a != null) {
                                        sqVar = this.f6848a;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1619a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6848a = (C1620d) siVar.mo2249a(C1620d.m6244d(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6848a);
                                    this.f6848a = (C1620d) srVar2.m6103d();
                                    break;
                                case 18:
                                    if (this.f6849b != null) {
                                        sqVar = this.f6849b;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1613a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6849b = (C1614a) siVar.mo2249a(C1614a.m6224b(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6849b);
                                    this.f6849b = (C1614a) srVar2.m6103d();
                                    break;
                                case 24:
                                    this.f6850c = siVar.mo2257e();
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
                    if (f6847h == null) {
                        synchronized (C1616b.class) {
                            if (f6847h == null) {
                                f6847h = new ss(f6846g);
                            }
                        }
                    }
                    return f6847h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6846g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6848a != null) {
                skVar.mo2266a(1, this.f6848a == null ? C1620d.m6244d() : this.f6848a);
            }
            if (this.f6849b != null) {
                skVar.mo2266a(2, this.f6849b == null ? C1614a.m6224b() : this.f6849b);
            }
            if (this.f6850c != od.UNKNOWN_FORMAT.m6219a()) {
                skVar.mo2273b(3, this.f6850c);
            }
        }

        public final C1614a m6235b() {
            return this.f6849b == null ? C1614a.m6224b() : this.f6849b;
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6848a != null) {
                    i = sk.m6586b(1, this.f6848a == null ? C1620d.m6244d() : this.f6848a) + 0;
                }
                if (this.f6849b != null) {
                    i += sk.m6586b(2, this.f6849b == null ? C1614a.m6224b() : this.f6849b);
                }
                if (this.f6850c != od.UNKNOWN_FORMAT.m6219a()) {
                    i += sk.m6591d(3, this.f6850c);
                }
                this.f = i;
            }
            return i;
        }

        public final od m6237d() {
            od a = od.m6218a(this.f6850c);
            return a == null ? od.UNRECOGNIZED : a;
        }
    }

    public static final class C1618c extends sq<C1618c, C1617a> implements tn {
        private static final C1618c f6851h;
        private static volatile tp<C1618c> f6852i;
        int f6853a;
        ry f6854b = ry.f7068a;
        ry f6855c = ry.f7068a;
        private C1616b f6856g;

        public static final class C1617a extends sr<C1618c, C1617a> implements tn {
            private C1617a() {
                super(C1618c.f6851h);
            }
        }

        static {
            sq c1618c = new C1618c();
            f6851h = c1618c;
            c1618c.mo2219a(sy.f7116d, null, null);
            c1618c.f6753e.f7159a = false;
        }

        private C1618c() {
        }

        public static C1618c m6238a(ry ryVar) {
            return (C1618c) sq.m6117a(f6851h, ryVar);
        }

        public final C1616b m6240a() {
            return this.f6856g == null ? C1616b.m6230e() : this.f6856g;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (om.f6862a[i - 1]) {
                case 1:
                    return new C1618c();
                case 2:
                    return f6851h;
                case 3:
                    return null;
                case 4:
                    return new C1617a();
                case 5:
                    sz szVar = (sz) obj;
                    C1618c c1618c = (C1618c) obj2;
                    this.f6853a = szVar.mo2276a(this.f6853a != 0, this.f6853a, c1618c.f6853a != 0, c1618c.f6853a);
                    this.f6856g = (C1616b) szVar.mo2279a(this.f6856g, c1618c.f6856g);
                    this.f6854b = szVar.mo2277a(this.f6854b != ry.f7068a, this.f6854b, c1618c.f6854b != ry.f7068a, c1618c.f6854b);
                    boolean z2 = this.f6855c != ry.f7068a;
                    ry ryVar = this.f6855c;
                    if (c1618c.f6855c == ry.f7068a) {
                        z = false;
                    }
                    this.f6855c = szVar.mo2277a(z2, ryVar, z, c1618c.f6855c);
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
                                    this.f6853a = siVar.mo2251b();
                                    break;
                                case 18:
                                    sr srVar;
                                    if (this.f6856g != null) {
                                        sq sqVar = this.f6856g;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1615a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6856g = (C1616b) siVar.mo2249a(C1616b.m6230e(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6856g);
                                    this.f6856g = (C1616b) srVar.m6103d();
                                    break;
                                case 26:
                                    this.f6854b = siVar.mo2255d();
                                    break;
                                case 34:
                                    this.f6855c = siVar.mo2255d();
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
                    if (f6852i == null) {
                        synchronized (C1618c.class) {
                            if (f6852i == null) {
                                f6852i = new ss(f6851h);
                            }
                        }
                    }
                    return f6852i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6851h;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6853a != 0) {
                skVar.mo2273b(1, this.f6853a);
            }
            if (this.f6856g != null) {
                skVar.mo2266a(2, this.f6856g == null ? C1616b.m6230e() : this.f6856g);
            }
            if (!this.f6854b.m6527b()) {
                skVar.mo2265a(3, this.f6854b);
            }
            if (!this.f6855c.m6527b()) {
                skVar.mo2265a(4, this.f6855c);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6853a != 0) {
                    i = sk.m6588c(1, this.f6853a) + 0;
                }
                if (this.f6856g != null) {
                    i += sk.m6586b(2, this.f6856g == null ? C1616b.m6230e() : this.f6856g);
                }
                if (!this.f6854b.m6527b()) {
                    i += sk.m6585b(3, this.f6854b);
                }
                if (!this.f6855c.m6527b()) {
                    i += sk.m6585b(4, this.f6855c);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1620d extends sq<C1620d, C1619a> implements tn {
        private static final C1620d f6857g;
        private static volatile tp<C1620d> f6858h;
        ry f6859a = ry.f7068a;
        private int f6860b;
        private int f6861c;

        public static final class C1619a extends sr<C1620d, C1619a> implements tn {
            private C1619a() {
                super(C1620d.f6857g);
            }
        }

        static {
            sq c1620d = new C1620d();
            f6857g = c1620d;
            c1620d.mo2219a(sy.f7116d, null, null);
            c1620d.f6753e.f7159a = false;
        }

        private C1620d() {
        }

        public static C1620d m6244d() {
            return f6857g;
        }

        public final of m6246a() {
            of a = of.m6220a(this.f6860b);
            return a == null ? of.UNRECOGNIZED : a;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            byte b = (byte) 0;
            switch (om.f6862a[i - 1]) {
                case 1:
                    return new C1620d();
                case 2:
                    return f6857g;
                case 3:
                    return null;
                case 4:
                    return new C1619a();
                case 5:
                    sz szVar = (sz) obj;
                    C1620d c1620d = (C1620d) obj2;
                    this.f6860b = szVar.mo2276a(this.f6860b != 0, this.f6860b, c1620d.f6860b != 0, c1620d.f6860b);
                    this.f6861c = szVar.mo2276a(this.f6861c != 0, this.f6861c, c1620d.f6861c != 0, c1620d.f6861c);
                    boolean z2 = this.f6859a != ry.f7068a;
                    ry ryVar = this.f6859a;
                    if (c1620d.f6859a == ry.f7068a) {
                        z = false;
                    }
                    this.f6859a = szVar.mo2277a(z2, ryVar, z, c1620d.f6859a);
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
                                    this.f6860b = siVar.mo2257e();
                                    break;
                                case 16:
                                    this.f6861c = siVar.mo2257e();
                                    break;
                                case 90:
                                    this.f6859a = siVar.mo2255d();
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
                    if (f6858h == null) {
                        synchronized (C1620d.class) {
                            if (f6858h == null) {
                                f6858h = new ss(f6857g);
                            }
                        }
                    }
                    return f6858h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6857g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6860b != of.UNKNOWN_CURVE.m6221a()) {
                skVar.mo2273b(1, this.f6860b);
            }
            if (this.f6861c != oh.UNKNOWN_HASH.m6223a()) {
                skVar.mo2273b(2, this.f6861c);
            }
            if (!this.f6859a.m6527b()) {
                skVar.mo2265a(11, this.f6859a);
            }
        }

        public final oh m6249b() {
            oh a = oh.m6222a(this.f6861c);
            return a == null ? oh.UNRECOGNIZED : a;
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6860b != of.UNKNOWN_CURVE.m6221a()) {
                    i = sk.m6591d(1, this.f6860b) + 0;
                }
                if (this.f6861c != oh.UNKNOWN_HASH.m6223a()) {
                    i += sk.m6591d(2, this.f6861c);
                }
                if (!this.f6859a.m6527b()) {
                    i += sk.m6585b(11, this.f6859a);
                }
                this.f = i;
            }
            return i;
        }
    }
}
