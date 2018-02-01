package com.bumptech.glide.load.resource.p054d;

import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p049c.C1289g;
import java.io.InputStream;

public final class C1364e implements C1301e<InputStream, C1358a> {
    private final C1301e<C1289g, C1358a> f3824a;

    public C1364e(C1301e<C1289g, C1358a> c1301e) {
        this.f3824a = c1301e;
    }

    public final /* synthetic */ C1241l mo1381a(Object obj, int i, int i2) {
        return this.f3824a.mo1381a(new C1289g((InputStream) obj, null), i, i2);
    }

    public final String mo1382a() {
        return this.f3824a.mo1382a();
    }
}
