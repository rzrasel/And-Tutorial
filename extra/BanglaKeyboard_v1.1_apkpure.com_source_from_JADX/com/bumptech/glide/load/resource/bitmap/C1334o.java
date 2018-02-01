package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1176a;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.p049c.C1298o;
import com.bumptech.glide.load.resource.p052b.C1309c;
import com.bumptech.glide.p038e.C1107b;
import java.io.File;
import java.io.InputStream;

public final class C1334o implements C1107b<InputStream, Bitmap> {
    private final C1335p f3742a;
    private final C1316b f3743b;
    private final C1298o f3744c = new C1298o();
    private final C1309c<Bitmap> f3745d;

    public C1334o(C1187c c1187c, C1176a c1176a) {
        this.f3742a = new C1335p(c1187c, c1176a);
        this.f3743b = new C1316b();
        this.f3745d = new C1309c(this.f3742a);
    }

    public final C1301e<File, Bitmap> mo1291a() {
        return this.f3745d;
    }

    public final C1301e<InputStream, Bitmap> mo1292b() {
        return this.f3742a;
    }

    public final C1249b<InputStream> mo1293c() {
        return this.f3744c;
    }

    public final C1302f<Bitmap> mo1294d() {
        return this.f3743b;
    }
}
