package com.bumptech.glide.load.resource.p054d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.p049c.C1289g;
import com.bumptech.glide.load.resource.p052b.C1309c;
import com.bumptech.glide.load.resource.p053c.C1342b;
import com.bumptech.glide.p038e.C1107b;
import java.io.File;
import java.io.InputStream;

public final class C1366g implements C1107b<C1289g, C1358a> {
    private final C1301e<File, C1358a> f3827a;
    private final C1301e<C1289g, C1358a> f3828b;
    private final C1302f<C1358a> f3829c;
    private final C1249b<C1289g> f3830d;

    public C1366g(C1107b<C1289g, Bitmap> c1107b, C1107b<InputStream, C1342b> c1107b2, C1187c c1187c) {
        C1301e c1362c = new C1362c(c1107b.mo1292b(), c1107b2.mo1292b(), c1187c);
        this.f3827a = new C1309c(new C1364e(c1362c));
        this.f3828b = c1362c;
        this.f3829c = new C1363d(c1107b.mo1294d(), c1107b2.mo1294d());
        this.f3830d = c1107b.mo1293c();
    }

    public final C1301e<File, C1358a> mo1291a() {
        return this.f3827a;
    }

    public final C1301e<C1289g, C1358a> mo1292b() {
        return this.f3828b;
    }

    public final C1249b<C1289g> mo1293c() {
        return this.f3830d;
    }

    public final C1302f<C1358a> mo1294d() {
        return this.f3829c;
    }
}
