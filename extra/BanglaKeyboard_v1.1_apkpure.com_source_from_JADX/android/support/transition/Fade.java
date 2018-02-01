package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.transition.Transition.C0277c;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class Fade extends Visibility {

    private static class C0299a extends AnimatorListenerAdapter {
        private final View f1205a;
        private boolean f1206b = false;

        C0299a(View view) {
            this.f1205a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            au.m916a(this.f1205a, 1.0f);
            if (this.f1206b) {
                this.f1205a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (C0679r.m1946s(this.f1205a) && this.f1205a.getLayerType() == 0) {
                this.f1206b = true;
                this.f1205a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        m824a(i);
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1257f);
        m824a(C0438c.m1161a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f1199i));
        obtainStyledAttributes.recycle();
    }

    private static float m837a(ah ahVar, float f) {
        if (ahVar == null) {
            return f;
        }
        Float f2 = (Float) ahVar.f1273a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }

    private Animator m838a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        au.m916a(view, f);
        Animator ofFloat = ObjectAnimator.ofFloat(view, au.f1306a, new float[]{f2});
        ofFloat.addListener(new C0299a(view));
        mo209a(new ad(this) {
            final /* synthetic */ Fade f1204b;

            public final void mo221a(Transition transition) {
                au.m916a(view, 1.0f);
                au.m925e(view);
                transition.mo213b((C0277c) this);
            }
        });
        return ofFloat;
    }

    public final Animator mo226a(ViewGroup viewGroup, View view, ah ahVar) {
        au.m924d(view);
        return m838a(view, m837a(ahVar, 1.0f), 0.0f);
    }

    public final Animator mo227a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        float f = 0.0f;
        float a = m837a(ahVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m838a(view, f, 1.0f);
    }

    public final void mo83a(ah ahVar) {
        super.mo83a(ahVar);
        ahVar.f1273a.put("android:fade:transitionAlpha", Float.valueOf(au.m922c(ahVar.f1274b)));
    }
}
