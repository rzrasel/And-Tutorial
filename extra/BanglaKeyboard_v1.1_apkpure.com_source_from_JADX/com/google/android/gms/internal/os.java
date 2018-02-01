package com.google.android.gms.internal;

import com.google.android.gms.internal.oz.C1635a;
import com.google.android.gms.internal.oz.C1635a.C1633a;
import com.google.android.gms.internal.oz.C1637b;
import com.google.android.gms.internal.oz.C1637b.C1636a;
import java.io.IOException;

public final class os {

    public static final class C1628a extends sq<C1628a, C1627a> implements tn {
        private static final C1628a f6879c;
        private static volatile tp<C1628a> f6880g;
        int f6881a;
        private C1632c f6882b;

        public static final class C1627a extends sr<C1628a, C1627a> implements tn {
            private C1627a() {
                super(C1628a.f6879c);
            }

            public final C1627a m6284a() {
                m6102c();
                ((C1628a) this.a).f6881a = 0;
                return this;
            }

            public final C1627a m6285a(C1632c c1632c) {
                m6102c();
                C1628a.m6288a((C1628a) this.a, c1632c);
                return this;
            }
        }

        static {
            sq c1628a = new C1628a();
            f6879c = c1628a;
            c1628a.mo2219a(sy.f7116d, null, null);
            c1628a.f6753e.f7159a = false;
        }

        private C1628a() {
        }

        public static C1628a m6286a(ry ryVar) {
            return (C1628a) sq.m6117a(f6879c, ryVar);
        }

        static /* synthetic */ void m6288a(C1628a c1628a, C1632c c1632c) {
            if (c1632c == null) {
                throw new NullPointerException();
            }
            c1628a.f6882b = c1632c;
        }

        public static C1627a m6289b() {
            sq sqVar = f6879c;
            sr srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
            srVar.m6100a(sqVar);
            return (C1627a) srVar;
        }

