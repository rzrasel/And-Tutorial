package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.hv;
import com.google.android.gms.internal.hw;

public abstract class C0255e {
    final C0256f f554a;
    protected int f555b;
    protected int f556c;

    protected abstract void mo696a();

    final void m1034a(Context context, Bitmap bitmap) {
        hw.m2174a((Object) bitmap);
        if ((this.f556c & 1) != 0) {
            bitmap = gy.m2135a(bitmap);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        mo696a();
    }

    final void m1035a(Context context, hu huVar) {
        if (this.f555b != 0) {
            int i = this.f555b;
            Resources resources = context.getResources();
            if (this.f556c > 0) {
                hv hvVar = new hv(i, this.f556c);
                if (((Drawable) huVar.m1030b(hvVar)) == null) {
                    Object drawable = resources.getDrawable(i);
                    if ((this.f556c & 1) != 0) {
                        Bitmap bitmap;
                        if (drawable == null) {
                            bitmap = null;
                        } else if (drawable instanceof BitmapDrawable) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            drawable.draw(canvas);
                            bitmap = createBitmap;
                        }
                        drawable = new BitmapDrawable(resources, gy.m2135a(bitmap));
                    }
                    huVar.m1028a(hvVar, drawable);
                }
            } else {
                resources.getDrawable(i);
            }
        }
        mo696a();
    }
}
