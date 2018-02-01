package com.orange.studio.banglatype;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MaxTextureSizeLinearLayout extends LinearLayout {
    public MaxTextureSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public MaxTextureSizeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT >= 14 && canvas.isHardwareAccelerated()) {
            aj.f8133a = canvas.getMaximumBitmapWidth();
            aj.f8134b = canvas.getMaximumBitmapHeight();
        }
        setWillNotDraw(true);
    }
}
