package com.bumptech.glide.load.resource.p054d;

import com.bumptech.glide.load.p044b.C1241l;

public final class C1359b implements C1241l<C1358a> {
    private final C1358a f3812a;

    public C1359b(C1358a c1358a) {
        if (c1358a == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f3812a = c1358a;
    }

    public final /* bridge */ /* synthetic */ Object mo1367a() {
        return this.f3812a;
    }

    public final int mo1368b() {
        C1358a c1358a = this.f3812a;
        return c1358a.f3811b != null ? c1358a.f3811b.mo1368b() : c1358a.f3810a.mo1368b();
    }

    public final void mo1369c() {
        C1241l c1241l = this.f3812a.f3811b;
        if (c1241l != null) {
            c1241l.mo1369c();
        }
        c1241l = this.f3812a.f3810a;
        if (c1241l != null) {
            c1241l.mo1369c();
        }
    }
}
