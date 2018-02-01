package com.orange.studio.banglatype;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.orange.studio.banglatype.bk.C1713a;

public class ScrimInsetsRelativeLayout extends RelativeLayout {
    private Drawable f7933a;
    private Rect f7934b;
    private Rect f7935c = new Rect();
    private C1680a f7936d;

    public interface C1680a {
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7161a(context, attributeSet, 0);
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7161a(context, attributeSet, i);
    }

    private void m7161a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1713a.ScrimInsetsFrameLayout, i, 0);
        if (obtainStyledAttributes != null) {
            this.f7933a = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setWillNotDraw(true);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f7934b != null && this.f7933a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f7935c.set(0, 0, width, this.f7934b.top);
            this.f7933a.setBounds(this.f7935c);
            this.f7933a.draw(canvas);
            this.f7935c.set(0, height - this.f7934b.bottom, width, height);
            this.f7933a.setBounds(this.f7935c);
            this.f7933a.draw(canvas);
            this.f7935c.set(0, this.f7934b.top, this.f7934b.left, height - this.f7934b.bottom);
            this.f7933a.setBounds(this.f7935c);
            this.f7933a.draw(canvas);
            this.f7935c.set(width - this.f7934b.right, this.f7934b.top, width, height - this.f7934b.bottom);
            this.f7933a.setBounds(this.f7935c);
            this.f7933a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        this.f7934b = new Rect(rect);
        setWillNotDraw(this.f7933a == null);
        C0679r.m1928c(this);
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7933a != null) {
            this.f7933a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7933a != null) {
            this.f7933a.setCallback(null);
        }
    }

    public void setOnInsetsCallback(C1680a c1680a) {
        this.f7936d = c1680a;
    }
}
