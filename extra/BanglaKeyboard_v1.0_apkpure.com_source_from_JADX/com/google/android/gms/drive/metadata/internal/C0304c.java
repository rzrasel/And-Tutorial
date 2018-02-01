package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.C0294a;
import com.google.android.gms.internal.kh;
import com.google.android.gms.internal.ks;
import com.google.android.gms.internal.kz;
import java.util.HashMap;
import java.util.Map;

public final class C0304c {
    private static Map f660a = new HashMap();

    static {
        C0304c.m1126a(kh.f1887a);
        C0304c.m1126a(kh.f1910x);
        C0304c.m1126a(kh.f1903q);
        C0304c.m1126a(kh.f1908v);
        C0304c.m1126a(kh.f1911y);
        C0304c.m1126a(kh.f1897k);
        C0304c.m1126a(kh.f1898l);
        C0304c.m1126a(kh.f1895i);
        C0304c.m1126a(kh.f1900n);
        C0304c.m1126a(kh.f1906t);
        C0304c.m1126a(kh.f1888b);
        C0304c.m1126a(kh.f1905s);
        C0304c.m1126a(kh.f1889c);
        C0304c.m1126a(kh.f1896j);
        C0304c.m1126a(kh.f1890d);
        C0304c.m1126a(kh.f1891e);
        C0304c.m1126a(kh.f1892f);
        C0304c.m1126a(kh.f1902p);
        C0304c.m1126a(kh.f1899m);
        C0304c.m1126a(kh.f1904r);
        C0304c.m1126a(kh.f1907u);
        C0304c.m1126a(kh.f1912z);
        C0304c.m1126a(kh.f1886A);
        C0304c.m1126a(kh.f1894h);
        C0304c.m1126a(kh.f1893g);
        C0304c.m1126a(kh.f1909w);
        C0304c.m1126a(kh.f1901o);
        C0304c.m1126a(ks.f1921a);
        C0304c.m1126a(ks.f1923c);
        C0304c.m1126a(ks.f1924d);
        C0304c.m1126a(ks.f1925e);
        C0304c.m1126a(ks.f1922b);
        C0304c.m1126a(kz.f1927a);
        C0304c.m1126a(kz.f1928b);
    }

    public static C0294a m1125a(String str) {
        return (C0294a) f660a.get(str);
    }

    private static void m1126a(C0294a c0294a) {
        if (f660a.containsKey(c0294a.mo700a())) {
            throw new IllegalArgumentException("Duplicate field name registered: " + c0294a.mo700a());
        }
        f660a.put(c0294a.mo700a(), c0294a);
    }
}
