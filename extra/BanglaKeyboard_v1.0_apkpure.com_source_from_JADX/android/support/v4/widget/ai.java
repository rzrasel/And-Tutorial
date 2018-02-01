package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class ai extends Animation {
    final /* synthetic */ SwipeRefreshLayout f300a;

    ai(SwipeRefreshLayout swipeRefreshLayout) {
        this.f300a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        int i = 0;
        if (this.f300a.f261f != this.f300a.f259d) {
            i = this.f300a.f261f + ((int) (((float) (this.f300a.f259d - this.f300a.f261f)) * f));
        }
        i -= this.f300a.f258c.getTop();
        int top = this.f300a.f258c.getTop();
        if (i + top < 0) {
            i = 0 - top;
        }
        this.f300a.setTargetOffsetTopAndBottom(i);
    }
}
