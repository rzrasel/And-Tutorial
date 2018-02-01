package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.orange.studio.banglatype.bk.C1713a;

public class ScrimInsetsLinearLayout extends LinearLayout {
    private Drawable f7929a;
    private Rect f7930b;
    private Rect f7931c = new Rect();
    private C1679a f7932d;

    public interface C1679a {
    }

    public ScrimInsetsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7160a(context, attributeSet, 0);
    }

    public ScrimInsetsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7160a(context, attributeSet, i);
    }

    private void m7160a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1713a.ScrimInsetsFrameLayout, i, 0);
        if (obtainStyledAttributes != null) {
            this.f7929a = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setWillNotDraw(true);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f7930b != null && this.f7929a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f7931c.set(0, 0, width, this.f7930b.top);
            this.f7929a.setBounds(this.f7931c);
            this.f7929a.draw(canvas);
            this.f7931c.set(0, height - this.f7930b.bottom, width, height);
            this.f7929a.setBounds(this.f7931c);
            this.f7929a.draw(canvas);
            this.f7931c.set(0, this.f7930b.top, this.f7930b.left, height - this.f7930b.bottom);
            this.f7929a.setBounds(this.f7931c);
            this.f7929a.draw(canvas);
            this.f7931c.set(width - this.f7930b.right, this.f7930b.top, width, height - this.f7930b.bottom);
            this.f7929a.setBounds(this.f7931c);
            this.f7929a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        this.f7930b = new Rect(rect);
        setWillNotDraw(this.f7929a == null);
        C0679r.m1928c(this);
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7929a != null) {
            this.f7929a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7929a != null) {
            this.f7929a.setCallback(null);
        }
    }

    public void setOnInsetsCallback(C1679a c1679a) {
        this.f7932d = c1679a;
    }
}
