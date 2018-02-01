package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1176a;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import java.io.InputStream;

public final class C1335p implements C1301e<InputStream, Bitmap> {
    private final C1320f f3746a;
    private C1187c f3747b;
    private C1176a f3748c;
    private String f3749d;

    public C1335p(C1187c c1187c, C1176a c1176a) {
        this(C1320f.f3708a, c1187c, c1176a);
    }

    public C1335p(C1320f c1320f, C1187c c1187c, C1176a c1176a) {
        this.f3746a = c1320f;
        this.f3747b = c1187c;
        this.f3748c = c1176a;
    }

    public final /* bridge */ /* synthetic */ C1241l mo1381a(Object obj, int i, int i2) {
        return C1317c.m3436a(this.f3746a.m3451a((InputStream) obj, this.f3747b, i, i2, this.f3748c), this.f3747b);
    }

    public final String mo1382a() {
        if (this.f3749d == null) {
            this.f3749d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.f3746a.mo1385a() + this.f3748c.name();
        }
        return this.f3749d;
    }
}
