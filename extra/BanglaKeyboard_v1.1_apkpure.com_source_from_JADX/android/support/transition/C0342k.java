package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.widget.ImageView;

final class C0342k {
    private static final C0344n f1346a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1346a = new C0346m();
        } else {
            f1346a = new C0345l();
        }
    }

    static void m981a(ImageView imageView) {
        f1346a.mo258a(imageView);
    }

    static void m982a(ImageView imageView, Animator animator) {
        f1346a.mo259a(imageView, animator);
    }

    static void m983a(ImageView imageView, Matrix matrix) {
        f1346a.mo260a(imageView, matrix);
    }
}
