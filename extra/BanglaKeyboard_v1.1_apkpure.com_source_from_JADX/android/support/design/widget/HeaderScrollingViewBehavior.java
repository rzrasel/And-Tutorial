package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.C0176c;
import android.support.v4.p014c.C0429a;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0696z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    final Rect f604a = new Rect();
    final Rect f605b = new Rect();
    int f606c = 0;
    int f607d;

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    abstract View mo105a(List<View> list);

    public boolean mo96a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo105a(coordinatorLayout.m481a(view));
            if (a != null) {
                if (C0679r.m1945r(a) && !C0679r.m1945r(view)) {
                    C0679r.m1926b(view, true);
                    if (C0679r.m1945r(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.m485a(view, i, i2, MeasureSpec.makeMeasureSpec(mo110c(a) + (size - a.getMeasuredHeight()), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    float mo109b(View view) {
        return 1.0f;
    }

    int mo110c(View view) {
        return view.getMeasuredHeight();
    }

    protected final void mo104c(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo105a(coordinatorLayout.m481a(view));
        if (a != null) {
            C0176c c0176c = (C0176c) view.getLayoutParams();
            Rect rect = this.f604a;
            rect.set(coordinatorLayout.getPaddingLeft() + c0176c.leftMargin, a.getBottom() + c0176c.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - c0176c.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - c0176c.bottomMargin);
            C0696z lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (!(lastWindowInsets == null || !C0679r.m1945r(coordinatorLayout) || C0679r.m1945r(view))) {
                rect.left += lastWindowInsets.m1993a();
                rect.right -= lastWindowInsets.m1996c();
            }
            Rect rect2 = this.f605b;
            int i2 = c0176c.f694c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C0656d.m1744a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i2 = m391d(a);
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.f606c = rect2.top - a.getBottom();
            return;
        }
        super.mo104c(coordinatorLayout, view, i);
        this.f606c = 0;
    }

    final int m391d(View view) {
        return this.f607d == 0 ? 0 : C0429a.m1144a((int) (mo109b(view) * ((float) this.f607d)), 0, this.f607d);
    }
}
