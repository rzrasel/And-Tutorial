package com.bumptech.glide.load.resource.p053c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.resource.bitmap.C1317c;

public final class C1345e implements C1299g<C1342b> {
    private final C1299g<Bitmap> f3779a;
    private final C1187c f3780b;

    public C1345e(C1299g<Bitmap> c1299g, C1187c c1187c) {
        this.f3779a = c1299g;
        this.f3780b = c1187c;
    }

    public final C1241l<C1342b> mo1379a(C1241l<C1342b> c1241l, int i, int i2) {
        C1342b c1342b = (C1342b) c1241l.mo1367a();
        Bitmap bitmap = ((C1342b) c1241l.mo1367a()).f3763a.f3762i;
        Bitmap bitmap2 = (Bitmap) this.f3779a.mo1379a(new C1317c(bitmap, this.f3780b), i, i2).mo1367a();
        return !bitmap2.equals(bitmap) ? new C1344d(new C1342b(c1342b, bitmap2, this.f3779a)) : c1241l;
    }

    public final String mo1380a() {
        return this.f3779a.mo1380a();
    }
}
