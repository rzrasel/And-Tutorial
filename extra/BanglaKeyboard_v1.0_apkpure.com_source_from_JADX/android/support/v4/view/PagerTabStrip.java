package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    private int f72f = this.e;
    private int f73g;
    private int f74h;
    private int f75i;
    private int f76j;
    private int f77k;
    private final Paint f78l = new Paint();
    private final Rect f79m = new Rect();
    private int f80n = 255;
    private boolean f81o = false;
    private boolean f82p = false;
    private int f83q;
    private boolean f84r;
    private float f85s;
    private float f86t;
    private int f87u;

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78l.setColor(this.f72f);
        float f = context.getResources().getDisplayMetrics().density;
        this.f73g = (int) ((3.0f * f) + 0.5f);
        this.f74h = (int) ((6.0f * f) + 0.5f);
        this.f75i = (int) (64.0f * f);
        this.f77k = (int) ((16.0f * f) + 0.5f);
        this.f83q = (int) ((1.0f * f) + 0.5f);
        this.f76j = (int) ((f * 32.0f) + 0.5f);
        this.f87u = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new ab(this));
        this.d.setFocusable(true);
        this.d.setOnClickListener(new ac(this));
        if (getBackground() == null) {
            this.f81o = true;
        }
    }

    final void mo145a(int i, float f, boolean z) {
        Rect rect = this.f79m;
        int height = getHeight();
        int i2 = height - this.f73g;
        rect.set(this.c.getLeft() - this.f77k, i2, this.c.getRight() + this.f77k, height);
        super.mo145a(i, f, z);
        this.f80n = (int) ((Math.abs(f - 0.5f) * 2.0f) * 255.0f);
        rect.union(this.c.getLeft() - this.f77k, i2, this.c.getRight() + this.f77k, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f81o;
    }

    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f76j);
    }

    public int getTabIndicatorColor() {
        return this.f72f;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.f77k;
        int right = this.c.getRight() + this.f77k;
        int i = height - this.f73g;
        this.f78l.setColor((this.f80n << 24) | (this.f72f & 16777215));
        canvas.drawRect((float) left, (float) i, (float) right, (float) height, this.f78l);
        if (this.f81o) {
            this.f78l.setColor(-16777216 | (this.f72f & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f83q), (float) (getWidth() - getPaddingRight()), (float) height, this.f78l);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f84r) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f85s = x;
                this.f86t = y;
                this.f84r = false;
                break;
            case 1:
                if (x >= ((float) (this.c.getLeft() - this.f77k))) {
                    if (x > ((float) (this.c.getRight() + this.f77k))) {
                        this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                        break;
                    }
                }
                this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                break;
                break;
            case 2:
                if (Math.abs(x - this.f85s) > ((float) this.f87u) || Math.abs(y - this.f86t) > ((float) this.f87u)) {
                    this.f84r = true;
                    break;
                }
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f82p) {
            this.f81o = (-16777216 & i) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f82p) {
            this.f81o = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f82p) {
            this.f81o = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f81o = z;
        this.f82p = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f74h) {
            i4 = this.f74h;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f72f = i;
        this.f78l.setColor(this.f72f);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getResources().getColor(i));
    }

    public void setTextSpacing(int i) {
        if (i < this.f75i) {
            i = this.f75i;
        }
        super.setTextSpacing(i);
    }
}
