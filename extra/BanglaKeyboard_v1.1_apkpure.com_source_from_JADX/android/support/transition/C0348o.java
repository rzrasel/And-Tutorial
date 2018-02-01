package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;

final class C0348o {
    static final Matrix f1351a = new C03471();

    static class C03471 extends Matrix {
        C03471() {
        }

        private static void m993a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public final boolean postConcat(Matrix matrix) {
            C03471.m993a();
            return false;
        }

        public final boolean postRotate(float f) {
            C03471.m993a();
            return false;
        }

        public final boolean postRotate(float f, float f2, float f3) {
            C03471.m993a();
            return false;
        }

        public final boolean postScale(float f, float f2) {
            C03471.m993a();
            return false;
        }

        public final boolean postScale(float f, float f2, float f3, float f4) {
            C03471.m993a();
            return false;
        }

        public final boolean postSkew(float f, float f2) {
            C03471.m993a();
            return false;
        }

        public final boolean postSkew(float f, float f2, float f3, float f4) {
            C03471.m993a();
            return false;
        }

        public final boolean postTranslate(float f, float f2) {
            C03471.m993a();
            return false;
        }

        public final boolean preConcat(Matrix matrix) {
            C03471.m993a();
            return false;
        }

        public final boolean preRotate(float f) {
            C03471.m993a();
            return false;
        }

        public final boolean preRotate(float f, float f2, float f3) {
            C03471.m993a();
            return false;
        }

        public final boolean preScale(float f, float f2) {
            C03471.m993a();
            return false;
        }

        public final boolean preScale(float f, float f2, float f3, float f4) {
            C03471.m993a();
            return false;
        }

        public final boolean preSkew(float f, float f2) {
            C03471.m993a();
            return false;
        }

        public final boolean preSkew(float f, float f2, float f3, float f4) {
            C03471.m993a();
            return false;
        }

        public final boolean preTranslate(float f, float f2) {
            C03471.m993a();
            return false;
        }

        public final void reset() {
            C03471.m993a();
        }

        public final void set(Matrix matrix) {
            C03471.m993a();
        }

        public final boolean setConcat(Matrix matrix, Matrix matrix2) {
            C03471.m993a();
            return false;
        }

        public final boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            C03471.m993a();
            return false;
        }

        public final boolean setRectToRect(RectF rectF, RectF rectF2, ScaleToFit scaleToFit) {
            C03471.m993a();
            return false;
        }

        public final void setRotate(float f) {
            C03471.m993a();
        }

        public final void setRotate(float f, float f2, float f3) {
            C03471.m993a();
        }

        public final void setScale(float f, float f2) {
            C03471.m993a();
        }

        public final void setScale(float f, float f2, float f3, float f4) {
            C03471.m993a();
        }

        public final void setSinCos(float f, float f2) {
            C03471.m993a();
        }

        public final void setSinCos(float f, float f2, float f3, float f4) {
            C03471.m993a();
        }

        public final void setSkew(float f, float f2) {
            C03471.m993a();
        }

        public final void setSkew(float f, float f2, float f3, float f4) {
            C03471.m993a();
        }

        public final void setTranslate(float f, float f2) {
            C03471.m993a();
        }

        public final void setValues(float[] fArr) {
            C03471.m993a();
        }
    }
}
