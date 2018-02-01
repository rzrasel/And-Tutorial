package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.LruCache;
import java.lang.ref.WeakReference;

public final class at implements ar {
    private final LruCache f2660a;
    private WeakReference f2661b = null;

    public at(Context context) {
        this.f2660a = new LruCache(context);
        this.f2661b = new WeakReference(context);
    }

    public final Drawable mo1367a(int i) {
        Resources resources;
        Bitmap bitmap = this.f2660a.get(Integer.toString(i));
        if (this.f2661b != null) {
            Context context = (Context) this.f2661b.get();
            if (context != null) {
                resources = context.getResources();
                return (bitmap != null || resources == null) ? null : new BitmapDrawable(resources, bitmap);
            }
        }
        resources = null;
        if (bitmap != null) {
        }
    }

    public final void mo1368a(int i, Drawable drawable) {
        Bitmap bitmap;
        int i2 = 1;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = 1;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > 0) {
                i2 = intrinsicHeight;
            }
            bitmap = Bitmap.createBitmap(intrinsicWidth, i2, Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        if (bitmap != null) {
            this.f2660a.set(Integer.toString(i), bitmap);
        }
    }

    public final boolean mo1369b(int i) {
        return this.f2660a.get(Integer.toString(i)) != null;
    }
}
