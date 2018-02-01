package com.orange.studio.banglatype;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;
import android.util.LruCache;

public final class bn {
    private static final LruCache<Integer, Drawable> f8234a = new LruCache(10);

    public static Drawable m7398a() {
        Drawable drawable = (Drawable) f8234a.get(Integer.valueOf(-1526726204));
        if (drawable == null) {
            int max = Math.max(12, 2);
            drawable = new PaintDrawable();
            drawable.setShape(new RectShape());
            final int[] iArr = new int[max];
            int red = Color.red(-452984832);
            int green = Color.green(-452984832);
            int blue = Color.blue(-452984832);
            int alpha = Color.alpha(-452984832);
            for (int i = 0; i < max; i++) {
                iArr[i] = Color.argb((int) (Math.max(0.0f, Math.min(1.0f, (float) Math.pow((double) ((((float) i) * 1.0f) / ((float) (max - 1))), 3.0d))) * ((float) alpha)), red, green, blue);
            }
            drawable.setShaderFactory(new ShaderFactory() {
                final /* synthetic */ float f8229a = 0.0f;
                final /* synthetic */ float f8230b = 0.0f;
                final /* synthetic */ float f8231c = 0.0f;
                final /* synthetic */ float f8232d = 1.0f;

                public final Shader resize(int i, int i2) {
                    return new LinearGradient(((float) i) * this.f8229a, ((float) i2) * this.f8230b, ((float) i) * this.f8231c, ((float) i2) * this.f8232d, iArr, null, TileMode.CLAMP);
                }
            });
            f8234a.put(Integer.valueOf(-1526726204), drawable);
        }
        return drawable;
    }
}
