package com.google.android.gms.internal;

import java.io.IOException;

public final class oz {

    public static final class C1635a extends sq<C1635a, C1633a> implements tn {
        private static final C1635a f6908g;
        private static volatile tp<C1635a> f6909h;
        String f6910a = "";
        ry f6911b = ry.f7068a;
        private int f6912c;

        public static final class C1633a extends sr<C1635a, C1633a> implements tn {
            private C1633a() {
                super(C1635a.f6908g);
            }

            public final C1633a m6313a(C1634b c1634b) {
                m6102c();
                C1635a.m6318a((C1635a) this.a, c1634b);
                return this;
            }

            public final C1633a m6314a(ry ryVar) {
                m6102c();
                C1635a.m6319a((C1635a) this.a, ryVar);
                return this;
            }

            public final C1633a m6315a(String str) {
                m6102c();
                C1635a.m6320a((C1635a) this.a, str);
                return this;
            }
        }

        public enum C1634b implements tb {
            UNKNOWN_KEYMATERIAL(0),
            SYMMETRIC(1),
            ASYMMETRIC_PRIVATE(2),
            ASYMMETRIC_PUBLIC(3),
            REMOTE(4),
            UNRECOGNIZED(-1);
            
            private static final td<C1634b> f6905g = null;
            private final int f6907h;

            static {
                f6905g = new pb();
            }

            private C1634b(int i) {
                this.f6907h = i;
            }

            public static C1634b m6316a(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_KEYMATERIAL;
                    case 1:
                        return SYMMETRIC;
                    case 2:
                        return ASYMMETRIC_PRIVATE;
                    case 3:
                        return ASYMMETRIC_PUBLIC;
                    case 4:
                        return REMOTE;
                    default:
                        return null;
                }
            }

