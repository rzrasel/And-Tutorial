package com.bumptech.glide.manager;

import com.bumptech.glide.p042h.C1163h;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

final class C1376a implements C1375g {
    private final Set<C1102h> f3844a = Collections.newSetFromMap(new WeakHashMap());
    private boolean f3845b;
    private boolean f3846c;

    C1376a() {
    }

    final void m3562a() {
        this.f3845b = true;
        for (C1102h b : C1163h.m3152a(this.f3844a)) {
            b.mo1285b();
        }
    }

    public final void mo1394a(C1102h c1102h) {
        this.f3844a.add(c1102h);
        if (this.f3846c) {
            c1102h.a_();
        } else if (this.f3845b) {
            c1102h.mo1285b();
        } else {
            c1102h.mo1287c();
        }
    }

    final void m3564b() {
        this.f3845b = false;
        for (C1102h c : C1163h.m3152a(this.f3844a)) {
            c.mo1287c();
        }
    }

    final void m3565c() {
        this.f3846c = true;
        for (C1102h a_ : C1163h.m3152a(this.f3844a)) {
            a_.a_();
        }
    }
}
