package com.google.android.gms.tagmanager;

import java.util.List;

final class C0522d implements C0521h {
    final /* synthetic */ C0517b f2362a;

    C0522d(C0517b c0517b) {
        this.f2362a = c0517b;
    }

    public final void mo1330a(List list) {
        for (C0523e c0523e : list) {
            C0517b c0517b = this.f2362a;
            C0517b c0517b2 = this.f2362a;
            c0517b.m3669b(C0517b.m3663a(c0523e.f2363a, c0523e.f2364b));
        }
        this.f2362a.f2342i.countDown();
    }
}
