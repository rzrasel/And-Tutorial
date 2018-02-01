package com.google.android.gms.p007a;

import java.util.Iterator;

final class C0193c implements C0192r {
    final /* synthetic */ C0191b f391a;

    C0193c(C0191b c0191b) {
        this.f391a = c0191b;
    }

    public final void mo663a(C0190a c0190a) {
        this.f391a.f387a = c0190a;
        Iterator it = this.f391a.f389c.iterator();
        while (it.hasNext()) {
            C0194j c0194j = (C0194j) it.next();
            C0190a c0190a2 = this.f391a.f387a;
            c0194j.mo665b();
        }
        this.f391a.f389c.clear();
        this.f391a.f388b = null;
    }
}
