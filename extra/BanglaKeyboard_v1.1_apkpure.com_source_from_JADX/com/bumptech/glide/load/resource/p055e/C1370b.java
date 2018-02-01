package com.bumptech.glide.load.resource.p055e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.resource.bitmap.C1328j;
import com.bumptech.glide.load.resource.bitmap.C1329k;

public final class C1370b implements C1368c<Bitmap, C1328j> {
    private final Resources f3833a;
    private final C1187c f3834b;

    public C1370b(Resources resources, C1187c c1187c) {
        this.f3833a = resources;
        this.f3834b = c1187c;
    }

    public final C1241l<C1328j> mo1389a(C1241l<Bitmap> c1241l) {
        return new C1329k(new C1328j(this.f3833a, (Bitmap) c1241l.mo1367a()), this.f3834b);
    }

    public final String mo1390a() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
