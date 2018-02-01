package com.bumptech.glide.load.p044b.p045b;

import com.bumptech.glide.load.p044b.p045b.C1200a.C1199a;
import java.io.File;

public class C1206d implements C1199a {
    private final int f3535a = 262144000;
    private final C1205a f3536b;

    public interface C1205a {
        File mo1351a();
    }

    public C1206d(C1205a c1205a) {
        this.f3536b = c1205a;
    }

    public final C1200a mo1350a() {
        File a = this.f3536b.mo1351a();
        return a == null ? null : (a.mkdirs() || (a.exists() && a.isDirectory())) ? C1207e.m3278a(a, this.f3535a) : null;
    }
}
