package com.google.android.gms.internal;

import com.google.android.gms.internal.nw.C1595a;
import com.google.android.gms.internal.nw.C1595a.C1594a;
import com.google.android.gms.internal.nw.C1597b;
import com.google.android.gms.internal.nw.C1597b.C1596a;
import com.google.android.gms.internal.on.C1622a;
import com.google.android.gms.internal.on.C1622a.C1621a;
import com.google.android.gms.internal.on.C1624b;
import com.google.android.gms.internal.on.C1624b.C1623a;
import java.io.IOException;

public final class nu {

    public static final class C1591a extends sq<C1591a, C1590a> implements tn {
        private static final C1591a f6755g;
        private static volatile tp<C1591a> f6756h;
        int f6757a;
        private C1595a f6758b;
        private C1622a f6759c;

        public static final class C1590a extends sr<C1591a, C1590a> implements tn {
            private C1590a() {
                super(C1591a.f6755g);
            }

            public final C1590a m6107a(int i) {
                m6102c();
                ((C1591a) this.a).f6757a = i;
                return this;
            }

            public final C1590a m6108a(C1595a c1595a) {
                m6102c();
                C1591a.m6128a((C1591a) this.a, c1595a);
                return this;
            }

            public final C1590a m6109a(C1622a c1622a) {
                m6102c();
                C1591a.m6129a((C1591a) this.a, c1622a);
                return this;
            }
        }

        static {
            sq c1591a = new C1591a();
            f6755g = c1591a;
            c1591a.mo2219a(sy.f7116d, null, null);
            c1591a.f6753e.f7159a = false;
        }

        private C1591a() {
        }

        public static C1591a m6126a(ry ryVar) {
            return (C1591a) sq.m6117a(f6755g, ryVar);
        }

        static /* synthetic */ void m6128a(C1591a c1591a, C1595a c1595a) {
            if (c1595a == null) {
                throw new NullPointerException();
            }
            c1591a.f6758b = c1595a;
        }

        static /* synthetic */ void m6129a(C1591a c1591a, C1622a c1622a) {
            if (c1622a == null) {
                throw new NullPointerException();
            }
            c1591a.f6759c = c1622a;
        }

        public static C1590a m6130d() {
            sq sqVar = f6755g;
            sr srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
            srVar.m6100a(sqVar);
            return (C1590a) srVar;
        }

