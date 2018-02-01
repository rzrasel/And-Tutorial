package com.orange.studio.banglatype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class bx {
    private static int f8285a = -1;
    private static int f8286b = -1;
    private static int f8287c = -1;
    private static int f8288d = -1;
    private static int f8289e = -1;
    private static int f8290f = -1;
    private static int f8291g = -1;
    private static int f8292h = -1;
    private static Random f8293i = new Random();

    private static abstract class C1717a {
        final int f8283a;
        final String f8284b;

        public C1717a(int i, String str) {
            this.f8283a = i;
            this.f8284b = str;
        }

        abstract InterstitialHelperBase mo2406a();
    }

    private static int m7454a(List<C1717a> list, int i) {
        int i2 = 0;
        for (C1717a c1717a : list) {
            if (c1717a.f8283a < 0) {
                i2 += i;
                new StringBuilder().append(c1717a.f8284b).append(" range: ").append(i2 - i).append(" - ").append(i2 - 1).append(", percentage: ").append(i).append(" (").append(c1717a.f8283a).append(")");
            } else {
                i2 += c1717a.f8283a;
                new StringBuilder().append(c1717a.f8284b).append(" range: ").append(i2 - c1717a.f8283a).append(" - ").append(i2 - 1).append(", percentage: ").append(c1717a.f8283a).append(" (").append(c1717a.f8283a).append(")");
            }
        }
        return i2;
    }

    public static InterstitialHelperBase m7455a() {
        InterstitialHelperBase a;
        List<C1717a> arrayList = new ArrayList();
        arrayList.add(new C1717a(f8286b, "AdMob") {
            final InterstitialHelperBase mo2406a() {
                return new C1726h("ca-app-pub-5200108416528402/4988163761");
            }
        });
        new StringBuilder("AdMob enabled, percentage: ").append(f8286b);
        C1717a c1717a;
        if (arrayList.size() > 1) {
            int size = 100 / arrayList.size();
            int nextInt = f8293i.nextInt(m7454a(arrayList, size));
            int i = 0;
            for (C1717a c1717a2 : arrayList) {
                if (c1717a2.f8283a < 0) {
                    i += size;
                    continue;
                } else {
                    i += c1717a2.f8283a;
                    continue;
                }
                if (nextInt < i) {
                    a = c1717a2.mo2406a();
                    break;
                }
            }
            a = null;
        } else if (arrayList.size() == 1) {
            c1717a2 = (C1717a) arrayList.get(0);
            InterstitialHelperBase a2 = c1717a2.mo2406a();
            new StringBuilder("Only one network enabled: ").append(c1717a2.f8284b);
            a = a2;
        } else {
            a = null;
        }
        if (a != null) {
            a.f7917b = true;
        }
        return a;
    }

    static void m7456b() {
    }
}
