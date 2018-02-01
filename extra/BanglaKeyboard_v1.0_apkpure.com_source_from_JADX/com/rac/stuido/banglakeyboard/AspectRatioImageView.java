package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public class AspectRatioImageView extends ImageView {
    private final boolean f2535a;
    private final boolean f2536b;
    private final int f2537c;
    private final double f2538d;
    private final double f2539e;

    public AspectRatioImageView(Context context) {
        this(context, null);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        boolean z = false;
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, br.AspectRatioImageView, i, 0);
        this.f2535a = (obtainStyledAttributes.getInt(0, 0) & 1) == 1;
        if ((obtainStyledAttributes.getInt(0, 0) & 2) == 2) {
            z = true;
        }
        this.f2536b = z;
        this.f2537c = obtainStyledAttributes.getResourceId(1, -1);
        this.f2538d = (double) obtainStyledAttributes.getFloat(2, 1.0f);
        this.f2539e = (double) obtainStyledAttributes.getFloat(3, 1.0f);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        double measuredWidth;
        Drawable drawable;
        double intrinsicWidth;
        MeasureSpec.getMode(i);
        MeasureSpec.getMode(i2);
        MeasureSpec.getSize(i);
        MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        double size = (double) (MeasureSpec.getSize(i) - paddingLeft);
        double size2 = (double) (MeasureSpec.getSize(i2) - paddingTop);
        if (!(this.f2537c == -1 || (this.f2538d == 1.0d && this.f2539e == 1.0d))) {
            for (View view = (View) getParent(); view != null; view = (View) view.getParent()) {
                if (view.getId() == this.f2537c) {
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        measuredWidth = layoutParams.width > 0 ? (((double) layoutParams.width) * this.f2538d) - ((double) paddingLeft) : (((double) view.getMeasuredWidth()) * this.f2538d) - ((double) paddingLeft);
                        double measuredHeight = layoutParams.height > 0 ? (((double) layoutParams.height) * this.f2539e) - ((double) paddingTop) : (((double) view.getMeasuredHeight()) * this.f2539e) - ((double) paddingTop);
                        if (measuredWidth > 0.0d && size > measuredWidth) {
                            size = measuredWidth;
                        }
                        measuredWidth = (measuredHeight <= 0.0d || size2 <= measuredHeight) ? size2 : measuredHeight;
                        size2 = measuredWidth;
                        measuredWidth = size;
                        drawable = getDrawable();
                        if (drawable != null) {
                            super.onMeasure(i, i2);
                            return;
                        } else if (!this.f2535a && this.f2536b) {
                            size = (double) drawable.getIntrinsicWidth();
                            measuredHeight = (double) drawable.getIntrinsicHeight();
                            "diw: " + size + ", dih: " + measuredHeight;
                            if (size <= 0.0d || measuredHeight <= 0.0d) {
                                super.onMeasure(i, i2);
                                return;
                            }
                            measuredWidth = Math.min(Math.abs(measuredWidth / size), Math.abs(size2 / measuredHeight));
                            super.onMeasure(MeasureSpec.makeMeasureSpec(((int) ((size * measuredWidth) + 0.5d)) + paddingLeft, 1073741824), MeasureSpec.makeMeasureSpec(((int) ((measuredWidth * measuredHeight) + 0.5d)) + paddingTop, 1073741824));
                            return;
                        } else if (this.f2535a) {
                            intrinsicWidth = (double) drawable.getIntrinsicWidth();
                            if (intrinsicWidth <= 0.0d) {
                                super.onMeasure(i, MeasureSpec.makeMeasureSpec(((int) (((measuredWidth * ((double) drawable.getIntrinsicHeight())) / intrinsicWidth) + 0.5d)) + paddingTop, 1073741824));
                            } else {
                                super.onMeasure(i, i2);
                            }
                        } else if (this.f2536b) {
                            super.onMeasure(i, i2);
                        } else {
                            measuredWidth = (double) drawable.getIntrinsicHeight();
                            if (measuredWidth <= 0.0d) {
                                super.onMeasure(MeasureSpec.makeMeasureSpec(((int) (((((double) drawable.getIntrinsicWidth()) * size2) / measuredWidth) + 0.5d)) + paddingLeft, 1073741824), i2);
                            } else {
                                super.onMeasure(i, i2);
                            }
                        }
                    }
                }
            }
        }
        measuredWidth = size;
        drawable = getDrawable();
        if (drawable != null) {
            super.onMeasure(i, i2);
            return;
        }
        if (!this.f2535a) {
        }
        if (this.f2535a) {
            intrinsicWidth = (double) drawable.getIntrinsicWidth();
            if (intrinsicWidth <= 0.0d) {
                super.onMeasure(i, i2);
            } else {
                super.onMeasure(i, MeasureSpec.makeMeasureSpec(((int) (((measuredWidth * ((double) drawable.getIntrinsicHeight())) / intrinsicWidth) + 0.5d)) + paddingTop, 1073741824));
            }
        } else if (this.f2536b) {
            super.onMeasure(i, i2);
        } else {
            measuredWidth = (double) drawable.getIntrinsicHeight();
            if (measuredWidth <= 0.0d) {
                super.onMeasure(i, i2);
            } else {
                super.onMeasure(MeasureSpec.makeMeasureSpec(((int) (((((double) drawable.getIntrinsicWidth()) * size2) / measuredWidth) + 0.5d)) + paddingLeft, 1073741824), i2);
            }
        }
    }
}
