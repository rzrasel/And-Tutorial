package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.transition.Transition;
import android.support.transition.ah;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

public final class C0149e extends Transition {
    private static void m328d(ah ahVar) {
        if (ahVar.f1274b instanceof TextView) {
            ahVar.f1273a.put("android:textscale:scale", Float.valueOf(((TextView) ahVar.f1274b).getScaleX()));
        }
    }

    public final Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        float f = 1.0f;
        if (ahVar == null || ahVar2 == null || !(ahVar.f1274b instanceof TextView) || !(ahVar2.f1274b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) ahVar2.f1274b;
        Map map = ahVar.f1273a;
        Map map2 = ahVar2.f1273a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ C0149e f541b;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    public final void mo83a(ah ahVar) {
        C0149e.m328d(ahVar);
    }

    public final void mo84b(ah ahVar) {
        C0149e.m328d(ahVar);
    }
}
