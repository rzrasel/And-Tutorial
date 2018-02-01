package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.C0122a;
import android.support.v4.view.C0125i;
import android.support.v4.view.C0179k;
import android.support.v4.view.C0665j;
import android.support.v4.view.C0666m;
import android.support.v4.view.C0679r;
import android.support.v4.view.p019a.C0626b;
import android.support.v4.view.p019a.C0643f;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.List;

public class NestedScrollView extends FrameLayout implements C0125i, C0179k {
    private static final C0706a f2067w = new C0706a();
    private static final int[] f2068x = new int[]{16843130};
    private float f2069A;
    private C0707b f2070B;
    private long f2071a;
    private final Rect f2072b;
    private OverScroller f2073c;
    private EdgeEffect f2074d;
    private EdgeEffect f2075e;
    private int f2076f;
    private boolean f2077g;
    private boolean f2078h;
    private View f2079i;
    private boolean f2080j;
    private VelocityTracker f2081k;
    private boolean f2082l;
    private boolean f2083m;
    private int f2084n;
    private int f2085o;
    private int f2086p;
    private int f2087q;
    private final int[] f2088r;
    private final int[] f2089s;
    private int f2090t;
    private int f2091u;
    private SavedState f2092v;
    private final C0666m f2093y;
    private final C0665j f2094z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C07051();
        public int f2066a;

