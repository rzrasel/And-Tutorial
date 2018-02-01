package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;

final class ag {

    static class C0323a implements TypeEvaluator<Matrix> {
        final float[] f1270a = new float[9];
        final float[] f1271b = new float[9];
        final Matrix f1272c = new Matrix();

        C0323a() {
        }

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj2;
            ((Matrix) obj).getValues(this.f1270a);
            matrix.getValues(this.f1271b);
            for (int i = 0; i < 9; i++) {
                this.f1271b[i] = ((this.f1271b[i] - this.f1270a[i]) * f) + this.f1270a[i];
            }
            this.f1272c.setValues(this.f1271b);
            return this.f1272c;
        }
    }

    static Animator m888a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
