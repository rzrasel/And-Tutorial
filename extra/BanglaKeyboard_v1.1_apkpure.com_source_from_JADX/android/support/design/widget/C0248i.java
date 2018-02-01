package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.C0116a.C0107c;
import android.support.design.widget.C0259n.C0258a;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.view.C0679r;
import android.util.StateSet;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

class C0248i {
    static final Interpolator f1025a = C0215a.f917c;
    static final int[] f1026k = new int[]{16842919, 16842910};
    static final int[] f1027l = new int[]{16842908, 16842910};
    static final int[] f1028m = new int[]{16842910};
    static final int[] f1029n = new int[0];
    int f1030b = 0;
    C0252k f1031c;
    float f1032d;
    Drawable f1033e;
    Drawable f1034f;
    C0236d f1035g;
    Drawable f1036h;
    float f1037i;
    float f1038j;
    final VisibilityAwareImageButton f1039o;
    final C0184l f1040p;
    OnPreDrawListener f1041q;
    private final C0259n f1042r;
    private final Rect f1043s = new Rect();

    interface C0181c {
    }

    class C02411 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean f1010a = false;
        final /* synthetic */ C0181c f1011b;
        final /* synthetic */ C0248i f1012c;
        private boolean f1013d;

        C02411(C0248i c0248i, C0181c c0181c) {
            this.f1012c = c0248i;
            this.f1011b = c0181c;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f1013d = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1012c.f1030b = 0;
            if (!this.f1013d) {
                this.f1012c.f1039o.m508a(this.f1010a ? 8 : 4, this.f1010a);
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f1012c.f1039o.m508a(0, this.f1010a);
            this.f1013d = false;
        }
    }

    class C02422 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean f1014a = false;
        final /* synthetic */ C0181c f1015b;
        final /* synthetic */ C0248i f1016c;

        C02422(C0248i c0248i, C0181c c0181c) {
            this.f1016c = c0248i;
            this.f1015b = c0181c;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1016c.f1030b = 0;
        }

