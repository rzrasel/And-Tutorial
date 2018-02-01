package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.support.transition.C0359y.C0358a;
import android.support.transition.Transition.C0277c;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    private static final String[] f1191i = new String[]{"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<C0296b, float[]> f1192j = new Property<C0296b, float[]>(float[].class, "nonTranslations") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0296b c0296b = (C0296b) obj;
            float[] fArr = (float[]) obj2;
            System.arraycopy(fArr, 0, c0296b.f1179b, 0, fArr.length);
            c0296b.m806a();
        }
    };
    private static final Property<C0296b, PointF> f1193k = new Property<C0296b, PointF>(PointF.class, "translations") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0296b c0296b = (C0296b) obj;
            PointF pointF = (PointF) obj2;
            c0296b.f1180c = pointF.x;
            c0296b.f1181d = pointF.y;
            c0296b.m806a();
        }
    };
    private static final boolean f1194l;
    private boolean f1195m = true;
    private boolean f1196n = true;
    private Matrix f1197o = new Matrix();

    private static class C0295a extends ad {
        private View f1176a;
        private C0337i f1177b;

        C0295a(View view, C0337i c0337i) {
            this.f1176a = view;
            this.f1177b = c0337i;
        }

        public final void mo220a() {
            this.f1177b.setVisibility(4);
        }

        public final void mo221a(Transition transition) {
            transition.mo213b((C0277c) this);
            C0341j.m980a(this.f1176a);
            this.f1176a.setTag(C0358a.transition_transform, null);
            this.f1176a.setTag(C0358a.parent_matrix, null);
        }

        public final void mo222b() {
            this.f1177b.setVisibility(0);
        }
    }

    private static class C0296b {
        final Matrix f1178a = new Matrix();
        final float[] f1179b;
        float f1180c;
        float f1181d;
        private final View f1182e;

        C0296b(View view, float[] fArr) {
            this.f1182e = view;
            this.f1179b = (float[]) fArr.clone();
            this.f1180c = this.f1179b[2];
            this.f1181d = this.f1179b[5];
            m806a();
        }

        final void m806a() {
            this.f1179b[2] = this.f1180c;
            this.f1179b[5] = this.f1181d;
            this.f1178a.setValues(this.f1179b);
            au.m923c(this.f1182e, this.f1178a);
        }
    }

    private static class C0297c {
        final float f1183a;
        final float f1184b;
        final float f1185c;
        final float f1186d;
        final float f1187e;
        final float f1188f;
        final float f1189g;
        final float f1190h;

        C0297c(View view) {
            this.f1183a = view.getTranslationX();
            this.f1184b = view.getTranslationY();
            this.f1185c = C0679r.m1941n(view);
            this.f1186d = view.getScaleX();
            this.f1187e = view.getScaleY();
            this.f1188f = view.getRotationX();
            this.f1189g = view.getRotationY();
            this.f1190h = view.getRotation();
        }

        public final void m807a(View view) {
            ChangeTransform.m811b(view, this.f1183a, this.f1184b, this.f1185c, this.f1186d, this.f1187e, this.f1188f, this.f1189g, this.f1190h);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0297c)) {
                return false;
            }
            C0297c c0297c = (C0297c) obj;
            return c0297c.f1183a == this.f1183a && c0297c.f1184b == this.f1184b && c0297c.f1185c == this.f1185c && c0297c.f1186d == this.f1186d && c0297c.f1187e == this.f1187e && c0297c.f1188f == this.f1188f && c0297c.f1189g == this.f1189g && c0297c.f1190h == this.f1190h;
        }

        public final int hashCode() {
            int i = 0;
            int floatToIntBits = ((this.f1189g != 0.0f ? Float.floatToIntBits(this.f1189g) : 0) + (((this.f1188f != 0.0f ? Float.floatToIntBits(this.f1188f) : 0) + (((this.f1187e != 0.0f ? Float.floatToIntBits(this.f1187e) : 0) + (((this.f1186d != 0.0f ? Float.floatToIntBits(this.f1186d) : 0) + (((this.f1185c != 0.0f ? Float.floatToIntBits(this.f1185c) : 0) + (((this.f1184b != 0.0f ? Float.floatToIntBits(this.f1184b) : 0) + ((this.f1183a != 0.0f ? Float.floatToIntBits(this.f1183a) : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f1190h != 0.0f) {
                i = Float.floatToIntBits(this.f1190h);
            }
            return floatToIntBits + i;
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f1194l = z;
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1258g);
        this.f1195m = C0438c.m1166a(obtainStyledAttributes, (XmlPullParser) attributeSet, "reparentWithOverlay", 1, true);
        this.f1196n = C0438c.m1166a(obtainStyledAttributes, (XmlPullParser) attributeSet, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    private static void m811b(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C0679r.m1923b(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    private void m812b(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        View view = ahVar2.f1274b;
        Matrix matrix = new Matrix((Matrix) ahVar2.f1273a.get("android:changeTransform:parentMatrix"));
        au.m921b(viewGroup, matrix);
        C0337i a = C0341j.m979a(view, viewGroup, matrix);
        if (a != null) {
            Transition transition;
            a.mo256a((ViewGroup) ahVar.f1273a.get("android:changeTransform:parent"), ahVar.f1274b);
            while (transition.f558e != null) {
                transition = transition.f558e;
            }
            transition.mo209a(new C0295a(view, a));
            if (f1194l) {
                if (ahVar.f1274b != ahVar2.f1274b) {
                    au.m916a(ahVar.f1274b, 0.0f);
                }
                au.m916a(view, 1.0f);
            }
        }
    }

    private void m813d(ah ahVar) {
        View view = ahVar.f1274b;
        if (view.getVisibility() != 8) {
            ahVar.f1273a.put("android:changeTransform:parent", view.getParent());
            ahVar.f1273a.put("android:changeTransform:transforms", new C0297c(view));
            Matrix matrix = view.getMatrix();
            Object matrix2 = (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix);
            ahVar.f1273a.put("android:changeTransform:matrix", matrix2);
            if (this.f1196n) {
                matrix = new Matrix();
                View view2 = (ViewGroup) view.getParent();
                au.m919a(view2, matrix);
                matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                ahVar.f1273a.put("android:changeTransform:parentMatrix", matrix);
                ahVar.f1273a.put("android:changeTransform:intermediateMatrix", view.getTag(C0358a.transition_transform));
                ahVar.f1273a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C0358a.parent_matrix));
            }
        }
    }

    private static void m814e(View view) {
        m811b(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public final Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null || !ahVar.f1273a.containsKey("android:changeTransform:parent") || !ahVar2.f1273a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        Object obj;
        boolean z;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Animator animator;
        ViewGroup viewGroup2 = (ViewGroup) ahVar.f1273a.get("android:changeTransform:parent");
        View view = (ViewGroup) ahVar2.f1273a.get("android:changeTransform:parent");
        if (this.f1196n) {
            if (m320b((View) viewGroup2) && m320b(view)) {
                ah b = m317b(viewGroup2, true);
                obj = b != null ? view == b.f1274b ? 1 : null : null;
            } else {
                obj = viewGroup2 == view ? 1 : null;
            }
            if (obj == null) {
                z = true;
                matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:intermediateMatrix");
                if (matrix != null) {
                    ahVar.f1273a.put("android:changeTransform:matrix", matrix);
                }
                matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:intermediateParentMatrix");
                if (matrix != null) {
                    ahVar.f1273a.put("android:changeTransform:parentMatrix", matrix);
                }
                if (z) {
                    matrix = (Matrix) ahVar2.f1273a.get("android:changeTransform:parentMatrix");
                    ahVar2.f1274b.setTag(C0358a.parent_matrix, matrix);
                    matrix2 = this.f1197o;
                    matrix2.reset();
                    matrix.invert(matrix2);
                    matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:matrix");
                    if (matrix != null) {
                        matrix = new Matrix();
                        ahVar.f1273a.put("android:changeTransform:matrix", matrix);
                        matrix3 = matrix;
                    } else {
                        matrix3 = matrix;
                    }
                    matrix3.postConcat((Matrix) ahVar.f1273a.get("android:changeTransform:parentMatrix"));
                    matrix3.postConcat(matrix2);
                }
                matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:matrix");
                matrix3 = (Matrix) ahVar2.f1273a.get("android:changeTransform:matrix");
                if (matrix == null) {
                    matrix = C0348o.f1351a;
                }
                matrix2 = matrix3 != null ? C0348o.f1351a : matrix3;
                if (matrix.equals(matrix2)) {
                    final C0297c c0297c = (C0297c) ahVar2.f1273a.get("android:changeTransform:transforms");
                    final View view2 = ahVar2.f1274b;
                    m814e(view2);
                    r2 = new float[9];
                    matrix.getValues(r2);
                    float[] fArr = new float[9];
                    matrix2.getValues(fArr);
                    final C0296b c0296b = new C0296b(view2, r2);
                    PropertyValuesHolder ofObject = PropertyValuesHolder.ofObject(f1192j, new C0333f(new float[9]), new float[][]{r2, fArr});
                    PropertyValuesHolder a = C0354u.m998a(f1193k, this.f561h.mo206a(r2[2], r2[5], fArr[2], fArr[5]));
                    Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c0296b, new PropertyValuesHolder[]{ofObject, a});
                    obj = new AnimatorListenerAdapter(this) {
                        final /* synthetic */ ChangeTransform f1173f;
                        private boolean f1174g;
                        private Matrix f1175h = new Matrix();

                        private void m802a(Matrix matrix) {
                            this.f1175h.set(matrix);
                            view2.setTag(C0358a.transition_transform, this.f1175h);
                            c0297c.m807a(view2);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            this.f1174g = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!this.f1174g) {
                                if (z && this.f1173f.f1195m) {
                                    m802a(matrix2);
                                } else {
                                    view2.setTag(C0358a.transition_transform, null);
                                    view2.setTag(C0358a.parent_matrix, null);
                                }
                            }
                            au.m923c(view2, null);
                            c0297c.m807a(view2);
                        }

                        public final void onAnimationPause(Animator animator) {
                            m802a(c0296b.f1178a);
                        }

                        public final void onAnimationResume(Animator animator) {
                            ChangeTransform.m814e(view2);
                        }
                    };
                    ofPropertyValuesHolder.addListener(obj);
                    C0320a.m872a(ofPropertyValuesHolder, obj);
                    animator = ofPropertyValuesHolder;
                } else {
                    animator = null;
                }
                if (!z && animator != null && this.f1195m) {
                    m812b(viewGroup, ahVar, ahVar2);
                    return animator;
                } else if (!f1194l) {
                    return animator;
                } else {
                    viewGroup2.endViewTransition(ahVar.f1274b);
                    return animator;
                }
            }
        }
        z = false;
        matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            ahVar.f1273a.put("android:changeTransform:matrix", matrix);
        }
        matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix != null) {
            ahVar.f1273a.put("android:changeTransform:parentMatrix", matrix);
        }
        if (z) {
            matrix = (Matrix) ahVar2.f1273a.get("android:changeTransform:parentMatrix");
            ahVar2.f1274b.setTag(C0358a.parent_matrix, matrix);
            matrix2 = this.f1197o;
            matrix2.reset();
            matrix.invert(matrix2);
            matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:matrix");
            if (matrix != null) {
                matrix3 = matrix;
            } else {
                matrix = new Matrix();
                ahVar.f1273a.put("android:changeTransform:matrix", matrix);
                matrix3 = matrix;
            }
            matrix3.postConcat((Matrix) ahVar.f1273a.get("android:changeTransform:parentMatrix"));
            matrix3.postConcat(matrix2);
        }
        matrix = (Matrix) ahVar.f1273a.get("android:changeTransform:matrix");
        matrix3 = (Matrix) ahVar2.f1273a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C0348o.f1351a;
        }
        if (matrix3 != null) {
        }
        if (matrix.equals(matrix2)) {
            final C0297c c0297c2 = (C0297c) ahVar2.f1273a.get("android:changeTransform:transforms");
            final View view22 = ahVar2.f1274b;
            m814e(view22);
            r2 = new float[9];
            matrix.getValues(r2);
            float[] fArr2 = new float[9];
            matrix2.getValues(fArr2);
            final C0296b c0296b2 = new C0296b(view22, r2);
            PropertyValuesHolder ofObject2 = PropertyValuesHolder.ofObject(f1192j, new C0333f(new float[9]), new float[][]{r2, fArr2});
            PropertyValuesHolder a2 = C0354u.m998a(f1193k, this.f561h.mo206a(r2[2], r2[5], fArr2[2], fArr2[5]));
            Animator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(c0296b2, new PropertyValuesHolder[]{ofObject2, a2});
            obj = /* anonymous class already generated */;
            ofPropertyValuesHolder2.addListener(obj);
            C0320a.m872a(ofPropertyValuesHolder2, obj);
            animator = ofPropertyValuesHolder2;
        } else {
            animator = null;
        }
        if (!z) {
        }
        if (!f1194l) {
            return animator;
        }
        viewGroup2.endViewTransition(ahVar.f1274b);
        return animator;
    }

    public final void mo83a(ah ahVar) {
        m813d(ahVar);
        if (!f1194l) {
            ((ViewGroup) ahVar.f1274b.getParent()).startViewTransition(ahVar.f1274b);
        }
    }

    public final String[] mo224a() {
        return f1191i;
    }

    public final void mo84b(ah ahVar) {
        m813d(ahVar);
    }
}
