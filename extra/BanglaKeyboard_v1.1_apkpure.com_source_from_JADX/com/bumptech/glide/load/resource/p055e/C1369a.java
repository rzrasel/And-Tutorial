package com.bumptech.glide.load.resource.p055e;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.resource.bitmap.C1328j;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.load.resource.p054d.C1358a;

public final class C1369a implements C1368c<C1358a, C1136b> {
    private final C1368c<Bitmap, C1328j> f3832a;

    public C1369a(C1368c<Bitmap, C1328j> c1368c) {
        this.f3832a = c1368c;
    }

    public final C1241l<C1136b> mo1389a(C1241l<C1358a> c1241l) {
        C1358a c1358a = (C1358a) c1241l.mo1367a();
        C1241l c1241l2 = c1358a.f3811b;
        return c1241l2 != null ? this.f3832a.mo1389a(c1241l2) : c1358a.f3810a;
    }

    public final String mo1390a() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
