package com.rac.stuido.banglakeyboard;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class by implements AnimationListener {
    final /* synthetic */ SlidingPanel f2715a;

    by(SlidingPanel slidingPanel) {
        this.f2715a = slidingPanel;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f2715a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
