package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

final class C0259n {
    final ArrayList<C0258a> f1074a = new ArrayList();
    C0258a f1075b = null;
    ValueAnimator f1076c = null;
    private final AnimatorListener f1077d = new C02571(this);

    class C02571 extends AnimatorListenerAdapter {
        final /* synthetic */ C0259n f1071a;

        C02571(C0259n c0259n) {
            this.f1071a = c0259n;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f1071a.f1076c == animator) {
                this.f1071a.f1076c = null;
            }
        }
    }

    static class C0258a {
        final int[] f1072a;
        final ValueAnimator f1073b;

        C0258a(int[] iArr, ValueAnimator valueAnimator) {
            this.f1072a = iArr;
            this.f1073b = valueAnimator;
        }
    }

    C0259n() {
    }

    public final void m693a(int[] iArr, ValueAnimator valueAnimator) {
        C0258a c0258a = new C0258a(iArr, valueAnimator);
        valueAnimator.addListener(this.f1077d);
        this.f1074a.add(c0258a);
    }
}
