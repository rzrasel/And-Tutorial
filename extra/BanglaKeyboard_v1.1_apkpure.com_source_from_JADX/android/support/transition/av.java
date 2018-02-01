package android.support.transition;

import android.graphics.Matrix;
import android.support.transition.C0359y.C0358a;
import android.view.View;
import android.view.ViewParent;

class av implements ba {
    private float[] f1311a;

    av() {
    }

    public at mo241a(View view) {
        return ar.m892c(view);
    }

    public void mo242a(View view, float f) {
        Float f2 = (Float) view.getTag(C0358a.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public void mo243a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    public void mo244a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo244a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public be mo245b(View view) {
        return new bc(view.getWindowToken());
    }

    public void mo246b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo246b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public float mo247c(View view) {
        Float f = (Float) view.getTag(C0358a.save_non_transition_alpha);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    public void mo248c(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f1311a;
        if (fArr == null) {
            fArr = new float[9];
            this.f1311a = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) (fArr[0] < 0.0f ? -1 : 1)) * ((float) Math.sqrt((double) (1.0f - (f * f))));
        f = (float) Math.toDegrees(Math.atan2((double) f, (double) sqrt));
        float f2 = fArr[0] / sqrt;
        sqrt = fArr[4] / sqrt;
        float f3 = fArr[2];
        float f4 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f3);
        view.setTranslationY(f4);
        view.setRotation(f);
        view.setScaleX(f2);
        view.setScaleY(sqrt);
    }

    public void mo249d(View view) {
        if (view.getTag(C0358a.save_non_transition_alpha) == null) {
            view.setTag(C0358a.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void mo250e(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0358a.save_non_transition_alpha, null);
        }
    }
}
