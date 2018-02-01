package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

final class C0261p {
    private static final ThreadLocal<Matrix> f1079a = new ThreadLocal();
    private static final ThreadLocal<RectF> f1080b = new ThreadLocal();

    static void m695a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix2 = (Matrix) f1079a.get();
        if (matrix2 == null) {
            matrix2 = new Matrix();
            f1079a.set(matrix2);
            matrix = matrix2;
        } else {
            matrix2.reset();
            matrix = matrix2;
        }
        C0261p.m696a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f1080b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1080b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    private static void m696a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            C0261p.m696a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
