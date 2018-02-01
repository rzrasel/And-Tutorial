package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bumptech.glide.load.p044b.p046a.C1187c;

public final class C1319e extends C1318d {
    public C1319e(C1187c c1187c) {
        super(c1187c);
    }

    protected final Bitmap mo1383a(C1187c c1187c, Bitmap bitmap, int i, int i2) {
        float f = 0.0f;
        Bitmap a = c1187c.mo1342a(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        if (bitmap == null) {
            bitmap = null;
        } else if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
            float height;
            float f2;
            Matrix matrix = new Matrix();
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                height = ((float) i2) / ((float) bitmap.getHeight());
                f = (((float) i) - (((float) bitmap.getWidth()) * height)) * 0.5f;
                f2 = 0.0f;
            } else {
                height = ((float) i) / ((float) bitmap.getWidth());
                f2 = (((float) i2) - (((float) bitmap.getHeight()) * height)) * 0.5f;
            }
            matrix.setScale(height, height);
            matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f2 + 0.5f)));
            Bitmap createBitmap = a != null ? a : Bitmap.createBitmap(i, i2, C1336q.m3487a(bitmap));
            C1336q.m3488a(bitmap, createBitmap);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
            bitmap = createBitmap;
        }
        if (!(a == null || a == bitmap || c1187c.mo1345a(a))) {
            a.recycle();
        }
        return bitmap;
    }

    public final String mo1380a() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
