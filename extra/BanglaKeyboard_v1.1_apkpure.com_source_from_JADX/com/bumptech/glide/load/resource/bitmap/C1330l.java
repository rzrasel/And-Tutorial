package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p049c.C1289g;
import java.io.IOException;
import java.io.InputStream;

public final class C1330l implements C1301e<C1289g, Bitmap> {
    private final C1301e<InputStream, Bitmap> f3731a;
    private final C1301e<ParcelFileDescriptor, Bitmap> f3732b;

    public C1330l(C1301e<InputStream, Bitmap> c1301e, C1301e<ParcelFileDescriptor, Bitmap> c1301e2) {
        this.f3731a = c1301e;
        this.f3732b = c1301e2;
    }

    private C1241l<Bitmap> m3471a(C1289g c1289g, int i, int i2) {
        C1241l<Bitmap> c1241l = null;
        InputStream inputStream = c1289g.f3665a;
        if (inputStream != null) {
            try {
                c1241l = this.f3731a.mo1381a(inputStream, i, i2);
            } catch (IOException e) {
                Log.isLoggable("ImageVideoDecoder", 2);
            }
        }
        if (c1241l != null) {
            return c1241l;
        }
        ParcelFileDescriptor parcelFileDescriptor = c1289g.f3666b;
        return parcelFileDescriptor != null ? this.f3732b.mo1381a(parcelFileDescriptor, i, i2) : c1241l;
    }

    public final String mo1382a() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