        public final void onAnimationStart(Animator animator) {
            this.f1016c.f1039o.m508a(0, this.f1014a);
        }
    }

    class C02433 implements OnPreDrawListener {
        final /* synthetic */ C0248i f1017a;

        C02433(C0248i c0248i) {
            this.f1017a = c0248i;
        }

        public final boolean onPreDraw() {
            C0248i c0248i = this.f1017a;
            float rotation = c0248i.f1039o.getRotation();
            if (c0248i.f1032d != rotation) {
                c0248i.f1032d = rotation;
                if (VERSION.SDK_INT == 19) {
                    if (c0248i.f1032d % 90.0f != 0.0f) {
                        if (c0248i.f1039o.getLayerType() != 1) {
                            c0248i.f1039o.setLayerType(1, null);
                        }
                    } else if (c0248i.f1039o.getLayerType() != 0) {
                        c0248i.f1039o.setLayerType(0, null);
                    }
                }
                if (c0248i.f1031c != null) {
                    C0252k c0252k = c0248i.f1031c;
                    float f = -c0248i.f1032d;
                    if (c0252k.f1056l != f) {
                        c0252k.f1056l = f;
                        c0252k.invalidateSelf();
                    }
                }
                if (c0248i.f1035g != null) {
                    C0236d c0236d = c0248i.f1035g;
                    float f2 = -c0248i.f1032d;
                    if (f2 != c0236d.f955j) {
                        c0236d.f955j = f2;
                        c0236d.invalidateSelf();
                    }
                }
            }
            return true;
        }
    }

    private abstract class C0244e extends AnimatorListenerAdapter implements AnimatorUpdateListener {
        private boolean f1018a;
        final /* synthetic */ C0248i f1019b;
        private float f1020c;
        private float f1021d;

        private C0244e(C0248i c0248i) {
            this.f1019b = c0248i;
        }

        protected abstract float mo187a();

        public void onAnimationEnd(Animator animator) {
            this.f1019b.f1031c.m682a(this.f1021d);
            this.f1018a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1018a) {
                this.f1020c = this.f1019b.f1031c.f1054j;
                this.f1021d = mo187a();
                this.f1018a = true;
            }
            this.f1019b.f1031c.m682a(this.f1020c + ((this.f1021d - this.f1020c) * valueAnimator.getAnimatedFraction()));
        }
    }

    private class C0245a extends C0244e {
        final /* synthetic */ C0248i f1022a;

        C0245a(C0248i c0248i) {
            this.f1022a = c0248i;
            super();
        }

        protected final float mo187a() {
            return 0.0f;
        }
    }

    private class C0246b extends C0244e {
        final /* synthetic */ C0248i f1023a;

        C0246b(C0248i c0248i) {
            this.f1023a = c0248i;
            super();
        }

        protected final float mo187a() {
            return this.f1023a.f1037i + this.f1023a.f1038j;
        }
    }

    private class C0247d extends C0244e {
        final /* synthetic */ C0248i f1024a;

        C0247d(C0248i c0248i) {
            this.f1024a = c0248i;
            super();
        }

        protected final float mo187a() {
            return this.f1024a.f1037i;
        }
    }

    C0248i(VisibilityAwareImageButton visibilityAwareImageButton, C0184l c0184l) {
        this.f1039o = visibilityAwareImageButton;
        this.f1040p = c0184l;
        this.f1042r = new C0259n();
        this.f1042r.m693a(f1026k, C0248i.m648a(new C0246b(this)));
        this.f1042r.m693a(f1027l, C0248i.m648a(new C0246b(this)));
        this.f1042r.m693a(f1028m, C0248i.m648a(new C0247d(this)));
        this.f1042r.m693a(f1029n, C0248i.m648a(new C0245a(this)));
        this.f1032d = this.f1039o.getRotation();
    }

    private static ValueAnimator m648a(C0244e c0244e) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1025a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(c0244e);
        valueAnimator.addUpdateListener(c0244e);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private static ColorStateList m649b(int i) {
        r0 = new int[3][];
        int[] iArr = new int[]{f1027l, i, f1026k};
        iArr[1] = i;
        r0[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r0, iArr);
    }

    float mo188a() {
        return this.f1037i;
    }

    final C0236d m651a(int i, ColorStateList colorStateList) {
        Context context = this.f1039o.getContext();
        C0236d f = mo198f();
        int color = C0392a.getColor(context, C0107c.design_fab_stroke_top_outer_color);
        int color2 = C0392a.getColor(context, C0107c.design_fab_stroke_top_inner_color);
        int color3 = C0392a.getColor(context, C0107c.design_fab_stroke_end_inner_color);
        int color4 = C0392a.getColor(context, C0107c.design_fab_stroke_end_outer_color);
        f.f950e = color;
        f.f951f = color2;
        f.f952g = color3;
        f.f953h = color4;
        float f2 = (float) i;
        if (f.f949d != f2) {
            f.f949d = f2;
            f.f946a.setStrokeWidth(f2 * 1.3333f);
            f.f954i = true;
            f.invalidateSelf();
        }
        f.m609a(colorStateList);
        return f;
    }

    final void m652a(float f) {
        if (this.f1037i != f) {
            this.f1037i = f;
            mo189a(f, this.f1038j);
        }
    }

    void mo189a(float f, float f2) {
        if (this.f1031c != null) {
            this.f1031c.m683a(f, this.f1038j + f);
            m661d();
        }
    }

    void mo190a(int i) {
        if (this.f1034f != null) {
            C0366a.m1043a(this.f1034f, C0248i.m649b(i));
        }
    }

    void mo191a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.f1033e = C0366a.m1054g(m664g());
        C0366a.m1043a(this.f1033e, colorStateList);
        if (mode != null) {
            C0366a.m1046a(this.f1033e, mode);
        }
        this.f1034f = C0366a.m1054g(m664g());
        C0366a.m1043a(this.f1034f, C0248i.m649b(i));
        if (i2 > 0) {
            this.f1035g = m651a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f1035g, this.f1033e, this.f1034f};
        } else {
            this.f1035g = null;
            drawableArr = new Drawable[]{this.f1033e, this.f1034f};
        }
        this.f1036h = new LayerDrawable(drawableArr);
        this.f1031c = new C0252k(this.f1039o.getContext(), this.f1036h, this.f1040p.mo159a(), this.f1037i, this.f1037i + this.f1038j);
        C0252k c0252k = this.f1031c;
        c0252k.f1055k = false;
        c0252k.invalidateSelf();
        this.f1040p.mo161a(this.f1031c);
    }

    void mo192a(Rect rect) {
        this.f1031c.getPadding(rect);
    }

    void mo193a(int[] iArr) {
        C0258a c0258a;
        C0259n c0259n = this.f1042r;
        int size = c0259n.f1074a.size();
        for (int i = 0; i < size; i++) {
            c0258a = (C0258a) c0259n.f1074a.get(i);
            if (StateSet.stateSetMatches(c0258a.f1072a, iArr)) {
                break;
            }
        }
        c0258a = null;
        if (c0258a != c0259n.f1075b) {
            if (!(c0259n.f1075b == null || c0259n.f1076c == null)) {
                c0259n.f1076c.cancel();
                c0259n.f1076c = null;
            }
            c0259n.f1075b = c0258a;
            if (c0258a != null) {
                c0259n.f1076c = c0258a.f1073b;
                c0259n.f1076c.start();
            }
        }
    }

    void mo194b() {
        C0259n c0259n = this.f1042r;
        if (c0259n.f1076c != null) {
            c0259n.f1076c.end();
            c0259n.f1076c = null;
        }
    }

    void mo195b(Rect rect) {
    }

    void mo196c() {
    }

    final void m661d() {
        Rect rect = this.f1043s;
        mo192a(rect);
        mo195b(rect);
        this.f1040p.mo160a(rect.left, rect.top, rect.right, rect.bottom);
    }

    boolean mo197e() {
        return true;
    }

    C0236d mo198f() {
        return new C0236d();
    }

    final GradientDrawable m664g() {
        GradientDrawable h = mo199h();
        h.setShape(1);
        h.setColor(-1);
        return h;
    }

    GradientDrawable mo199h() {
        return new GradientDrawable();
    }

    final boolean m666i() {
        return C0679r.m1952y(this.f1039o) && !this.f1039o.isInEditMode();
    }
}
