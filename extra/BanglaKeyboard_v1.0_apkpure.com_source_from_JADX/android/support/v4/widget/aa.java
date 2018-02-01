package android.support.v4.widget;

import android.support.v4.widget.SlidingPaneLayout.LayoutParams;
import android.view.View;

final class aa extends at {
    final /* synthetic */ SlidingPaneLayout f284a;

    private aa(SlidingPaneLayout slidingPaneLayout) {
        this.f284a = slidingPaneLayout;
    }

    public final void mo270a(int i) {
        if (this.f284a.f248q.m630a() != 0) {
            return;
        }
        if (this.f284a.f240i == 0.0f) {
            this.f284a.m559a(this.f284a.f239h);
            SlidingPaneLayout slidingPaneLayout = this.f284a;
            this.f284a.f239h;
            slidingPaneLayout.m560b();
            this.f284a.f249r = false;
            return;
        }
        slidingPaneLayout = this.f284a;
        this.f284a.f239h;
        slidingPaneLayout.m558a();
        this.f284a.f249r = true;
    }

    public final void mo271a(int i, int i2) {
        this.f284a.f248q.m633a(this.f284a.f239h, i2);
    }

    public final void mo272a(View view, float f) {
        int paddingRight;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f284a.m554e()) {
            paddingRight = layoutParams.rightMargin + this.f284a.getPaddingRight();
            if (f < 0.0f || (f == 0.0f && this.f284a.f240i > 0.5f)) {
                paddingRight += this.f284a.f242k;
            }
            paddingRight = (this.f284a.getWidth() - paddingRight) - this.f284a.f239h.getWidth();
        } else {
            paddingRight = layoutParams.leftMargin + this.f284a.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && this.f284a.f240i > 0.5f)) {
                paddingRight += this.f284a.f242k;
            }
        }
        this.f284a.f248q.m634a(paddingRight, view.getTop());
        this.f284a.invalidate();
    }

    public final void mo273a(View view, int i) {
        SlidingPaneLayout.m542a(this.f284a, i);
        this.f284a.invalidate();
    }

    public final boolean mo274a(View view) {
        return this.f284a.f243l ? false : ((LayoutParams) view.getLayoutParams()).f228b;
    }

    public final int mo275b(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) this.f284a.f239h.getLayoutParams();
        if (this.f284a.m554e()) {
            int width = this.f284a.getWidth() - ((layoutParams.rightMargin + this.f284a.getPaddingRight()) + this.f284a.f239h.getWidth());
            return Math.max(Math.min(i, width), width - this.f284a.f242k);
        }
        width = layoutParams.leftMargin + this.f284a.getPaddingLeft();
        return Math.min(Math.max(i, width), this.f284a.f242k + width);
    }

    public final void mo276b(View view) {
        this.f284a.m562c();
    }

    public final int mo277c(View view) {
        return this.f284a.f242k;
    }

    public final int mo278d(View view) {
        return view.getTop();
    }
}