        public final C1595a m6132a() {
            return this.f6758b == null ? C1595a.m6152d() : this.f6758b;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (nv.f6764a[i - 1]) {
                case 1:
                    return new C1591a();
                case 2:
                    return f6755g;
                case 3:
                    return null;
                case 4:
                    return new C1590a();
                case 5:
                    sz szVar = (sz) obj;
                    C1591a c1591a = (C1591a) obj2;
                    boolean z2 = this.f6757a != 0;
                    int i2 = this.f6757a;
                    if (c1591a.f6757a == 0) {
                        z = false;
                    }
                    this.f6757a = szVar.mo2276a(z2, i2, z, c1591a.f6757a);
                    this.f6758b = (C1595a) szVar.mo2279a(this.f6758b, c1591a.f6758b);
                    this.f6759c = (C1622a) szVar.mo2279a(this.f6759c, c1591a.f6759c);
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
                                case 8:
                                    this.f6757a = siVar.mo2251b();
                                    break;
                                case 18:
                                    if (this.f6758b != null) {
                                        sqVar = this.f6758b;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1594a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6758b = (C1595a) siVar.mo2249a(C1595a.m6152d(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6758b);
                                    this.f6758b = (C1595a) srVar2.m6103d();
                                    break;
                                case 26:
                                    if (this.f6759c != null) {
                                        sqVar = this.f6759c;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1621a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6759c = (C1622a) siVar.mo2249a(C1622a.m6259d(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6759c);
                                    this.f6759c = (C1622a) srVar2.m6103d();
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
                    if (f6756h == null) {
                        synchronized (C1591a.class) {
                            if (f6756h == null) {
                                f6756h = new ss(f6755g);
                            }
                        }
                    }
                    return f6756h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6755g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6757a != 0) {
                skVar.mo2273b(1, this.f6757a);
            }
            if (this.f6758b != null) {
                skVar.mo2266a(2, this.f6758b == null ? C1595a.m6152d() : this.f6758b);
            }
            if (this.f6759c != null) {
                skVar.mo2266a(3, this.f6759c == null ? C1622a.m6259d() : this.f6759c);
            }
        }

        public final C1622a m6135b() {
            return this.f6759c == null ? C1622a.m6259d() : this.f6759c;
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6757a != 0) {
                    i = sk.m6588c(1, this.f6757a) + 0;
                }
                if (this.f6758b != null) {
                    i += sk.m6586b(2, this.f6758b == null ? C1595a.m6152d() : this.f6758b);
                }
                if (this.f6759c != null) {
                    i += sk.m6586b(3, this.f6759c == null ? C1622a.m6259d() : this.f6759c);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1593b extends sq<C1593b, C1592a> implements tn {
        private static final C1593b f6760c;
        private static volatile tp<C1593b> f6761g;
        private C1597b f6762a;
        private C1624b f6763b;

        public static final class C1592a extends sr<C1593b, C1592a> implements tn {
            private C1592a() {
                super(C1593b.f6760c);
            }
        }

        static {
            sq c1593b = new C1593b();
            f6760c = c1593b;
            c1593b.mo2219a(sy.f7116d, null, null);
            c1593b.f6753e.f7159a = false;
        }

        private C1593b() {
        }

        public static C1593b m6137a(ry ryVar) {
            return (C1593b) sq.m6117a(f6760c, ryVar);
        }

        public final C1597b m6139a() {
            return this.f6762a == null ? C1597b.m6159b() : this.f6762a;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            switch (nv.f6764a[i - 1]) {
                case 1:
                    return new C1593b();
                case 2:
                    return f6760c;
                case 3:
                    return null;
                case 4:
                    return new C1592a();
                case 5:
                    sz szVar = (sz) obj;
                    C1593b c1593b = (C1593b) obj2;
                    this.f6762a = (C1597b) szVar.mo2279a(this.f6762a, c1593b.f6762a);
                    this.f6763b = (C1624b) szVar.mo2279a(this.f6763b, c1593b.f6763b);
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
                                    b = (byte) 1;
                                    break;
                                case 10:
                                    if (this.f6762a != null) {
                                        sqVar = this.f6762a;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1596a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6762a = (C1597b) siVar.mo2249a(C1597b.m6159b(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6762a);
                                    this.f6762a = (C1597b) srVar2.m6103d();
                                    break;
                                case 18:
                                    if (this.f6763b != null) {
                                        sqVar = this.f6763b;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1623a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6763b = (C1624b) siVar.mo2249a(C1624b.m6266b(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6763b);
                                    this.f6763b = (C1624b) srVar2.m6103d();
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
                    if (f6761g == null) {
                        synchronized (C1593b.class) {
                            if (f6761g == null) {
                                f6761g = new ss(f6760c);
                            }
                        }
                    }
                    return f6761g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6760c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6762a != null) {
                skVar.mo2266a(1, this.f6762a == null ? C1597b.m6159b() : this.f6762a);
            }
            if (this.f6763b != null) {
                skVar.mo2266a(2, this.f6763b == null ? C1624b.m6266b() : this.f6763b);
            }
        }

        public final C1624b m6142b() {
            return this.f6763b == null ? C1624b.m6266b() : this.f6763b;
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6762a != null) {
                    i = sk.m6586b(1, this.f6762a == null ? C1597b.m6159b() : this.f6762a) + 0;
                }
                if (this.f6763b != null) {
                    i += sk.m6586b(2, this.f6763b == null ? C1624b.m6266b() : this.f6763b);
                }
                this.f = i;
            }
            return i;
        }
    }
}
