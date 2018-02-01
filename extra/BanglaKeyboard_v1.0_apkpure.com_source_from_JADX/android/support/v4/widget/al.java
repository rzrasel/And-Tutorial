package android.support.v4.widget;

import android.view.animation.Animation;

final class al extends ao {
    final /* synthetic */ SwipeRefreshLayout f304a;

    al(SwipeRefreshLayout swipeRefreshLayout) {
        this.f304a = swipeRefreshLayout;
        super(swipeRefreshLayout);
    }

    public final void onAnimationEnd(Animation animation) {
        this.f304a.f267l = 0.0f;
    }
}
