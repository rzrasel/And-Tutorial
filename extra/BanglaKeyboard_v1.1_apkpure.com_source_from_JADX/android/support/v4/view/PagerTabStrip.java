package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0392a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    private int f1791g = this.f;
    private int f1792h;
    private int f1793i;
    private int f1794j;
    private int f1795k;
    private int f1796l;
    private final Paint f1797m = new Paint();
    private final Rect f1798n = new Rect();
    private int f1799o = 255;
    private boolean f1800p = false;
    private boolean f1801q = false;
    private int f1802r;
    private boolean f1803s;
    private float f1804t;
    private float f1805u;
    private int f1806v;

    class C05911 implements OnClickListener {
        final /* synthetic */ PagerTabStrip f1773a;

        C05911(PagerTabStrip pagerTabStrip) {
            this.f1773a = pagerTabStrip;
        }

        public final void onClick(View view) {
            this.f1773a.a.setCurrentItem(this.f1773a.a.getCurrentItem() - 1);
        }
    }

    class C05922 implements OnClickListener {
        final /* synthetic */ PagerTabStrip f1774a;

        C05922(PagerTabStrip pagerTabStrip) {
            this.f1774a = pagerTabStrip;
        }

        public final void onClick(View view) {
            this.f1774a.a.setCurrentItem(this.f1774a.a.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1797m.setColor(this.f1791g);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1792h = (int) ((3.0f * f) + 0.5f);
        this.f1793i = (int) ((6.0f * f) + 0.5f);
        this.f1794j = (int) (64.0f * f);
        this.f1796l = (int) ((16.0f * f) + 0.5f);
        this.f1802r = (int) ((1.0f * f) + 0.5f);
        this.f1795k = (int) ((f * 32.0f) + 0.5f);
        this.f1806v = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new C05911(this));
        this.d.setFocusable(true);
        this.d.setOnClickListener(new C05922(this));
        if (getBackground() == null) {
            this.f1800p = true;
        }
    }

    final void mo581a(int i, float f, boolean z) {
        Rect rect = this.f1798n;
        int height = getHeight();
        int i2 = height - this.f1792h;
        rect.set(this.c.getLeft() - this.f1796l, i2, this.c.getRight() + this.f1796l, height);
        super.mo581a(i, f, z);
        this.f1799o = (int) ((Math.abs(f - 0.5f) * 2.0f) * 255.0f);
        rect.union(this.c.getLeft() - this.f1796l, i2, this.c.getRight() + this.f1796l, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f1800p;
    }

    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f1795k);
    }

    public int getTabIndicatorColor() {
        return this.f1791g;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.f1796l;
        int right = this.c.getRight() + this.f1796l;
        int i = height - this.f1792h;
        this.f1797m.setColor((this.f1799o << 24) | (this.f1791g & 16777215));
        canvas.drawRect((float) left, (float) i, (float) right, (float) height, this.f1797m);
        if (this.f1800p) {
            this.f1797m.setColor(-16777216 | (this.f1791g & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f1802r), (float) (getWidth() - getPaddingRight()), (float) height, this.f1797m);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f1803s) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f1804t = x;
                this.f1805u = y;
                this.f1803s = false;
                break;
            case 1:
                if (x >= ((float) (this.c.getLeft() - this.f1796l))) {
                    if (x > ((float) (this.c.getRight() + this.f1796l))) {
                        this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                        break;
                    }
                }
                this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                break;
                break;
            case 2:
                if (Math.abs(x - this.f1804t) > ((float) this.f1806v) || Math.abs(y - this.f1805u) > ((float) this.f1806v)) {
                    this.f1803s = true;
                    break;
                }
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f1801q) {
            this.f1800p = (-16777216 & i) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f1801q) {
            this.f1800p = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f1801q) {
            this.f1800p = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f1800p = z;
        this.f1801q = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f1793i) {
            i4 = this.f1793i;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f1791g = i;
        this.f1797m.setColor(this.f1791g);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C0392a.getColor(getContext(), i));
    }

    public void setTextSpacing(int i) {
        if (i < this.f1794j) {
            i = this.f1794j;
        }
        super.setTextSpacing(i);
    }
}
