package com.bumptech.glide.load.resource.p053c;

import com.bumptech.glide.load.resource.p040a.C1303a;
import com.bumptech.glide.p042h.C1163h;

public final class C1344d extends C1303a<C1342b> {
    public C1344d(C1342b c1342b) {
        super(c1342b);
    }

    public final int mo1368b() {
        return C1163h.m3150a(((C1342b) this.a).f3763a.f3762i) + ((C1342b) this.a).f3763a.f3755b.length;
    }

    public final void mo1369c() {
        ((C1342b) this.a).stop();
        C1342b c1342b = (C1342b) this.a;
        c1342b.f3766d = true;
        c1342b.f3763a.f3761h.mo1345a(c1342b.f3763a.f3762i);
        c1342b.f3765c.m3509a();
        c1342b.f3765c.f3789c = false;
    }
}
