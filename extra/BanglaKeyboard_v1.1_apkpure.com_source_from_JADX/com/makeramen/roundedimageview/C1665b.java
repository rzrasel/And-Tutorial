package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView.ScaleType;

public final class C1665b extends Drawable {
    final Paint f7819a;
    TileMode f7820b = TileMode.CLAMP;
    TileMode f7821c = TileMode.CLAMP;
    boolean f7822d = true;
    float f7823e = 0.0f;
    final boolean[] f7824f = new boolean[]{true, true, true, true};
    boolean f7825g = false;
    float f7826h = 0.0f;
    ColorStateList f7827i = ColorStateList.valueOf(-16777216);
    ScaleType f7828j = ScaleType.FIT_CENTER;
    private final RectF f7829k = new RectF();
    private final RectF f7830l = new RectF();
    private final RectF f7831m = new RectF();
    private final Bitmap f7832n;
    private final Paint f7833o;
    private final int f7834p;
    private final int f7835q;
    private final RectF f7836r = new RectF();
    private final Matrix f7837s = new Matrix();
    private final RectF f7838t = new RectF();

    static /* synthetic */ class C16641 {
        static final /* synthetic */ int[] f7818a = new int[ScaleType.values().length];

        static {
            try {
                f7818a[ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f7818a[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f7818a[ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f7818a[ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f7818a[ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f7818a[ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f7818a[ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    private C1665b(Bitmap bitmap) {
        this.f7832n = bitmap;
        this.f7834p = bitmap.getWidth();
        this.f7835q = bitmap.getHeight();
        this.f7831m.set(0.0f, 0.0f, (float) this.f7834p, (float) this.f7835q);
        this.f7833o = new Paint();
        this.f7833o.setStyle(Style.FILL);
        this.f7833o.setAntiAlias(true);
        this.f7819a = new Paint();
        this.f7819a.setStyle(Style.STROKE);
        this.f7819a.setAntiAlias(true);
        this.f7819a.setColor(this.f7827i.getColorForState(getState(), -16777216));
        this.f7819a.setStrokeWidth(this.f7826h);
    }

    public static Drawable m7121a(Drawable drawable) {
        if (drawable == null || (drawable instanceof C1665b)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), C1665b.m7121a(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap b = C1665b.m7125b(drawable);
        return b != null ? new C1665b(b) : drawable;
    }

    public static C1665b m7122a(Bitmap bitmap) {
        return bitmap != null ? new C1665b(bitmap) : null;
    }

    private void m7123a(Canvas canvas) {
        if (!C1665b.m7126b(this.f7824f) && this.f7823e != 0.0f) {
            float f = this.f7830l.left;
            float f2 = this.f7830l.top;
            float width = this.f7830l.width() + f;
            float height = this.f7830l.height() + f2;
            float f3 = this.f7823e;
            if (!this.f7824f[0]) {
                this.f7838t.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.f7838t, this.f7833o);
            }
            if (!this.f7824f[1]) {
                this.f7838t.set(width - f3, f2, width, f3);
                canvas.drawRect(this.f7838t, this.f7833o);
            }
            if (!this.f7824f[2]) {
                this.f7838t.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.f7838t, this.f7833o);
            }
            if (!this.f7824f[3]) {
                this.f7838t.set(f, height - f3, f3 + f, height);
                canvas.drawRect(this.f7838t, this.f7833o);
            }
        }
    }

    private static boolean m7124a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static Bitmap m7125b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    private static boolean m7126b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    final void m7127a() {
        float f = 0.0f;
        float height;
        float width;
        switch (C16641.f7818a[this.f7828j.ordinal()]) {
            case 1:
                this.f7836r.set(this.f7829k);
                this.f7836r.inset(this.f7826h / 2.0f, this.f7826h / 2.0f);
                this.f7837s.reset();
                this.f7837s.setTranslate((float) ((int) (((this.f7836r.width() - ((float) this.f7834p)) * 0.5f) + 0.5f)), (float) ((int) (((this.f7836r.height() - ((float) this.f7835q)) * 0.5f) + 0.5f)));
                break;
            case 2:
                this.f7836r.set(this.f7829k);
                this.f7836r.inset(this.f7826h / 2.0f, this.f7826h / 2.0f);
                this.f7837s.reset();
                if (((float) this.f7834p) * this.f7836r.height() > this.f7836r.width() * ((float) this.f7835q)) {
                    height = this.f7836r.height() / ((float) this.f7835q);
                    width = (this.f7836r.width() - (((float) this.f7834p) * height)) * 0.5f;
                } else {
                    height = this.f7836r.width() / ((float) this.f7834p);
                    width = 0.0f;
                    f = (this.f7836r.height() - (((float) this.f7835q) * height)) * 0.5f;
                }
                this.f7837s.setScale(height, height);
                this.f7837s.postTranslate(((float) ((int) (width + 0.5f))) + (this.f7826h / 2.0f), ((float) ((int) (f + 0.5f))) + (this.f7826h / 2.0f));
                break;
            case 3:
                this.f7837s.reset();
                f = (((float) this.f7834p) > this.f7829k.width() || ((float) this.f7835q) > this.f7829k.height()) ? Math.min(this.f7829k.width() / ((float) this.f7834p), this.f7829k.height() / ((float) this.f7835q)) : 1.0f;
                width = (float) ((int) (((this.f7829k.width() - (((float) this.f7834p) * f)) * 0.5f) + 0.5f));
                height = (float) ((int) (((this.f7829k.height() - (((float) this.f7835q) * f)) * 0.5f) + 0.5f));
                this.f7837s.setScale(f, f);
                this.f7837s.postTranslate(width, height);
                this.f7836r.set(this.f7831m);
                this.f7837s.mapRect(this.f7836r);
                this.f7836r.inset(this.f7826h / 2.0f, this.f7826h / 2.0f);
                this.f7837s.setRectToRect(this.f7831m, this.f7836r, ScaleToFit.FILL);
                break;
            case 5:
                this.f7836r.set(this.f7831m);
                this.f7837s.setRectToRect(this.f7831m, this.f7829k, ScaleToFit.END);
                this.f7837s.mapRect(this.f7836r);
                this.f7836r.inset(this.f7826h / 2.0f, this.f7826h / 2.0f);
                this.f7837s.setRectToRect(this.f7831m, this.f7836r, ScaleToFit.FILL);
                break;
            case 6:
                this.f7836r.set(this.f7831m);
                this.f7837s.setRectToRect(this.f7831m, this.f7829k, ScaleToFit.START);
                this.f7837s.mapRect(this.f7836r);
                this.f7836r.inset(this.f7826h / 2.0f, this.f7826h / 2.0f);
                this.f7837s.setRectToRect(this.f7831m, this.f7836r, ScaleToFit.FILL);
                break;
            case 7:
                this.f7836r.set(this.f7829k);
                this.f7836r.inset(this.f7826h / 2.0f, this.f7826h / 2.0f);
                this.f7837s.reset();
                this.f7837s.setRectToRect(this.f7831m, this.f7836r, ScaleToFit.FILL);
                break;
            default:
                this.f7836r.set(this.f7831m);
                this.f7837s.setRectToRect(this.f7831m, this.f7829k, ScaleToFit.CENTER);
                this.f7837s.mapRect(this.f7836r);
                this.f7836r.inset(this.f7826h / 2.0f, this.f7826h / 2.0f);
                this.f7837s.setRectToRect(this.f7831m, this.f7836r, ScaleToFit.FILL);
                break;
        }
        this.f7830l.set(this.f7836r);
    }

    public final void draw(Canvas canvas) {
        if (this.f7822d) {
            Shader bitmapShader = new BitmapShader(this.f7832n, this.f7820b, this.f7821c);
            if (this.f7820b == TileMode.CLAMP && this.f7821c == TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.f7837s);
            }
            this.f7833o.setShader(bitmapShader);
            this.f7822d = false;
        }
        if (this.f7825g) {
            if (this.f7826h > 0.0f) {
                canvas.drawOval(this.f7830l, this.f7833o);
                canvas.drawOval(this.f7836r, this.f7819a);
                return;
            }
            canvas.drawOval(this.f7830l, this.f7833o);
        } else if (C1665b.m7124a(this.f7824f)) {
            float f = this.f7823e;
            if (this.f7826h > 0.0f) {
                canvas.drawRoundRect(this.f7830l, f, f, this.f7833o);
                canvas.drawRoundRect(this.f7836r, f, f, this.f7819a);
                m7123a(canvas);
                if (!C1665b.m7126b(this.f7824f) && this.f7823e != 0.0f) {
                    float f2 = this.f7830l.left;
                    float f3 = this.f7830l.top;
                    float width = f2 + this.f7830l.width();
                    float height = f3 + this.f7830l.height();
                    float f4 = this.f7823e;
                    float f5 = this.f7826h / 2.0f;
                    if (!this.f7824f[0]) {
                        canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.f7819a);
                        canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.f7819a);
                    }
                    if (!this.f7824f[1]) {
                        canvas.drawLine((width - f4) - f5, f3, width, f3, this.f7819a);
                        canvas.drawLine(width, f3 - f5, width, f3 + f4, this.f7819a);
                    }
                    if (!this.f7824f[2]) {
                        canvas.drawLine((width - f4) - f5, height, width + f5, height, this.f7819a);
                        canvas.drawLine(width, height - f4, width, height, this.f7819a);
                    }
                    if (!this.f7824f[3]) {
                        canvas.drawLine(f2 - f5, height, f2 + f4, height, this.f7819a);
                        canvas.drawLine(f2, height - f4, f2, height, this.f7819a);
                        return;
                    }
                    return;
                }
                return;
            }
            canvas.drawRoundRect(this.f7830l, f, f, this.f7833o);
            m7123a(canvas);
        } else {
            canvas.drawRect(this.f7830l, this.f7833o);
            if (this.f7826h > 0.0f) {
                canvas.drawRect(this.f7836r, this.f7819a);
            }
        }
    }

    public final int getAlpha() {
        return this.f7833o.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f7833o.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.f7835q;
    }

    public final int getIntrinsicWidth() {
        return this.f7834p;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return this.f7827i.isStateful();
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7829k.set(rect);
        m7127a();
    }

    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.f7827i.getColorForState(iArr, 0);
        if (this.f7819a.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f7819a.setColor(colorForState);
        return true;
    }

    public final void setAlpha(int i) {
        this.f7833o.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7833o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setDither(boolean z) {
        this.f7833o.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.f7833o.setFilterBitmap(z);
        invalidateSelf();
    }
}
