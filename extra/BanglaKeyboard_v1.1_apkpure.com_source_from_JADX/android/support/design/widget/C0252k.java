package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.design.C0116a.C0107c;
import android.support.v4.content.C0392a;
import android.support.v7.p012d.p013a.C0251a;

final class C0252k extends C0251a {
    static final double f1045a = Math.cos(Math.toRadians(45.0d));
    final Paint f1046b;
    final Paint f1047c;
    final RectF f1048d;
    float f1049e;
    Path f1050f;
    float f1051g;
    float f1052h;
    float f1053i;
    float f1054j;
    boolean f1055k = true;
    float f1056l;
    private boolean f1057m = true;
    private final int f1058n;
    private final int f1059o;
    private final int f1060p;
    private boolean f1061q = false;

    public C0252k(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f1058n = C0392a.getColor(context, C0107c.design_fab_shadow_start_color);
        this.f1059o = C0392a.getColor(context, C0107c.design_fab_shadow_mid_color);
        this.f1060p = C0392a.getColor(context, C0107c.design_fab_shadow_end_color);
        this.f1046b = new Paint(5);
        this.f1046b.setStyle(Style.FILL);
        this.f1049e = (float) Math.round(f);
        this.f1048d = new RectF();
        this.f1047c = new Paint(this.f1046b);
        this.f1047c.setAntiAlias(false);
        m683a(f2, f3);
    }

    public static float m679a(float f, float f2, boolean z) {
        return z ? (float) (((double) (1.5f * f)) + ((1.0d - f1045a) * ((double) f2))) : 1.5f * f;
    }

    public static float m680b(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f1045a) * ((double) f2))) : f;
    }

    private static int m681b(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public final void m682a(float f) {
        m683a(f, this.f1052h);
    }

    final void m683a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = (float) C0252k.m681b(f);
        float b2 = (float) C0252k.m681b(f2);
        if (b > b2) {
            if (!this.f1061q) {
                this.f1061q = true;
            }
            b = b2;
        }
        if (this.f1054j != b || this.f1052h != b2) {
            this.f1054j = b;
            this.f1052h = b2;
            this.f1053i = (float) Math.round(b * 1.5f);
            this.f1051g = b2;
            this.f1057m = true;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        float f;
        if (this.f1057m) {
            Rect bounds = getBounds();
            float f2 = this.f1052h * 1.5f;
            this.f1048d.set(((float) bounds.left) + this.f1052h, ((float) bounds.top) + f2, ((float) bounds.right) - this.f1052h, ((float) bounds.bottom) - f2);
            getWrappedDrawable().setBounds((int) this.f1048d.left, (int) this.f1048d.top, (int) this.f1048d.right, (int) this.f1048d.bottom);
            RectF rectF = new RectF(-this.f1049e, -this.f1049e, this.f1049e, this.f1049e);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f1053i, -this.f1053i);
            if (this.f1050f == null) {
                this.f1050f = new Path();
            } else {
                this.f1050f.reset();
            }
            this.f1050f.setFillType(FillType.EVEN_ODD);
            this.f1050f.moveTo(-this.f1049e, 0.0f);
            this.f1050f.rLineTo(-this.f1053i, 0.0f);
            this.f1050f.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1050f.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1050f.close();
            float f3 = -rectF2.top;
            if (f3 > 0.0f) {
                float f4 = this.f1049e / f3;
                f = f4 + ((1.0f - f4) / 2.0f);
                this.f1046b.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f1058n, this.f1059o, this.f1060p}, new float[]{0.0f, f4, f, 1.0f}, TileMode.CLAMP));
            }
            this.f1047c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f1058n, this.f1059o, this.f1060p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.f1047c.setAntiAlias(false);
            this.f1057m = false;
        }
        int save = canvas.save();
        canvas.rotate(this.f1056l, this.f1048d.centerX(), this.f1048d.centerY());
        float f5 = (-this.f1049e) - this.f1053i;
        f = this.f1049e;
        Object obj = this.f1048d.width() - (2.0f * f) > 0.0f ? 1 : null;
        Object obj2 = this.f1048d.height() - (2.0f * f) > 0.0f ? 1 : null;
        float f6 = f / ((this.f1054j - (this.f1054j * 0.5f)) + f);
        float f7 = f / ((this.f1054j - (this.f1054j * 0.25f)) + f);
        float f8 = f / (f + (this.f1054j - (this.f1054j * 1.0f)));
        int save2 = canvas.save();
        canvas.translate(this.f1048d.left + f, this.f1048d.top + f);
        canvas.scale(f6, f7);
        canvas.drawPath(this.f1050f, this.f1046b);
        if (obj != null) {
            canvas.scale(1.0f / f6, 1.0f);
            canvas.drawRect(0.0f, f5, this.f1048d.width() - (2.0f * f), -this.f1049e, this.f1047c);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.f1048d.right - f, this.f1048d.bottom - f);
        canvas.scale(f6, f8);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1050f, this.f1046b);
        if (obj != null) {
            canvas.scale(1.0f / f6, 1.0f);
            canvas.drawRect(0.0f, f5, this.f1048d.width() - (2.0f * f), this.f1053i + (-this.f1049e), this.f1047c);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f1048d.left + f, this.f1048d.bottom - f);
        canvas.scale(f6, f8);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1050f, this.f1046b);
        if (obj2 != null) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f5, this.f1048d.height() - (2.0f * f), -this.f1049e, this.f1047c);
        }
        canvas.restoreToCount(save3);
        save3 = canvas.save();
        canvas.translate(this.f1048d.right - f, this.f1048d.top + f);
        canvas.scale(f6, f7);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1050f, this.f1046b);
        if (obj2 != null) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f5, this.f1048d.height() - (2.0f * f), -this.f1049e, this.f1047c);
        }
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
        super.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) C0252k.m679a(this.f1052h, this.f1049e, this.f1055k));
        int ceil2 = (int) Math.ceil((double) C0252k.m680b(this.f1052h, this.f1049e, this.f1055k));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    protected final void onBoundsChange(Rect rect) {
        this.f1057m = true;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f1046b.setAlpha(i);
        this.f1047c.setAlpha(i);
    }
}
