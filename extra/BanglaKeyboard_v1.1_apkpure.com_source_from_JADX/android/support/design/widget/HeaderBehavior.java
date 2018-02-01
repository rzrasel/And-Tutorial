package android.support.design.widget;

import android.content.Context;
import android.support.v4.p014c.C0429a;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    OverScroller f588a;
    private Runnable f589b;
    private boolean f590c;
    private int f591d = -1;
    private int f592e;
    private int f593f = -1;
    private VelocityTracker f594g;

    private class C0186a implements Runnable {
        final /* synthetic */ HeaderBehavior f753a;
        private final CoordinatorLayout f754b;
        private final V f755c;

        C0186a(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, V v) {
            this.f753a = headerBehavior;
            this.f754b = coordinatorLayout;
            this.f755c = v;
        }

        public final void run() {
            if (this.f755c != null && this.f753a.f588a != null) {
                if (this.f753a.f588a.computeScrollOffset()) {
                    this.f753a.a_(this.f754b, this.f755c, this.f753a.f588a.getCurrY());
                    C0679r.m1916a(this.f755c, (Runnable) this);
                    return;
                }
                this.f753a.mo92a(this.f754b, this.f755c);
            }
        }
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void m356d() {
        if (this.f594g == null) {
            this.f594g = VelocityTracker.obtain();
        }
    }

    int mo89a() {
        return mo103c();
    }

    int mo90a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int c = mo103c();
        if (i2 == 0 || c < i2 || c > i3) {
            return 0;
        }
        int a = C0429a.m1144a(i, i2, i3);
        if (c == a) {
            return 0;
        }
        a_(a);
        return c - a;
    }

    int mo91a(V v) {
        return v.getHeight();
    }

    void mo92a(CoordinatorLayout coordinatorLayout, V v) {
    }

    public final boolean mo87a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f593f < 0) {
            this.f593f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f590c) {
            return true;
        }
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f590c = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (mo102b() && coordinatorLayout.m487a((View) v, x, y)) {
                    this.f592e = y;
                    this.f591d = motionEvent.getPointerId(0);
                    m356d();
                    break;
                }
            case 1:
            case 3:
                this.f590c = false;
                this.f591d = -1;
                if (this.f594g != null) {
                    this.f594g.recycle();
                    this.f594g = null;
                    break;
                }
                break;
            case 2:
                y = this.f591d;
                if (y != -1) {
                    y = motionEvent.findPointerIndex(y);
                    if (y != -1) {
                        y = (int) motionEvent.getY(y);
                        if (Math.abs(y - this.f592e) > this.f593f) {
                            this.f590c = true;
                            this.f592e = y;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f594g != null) {
            this.f594g.addMovement(motionEvent);
        }
        return this.f590c;
    }

    final int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo90a(coordinatorLayout, v, i, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    final int m362b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo90a(coordinatorLayout, v, mo89a() - i, i2, i3);
    }

    int mo99b(V v) {
        return -v.getHeight();
    }

    boolean mo102b() {
        return false;
    }

    public final boolean mo88b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f593f < 0) {
            this.f593f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.m487a((View) v, (int) motionEvent.getX(), y) && mo102b()) {
                    this.f592e = y;
                    this.f591d = motionEvent.getPointerId(0);
                    m356d();
                    break;
                }
                return false;
                break;
            case 1:
                if (this.f594g != null) {
                    this.f594g.addMovement(motionEvent);
                    this.f594g.computeCurrentVelocity(1000);
                    float yVelocity = this.f594g.getYVelocity(this.f591d);
                    int i = -mo91a(v);
                    if (this.f589b != null) {
                        v.removeCallbacks(this.f589b);
                        this.f589b = null;
                    }
                    if (this.f588a == null) {
                        this.f588a = new OverScroller(v.getContext());
                    }
                    this.f588a.fling(0, mo103c(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (!this.f588a.computeScrollOffset()) {
                        mo92a(coordinatorLayout, v);
                        break;
                    }
                    this.f589b = new C0186a(this, coordinatorLayout, v);
                    C0679r.m1916a((View) v, this.f589b);
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f591d);
                if (findPointerIndex != -1) {
                    findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f592e - findPointerIndex;
                    if (!this.f590c && Math.abs(i2) > this.f593f) {
                        this.f590c = true;
                        i2 = i2 > 0 ? i2 - this.f593f : i2 + this.f593f;
                    }
                    if (this.f590c) {
                        this.f592e = findPointerIndex;
                        m362b(coordinatorLayout, v, i2, mo99b(v), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
        }
        this.f590c = false;
        this.f591d = -1;
        if (this.f594g != null) {
            this.f594g.recycle();
            this.f594g = null;
        }
        if (this.f594g != null) {
            this.f594g.addMovement(motionEvent);
        }
        return true;
    }
}
