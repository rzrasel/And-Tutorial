package com.orange.studio.banglatype;

import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;

final class C1736q implements Runnable {
    private final WeakReference<View> f8364a;
    private final Animation f8365b;

    public C1736q(View view, Animation animation) {
        this.f8364a = new WeakReference(view);
        this.f8365b = animation;
    }

    public final void run() {
        View view = (View) this.f8364a.get();
        Animation animation = this.f8365b;
        if (view != null && animation != null && view.getVisibility() != 8) {
            view.startAnimation(animation);
        }
    }
}
