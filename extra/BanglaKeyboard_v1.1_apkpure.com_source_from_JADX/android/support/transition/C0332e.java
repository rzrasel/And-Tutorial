package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public final class C0332e extends bb {
    private float f1326a = 3.0f;

    private static float m965a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    public final long mo234a(ViewGroup viewGroup, Transition transition, ah ahVar, ah ahVar2) {
        if (ahVar == null && ahVar2 == null) {
            return 0;
        }
        int i;
        int centerX;
        int centerY;
        if (ahVar2 == null || bb.m879b(ahVar) == 0) {
            i = -1;
            ahVar2 = ahVar;
        } else {
            i = 1;
        }
        int a = bb.m878a(ahVar2, 0);
        int a2 = bb.m878a(ahVar2, 1);
        Rect e = transition.m326e();
        if (e != null) {
            centerX = e.centerX();
            centerY = e.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            centerX = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            centerY = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
        }
        float a3 = C0332e.m965a((float) a, (float) a2, (float) centerX, (float) centerY) / C0332e.m965a(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long j = transition.f555b;
        if (j < 0) {
            j = 300;
        }
        return (long) Math.round((((float) (j * ((long) i))) / this.f1326a) * a3);
    }
}
