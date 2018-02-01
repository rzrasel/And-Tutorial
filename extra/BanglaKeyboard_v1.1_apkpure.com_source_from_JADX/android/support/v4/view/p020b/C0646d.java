package android.support.v4.view.p020b;

import android.view.animation.Interpolator;

abstract class C0646d implements Interpolator {
    private final float[] f1929a;
    private final float f1930b = (1.0f / ((float) (this.f1929a.length - 1)));

    public C0646d(float[] fArr) {
        this.f1929a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f1929a.length - 1)) * f), this.f1929a.length - 2);
        float f2 = (f - (((float) min) * this.f1930b)) / this.f1930b;
        return ((this.f1929a[min + 1] - this.f1929a[min]) * f2) + this.f1929a[min];
    }
}
