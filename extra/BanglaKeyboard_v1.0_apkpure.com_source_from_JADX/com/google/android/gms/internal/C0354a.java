package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.WeakHashMap;

public final class C0354a implements C0353h {
    private final Object f876a = new Object();
    private WeakHashMap f877b = new WeakHashMap();
    private ArrayList f878c = new ArrayList();

    private boolean m1612b(ez ezVar) {
        boolean z;
        synchronized (this.f876a) {
            C0356b c0356b = (C0356b) this.f877b.get(ezVar);
            z = c0356b != null && c0356b.m1674d();
        }
        return z;
    }

    public final C0356b m1613a(ak akVar, ez ezVar) {
        C0356b c0356b;
        synchronized (this.f876a) {
            if (m1612b(ezVar)) {
                c0356b = (C0356b) this.f877b.get(ezVar);
            } else {
                c0356b = new C0356b(akVar, ezVar);
                c0356b.m1668a((C0353h) this);
                this.f877b.put(ezVar, c0356b);
                this.f878c.add(c0356b);
            }
        }
        return c0356b;
    }

    public final void mo821a(C0356b c0356b) {
        synchronized (this.f876a) {
            if (!c0356b.m1674d()) {
                this.f878c.remove(c0356b);
            }
        }
    }

    public final void m1615a(ez ezVar) {
        synchronized (this.f876a) {
            C0356b c0356b = (C0356b) this.f877b.get(ezVar);
            if (c0356b != null) {
                c0356b.m1671b();
            }
        }
    }
}
