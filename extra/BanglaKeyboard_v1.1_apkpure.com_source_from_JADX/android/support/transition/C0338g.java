package android.support.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.transition.C0337i.C0335a;
import android.support.transition.C0359y.C0358a;
import android.support.v4.view.C0679r;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
final class C0338g extends View implements C0337i {
    final View f1329a;
    ViewGroup f1330b;
    View f1331c;
    int f1332d;
    Matrix f1333e;
    private int f1334f;
    private int f1335g;
    private final Matrix f1336h = new Matrix();
    private final OnPreDrawListener f1337i = new C03341(this);

    class C03341 implements OnPreDrawListener {
        final /* synthetic */ C0338g f1328a;

        C03341(C0338g c0338g) {
            this.f1328a = c0338g;
        }

        public final boolean onPreDraw() {
            this.f1328a.f1333e = this.f1328a.f1329a.getMatrix();
            C0679r.m1928c(this.f1328a);
            if (!(this.f1328a.f1330b == null || this.f1328a.f1331c == null)) {
                this.f1328a.f1330b.endViewTransition(this.f1328a.f1331c);
                C0679r.m1928c(this.f1328a.f1330b);
                this.f1328a.f1330b = null;
                this.f1328a.f1331c = null;
            }
            return true;
        }
    }

    static class C0336a implements C0335a {
        C0336a() {
        }

        public final C0337i mo254a(View view, ViewGroup viewGroup, Matrix matrix) {
            C0337i a = C0338g.m972a(view);
            if (a == null) {
                FrameLayout frameLayout;
                ViewGroup viewGroup2 = viewGroup;
                while (!(viewGroup2 instanceof FrameLayout)) {
                    ViewParent parent = viewGroup2.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        frameLayout = null;
                        break;
                    }
                    viewGroup2 = (ViewGroup) parent;
                }
                frameLayout = (FrameLayout) viewGroup2;
                if (frameLayout == null) {
                    return null;
                }
                a = new C0338g(view);
                frameLayout.addView(a);
            }
            a.f1332d++;
            return a;
        }

        public final void mo255a(View view) {
            View a = C0338g.m972a(view);
            if (a != null) {
                a.f1332d--;
                if (a.f1332d <= 0) {
                    ViewParent parent = a.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.endViewTransition(a);
                        viewGroup.removeView(a);
                    }
                }
            }
        }
    }

    C0338g(View view) {
        super(view.getContext());
        this.f1329a = view;
        setLayerType(2, null);
    }

    static C0338g m972a(View view) {
        return (C0338g) view.getTag(C0358a.ghost_view);
    }

    private static void m973a(View view, C0338g c0338g) {
        view.setTag(C0358a.ghost_view, c0338g);
    }

    public final void mo256a(ViewGroup viewGroup, View view) {
        this.f1330b = viewGroup;
        this.f1331c = view;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0338g.m973a(this.f1329a, this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        this.f1329a.getLocationOnScreen(iArr2);
        iArr2[0] = (int) (((float) iArr2[0]) - this.f1329a.getTranslationX());
        iArr2[1] = (int) (((float) iArr2[1]) - this.f1329a.getTranslationY());
        this.f1334f = iArr2[0] - iArr[0];
        this.f1335g = iArr2[1] - iArr[1];
        this.f1329a.getViewTreeObserver().addOnPreDrawListener(this.f1337i);
        this.f1329a.setVisibility(4);
    }

    protected final void onDetachedFromWindow() {
        this.f1329a.getViewTreeObserver().removeOnPreDrawListener(this.f1337i);
        this.f1329a.setVisibility(0);
        C0338g.m973a(this.f1329a, null);
        super.onDetachedFromWindow();
    }

    protected final void onDraw(Canvas canvas) {
        this.f1336h.set(this.f1333e);
        this.f1336h.postTranslate((float) this.f1334f, (float) this.f1335g);
        canvas.setMatrix(this.f1336h);
        this.f1329a.draw(canvas);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f1329a.setVisibility(i == 0 ? 4 : 0);
    }
}
