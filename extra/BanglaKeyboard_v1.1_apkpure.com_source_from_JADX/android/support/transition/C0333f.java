package android.support.transition;

import android.animation.TypeEvaluator;

final class C0333f implements TypeEvaluator<float[]> {
    private float[] f1327a;

    C0333f(float[] fArr) {
        this.f1327a = fArr;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        Object obj3 = this.f1327a;
        if (obj3 == null) {
            obj3 = new float[fArr.length];
        }
        for (int i = 0; i < obj3.length; i++) {
            float f2 = fArr[i];
            obj3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return obj3;
    }
}
