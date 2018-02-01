package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1176a;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.resource.C1304a;
import com.bumptech.glide.load.resource.p052b.C1309c;
import com.bumptech.glide.p038e.C1107b;
import java.io.File;

public final class C1324g implements C1107b<ParcelFileDescriptor, Bitmap> {
    private final C1301e<File, Bitmap> f3713a;
    private final C1325h f3714b;
    private final C1316b f3715c = new C1316b();
    private final C1249b<ParcelFileDescriptor> f3716d = C1304a.m3403b();

    public C1324g(C1187c c1187c, C1176a c1176a) {
        this.f3713a = new C1309c(new C1335p(c1187c, c1176a));
        this.f3714b = new C1325h(c1187c, c1176a);
    }

    public final C1301e<File, Bitmap> mo1291a() {
        return this.f3713a;
    }

    public final C1301e<ParcelFileDescriptor, Bitmap> mo1292b() {
        return this.f3714b;
    }

    public final C1249b<ParcelFileDescriptor> mo1293c() {
        return this.f3716d;
    }

    public final C1302f<Bitmap> mo1294d() {
        return this.f3715c;
    }
}
