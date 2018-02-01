package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.orange.studio.banglatype.bk.C1713a;

public class ScrimInsetsFrameLayout extends FrameLayout {
    private Drawable f7925a;
    private Rect f7926b;
    private Rect f7927c = new Rect();
    private C1678a f7928d;

    public interface C1678a {
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7159a(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7159a(context, attributeSet, i);
    }

    private void m7159a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1713a.ScrimInsetsFrameLayout, i, 0);
        if (obtainStyledAttributes != null) {
            this.f7925a = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setWillNotDraw(true);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f7926b != null && this.f7925a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f7927c.set(0, 0, width, this.f7926b.top);
            this.f7925a.setBounds(this.f7927c);
            this.f7925a.draw(canvas);
            this.f7927c.set(0, height - this.f7926b.bottom, width, height);
            this.f7925a.setBounds(this.f7927c);
            this.f7925a.draw(canvas);
            this.f7927c.set(0, this.f7926b.top, this.f7926b.left, height - this.f7926b.bottom);
            this.f7925a.setBounds(this.f7927c);
            this.f7925a.draw(canvas);
            this.f7927c.set(width - this.f7926b.right, this.f7926b.top, width, height - this.f7926b.bottom);
            this.f7925a.setBounds(this.f7927c);
            this.f7925a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        this.f7926b = new Rect(rect);
        setWillNotDraw(this.f7925a == null);
        C0679r.m1928c(this);
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7925a != null) {
            this.f7925a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7925a != null) {
            this.f7925a.setCallback(null);
        }
    }

    public void setOnInsetsCallback(C1678a c1678a) {
        this.f7928d = c1678a;
    }
}
