package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.v4.view.C0097w;
import android.support.v4.view.an;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

public class SwipeRefreshLayout extends ViewGroup {
    private static final String f253a = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] f254v = new int[]{16842766};
    private final Runnable f255A = new am(this);
    private final Runnable f256B = new an(this);
    private ah f257b;
    private View f258c;
    private int f259d;
    private ap f260e;
    private int f261f;
    private boolean f262g = false;
    private int f263h;
    private float f264i = -1.0f;
    private int f265j;
    private float f266k = 0.0f;
    private float f267l = 0.0f;
    private int f268m;
    private int f269n;
    private float f270o;
    private float f271p;
    private boolean f272q;
    private int f273r = -1;
    private boolean f274s;
    private final DecelerateInterpolator f275t;
    private final AccelerateInterpolator f276u;
    private final Animation f277w = new ai(this);
    private Animation f278x = new aj(this);
    private final AnimationListener f279y = new ak(this);
    private final AnimationListener f280z = new al(this);

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f263h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f265j = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f257b = new ah(this);
        this.f268m = (int) (getResources().getDisplayMetrics().density * 4.0f);
        this.f275t = new DecelerateInterpolator(2.0f);
        this.f276u = new AccelerateInterpolator(1.5f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f254v);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void m565a() {
        if (this.f258c == null) {
            if (getChildCount() <= 1 || isInEditMode()) {
                this.f258c = getChildAt(0);
                this.f259d = this.f258c.getTop() + getPaddingTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
        }
        if (this.f264i == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.f264i = (float) ((int) Math.min(((float) ((View) getParent()).getHeight()) * 0.6f, getResources().getDisplayMetrics().density * 120.0f));
        }
    }

    static /* synthetic */ void m567a(SwipeRefreshLayout swipeRefreshLayout, int i, AnimationListener animationListener) {
        swipeRefreshLayout.f261f = i;
        swipeRefreshLayout.f277w.reset();
        swipeRefreshLayout.f277w.setDuration((long) swipeRefreshLayout.f265j);
        swipeRefreshLayout.f277w.setAnimationListener(animationListener);
        swipeRefreshLayout.f277w.setInterpolator(swipeRefreshLayout.f275t);
        swipeRefreshLayout.f258c.startAnimation(swipeRefreshLayout.f277w);
    }

    private void m568a(MotionEvent motionEvent) {
        int b = C0097w.m492b(motionEvent);
        if (C0097w.m493b(motionEvent, b) == this.f273r) {
            b = b == 0 ? 1 : 0;
            this.f271p = C0097w.m496d(motionEvent, b);
            this.f273r = C0097w.m493b(motionEvent, b);
        }
    }

    private boolean m570b() {
        if (VERSION.SDK_INT >= 14) {
            return an.m332a(this.f258c);
        }
        if (!(this.f258c instanceof AbsListView)) {
            return this.f258c.getScrollY() > 0;
        } else {
            AbsListView absListView = (AbsListView) this.f258c;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
    }

    private void setTargetOffsetTopAndBottom(int i) {
        this.f258c.offsetTopAndBottom(i);
        this.f269n = this.f258c.getTop();
    }

    private void setTriggerPercentage(float f) {
        if (f == 0.0f) {
            this.f267l = 0.0f;
            return;
        }
        this.f267l = f;
        this.f257b.m611a(f);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f257b.m613a(canvas);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f256B);
        removeCallbacks(this.f255A);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f255A);
        removeCallbacks(this.f256B);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m565a();
        int a = C0097w.m490a(motionEvent);
        if (this.f274s && a == 0) {
            this.f274s = false;
        }
        if (!isEnabled() || this.f274s || m570b()) {
            return false;
        }
        switch (a) {
            case 0:
                float y = motionEvent.getY();
                this.f270o = y;
                this.f271p = y;
                this.f273r = C0097w.m493b(motionEvent, 0);
                this.f272q = false;
                this.f267l = 0.0f;
                break;
            case 1:
            case 3:
                this.f272q = false;
                this.f267l = 0.0f;
                this.f273r = -1;
                break;
            case 2:
                String str;
                if (this.f273r != -1) {
                    a = C0097w.m491a(motionEvent, this.f273r);
                    if (a >= 0) {
                        float d = C0097w.m496d(motionEvent, a);
                        if (d - this.f270o > ((float) this.f263h)) {
                            this.f271p = d;
                            this.f272q = true;
                            break;
                        }
                    }
                    str = f253a;
                    return false;
                }
                str = f253a;
                return false;
                break;
            case 6:
                m568a(motionEvent);
                break;
        }
        return this.f272q;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f257b.m612a(measuredWidth, this.f268m);
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f269n + getPaddingTop();
            childAt.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 1 && !isInEditMode()) {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        } else if (getChildCount() > 0) {
            getChildAt(0).measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        int a = C0097w.m490a(motionEvent);
        if (this.f274s && a == 0) {
            this.f274s = false;
        }
        if (!isEnabled() || this.f274s || m570b()) {
            return false;
        }
        float y;
        switch (a) {
            case 0:
                y = motionEvent.getY();
                this.f270o = y;
                this.f271p = y;
                this.f273r = C0097w.m493b(motionEvent, 0);
                this.f272q = false;
                this.f267l = 0.0f;
                break;
            case 1:
            case 3:
                this.f272q = false;
                this.f267l = 0.0f;
                this.f273r = -1;
                return false;
            case 2:
                a = C0097w.m491a(motionEvent, this.f273r);
                if (a >= 0) {
                    float d = C0097w.m496d(motionEvent, a);
                    y = d - this.f270o;
                    if (!this.f272q && y > ((float) this.f263h)) {
                        this.f272q = true;
                    }
                    if (this.f272q) {
                        if (y > this.f264i) {
                            removeCallbacks(this.f256B);
                            this.f255A.run();
                            setRefreshing(true);
                            ap apVar = this.f260e;
                        } else {
                            setTriggerPercentage(this.f276u.getInterpolation(y / this.f264i));
                            a = (int) y;
                            int top = this.f258c.getTop();
                            if (((float) a) > this.f264i) {
                                i = (int) this.f264i;
                            } else if (a >= 0) {
                                i = a;
                            }
                            setTargetOffsetTopAndBottom(i - top);
                            if (this.f271p <= d || this.f258c.getTop() != getPaddingTop()) {
                                removeCallbacks(this.f256B);
                                postDelayed(this.f256B, 300);
                            } else {
                                removeCallbacks(this.f256B);
                            }
                        }
                        this.f271p = d;
                        break;
                    }
                }
                String str = f253a;
                return false;
                break;
            case 5:
                i = C0097w.m492b(motionEvent);
                this.f271p = C0097w.m496d(motionEvent, i);
                this.f273r = C0097w.m493b(motionEvent, i);
                break;
            case 6:
                m568a(motionEvent);
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public void setOnRefreshListener(ap apVar) {
        this.f260e = apVar;
    }

    public void setRefreshing(boolean z) {
        if (this.f262g != z) {
            m565a();
            this.f267l = 0.0f;
            this.f262g = z;
            if (this.f262g) {
                this.f257b.m610a();
            } else {
                this.f257b.m614b();
            }
        }
    }
}
