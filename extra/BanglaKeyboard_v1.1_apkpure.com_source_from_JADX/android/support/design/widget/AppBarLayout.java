package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0116a.C0106b;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.design.widget.CoordinatorLayout.C0174a;
import android.support.design.widget.CoordinatorLayout.C0176c;
import android.support.v4.p014c.C0429a;
import android.support.v4.p018f.C0493i;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0127n;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0696z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

@C0174a(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    boolean f608a;
    int f609b;
    C0696z f610c;
    List<C0154a> f611d;
    boolean f612e;
    private int f613f;
    private int f614g;
    private int f615h;
    private boolean f616i;
    private int[] f617j;

    class C01501 implements C0127n {
        final /* synthetic */ AppBarLayout f578a;

        C01501(AppBarLayout appBarLayout) {
            this.f578a = appBarLayout;
        }

        public final C0696z mo61a(View view, C0696z c0696z) {
            View view2 = this.f578a;
            C0696z c0696z2 = null;
            if (C0679r.m1945r(view2)) {
                c0696z2 = c0696z;
            }
            if (!C0493i.m1286a(view2.f610c, c0696z2)) {
                view2.f610c = c0696z2;
                view2.m404a();
            }
            return c0696z;
        }
    }

    public static class Behavior extends HeaderBehavior<AppBarLayout> {
        private int f595b;
        private ValueAnimator f596c;
        private int f597d = -1;
        private boolean f598e;
        private float f599f;
        private WeakReference<View> f600g;
        private C0153a f601h;

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new C01521();
            int f582a;
            float f583b;
            boolean f584c;

            static class C01521 implements ClassLoaderCreator<SavedState> {
                C01521() {
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
                this.f582a = parcel.readInt();
                this.f583b = parcel.readFloat();
                this.f584c = parcel.readByte() != (byte) 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f582a);
                parcel.writeFloat(this.f583b);
                parcel.writeByte((byte) (this.f584c ? 1 : 0));
            }
        }

        public static abstract class C0153a {
            public abstract boolean m333a();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void m367a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int i;
            int a = mo89a();
            int childCount = appBarLayout.getChildCount();
            for (i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                if (childAt.getTop() <= (-a) && childAt.getBottom() >= (-a)) {
                    childCount = i;
                    break;
                }
            }
            childCount = -1;
            if (childCount >= 0) {
                View childAt2 = appBarLayout.getChildAt(childCount);
                int i2 = ((LayoutParams) childAt2.getLayoutParams()).f602a;
                if ((i2 & 17) == 17) {
                    int i3 = -childAt2.getTop();
                    i = -childAt2.getBottom();
                    if (childCount == appBarLayout.getChildCount() - 1) {
                        i += appBarLayout.getTopInset();
                    }
                    if (m370a(i2, 2)) {
                        i += C0679r.m1938k(childAt2);
                        childCount = i3;
                    } else if (m370a(i2, 5)) {
                        childCount = C0679r.m1938k(childAt2) + i;
                        if (a >= childCount) {
                            i = childCount;
                            childCount = i3;
                        }
                    } else {
                        childCount = i3;
                    }
                    if (a >= (i + childCount) / 2) {
                        i = childCount;
                    }
                    m368a(coordinatorLayout, appBarLayout, C0429a.m1144a(i, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        private void m368a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(mo89a() - i);
            float abs2 = Math.abs(0.0f);
            abs = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            if (mo89a() != i) {
                if (this.f596c == null) {
                    this.f596c = new ValueAnimator();
                    this.f596c.setInterpolator(C0215a.f919e);
                    this.f596c.addUpdateListener(new AnimatorUpdateListener(this) {
                        final /* synthetic */ Behavior f581c;

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f581c.a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else {
                    this.f596c.cancel();
                }
                this.f596c.setDuration((long) Math.min(abs, 600));
                this.f596c.setIntValues(new int[]{r1, i});
                this.f596c.start();
            } else if (this.f596c != null && this.f596c.isRunning()) {
                this.f596c.cancel();
            }
        }

        private static void m369a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            int i3;
            View view;
            Object obj = null;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    view = childAt;
                    break;
                }
            }
            view = null;
            if (view != null) {
                boolean z2;
                Object obj2;
                Collection b;
                List list;
                android.support.design.widget.CoordinatorLayout.Behavior behavior;
                int i4 = ((LayoutParams) view.getLayoutParams()).f602a;
                if ((i4 & 1) != 0) {
                    abs = C0679r.m1938k(view);
                    if (i2 > 0 && (i4 & 12) != 0) {
                        z2 = (-i) >= (view.getBottom() - abs) - appBarLayout.getTopInset();
                        if (appBarLayout.f612e != z2) {
                            obj2 = null;
                        } else {
                            appBarLayout.f612e = z2;
                            appBarLayout.refreshDrawableState();
                            obj2 = 1;
                        }
                        if (VERSION.SDK_INT < 11) {
                            if (!z) {
                                if (obj2 == null) {
                                    b = coordinatorLayout.f716e.m642b(appBarLayout);
                                    coordinatorLayout.f717f.clear();
                                    if (b != null) {
                                        coordinatorLayout.f717f.addAll(b);
                                    }
                                    list = coordinatorLayout.f717f;
                                    childCount = list.size();
                                    while (i3 < childCount) {
                                        behavior = ((C0176c) ((View) list.get(i3)).getLayoutParams()).f692a;
                                        if (behavior instanceof ScrollingViewBehavior) {
                                        } else {
                                            if (((ScrollingViewBehavior) behavior).f607d != 0) {
                                                obj = 1;
                                            }
                                            if (obj == null) {
                                                return;
                                            }
                                        }
                                    }
                                    if (obj == null) {
                                        return;
                                    }
                                }
                                return;
                            }
                            appBarLayout.jumpDrawablesToCurrentState();
                        }
                    } else if ((i4 & 2) != 0) {
                        z2 = (-i) >= (view.getBottom() - abs) - appBarLayout.getTopInset();
                        if (appBarLayout.f612e != z2) {
                            appBarLayout.f612e = z2;
                            appBarLayout.refreshDrawableState();
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        if (VERSION.SDK_INT < 11) {
                            if (z) {
                                if (obj2 == null) {
                                    b = coordinatorLayout.f716e.m642b(appBarLayout);
                                    coordinatorLayout.f717f.clear();
                                    if (b != null) {
                                        coordinatorLayout.f717f.addAll(b);
                                    }
                                    list = coordinatorLayout.f717f;
                                    childCount = list.size();
                                    for (i3 = 0; i3 < childCount; i3++) {
                                        behavior = ((C0176c) ((View) list.get(i3)).getLayoutParams()).f692a;
                                        if (behavior instanceof ScrollingViewBehavior) {
                                            if (((ScrollingViewBehavior) behavior).f607d != 0) {
                                                obj = 1;
                                            }
                                            if (obj == null) {
                                                return;
                                            }
                                        }
                                    }
                                    if (obj == null) {
                                        return;
                                    }
                                }
                                return;
                            }
                            appBarLayout.jumpDrawablesToCurrentState();
                        }
                    }
                }
                z2 = false;
                if (appBarLayout.f612e != z2) {
                    appBarLayout.f612e = z2;
                    appBarLayout.refreshDrawableState();
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (VERSION.SDK_INT < 11) {
                    if (z) {
                        if (obj2 == null) {
                            b = coordinatorLayout.f716e.m642b(appBarLayout);
                            coordinatorLayout.f717f.clear();
                            if (b != null) {
                                coordinatorLayout.f717f.addAll(b);
                            }
                            list = coordinatorLayout.f717f;
                            childCount = list.size();
                            for (i3 = 0; i3 < childCount; i3++) {
                                behavior = ((C0176c) ((View) list.get(i3)).getLayoutParams()).f692a;
                                if (behavior instanceof ScrollingViewBehavior) {
                                    if (((ScrollingViewBehavior) behavior).f607d != 0) {
                                        obj = 1;
                                    }
                                    if (obj == null) {
                                        return;
                                    }
                                }
                            }
                            if (obj == null) {
                                return;
                            }
                        }
                        return;
                    }
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        private static boolean m370a(int i, int i2) {
            return (i & i2) == i2;
        }

        final int mo89a() {
            return super.mo103c() + this.f595b;
        }

        final /* synthetic */ int mo90a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int a = mo89a();
            if (i2 == 0 || a < i2 || a > i3) {
                this.f595b = 0;
                return 0;
            }
            int a2 = C0429a.m1144a(i, i2, i3);
            if (a == a2) {
                return 0;
            }
            int abs;
            int childCount;
            int height;
            if (appBarLayout.f608a) {
                abs = Math.abs(a2);
                childCount = appBarLayout.getChildCount();
                int i4 = 0;
                while (i4 < childCount) {
                    View childAt = appBarLayout.getChildAt(i4);
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    Interpolator interpolator = layoutParams.f603b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i4++;
                    } else {
                        if (interpolator != null) {
                            i4 = layoutParams.f602a;
                            if ((i4 & 1) != 0) {
                                height = (layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin)) + 0;
                                if ((i4 & 2) != 0) {
                                    height -= C0679r.m1938k(childAt);
                                }
                            } else {
                                height = 0;
                            }
                            if (C0679r.m1945r(childAt)) {
                                height -= appBarLayout.getTopInset();
                            }
                            if (height > 0) {
                                height = (Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / ((float) height)) * ((float) height)) + childAt.getTop()) * Integer.signum(a2);
                            }
                        }
                        height = a2;
                    }
                }
                height = a2;
            } else {
                height = a2;
            }
            boolean a_ = super.a_(height);
            childCount = a - a2;
            this.f595b = a2 - height;
            if (!a_ && appBarLayout.f608a) {
                List b = coordinatorLayout.f716e.m642b(appBarLayout);
                if (!(b == null || b.isEmpty())) {
                    for (abs = 0; abs < b.size(); abs++) {
                        View view2 = (View) b.get(abs);
                        android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0176c) view2.getLayoutParams()).f692a;
                        if (behavior != null) {
                            behavior.mo107a(coordinatorLayout, view2, (View) appBarLayout);
                        }
                    }
                }
            }
            appBarLayout.m405a(super.mo103c());
            m369a(coordinatorLayout, appBarLayout, a2, a2 < a ? -1 : 1, false);
            return childCount;
        }

        final /* synthetic */ int mo91a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final /* synthetic */ void mo93a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo93a(coordinatorLayout, (View) appBarLayout, savedState.getSuperState());
                this.f597d = savedState.f582a;
                this.f599f = savedState.f583b;
                this.f598e = savedState.f584c;
                return;
            }
            super.mo93a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.f597d = -1;
        }

        public final /* synthetic */ void mo94a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i == 0) {
                m367a(coordinatorLayout, appBarLayout);
            }
            this.f600g = new WeakReference(view2);
        }

        public final /* synthetic */ void mo95a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i != 0) {
                int i3;
                int downNestedPreScrollRange;
                if (i < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = i3 + appBarLayout.getDownNestedPreScrollRange();
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i3 != downNestedPreScrollRange) {
                    iArr[1] = m362b(coordinatorLayout, appBarLayout, i, i3, downNestedPreScrollRange);
                }
            }
        }

        public final /* synthetic */ boolean mo86a(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean a = super.mo86a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f597d >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f597d);
                pendingAction = -childAt.getBottom();
                a_(coordinatorLayout, appBarLayout, this.f598e ? (C0679r.m1938k(childAt) + appBarLayout.getTopInset()) + pendingAction : Math.round(((float) childAt.getHeight()) * this.f599f) + pendingAction);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    pendingAction = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m368a(coordinatorLayout, appBarLayout, pendingAction);
                    } else {
                        a_(coordinatorLayout, appBarLayout, pendingAction);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m368a(coordinatorLayout, appBarLayout, 0);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f609b = 0;
            this.f597d = -1;
            super.a_(C0429a.m1144a(super.mo103c(), -appBarLayout.getTotalScrollRange(), 0));
            m369a(coordinatorLayout, appBarLayout, super.mo103c(), 0, true);
            appBarLayout.m405a(super.mo103c());
            return a;
        }

        public final /* synthetic */ boolean mo96a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            View view2 = (AppBarLayout) view;
            if (((C0176c) view2.getLayoutParams()).height != -2) {
                return super.mo96a(coordinatorLayout, view2, i, i2, i3, i4);
            }
            coordinatorLayout.m485a(view2, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ boolean mo97a(android.support.design.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, int r8, int r9) {
            /*
            r4 = this;
            r0 = 1;
            r1 = 0;
            r6 = (android.support.design.widget.AppBarLayout) r6;
            r2 = r8 & 2;
            if (r2 == 0) goto L_0x0031;
        L_0x0008:
            r2 = r6.getTotalScrollRange();
            if (r2 == 0) goto L_0x002f;
        L_0x000e:
            r2 = r0;
        L_0x000f:
            if (r2 == 0) goto L_0x0031;
        L_0x0011:
            r2 = r5.getHeight();
            r3 = r7.getHeight();
            r2 = r2 - r3;
            r3 = r6.getHeight();
            if (r2 > r3) goto L_0x0031;
        L_0x0020:
            if (r0 == 0) goto L_0x002b;
        L_0x0022:
            r1 = r4.f596c;
            if (r1 == 0) goto L_0x002b;
        L_0x0026:
            r1 = r4.f596c;
            r1.cancel();
        L_0x002b:
            r1 = 0;
            r4.f600g = r1;
            return r0;
        L_0x002f:
            r2 = r1;
            goto L_0x000f;
        L_0x0031:
            r0 = r1;
            goto L_0x0020;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }

        public final /* bridge */ /* synthetic */ boolean a_(int i) {
            return super.a_(i);
        }

        final /* synthetic */ int mo99b(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final /* synthetic */ Parcelable mo100b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = false;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable b = super.mo100b(coordinatorLayout, appBarLayout);
            int c = super.mo103c();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(b);
                    savedState.f582a = i;
                    if (bottom == C0679r.m1938k(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f584c = z;
                    savedState.f583b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return b;
        }

        public final /* synthetic */ void mo101b(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i < 0) {
                m362b(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        final /* synthetic */ boolean mo102b() {
            if (this.f601h != null) {
                return this.f601h.m333a();
            }
            if (this.f600g != null) {
                View view = (View) this.f600g.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        public final /* bridge */ /* synthetic */ int mo103c() {
            return super.mo103c();
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        int f602a = 1;
        Interpolator f603b;

        public LayoutParams() {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.AppBarLayout_Layout);
            this.f602a = obtainStyledAttributes.getInt(C0115k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0115k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f603b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0115k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.ScrollingViewBehavior_Layout);
            this.f607d = obtainStyledAttributes.getDimensionPixelSize(C0115k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        private static AppBarLayout m392b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        final /* synthetic */ View mo105a(List list) {
            return m392b(list);
        }

        public final /* bridge */ /* synthetic */ boolean mo96a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo96a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final boolean mo106a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = m392b(coordinatorLayout.m481a(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.m406a(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public final boolean mo107a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0176c) view2.getLayoutParams()).f692a;
            if (behavior instanceof Behavior) {
                int bottom = view2.getBottom() - view.getTop();
                C0679r.m1924b(view, ((((Behavior) behavior).f595b + bottom) + this.f606c) - m391d(view2));
            }
            return false;
        }

        public final boolean a_(View view) {
            return view instanceof AppBarLayout;
        }

        final float mo109b(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0176c) appBarLayout.getLayoutParams()).f692a;
                int a = behavior instanceof Behavior ? ((Behavior) behavior).mo89a() : 0;
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                totalScrollRange -= downNestedPreScrollRange;
                if (totalScrollRange != 0) {
                    return (((float) a) / ((float) totalScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public final /* bridge */ /* synthetic */ int mo103c() {
            return super.mo103c();
        }

        final int mo110c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo110c(view);
        }
    }

    public interface C0154a {
        void mo144a(int i);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f613f = -1;
        this.f614g = -1;
        this.f615h = -1;
        this.f609b = 0;
        setOrientation(1);
        C0260o.m694a(context);
        if (VERSION.SDK_INT >= 21) {
            C0264s.m701a(this);
            C0264s.m703a(this, attributeSet, C0114j.Widget_Design_AppBarLayout);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.AppBarLayout, 0, C0114j.Widget_Design_AppBarLayout);
        C0679r.m1912a((View) this, obtainStyledAttributes.getDrawable(C0115k.AppBarLayout_android_background));
        if (obtainStyledAttributes.hasValue(C0115k.AppBarLayout_expanded)) {
            m406a(obtainStyledAttributes.getBoolean(C0115k.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(C0115k.AppBarLayout_elevation)) {
            C0264s.m702a(this, (float) obtainStyledAttributes.getDimensionPixelSize(C0115k.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes.hasValue(C0115k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(C0115k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (obtainStyledAttributes.hasValue(C0115k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(C0115k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        obtainStyledAttributes.recycle();
        C0679r.m1914a((View) this, new C01501(this));
    }

    private LayoutParams m402a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private static LayoutParams m403a(android.view.ViewGroup.LayoutParams layoutParams) {
        return (VERSION.SDK_INT < 19 || !(layoutParams instanceof android.widget.LinearLayout.LayoutParams)) ? layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams) : new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
    }

    final void m404a() {
        this.f613f = -1;
        this.f614g = -1;
        this.f615h = -1;
    }

    final void m405a(int i) {
        if (this.f611d != null) {
            int size = this.f611d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0154a c0154a = (C0154a) this.f611d.get(i2);
                if (c0154a != null) {
                    c0154a.mo144a(i);
                }
            }
        }
    }

    final void m406a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z2 ? 4 : 0) | (z ? 1 : 2);
        if (z3) {
            i = 8;
        }
        this.f609b = i | i2;
        requestLayout();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected /* synthetic */ android.widget.LinearLayout.LayoutParams m7542generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m402a(attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m403a(layoutParams);
    }

    public /* synthetic */ android.widget.LinearLayout.LayoutParams m7543generateLayoutParams(AttributeSet attributeSet) {
        return m402a(attributeSet);
    }

    protected /* synthetic */ android.widget.LinearLayout.LayoutParams m7544generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m403a(layoutParams);
    }

    int getDownNestedPreScrollRange() {
        if (this.f614g != -1) {
            return this.f614g;
        }
        int i;
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f602a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
                i = i2;
            } else {
                i = (layoutParams.bottomMargin + layoutParams.topMargin) + i2;
                i = (i3 & 8) != 0 ? i + C0679r.m1938k(childAt) : (i3 & 2) != 0 ? i + (measuredHeight - C0679r.m1938k(childAt)) : i + (measuredHeight - getTopInset());
            }
            childCount--;
            i2 = i;
        }
        i = Math.max(0, i2);
        this.f614g = i;
        return i;
    }

    int getDownNestedScrollRange() {
        if (this.f615h != -1) {
            return this.f615h;
        }
        int i;
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (layoutParams.topMargin + layoutParams.bottomMargin);
            i = layoutParams.f602a;
            if ((i & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i & 2) != 0) {
                i = i2 - (C0679r.m1938k(childAt) + getTopInset());
                break;
            }
        }
        i = i2;
        i = Math.max(0, i);
        this.f615h = i;
        return i;
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int k = C0679r.m1938k(this);
        if (k != 0) {
            return (k * 2) + topInset;
        }
        k = getChildCount();
        k = k > 0 ? C0679r.m1938k(getChildAt(k - 1)) : 0;
        return k != 0 ? (k * 2) + topInset : getHeight() / 3;
    }

    int getPendingAction() {
        return this.f609b;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        return this.f610c != null ? this.f610c.m1995b() : 0;
    }

    public final int getTotalScrollRange() {
        if (this.f613f != -1) {
            return this.f613f;
        }
        int k;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f602a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += layoutParams.bottomMargin + (measuredHeight + layoutParams.topMargin);
            if ((i3 & 2) != 0) {
                k = i - C0679r.m1938k(childAt);
                break;
            }
        }
        k = i;
        k = Math.max(0, k - getTopInset());
        this.f613f = k;
        return k;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    protected int[] onCreateDrawableState(int i) {
        if (this.f617j == null) {
            this.f617j = new int[2];
        }
        int[] iArr = this.f617j;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        iArr[0] = this.f616i ? C0106b.state_collapsible : -C0106b.state_collapsible;
        int i2 = (this.f616i && this.f612e) ? C0106b.state_collapsed : -C0106b.state_collapsed;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        m404a();
        this.f608a = false;
        int childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).f603b != null) {
                this.f608a = true;
                break;
            }
        }
        childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
            z2 = (layoutParams.f602a & 1) == 1 && (layoutParams.f602a & 10) != 0;
            if (z2) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (this.f616i != z2) {
            this.f616i = z2;
            refreshDrawableState();
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m404a();
    }

    public void setExpanded(boolean z) {
        m406a(z, C0679r.m1952y(this), true);
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0264s.m702a(this, f);
        }
    }
}
