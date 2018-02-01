package com.bumptech.glide.load.resource.p054d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.resource.p053c.C1342b;
import com.bumptech.glide.load.resource.p053c.C1345e;

public final class C1365f implements C1299g<C1358a> {
    private final C1299g<Bitmap> f3825a;
    private final C1299g<C1342b> f3826b;

    public C1365f(C1187c c1187c, C1299g<Bitmap> c1299g) {
        this((C1299g) c1299g, new C1345e(c1299g, c1187c));
    }

    private C1365f(C1299g<Bitmap> c1299g, C1299g<C1342b> c1299g2) {
        this.f3825a = c1299g;
        this.f3826b = c1299g2;
    }

    public final C1241l<C1358a> mo1379a(C1241l<C1358a> c1241l, int i, int i2) {
        C1241l c1241l2 = ((C1358a) c1241l.mo1367a()).f3811b;
        C1241l c1241l3 = ((C1358a) c1241l.mo1367a()).f3810a;
        if (c1241l2 != null && this.f3825a != null) {
            C1241l a = this.f3825a.mo1379a(c1241l2, i, i2);
            return !c1241l2.equals(a) ? new C1359b(new C1358a(a, ((C1358a) c1241l.mo1367a()).f3810a)) : c1241l;
        } else if (c1241l3 == null || this.f3826b == null) {
            return c1241l;
        } else {
            c1241l2 = this.f3826b.mo1379a(c1241l3, i, i2);
            return !c1241l3.equals(c1241l2) ? new C1359b(new C1358a(((C1358a) c1241l.mo1367a()).f3811b, c1241l2)) : c1241l;
        }
    }

    public final String mo1380a() {
        return this.f3825a.mo1380a();
    }
}
