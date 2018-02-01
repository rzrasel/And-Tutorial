package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0116a.C0115k;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class ForegroundLinearLayout extends LinearLayoutCompat {
    protected boolean f462a;
    boolean f463b;
    private Drawable f464c;
    private final Rect f465d;
    private final Rect f466e;
    private int f467f;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f465d = new Rect();
        this.f466e = new Rect();
        this.f467f = 119;
        this.f462a = true;
        this.f463b = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.ForegroundLinearLayout, i, 0);
        this.f467f = obtainStyledAttributes.getInt(C0115k.ForegroundLinearLayout_android_foregroundGravity, this.f467f);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0115k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f462a = obtainStyledAttributes.getBoolean(C0115k.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f464c != null) {
            Drawable drawable = this.f464c;
            if (this.f463b) {
                this.f463b = false;
                Rect rect = this.f465d;
                Rect rect2 = this.f466e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f462a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f467f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f464c != null) {
            this.f464c.setHotspot(f, f2);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f464c != null && this.f464c.isStateful()) {
            this.f464c.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f464c;
    }

    public int getForegroundGravity() {
        return this.f467f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f464c != null) {
            this.f464c.jumpToCurrentState();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f463b |= z;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f463b = true;
    }

    public void setForeground(Drawable drawable) {
        if (this.f464c != drawable) {
            if (this.f464c != null) {
                this.f464c.setCallback(null);
                unscheduleDrawable(this.f464c);
            }
            this.f464c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f467f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f467f != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f467f = i2;
            if (this.f467f == 119 && this.f464c != null) {
                this.f464c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f464c;
    }
}
