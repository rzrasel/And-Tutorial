package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class aj extends Animation {
    final /* synthetic */ SwipeRefreshLayout f301a;

    aj(SwipeRefreshLayout swipeRefreshLayout) {
        this.f301a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f301a.f257b.m611a(this.f301a.f266k + ((0.0f - this.f301a.f266k) * f));
    }
}
