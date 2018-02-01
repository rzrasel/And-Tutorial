package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    private static final TimeInterpolator f1210j = new DecelerateInterpolator();
    private static final TimeInterpolator f1211k = new AccelerateInterpolator();
    private static final C0300a f1212n = new C03021();
    private static final C0300a f1213o = new C03032();
    private static final C0300a f1214p = new C03053();
    private static final C0300a f1215q = new C03064();
    private static final C0300a f1216r = new C03075();
    private static final C0300a f1217s = new C03086();
    private C0300a f1218l = f1217s;
    private int f1219m = 80;

    private interface C0300a {
        float mo229a(ViewGroup viewGroup, View view);

        float mo228b(ViewGroup viewGroup, View view);
    }

    private static abstract class C0301b implements C0300a {
        private C0301b() {
        }

        public final float mo228b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    static class C03021 extends C0301b {
        C03021() {
            super();
        }

        public final float mo229a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    static class C03032 extends C0301b {
        C03032() {
            super();
        }

        public final float mo229a(ViewGroup viewGroup, View view) {
            Object obj = 1;
            if (C0679r.m1932e(viewGroup) != 1) {
                obj = null;
            }
            return obj != null ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    private static abstract class C0304c implements C0300a {
        private C0304c() {
        }

        public final float mo229a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    static class C03053 extends C0304c {
        C03053() {
            super();
        }

        public final float mo228b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    static class C03064 extends C0301b {
        C03064() {
            super();
        }

        public final float mo229a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    static class C03075 extends C0301b {
        C03075() {
            super();
        }

        public final float mo229a(ViewGroup viewGroup, View view) {
            Object obj = 1;
            if (C0679r.m1932e(viewGroup) != 1) {
                obj = null;
            }
            return obj != null ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    static class C03086 extends C0304c {
        C03086() {
            super();
        }

        public final float mo228b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    public Slide() {
        m854b(80);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1259h);
        int a = C0438c.m1161a(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        m854b(a);
    }

    private void m854b(int i) {
        switch (i) {
            case 3:
                this.f1218l = f1212n;
                break;
            case 5:
                this.f1218l = f1215q;
                break;
            case 48:
                this.f1218l = f1214p;
                break;
            case 80:
                this.f1218l = f1217s;
                break;
            case 8388611:
                this.f1218l = f1213o;
                break;
            case 8388613:
                this.f1218l = f1216r;
                break;
            default:
                throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f1219m = i;
        af abVar = new ab();
        abVar.f1250a = i;
        this.f560g = abVar;
    }

    private static void m855d(ah ahVar) {
        Object obj = new int[2];
        ahVar.f1274b.getLocationOnScreen(obj);
        ahVar.f1273a.put("android:slide:screenPosition", obj);
    }

    public final Animator mo226a(ViewGroup viewGroup, View view, ah ahVar) {
        if (ahVar == null) {
            return null;
        }
        int[] iArr = (int[]) ahVar.f1273a.get("android:slide:screenPosition");
        return aj.m889a(view, ahVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f1218l.mo229a(viewGroup, view), this.f1218l.mo228b(viewGroup, view), f1211k);
    }

    public final Animator mo227a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) ahVar2.f1273a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return aj.m889a(view, ahVar2, iArr[0], iArr[1], this.f1218l.mo229a(viewGroup, view), this.f1218l.mo228b(viewGroup, view), translationX, translationY, f1210j);
    }

    public final void mo83a(ah ahVar) {
        super.mo83a(ahVar);
        m855d(ahVar);
    }

    public final void mo84b(ah ahVar) {
        super.mo84b(ahVar);
        m855d(ahVar);
    }
}
