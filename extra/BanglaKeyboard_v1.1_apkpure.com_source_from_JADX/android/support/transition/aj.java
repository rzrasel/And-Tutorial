package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.support.transition.C0359y.C0358a;
import android.view.View;

final class aj {

    private static class C0324a extends AnimatorListenerAdapter {
        private final View f1280a;
        private final View f1281b;
        private final int f1282c;
        private final int f1283d;
        private int[] f1284e;
        private float f1285f;
        private float f1286g;
        private final float f1287h;
        private final float f1288i;

        private C0324a(View view, View view2, int i, int i2, float f, float f2) {
            this.f1281b = view;
            this.f1280a = view2;
            this.f1282c = i - Math.round(this.f1281b.getTranslationX());
            this.f1283d = i2 - Math.round(this.f1281b.getTranslationY());
            this.f1287h = f;
            this.f1288i = f2;
            this.f1284e = (int[]) this.f1280a.getTag(C0358a.transition_position);
            if (this.f1284e != null) {
                this.f1280a.setTag(C0358a.transition_position, null);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f1284e == null) {
                this.f1284e = new int[2];
            }
            this.f1284e[0] = Math.round(((float) this.f1282c) + this.f1281b.getTranslationX());
            this.f1284e[1] = Math.round(((float) this.f1283d) + this.f1281b.getTranslationY());
            this.f1280a.setTag(C0358a.transition_position, this.f1284e);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1281b.setTranslationX(this.f1287h);
            this.f1281b.setTranslationY(this.f1288i);
        }

        public final void onAnimationPause(Animator animator) {
            this.f1285f = this.f1281b.getTranslationX();
            this.f1286g = this.f1281b.getTranslationY();
            this.f1281b.setTranslationX(this.f1287h);
            this.f1281b.setTranslationY(this.f1288i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f1281b.setTranslationX(this.f1285f);
            this.f1281b.setTranslationY(this.f1286g);
        }
    }

    static Animator m889a(View view, ah ahVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) ahVar.f1274b.getTag(C0358a.transition_position);
        if (iArr != null) {
            f = ((float) (iArr[0] - i)) + translationX;
            f2 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = i + Math.round(f - translationX);
        int round2 = i2 + Math.round(f2 - translationY);
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f3});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f2, f4});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        Object c0324a = new C0324a(view, ahVar.f1274b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(c0324a);
        C0320a.m872a(ofPropertyValuesHolder, c0324a);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
