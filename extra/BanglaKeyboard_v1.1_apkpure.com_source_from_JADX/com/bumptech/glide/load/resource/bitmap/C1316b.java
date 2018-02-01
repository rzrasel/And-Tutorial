package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.p042h.C1158d;
import com.bumptech.glide.p042h.C1163h;
import java.io.OutputStream;

public final class C1316b implements C1302f<Bitmap> {
    private CompressFormat f3703a;
    private int f3704b;

    public C1316b() {
        this((byte) 0);
    }

    private C1316b(byte b) {
        this.f3703a = null;
        this.f3704b = 90;
    }

    public final String mo1376a() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public final /* synthetic */ boolean mo1377a(Object obj, OutputStream outputStream) {
        Bitmap bitmap = (Bitmap) ((C1241l) obj).mo1367a();
        long a = C1158d.m3139a();
        CompressFormat compressFormat = this.f3703a != null ? this.f3703a : bitmap.hasAlpha() ? CompressFormat.PNG : CompressFormat.JPEG;
        bitmap.compress(compressFormat, this.f3704b, outputStream);
        if (Log.isLoggable("BitmapEncoder", 2)) {
            new StringBuilder("Compressed with type: ").append(compressFormat).append(" of size ").append(C1163h.m3150a(bitmap)).append(" in ").append(C1158d.m3138a(a));
        }
        return true;
    }
}
