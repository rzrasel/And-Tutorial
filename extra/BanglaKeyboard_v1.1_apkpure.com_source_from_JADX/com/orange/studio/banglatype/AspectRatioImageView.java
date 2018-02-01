package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.orange.studio.banglatype.bk.C1713a;

public class AspectRatioImageView extends ImageView {
    private final boolean f7893a;
    private final boolean f7894b;
    private final int f7895c;
    private final double f7896d;
    private final double f7897e;

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        boolean z = false;
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1713a.AspectRatioImageView, i, 0);
        this.f7893a = (obtainStyledAttributes.getInt(0, 0) & 1) == 1;
        if ((obtainStyledAttributes.getInt(0, 0) & 2) == 2) {
            z = true;
        }
        this.f7894b = z;
        this.f7895c = obtainStyledAttributes.getResourceId(1, -1);
        this.f7896d = (double) obtainStyledAttributes.getFloat(2, 1.0f);
        this.f7897e = (double) obtainStyledAttributes.getFloat(3, 1.0f);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        double measuredWidth;
        Drawable drawable;
        MeasureSpec.getMode(i);
        MeasureSpec.getMode(i2);
        MeasureSpec.getSize(i);
        MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        double size = (double) (MeasureSpec.getSize(i) - paddingLeft);
        double size2 = (double) (MeasureSpec.getSize(i2) - paddingTop);
        if (!(this.f7895c == -1 || (this.f7896d == 1.0d && this.f7897e == 1.0d))) {
            for (View view = (View) getParent(); view != null; view = (View) view.getParent()) {
                if (view.getId() == this.f7895c) {
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        measuredWidth = layoutParams.width > 0 ? (((double) layoutParams.width) * this.f7896d) - ((double) paddingLeft) : (((double) view.getMeasuredWidth()) * this.f7896d) - ((double) paddingLeft);
                        double measuredHeight = layoutParams.height > 0 ? (((double) layoutParams.height) * this.f7897e) - ((double) paddingTop) : (((double) view.getMeasuredHeight()) * this.f7897e) - ((double) paddingTop);
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
                        } else if (!this.f7893a && this.f7894b) {
                            size = (double) drawable.getIntrinsicWidth();
                            measuredHeight = (double) drawable.getIntrinsicHeight();
                            if (size <= 0.0d || measuredHeight <= 0.0d) {
                                super.onMeasure(i, i2);
                                return;
                            }
                            measuredWidth = Math.min(Math.abs(measuredWidth / size), Math.abs(size2 / measuredHeight));
                            super.onMeasure(MeasureSpec.makeMeasureSpec(((int) ((size * measuredWidth) + 0.5d)) + paddingLeft, 1073741824), MeasureSpec.makeMeasureSpec(((int) ((measuredWidth * measuredHeight) + 0.5d)) + paddingTop, 1073741824));
                            return;
                        } else if (this.f7893a) {
                            size2 = (double) drawable.getIntrinsicWidth();
                            if (size2 <= 0.0d) {
                                super.onMeasure(i, MeasureSpec.makeMeasureSpec(((int) (((measuredWidth * ((double) drawable.getIntrinsicHeight())) / size2) + 0.5d)) + paddingTop, 1073741824));
                            } else {
                                super.onMeasure(i, i2);
                            }
                        } else if (this.f7894b) {
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
        if (!this.f7893a) {
        }
        if (this.f7893a) {
            size2 = (double) drawable.getIntrinsicWidth();
            if (size2 <= 0.0d) {
                super.onMeasure(i, i2);
            } else {
                super.onMeasure(i, MeasureSpec.makeMeasureSpec(((int) (((measuredWidth * ((double) drawable.getIntrinsicHeight())) / size2) + 0.5d)) + paddingTop, 1073741824));
            }
        } else if (this.f7894b) {
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
