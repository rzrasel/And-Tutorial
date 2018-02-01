package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.content.C0392a;
import android.support.v4.view.C0124h;
import android.support.v4.view.C0179k;
import android.support.v4.view.C0665j;
import android.support.v4.view.C0666m;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;

public class SwipeRefreshLayout extends ViewGroup implements C0124h, C0179k {
    private static final int[] f2139D = new int[]{16842766};
    private static final String f2140m = SwipeRefreshLayout.class.getSimpleName();
    private int f2141A = -1;
    private boolean f2142B;
    private final DecelerateInterpolator f2143C;
    private int f2144E = -1;
    private Animation f2145F;
    private Animation f2146G;
    private Animation f2147H;
    private Animation f2148I;
    private Animation f2149J;
    private int f2150K;
    private C0725a f2151L;
    private AnimationListener f2152M = new C07171(this);
    private final Animation f2153N = new C07226(this);
    private final Animation f2154O = new C07237(this);
    C0726b f2155a;
    boolean f2156b = false;
    int f2157c;
    boolean f2158d;
    C0731b f2159e;
    protected int f2160f;
    float f2161g;
    protected int f2162h;
    int f2163i;
    C0735c f2164j;
    boolean f2165k;
    boolean f2166l;
    private View f2167n;
    private int f2168o;
    private float f2169p = -1.0f;
    private float f2170q;
    private final C0666m f2171r;
    private final C0665j f2172s;
    private final int[] f2173t = new int[2];
    private final int[] f2174u = new int[2];
    private boolean f2175v;
    private int f2176w;
    private float f2177x;
    private float f2178y;
    private boolean f2179z;

    class C07171 implements AnimationListener {
        final /* synthetic */ SwipeRefreshLayout f2129a;

        C07171(SwipeRefreshLayout swipeRefreshLayout) {
            this.f2129a = swipeRefreshLayout;
        }

        public final void onAnimationEnd(Animation animation) {
            if (this.f2129a.f2156b) {
                this.f2129a.f2164j.setAlpha(255);
                this.f2129a.f2164j.start();
                if (this.f2129a.f2165k && this.f2129a.f2155a != null) {
                    C0726b c0726b = this.f2129a.f2155a;
                }
                this.f2129a.f2157c = this.f2129a.f2159e.getTop();
                return;
            }
            this.f2129a.m2099a();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    class C07182 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f2130a;

        C07182(SwipeRefreshLayout swipeRefreshLayout) {
            this.f2130a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f2130a.setAnimationProgress(f);
        }
    }

    class C07193 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f2131a;

        C07193(SwipeRefreshLayout swipeRefreshLayout) {
            this.f2131a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f2131a.setAnimationProgress(1.0f - f);
        }
    }

    class C07215 implements AnimationListener {
        final /* synthetic */ SwipeRefreshLayout f2135a;

        C07215(SwipeRefreshLayout swipeRefreshLayout) {
            this.f2135a = swipeRefreshLayout;
        }

        public final void onAnimationEnd(Animation animation) {
            if (!this.f2135a.f2158d) {
                this.f2135a.m2101a(null);
            }
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    class C07226 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f2136a;

        C07226(SwipeRefreshLayout swipeRefreshLayout) {
            this.f2136a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f2136a.setTargetOffsetTopAndBottom((((int) (((float) ((!this.f2136a.f2166l ? this.f2136a.f2163i - Math.abs(this.f2136a.f2162h) : this.f2136a.f2163i) - this.f2136a.f2160f)) * f)) + this.f2136a.f2160f) - this.f2136a.f2159e.getTop());
            this.f2136a.f2164j.m2129a(1.0f - f);
        }
    }

    class C07237 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f2137a;

        C07237(SwipeRefreshLayout swipeRefreshLayout) {
            this.f2137a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f2137a.m2100a(f);
        }
    }

    class C07248 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f2138a;

