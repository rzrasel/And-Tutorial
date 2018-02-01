package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.load.resource.p040a.C1136b;

public class C1328j extends C1136b {
    C1327a f3724a;
    private final Rect f3725b;
    private int f3726c;
    private int f3727d;
    private boolean f3728e;
    private boolean f3729f;

    static class C1327a extends ConstantState {
        private static final Paint f3720d = new Paint(6);
        final Bitmap f3721a;
        int f3722b;
        Paint f3723c;

        public C1327a(Bitmap bitmap) {
            this.f3723c = f3720d;
            this.f3721a = bitmap;
        }

        C1327a(C1327a c1327a) {
            this(c1327a.f3721a);
            this.f3722b = c1327a.f3722b;
        }

        final void m3466a() {
            if (f3720d == this.f3723c) {
                this.f3723c = new Paint(6);
            }
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new C1328j(null, this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C1328j(resources, this);
        }
    }

    public C1328j(Resources resources, Bitmap bitmap) {
        this(resources, new C1327a(bitmap));
    }

    C1328j(Resources resources, C1327a c1327a) {
        this.f3725b = new Rect();
        if (c1327a == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        int i;
        this.f3724a = c1327a;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
            if (i == 0) {
                i = 160;
            }
            c1327a.f3722b = i;
        } else {
            i = c1327a.f3722b;
        }
        this.f3726c = c1327a.f3721a.getScaledWidth(i);
        this.f3727d = c1327a.f3721a.getScaledHeight(i);
    }

    public final void mo1314a(int i) {
    }

    public final boolean mo1315a() {
        return false;
    }

    public void draw(Canvas canvas) {
        if (this.f3728e) {
            Gravity.apply(119, this.f3726c, this.f3727d, getBounds(), this.f3725b);
            this.f3728e = false;
        }
        canvas.drawBitmap(this.f3724a.f3721a, null, this.f3725b, this.f3724a.f3723c);
    }

    public ConstantState getConstantState() {
        return this.f3724a;
    }

    public int getIntrinsicHeight() {
        return this.f3727d;
    }

    public int getIntrinsicWidth() {
        return this.f3726c;
    }

    public int getOpacity() {
        Bitmap bitmap = this.f3724a.f3721a;
        return (bitmap == null || bitmap.hasAlpha() || this.f3724a.f3723c.getAlpha() < 255) ? -3 : -1;
    }

    public boolean isRunning() {
        return false;
    }

    public Drawable mutate() {
        if (!this.f3729f && super.mutate() == this) {
            this.f3724a = new C1327a(this.f3724a);
            this.f3729f = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3728e = true;
    }

    public void setAlpha(int i) {
        if (this.f3724a.f3723c.getAlpha() != i) {
            C1327a c1327a = this.f3724a;
            c1327a.m3466a();
            c1327a.f3723c.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C1327a c1327a = this.f3724a;
        c1327a.m3466a();
        c1327a.f3723c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void start() {
    }

    public void stop() {
    }
}
