package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.p042h.C1163h;

public final class C1317c implements C1241l<Bitmap> {
    private final Bitmap f3705a;
    private final C1187c f3706b;

    public C1317c(Bitmap bitmap, C1187c c1187c) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (c1187c == null) {
            throw new NullPointerException("BitmapPool must not be null");
        } else {
            this.f3705a = bitmap;
            this.f3706b = c1187c;
        }
    }

    public static C1317c m3436a(Bitmap bitmap, C1187c c1187c) {
        return bitmap == null ? null : new C1317c(bitmap, c1187c);
    }

    public final /* bridge */ /* synthetic */ Object mo1367a() {
        return this.f3705a;
    }

    public final int mo1368b() {
        return C1163h.m3150a(this.f3705a);
    }

    public final void mo1369c() {
        if (!this.f3706b.mo1345a(this.f3705a)) {
            this.f3705a.recycle();
        }
    }
}