        C07248(SwipeRefreshLayout swipeRefreshLayout) {
            this.f2138a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f2138a.setAnimationProgress(this.f2138a.f2161g + ((-this.f2138a.f2161g) * f));
            this.f2138a.m2100a(f);
        }
    }

    public interface C0725a {
        boolean m2089a();
    }

    public interface C0726b {
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2168o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2176w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f2143C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f2150K = (int) (40.0f * displayMetrics.density);
        this.f2159e = new C0731b(getContext());
        this.f2164j = new C0735c(getContext());
        this.f2164j.m2130a(1);
        this.f2159e.setImageDrawable(this.f2164j);
        this.f2159e.setVisibility(8);
        addView(this.f2159e);
        C0679r.m1920a((ViewGroup) this);
        this.f2163i = (int) (displayMetrics.density * 64.0f);
        this.f2169p = (float) this.f2163i;
        this.f2171r = new C0666m(this);
        this.f2172s = new C0665j(this);
        setNestedScrollingEnabled(true);
        int i = -this.f2150K;
        this.f2157c = i;
        this.f2162h = i;
        m2100a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2139D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private Animation m2090a(final int i, final int i2) {
        Animation c07204 = new Animation(this) {
            final /* synthetic */ SwipeRefreshLayout f2134c;

            public final void applyTransformation(float f, Transformation transformation) {
                this.f2134c.f2164j.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        c07204.setDuration(300);
        this.f2159e.f2213a = null;
        this.f2159e.clearAnimation();
        this.f2159e.startAnimation(c07204);
        return c07204;
    }

    private void m2091a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2141A) {
            this.f2141A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void m2092a(boolean z, boolean z2) {
        if (this.f2156b != z) {
            this.f2165k = z2;
            m2094b();
            this.f2156b = z;
            if (this.f2156b) {
                int i = this.f2157c;
                AnimationListener animationListener = this.f2152M;
                this.f2160f = i;
                this.f2153N.reset();
                this.f2153N.setDuration(200);
                this.f2153N.setInterpolator(this.f2143C);
                if (animationListener != null) {
                    this.f2159e.f2213a = animationListener;
                }
                this.f2159e.clearAnimation();
                this.f2159e.startAnimation(this.f2153N);
                return;
            }
            m2101a(this.f2152M);
        }
    }

    private static boolean m2093a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void m2094b() {
        if (this.f2167n == null) {
            int i = 0;
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt.equals(this.f2159e)) {
                    i++;
                } else {
                    this.f2167n = childAt;
                    return;
                }
            }
        }
    }

    private void m2095b(float f) {
        this.f2164j.m2131a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f2169p));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f2169p;
        float f2 = this.f2166l ? (float) (this.f2163i - this.f2162h) : (float) this.f2163i;
        abs = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2);
        abs = ((float) (((double) (abs / 4.0f)) - Math.pow((double) (abs / 4.0f), 2.0d))) * 2.0f;
        int i = ((int) ((f2 * min) + ((f2 * abs) * 2.0f))) + this.f2162h;
        if (this.f2159e.getVisibility() != 0) {
            this.f2159e.setVisibility(0);
        }
        if (!this.f2158d) {
            this.f2159e.setScaleX(1.0f);
            this.f2159e.setScaleY(1.0f);
        }
        if (this.f2158d) {
            setAnimationProgress(Math.min(1.0f, f / this.f2169p));
        }
        if (f < this.f2169p) {
            if (this.f2164j.getAlpha() > 76 && !m2093a(this.f2147H)) {
                this.f2147H = m2090a(this.f2164j.getAlpha(), 76);
            }
        } else if (this.f2164j.getAlpha() < 255 && !m2093a(this.f2148I)) {
            this.f2148I = m2090a(this.f2164j.getAlpha(), 255);
        }
        this.f2164j.m2132b(Math.min(0.8f, max * 0.8f));
        this.f2164j.m2129a(Math.min(1.0f, max));
        min = ((-0.25f + (max * 0.4f)) + (abs * 2.0f)) * 0.5f;
        C0735c c0735c = this.f2164j;
        c0735c.f2243a.f2225g = min;
        c0735c.invalidateSelf();
        setTargetOffsetTopAndBottom(i - this.f2157c);
    }

    private void m2096c(float f) {
        if (f > this.f2169p) {
            m2092a(true, true);
            return;
        }
        this.f2156b = false;
        this.f2164j.m2132b(0.0f);
        AnimationListener animationListener = null;
        if (!this.f2158d) {
            animationListener = new C07215(this);
        }
        int i = this.f2157c;
        if (this.f2158d) {
            this.f2160f = i;
            this.f2161g = this.f2159e.getScaleX();
            this.f2149J = new C07248(this);
            this.f2149J.setDuration(150);
            if (animationListener != null) {
                this.f2159e.f2213a = animationListener;
            }
            this.f2159e.clearAnimation();
            this.f2159e.startAnimation(this.f2149J);
        } else {
            this.f2160f = i;
            this.f2154O.reset();
            this.f2154O.setDuration(200);
            this.f2154O.setInterpolator(this.f2143C);
            if (animationListener != null) {
                this.f2159e.f2213a = animationListener;
            }
            this.f2159e.clearAnimation();
            this.f2159e.startAnimation(this.f2154O);
        }
        this.f2164j.m2131a(false);
    }

    private boolean m2097c() {
        if (this.f2151L != null) {
            return this.f2151L.m2089a();
        }
        if (!(this.f2167n instanceof ListView)) {
            return this.f2167n.canScrollVertically(-1);
        }
        ListView listView = (ListView) this.f2167n;
        if (VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() != 0) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int top = listView.getChildAt(0).getTop();
            if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    private void m2098d(float f) {
        if (f - this.f2178y > ((float) this.f2168o) && !this.f2179z) {
            this.f2177x = this.f2178y + ((float) this.f2168o);
            this.f2179z = true;
            this.f2164j.setAlpha(76);
        }
    }

    private void setColorViewAlpha(int i) {
        this.f2159e.getBackground().setAlpha(i);
        this.f2164j.setAlpha(i);
    }

    final void m2099a() {
        this.f2159e.clearAnimation();
        this.f2164j.stop();
        this.f2159e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f2158d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f2162h - this.f2157c);
        }
        this.f2157c = this.f2159e.getTop();
    }

    final void m2100a(float f) {
        setTargetOffsetTopAndBottom((this.f2160f + ((int) (((float) (this.f2162h - this.f2160f)) * f))) - this.f2159e.getTop());
    }

    final void m2101a(AnimationListener animationListener) {
        this.f2146G = new C07193(this);
        this.f2146G.setDuration(150);
        this.f2159e.f2213a = animationListener;
        this.f2159e.clearAnimation();
        this.f2159e.startAnimation(this.f2146G);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2172s.m1784a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2172s.m1783a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f2172s.m1789a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2172s.m1787a(i, i2, i3, i4, iArr);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        return this.f2144E < 0 ? i2 : i2 == i + -1 ? this.f2144E : i2 >= this.f2144E ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f2171r.f1970a;
    }

    public int getProgressCircleDiameter() {
        return this.f2150K;
    }

    public int getProgressViewEndOffset() {
        return this.f2163i;
    }

    public int getProgressViewStartOffset() {
        return this.f2162h;
    }

    public boolean hasNestedScrollingParent() {
        return this.f2172s.m1785a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2172s.f1965a;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2099a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m2094b();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2142B && actionMasked == 0) {
            this.f2142B = false;
        }
        if (!isEnabled() || this.f2142B || m2097c() || this.f2156b || this.f2175v) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                setTargetOffsetTopAndBottom(this.f2162h - this.f2159e.getTop());
                this.f2141A = motionEvent.getPointerId(0);
                this.f2179z = false;
                actionMasked = motionEvent.findPointerIndex(this.f2141A);
                if (actionMasked >= 0) {
                    this.f2178y = motionEvent.getY(actionMasked);
                    break;
                }
                return false;
            case 1:
            case 3:
                this.f2179z = false;
                this.f2141A = -1;
                break;
            case 2:
                if (this.f2141A == -1) {
                    return false;
                }
                actionMasked = motionEvent.findPointerIndex(this.f2141A);
                if (actionMasked >= 0) {
                    m2098d(motionEvent.getY(actionMasked));
                    break;
                }
                return false;
            case 6:
                m2091a(motionEvent);
                break;
        }
        return this.f2179z;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f2167n == null) {
                m2094b();
            }
            if (this.f2167n != null) {
                View view = this.f2167n;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                measuredHeight = this.f2159e.getMeasuredWidth();
                this.f2159e.layout((measuredWidth / 2) - (measuredHeight / 2), this.f2157c, (measuredWidth / 2) + (measuredHeight / 2), this.f2157c + this.f2159e.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2167n == null) {
            m2094b();
        }
        if (this.f2167n != null) {
            this.f2167n.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f2159e.measure(MeasureSpec.makeMeasureSpec(this.f2150K, 1073741824), MeasureSpec.makeMeasureSpec(this.f2150K, 1073741824));
            this.f2144E = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f2159e) {
                    this.f2144E = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f2170q > 0.0f) {
            if (((float) i2) > this.f2170q) {
                iArr[1] = i2 - ((int) this.f2170q);
                this.f2170q = 0.0f;
            } else {
                this.f2170q -= (float) i2;
                iArr[1] = i2;
            }
            m2095b(this.f2170q);
        }
        if (this.f2166l && i2 > 0 && this.f2170q == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f2159e.setVisibility(8);
        }
        int[] iArr2 = this.f2173t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr2[1] + iArr[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f2174u);
        int i5 = this.f2174u[1] + i4;
        if (i5 < 0 && !m2097c()) {
            this.f2170q = ((float) Math.abs(i5)) + this.f2170q;
            m2095b(this.f2170q);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2171r.f1970a = i;
        startNestedScroll(i & 2);
        this.f2170q = 0.0f;
        this.f2175v = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f2142B || this.f2156b || (i & 2) == 0) ? false : true;
    }

    public void onStopNestedScroll(View view) {
        this.f2171r.f1970a = 0;
        this.f2175v = false;
        if (this.f2170q > 0.0f) {
            m2096c(this.f2170q);
            this.f2170q = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2142B && actionMasked == 0) {
            this.f2142B = false;
        }
        if (!isEnabled() || this.f2142B || m2097c() || this.f2156b || this.f2175v) {
            return false;
        }
        float y;
        switch (actionMasked) {
            case 0:
                this.f2141A = motionEvent.getPointerId(0);
                this.f2179z = false;
                break;
            case 1:
                actionMasked = motionEvent.findPointerIndex(this.f2141A);
                if (actionMasked < 0) {
                    return false;
                }
                if (this.f2179z) {
                    y = (motionEvent.getY(actionMasked) - this.f2177x) * 0.5f;
                    this.f2179z = false;
                    m2096c(y);
                }
                this.f2141A = -1;
                return false;
            case 2:
                actionMasked = motionEvent.findPointerIndex(this.f2141A);
                if (actionMasked < 0) {
                    return false;
                }
                y = motionEvent.getY(actionMasked);
                m2098d(y);
                if (this.f2179z) {
                    y = (y - this.f2177x) * 0.5f;
                    if (y > 0.0f) {
                        m2095b(y);
                        break;
                    }
                    return false;
                }
                break;
            case 3:
                return false;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                if (actionMasked >= 0) {
                    this.f2141A = motionEvent.getPointerId(actionMasked);
                    break;
                }
                return false;
            case 6:
                m2091a(motionEvent);
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT < 21 && (this.f2167n instanceof AbsListView)) {
            return;
        }
        if (this.f2167n == null || C0679r.m1950w(this.f2167n)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    void setAnimationProgress(float f) {
        this.f2159e.setScaleX(f);
        this.f2159e.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m2094b();
        C0735c c0735c = this.f2164j;
        c0735c.f2243a.m2117a(iArr);
        c0735c.f2243a.m2115a(0);
        c0735c.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0392a.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f2169p = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m2099a();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2172s.m1782a(z);
    }

    public void setOnChildScrollUpCallback(C0725a c0725a) {
        this.f2151L = c0725a;
    }

    public void setOnRefreshListener(C0726b c0726b) {
        this.f2155a = c0726b;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f2159e.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0392a.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f2156b == z) {
            m2092a(z, false);
            return;
        }
        this.f2156b = z;
        setTargetOffsetTopAndBottom((!this.f2166l ? this.f2163i + this.f2162h : this.f2163i) - this.f2157c);
        this.f2165k = false;
        AnimationListener animationListener = this.f2152M;
        this.f2159e.setVisibility(0);
        if (VERSION.SDK_INT >= 11) {
            this.f2164j.setAlpha(255);
        }
        this.f2145F = new C07182(this);
        this.f2145F.setDuration((long) this.f2176w);
        if (animationListener != null) {
            this.f2159e.f2213a = animationListener;
        }
        this.f2159e.clearAnimation();
        this.f2159e.startAnimation(this.f2145F);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f2150K = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f2150K = (int) (displayMetrics.density * 40.0f);
            }
            this.f2159e.setImageDrawable(null);
            this.f2164j.m2130a(i);
            this.f2159e.setImageDrawable(this.f2164j);
        }
    }

    void setTargetOffsetTopAndBottom(int i) {
        this.f2159e.bringToFront();
        C0679r.m1924b(this.f2159e, i);
        this.f2157c = this.f2159e.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f2172s.m1786a(i, 0);
    }

    public void stopNestedScroll() {
        this.f2172s.m1791b(0);
    }
}
