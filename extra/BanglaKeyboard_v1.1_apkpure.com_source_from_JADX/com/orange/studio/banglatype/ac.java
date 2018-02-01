package com.orange.studio.banglatype;

import com.bumptech.glide.load.C1145c;
import com.orange.studio.banglatype.al.C1699a;
import com.orange.studio.banglatype.al.C1708b.C1707a;

public final class ac extends al {
    public static final ac f8081a = new C1701b().m7257a();
    private final String f8082k;
    private final String f8083l;
    private final String f8084m;
    private final String f8085n;
    private final C1145c f8086o;
    private final int f8087p;
    private final String f8088q;
    private final C1145c f8089r;
    private final int f8090s;
    private final String f8091t;
    private final C1145c f8092u;
    private final int f8093v;
    private final int f8094w;

    public static abstract class C1700a<T extends ac, B extends C1700a<T, B>> extends C1699a<T, B> {
        private static String f8052i = "DashboardItem.AbstractBuilder";
        private String f8053j = "";
        private String f8054k = "";
        private String f8055l = "";
        private String f8056m;
        private C1145c f8057n;
        private int f8058o;
        private String f8059p;
        private C1145c f8060q;
        private int f8061r;
        private String f8062s;
        private C1145c f8063t;
        private int f8064u;
        private int f8065v;

        public final B m7248a(int i) {
            this.f8065v = i;
            return (C1700a) mo2380b();
        }

        public final B m7249a(String str) {
            this.f8053j = str;
            return (C1700a) mo2380b();
        }

        public final B m7250a(String str, C1145c c1145c) {
            return m7251a(str, c1145c, 0);
        }

        public final B m7251a(String str, C1145c c1145c, int i) {
            this.f8056m = str;
            this.f8057n = c1145c;
            this.f8058o = i;
            return (C1700a) mo2380b();
        }

        public final B m7252b(String str) {
            this.f8054k = str;
            return (C1700a) mo2380b();
        }

        public final B m7253b(String str, C1145c c1145c) {
            return m7256c(str, c1145c, 0);
        }

        public final B m7254b(String str, C1145c c1145c, int i) {
            this.f8059p = str;
            this.f8060q = c1145c;
            this.f8061r = i;
            return (C1700a) mo2380b();
        }

        public final B m7255c(String str) {
            this.f8055l = str;
            return (C1700a) mo2380b();
        }

        public final B m7256c(String str, C1145c c1145c, int i) {
            this.f8062s = str;
            this.f8063t = c1145c;
            this.f8064u = i;
            return (C1700a) mo2380b();
        }
    }

    public static class C1701b extends C1700a<ac, C1701b> {
        private static String f8066i = "DashboardItem.Builder";

        public final ac m7257a() {
            return new ac(this);
        }

        protected final /* bridge */ /* synthetic */ C1699a mo2380b() {
            return this;
        }
    }

    private <T extends ac, B extends C1700a<T, B>> ac(C1700a<T, B> c1700a) {
        super(c1700a);
        this.f8082k = c1700a.f8053j;
        this.f8083l = c1700a.f8054k;
        this.f8084m = c1700a.f8055l;
        this.f8085n = c1700a.f8056m;
        this.f8086o = c1700a.f8057n;
        this.f8087p = c1700a.f8058o;
        this.f8088q = c1700a.f8059p;
        this.f8089r = c1700a.f8060q;
        this.f8090s = c1700a.f8061r;
        this.f8091t = c1700a.f8062s;
        this.f8092u = c1700a.f8063t;
        this.f8093v = c1700a.f8064u;
        this.f8094w = c1700a.f8065v;
    }

    public final CharSequence mo2381b() {
        return this.f8082k;
    }

    public final CharSequence mo2382c() {
        return this.f8083l;
    }

    public final C1707a mo2383d() {
        C1707a c1707a = new C1707a();
        c1707a.f8150a = this;
        c1707a.f8151b = this.f8091t;
        c1707a.f8152c = this.f8092u;
        c1707a.f8157h = this.f8093v;
        c1707a.f8168s |= 1048576;
        c1707a.f8153d = -1;
        return c1707a;
    }

    public final String toString() {
        return getClass().getName() + "[ title: '" + this.f8082k + "', subtitle: '" + this.f8083l + "', description: '" + this.f8084m + ", extending: " + super.toString() + "]";
    }
}
