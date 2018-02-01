package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p006a.p007a.C0366a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class C0250j extends C0248i {
    private InsetDrawable f1044r;

    static class C0249a extends GradientDrawable {
        C0249a() {
        }

        public final boolean isStateful() {
            return true;
        }
    }

    C0250j(VisibilityAwareImageButton visibilityAwareImageButton, C0184l c0184l) {
        super(visibilityAwareImageButton, c0184l);
    }

    public final float mo188a() {
        return this.o.getElevation();
    }

    final void mo189a(float f, float f2) {
        if (VERSION.SDK_INT != 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            Animator animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(k, animatorSet);
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(l, animatorSet);
            Animator animatorSet2 = new AnimatorSet();
            List arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{this.o.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet2.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet2.setInterpolator(a);
            stateListAnimator.addState(m, animatorSet2);
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(n, animatorSet);
            this.o.setStateListAnimator(stateListAnimator);
        } else if (this.o.isEnabled()) {
            this.o.setElevation(f);
            if (this.o.isFocused() || this.o.isPressed()) {
                this.o.setTranslationZ(f2);
            } else {
                this.o.setTranslationZ(0.0f);
            }
        } else {
            this.o.setElevation(0.0f);
            this.o.setTranslationZ(0.0f);
        }
        if (this.p.mo162b()) {
            m661d();
        }
    }

    final void mo190a(int i) {
        if (this.f instanceof RippleDrawable) {
            ((RippleDrawable) this.f).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo190a(i);
        }
    }

    final void mo191a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable layerDrawable;
        this.e = C0366a.m1054g(m664g());
        C0366a.m1043a(this.e, colorStateList);
        if (mode != null) {
            C0366a.m1046a(this.e, mode);
        }
        if (i2 > 0) {
            this.g = m651a(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{this.g, this.e});
        } else {
            this.g = null;
            layerDrawable = this.e;
        }
        this.f = new RippleDrawable(ColorStateList.valueOf(i), layerDrawable, null);
        this.h = this.f;
        this.p.mo161a(this.f);
    }

    final void mo192a(Rect rect) {
        if (this.p.mo162b()) {
            float a = this.p.mo159a();
            float elevation = this.o.getElevation() + this.j;
            int ceil = (int) Math.ceil((double) C0252k.m680b(elevation, a, false));
            int ceil2 = (int) Math.ceil((double) C0252k.m679a(elevation, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    final void mo193a(int[] iArr) {
    }

    final void mo194b() {
    }

    final void mo195b(Rect rect) {
        if (this.p.mo162b()) {
            this.f1044r = new InsetDrawable(this.f, rect.left, rect.top, rect.right, rect.bottom);
            this.p.mo161a(this.f1044r);
            return;
        }
        this.p.mo161a(this.f);
    }

    final void mo196c() {
        m661d();
    }

    final boolean mo197e() {
        return false;
    }

    final C0236d mo198f() {
        return new C0237e();
    }

    final GradientDrawable mo199h() {
        return new C0249a();
    }
}
