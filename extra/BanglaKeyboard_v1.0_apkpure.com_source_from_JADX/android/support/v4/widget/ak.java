package android.support.v4.widget;

import android.view.animation.Animation;

final class ak extends ao {
    final /* synthetic */ SwipeRefreshLayout f303a;

    ak(SwipeRefreshLayout swipeRefreshLayout) {
        this.f303a = swipeRefreshLayout;
        super(swipeRefreshLayout);
    }

    public final void onAnimationEnd(Animation animation) {
        this.f303a.f269n = 0;
    }
}
