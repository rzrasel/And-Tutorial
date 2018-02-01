package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p049c.C1289g;
import com.bumptech.glide.load.p049c.C1290h;
import com.bumptech.glide.p038e.C1107b;
import java.io.File;
import java.io.InputStream;

public final class C1331m implements C1107b<C1289g, Bitmap> {
    private final C1330l f3733a;
    private final C1301e<File, Bitmap> f3734b;
    private final C1302f<Bitmap> f3735c;
    private final C1290h f3736d;

    public C1331m(C1107b<InputStream, Bitmap> c1107b, C1107b<ParcelFileDescriptor, Bitmap> c1107b2) {
        this.f3735c = c1107b.mo1294d();
        this.f3736d = new C1290h(c1107b.mo1293c(), c1107b2.mo1293c());
        this.f3734b = c1107b.mo1291a();
        this.f3733a = new C1330l(c1107b.mo1292b(), c1107b2.mo1292b());
    }

    public final C1301e<File, Bitmap> mo1291a() {
        return this.f3734b;
    }

    public final C1301e<C1289g, Bitmap> mo1292b() {
        return this.f3733a;
    }

    public final C1249b<C1289g> mo1293c() {
        return this.f3736d;
    }

    public final C1302f<Bitmap> mo1294d() {
        return this.f3735c;
    }
}
