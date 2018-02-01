package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.p042h.C1163h;

public abstract class C1318d implements C1299g<Bitmap> {
    private C1187c f3707a;

    public C1318d(C1187c c1187c) {
        this.f3707a = c1187c;
    }

    protected abstract Bitmap mo1383a(C1187c c1187c, Bitmap bitmap, int i, int i2);

    public final C1241l<Bitmap> mo1379a(C1241l<Bitmap> c1241l, int i, int i2) {
        if (C1163h.m3155a(i, i2)) {
            Bitmap bitmap = (Bitmap) c1241l.mo1367a();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo1383a(this.f3707a, bitmap, i, i2);
            return bitmap.equals(a) ? c1241l : C1317c.m3436a(a, this.f3707a);
        } else {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
    }
}
