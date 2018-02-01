package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.transition.C0330b.C0317a;
import android.support.transition.Transition.C0277c;
import android.support.v4.content.p015a.C0438c;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class Visibility extends Transition {
    private static final String[] f1198j = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    int f1199i = 3;

    private static class C0318a extends AnimatorListenerAdapter implements C0277c, C0317a {
        boolean f1234a = false;
        private final View f1235b;
        private final int f1236c;
        private final ViewGroup f1237d;
        private final boolean f1238e;
        private boolean f1239f;

        C0318a(View view, int i) {
            this.f1235b = view;
            this.f1236c = i;
            this.f1237d = (ViewGroup) view.getParent();
            this.f1238e = true;
            m865a(true);
        }

        private void m865a(boolean z) {
            if (this.f1238e && this.f1239f != z && this.f1237d != null) {
                this.f1239f = z;
                an.m904a(this.f1237d, z);
            }
        }

        private void m866d() {
            if (!this.f1234a) {
                au.m917a(this.f1235b, this.f1236c);
                if (this.f1237d != null) {
                    this.f1237d.invalidate();
                }
            }
            m865a(false);
        }

        public final void mo220a() {
            m865a(false);
        }

        public final void mo221a(Transition transition) {
            m866d();
            transition.mo213b((C0277c) this);
        }

        public final void mo222b() {
            m865a(true);
        }

        public final void mo223c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f1234a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            m866d();
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f1234a) {
                au.m917a(this.f1235b, this.f1236c);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f1234a) {
                au.m917a(this.f1235b, 0);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    private static class C0319b {
        boolean f1240a;
        boolean f1241b;
        int f1242c;
        int f1243d;
        ViewGroup f1244e;
        ViewGroup f1245f;

        private C0319b() {
        }
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f1256e);
        int a = C0438c.m1161a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (a != 0) {
            m824a(a);
        }
    }

    private static C0319b m819b(ah ahVar, ah ahVar2) {
        C0319b c0319b = new C0319b();
        c0319b.f1240a = false;
        c0319b.f1241b = false;
        if (ahVar == null || !ahVar.f1273a.containsKey("android:visibility:visibility")) {
            c0319b.f1242c = -1;
            c0319b.f1244e = null;
        } else {
            c0319b.f1242c = ((Integer) ahVar.f1273a.get("android:visibility:visibility")).intValue();
            c0319b.f1244e = (ViewGroup) ahVar.f1273a.get("android:visibility:parent");
        }
        if (ahVar2 == null || !ahVar2.f1273a.containsKey("android:visibility:visibility")) {
            c0319b.f1243d = -1;
            c0319b.f1245f = null;
        } else {
            c0319b.f1243d = ((Integer) ahVar2.f1273a.get("android:visibility:visibility")).intValue();
            c0319b.f1245f = (ViewGroup) ahVar2.f1273a.get("android:visibility:parent");
        }
        if (ahVar == null || ahVar2 == null) {
            if (ahVar == null && c0319b.f1243d == 0) {
                c0319b.f1241b = true;
                c0319b.f1240a = true;
            } else if (ahVar2 == null && c0319b.f1242c == 0) {
                c0319b.f1241b = false;
                c0319b.f1240a = true;
            }
        } else if (c0319b.f1242c == c0319b.f1243d && c0319b.f1244e == c0319b.f1245f) {
            return c0319b;
        } else {
            if (c0319b.f1242c != c0319b.f1243d) {
                if (c0319b.f1242c == 0) {
                    c0319b.f1241b = false;
                    c0319b.f1240a = true;
                } else if (c0319b.f1243d == 0) {
                    c0319b.f1241b = true;
                    c0319b.f1240a = true;
                }
            } else if (c0319b.f1245f == null) {
                c0319b.f1241b = false;
                c0319b.f1240a = true;
            } else if (c0319b.f1244e == null) {
                c0319b.f1241b = true;
                c0319b.f1240a = true;
            }
        }
        return c0319b;
    }

    private static void m820d(ah ahVar) {
        ahVar.f1273a.put("android:visibility:visibility", Integer.valueOf(ahVar.f1274b.getVisibility()));
        ahVar.f1273a.put("android:visibility:parent", ahVar.f1274b.getParent());
        Object obj = new int[2];
        ahVar.f1274b.getLocationOnScreen(obj);
        ahVar.f1273a.put("android:visibility:screenLocation", obj);
    }

    public final Animator mo82a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        C0319b b = m819b(ahVar, ahVar2);
        if (!b.f1240a || (b.f1244e == null && b.f1245f == null)) {
            return null;
        }
        View view;
        if (!b.f1241b) {
            int i = b.f1243d;
            if ((this.f1199i & 2) == 2) {
                int id;
                View view2 = ahVar != null ? ahVar.f1274b : null;
                view = ahVar2 != null ? ahVar2.f1274b : null;
                View view3 = null;
                if (view == null || view.getParent() == null) {
                    if (view != null) {
                        view2 = null;
                        view3 = view;
                    } else {
                        if (view2 != null) {
                            if (view2.getParent() != null) {
                                if (view2.getParent() instanceof View) {
                                    view = (View) view2.getParent();
                                    if (m819b(m306a(view, true), m317b(view, true)).f1240a) {
                                        if (view.getParent() == null) {
                                            id = view.getId();
                                            if (!(id == -1 || viewGroup.findViewById(id) == null || !this.f)) {
                                                view = view2;
                                                view2 = null;
                                                view3 = view;
                                            }
                                        }
                                        view = null;
                                        view2 = null;
                                        view3 = view;
                                    } else {
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
                                        au.m919a(view2, matrix);
                                        au.m921b(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, (float) view2.getWidth(), (float) view2.getHeight());
                                        matrix.mapRect(rectF);
                                        int round = Math.round(rectF.left);
                                        int round2 = Math.round(rectF.top);
                                        int round3 = Math.round(rectF.right);
                                        int round4 = Math.round(rectF.bottom);
                                        view3 = new ImageView(view2.getContext());
                                        view3.setScaleType(ScaleType.CENTER_CROP);
                                        Bitmap bitmap = null;
                                        int round5 = Math.round(rectF.width());
                                        int round6 = Math.round(rectF.height());
                                        if (round5 > 0 && round6 > 0) {
                                            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
                                            round5 = (int) (((float) round5) * min);
                                            round6 = (int) (((float) round6) * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            bitmap = Bitmap.createBitmap(round5, round6, Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap);
                                            canvas.concat(matrix);
                                            view2.draw(canvas);
                                        }
                                        if (bitmap != null) {
                                            view3.setImageBitmap(bitmap);
                                        }
                                        view3.measure(MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        view3.layout(round, round2, round3, round4);
                                        view2 = null;
                                    }
                                }
                            }
                            view3 = view2;
                            view2 = null;
                        }
                        view2 = null;
                    }
                } else if (i == 4) {
                    view2 = view;
                } else {
                    if (view2 == view) {
                        view2 = view;
                    }
                    view3 = view2;
                    view2 = null;
                }
                Animator a;
                if (view3 != null && ahVar != null) {
                    int[] iArr = (int[]) ahVar.f1273a.get("android:visibility:screenLocation");
                    int i2 = iArr[0];
                    id = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view3.offsetLeftAndRight((i2 - iArr2[0]) - view3.getLeft());
                    view3.offsetTopAndBottom((id - iArr2[1]) - view3.getTop());
                    final am a2 = an.m903a(viewGroup);
                    a2.mo237a(view3);
                    a = mo226a(viewGroup, view3, ahVar);
                    if (a == null) {
                        a2.mo238b(view3);
                        return a;
                    }
                    a.addListener(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ Visibility f1233c;

                        public final void onAnimationEnd(Animator animator) {
                            a2.mo238b(view3);
                        }
                    });
                    return a;
                } else if (view2 != null) {
                    int visibility = view2.getVisibility();
                    au.m917a(view2, 0);
                    a = mo226a(viewGroup, view2, ahVar);
                    if (a != null) {
                        C0277c c0318a = new C0318a(view2, i);
                        a.addListener(c0318a);
                        C0320a.m872a(a, c0318a);
                        mo209a(c0318a);
                        return a;
                    }
                    au.m917a(view2, visibility);
                    return a;
                }
            }
            return null;
        } else if ((this.f1199i & 1) != 1 || ahVar2 == null) {
            return null;
        } else {
            if (ahVar == null) {
                view = (View) ahVar2.f1274b.getParent();
                if (m819b(m317b(view, false), m306a(view, false)).f1240a) {
                    return null;
                }
            }
            return mo227a(viewGroup, ahVar2.f1274b, ahVar, ahVar2);
        }
    }

    public Animator mo226a(ViewGroup viewGroup, View view, ah ahVar) {
        return null;
    }

    public Animator mo227a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        return null;
    }

    public final void m824a(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f1199i = i;
    }

    public void mo83a(ah ahVar) {
        m820d(ahVar);
    }

    public final boolean mo225a(ah ahVar, ah ahVar2) {
        if (ahVar == null && ahVar2 == null) {
            return false;
        }
        if (ahVar != null && ahVar2 != null && ahVar2.f1273a.containsKey("android:visibility:visibility") != ahVar.f1273a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0319b b = m819b(ahVar, ahVar2);
        return b.f1240a ? b.f1242c == 0 || b.f1243d == 0 : false;
    }

    public final String[] mo224a() {
        return f1198j;
    }

    public void mo84b(ah ahVar) {
        m820d(ahVar);
    }
}
