package android.support.transition;

import android.graphics.Rect;
import android.support.v4.view.C0679r;
import android.view.ViewGroup;

public final class ab extends bb {
    int f1250a = 80;
    private float f1251b = 3.0f;

    public final long mo234a(ViewGroup viewGroup, Transition transition, ah ahVar, ah ahVar2) {
        if (ahVar == null && ahVar2 == null) {
            return 0;
        }
        int centerX;
        int centerY;
        int i;
        int i2 = 1;
        Rect e = transition.m326e();
        if (ahVar2 == null || bb.m879b(ahVar) == 0) {
            i2 = -1;
            ahVar2 = ahVar;
        }
        int a = bb.m878a(ahVar2, 0);
        int a2 = bb.m878a(ahVar2, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (e != null) {
            centerX = e.centerX();
            centerY = e.centerY();
        } else {
            centerX = (round + width) / 2;
            centerY = (round2 + height) / 2;
        }
        if (this.f1250a == 8388611) {
            i = (C0679r.m1932e(viewGroup) == 1 ? 1 : null) != null ? 5 : 3;
        } else if (this.f1250a == 8388613) {
            i = (C0679r.m1932e(viewGroup) == 1 ? 1 : null) != null ? 3 : 5;
        } else {
            i = this.f1250a;
        }
        switch (i) {
            case 3:
                centerY = Math.abs(centerY - a2) + (width - a);
                break;
            case 5:
                centerY = Math.abs(centerY - a2) + (a - round);
                break;
            case 48:
                centerY = (height - a2) + Math.abs(centerX - a);
                break;
            case 80:
                centerY = (a2 - round2) + Math.abs(centerX - a);
                break;
            default:
                centerY = 0;
                break;
        }
        float f = (float) centerY;
        switch (this.f1250a) {
            case 3:
            case 5:
            case 8388611:
            case 8388613:
                centerY = viewGroup.getWidth();
                break;
            default:
                centerY = viewGroup.getHeight();
                break;
        }
        float f2 = f / ((float) centerY);
        long j = transition.f555b;
        if (j < 0) {
            j = 300;
        }
        return (long) Math.round((((float) (j * ((long) i2))) / this.f1251b) * f2);
    }
}
