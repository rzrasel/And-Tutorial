package com.bumptech.glide.load.resource.p054d;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.p049c.C1289g;
import com.bumptech.glide.load.resource.bitmap.C1317c;
import com.bumptech.glide.load.resource.bitmap.C1333n;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.resource.p053c.C1342b;
import com.bumptech.glide.p042h.C1155a;
import java.io.InputStream;

public final class C1362c implements C1301e<C1289g, C1358a> {
    private static final C1361b f3813a = new C1361b();
    private static final C1360a f3814b = new C1360a();
    private final C1301e<C1289g, Bitmap> f3815c;
    private final C1301e<InputStream, C1342b> f3816d;
    private final C1187c f3817e;
    private final C1361b f3818f;
    private final C1360a f3819g;
    private String f3820h;

    static class C1360a {
        C1360a() {
        }
    }

    static class C1361b {
        C1361b() {
        }
    }

    public C1362c(C1301e<C1289g, Bitmap> c1301e, C1301e<InputStream, C1342b> c1301e2, C1187c c1187c) {
        this(c1301e, c1301e2, c1187c, f3813a, f3814b);
    }

    private C1362c(C1301e<C1289g, Bitmap> c1301e, C1301e<InputStream, C1342b> c1301e2, C1187c c1187c, C1361b c1361b, C1360a c1360a) {
        this.f3815c = c1301e;
        this.f3816d = c1301e2;
        this.f3817e = c1187c;
        this.f3818f = c1361b;
        this.f3819g = c1360a;
    }

    private C1241l<C1358a> m3533a(C1289g c1289g, int i, int i2) {
        C1155a a = C1155a.m3131a();
        byte[] b = a.m3133b();
        try {
            C1358a c1358a;
            if (c1289g.f3665a != null) {
                InputStream c1333n = new C1333n(c1289g.f3665a, b);
                c1333n.mark(ItemAnimator.FLAG_MOVED);
                ImageType a2 = new ImageHeaderParser(c1333n).m3432a();
                c1333n.reset();
                if (a2 == ImageType.GIF) {
                    C1241l a3 = this.f3816d.mo1381a(c1333n, i, i2);
                    if (a3 != null) {
                        C1342b c1342b = (C1342b) a3.mo1367a();
                        c1358a = c1342b.f3764b.f3205f.f3229c > 1 ? new C1358a(null, a3) : new C1358a(new C1317c(c1342b.f3763a.f3762i, this.f3817e), null);
                        if (c1358a == null) {
                            c1358a = m3534b(new C1289g(c1333n, c1289g.f3666b), i, i2);
                        }
                    }
                }
                c1358a = null;
                if (c1358a == null) {
                    c1358a = m3534b(new C1289g(c1333n, c1289g.f3666b), i, i2);
                }
            } else {
                c1358a = m3534b(c1289g, i, i2);
            }
            a.m3132a(b);
            return c1358a != null ? new C1359b(c1358a) : null;
        } catch (Throwable th) {
            a.m3132a(b);
        }
    }

    private C1358a m3534b(C1289g c1289g, int i, int i2) {
        C1241l a = this.f3815c.mo1381a(c1289g, i, i2);
        return a != null ? new C1358a(a, null) : null;
    }

    public final String mo1382a() {
        if (this.f3820h == null) {
            this.f3820h = this.f3816d.mo1382a() + this.f3815c.mo1382a();
        }
        return this.f3820h;
    }
}
