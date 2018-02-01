package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.transition.Transition.C0277c;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public class ChangeBounds extends Transition {
    private static final String[] f1149i = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> f1150j = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        private Rect f1125a = new Rect();

        public final /* synthetic */ Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f1125a);
            return new PointF((float) this.f1125a.left, (float) this.f1125a.top);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f1125a);
            this.f1125a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1125a);
        }
    };
    private static final Property<C0287a, PointF> f1151k = new Property<C0287a, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0287a c0287a = (C0287a) obj;
            PointF pointF = (PointF) obj2;
            c0287a.f1142a = Math.round(pointF.x);
            c0287a.f1143b = Math.round(pointF.y);
            c0287a.f1146e++;
            if (c0287a.f1146e == c0287a.f1147f) {
                c0287a.m781a();
            }
        }
    };
    private static final Property<C0287a, PointF> f1152l = new Property<C0287a, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0287a c0287a = (C0287a) obj;
            PointF pointF = (PointF) obj2;
            c0287a.f1144c = Math.round(pointF.x);
            c0287a.f1145d = Math.round(pointF.y);
            c0287a.f1147f++;
            if (c0287a.f1146e == c0287a.f1147f) {
                c0287a.m781a();
            }
        }
    };
    private static final Property<View, PointF> f1153m = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            au.m918a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private static final Property<View, PointF> f1154n = new Property<View, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            au.m918a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static final Property<View, PointF> f1155o = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            au.m918a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static C0360z f1156s = new C0360z();
    private int[] f1157p;
    private boolean f1158q;
    private boolean f1159r;

    private static class C0287a {
        int f1142a;
        int f1143b;
        int f1144c;
        int f1145d;
        int f1146e;
        int f1147f;
        private View f1148g;

        C0287a(View view) {
            this.f1148g = view;
        }

        final void m781a() {
            au.m918a(this.f1148g, this.f1142a, this.f1143b, this.f1144c, this.f1145d);
            this.f1146e = 0;
            this.f1147f = 0;
        }
    }

    public ChangeBounds() {
        this.f1157p = new int[2];
        this.f1158q = false;
        this.f1159r = false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1157p = new int[2];
        this.f1158q = false;
        this.f1159r = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1255d);
        boolean a = C0438c.m1166a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.f1158q = a;
    }

    private void m782d(ah ahVar) {
        View view = ahVar.f1274b;
        if (C0679r.m1952y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            ahVar.f1273a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            ahVar.f1273a.put("android:changeBounds:parent", ahVar.f1274b.getParent());
            if (this.f1159r) {
                ahVar.f1274b.getLocationInWindow(this.f1157p);
                ahVar.f1273a.put("android:changeBounds:windowX", Integer.valueOf(this.f1157p[0]));
                ahVar.f1273a.put("android:changeBounds:windowY", Integer.valueOf(this.f1157p[1]));
            }
            if (this.f1158q) {
                ahVar.f1273a.put("android:changeBounds:clip", C0679r.m1900A(view));
            }
        }
    }

    public final Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) ahVar.f1273a.get("android:changeBounds:parent");
        View view = (ViewGroup) ahVar2.f1273a.get("android:changeBounds:parent");
        if (viewGroup2 == null || view == null) {
            return null;
        }
        final View view2 = ahVar2.f1274b;
        if (this.f1159r) {
            ah b = m317b(viewGroup2, true);
            Object obj = b == null ? viewGroup2 == view ? 1 : null : view == b.f1274b ? 1 : null;
        } else {
            int i = 1;
        }
        final int i2;
        int i3;
        Animator a;
        if (obj != null) {
            Rect rect = (Rect) ahVar.f1273a.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) ahVar2.f1273a.get("android:changeBounds:bounds");
            int i4 = rect.left;
            i2 = rect2.left;
            int i5 = rect.top;
            final int i6 = rect2.top;
            int i7 = rect.right;
            final int i8 = rect2.right;
            int i9 = rect.bottom;
            final int i10 = rect2.bottom;
            int i11 = i7 - i4;
            int i12 = i9 - i5;
            int i13 = i8 - i2;
            int i14 = i10 - i6;
            rect = (Rect) ahVar.f1273a.get("android:changeBounds:clip");
            final Rect rect3 = (Rect) ahVar2.f1273a.get("android:changeBounds:clip");
            i3 = 0;
            if (!((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0))) {
                if (!(i4 == i2 && i5 == i6)) {
                    i3 = 1;
                }
                if (!(i7 == i8 && i9 == i10)) {
                    i3++;
                }
            }
            if (!(rect == null || rect.equals(rect3)) || (rect == null && rect3 != null)) {
                i3++;
            }
            if (i3 > 0) {
                Animator animator;
                if (this.f1158q) {
                    au.m918a(view2, i4, i5, Math.max(i11, i13) + i4, Math.max(i12, i14) + i5);
                    Animator a2 = (i4 == i2 && i5 == i6) ? null : C0349p.m994a(view2, f1155o, this.f561h.mo206a((float) i4, (float) i5, (float) i2, (float) i6));
                    Rect rect4 = rect == null ? new Rect(0, 0, i11, i12) : rect;
                    if (rect3 == null) {
                        obj = new Rect(0, 0, i13, i14);
                    } else {
                        rect = rect3;
                    }
                    if (rect4.equals(obj)) {
                        animator = null;
                    } else {
                        C0679r.m1911a(view2, rect4);
                        Animator ofObject = ObjectAnimator.ofObject(view2, "clipBounds", f1156s, new Object[]{rect4, obj});
                        ofObject.addListener(new AnimatorListenerAdapter(this) {
                            final /* synthetic */ ChangeBounds f1140g;
                            private boolean f1141h;

                            public final void onAnimationCancel(Animator animator) {
                                this.f1141h = true;
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (!this.f1141h) {
                                    C0679r.m1911a(view2, rect3);
                                    au.m918a(view2, i2, i6, i8, i10);
                                }
                            }
                        });
                        animator = ofObject;
                    }
                    a = ag.m888a(a2, animator);
                } else {
                    au.m918a(view2, i4, i5, i7, i9);
                    if (i3 != 2) {
                        a = (i4 == i2 && i5 == i6) ? C0349p.m994a(view2, f1153m, this.f561h.mo206a((float) i7, (float) i9, (float) i8, (float) i10)) : C0349p.m994a(view2, f1154n, this.f561h.mo206a((float) i4, (float) i5, (float) i2, (float) i6));
                    } else if (i11 == i13 && i12 == i14) {
                        a = C0349p.m994a(view2, f1155o, this.f561h.mo206a((float) i4, (float) i5, (float) i2, (float) i6));
                    } else {
                        final C0287a c0287a = new C0287a(view2);
                        ObjectAnimator a3 = C0349p.m994a(c0287a, f1151k, this.f561h.mo206a((float) i4, (float) i5, (float) i2, (float) i6));
                        ObjectAnimator a4 = C0349p.m994a(c0287a, f1152l, this.f561h.mo206a((float) i7, (float) i9, (float) i8, (float) i10));
                        animator = new AnimatorSet();
                        animator.playTogether(new Animator[]{a3, a4});
                        animator.addListener(new AnimatorListenerAdapter(this) {
                            final /* synthetic */ ChangeBounds f1132b;
                            private C0287a f1133c = c0287a;
                        });
                        a = animator;
                    }
                }
                if (!(view2.getParent() instanceof ViewGroup)) {
                    return a;
                }
                viewGroup2 = (ViewGroup) view2.getParent();
                an.m904a(viewGroup2, true);
                mo209a(new ad(this) {
                    boolean f1122a = false;
                    final /* synthetic */ ChangeBounds f1124c;

                    public final void mo220a() {
                        an.m904a(viewGroup2, false);
                    }

                    public final void mo221a(Transition transition) {
                        if (!this.f1122a) {
                            an.m904a(viewGroup2, false);
                        }
                        transition.mo213b((C0277c) this);
                    }

                    public final void mo222b() {
                        an.m904a(viewGroup2, true);
                    }
                });
                return a;
            }
        }
        i3 = ((Integer) ahVar.f1273a.get("android:changeBounds:windowX")).intValue();
        int intValue = ((Integer) ahVar.f1273a.get("android:changeBounds:windowY")).intValue();
        i2 = ((Integer) ahVar2.f1273a.get("android:changeBounds:windowX")).intValue();
        i = ((Integer) ahVar2.f1273a.get("android:changeBounds:windowY")).intValue();
        if (!(i3 == i2 && intValue == i)) {
            viewGroup.getLocationInWindow(this.f1157p);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            final Drawable bitmapDrawable = new BitmapDrawable(createBitmap);
            final float c = au.m922c(view2);
            au.m916a(view2, 0.0f);
            au.m915a(viewGroup).mo235a(bitmapDrawable);
            PropertyValuesHolder a5 = C0354u.m998a(f1150j, this.f561h.mo206a((float) (i3 - this.f1157p[0]), (float) (intValue - this.f1157p[1]), (float) (i2 - this.f1157p[0]), (float) (i - this.f1157p[1])));
            a = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{a5});
            final ViewGroup viewGroup3 = viewGroup;
            final View view3 = view2;
            a.addListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ ChangeBounds f1130e;

                public final void onAnimationEnd(Animator animator) {
                    au.m915a(viewGroup3).mo236b(bitmapDrawable);
                    au.m916a(view3, c);
                }
            });
            return a;
        }
        return null;
    }

    public final void mo83a(ah ahVar) {
        m782d(ahVar);
    }

    public final String[] mo224a() {
        return f1149i;
    }

    public final void mo84b(ah ahVar) {
        m782d(ahVar);
    }
}
