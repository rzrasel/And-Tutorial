package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;

public final class gy {
    public static Bitmap m2135a(Bitmap bitmap) {
        int i = 0;
        if (bitmap == null) {
            return null;
        }
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            i2 = (width / 2) - (height / 2);
        } else {
            i2 = (height / 2) - (width / 2);
            height = width;
            i = i2;
            i2 = 0;
        }
        Bitmap createBitmap = Bitmap.createBitmap(height, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        canvas.drawCircle((float) (height / 2), (float) (height / 2), (float) (height / 2), paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (float) i2, (float) i, paint);
        return createBitmap;
    }
}