        public final C1632c m6291a() {
            return this.f6882b == null ? C1632c.m6300a() : this.f6882b;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            switch (ot.f6890a[i - 1]) {
                case 1:
                    return new C1628a();
                case 2:
                    return f6879c;
                case 3:
                    return null;
                case 4:
                    return new C1627a();
                case 5:
                    sz szVar = (sz) obj;
                    C1628a c1628a = (C1628a) obj2;
                    boolean z2 = this.f6881a != 0;
                    int i2 = this.f6881a;
                    if (c1628a.f6881a == 0) {
                        z = false;
                    }
                    this.f6881a = szVar.mo2276a(z2, i2, z, c1628a.f6881a);
                    this.f6882b = (C1632c) szVar.mo2279a(this.f6882b, c1628a.f6882b);
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
                                    this.f6881a = siVar.mo2251b();
                                    break;
                                case 18:
                                    sr srVar;
                                    if (this.f6882b != null) {
                                        sq sqVar = this.f6882b;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1631a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6882b = (C1632c) siVar.mo2249a(C1632c.m6300a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6882b);
                                    this.f6882b = (C1632c) srVar.m6103d();
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
                    if (f6880g == null) {
                        synchronized (C1628a.class) {
                            if (f6880g == null) {
                                f6880g = new ss(f6879c);
                            }
                        }
                    }
                    return f6880g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6879c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6881a != 0) {
                skVar.mo2273b(1, this.f6881a);
            }
            if (this.f6882b != null) {
                skVar.mo2266a(2, this.f6882b == null ? C1632c.m6300a() : this.f6882b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6881a != 0) {
                    i = sk.m6588c(1, this.f6881a) + 0;
                }
                if (this.f6882b != null) {
                    i += sk.m6586b(2, this.f6882b == null ? C1632c.m6300a() : this.f6882b);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1630b extends sq<C1630b, C1629a> implements tn {
        private static final C1630b f6883b;
        private static volatile tp<C1630b> f6884c;
        C1632c f6885a;

        public static final class C1629a extends sr<C1630b, C1629a> implements tn {
            private C1629a() {
                super(C1630b.f6883b);
            }
        }

        static {
            sq c1630b = new C1630b();
            f6883b = c1630b;
            c1630b.mo2219a(sy.f7116d, null, null);
            c1630b.f6753e.f7159a = false;
        }

        private C1630b() {
        }

        public static C1630b m6296a(ry ryVar) {
            return (C1630b) sq.m6117a(f6883b, ryVar);
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            switch (ot.f6890a[i - 1]) {
                case 1:
                    return new C1630b();
                case 2:
                    return f6883b;
                case 3:
                    return null;
                case 4:
                    return new C1629a();
                case 5:
                    this.f6885a = (C1632c) ((sz) obj).mo2279a(this.f6885a, ((C1630b) obj2).f6885a);
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
                                case 10:
                                    sr srVar;
                                    if (this.f6885a != null) {
                                        sq sqVar = this.f6885a;
                                        sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar2.m6100a(sqVar);
                                        srVar = (C1631a) srVar2;
                                    } else {
                                        srVar = null;
                                    }
                                    this.f6885a = (C1632c) siVar.mo2249a(C1632c.m6300a(), smVar);
                                    if (srVar == null) {
                                        break;
                                    }
                                    srVar.m6100a(this.f6885a);
                                    this.f6885a = (C1632c) srVar.m6103d();
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
                    if (f6884c == null) {
                        synchronized (C1630b.class) {
                            if (f6884c == null) {
                                f6884c = new ss(f6883b);
                            }
                        }
                    }
                    return f6884c;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6883b;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6885a != null) {
                skVar.mo2266a(1, this.f6885a == null ? C1632c.m6300a() : this.f6885a);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6885a != null) {
                    i = sk.m6586b(1, this.f6885a == null ? C1632c.m6300a() : this.f6885a) + 0;
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1632c extends sq<C1632c, C1631a> implements tn {
        private static final C1632c f6886c;
        private static volatile tp<C1632c> f6887g;
        C1635a f6888a;
        C1637b f6889b;

        public static final class C1631a extends sr<C1632c, C1631a> implements tn {
            private C1631a() {
                super(C1632c.f6886c);
            }
        }

        static {
            sq c1632c = new C1632c();
            f6886c = c1632c;
            c1632c.mo2219a(sy.f7116d, null, null);
            c1632c.f6753e.f7159a = false;
        }

        private C1632c() {
        }

        public static C1632c m6300a() {
            return f6886c;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            switch (ot.f6890a[i - 1]) {
                case 1:
                    return new C1632c();
                case 2:
                    return f6886c;
                case 3:
                    return null;
                case 4:
                    return new C1631a();
                case 5:
                    sz szVar = (sz) obj;
                    C1632c c1632c = (C1632c) obj2;
                    this.f6888a = (C1635a) szVar.mo2279a(this.f6888a, c1632c.f6888a);
                    this.f6889b = (C1637b) szVar.mo2279a(this.f6889b, c1632c.f6889b);
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
                                    if (this.f6888a != null) {
                                        sqVar = this.f6888a;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1633a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6888a = (C1635a) siVar.mo2249a(C1635a.m6322d(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6888a);
                                    this.f6888a = (C1635a) srVar2.m6103d();
                                    break;
                                case 18:
                                    if (this.f6889b != null) {
                                        sqVar = this.f6889b;
                                        srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                        srVar.m6100a(sqVar);
                                        srVar2 = (C1636a) srVar;
                                    } else {
                                        srVar2 = null;
                                    }
                                    this.f6889b = (C1637b) siVar.mo2249a(C1637b.m6328a(), smVar);
                                    if (srVar2 == null) {
                                        break;
                                    }
                                    srVar2.m6100a(this.f6889b);
                                    this.f6889b = (C1637b) srVar2.m6103d();
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
                    if (f6887g == null) {
                        synchronized (C1632c.class) {
                            if (f6887g == null) {
                                f6887g = new ss(f6886c);
                            }
                        }
                    }
                    return f6887g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6886c;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6888a != null) {
                skVar.mo2266a(1, this.f6888a == null ? C1635a.m6322d() : this.f6888a);
            }
            if (this.f6889b != null) {
                skVar.mo2266a(2, this.f6889b == null ? C1637b.m6328a() : this.f6889b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (this.f6888a != null) {
                    i = sk.m6586b(1, this.f6888a == null ? C1635a.m6322d() : this.f6888a) + 0;
                }
                if (this.f6889b != null) {
                    i += sk.m6586b(2, this.f6889b == null ? C1637b.m6328a() : this.f6889b);
                }
                this.f = i;
            }
            return i;
        }
    }
}
