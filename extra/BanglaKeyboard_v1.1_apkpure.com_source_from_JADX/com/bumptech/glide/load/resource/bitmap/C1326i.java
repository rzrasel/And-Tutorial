package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import com.bumptech.glide.load.p044b.p046a.C1187c;

public final class C1326i extends C1318d {
    public C1326i(C1187c c1187c) {
        super(c1187c);
    }

    protected final Bitmap mo1383a(C1187c c1187c, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Config a = C1336q.m3487a(bitmap);
        Bitmap a2 = c1187c.mo1342a(width, height, a);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(width, height, a);
        }
        C1336q.m3488a(bitmap, a2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            new StringBuilder("request: ").append(i).append("x").append(i2);
            new StringBuilder("toFit:   ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight());
            new StringBuilder("toReuse: ").append(a2.getWidth()).append("x").append(a2.getHeight());
        }
        Canvas canvas = new Canvas(a2);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        canvas.drawBitmap(bitmap, matrix, new Paint(6));
        return a2;
    }

    public final String mo1380a() {
        return "FitCenter.com.bumptech.glide.load.resource.bitmap";
    }
}
