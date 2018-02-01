package com.rac.stuido.banglakeyboard;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.lang.ref.WeakReference;

final class bu implements AnimationListener {
    final WeakReference f2711a;
    final int f2712b = 8;

    public bu(View view) {
        this.f2711a = new WeakReference(view);
    }

    public final void onAnimationEnd(Animation animation) {
        View view = (View) this.f2711a.get();
        if (view != null) {
            view.setVisibility(this.f2712b);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
