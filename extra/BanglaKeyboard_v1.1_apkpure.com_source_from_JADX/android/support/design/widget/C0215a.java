package android.support.design.widget;

import android.support.v4.view.p020b.C0647a;
import android.support.v4.view.p020b.C0648b;
import android.support.v4.view.p020b.C0649c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

final class C0215a {
    static final Interpolator f915a = new LinearInterpolator();
    static final Interpolator f916b = new C0648b();
    static final Interpolator f917c = new C0647a();
    static final Interpolator f918d = new C0649c();
    static final Interpolator f919e = new DecelerateInterpolator();

    static float m594a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    static int m595a(int i, int i2, float f) {
        return Math.round(((float) (i2 - i)) * f) + i;
    }
}
