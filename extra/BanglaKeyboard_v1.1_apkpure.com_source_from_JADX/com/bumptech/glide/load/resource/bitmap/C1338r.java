package com.bumptech.glide.load.resource.bitmap;

import android.os.ParcelFileDescriptor;

public final class C1338r implements C1315a<ParcelFileDescriptor> {
    private static final C1337a f3750b = new C1337a();
    int f3751a;
    private C1337a f3752c;

    static class C1337a {
        C1337a() {
        }
    }

    public C1338r() {
        this(f3750b);
    }

    private C1338r(C1337a c1337a) {
        this.f3752c = c1337a;
        this.f3751a = -1;
    }

    public final String mo1385a() {
        return "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