        static class C07051 implements Creator<SavedState> {
            C07051() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2066a = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2066a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2066a);
        }
    }

    static class C0706a extends C0122a {
        C0706a() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0643f.m1736a(accessibilityEvent, nestedScrollView.getScrollX());
            C0643f.m1737b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0626b.m1694b(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    c0626b.m1708j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0626b.m1684a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0626b.m1684a(4096);
                    }
                }
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int min;
            switch (i) {
                case 4096:
                    min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.getScrollRange());
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2063a(min);
                    return true;
                case FragmentTransaction.TRANSIT_EXIT_MASK /*8192*/:
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2063a(min);
                    return true;
                default:
                    return false;
            }
        }
    }

    public interface C0707b {
        void mo729a(NestedScrollView nestedScrollView);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2072b = new Rect();
        this.f2077g = true;
        this.f2078h = false;
        this.f2079i = null;
        this.f2080j = false;
        this.f2083m = true;
        this.f2087q = -1;
        this.f2088r = new int[2];
        this.f2089s = new int[2];
        this.f2073c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2084n = viewConfiguration.getScaledTouchSlop();
        this.f2085o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2086p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2068x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2093y = new C0666m(this);
        this.f2094z = new C0665j(this);
        setNestedScrollingEnabled(true);
        C0679r.m1913a((View) this, f2067w);
    }

    private int m2040a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            scrollY = Math.min(rect.height() > height ? (rect.top - scrollY) + 0 : (rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            scrollY = 0;
        } else {
            scrollY = Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return scrollY;
    }

    private void m2041a() {
        if (this.f2081k == null) {
            this.f2081k = VelocityTracker.obtain();
        }
    }

    private void m2042a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2071a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f2073c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, max)) - scrollY);
                C0679r.m1928c(this);
            } else {
                if (!this.f2073c.isFinished()) {
                    this.f2073c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f2071a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void m2043a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2087q) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f2076f = (int) motionEvent.getY(actionIndex);
            this.f2087q = motionEvent.getPointerId(actionIndex);
            if (this.f2081k != null) {
                this.f2081k.clear();
            }
        }
    }

    private boolean m2044a(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        Object obj = i == 33 ? 1 : null;
        List focusables = getFocusables(2);
        View view = null;
        Object obj2 = null;
        int size = focusables.size();
        int i5 = 0;
        while (i5 < size) {
            View view2;
            Object obj3;
            View view3 = (View) focusables.get(i5);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 < bottom && top < i3) {
                Object obj4 = (i2 >= top || bottom >= i3) ? null : 1;
                if (view == null) {
                    Object obj5 = obj4;
                    view2 = view3;
                    obj3 = obj5;
                } else {
                    Object obj6 = ((obj == null || top >= view.getTop()) && (obj != null || bottom <= view.getBottom())) ? null : 1;
                    if (obj2 != null) {
                        if (!(obj4 == null || obj6 == null)) {
                            view2 = view3;
                            obj3 = obj2;
                        }
                    } else if (obj4 != null) {
                        view2 = view3;
                        height = 1;
                    } else if (obj6 != null) {
                        view2 = view3;
                        obj3 = obj2;
                    }
                }
                i5++;
                view = view2;
                obj2 = obj3;
            }
            obj3 = obj2;
            view2 = view;
            i5++;
            view = view2;
            obj2 = obj3;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2061g(obj != null ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    private boolean m2045a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i3 + i;
        int i7 = i4 + 0;
        if (i5 > 0) {
            z = true;
            i5 = 0;
        } else if (i5 < 0) {
            z = true;
            i5 = 0;
        } else {
            z = false;
        }
        if (i6 > i7) {
            z2 = true;
        } else if (i6 < 0) {
            z2 = true;
            i7 = 0;
        } else {
            z2 = false;
            i7 = i6;
        }
        if (z2 && !m2058d(1)) {
            this.f2073c.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i7, z, z2);
        return z || z2;
    }

    private boolean m2046a(int i, int i2, int[] iArr, int i3) {
        return this.f2094z.m1788a(0, i, 0, i2, iArr, i3);
    }

    private boolean m2047a(int i, int[] iArr, int[] iArr2, int i2) {
        return this.f2094z.m1790a(0, i, iArr, iArr2, i2);
    }

    private boolean m2048a(View view) {
        return !m2049a(view, 0, getHeight());
    }

    private boolean m2049a(View view, int i, int i2) {
        view.getDrawingRect(this.f2072b);
        offsetDescendantRectToMyCoords(view, this.f2072b);
        return this.f2072b.bottom + i >= getScrollY() && this.f2072b.top - i <= getScrollY() + i2;
    }

    private static boolean m2050a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m2050a((View) parent, view2);
    }

    private static int m2051b(int i, int i2, int i3) {
        return (i2 >= i3 || i < 0) ? 0 : i2 + i > i3 ? i3 - i2 : i;
    }

    private void m2052b() {
        if (this.f2081k != null) {
            this.f2081k.recycle();
            this.f2081k = null;
        }
    }

    private void m2053b(View view) {
        view.getDrawingRect(this.f2072b);
        offsetDescendantRectToMyCoords(view, this.f2072b);
        int a = m2040a(this.f2072b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private boolean m2054b(int i) {
        return this.f2094z.m1786a(2, i);
    }

    private void m2055c() {
        this.f2080j = false;
        m2052b();
        m2056c(0);
        if (this.f2074d != null) {
            this.f2074d.onRelease();
            this.f2075e.onRelease();
        }
    }

    private void m2056c(int i) {
        this.f2094z.m1791b(i);
    }

    private void m2057d() {
        if (getOverScrollMode() == 2) {
            this.f2074d = null;
            this.f2075e = null;
        } else if (this.f2074d == null) {
            Context context = getContext();
            this.f2074d = new EdgeEffect(context);
            this.f2075e = new EdgeEffect(context);
        }
    }

    private boolean m2058d(int i) {
        return this.f2094z.m1785a(i);
    }

    private boolean m2059e(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        this.f2072b.top = 0;
        this.f2072b.bottom = height;
        if (i2 != 0) {
            i2 = getChildCount();
            if (i2 > 0) {
                this.f2072b.bottom = getChildAt(i2 - 1).getBottom() + getPaddingBottom();
                this.f2072b.top = this.f2072b.bottom - height;
            }
        }
        return m2044a(i, this.f2072b.top, this.f2072b.bottom);
    }

    private boolean m2060f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2049a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < maxScrollAmount) {
                    maxScrollAmount = bottom - scrollY;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2061g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2072b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2072b);
            m2061g(m2040a(this.f2072b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m2048a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private void m2061g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2083m) {
            m2042a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2069A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2069A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2069A;
    }

    private void m2062h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        if (!dispatchNestedPreFling(0.0f, (float) i)) {
            dispatchNestedFling(0.0f, (float) i, z);
            if (getChildCount() > 0) {
                m2054b(1);
                this.f2073c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 0);
                this.f2091u = getScrollY();
                C0679r.m1928c(this);
            }
        }
    }

    public final void m2063a(int i) {
        m2042a(0 - getScrollX(), i - getScrollY());
    }

    public final boolean m2064a(KeyEvent keyEvent) {
        boolean z;
        this.f2072b.setEmpty();
        View childAt = getChildAt(0);
        if (childAt != null) {
            z = getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        } else {
            z = false;
        }
        View childAt2;
        if (z) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case 19:
                    return !keyEvent.isAltPressed() ? m2060f(33) : m2059e(33);
                case 20:
                    return !keyEvent.isAltPressed() ? m2060f(130) : m2059e(130);
                case 62:
                    int i = keyEvent.isShiftPressed() ? 33 : 130;
                    boolean z2 = i == 130;
                    int height = getHeight();
                    if (z2) {
                        this.f2072b.top = getScrollY() + height;
                        int childCount = getChildCount();
                        if (childCount > 0) {
                            childAt2 = getChildAt(childCount - 1);
                            if (this.f2072b.top + height > childAt2.getBottom()) {
                                this.f2072b.top = childAt2.getBottom() - height;
                            }
                        }
                    } else {
                        this.f2072b.top = getScrollY() - height;
                        if (this.f2072b.top < 0) {
                            this.f2072b.top = 0;
                        }
                    }
                    this.f2072b.bottom = height + this.f2072b.top;
                    m2044a(i, this.f2072b.top, this.f2072b.bottom);
                    return false;
                default:
                    return false;
            }
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            childAt2 = findFocus();
            if (childAt2 == this) {
                childAt2 = null;
            }
            childAt2 = FocusFinder.getInstance().findNextFocus(this, childAt2, 130);
            return (childAt2 == null || childAt2 == this || !childAt2.requestFocus(130)) ? false : true;
        }
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        int i = 0;
        if (this.f2073c.computeScrollOffset()) {
            this.f2073c.getCurrX();
            int currY = this.f2073c.getCurrY();
            int i2 = currY - this.f2091u;
            if (m2047a(i2, this.f2089s, null, 1)) {
                i2 -= this.f2089s[1];
            }
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                m2045a(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                if (!m2046a(scrollY2, i2 - scrollY2, null, 1)) {
                    i2 = getOverScrollMode();
                    if (i2 == 0 || (i2 == 1 && scrollRange > 0)) {
                        i = 1;
                    }
                    if (i != 0) {
                        m2057d();
                        if (currY <= 0 && scrollY > 0) {
                            this.f2074d.onAbsorb((int) this.f2073c.getCurrVelocity());
                        } else if (currY >= scrollRange && scrollY < scrollRange) {
                            this.f2075e.onAbsorb((int) this.f2073c.getCurrVelocity());
                        }
                    }
                }
            }
            this.f2091u = currY;
            C0679r.m1928c(this);
            return;
        }
        if (m2058d(1)) {
            m2056c(1);
        }
        this.f2091u = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        height = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > height ? bottom + (scrollY - height) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2064a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2094z.m1784a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2094z.m1783a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f2094z.m1789a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2094z.m1787a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2074d != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.f2074d.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.f2074d.setSize(width, getHeight());
                if (this.f2074d.draw(canvas)) {
                    C0679r.m1928c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2075e.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width) + getPaddingLeft()), (float) (Math.max(getScrollRange(), scrollY) + height));
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f2075e.setSize(width, height);
                if (this.f2075e.draw(canvas)) {
                    C0679r.m1928c(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * ((float) getHeight()));
    }

    public int getNestedScrollAxes() {
        return this.f2093y.f1970a;
    }

    int getScrollRange() {
        return getChildCount() > 0 ? Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop())) : 0;
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f2094z.m1785a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2094z.f1965a;
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2078h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 8:
                if (this.f2080j) {
                    return false;
                }
                float axisValue = motionEvent.getAxisValue(9);
                if (axisValue == 0.0f) {
                    return false;
                }
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                verticalScrollFactorCompat = scrollY - verticalScrollFactorCompat;
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange == scrollY) {
                    return false;
                }
                super.scrollTo(getScrollX(), scrollRange);
                return true;
            default:
                return false;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        int action = motionEvent.getAction();
        if (action == 2 && this.f2080j) {
            return true;
        }
        int y;
        switch (action & 255) {
            case 0:
                boolean z2;
                y = (int) motionEvent.getY();
                action = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    z2 = y >= childAt.getTop() - scrollY && y < childAt.getBottom() - scrollY && action >= childAt.getLeft() && action < childAt.getRight();
                } else {
                    z2 = false;
                }
                if (!z2) {
                    this.f2080j = false;
                    m2052b();
                    break;
                }
                this.f2076f = y;
                this.f2087q = motionEvent.getPointerId(0);
                if (this.f2081k == null) {
                    this.f2081k = VelocityTracker.obtain();
                } else {
                    this.f2081k.clear();
                }
                this.f2081k.addMovement(motionEvent);
                this.f2073c.computeScrollOffset();
                if (this.f2073c.isFinished()) {
                    z = false;
                }
                this.f2080j = z;
                m2054b(0);
                break;
                break;
            case 1:
            case 3:
                this.f2080j = false;
                this.f2087q = -1;
                m2052b();
                if (this.f2073c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0679r.m1928c(this);
                }
                m2056c(0);
                break;
            case 2:
                action = this.f2087q;
                if (action != -1) {
                    y = motionEvent.findPointerIndex(action);
                    if (y != -1) {
                        action = (int) motionEvent.getY(y);
                        if (Math.abs(action - this.f2076f) > this.f2084n && (getNestedScrollAxes() & 2) == 0) {
                            this.f2080j = true;
                            this.f2076f = action;
                            m2041a();
                            this.f2081k.addMovement(motionEvent);
                            this.f2090t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    new StringBuilder("Invalid pointerId=").append(action).append(" in onInterceptTouchEvent");
                    break;
                }
                break;
            case 6:
                m2043a(motionEvent);
                break;
        }
        return this.f2080j;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2077g = false;
        if (this.f2079i != null && m2050a(this.f2079i, (View) this)) {
            m2053b(this.f2079i);
        }
        this.f2079i = null;
        if (!this.f2078h) {
            if (this.f2092v != null) {
                scrollTo(getScrollX(), this.f2092v.f2066a);
                this.f2092v = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2078h = true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2082l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m2062h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2093y.f1970a = i;
        startNestedScroll(2);
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        return (findNextFocus == null || m2048a(findNextFocus)) ? false : findNextFocus.requestFocus(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f2092v = savedState;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2066a = getScrollY();
        return savedState;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f2070B != null) {
            this.f2070B.mo729a(this);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2049a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2072b);
            offsetDescendantRectToMyCoords(findFocus, this.f2072b);
            m2061g(m2040a(this.f2072b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f2093y.f1970a = 0;
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m2041a();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2090t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f2090t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.f2073c.isFinished();
                    this.f2080j = z;
                    if (z) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f2073c.isFinished()) {
                        this.f2073c.abortAnimation();
                    }
                    this.f2076f = (int) motionEvent.getY();
                    this.f2087q = motionEvent.getPointerId(0);
                    m2054b(0);
                    break;
                }
                return false;
            case 1:
                VelocityTracker velocityTracker = this.f2081k;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f2086p);
                actionMasked = (int) velocityTracker.getYVelocity(this.f2087q);
                if (Math.abs(actionMasked) > this.f2085o) {
                    m2062h(-actionMasked);
                } else {
                    if (this.f2073c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0679r.m1928c(this);
                    }
                }
                this.f2087q = -1;
                m2055c();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f2087q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    actionMasked = this.f2076f - y;
                    if (m2047a(actionMasked, this.f2089s, this.f2088r, 0)) {
                        actionMasked -= this.f2089s[1];
                        obtain.offsetLocation(0.0f, (float) this.f2088r[1]);
                        this.f2090t += this.f2088r[1];
                    }
                    if (!this.f2080j && Math.abs(actionMasked) > this.f2084n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2080j = true;
                        actionMasked = actionMasked > 0 ? actionMasked - this.f2084n : actionMasked + this.f2084n;
                    }
                    if (this.f2080j) {
                        this.f2076f = y - this.f2088r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        y = getOverScrollMode();
                        boolean z2 = y == 0 || (y == 1 && scrollRange > 0);
                        if (m2045a(actionMasked, 0, getScrollY(), scrollRange) && !m2058d(0)) {
                            this.f2081k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!m2046a(scrollY2, actionMasked - scrollY2, this.f2088r, 0)) {
                            if (z2) {
                                m2057d();
                                y = scrollY + actionMasked;
                                if (y < 0) {
                                    C0747g.m2144a(this.f2074d, ((float) actionMasked) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f2075e.isFinished()) {
                                        this.f2075e.onRelease();
                                    }
                                } else if (y > scrollRange) {
                                    C0747g.m2144a(this.f2075e, ((float) actionMasked) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.f2074d.isFinished()) {
                                        this.f2074d.onRelease();
                                    }
                                }
                                if (!(this.f2074d == null || (this.f2074d.isFinished() && this.f2075e.isFinished()))) {
                                    C0679r.m1928c(this);
                                    break;
                                }
                            }
                        }
                        this.f2076f -= this.f2088r[1];
                        obtain.offsetLocation(0.0f, (float) this.f2088r[1]);
                        this.f2090t += this.f2088r[1];
                        break;
                    }
                }
                new StringBuilder("Invalid pointerId=").append(this.f2087q).append(" in onTouchEvent");
                break;
                break;
            case 3:
                if (this.f2080j && getChildCount() > 0) {
                    if (this.f2073c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0679r.m1928c(this);
                    }
                }
                this.f2087q = -1;
                m2055c();
                break;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                this.f2076f = (int) motionEvent.getY(actionMasked);
                this.f2087q = motionEvent.getPointerId(actionMasked);
                break;
            case 6:
                m2043a(motionEvent);
                this.f2076f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2087q));
                break;
        }
        if (this.f2081k != null) {
            this.f2081k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f2077g) {
            this.f2079i = view2;
        } else {
            m2053b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m2040a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m2042a(0, a);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2052b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2077g = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b = m2051b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b2 = m2051b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2082l) {
            this.f2082l = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2094z.m1782a(z);
    }

    public void setOnScrollChangeListener(C0707b c0707b) {
        this.f2070B = c0707b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2083m = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f2094z.m1786a(i, 0);
    }

    public void stopNestedScroll() {
        this.f2094z.m1791b(0);
    }
}
