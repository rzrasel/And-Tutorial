package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.v4.view.C0127n;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0696z;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout {
    Drawable f481a;
    Rect f482b;
    private Rect f483c;

    class C01281 implements C0127n {
        final /* synthetic */ ScrimInsetsFrameLayout f480a;

        C01281(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
            this.f480a = scrimInsetsFrameLayout;
        }

        public final C0696z mo61a(View view, C0696z c0696z) {
            if (this.f480a.f482b == null) {
                this.f480a.f482b = new Rect();
            }
            this.f480a.f482b.set(c0696z.m1993a(), c0696z.m1995b(), c0696z.m1996c(), c0696z.m1997d());
            this.f480a.mo164a(c0696z);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = this.f480a;
            boolean z = !(VERSION.SDK_INT >= 20 ? ((WindowInsets) c0696z.f2001a).hasSystemWindowInsets() : false) || this.f480a.f481a == null;
            scrimInsetsFrameLayout.setWillNotDraw(z);
            C0679r.m1928c(this.f480a);
            return c0696z.m1999f();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f483c = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.ScrimInsetsFrameLayout, i, C0114j.Widget_Design_ScrimInsetsFrameLayout);
        this.f481a = obtainStyledAttributes.getDrawable(C0115k.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0679r.m1914a((View) this, new C01281(this));
    }

    public void mo164a(C0696z c0696z) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f482b != null && this.f481a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f483c.set(0, 0, width, this.f482b.top);
            this.f481a.setBounds(this.f483c);
            this.f481a.draw(canvas);
            this.f483c.set(0, height - this.f482b.bottom, width, height);
            this.f481a.setBounds(this.f483c);
            this.f481a.draw(canvas);
            this.f483c.set(0, this.f482b.top, this.f482b.left, height - this.f482b.bottom);
            this.f481a.setBounds(this.f483c);
            this.f481a.draw(canvas);
            this.f483c.set(width - this.f482b.right, this.f482b.top, width, height - this.f482b.bottom);
            this.f481a.setBounds(this.f483c);
            this.f481a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f481a != null) {
            this.f481a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f481a != null) {
            this.f481a.setCallback(null);
        }
    }
}
