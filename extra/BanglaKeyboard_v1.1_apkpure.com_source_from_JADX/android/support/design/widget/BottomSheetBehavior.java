package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0115k;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0176c;
import android.support.v4.p014c.C0429a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0679r;
import android.support.v4.widget.C0769o;
import android.support.v4.widget.C0769o.C0161a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    int f636a;
    int f637b;
    boolean f638c;
    int f639d = 4;
    C0769o f640e;
    int f641f;
    WeakReference<V> f642g;
    WeakReference<View> f643h;
    C0164a f644i;
    int f645j;
    boolean f646k;
    private float f647l;
    private int f648m;
    private boolean f649n;
    private int f650o;
    private boolean f651p;
    private boolean f652q;
    private int f653r;
    private boolean f654s;
    private VelocityTracker f655t;
    private int f656u;
    private final C0161a f657v = new C01622(this);

    class C01601 implements Runnable {
        final /* synthetic */ View f628a;
        final /* synthetic */ int f629b = 4;
        final /* synthetic */ BottomSheetBehavior f630c;

        C01601(BottomSheetBehavior bottomSheetBehavior, View view) {
            this.f630c = bottomSheetBehavior;
            this.f628a = view;
        }

        public final void run() {
            this.f630c.m436a(this.f628a, this.f629b);
        }
    }

    class C01622 extends C0161a {
        final /* synthetic */ BottomSheetBehavior f631a;

        C01622(BottomSheetBehavior bottomSheetBehavior) {
            this.f631a = bottomSheetBehavior;
        }

        public final int mo113a() {
            return this.f631a.f638c ? this.f631a.f641f - this.f631a.f636a : this.f631a.f637b - this.f631a.f636a;
        }

        public final void mo114a(int i) {
            if (i == 1) {
                this.f631a.m445b(1);
            }
        }

        public final void mo115a(View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f) {
                i = this.f631a.f636a;
            } else if (this.f631a.f638c && this.f631a.m443a(view, f2)) {
                i = this.f631a.f641f;
                i2 = 5;
            } else if (f2 == 0.0f) {
                int top = view.getTop();
                if (Math.abs(top - this.f631a.f636a) < Math.abs(top - this.f631a.f637b)) {
                    i = this.f631a.f636a;
                } else {
                    i = this.f631a.f637b;
                    i2 = 4;
                }
            } else {
                i = this.f631a.f637b;
                i2 = 4;
            }
            if (this.f631a.f640e.m2213a(view.getLeft(), i)) {
                this.f631a.m445b(2);
                C0679r.m1916a(view, new C0165b(this.f631a, view, i2));
                return;
            }
            this.f631a.m445b(i2);
        }

        public final boolean mo116a(View view, int i) {
            if (this.f631a.f639d == 1) {
                return false;
            }
            if (this.f631a.f646k) {
                return false;
            }
            if (this.f631a.f639d == 3 && this.f631a.f645j == i) {
                View view2 = (View) this.f631a.f643h.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return this.f631a.f642g != null && this.f631a.f642g.get() == view;
        }

        public final void mo117b(View view, int i) {
            this.f631a.m434a();
        }

        public final int mo118c(View view, int i) {
            return C0429a.m1144a(i, this.f631a.f636a, this.f631a.f638c ? this.f631a.f641f : this.f631a.f637b);
        }

        public final int mo119d(View view, int i) {
            return view.getLeft();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01631();
        final int f632a;

        static class C01631 implements ClassLoaderCreator<SavedState> {
            C01631() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f632a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f632a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f632a);
        }
    }

    public static abstract class C0164a {
        public abstract void mo179a(int i);
    }

    private class C0165b implements Runnable {
        final /* synthetic */ BottomSheetBehavior f633a;
        private final View f634b;
        private final int f635c;

        C0165b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
            this.f633a = bottomSheetBehavior;
            this.f634b = view;
            this.f635c = i;
        }

        public final void run() {
            if (this.f633a.f640e == null || !this.f633a.f640e.m2220c()) {
                this.f633a.m445b(this.f635c);
            } else {
                C0679r.m1916a(this.f634b, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0115k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            m433c(obtainStyledAttributes.getDimensionPixelSize(C0115k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            m433c(peekValue.data);
        }
        this.f638c = obtainStyledAttributes.getBoolean(C0115k.BottomSheetBehavior_Layout_behavior_hideable, false);
        this.f651p = obtainStyledAttributes.getBoolean(C0115k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        obtainStyledAttributes.recycle();
        this.f647l = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> BottomSheetBehavior<V> m430b(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0176c) {
            Behavior behavior = ((C0176c) layoutParams).f692a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void m431b() {
        this.f645j = -1;
        if (this.f655t != null) {
            this.f655t.recycle();
            this.f655t = null;
        }
    }

    private View m432c(View view) {
        if (C0679r.m1950w(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View c = m432c(viewGroup.getChildAt(i));
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }

    private void m433c(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.f649n) {
                this.f649n = true;
            }
            z = false;
        } else {
            if (this.f649n || this.f648m != i) {
                this.f649n = false;
                this.f648m = Math.max(0, i);
                this.f637b = this.f641f - i;
            }
            z = false;
        }
        if (z && this.f639d == 4 && this.f642g != null) {
            View view = (View) this.f642g.get();
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    final void m434a() {
        this.f642g.get();
    }

    public final void mo93a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo93a(coordinatorLayout, (View) v, savedState.getSuperState());
        if (savedState.f632a == 1 || savedState.f632a == 2) {
            this.f639d = 4;
        } else {
            this.f639d = savedState.f632a;
        }
    }

    final void m436a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f637b;
        } else if (i == 3) {
            i2 = this.f636a;
        } else if (this.f638c && i == 5) {
            i2 = this.f641f;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        }
        if (this.f640e.m2215a(view, view.getLeft(), i2)) {
            m445b(2);
            C0679r.m1916a(view, new C0165b(this, view, i));
            return;
        }
        m445b(i);
    }

    public final void mo120a(V v, View view) {
        int i = 3;
        if (v.getTop() == this.f636a) {
            m445b(3);
        } else if (this.f643h != null && view == this.f643h.get() && this.f654s) {
            int i2;
            if (this.f653r > 0) {
                i2 = this.f636a;
            } else {
                if (this.f638c) {
                    this.f655t.computeCurrentVelocity(1000, this.f647l);
                    if (m443a((View) v, this.f655t.getYVelocity(this.f645j))) {
                        i2 = this.f641f;
                        i = 5;
                    }
                }
                if (this.f653r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f636a) < Math.abs(top - this.f637b)) {
                        i2 = this.f636a;
                    } else {
                        i2 = this.f637b;
                        i = 4;
                    }
                } else {
                    i2 = this.f637b;
                    i = 4;
                }
            }
            if (this.f640e.m2215a((View) v, v.getLeft(), i2)) {
                m445b(2);
                C0679r.m1916a((View) v, new C0165b(this, v, i));
            } else {
                m445b(i);
            }
            this.f654s = false;
        }
    }

    public final void mo121a(V v, View view, int i, int[] iArr) {
        if (view == ((View) this.f643h.get())) {
            int top = v.getTop();
            int i2 = top - i;
            if (i > 0) {
                if (i2 < this.f636a) {
                    iArr[1] = top - this.f636a;
                    C0679r.m1924b((View) v, -iArr[1]);
                    m445b(3);
                } else {
                    iArr[1] = i;
                    C0679r.m1924b((View) v, -i);
                    m445b(1);
                }
            } else if (i < 0 && !view.canScrollVertically(-1)) {
                if (i2 <= this.f637b || this.f638c) {
                    iArr[1] = i;
                    C0679r.m1924b((View) v, -i);
                    m445b(1);
                } else {
                    iArr[1] = top - this.f637b;
                    C0679r.m1924b((View) v, -iArr[1]);
                    m445b(4);
                }
            }
            v.getTop();
            m434a();
            this.f653r = i;
            this.f654s = true;
        }
    }

    public final boolean mo122a(int i) {
        this.f653r = 0;
        this.f654s = false;
        return (i & 2) != 0;
    }

    public final boolean mo86a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int max;
        if (C0679r.m1945r(coordinatorLayout) && !C0679r.m1945r(v)) {
            C0679r.m1926b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.m484a((View) v, i);
        this.f641f = coordinatorLayout.getHeight();
        if (this.f649n) {
            if (this.f650o == 0) {
                this.f650o = coordinatorLayout.getResources().getDimensionPixelSize(C0108d.design_bottom_sheet_peek_height_min);
            }
            max = Math.max(this.f650o, this.f641f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            max = this.f648m;
        }
        this.f636a = Math.max(0, this.f641f - v.getHeight());
        this.f637b = Math.max(this.f641f - max, this.f636a);
        if (this.f639d == 3) {
            C0679r.m1924b((View) v, this.f636a);
        } else if (this.f638c && this.f639d == 5) {
            C0679r.m1924b((View) v, this.f641f);
        } else if (this.f639d == 4) {
            C0679r.m1924b((View) v, this.f637b);
        } else if (this.f639d == 1 || this.f639d == 2) {
            C0679r.m1924b((View) v, top - v.getTop());
        }
        if (this.f640e == null) {
            this.f640e = C0769o.m2196a((ViewGroup) coordinatorLayout, this.f657v);
        }
        this.f642g = new WeakReference(v);
        this.f643h = new WeakReference(m432c((View) v));
        return true;
    }

    public final boolean mo87a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            View view;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m431b();
            }
            if (this.f655t == null) {
                this.f655t = VelocityTracker.obtain();
            }
            this.f655t.addMovement(motionEvent);
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f656u = (int) motionEvent.getY();
                    view = this.f643h != null ? (View) this.f643h.get() : null;
                    if (view != null && coordinatorLayout.m487a(view, x, this.f656u)) {
                        this.f645j = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f646k = true;
                    }
                    boolean z = this.f645j == -1 && !coordinatorLayout.m487a((View) v, x, this.f656u);
                    this.f652q = z;
                    break;
                case 1:
                case 3:
                    this.f646k = false;
                    this.f645j = -1;
                    if (this.f652q) {
                        this.f652q = false;
                        return false;
                    }
                    break;
            }
            if (!this.f652q && this.f640e.m2214a(motionEvent)) {
                return true;
            }
            view = (View) this.f643h.get();
            return (actionMasked != 2 || view == null || this.f652q || this.f639d == 1 || coordinatorLayout.m487a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f656u) - motionEvent.getY()) <= ((float) this.f640e.f2270b)) ? false : true;
        } else {
            this.f652q = true;
            return false;
        }
    }

    public final boolean mo123a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f643h.get() && (this.f639d != 3 || super.mo123a(coordinatorLayout, (View) v, view, f, f2));
    }

    final boolean m443a(View view, float f) {
        return this.f651p ? true : view.getTop() < this.f637b ? false : Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.f637b)) / ((float) this.f648m) > 0.5f;
    }

    public final Parcelable mo100b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo100b(coordinatorLayout, v), this.f639d);
    }

    final void m445b(int i) {
        if (this.f639d != i) {
            this.f639d = i;
            if (((View) this.f642g.get()) != null && this.f644i != null) {
                this.f644i.mo179a(i);
            }
        }
    }

    public final boolean mo88b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f639d == 1 && actionMasked == 0) {
            return true;
        }
        this.f640e.m2219b(motionEvent);
        if (actionMasked == 0) {
            m431b();
        }
        if (this.f655t == null) {
            this.f655t = VelocityTracker.obtain();
        }
        this.f655t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f652q && Math.abs(((float) this.f656u) - motionEvent.getY()) > ((float) this.f640e.f2270b)) {
            this.f640e.m2211a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f652q;
    }
}