            public final int m6317a() {
                if (this != UNRECOGNIZED) {
                    return this.f6907h;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            sq c1635a = new C1635a();
            f6908g = c1635a;
            c1635a.mo2219a(sy.f7116d, null, null);
            c1635a.f6753e.f7159a = false;
        }

        private C1635a() {
        }

        static /* synthetic */ void m6318a(C1635a c1635a, C1634b c1634b) {
            if (c1634b == null) {
                throw new NullPointerException();
            }
            c1635a.f6912c = c1634b.m6317a();
        }

        static /* synthetic */ void m6319a(C1635a c1635a, ry ryVar) {
            if (ryVar == null) {
                throw new NullPointerException();
            }
            c1635a.f6911b = ryVar;
        }

        static /* synthetic */ void m6320a(C1635a c1635a, String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            c1635a.f6910a = str;
        }

        public static C1633a m6321b() {
            sq sqVar = f6908g;
            sr srVar = (sr) sqVar.mo2219a(sy.f7118f, null, null);
            srVar.m6100a(sqVar);
            return (C1633a) srVar;
        }

        public static C1635a m6322d() {
            return f6908g;
        }

        public final C1634b m6324a() {
            C1634b a = C1634b.m6316a(this.f6912c);
            return a == null ? C1634b.UNRECOGNIZED : a;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            byte b = (byte) 0;
            switch (pa.f6939a[i - 1]) {
                case 1:
                    return new C1635a();
                case 2:
                    return f6908g;
                case 3:
                    return null;
                case 4:
                    return new C1633a();
                case 5:
                    sz szVar = (sz) obj;
                    C1635a c1635a = (C1635a) obj2;
                    this.f6910a = szVar.mo2281a(!this.f6910a.isEmpty(), this.f6910a, !c1635a.f6910a.isEmpty(), c1635a.f6910a);
                    this.f6911b = szVar.mo2277a(this.f6911b != ry.f7068a, this.f6911b, c1635a.f6911b != ry.f7068a, c1635a.f6911b);
                    boolean z2 = this.f6912c != 0;
                    int i2 = this.f6912c;
                    if (c1635a.f6912c == 0) {
                        z = false;
                    }
                    this.f6912c = szVar.mo2276a(z2, i2, z, c1635a.f6912c);
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
                                case 10:
                                    this.f6910a = siVar.mo2254c();
                                    break;
                                case 18:
                                    this.f6911b = siVar.mo2255d();
                                    break;
                                case 24:
                                    this.f6912c = siVar.mo2257e();
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
                    if (f6909h == null) {
                        synchronized (C1635a.class) {
                            if (f6909h == null) {
                                f6909h = new ss(f6908g);
                            }
                        }
                    }
                    return f6909h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6908g;
        }

        public final void mo2220a(sk skVar) {
            if (!this.f6910a.isEmpty()) {
                skVar.mo2270a(this.f6910a);
            }
            if (!this.f6911b.m6527b()) {
                skVar.mo2265a(2, this.f6911b);
            }
            if (this.f6912c != C1634b.UNKNOWN_KEYMATERIAL.m6317a()) {
                skVar.mo2273b(3, this.f6912c);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (!this.f6910a.isEmpty()) {
                    i = sk.m6589c(this.f6910a) + 0;
                }
                if (!this.f6911b.m6527b()) {
                    i += sk.m6585b(2, this.f6911b);
                }
                if (this.f6912c != C1634b.UNKNOWN_KEYMATERIAL.m6317a()) {
                    i += sk.m6591d(3, this.f6912c);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1637b extends sq<C1637b, C1636a> implements tn {
        private static final C1637b f6913c;
        private static volatile tp<C1637b> f6914g;
        String f6915a = "";
        ry f6916b = ry.f7068a;

        public static final class C1636a extends sr<C1637b, C1636a> implements tn {
            private C1636a() {
                super(C1637b.f6913c);
            }
        }

        static {
            sq c1637b = new C1637b();
            f6913c = c1637b;
            c1637b.mo2219a(sy.f7116d, null, null);
            c1637b.f6753e.f7159a = false;
        }

        private C1637b() {
        }

        public static C1637b m6328a() {
            return f6913c;
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            byte b = (byte) 0;
            switch (pa.f6939a[i - 1]) {
                case 1:
                    return new C1637b();
                case 2:
                    return f6913c;
                case 3:
                    return null;
                case 4:
                    return new C1636a();
                case 5:
                    sz szVar = (sz) obj;
                    C1637b c1637b = (C1637b) obj2;
                    this.f6915a = szVar.mo2281a(!this.f6915a.isEmpty(), this.f6915a, !c1637b.f6915a.isEmpty(), c1637b.f6915a);
                    boolean z2 = this.f6916b != ry.f7068a;
                    ry ryVar = this.f6916b;
                    if (c1637b.f6916b == ry.f7068a) {
                        z = false;
                    }
                    this.f6916b = szVar.mo2277a(z2, ryVar, z, c1637b.f6916b);
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
                                case 10:
                                    this.f6915a = siVar.mo2254c();
                                    break;
                                case 18:
                                    this.f6916b = siVar.mo2255d();
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
                    if (f6914g == null) {
                        synchronized (C1637b.class) {
                            if (f6914g == null) {
                                f6914g = new ss(f6913c);
                            }
                        }
                    }
                    return f6914g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6913c;
        }

        public final void mo2220a(sk skVar) {
            if (!this.f6915a.isEmpty()) {
                skVar.mo2270a(this.f6915a);
            }
            if (!this.f6916b.m6527b()) {
                skVar.mo2265a(2, this.f6916b);
            }
        }

        public final int mo2221c() {
            int i = this.f;
            if (i == -1) {
                i = 0;
                if (!this.f6915a.isEmpty()) {
                    i = sk.m6589c(this.f6915a) + 0;
                }
                if (!this.f6916b.m6527b()) {
                    i += sk.m6585b(2, this.f6916b);
                }
                this.f = i;
            }
            return i;
        }
    }

    public static final class C1641c extends sq<C1641c, C1638a> implements tn {
        private static final C1641c f6923g;
        private static volatile tp<C1641c> f6924h;
        int f6925a;
        te<C1640b> f6926b = tq.m6667d();
        private int f6927c;

        public static final class C1638a extends sr<C1641c, C1638a> implements tn {
            private C1638a() {
                super(C1641c.f6923g);
            }
        }

        public static final class C1640b extends sq<C1640b, C1639a> implements tn {
            private static final C1640b f6917h;
            private static volatile tp<C1640b> f6918i;
            C1635a f6919a;
            int f6920b;
            private int f6921c;
            private int f6922g;

            public static final class C1639a extends sr<C1640b, C1639a> implements tn {
                private C1639a() {
                    super(C1640b.f6917h);
                }
            }

            static {
                sq c1640b = new C1640b();
                f6917h = c1640b;
                c1640b.mo2219a(sy.f7116d, null, null);
                c1640b.f6753e.f7159a = false;
            }

            private C1640b() {
            }

            public static C1640b m6333e() {
                return f6917h;
            }

            public final C1635a m6335a() {
                return this.f6919a == null ? C1635a.m6322d() : this.f6919a;
            }

            protected final Object mo2219a(int i, Object obj, Object obj2) {
                boolean z = true;
                switch (pa.f6939a[i - 1]) {
                    case 1:
                        return new C1640b();
                    case 2:
                        return f6917h;
                    case 3:
                        return null;
                    case 4:
                        return new C1639a();
                    case 5:
                        sz szVar = (sz) obj;
                        C1640b c1640b = (C1640b) obj2;
                        this.f6919a = (C1635a) szVar.mo2279a(this.f6919a, c1640b.f6919a);
                        this.f6921c = szVar.mo2276a(this.f6921c != 0, this.f6921c, c1640b.f6921c != 0, c1640b.f6921c);
                        this.f6920b = szVar.mo2276a(this.f6920b != 0, this.f6920b, c1640b.f6920b != 0, c1640b.f6920b);
                        boolean z2 = this.f6922g != 0;
                        int i2 = this.f6922g;
                        if (c1640b.f6922g == 0) {
                            z = false;
                        }
                        this.f6922g = szVar.mo2276a(z2, i2, z, c1640b.f6922g);
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
                                        if (this.f6919a != null) {
                                            sq sqVar = this.f6919a;
                                            sr srVar2 = (sr) sqVar.mo2219a(sy.f7118f, null, null);
                                            srVar2.m6100a(sqVar);
                                            srVar = (C1633a) srVar2;
                                        } else {
                                            srVar = null;
                                        }
                                        this.f6919a = (C1635a) siVar.mo2249a(C1635a.m6322d(), smVar);
                                        if (srVar == null) {
                                            break;
                                        }
                                        srVar.m6100a(this.f6919a);
                                        this.f6919a = (C1635a) srVar.m6103d();
                                        break;
                                    case 16:
                                        this.f6921c = siVar.mo2257e();
                                        break;
                                    case 24:
                                        this.f6920b = siVar.mo2251b();
                                        break;
                                    case 32:
                                        this.f6922g = siVar.mo2257e();
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
                        if (f6918i == null) {
                            synchronized (C1640b.class) {
                                if (f6918i == null) {
                                    f6918i = new ss(f6917h);
                                }
                            }
                        }
                        return f6918i;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f6917h;
            }

            public final void mo2220a(sk skVar) {
                if (this.f6919a != null) {
                    skVar.mo2266a(1, this.f6919a == null ? C1635a.m6322d() : this.f6919a);
                }
                if (this.f6921c != pc.UNKNOWN_STATUS.m6370a()) {
                    skVar.mo2273b(2, this.f6921c);
                }
                if (this.f6920b != 0) {
                    skVar.mo2273b(3, this.f6920b);
                }
                if (this.f6922g != pf.UNKNOWN_PREFIX.m6379a()) {
                    skVar.mo2273b(4, this.f6922g);
                }
            }

            public final pc m6338b() {
                pc a = pc.m6369a(this.f6921c);
                return a == null ? pc.UNRECOGNIZED : a;
            }

            public final int mo2221c() {
                int i = this.f;
                if (i == -1) {
                    i = 0;
                    if (this.f6919a != null) {
                        i = sk.m6586b(1, this.f6919a == null ? C1635a.m6322d() : this.f6919a) + 0;
                    }
                    if (this.f6921c != pc.UNKNOWN_STATUS.m6370a()) {
                        i += sk.m6591d(2, this.f6921c);
                    }
                    if (this.f6920b != 0) {
                        i += sk.m6588c(3, this.f6920b);
                    }
                    if (this.f6922g != pf.UNKNOWN_PREFIX.m6379a()) {
                        i += sk.m6591d(4, this.f6922g);
                    }
                    this.f = i;
                }
                return i;
            }

            public final pf m6340d() {
                pf a = pf.m6378a(this.f6922g);
                return a == null ? pf.UNRECOGNIZED : a;
            }
        }

        static {
            sq c1641c = new C1641c();
            f6923g = c1641c;
            c1641c.mo2219a(sy.f7116d, null, null);
            c1641c.f6753e.f7159a = false;
        }

        private C1641c() {
        }

        public static C1641c m6342a(byte[] bArr) {
            return (C1641c) sq.m6120a(f6923g, bArr);
        }

        protected final Object mo2219a(int i, Object obj, Object obj2) {
            boolean z = true;
            byte b = (byte) 0;
            switch (pa.f6939a[i - 1]) {
                case 1:
                    return new C1641c();
                case 2:
                    return f6923g;
                case 3:
                    this.f6926b.mo2236b();
                    return null;
                case 4:
                    return new C1638a();
                case 5:
                    sz szVar = (sz) obj;
                    C1641c c1641c = (C1641c) obj2;
                    boolean z2 = this.f6925a != 0;
                    int i2 = this.f6925a;
                    if (c1641c.f6925a == 0) {
                        z = false;
                    }
                    this.f6925a = szVar.mo2276a(z2, i2, z, c1641c.f6925a);
                    this.f6926b = szVar.mo2278a(this.f6926b, c1641c.f6926b);
                    if (szVar != sx.f7112a) {
                        return this;
                    }
                    this.f6927c |= c1641c.f6927c;
                    return this;
                case 6:
                    si siVar = (si) obj;
                    sm smVar = (sm) obj2;
                    while (b == (byte) 0) {
                        try {
                            int a = siVar.mo2248a();
                            switch (a) {
                                case 0:
                                    b = (byte) 1;
                                    break;
                                case 8:
                                    this.f6925a = siVar.mo2251b();
                                    break;
                                case 18:
                                    if (!this.f6926b.mo2235a()) {
                                        te teVar = this.f6926b;
                                        a = teVar.size();
                                        this.f6926b = teVar.mo2284a(a == 0 ? 10 : a << 1);
                                    }
                                    this.f6926b.add((C1640b) siVar.mo2249a(C1640b.m6333e(), smVar));
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
                    if (f6924h == null) {
                        synchronized (C1641c.class) {
                            if (f6924h == null) {
                                f6924h = new ss(f6923g);
                            }
                        }
                    }
                    return f6924h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f6923g;
        }

        public final void mo2220a(sk skVar) {
            if (this.f6925a != 0) {
                skVar.mo2273b(1, this.f6925a);
            }
            for (int i = 0; i < this.f6926b.size(); i++) {
                skVar.mo2266a(2, (tl) this.f6926b.get(i));
            }
        }

        public final int mo2221c() {
            int i = 0;
            int i2 = this.f;
            if (i2 == -1) {
                i2 = this.f6925a != 0 ? sk.m6588c(1, this.f6925a) + 0 : 0;
                while (i < this.f6926b.size()) {
                    i++;
                    i2 = sk.m6586b(2, (tl) this.f6926b.get(i)) + i2;
                }
                this.f = i2;
            }
            return i2;
        }
    }

    public static final class C1645d extends sq<C1645d, C1642a> implements tn {
        private static final C1645d f6934g;
        private static volatile tp<C1645d> f6935h;
        private int f6936a;
        private int f6937b;
        private te<C1644b> f6938c;

        public static final class C1642a extends sr<C1645d, C1642a> implements tn {
            private C1642a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r1 = this;
                r0 = com.google.android.gms.internal.oz.C1645d.m6365b();
                r1.<init>(r0);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a.<init>():void");
            }

            /* synthetic */ C1642a(byte r1) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r0 = this;
                r0.<init>();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a.<init>(byte):void");
            }

            public final com.google.android.gms.internal.oz.C1645d.C1642a m6346a(int r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r1 = this;
                r1.m6102c();
                r0 = r1.a;
                r0 = (com.google.android.gms.internal.oz.C1645d) r0;
                com.google.android.gms.internal.oz.C1645d.m6363a(r0, r2);
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a.a(int):com.google.android.gms.internal.oz$d$a");
            }

            public final com.google.android.gms.internal.oz.C1645d.C1642a m6347a(com.google.android.gms.internal.oz.C1645d.C1644b r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r1 = this;
                r1.m6102c();
                r0 = r1.a;
                r0 = (com.google.android.gms.internal.oz.C1645d) r0;
                com.google.android.gms.internal.oz.C1645d.m6364a(r0, r2);
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a.a(com.google.android.gms.internal.oz$d$b):com.google.android.gms.internal.oz$d$a");
            }
        }

        public static final class C1644b extends sq<C1644b, C1643a> implements tn {
            private static final C1644b f6928h;
            private static volatile tp<C1644b> f6929i;
            private String f6930a;
            private int f6931b;
            private int f6932c;
            private int f6933g;

            public static final class C1643a extends sr<C1644b, C1643a> implements tn {
                private C1643a() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                    /*
                    r1 = this;
                    r0 = com.google.android.gms.internal.oz.C1645d.C1644b.m6358d();
                    r1.<init>(r0);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a.<init>():void");
                }

                /* synthetic */ C1643a(byte r1) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                    /*
                    r0 = this;
                    r0.<init>();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a.<init>(byte):void");
                }

                public final com.google.android.gms.internal.oz.C1645d.C1644b.C1643a m6348a(int r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                    /*
                    r1 = this;
                    r1.m6102c();
                    r0 = r1.a;
                    r0 = (com.google.android.gms.internal.oz.C1645d.C1644b) r0;
                    com.google.android.gms.internal.oz.C1645d.C1644b.m6353a(r0, r2);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a.a(int):com.google.android.gms.internal.oz$d$b$a");
                }

                public final com.google.android.gms.internal.oz.C1645d.C1644b.C1643a m6349a(com.google.android.gms.internal.pc r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                    /*
                    r1 = this;
                    r1.m6102c();
                    r0 = r1.a;
                    r0 = (com.google.android.gms.internal.oz.C1645d.C1644b) r0;
                    com.google.android.gms.internal.oz.C1645d.C1644b.m6354a(r0, r2);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a.a(com.google.android.gms.internal.pc):com.google.android.gms.internal.oz$d$b$a");
                }

                public final com.google.android.gms.internal.oz.C1645d.C1644b.C1643a m6350a(com.google.android.gms.internal.pf r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                    /*
                    r1 = this;
                    r1.m6102c();
                    r0 = r1.a;
                    r0 = (com.google.android.gms.internal.oz.C1645d.C1644b) r0;
                    com.google.android.gms.internal.oz.C1645d.C1644b.m6355a(r0, r2);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a.a(com.google.android.gms.internal.pf):com.google.android.gms.internal.oz$d$b$a");
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final com.google.android.gms.internal.oz.C1645d.C1644b.C1643a m6351a(java.lang.String r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                    /*
                    r1 = this;
                    r1.m6102c();
                    r0 = r1.a;
                    r0 = (com.google.android.gms.internal.oz.C1645d.C1644b) r0;
                    com.google.android.gms.internal.oz.C1645d.C1644b.m6356a(r0, r2);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a.a(java.lang.String):com.google.android.gms.internal.oz$d$b$a");
                }
            }

            static {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r2 = 0;
                r0 = new com.google.android.gms.internal.oz$d$b;
                r0.<init>();
                f6928h = r0;
                r1 = com.google.android.gms.internal.sy.f7116d;
                r0.mo2219a(r1, r2, r2);
                r0 = r0.f6753e;
                r1 = 0;
                r0.f7159a = r1;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.<clinit>():void");
            }

            private C1644b() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r1 = this;
                r1.<init>();
                r0 = "";
                r1.f6930a = r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.<init>():void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static com.google.android.gms.internal.oz.C1645d.C1644b.C1643a m6352a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r2 = null;
                r1 = f6928h;
                r0 = com.google.android.gms.internal.sy.f7118f;
                r0 = r1.mo2219a(r0, r2, r2);
                r0 = (com.google.android.gms.internal.sr) r0;
                r0.m6100a(r1);
                r0 = (com.google.android.gms.internal.sr) r0;
                r0 = (com.google.android.gms.internal.oz.C1645d.C1644b.C1643a) r0;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a():com.google.android.gms.internal.oz$d$b$a");
            }

            static /* synthetic */ void m6353a(com.google.android.gms.internal.oz.C1645d.C1644b r0, int r1) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r0.f6932c = r1;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a(com.google.android.gms.internal.oz$d$b, int):void");
            }

            static /* synthetic */ void m6354a(com.google.android.gms.internal.oz.C1645d.C1644b r1, com.google.android.gms.internal.pc r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                if (r2 != 0) goto L_0x0008;
            L_0x0002:
                r0 = new java.lang.NullPointerException;
                r0.<init>();
                throw r0;
            L_0x0008:
                r0 = r2.m6370a();
                r1.f6931b = r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a(com.google.android.gms.internal.oz$d$b, com.google.android.gms.internal.pc):void");
            }

            static /* synthetic */ void m6355a(com.google.android.gms.internal.oz.C1645d.C1644b r1, com.google.android.gms.internal.pf r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                if (r2 != 0) goto L_0x0008;
            L_0x0002:
                r0 = new java.lang.NullPointerException;
                r0.<init>();
                throw r0;
            L_0x0008:
                r0 = r2.m6379a();
                r1.f6933g = r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a(com.google.android.gms.internal.oz$d$b, com.google.android.gms.internal.pf):void");
            }

            static /* synthetic */ void m6356a(com.google.android.gms.internal.oz.C1645d.C1644b r1, java.lang.String r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                if (r2 != 0) goto L_0x0008;
            L_0x0002:
                r0 = new java.lang.NullPointerException;
                r0.<init>();
                throw r0;
            L_0x0008:
                r1.f6930a = r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a(com.google.android.gms.internal.oz$d$b, java.lang.String):void");
            }

            public static com.google.android.gms.internal.oz.C1645d.C1644b m6357b() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r0 = f6928h;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.b():com.google.android.gms.internal.oz$d$b");
            }

            static /* synthetic */ com.google.android.gms.internal.oz.C1645d.C1644b m6358d() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r0 = f6928h;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.d():com.google.android.gms.internal.oz$d$b");
            }

            protected final java.lang.Object mo2219a(int r7, java.lang.Object r8, java.lang.Object r9) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r6 = this;
                r1 = 1;
                r2 = 0;
                r0 = com.google.android.gms.internal.pa.f6939a;
                r3 = r7 + -1;
                r0 = r0[r3];
                switch(r0) {
                    case 1: goto L_0x0011;
                    case 2: goto L_0x0017;
                    case 3: goto L_0x001a;
                    case 4: goto L_0x001c;
                    case 5: goto L_0x0022;
                    case 6: goto L_0x008e;
                    case 7: goto L_0x00dc;
                    case 8: goto L_0x00e0;
                    default: goto L_0x000b;
                };
            L_0x000b:
                r0 = new java.lang.UnsupportedOperationException;
                r0.<init>();
                throw r0;
            L_0x0011:
                r6 = new com.google.android.gms.internal.oz$d$b;
                r6.<init>();
            L_0x0016:
                return r6;
            L_0x0017:
                r6 = f6928h;
                goto L_0x0016;
            L_0x001a:
                r6 = 0;
                goto L_0x0016;
            L_0x001c:
                r6 = new com.google.android.gms.internal.oz$d$b$a;
                r6.<init>(r2);
                goto L_0x0016;
            L_0x0022:
                r8 = (com.google.android.gms.internal.sz) r8;
                r9 = (com.google.android.gms.internal.oz.C1645d.C1644b) r9;
                r0 = r6.f6930a;
                r0 = r0.isEmpty();
                if (r0 != 0) goto L_0x007e;
            L_0x002e:
                r0 = r1;
            L_0x002f:
                r4 = r6.f6930a;
                r3 = r9.f6930a;
                r3 = r3.isEmpty();
                if (r3 != 0) goto L_0x0080;
            L_0x0039:
                r3 = r1;
            L_0x003a:
                r5 = r9.f6930a;
                r0 = r8.mo2281a(r0, r4, r3, r5);
                r6.f6930a = r0;
                r0 = r6.f6931b;
                if (r0 == 0) goto L_0x0082;
            L_0x0046:
                r0 = r1;
            L_0x0047:
                r4 = r6.f6931b;
                r3 = r9.f6931b;
                if (r3 == 0) goto L_0x0084;
            L_0x004d:
                r3 = r1;
            L_0x004e:
                r5 = r9.f6931b;
                r0 = r8.mo2276a(r0, r4, r3, r5);
                r6.f6931b = r0;
                r0 = r6.f6932c;
                if (r0 == 0) goto L_0x0086;
            L_0x005a:
                r0 = r1;
            L_0x005b:
                r4 = r6.f6932c;
                r3 = r9.f6932c;
                if (r3 == 0) goto L_0x0088;
            L_0x0061:
                r3 = r1;
            L_0x0062:
                r5 = r9.f6932c;
                r0 = r8.mo2276a(r0, r4, r3, r5);
                r6.f6932c = r0;
                r0 = r6.f6933g;
                if (r0 == 0) goto L_0x008a;
            L_0x006e:
                r0 = r1;
            L_0x006f:
                r3 = r6.f6933g;
                r4 = r9.f6933g;
                if (r4 == 0) goto L_0x008c;
            L_0x0075:
                r2 = r9.f6933g;
                r0 = r8.mo2276a(r0, r3, r1, r2);
                r6.f6933g = r0;
                goto L_0x0016;
            L_0x007e:
                r0 = r2;
                goto L_0x002f;
            L_0x0080:
                r3 = r2;
                goto L_0x003a;
            L_0x0082:
                r0 = r2;
                goto L_0x0047;
            L_0x0084:
                r3 = r2;
                goto L_0x004e;
            L_0x0086:
                r0 = r2;
                goto L_0x005b;
            L_0x0088:
                r3 = r2;
                goto L_0x0062;
            L_0x008a:
                r0 = r2;
                goto L_0x006f;
            L_0x008c:
                r1 = r2;
                goto L_0x0075;
            L_0x008e:
                r8 = (com.google.android.gms.internal.si) r8;
            L_0x0090:
                if (r2 != 0) goto L_0x00dc;
            L_0x0092:
                r0 = r8.mo2248a();	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                switch(r0) {
                    case 0: goto L_0x00a1;
                    case 10: goto L_0x00a3;
                    case 16: goto L_0x00b5;
                    case 24: goto L_0x00ce;
                    case 32: goto L_0x00d5;
                    default: goto L_0x0099;
                };	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
            L_0x0099:
                r0 = r8.mo2252b(r0);	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                if (r0 != 0) goto L_0x0090;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
            L_0x009f:
                r2 = r1;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                goto L_0x0090;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
            L_0x00a1:
                r2 = r1;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                goto L_0x0090;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
            L_0x00a3:
                r0 = r8.mo2254c();	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r6.f6930a = r0;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                goto L_0x0090;
            L_0x00aa:
                r0 = move-exception;
                r1 = new java.lang.RuntimeException;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r0.f7130a = r6;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r1.<init>(r0);	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                throw r1;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
            L_0x00b3:
                r0 = move-exception;
                throw r0;
            L_0x00b5:
                r0 = r8.mo2257e();	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r6.f6931b = r0;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                goto L_0x0090;
            L_0x00bc:
                r0 = move-exception;
                r1 = new java.lang.RuntimeException;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r2 = new com.google.android.gms.internal.tf;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r0 = r0.getMessage();	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r2.<init>(r0);	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r2.f7130a = r6;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r1.<init>(r2);	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                throw r1;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
            L_0x00ce:
                r0 = r8.mo2251b();	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r6.f6932c = r0;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                goto L_0x0090;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
            L_0x00d5:
                r0 = r8.mo2257e();	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                r6.f6933g = r0;	 Catch:{ tf -> 0x00aa, IOException -> 0x00bc, tf -> 0x00aa, IOException -> 0x00bc }
                goto L_0x0090;
            L_0x00dc:
                r6 = f6928h;
                goto L_0x0016;
            L_0x00e0:
                r0 = f6929i;
                if (r0 != 0) goto L_0x00f5;
            L_0x00e4:
                r1 = com.google.android.gms.internal.oz.C1645d.C1644b.class;
                monitor-enter(r1);
                r0 = f6929i;
                if (r0 != 0) goto L_0x00f4;
            L_0x00eb:
                r0 = new com.google.android.gms.internal.ss;
                r2 = f6928h;
                r0.<init>(r2);
                f6929i = r0;
            L_0x00f4:
                monitor-exit(r1);
            L_0x00f5:
                r6 = f6929i;
                goto L_0x0016;
            L_0x00f9:
                r0 = move-exception;
                monitor-exit(r1);
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }

            public final void mo2220a(com.google.android.gms.internal.sk r3) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r2 = this;
                r0 = r2.f6930a;
                r0 = r0.isEmpty();
                if (r0 != 0) goto L_0x000d;
            L_0x0008:
                r0 = r2.f6930a;
                r3.mo2270a(r0);
            L_0x000d:
                r0 = r2.f6931b;
                r1 = com.google.android.gms.internal.pc.UNKNOWN_STATUS;
                r1 = r1.m6370a();
                if (r0 == r1) goto L_0x001d;
            L_0x0017:
                r0 = r2.f6931b;
                r1 = 2;
                r3.mo2273b(r1, r0);
            L_0x001d:
                r0 = r2.f6932c;
                if (r0 == 0) goto L_0x0027;
            L_0x0021:
                r0 = 3;
                r1 = r2.f6932c;
                r3.mo2273b(r0, r1);
            L_0x0027:
                r0 = r2.f6933g;
                r1 = com.google.android.gms.internal.pf.UNKNOWN_PREFIX;
                r1 = r1.m6379a();
                if (r0 == r1) goto L_0x0037;
            L_0x0031:
                r0 = r2.f6933g;
                r1 = 4;
                r3.mo2273b(r1, r0);
            L_0x0037:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.a(com.google.android.gms.internal.sk):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int mo2221c() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                /*
                r3 = this;
                r0 = r3.f;
                r1 = -1;
                if (r0 == r1) goto L_0x0006;
            L_0x0005:
                return r0;
            L_0x0006:
                r0 = null;
                r1 = r3.f6930a;
                r1 = r1.isEmpty();
                if (r1 != null) goto L_0x0017;
            L_0x000f:
                r0 = r3.f6930a;
                r0 = com.google.android.gms.internal.sk.m6589c(r0);
                r0 = r0 + 0;
            L_0x0017:
                r1 = r3.f6931b;
                r2 = com.google.android.gms.internal.pc.UNKNOWN_STATUS;
                r2 = r2.m6370a();
                if (r1 == r2) goto L_0x0029;
            L_0x0021:
                r1 = 2;
                r2 = r3.f6931b;
                r1 = com.google.android.gms.internal.sk.m6591d(r1, r2);
                r0 = r0 + r1;
            L_0x0029:
                r1 = r3.f6932c;
                if (r1 == null) goto L_0x0035;
            L_0x002d:
                r1 = 3;
                r2 = r3.f6932c;
                r1 = com.google.android.gms.internal.sk.m6588c(r1, r2);
                r0 = r0 + r1;
            L_0x0035:
                r1 = r3.f6933g;
                r2 = com.google.android.gms.internal.pf.UNKNOWN_PREFIX;
                r2 = r2.m6379a();
                if (r1 == r2) goto L_0x0047;
            L_0x003f:
                r1 = 4;
                r2 = r3.f6933g;
                r1 = com.google.android.gms.internal.sk.m6591d(r1, r2);
                r0 = r0 + r1;
            L_0x0047:
                r3.f = r0;
                goto L_0x0005;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b.c():int");
            }
        }

        static {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r2 = 0;
            r0 = new com.google.android.gms.internal.oz$d;
            r0.<init>();
            f6934g = r0;
            r1 = com.google.android.gms.internal.sy.f7116d;
            r0.mo2219a(r1, r2, r2);
            r0 = r0.f6753e;
            r1 = 0;
            r0.f7159a = r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.<clinit>():void");
        }

        private C1645d() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r1 = this;
            r1.<init>();
            r0 = com.google.android.gms.internal.tq.m6667d();
            r1.f6938c = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.<init>():void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.gms.internal.oz.C1645d.C1642a m6362a() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r2 = null;
            r1 = f6934g;
            r0 = com.google.android.gms.internal.sy.f7118f;
            r0 = r1.mo2219a(r0, r2, r2);
            r0 = (com.google.android.gms.internal.sr) r0;
            r0.m6100a(r1);
            r0 = (com.google.android.gms.internal.sr) r0;
            r0 = (com.google.android.gms.internal.oz.C1645d.C1642a) r0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a():com.google.android.gms.internal.oz$d$a");
        }

        static /* synthetic */ void m6363a(com.google.android.gms.internal.oz.C1645d r0, int r1) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0.f6937b = r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a(com.google.android.gms.internal.oz$d, int):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ void m6364a(com.google.android.gms.internal.oz.C1645d r2, com.google.android.gms.internal.oz.C1645d.C1644b r3) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            if (r3 != null) goto L_0x0008;
        L_0x0002:
            r0 = new java.lang.NullPointerException;
            r0.<init>();
            throw r0;
        L_0x0008:
            r0 = r2.f6938c;
            r0 = r0.mo2235a();
            if (r0 != null) goto L_0x0020;
        L_0x0010:
            r1 = r2.f6938c;
            r0 = r1.size();
            if (r0 != null) goto L_0x0026;
        L_0x0018:
            r0 = 10;
        L_0x001a:
            r0 = r1.mo2284a(r0);
            r2.f6938c = r0;
        L_0x0020:
            r0 = r2.f6938c;
            r0.add(r3);
            return;
        L_0x0026:
            r0 = r0 << 1;
            goto L_0x001a;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a(com.google.android.gms.internal.oz$d, com.google.android.gms.internal.oz$d$b):void");
        }

        static /* synthetic */ com.google.android.gms.internal.oz.C1645d m6365b() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = f6934g;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.b():com.google.android.gms.internal.oz$d");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected final java.lang.Object mo2219a(int r6, java.lang.Object r7, java.lang.Object r8) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r5 = this;
            r1 = 1;
            r2 = null;
            r0 = com.google.android.gms.internal.pa.f6939a;
            r3 = r6 + -1;
            r0 = r0[r3];
            switch(r0) {
                case 1: goto L_0x0011;
                case 2: goto L_0x0017;
                case 3: goto L_0x001a;
                case 4: goto L_0x0021;
                case 5: goto L_0x0027;
                case 6: goto L_0x0058;
                case 7: goto L_0x00be;
                case 8: goto L_0x00c2;
                default: goto L_0x000b;
            };
        L_0x000b:
            r0 = new java.lang.UnsupportedOperationException;
            r0.<init>();
            throw r0;
        L_0x0011:
            r5 = new com.google.android.gms.internal.oz$d;
            r5.<init>();
        L_0x0016:
            return r5;
        L_0x0017:
            r5 = f6934g;
            goto L_0x0016;
        L_0x001a:
            r0 = r5.f6938c;
            r0.mo2236b();
            r5 = null;
            goto L_0x0016;
        L_0x0021:
            r5 = new com.google.android.gms.internal.oz$d$a;
            r5.<init>(r2);
            goto L_0x0016;
        L_0x0027:
            r7 = (com.google.android.gms.internal.sz) r7;
            r8 = (com.google.android.gms.internal.oz.C1645d) r8;
            r0 = r5.f6937b;
            if (r0 == null) goto L_0x0054;
        L_0x002f:
            r0 = r1;
        L_0x0030:
            r3 = r5.f6937b;
            r4 = r8.f6937b;
            if (r4 == null) goto L_0x0056;
        L_0x0036:
            r2 = r8.f6937b;
            r0 = r7.mo2276a(r0, r3, r1, r2);
            r5.f6937b = r0;
            r0 = r5.f6938c;
            r1 = r8.f6938c;
            r0 = r7.mo2278a(r0, r1);
            r5.f6938c = r0;
            r0 = com.google.android.gms.internal.sx.f7112a;
            if (r7 != r0) goto L_0x0016;
        L_0x004c:
            r0 = r5.f6936a;
            r1 = r8.f6936a;
            r0 = r0 | r1;
            r5.f6936a = r0;
            goto L_0x0016;
        L_0x0054:
            r0 = r2;
            goto L_0x0030;
        L_0x0056:
            r1 = r2;
            goto L_0x0036;
        L_0x0058:
            r7 = (com.google.android.gms.internal.si) r7;
            r8 = (com.google.android.gms.internal.sm) r8;
        L_0x005c:
            if (r2 != null) goto L_0x00be;
        L_0x005e:
            r0 = r7.mo2248a();	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            switch(r0) {
                case 0: goto L_0x006d;
                case 8: goto L_0x006f;
                case 18: goto L_0x0081;
                default: goto L_0x0065;
            };	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x0065:
            r0 = r7.mo2252b(r0);	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            if (r0 != null) goto L_0x005c;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x006b:
            r2 = r1;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            goto L_0x005c;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x006d:
            r2 = r1;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            goto L_0x005c;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x006f:
            r0 = r7.mo2251b();	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r5.f6937b = r0;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            goto L_0x005c;
        L_0x0076:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r0.f7130a = r5;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r1.<init>(r0);	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            throw r1;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x007f:
            r0 = move-exception;
            throw r0;
        L_0x0081:
            r0 = r5.f6938c;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r0 = r0.mo2235a();	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            if (r0 != null) goto L_0x0099;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x0089:
            r3 = r5.f6938c;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r0 = r3.size();	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            if (r0 != null) goto L_0x00bb;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x0091:
            r0 = 10;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x0093:
            r0 = r3.mo2284a(r0);	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r5.f6938c = r0;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x0099:
            r3 = r5.f6938c;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r0 = com.google.android.gms.internal.oz.C1645d.C1644b.m6357b();	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r0 = r7.mo2249a(r0, r8);	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r0 = (com.google.android.gms.internal.oz.C1645d.C1644b) r0;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r3.add(r0);	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            goto L_0x005c;
        L_0x00a9:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r2 = new com.google.android.gms.internal.tf;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r0 = r0.getMessage();	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r2.<init>(r0);	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r2.f7130a = r5;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            r1.<init>(r2);	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
            throw r1;	 Catch:{ tf -> 0x0076, IOException -> 0x00a9, tf -> 0x0076, IOException -> 0x00a9 }
        L_0x00bb:
            r0 = r0 << 1;
            goto L_0x0093;
        L_0x00be:
            r5 = f6934g;
            goto L_0x0016;
        L_0x00c2:
            r0 = f6935h;
            if (r0 != null) goto L_0x00d7;
        L_0x00c6:
            r1 = com.google.android.gms.internal.oz.C1645d.class;
            monitor-enter(r1);
            r0 = f6935h;
            if (r0 != null) goto L_0x00d6;
        L_0x00cd:
            r0 = new com.google.android.gms.internal.ss;
            r2 = f6934g;
            r0.<init>(r2);
            f6935h = r0;
        L_0x00d6:
            monitor-exit(r1);
        L_0x00d7:
            r5 = f6935h;
            goto L_0x0016;
        L_0x00db:
            r0 = move-exception;
            monitor-exit(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        public final void mo2220a(com.google.android.gms.internal.sk r4) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            r0 = r3.f6937b;
            if (r0 == 0) goto L_0x000a;
        L_0x0004:
            r0 = 1;
            r1 = r3.f6937b;
            r4.mo2273b(r0, r1);
        L_0x000a:
            r0 = 0;
            r1 = r0;
        L_0x000c:
            r0 = r3.f6938c;
            r0 = r0.size();
            if (r1 >= r0) goto L_0x0024;
        L_0x0014:
            r2 = 2;
            r0 = r3.f6938c;
            r0 = r0.get(r1);
            r0 = (com.google.android.gms.internal.tl) r0;
            r4.mo2266a(r2, r0);
            r0 = r1 + 1;
            r1 = r0;
            goto L_0x000c;
        L_0x0024:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.a(com.google.android.gms.internal.sk):void");
        }

        public final int mo2221c() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r4 = this;
            r1 = 0;
            r2 = r4.f;
            r0 = -1;
            if (r2 == r0) goto L_0x0007;
        L_0x0006:
            return r2;
        L_0x0007:
            r0 = r4.f6937b;
            if (r0 == 0) goto L_0x0032;
        L_0x000b:
            r0 = 1;
            r2 = r4.f6937b;
            r0 = com.google.android.gms.internal.sk.m6588c(r0, r2);
            r0 = r0 + 0;
        L_0x0014:
            r2 = r0;
        L_0x0015:
            r0 = r4.f6938c;
            r0 = r0.size();
            if (r1 >= r0) goto L_0x002f;
        L_0x001d:
            r3 = 2;
            r0 = r4.f6938c;
            r0 = r0.get(r1);
            r0 = (com.google.android.gms.internal.tl) r0;
            r0 = com.google.android.gms.internal.sk.m6586b(r3, r0);
            r0 = r0 + r2;
            r1 = r1 + 1;
            r2 = r0;
            goto L_0x0015;
        L_0x002f:
            r4.f = r2;
            goto L_0x0006;
        L_0x0032:
            r0 = r1;
            goto L_0x0014;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oz.d.c():int");
        }
    }
}
