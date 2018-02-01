package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.view.C0679r;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ar implements at {
    protected C0326a f1289a;

    static class C0326a extends ViewGroup {
        static Method f1300a;
        ViewGroup f1301b;
        View f1302c;
        ArrayList<Drawable> f1303d = null;
        ar f1304e;

        static {
            try {
                f1300a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException e) {
            }
        }

        C0326a(Context context, ViewGroup viewGroup, View view, ar arVar) {
            super(context);
            this.f1301b = viewGroup;
            this.f1302c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1304e = arVar;
        }

        public final void m911a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f1301b || viewGroup.getParent() == null || !C0679r.m1901B(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1301b.getLocationOnScreen(iArr2);
                    C0679r.m1929c(view, iArr[0] - iArr2[0]);
                    C0679r.m1924b(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        public final void m912b(View view) {
            super.removeView(view);
            Object obj = (getChildCount() == 0 && (this.f1303d == null || this.f1303d.size() == 0)) ? 1 : null;
            if (obj != null) {
                this.f1301b.removeView(this);
            }
        }

        protected final void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f1301b.getLocationOnScreen(iArr);
            this.f1302c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f1302c.getWidth(), this.f1302c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.f1303d == null ? 0 : this.f1303d.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f1303d.get(i)).draw(canvas);
            }
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1301b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f1301b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    int[] iArr3 = new int[2];
                    int[] iArr4 = new int[2];
                    this.f1301b.getLocationOnScreen(iArr3);
                    this.f1302c.getLocationOnScreen(iArr4);
                    iArr2[0] = iArr4[0] - iArr3[0];
                    iArr2[1] = iArr4[1] - iArr3[1];
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        protected final boolean verifyDrawable(Drawable drawable) {
            return super.verifyDrawable(drawable) || (this.f1303d != null && this.f1303d.contains(drawable));
        }
    }

    ar(Context context, ViewGroup viewGroup, View view) {
        this.f1289a = new C0326a(context, viewGroup, view, this);
    }

    static ar m892c(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        while (view2 != null) {
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                viewGroup = (ViewGroup) view2;
                break;
            } else if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        viewGroup = null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            view2 = viewGroup.getChildAt(i);
            if (view2 instanceof C0326a) {
                return ((C0326a) view2).f1304e;
            }
        }
        return new ak(viewGroup.getContext(), viewGroup, view);
    }

    public final void mo235a(Drawable drawable) {
        Callback callback = this.f1289a;
        if (callback.f1303d == null) {
            callback.f1303d = new ArrayList();
        }
        if (!callback.f1303d.contains(drawable)) {
            callback.f1303d.add(drawable);
            callback.invalidate(drawable.getBounds());
            drawable.setCallback(callback);
        }
    }

    public final void mo236b(Drawable drawable) {
        C0326a c0326a = this.f1289a;
        if (c0326a.f1303d != null) {
            c0326a.f1303d.remove(drawable);
            c0326a.invalidate(drawable.getBounds());
            drawable.setCallback(null);
        }
    }
}
