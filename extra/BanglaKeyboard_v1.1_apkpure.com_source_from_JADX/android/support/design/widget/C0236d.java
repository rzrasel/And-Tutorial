package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.p006a.C0375a;

class C0236d extends Drawable {
    final Paint f946a = new Paint(1);
    final Rect f947b = new Rect();
    final RectF f948c = new RectF();
    float f949d;
    int f950e;
    int f951f;
    int f952g;
    int f953h;
    boolean f954i = true;
    float f955j;
    private ColorStateList f956k;
    private int f957l;

    public C0236d() {
        this.f946a.setStyle(Style.STROKE);
    }

    final void m609a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f957l = colorStateList.getColorForState(getState(), this.f957l);
        }
        this.f956k = colorStateList;
        this.f954i = true;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float height;
        if (this.f954i) {
            Paint paint = this.f946a;
            Rect rect = this.f947b;
            copyBounds(rect);
            height = this.f949d / ((float) rect.height());
            float f = 0.0f;
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, f, (float) rect.bottom, new int[]{C0375a.m1072a(this.f950e, this.f957l), C0375a.m1072a(this.f951f, this.f957l), C0375a.m1072a(C0375a.m1081b(this.f951f, 0), this.f957l), C0375a.m1072a(C0375a.m1081b(this.f953h, 0), this.f957l), C0375a.m1072a(this.f953h, this.f957l), C0375a.m1072a(this.f952g, this.f957l)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP));
            this.f954i = false;
        }
        height = this.f946a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f948c;
        copyBounds(this.f947b);
        rectF.set(this.f947b);
        rectF.left += height;
        rectF.top += height;
        rectF.right -= height;
        rectF.bottom -= height;
        canvas.save();
        canvas.rotate(this.f955j, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f946a);
        canvas.restore();
    }

    public int getOpacity() {
        return this.f949d > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f949d);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        return (this.f956k != null && this.f956k.isStateful()) || super.isStateful();
    }

    protected void onBoundsChange(Rect rect) {
        this.f954i = true;
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.f956k != null) {
            int colorForState = this.f956k.getColorForState(iArr, this.f957l);
            if (colorForState != this.f957l) {
                this.f954i = true;
                this.f957l = colorForState;
            }
        }
        if (this.f954i) {
            invalidateSelf();
        }
        return this.f954i;
    }

    public void setAlpha(int i) {
        this.f946a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f946a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
