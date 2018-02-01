package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.v4.view.C0679r;
import android.support.v4.widget.C0769o;
import android.support.v4.widget.C0769o.C0161a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {
    private boolean f781a;
    C0769o f782b;
    C0193a f783c;
    int f784d = 2;
    float f785e = 0.5f;
    float f786f = 0.0f;
    float f787g = 0.5f;
    private float f788h = 0.0f;
    private boolean f789i;
    private final C0161a f790j = new C01921(this);

    class C01921 extends C0161a {
        final /* synthetic */ SwipeDismissBehavior f775a;
        private int f776b;
        private int f777c = -1;

        C01921(SwipeDismissBehavior swipeDismissBehavior) {
            this.f775a = swipeDismissBehavior;
        }

        public final int mo165a(View view) {
            return view.getWidth();
        }

        public final void mo114a(int i) {
            if (this.f775a.f783c != null) {
                this.f775a.f783c.mo173a(i);
            }
        }

        public final void mo115a(View view, float f, float f2) {
            boolean z;
            int i;
            boolean z2 = true;
            this.f777c = -1;
            int width = view.getWidth();
            if (f != 0.0f) {
                z = C0679r.m1932e(view) == 1;
                z = this.f775a.f784d == 2 ? true : this.f775a.f784d == 0 ? z ? f < 0.0f : f > 0.0f : this.f775a.f784d == 1 ? z ? f > 0.0f : f < 0.0f : false;
            } else {
                z = Math.abs(view.getLeft() - this.f776b) >= Math.round(((float) view.getWidth()) * this.f775a.f785e);
            }
            if (z) {
                i = view.getLeft() < this.f776b ? this.f776b - width : this.f776b + width;
            } else {
                i = this.f776b;
                z2 = false;
            }
            if (this.f775a.f782b.m2213a(i, view.getTop())) {
                C0679r.m1916a(view, new C0194b(this.f775a, view, z2));
            } else if (z2 && this.f775a.f783c != null) {
                this.f775a.f783c.mo174a(view);
            }
        }

        public final boolean mo116a(View view, int i) {
            return this.f777c == -1 && this.f775a.mo177b(view);
        }

        public final void mo117b(View view, int i) {
            float width = ((float) this.f776b) + (((float) view.getWidth()) * this.f775a.f786f);
            float width2 = ((float) this.f776b) + (((float) view.getWidth()) * this.f775a.f787g);
            if (((float) i) <= width) {
                view.setAlpha(1.0f);
            } else if (((float) i) >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m532a(1.0f - SwipeDismissBehavior.m533a(width, width2, (float) i)));
            }
        }

        public final int mo118c(View view, int i) {
            return view.getTop();
        }

        public final int mo119d(View view, int i) {
            int width;
            int i2;
            Object obj = C0679r.m1932e(view) == 1 ? 1 : null;
            if (this.f775a.f784d == 0) {
                if (obj != null) {
                    width = this.f776b - view.getWidth();
                    i2 = this.f776b;
                } else {
                    width = this.f776b;
                    i2 = this.f776b + view.getWidth();
                }
            } else if (this.f775a.f784d != 1) {
                width = this.f776b - view.getWidth();
                i2 = this.f776b + view.getWidth();
            } else if (obj != null) {
                width = this.f776b;
                i2 = this.f776b + view.getWidth();
            } else {
                width = this.f776b - view.getWidth();
                i2 = this.f776b;
            }
            return SwipeDismissBehavior.m534a(width, i, i2);
        }

        public final void mo166e(View view, int i) {
            this.f777c = i;
            this.f776b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public interface C0193a {
        void mo173a(int i);

        void mo174a(View view);
    }

    private class C0194b implements Runnable {
        final /* synthetic */ SwipeDismissBehavior f778a;
        private final View f779b;
        private final boolean f780c;

        C0194b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
            this.f778a = swipeDismissBehavior;
            this.f779b = view;
            this.f780c = z;
        }

        public final void run() {
            if (this.f778a.f782b != null && this.f778a.f782b.m2220c()) {
                C0679r.m1916a(this.f779b, (Runnable) this);
            } else if (this.f780c && this.f778a.f783c != null) {
                this.f778a.f783c.mo174a(this.f779b);
            }
        }
    }

    static float m532a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    static float m533a(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    static int m534a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public boolean mo87a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f781a;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f781a = coordinatorLayout.m487a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.f781a;
                break;
            case 1:
            case 3:
                this.f781a = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.f782b == null) {
            this.f782b = this.f789i ? C0769o.m2195a((ViewGroup) coordinatorLayout, this.f788h, this.f790j) : C0769o.m2196a((ViewGroup) coordinatorLayout, this.f790j);
        }
        return this.f782b.m2214a(motionEvent);
    }

    public final boolean mo88b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f782b == null) {
            return false;
        }
        this.f782b.m2219b(motionEvent);
        return true;
    }

    public boolean mo177b(View view) {
        return true;
    }
}
