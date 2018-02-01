package com.rac.stuido.banglakeyboard;

import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;

final class al implements Runnable {
    private final WeakReference f2647a;
    private final Animation f2648b;

    public al(View view, Animation animation) {
        this.f2647a = new WeakReference(view);
        this.f2648b = animation;
    }

    public final void run() {
        View view = (View) this.f2647a.get();
        Animation animation = this.f2648b;
        if (view != null && animation != null && view.getVisibility() != 8) {
            view.startAnimation(animation);
        }
    }
}
