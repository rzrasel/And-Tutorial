package android.support.v7.p012d.p013a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0778i;
import android.support.v7.p021a.C0780a.C0779j;

public final class C0866b extends Drawable {
    private static final float f2631c = ((float) Math.toRadians(45.0d));
    public float f2632a;
    private final Paint f2633b = new Paint();
    private float f2634d;
    private float f2635e;
    private float f2636f;
    private float f2637g;
    private boolean f2638h;
    private final Path f2639i = new Path();
    private final int f2640j;
    private boolean f2641k = false;
    private float f2642l;
    private int f2643m = 2;

    public C0866b(Context context) {
        this.f2633b.setStyle(Style.STROKE);
        this.f2633b.setStrokeJoin(Join.MITER);
        this.f2633b.setStrokeCap(Cap.BUTT);
        this.f2633b.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0779j.DrawerArrowToggle, C0770a.drawerArrowStyle, C0778i.Base_Widget_AppCompat_DrawerArrowToggle);
        m2525a(obtainStyledAttributes.getColor(C0779j.DrawerArrowToggle_color, 0));
        float dimension = obtainStyledAttributes.getDimension(C0779j.DrawerArrowToggle_thickness, 0.0f);
        if (this.f2633b.getStrokeWidth() != dimension) {
            this.f2633b.setStrokeWidth(dimension);
            this.f2642l = (float) (((double) (dimension / 2.0f)) * Math.cos((double) f2631c));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(C0779j.DrawerArrowToggle_spinBars, true);
        if (this.f2638h != z) {
            this.f2638h = z;
            invalidateSelf();
        }
        dimension = (float) Math.round(obtainStyledAttributes.getDimension(C0779j.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (dimension != this.f2637g) {
            this.f2637g = dimension;
            invalidateSelf();
        }
        this.f2640j = obtainStyledAttributes.getDimensionPixelSize(C0779j.DrawerArrowToggle_drawableSize, 0);
        this.f2635e = (float) Math.round(obtainStyledAttributes.getDimension(C0779j.DrawerArrowToggle_barLength, 0.0f));
        this.f2634d = (float) Math.round(obtainStyledAttributes.getDimension(C0779j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f2636f = obtainStyledAttributes.getDimension(C0779j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void m2525a(int i) {
        if (i != this.f2633b.getColor()) {
            this.f2633b.setColor(i);
            invalidateSelf();
        }
    }

    public final void m2526a(boolean z) {
        if (this.f2641k != z) {
            this.f2641k = z;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        switch (this.f2643m) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 3:
                if (C0366a.m1056i(this) != 0) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
            default:
                if (C0366a.m1056i(this) != 1) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
        }
        float sqrt = (float) Math.sqrt((double) ((this.f2634d * this.f2634d) * 2.0f));
        float f = this.f2635e;
        float f2 = f + ((sqrt - f) * this.f2632a);
        sqrt = this.f2635e;
        float f3 = sqrt + ((this.f2636f - sqrt) * this.f2632a);
        float round = (float) Math.round(0.0f + ((this.f2642l - 0.0f) * this.f2632a));
        float f4 = 0.0f + ((f2631c - 0.0f) * this.f2632a);
        f = i != 0 ? 0.0f : -180.0f;
        sqrt = (((i != 0 ? 180.0f : 0.0f) - f) * this.f2632a) + f;
        f = (float) Math.round(((double) f2) * Math.cos((double) f4));
        f2 = (float) Math.round(((double) f2) * Math.sin((double) f4));
        this.f2639i.rewind();
        f4 = this.f2637g + this.f2633b.getStrokeWidth();
        f4 += ((-this.f2642l) - f4) * this.f2632a;
        float f5 = (-f3) / 2.0f;
        this.f2639i.moveTo(f5 + round, 0.0f);
        this.f2639i.rLineTo(f3 - (round * 2.0f), 0.0f);
        this.f2639i.moveTo(f5, f4);
        this.f2639i.rLineTo(f, f2);
        this.f2639i.moveTo(f5, -f4);
        this.f2639i.rLineTo(f, -f2);
        this.f2639i.close();
        canvas.save();
        f = this.f2633b.getStrokeWidth();
        canvas.translate((float) bounds.centerX(), ((f * 1.5f) + this.f2637g) + ((float) ((((int) ((((float) bounds.height()) - (3.0f * f)) - (this.f2637g * 2.0f))) / 4) * 2)));
        if (this.f2638h) {
            canvas.rotate(((float) ((i ^ this.f2641k) != 0 ? -1 : 1)) * sqrt);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f2639i, this.f2633b);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f2640j;
    }

    public final int getIntrinsicWidth() {
        return this.f2640j;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.f2633b.getAlpha()) {
            this.f2633b.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2633b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
