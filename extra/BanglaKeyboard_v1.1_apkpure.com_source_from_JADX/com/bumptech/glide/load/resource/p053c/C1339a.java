package com.bumptech.glide.load.resource.p053c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.p033b.C1091a.C1090a;

final class C1339a implements C1090a {
    private final C1187c f3753a;

    public C1339a(C1187c c1187c) {
        this.f3753a = c1187c;
    }

    public final Bitmap mo1386a(int i, int i2, Config config) {
        return this.f3753a.mo1346b(i, i2, config);
    }

    public final void mo1387a(Bitmap bitmap) {
        if (!this.f3753a.mo1345a(bitmap)) {
            bitmap.recycle();
        }
    }
}
