package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.content.C0392a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0122a;
import android.support.v4.view.C0679r;
import android.support.v4.view.p019a.C0626b;
import android.support.v4.widget.C0769o.C0161a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    static final C0713e f2108j;
    int f2109a;
    View f2110b;
    float f2111c;
    int f2112d;
    boolean f2113e;
    int f2114f;
    final C0769o f2115g;
    boolean f2116h;
    final ArrayList<C0710b> f2117i;
    private int f2118k;
    private Drawable f2119l;
    private Drawable f2120m;
    private final int f2121n;
    private boolean f2122o;
    private float f2123p;
    private float f2124q;
    private float f2125r;
    private C0712d f2126s;
    private boolean f2127t;
    private final Rect f2128u;

    public static class LayoutParams extends MarginLayoutParams {
        private static final int[] f2095e = new int[]{16843137};
        public float f2096a = 0.0f;
        boolean f2097b;
        boolean f2098c;
        Paint f2099d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2095e);
            this.f2096a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C07081();
        boolean f2100a;

        static class C07081 implements ClassLoaderCreator<SavedState> {
            C07081() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel, null);
            this.f2100a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2100a ? 1 : 0);
        }
    }

    class C0709a extends C0122a {
        final /* synthetic */ SlidingPaneLayout f2101a;
        private final Rect f2102b = new Rect();

        C0709a(SlidingPaneLayout slidingPaneLayout) {
            this.f2101a = slidingPaneLayout;
        }

        private boolean m2065a(View view) {
            return this.f2101a.m2087c(view);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            C0626b a = C0626b.m1682a(c0626b);
            super.onInitializeAccessibilityNodeInfo(view, a);
            Rect rect = this.f2102b;
            a.m1685a(rect);
            c0626b.m1692b(rect);
            a.m1697c(rect);
            c0626b.m1701d(rect);
            c0626b.m1702d(a.m1690a());
            c0626b.m1687a(a.f1917b.getPackageName());
            c0626b.m1694b(a.f1917b.getClassName());
            c0626b.m1699c(a.f1917b.getContentDescription());
            c0626b.m1707i(a.f1917b.isEnabled());
            c0626b.m1705g(a.f1917b.isClickable());
            c0626b.m1695b(a.f1917b.isFocusable());
            c0626b.m1700c(a.f1917b.isFocused());
            c0626b.m1703e(a.m1696b());
            c0626b.m1704f(a.f1917b.isSelected());
            c0626b.m1706h(a.f1917b.isLongClickable());
            c0626b.m1684a(a.f1917b.getActions());
            C0626b.f1916a.mo589a(c0626b.f1917b, C0626b.f1916a.mo594c(a.f1917b));
            a.f1917b.recycle();
            c0626b.m1694b(SlidingPaneLayout.class.getName());
            c0626b.m1686a(view);
            ViewParent f = C0679r.m1933f(view);
            if (f instanceof View) {
                c0626b.m1698c((View) f);
            }
            int childCount = this.f2101a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2101a.getChildAt(i);
                if (!m2065a(childAt) && childAt.getVisibility() == 0) {
                    C0679r.m1906a(childAt, 1);
                    c0626b.m1693b(childAt);
                }
            }
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return !m2065a(view) ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : false;
        }
    }

    private class C0710b implements Runnable {
        final View f2103a;
        final /* synthetic */ SlidingPaneLayout f2104b;

        C0710b(SlidingPaneLayout slidingPaneLayout, View view) {
            this.f2104b = slidingPaneLayout;
            this.f2103a = view;
        }

        public final void run() {
            if (this.f2103a.getParent() == this.f2104b) {
                this.f2103a.setLayerType(0, null);
                this.f2104b.m2085b(this.f2103a);
            }
            this.f2104b.f2117i.remove(this);
        }
    }

    private class C0711c extends C0161a {
        final /* synthetic */ SlidingPaneLayout f2105a;

        C0711c(SlidingPaneLayout slidingPaneLayout) {
            this.f2105a = slidingPaneLayout;
        }

        public final int mo165a(View view) {
            return this.f2105a.f2112d;
        }

        public final void mo114a(int i) {
            if (this.f2105a.f2115g.f2269a != 0) {
                return;
            }
            if (this.f2105a.f2111c == 0.0f) {
                this.f2105a.m2083a(this.f2105a.f2110b);
                SlidingPaneLayout slidingPaneLayout = this.f2105a;
                View view = this.f2105a.f2110b;
                slidingPaneLayout.sendAccessibilityEvent(32);
                this.f2105a.f2116h = false;
                return;
            }
            slidingPaneLayout = this.f2105a;
            view = this.f2105a.f2110b;
            slidingPaneLayout.sendAccessibilityEvent(32);
            this.f2105a.f2116h = true;
        }

        public final void mo702a(int i, int i2) {
            this.f2105a.f2115g.m2211a(this.f2105a.f2110b, i2);
        }

        public final void mo115a(View view, float f, float f2) {
            int paddingRight;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f2105a.m2086b()) {
                paddingRight = layoutParams.rightMargin + this.f2105a.getPaddingRight();
                if (f < 0.0f || (f == 0.0f && this.f2105a.f2111c > 0.5f)) {
                    paddingRight += this.f2105a.f2112d;
                }
                paddingRight = (this.f2105a.getWidth() - paddingRight) - this.f2105a.f2110b.getWidth();
            } else {
                paddingRight = layoutParams.leftMargin + this.f2105a.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && this.f2105a.f2111c > 0.5f)) {
                    paddingRight += this.f2105a.f2112d;
                }
            }
            this.f2105a.f2115g.m2213a(paddingRight, view.getTop());
            this.f2105a.invalidate();
        }

        public final boolean mo116a(View view, int i) {
            return this.f2105a.f2113e ? false : ((LayoutParams) view.getLayoutParams()).f2097b;
        }

        public final void mo117b(View view, int i) {
            SlidingPaneLayout slidingPaneLayout = this.f2105a;
            if (slidingPaneLayout.f2110b == null) {
                slidingPaneLayout.f2111c = 0.0f;
            } else {
                boolean b = slidingPaneLayout.m2086b();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f2110b.getLayoutParams();
                int width = slidingPaneLayout.f2110b.getWidth();
                if (b) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                slidingPaneLayout.f2111c = ((float) (i - ((b ? layoutParams.rightMargin : layoutParams.leftMargin) + (b ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft())))) / ((float) slidingPaneLayout.f2112d);
                if (slidingPaneLayout.f2114f != 0) {
                    slidingPaneLayout.m2082a(slidingPaneLayout.f2111c);
                }
                if (layoutParams.f2098c) {
                    slidingPaneLayout.m2084a(slidingPaneLayout.f2110b, slidingPaneLayout.f2111c, slidingPaneLayout.f2109a);
                }
            }
            this.f2105a.invalidate();
        }

        public final int mo118c(View view, int i) {
            return view.getTop();
        }

        public final int mo119d(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) this.f2105a.f2110b.getLayoutParams();
            if (this.f2105a.m2086b()) {
                int width = this.f2105a.getWidth() - ((layoutParams.rightMargin + this.f2105a.getPaddingRight()) + this.f2105a.f2110b.getWidth());
                return Math.max(Math.min(i, width), width - this.f2105a.f2112d);
            }
            width = layoutParams.leftMargin + this.f2105a.getPaddingLeft();
            return Math.min(Math.max(i, width), this.f2105a.f2112d + width);
        }

        public final void mo166e(View view, int i) {
            this.f2105a.m2081a();
        }
    }

    public interface C0712d {
    }

    interface C0713e {
        void mo704a(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static class C0714f implements C0713e {
        C0714f() {
        }

        public void mo704a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0679r.m1907a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    static class C0715g extends C0714f {
        private Method f2106a;
        private Field f2107b;

        C0715g() {
            try {
                this.f2106a = View.class.getDeclaredMethod("getDisplayList", null);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f2107b = View.class.getDeclaredField("mRecreateDisplayList");
                this.f2107b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
        }

        public final void mo704a(SlidingPaneLayout slidingPaneLayout, View view) {
            if (this.f2106a == null || this.f2107b == null) {
                view.invalidate();
                return;
            }
            try {
                this.f2107b.setBoolean(view, true);
                this.f2106a.invoke(view, null);
            } catch (Exception e) {
            }
            super.mo704a(slidingPaneLayout, view);
        }
    }

    static class C0716h extends C0714f {
        C0716h() {
        }

        public final void mo704a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0679r.m1909a(view, ((LayoutParams) view.getLayoutParams()).f2099d);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f2108j = new C0716h();
        } else if (VERSION.SDK_INT >= 16) {
            f2108j = new C0715g();
        } else {
            f2108j = new C0714f();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2109a = -858993460;
        this.f2127t = true;
        this.f2128u = new Rect();
        this.f2117i = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.f2121n = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C0679r.m1913a((View) this, new C0709a(this));
        C0679r.m1906a((View) this, 1);
        this.f2115g = C0769o.m2195a((ViewGroup) this, 0.5f, new C0711c(this));
        this.f2115g.f2275g = f * 400.0f;
    }

    private boolean m2079b(float f) {
        if (!this.f2122o) {
            return false;
        }
        int width;
        LayoutParams layoutParams = (LayoutParams) this.f2110b.getLayoutParams();
        if (m2086b()) {
            width = (int) (((float) getWidth()) - ((((float) (layoutParams.rightMargin + getPaddingRight())) + (((float) this.f2112d) * f)) + ((float) this.f2110b.getWidth())));
        } else {
            width = (int) (((float) (layoutParams.leftMargin + getPaddingLeft())) + (((float) this.f2112d) * f));
        }
        if (!this.f2115g.m2215a(this.f2110b, width, this.f2110b.getTop())) {
            return false;
        }
        m2081a();
        C0679r.m1928c(this);
        return true;
    }

    private boolean m2080c() {
        if (!this.f2127t && !m2079b(0.0f)) {
            return false;
        }
        this.f2116h = false;
        return true;
    }

    final void m2081a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    final void m2082a(float f) {
        Object obj;
        int childCount;
        int i;
        View childAt;
        int i2;
        boolean b = m2086b();
        LayoutParams layoutParams = (LayoutParams) this.f2110b.getLayoutParams();
        if (layoutParams.f2098c) {
            if ((b ? layoutParams.rightMargin : layoutParams.leftMargin) <= 0) {
                obj = 1;
                childCount = getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    if (childAt != this.f2110b) {
                        i2 = (int) ((1.0f - this.f2123p) * ((float) this.f2114f));
                        this.f2123p = f;
                        i2 -= (int) ((1.0f - f) * ((float) this.f2114f));
                        if (b) {
                            i2 = -i2;
                        }
                        childAt.offsetLeftAndRight(i2);
                        if (obj == null) {
                            m2084a(childAt, b ? this.f2123p - 1.0f : 1.0f - this.f2123p, this.f2118k);
                        }
                    }
                }
            }
        }
        obj = null;
        childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            childAt = getChildAt(i);
            if (childAt != this.f2110b) {
                i2 = (int) ((1.0f - this.f2123p) * ((float) this.f2114f));
                this.f2123p = f;
                i2 -= (int) ((1.0f - f) * ((float) this.f2114f));
                if (b) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
                if (obj == null) {
                    if (b) {
                    }
                    m2084a(childAt, b ? this.f2123p - 1.0f : 1.0f - this.f2123p, this.f2118k);
                }
            }
        }
    }

    final void m2083a(View view) {
        int left;
        int right;
        int top;
        int bottom;
        int childCount;
        int i;
        View childAt;
        boolean b = m2086b();
        int width = b ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = b ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view != null) {
            Object obj;
            if (view.isOpaque()) {
                obj = 1;
            } else {
                if (VERSION.SDK_INT < 18) {
                    Drawable background = view.getBackground();
                    if (background != null) {
                        obj = background.getOpacity() == -1 ? 1 : null;
                    }
                }
                obj = null;
            }
            if (obj != null) {
                left = view.getLeft();
                right = view.getRight();
                top = view.getTop();
                bottom = view.getBottom();
                childCount = getChildCount();
                i = 0;
                while (i < childCount) {
                    childAt = getChildAt(i);
                    if (childAt != view) {
                        if (childAt.getVisibility() == 8) {
                            int i2 = (Math.max(b ? paddingLeft : width, childAt.getLeft()) >= left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(b ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4;
                            childAt.setVisibility(i2);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
        bottom = 0;
        top = 0;
        right = 0;
        left = 0;
        childCount = getChildCount();
        i = 0;
        while (i < childCount) {
            childAt = getChildAt(i);
            if (childAt != view) {
                if (childAt.getVisibility() == 8) {
                    if (b) {
                    }
                    if (b) {
                    }
                    if (Math.max(b ? paddingLeft : width, childAt.getLeft()) >= left) {
                    }
                    childAt.setVisibility(i2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    final void m2084a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            if (layoutParams.f2099d == null) {
                layoutParams.f2099d = new Paint();
            }
            layoutParams.f2099d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f2099d);
            }
            m2085b(view);
        } else if (view.getLayerType() != 0) {
            if (layoutParams.f2099d != null) {
                layoutParams.f2099d.setColorFilter(null);
            }
            Runnable c0710b = new C0710b(this, view);
            this.f2117i.add(c0710b);
            C0679r.m1916a((View) this, c0710b);
        }
    }

    final void m2085b(View view) {
        f2108j.mo704a(this, view);
    }

    final boolean m2086b() {
        return C0679r.m1932e(this) == 1;
    }

    final boolean m2087c(View view) {
        if (view == null) {
            return false;
        }
        return this.f2122o && ((LayoutParams) view.getLayoutParams()).f2098c && this.f2111c > 0.0f;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f2115g.m2220c()) {
            return;
        }
        if (this.f2122o) {
            C0679r.m1928c(this);
        } else {
            this.f2115g.m2217b();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = m2086b() ? this.f2120m : this.f2119l;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int right;
            int i;
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m2086b()) {
                right = childAt.getRight();
                i = right + intrinsicWidth;
            } else {
                i = childAt.getLeft();
                right = i - intrinsicWidth;
            }
            drawable.setBounds(right, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (!(!this.f2122o || layoutParams.f2097b || this.f2110b == null)) {
            canvas.getClipBounds(this.f2128u);
            if (m2086b()) {
                this.f2128u.left = Math.max(this.f2128u.left, this.f2110b.getRight());
            } else {
                this.f2128u.right = Math.min(this.f2128u.right, this.f2110b.getLeft());
            }
            canvas.clipRect(this.f2128u);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f2118k;
    }

    public int getParallaxDistance() {
        return this.f2114f;
    }

    public int getSliderFadeColor() {
        return this.f2109a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2127t = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2127t = true;
        int size = this.f2117i.size();
        for (int i = 0; i < size; i++) {
            ((C0710b) this.f2117i.get(i)).run();
        }
        this.f2117i.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r2 = 0;
        r1 = 1;
        r3 = r7.getActionMasked();
        r0 = r6.f2122o;
        if (r0 != 0) goto L_0x002b;
    L_0x000a:
        if (r3 != 0) goto L_0x002b;
    L_0x000c:
        r0 = r6.getChildCount();
        if (r0 <= r1) goto L_0x002b;
    L_0x0012:
        r0 = r6.getChildAt(r1);
        if (r0 == 0) goto L_0x002b;
    L_0x0018:
        r4 = r7.getX();
        r4 = (int) r4;
        r5 = r7.getY();
        r5 = (int) r5;
        r0 = android.support.v4.widget.C0769o.m2205b(r0, r4, r5);
        if (r0 != 0) goto L_0x003f;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        r6.f2116h = r0;
    L_0x002b:
        r0 = r6.f2122o;
        if (r0 == 0) goto L_0x0035;
    L_0x002f:
        r0 = r6.f2113e;
        if (r0 == 0) goto L_0x0041;
    L_0x0033:
        if (r3 == 0) goto L_0x0041;
    L_0x0035:
        r0 = r6.f2115g;
        r0.m2210a();
        r2 = super.onInterceptTouchEvent(r7);
    L_0x003e:
        return r2;
    L_0x003f:
        r0 = r2;
        goto L_0x0029;
    L_0x0041:
        r0 = 3;
        if (r3 == r0) goto L_0x0046;
    L_0x0044:
        if (r3 != r1) goto L_0x004c;
    L_0x0046:
        r0 = r6.f2115g;
        r0.m2210a();
        goto L_0x003e;
    L_0x004c:
        switch(r3) {
            case 0: goto L_0x005c;
            case 1: goto L_0x004f;
            case 2: goto L_0x007e;
            default: goto L_0x004f;
        };
    L_0x004f:
        r0 = r2;
    L_0x0050:
        r3 = r6.f2115g;
        r3 = r3.m2214a(r7);
        if (r3 != 0) goto L_0x005a;
    L_0x0058:
        if (r0 == 0) goto L_0x003e;
    L_0x005a:
        r2 = r1;
        goto L_0x003e;
    L_0x005c:
        r6.f2113e = r2;
        r0 = r7.getX();
        r3 = r7.getY();
        r6.f2124q = r0;
        r6.f2125r = r3;
        r4 = r6.f2110b;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = android.support.v4.widget.C0769o.m2205b(r4, r0, r3);
        if (r0 == 0) goto L_0x004f;
    L_0x0074:
        r0 = r6.f2110b;
        r0 = r6.m2087c(r0);
        if (r0 == 0) goto L_0x004f;
    L_0x007c:
        r0 = r1;
        goto L_0x0050;
    L_0x007e:
        r0 = r7.getX();
        r3 = r7.getY();
        r4 = r6.f2124q;
        r0 = r0 - r4;
        r0 = java.lang.Math.abs(r0);
        r4 = r6.f2125r;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r6.f2115g;
        r4 = r4.f2270b;
        r4 = (float) r4;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x004f;
    L_0x009d:
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x004f;
    L_0x00a1:
        r0 = r6.f2115g;
        r0.m2210a();
        r6.f2113e = r1;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = m2086b();
        if (b) {
            this.f2115g.f2277i = 2;
        } else {
            this.f2115g.f2277i = 1;
        }
        int i5 = i3 - i;
        int paddingRight = b ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = b ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f2127t) {
            float f = (this.f2122o && this.f2116h) ? 1.0f : 0.0f;
            this.f2111c = f;
        }
        int i6 = 0;
        int i7 = paddingRight;
        while (i6 < childCount) {
            int i8;
            int i9;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int i10;
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int i11 = 0;
                if (layoutParams.f2097b) {
                    int min = (Math.min(paddingRight, (i5 - paddingLeft) - this.f2121n) - i7) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f2112d = min;
                    i8 = b ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f2098c = ((i7 + i8) + min) + (measuredWidth / 2) > i5 - paddingLeft;
                    i9 = (int) (((float) min) * this.f2111c);
                    i10 = i7 + (i8 + i9);
                    this.f2111c = ((float) i9) / ((float) this.f2112d);
                } else {
                    i9 = (!this.f2122o || this.f2114f == 0) ? 0 : (int) ((1.0f - this.f2111c) * ((float) this.f2114f));
                    i11 = i9;
                    i10 = paddingRight;
                }
                if (b) {
                    i8 = (i5 - i10) + i11;
                    i9 = i8 - measuredWidth;
                } else {
                    i9 = i10 - i11;
                    i8 = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                i9 = childAt.getWidth() + paddingRight;
                i8 = i10;
            } else {
                i9 = paddingRight;
                i8 = i7;
            }
            i6++;
            paddingRight = i9;
            i7 = i8;
        }
        if (this.f2127t) {
            if (this.f2122o) {
                if (this.f2114f != 0) {
                    m2082a(this.f2111c);
                }
                if (((LayoutParams) this.f2110b.getLayoutParams()).f2098c) {
                    m2084a(this.f2110b, this.f2111c, this.f2109a);
                }
            } else {
                for (i9 = 0; i9 < childCount; i9++) {
                    m2084a(getChildAt(i9), 0.0f, this.f2109a);
                }
            }
            m2083a(this.f2110b);
        }
        this.f2127t = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i3 = Integer.MIN_VALUE;
                    i4 = size;
                    size = 300;
                }
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else if (isInEditMode()) {
            if (mode != Integer.MIN_VALUE && mode == 0) {
                i3 = mode2;
                i4 = 300;
                size = size2;
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                size2 = 0;
                mode2 = (size - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                size2 = (size - getPaddingTop()) - getPaddingBottom();
                mode2 = size2;
                break;
            default:
                size2 = 0;
                mode2 = 0;
                break;
        }
        boolean z = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f2110b = null;
        int i5 = 0;
        int i6 = paddingLeft;
        int i7 = size2;
        float f = 0.0f;
        while (i5 < childCount) {
            float f2;
            int i8;
            boolean z2;
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f2098c = false;
                size2 = i6;
                f2 = f;
                i8 = i7;
                z2 = z;
            } else {
                if (layoutParams.f2096a > 0.0f) {
                    f += layoutParams.f2096a;
                    if (layoutParams.width == 0) {
                        size2 = i6;
                        f2 = f;
                        i8 = i7;
                        z2 = z;
                    }
                }
                mode = layoutParams.leftMargin + layoutParams.rightMargin;
                mode = layoutParams.width == -2 ? MeasureSpec.makeMeasureSpec(paddingLeft - mode, Integer.MIN_VALUE) : layoutParams.width == -1 ? MeasureSpec.makeMeasureSpec(paddingLeft - mode, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                i8 = layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                childAt.measure(mode, i8);
                mode = childAt.getMeasuredWidth();
                i8 = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && i8 > i7) {
                    i7 = Math.min(i8, mode2);
                }
                i8 = i6 - mode;
                boolean z3 = i8 < 0;
                layoutParams.f2097b = z3;
                z3 |= z;
                if (layoutParams.f2097b) {
                    this.f2110b = childAt;
                }
                size2 = i8;
                i8 = i7;
                float f3 = f;
                z2 = z3;
                f2 = f3;
            }
            i5++;
            z = z2;
            i7 = i8;
            f = f2;
            i6 = size2;
        }
        if (z || f > 0.0f) {
            int i9 = paddingLeft - this.f2121n;
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        Object obj = (layoutParams.width != 0 || layoutParams.f2096a <= 0.0f) ? null : 1;
                        i8 = obj != null ? 0 : childAt2.getMeasuredWidth();
                        if (!z || childAt2 == this.f2110b) {
                            if (layoutParams.f2096a > 0.0f) {
                                mode = layoutParams.width == 0 ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                if (z) {
                                    size2 = paddingLeft - (layoutParams.rightMargin + layoutParams.leftMargin);
                                    i5 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
                                    if (i8 != size2) {
                                        childAt2.measure(i5, mode);
                                    }
                                } else {
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(((int) ((layoutParams.f2096a * ((float) Math.max(0, i6))) / f)) + i8, 1073741824), mode);
                                }
                            }
                        } else if (layoutParams.width < 0 && (i8 > i9 || layoutParams.f2096a > 0.0f)) {
                            size2 = obj != null ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i9, 1073741824), size2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, (getPaddingTop() + i7) + getPaddingBottom());
        this.f2122o = z;
        if (this.f2115g.f2269a != 0 && !z) {
            this.f2115g.m2217b();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (!savedState.f2100a) {
                m2080c();
            } else if (this.f2127t || m2079b(1.0f)) {
                this.f2116h = true;
            }
            this.f2116h = savedState.f2100a;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        boolean z = this.f2122o ? !this.f2122o || this.f2111c == 1.0f : this.f2116h;
        savedState.f2100a = z;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f2127t = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2122o) {
            return super.onTouchEvent(motionEvent);
        }
        this.f2115g.m2219b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f2124q = x;
                this.f2125r = y;
                break;
            case 1:
                if (m2087c(this.f2110b)) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    float f = x - this.f2124q;
                    float f2 = y - this.f2125r;
                    int i = this.f2115g.f2270b;
                    if ((f * f) + (f2 * f2) < ((float) (i * i)) && C0769o.m2205b(this.f2110b, (int) x, (int) y)) {
                        m2080c();
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f2122o) {
            this.f2116h = view == this.f2110b;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f2118k = i;
    }

    public void setPanelSlideListener(C0712d c0712d) {
        this.f2126s = c0712d;
    }

    public void setParallaxDistance(int i) {
        this.f2114f = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f2119l = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f2120m = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0392a.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0392a.getDrawable(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f2109a = i;
    }
}
