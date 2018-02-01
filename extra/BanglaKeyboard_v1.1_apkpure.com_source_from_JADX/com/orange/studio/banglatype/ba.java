package com.orange.studio.banglatype;

import android.graphics.Bitmap;
import android.support.v7.p012d.C0872b;
import android.support.v7.p012d.C0872b.C0870a;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.resource.C1306c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

public class ba implements C1301e<InputStream, C0872b> {
    private final C1301e<InputStream, C0872b> f8197a;
    private final C1301e<InputStream, Bitmap> f8198b;

    public ba(C1301e<InputStream, C0872b> c1301e, C1301e<InputStream, Bitmap> c1301e2) {
        this.f8197a = c1301e;
        this.f8198b = c1301e2;
    }

    private C1241l<C0872b> m7364a(InputStream inputStream, int i, int i2) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (inputStream.markSupported()) {
            inputStream.mark(1);
            int i3 = inputStream.read() == 0 ? 0 : 1;
            inputStream.reset();
            if (i3 != 0) {
                C1241l a = this.f8198b.mo1381a(inputStream, i, i2);
                try {
                    Object b;
                    C0872b b2 = new C0870a((Bitmap) a.mo1367a()).m2540a().m2541a(bi.f8205a).m2541a(bi.f8206b).m2541a(bi.f8207c).m2541a(bi.f8208d).m2541a(bi.f8209e).m2541a(bi.f8210f).m2541a(bi.f8211g).m2541a(bi.f8212h).m2542b();
                    if (Collections.unmodifiableList(b2.f2669a).isEmpty()) {
                        C0870a a2 = new C0870a((Bitmap) a.mo1367a()).m2540a().m2541a(bi.f8205a).m2541a(bi.f8206b).m2541a(bi.f8207c).m2541a(bi.f8208d).m2541a(bi.f8209e).m2541a(bi.f8210f).m2541a(bi.f8211g).m2541a(bi.f8212h);
                        a2.f2651a.clear();
                        b = a2.m2542b();
                    } else {
                        C0872b c0872b = b2;
                    }
                    C1241l<C0872b> c1306c = new C1306c(b);
                    return c1306c;
                } finally {
                    a.mo1369c();
                }
            } else if (inputStream.read() == 0) {
                return this.f8197a.mo1381a(inputStream, i, i2);
            } else {
                throw new IOException("Cannot read palette magic.");
            }
        }
        throw new IllegalArgumentException("Cannot peek");
    }

    public final String mo1382a() {
        return ba.class.getSimpleName();
    }
}
