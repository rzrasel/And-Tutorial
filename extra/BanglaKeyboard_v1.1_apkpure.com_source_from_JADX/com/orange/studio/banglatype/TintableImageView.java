package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.support.v7.p023c.p024a.C0862b;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.orange.studio.banglatype.bk.C1713a;

public class TintableImageView extends ImageView {
    private ColorStateList f7949a;
    private Mode f7950b = Mode.SRC_IN;

    public TintableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7165a(context, attributeSet, 0);
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7165a(context, attributeSet, i);
    }

    private void m7164a() {
        if (this.f7949a != null) {
            setColorFilter(this.f7949a.getColorForState(getDrawableState(), 0), this.f7950b);
        }
    }

    private void m7165a(Context context, AttributeSet attributeSet, int i) {
        if (context != null) {
            try {
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C1713a.TintableImageView, i, 0);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    this.f7949a = C0862b.m2513a(context, resourceId);
                } else {
                    this.f7949a = obtainStyledAttributes.getColorStateList(0);
                }
                obtainStyledAttributes.recycle();
                m7164a();
            } catch (NotFoundException e) {
            }
        }
    }

    public final void m7166a(ColorStateList colorStateList, Mode mode) {
        this.f7949a = colorStateList;
        this.f7950b = mode;
        if (colorStateList != null) {
            super.setColorFilter(colorStateList.getColorForState(getDrawableState(), 0), mode);
            invalidate();
            return;
        }
        super.clearColorFilter();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f7949a != null && this.f7949a.isStateful()) {
            m7164a();
        }
    }
}
