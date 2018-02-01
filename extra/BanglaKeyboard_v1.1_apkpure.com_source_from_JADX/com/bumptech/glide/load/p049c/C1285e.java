package com.bumptech.glide.load.p049c;

import com.bumptech.glide.load.p049c.C1294j.C1292a;
import java.util.Collections;
import java.util.Map;

public interface C1285e {
    @Deprecated
    public static final C1285e f3659a = new C12861();
    public static final C1285e f3660b;

    static class C12861 implements C1285e {
        C12861() {
        }

        public final Map<String, String> mo1375a() {
            return Collections.emptyMap();
        }
    }

    static {
        C1292a c1292a = new C1292a();
        c1292a.f3672a = true;
        f3660b = new C1294j(c1292a.f3673b);
    }

    Map<String, String> mo1375a();
}
