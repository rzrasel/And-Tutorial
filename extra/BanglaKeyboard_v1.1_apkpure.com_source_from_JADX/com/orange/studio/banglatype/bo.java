package com.orange.studio.banglatype;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.lang.ref.WeakReference;

final class bo implements AnimationListener {
    final WeakReference<View> f8235a;
    final int f8236b = 8;

    public bo(View view) {
        this.f8235a = new WeakReference(view);
    }

    public final void onAnimationEnd(Animation animation) {
        View view = (View) this.f8235a.get();
        if (view != null) {
            view.setVisibility(this.f8236b);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
