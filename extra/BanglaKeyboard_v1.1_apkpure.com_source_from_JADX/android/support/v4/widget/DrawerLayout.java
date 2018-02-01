package android.support.v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0122a;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0684t;
import android.support.v4.view.p019a.C0626b;
import android.support.v4.view.p019a.C0626b.C0614a;
import android.support.v4.widget.C0769o.C0161a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    static final int[] f2010a = new int[]{16842931};
    static final boolean f2011b = (VERSION.SDK_INT >= 19);
    private static final int[] f2012l = new int[]{16843828};
    private static final boolean f2013m;
    private int f2014A;
    private boolean f2015B;
    private C0389c f2016C;
    private float f2017D;
    private float f2018E;
    private Drawable f2019F;
    private Drawable f2020G;
    private Drawable f2021H;
    private Drawable f2022I;
    private Drawable f2023J;
    private Drawable f2024K;
    private Drawable f2025L;
    private final ArrayList<View> f2026M;
    final C0769o f2027c;
    final C0769o f2028d;
    int f2029e;
    boolean f2030f;
    List<C0389c> f2031g;
    CharSequence f2032h;
    CharSequence f2033i;
    Object f2034j;
    boolean f2035k;
    private final C0702b f2036n;
    private float f2037o;
    private int f2038p;
    private int f2039q;
    private float f2040r;
    private Paint f2041s;
    private final C0704d f2042t;
    private final C0704d f2043u;
    private boolean f2044v;
    private boolean f2045w;
    private int f2046x;
    private int f2047y;
    private int f2048z;

    public interface C0389c {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    class C06991 implements OnApplyWindowInsetsListener {
        final /* synthetic */ DrawerLayout f2049a;

        C06991(DrawerLayout drawerLayout) {
            this.f2049a = drawerLayout;
        }

        @TargetApi(21)
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z = true;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f2034j = windowInsets;
            drawerLayout.f2035k = z2;
            if (z2 || drawerLayout.getBackground() != null) {
                z = false;
            }
            drawerLayout.setWillNotDraw(z);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public static class LayoutParams extends MarginLayoutParams {
        public int f2050a = 0;
        float f2051b;
        boolean f2052c;
        int f2053d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2010a);
            this.f2050a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2050a = layoutParams.f2050a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C07001();
        int f2054a = 0;
        int f2055b;
        int f2056c;
        int f2057d;
        int f2058e;

        static class C07001 implements ClassLoaderCreator<SavedState> {
            C07001() {
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
            this.f2054a = parcel.readInt();
            this.f2055b = parcel.readInt();
            this.f2056c = parcel.readInt();
            this.f2057d = parcel.readInt();
            this.f2058e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2054a);
            parcel.writeInt(this.f2055b);
            parcel.writeInt(this.f2056c);
            parcel.writeInt(this.f2057d);
            parcel.writeInt(this.f2058e);
        }
    }

    class C0701a extends C0122a {
        final /* synthetic */ DrawerLayout f2059a;
        private final Rect f2060b = new Rect();

        C0701a(DrawerLayout drawerLayout) {
            this.f2059a = drawerLayout;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View e = this.f2059a.m2025e();
            if (e != null) {
                int c = this.f2059a.m2021c(e);
                View view2 = this.f2059a;
                c = C0656d.m1743a(c, C0679r.m1932e(view2));
                Object obj = c == 3 ? view2.f2032h : c == 5 ? view2.f2033i : null;
                if (obj != null) {
                    text.add(obj);
                }
            }
            return true;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            if (DrawerLayout.f2011b) {
                super.onInitializeAccessibilityNodeInfo(view, c0626b);
            } else {
                C0626b a = C0626b.m1682a(c0626b);
                super.onInitializeAccessibilityNodeInfo(view, a);
                c0626b.m1686a(view);
                ViewParent f = C0679r.m1933f(view);
                if (f instanceof View) {
                    c0626b.m1698c((View) f);
                }
                Rect rect = this.f2060b;
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
                a.f1917b.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.m2007g(childAt)) {
                        c0626b.m1693b(childAt);
                    }
                }
            }
            c0626b.m1694b(DrawerLayout.class.getName());
            c0626b.m1695b(false);
            c0626b.m1700c(false);
            c0626b.m1691a(C0614a.f1887a);
            c0626b.m1691a(C0614a.f1888b);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return (DrawerLayout.f2011b || DrawerLayout.m2007g(view)) ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : false;
        }
    }

    static final class C0702b extends C0122a {
        C0702b() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            if (!DrawerLayout.m2007g(view)) {
                c0626b.m1698c(null);
            }
        }
    }

    private class C0704d extends C0161a {
        final int f2062a;
        C0769o f2063b;
        final /* synthetic */ DrawerLayout f2064c;
        private final Runnable f2065d = new C07031(this);

        class C07031 implements Runnable {
            final /* synthetic */ C0704d f2061a;

            C07031(C0704d c0704d) {
                this.f2061a = c0704d;
            }

            public final void run() {
                View view;
                int i;
                int i2 = 0;
                C0704d c0704d = this.f2061a;
                int i3 = c0704d.f2063b.f2276h;
                boolean z = c0704d.f2062a == 3;
                int i4;
                if (z) {
                    View b = c0704d.f2064c.m2019b(3);
                    i4 = (b != null ? -b.getWidth() : 0) + i3;
                    view = b;
                    i = i4;
                } else {
                    i4 = c0704d.f2064c.getWidth() - i3;
                    view = c0704d.f2064c.m2019b(5);
                    i = i4;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && c0704d.f2064c.m2013a(view) == 0) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    c0704d.f2063b.m2215a(view, i, view.getTop());
                    layoutParams.f2052c = true;
                    c0704d.f2064c.invalidate();
                    c0704d.m2035c();
                    DrawerLayout drawerLayout = c0704d.f2064c;
                    if (!drawerLayout.f2030f) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        i = drawerLayout.getChildCount();
                        while (i2 < i) {
                            drawerLayout.getChildAt(i2).dispatchTouchEvent(obtain);
                            i2++;
                        }
                        obtain.recycle();
                        drawerLayout.f2030f = true;
                    }
                }
            }
        }

        C0704d(DrawerLayout drawerLayout, int i) {
            this.f2064c = drawerLayout;
            this.f2062a = i;
        }

        public final int mo165a(View view) {
            return DrawerLayout.m2005e(view) ? view.getWidth() : 0;
        }

        public final void mo114a(int i) {
            DrawerLayout drawerLayout = this.f2064c;
            View view = this.f2063b.f2278j;
            int i2 = drawerLayout.f2027c.f2269a;
            int i3 = drawerLayout.f2028d.f2269a;
            i3 = (i2 == 1 || i3 == 1) ? 1 : (i2 == 2 || i3 == 2) ? 2 : 0;
            if (view != null && i == 0) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.f2051b == 0.0f) {
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    if ((layoutParams.f2053d & 1) == 1) {
                        layoutParams.f2053d = 0;
                        if (drawerLayout.f2031g != null) {
                            for (i2 = drawerLayout.f2031g.size() - 1; i2 >= 0; i2--) {
                                ((C0389c) drawerLayout.f2031g.get(i2)).onDrawerClosed(view);
                            }
                        }
                        drawerLayout.m2017a(view, false);
                        if (drawerLayout.hasWindowFocus()) {
                            View rootView = drawerLayout.getRootView();
                            if (rootView != null) {
                                rootView.sendAccessibilityEvent(32);
                            }
                        }
                    }
                } else if (layoutParams.f2051b == 1.0f) {
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    if ((layoutParams.f2053d & 1) == 0) {
                        layoutParams.f2053d = 1;
                        if (drawerLayout.f2031g != null) {
                            for (i2 = drawerLayout.f2031g.size() - 1; i2 >= 0; i2--) {
                                ((C0389c) drawerLayout.f2031g.get(i2)).onDrawerOpened(view);
                            }
                        }
                        drawerLayout.m2017a(view, true);
                        if (drawerLayout.hasWindowFocus()) {
                            drawerLayout.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            if (i3 != drawerLayout.f2029e) {
                drawerLayout.f2029e = i3;
                if (drawerLayout.f2031g != null) {
                    for (i2 = drawerLayout.f2031g.size() - 1; i2 >= 0; i2--) {
                        ((C0389c) drawerLayout.f2031g.get(i2)).onDrawerStateChanged(i3);
                    }
                }
            }
        }

        public final void mo702a(int i, int i2) {
            View b = (i & 1) == 1 ? this.f2064c.m2019b(3) : this.f2064c.m2019b(5);
            if (b != null && this.f2064c.m2013a(b) == 0) {
                this.f2063b.m2211a(b, i2);
            }
        }

        public final void mo115a(View view, float f, float f2) {
            int i;
            float b = DrawerLayout.m2003b(view);
            int width = view.getWidth();
            if (this.f2064c.m2018a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && b > 0.5f)) ? 0 : -width;
            } else {
                i = this.f2064c.getWidth();
                if (f < 0.0f || (f == 0.0f && b > 0.5f)) {
                    i -= width;
                }
            }
            this.f2063b.m2213a(i, view.getTop());
            this.f2064c.invalidate();
        }

        public final boolean mo116a(View view, int i) {
            return DrawerLayout.m2005e(view) && this.f2064c.m2018a(view, this.f2062a) && this.f2064c.m2013a(view) == 0;
        }

        public final void m2032b() {
            this.f2064c.removeCallbacks(this.f2065d);
        }

        public final void mo117b(View view, int i) {
            int width = view.getWidth();
            float width2 = this.f2064c.m2018a(view, 3) ? ((float) (width + i)) / ((float) width) : ((float) (this.f2064c.getWidth() - i)) / ((float) width);
            this.f2064c.m2016a(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            this.f2064c.invalidate();
        }

        public final int mo118c(View view, int i) {
            return view.getTop();
        }

        final void m2035c() {
            int i = 3;
            if (this.f2062a == 3) {
                i = 5;
            }
            View b = this.f2064c.m2019b(i);
            if (b != null) {
                this.f2064c.m2026f(b);
            }
        }

        public final int mo119d(View view, int i) {
            if (this.f2064c.m2018a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = this.f2064c.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        public final void mo703d() {
            this.f2064c.postDelayed(this.f2065d, 160);
        }

        public final void mo166e(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f2052c = false;
            m2035c();
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f2013m = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2036n = new C0702b();
        this.f2039q = -1728053248;
        this.f2041s = new Paint();
        this.f2045w = true;
        this.f2046x = 3;
        this.f2047y = 3;
        this.f2048z = 3;
        this.f2014A = 3;
        this.f2022I = null;
        this.f2023J = null;
        this.f2024K = null;
        this.f2025L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2038p = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f2042t = new C0704d(this, 3);
        this.f2043u = new C0704d(this, 5);
        this.f2027c = C0769o.m2195a((ViewGroup) this, 1.0f, this.f2042t);
        this.f2027c.f2277i = 1;
        this.f2027c.f2275g = f2;
        this.f2042t.f2063b = this.f2027c;
        this.f2028d = C0769o.m2195a((ViewGroup) this, 1.0f, this.f2043u);
        this.f2028d.f2277i = 2;
        this.f2028d.f2275g = f2;
        this.f2043u.f2063b = this.f2028d;
        setFocusableInTouchMode(true);
        C0679r.m1906a((View) this, 1);
        C0679r.m1913a((View) this, new C0701a(this));
        C0684t.m1959a(this);
        if (C0679r.m1945r(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C06991(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2012l);
                try {
                    this.f2019F = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f2019F = null;
            }
        }
        this.f2037o = f * 10.0f;
        this.f2026M = new ArrayList();
    }

    private void m2001a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m2005e(childAt) && (!z || layoutParams.f2052c)) {
                i = m2018a(childAt, 3) ? i | this.f2027c.m2215a(childAt, -childAt.getWidth(), childAt.getTop()) : i | this.f2028d.m2215a(childAt, getWidth(), childAt.getTop());
                layoutParams.f2052c = false;
            }
        }
        this.f2042t.m2032b();
        this.f2043u.m2032b();
        if (i != 0) {
            invalidate();
        }
    }

    private static boolean m2002a(Drawable drawable, int i) {
        if (drawable == null || !C0366a.m1048b(drawable)) {
            return false;
        }
        C0366a.m1049b(drawable, i);
        return true;
    }

    static float m2003b(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2051b;
    }

    static String m2004c(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    static boolean m2005e(View view) {
        int a = C0656d.m1743a(((LayoutParams) view.getLayoutParams()).f2050a, C0679r.m1932e(view));
        return (a & 3) != 0 ? true : (a & 5) != 0;
    }

    private View m2006f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f2053d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    static boolean m2007g(View view) {
        return (C0679r.m1930d(view) == 4 || C0679r.m1930d(view) == 2) ? false : true;
    }

    private static boolean m2008h(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2050a == 0;
    }

    private void m2009i(View view) {
        if (m2005e(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f2045w) {
                layoutParams.f2051b = 1.0f;
                layoutParams.f2053d = 1;
                m2017a(view, true);
            } else {
                layoutParams.f2053d |= 2;
                if (m2018a(view, 3)) {
                    this.f2027c.m2215a(view, 0, view.getTop());
                } else {
                    this.f2028d.m2215a(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    private static boolean m2010j(View view) {
        if (m2005e(view)) {
            return (((LayoutParams) view.getLayoutParams()).f2053d & 1) == 1;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    private static boolean m2011k(View view) {
        if (m2005e(view)) {
            return ((LayoutParams) view.getLayoutParams()).f2051b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public final int m2012a(int i) {
        int e = C0679r.m1932e(this);
        switch (i) {
            case 3:
                if (this.f2046x != 3) {
                    return this.f2046x;
                }
                e = e == 0 ? this.f2048z : this.f2014A;
                if (e != 3) {
                    return e;
                }
                break;
            case 5:
                if (this.f2047y != 3) {
                    return this.f2047y;
                }
                e = e == 0 ? this.f2014A : this.f2048z;
                if (e != 3) {
                    return e;
                }
                break;
            case 8388611:
                if (this.f2048z != 3) {
                    return this.f2048z;
                }
                e = e == 0 ? this.f2046x : this.f2047y;
                if (e != 3) {
                    return e;
                }
                break;
            case 8388613:
                if (this.f2014A != 3) {
                    return this.f2014A;
                }
                e = e == 0 ? this.f2047y : this.f2046x;
                if (e != 3) {
                    return e;
                }
                break;
        }
        return 0;
    }

    public final int m2013a(View view) {
        if (m2005e(view)) {
            return m2012a(((LayoutParams) view.getLayoutParams()).f2050a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void m2014a() {
        View b = m2019b(8388611);
        if (b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m2004c(8388611));
        }
        m2009i(b);
    }

    public final void m2015a(int i, int i2) {
        int a = C0656d.m1743a(i2, C0679r.m1932e(this));
        switch (i2) {
            case 3:
                this.f2046x = i;
                break;
            case 5:
                this.f2047y = i;
                break;
            case 8388611:
                this.f2048z = i;
                break;
            case 8388613:
                this.f2014A = i;
                break;
        }
        if (i != 0) {
            (a == 3 ? this.f2027c : this.f2028d).m2210a();
        }
        View b;
        switch (i) {
            case 1:
                b = m2019b(a);
                if (b != null) {
                    m2026f(b);
                    return;
                }
                return;
            case 2:
                b = m2019b(a);
                if (b != null) {
                    m2009i(b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    final void m2016a(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f2051b) {
            layoutParams.f2051b = f;
            if (this.f2031g != null) {
                for (int size = this.f2031g.size() - 1; size >= 0; size--) {
                    ((C0389c) this.f2031g.get(size)).onDrawerSlide(view, f);
                }
            }
        }
    }

    final void m2017a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2005e(childAt)) && !(z && childAt == view)) {
                C0679r.m1906a(childAt, 4);
            } else {
                C0679r.m1906a(childAt, 1);
            }
        }
    }

    final boolean m2018a(View view, int i) {
        return (m2021c(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int i3 = 0;
        if (getDescendantFocusability() != 393216) {
            int i4;
            int childCount = getChildCount();
            int i5 = 0;
            for (i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!m2005e(childAt)) {
                    this.f2026M.add(childAt);
                } else if (m2010j(childAt)) {
                    i5 = 1;
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (i5 == 0) {
                i4 = this.f2026M.size();
                while (i3 < i4) {
                    View view = (View) this.f2026M.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.f2026M.clear();
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m2006f() != null || m2005e(view)) {
            C0679r.m1906a(view, 4);
        } else {
            C0679r.m1906a(view, 1);
        }
        if (!f2011b) {
            C0679r.m1913a(view, this.f2036n);
        }
    }

    final View m2019b(int i) {
        int a = C0656d.m1743a(i, C0679r.m1932e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2021c(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public final void m2020b() {
        View b = m2019b(8388611);
        if (b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m2004c(8388611));
        }
        m2026f(b);
    }

    final int m2021c(View view) {
        return C0656d.m1743a(((LayoutParams) view.getLayoutParams()).f2050a, C0679r.m1932e(this));
    }

    public final boolean m2022c() {
        View b = m2019b(8388611);
        return b != null ? m2010j(b) : false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f2051b);
        }
        this.f2040r = f;
        boolean c = this.f2027c.m2220c();
        boolean c2 = this.f2028d.m2220c();
        if (c || c2) {
            C0679r.m1928c(this);
        }
    }

    final void m2023d(View view) {
        float b = m2003b(view);
        int width = view.getWidth();
        int i = ((int) (((float) width) * 0.0f)) - ((int) (b * ((float) width)));
        if (!m2018a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m2016a(view, 0.0f);
    }

    public final boolean m2024d() {
        View b = m2019b(8388611);
        return b != null ? m2011k(b) : false;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int right;
        int height = getHeight();
        boolean h = m2008h(view);
        int i = 0;
        int width = getWidth();
        int save = canvas.save();
        if (h) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    Object obj = background != null ? background.getOpacity() == -1 ? 1 : null : null;
                    if (obj != null && m2005e(childAt) && childAt.getHeight() >= height) {
                        if (m2018a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right <= i) {
                                right = i;
                            }
                            i = right;
                            right = width;
                        } else {
                            right = childAt.getLeft();
                            if (right < width) {
                            }
                        }
                        i2++;
                        width = right;
                    }
                }
                right = width;
                i2++;
                width = right;
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        right = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f2040r > 0.0f && h) {
            this.f2041s.setColor((((int) (((float) ((this.f2039q & -16777216) >>> 24)) * this.f2040r)) << 24) | (this.f2039q & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) right, (float) getHeight(), this.f2041s);
        } else if (this.f2020G != null && m2018a(view, 3)) {
            right = this.f2020G.getIntrinsicWidth();
            i = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i) / ((float) this.f2027c.f2276h), 1.0f));
            this.f2020G.setBounds(i, view.getTop(), right + i, view.getBottom());
            this.f2020G.setAlpha((int) (255.0f * r2));
            this.f2020G.draw(canvas);
        } else if (this.f2021H != null && m2018a(view, 5)) {
            right = this.f2021H.getIntrinsicWidth();
            i = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i)) / ((float) this.f2028d.f2276h), 1.0f));
            this.f2021H.setBounds(i - right, view.getTop(), i, view.getBottom());
            this.f2021H.setAlpha((int) (255.0f * r2));
            this.f2021H.draw(canvas);
        }
        return drawChild;
    }

    final View m2025e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2005e(childAt) && m2011k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final void m2026f(View view) {
        if (m2005e(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f2045w) {
                layoutParams.f2051b = 0.0f;
                layoutParams.f2053d = 0;
            } else {
                layoutParams.f2053d |= 4;
                if (m2018a(view, 3)) {
                    this.f2027c.m2215a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f2028d.m2215a(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        return f2013m ? this.f2037o : 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2019F;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2045w = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2045w = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2035k && this.f2019F != null) {
            int systemWindowInsetTop = VERSION.SDK_INT >= 21 ? this.f2034j != null ? ((WindowInsets) this.f2034j).getSystemWindowInsetTop() : 0 : 0;
            if (systemWindowInsetTop > 0) {
                this.f2019F.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f2019F.draw(canvas);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r1 = 1;
        r2 = 0;
        r0 = r10.getActionMasked();
        r3 = r9.f2027c;
        r3 = r3.m2214a(r10);
        r4 = r9.f2028d;
        r4 = r4.m2214a(r10);
        r4 = r4 | r3;
        switch(r0) {
            case 0: goto L_0x0039;
            case 1: goto L_0x00ac;
            case 2: goto L_0x0062;
            case 3: goto L_0x00ac;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r4 != 0) goto L_0x0037;
    L_0x0019:
        if (r0 != 0) goto L_0x0037;
    L_0x001b:
        r4 = r9.getChildCount();
        r3 = r2;
    L_0x0020:
        if (r3 >= r4) goto L_0x00ba;
    L_0x0022:
        r0 = r9.getChildAt(r3);
        r0 = r0.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r0 = r0.f2052c;
        if (r0 == 0) goto L_0x00b5;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        if (r0 != 0) goto L_0x0037;
    L_0x0033:
        r0 = r9.f2030f;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        r2 = r1;
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = r10.getX();
        r3 = r10.getY();
        r9.f2017D = r0;
        r9.f2018E = r3;
        r5 = r9.f2040r;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x00bd;
    L_0x004c:
        r5 = r9.f2027c;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = r5.m2216b(r0, r3);
        if (r0 == 0) goto L_0x00bd;
    L_0x0056:
        r0 = m2008h(r0);
        if (r0 == 0) goto L_0x00bd;
    L_0x005c:
        r0 = r1;
    L_0x005d:
        r9.f2015B = r2;
        r9.f2030f = r2;
        goto L_0x0017;
    L_0x0062:
        r5 = r9.f2027c;
        r0 = r5.f2271c;
        r6 = r0.length;
        r3 = r2;
    L_0x0068:
        if (r3 >= r6) goto L_0x00aa;
    L_0x006a:
        r0 = r5.m2212a(r3);
        if (r0 == 0) goto L_0x00a4;
    L_0x0070:
        r0 = r5.f2273e;
        r0 = r0[r3];
        r7 = r5.f2271c;
        r7 = r7[r3];
        r0 = r0 - r7;
        r7 = r5.f2274f;
        r7 = r7[r3];
        r8 = r5.f2272d;
        r8 = r8[r3];
        r7 = r7 - r8;
        r0 = r0 * r0;
        r7 = r7 * r7;
        r0 = r0 + r7;
        r7 = r5.f2270b;
        r8 = r5.f2270b;
        r7 = r7 * r8;
        r7 = (float) r7;
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a2;
    L_0x008f:
        r0 = r1;
    L_0x0090:
        if (r0 == 0) goto L_0x00a6;
    L_0x0092:
        r0 = r1;
    L_0x0093:
        if (r0 == 0) goto L_0x0016;
    L_0x0095:
        r0 = r9.f2042t;
        r0.m2032b();
        r0 = r9.f2043u;
        r0.m2032b();
        r0 = r2;
        goto L_0x0017;
    L_0x00a2:
        r0 = r2;
        goto L_0x0090;
    L_0x00a4:
        r0 = r2;
        goto L_0x0090;
    L_0x00a6:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0068;
    L_0x00aa:
        r0 = r2;
        goto L_0x0093;
    L_0x00ac:
        r9.m2001a(r1);
        r9.f2015B = r2;
        r9.f2030f = r2;
        goto L_0x0016;
    L_0x00b5:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0020;
    L_0x00ba:
        r0 = r2;
        goto L_0x0031;
    L_0x00bd:
        r0 = r2;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m2025e() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View e = m2025e();
        if (e != null && m2013a(e) == 0) {
            m2001a(false);
        }
        return e != null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2044v = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m2008h(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2018a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * layoutParams.f2051b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * layoutParams.f2051b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != layoutParams.f2051b ? 1 : null;
                    int i8;
                    switch (layoutParams.f2050a & 112) {
                        case 16:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < layoutParams.topMargin) {
                                i8 = layoutParams.topMargin;
                            } else if (i8 + measuredHeight > i9 - layoutParams.bottomMargin) {
                                i8 = (i9 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case 80:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, layoutParams.topMargin, measuredWidth + i7, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (obj != null) {
                        m2016a(childAt, f);
                    }
                    int i10 = layoutParams.f2051b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.f2044v = false;
        this.f2045w = false;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int e;
        Object obj2;
        Object obj3;
        int childCount;
        int i3;
        View childAt;
        LayoutParams layoutParams;
        int a;
        WindowInsets windowInsets;
        Object obj4;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    mode = 300;
                    mode2 = size;
                    setMeasuredDimension(mode2, mode);
                    obj = (this.f2034j == null && C0679r.m1945r(this)) ? 1 : null;
                    e = C0679r.m1932e(this);
                    obj2 = null;
                    obj3 = null;
                    childCount = getChildCount();
                    for (i3 = 0; i3 < childCount; i3++) {
                        childAt = getChildAt(i3);
                        if (childAt.getVisibility() != 8) {
                            layoutParams = (LayoutParams) childAt.getLayoutParams();
                            if (obj != null) {
                                a = C0656d.m1743a(layoutParams.f2050a, e);
                                if (C0679r.m1945r(childAt)) {
                                    if (VERSION.SDK_INT >= 21) {
                                        windowInsets = (WindowInsets) this.f2034j;
                                        if (a == 3) {
                                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                                        } else if (a == 5) {
                                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                        }
                                        layoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
                                        layoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
                                        layoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                                    }
                                } else if (VERSION.SDK_INT >= 21) {
                                    windowInsets = (WindowInsets) this.f2034j;
                                    if (a == 3) {
                                        windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                                    } else if (a == 5) {
                                        windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                    }
                                    childAt.dispatchApplyWindowInsets(windowInsets);
                                }
                            }
                            if (m2008h(childAt)) {
                                childAt.measure(MeasureSpec.makeMeasureSpec((mode2 - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((mode - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                            } else if (m2005e(childAt)) {
                                throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                            } else {
                                if (f2013m && C0679r.m1940m(childAt) != this.f2037o) {
                                    C0679r.m1905a(childAt, this.f2037o);
                                }
                                a = m2021c(childAt) & 7;
                                obj4 = a != 3 ? 1 : null;
                                if ((obj4 != null || obj2 == null) && (obj4 != null || obj3 == null)) {
                                    if (obj4 == null) {
                                        Object obj5 = obj3;
                                        obj3 = 1;
                                        obj4 = obj5;
                                    } else {
                                        obj4 = 1;
                                        obj3 = obj2;
                                    }
                                    childAt.measure(getChildMeasureSpec(i, (this.f2038p + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                                    obj2 = obj3;
                                    obj3 = obj4;
                                } else {
                                    throw new IllegalStateException("Child drawer has absolute gravity " + m2004c(a) + " but this DrawerLayout already has a drawer view along that edge");
                                }
                            }
                        }
                    }
                }
            }
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        mode = size2;
        mode2 = size;
        setMeasuredDimension(mode2, mode);
        if (this.f2034j == null) {
        }
        e = C0679r.m1932e(this);
        obj2 = null;
        obj3 = null;
        childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (obj != null) {
                    a = C0656d.m1743a(layoutParams.f2050a, e);
                    if (C0679r.m1945r(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            windowInsets = (WindowInsets) this.f2034j;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            layoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
                            layoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
                            layoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
                            layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        windowInsets = (WindowInsets) this.f2034j;
                        if (a == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    }
                }
                if (m2008h(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((mode2 - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((mode - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (m2005e(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    C0679r.m1905a(childAt, this.f2037o);
                    a = m2021c(childAt) & 7;
                    if (a != 3) {
                    }
                    if (obj4 != null) {
                    }
                    if (obj4 == null) {
                        obj4 = 1;
                        obj3 = obj2;
                    } else {
                        Object obj52 = obj3;
                        obj3 = 1;
                        obj4 = obj52;
                    }
                    childAt.measure(getChildMeasureSpec(i, (this.f2038p + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                    obj2 = obj3;
                    obj3 = obj4;
                }
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (savedState.f2054a != 0) {
                View b = m2019b(savedState.f2054a);
                if (b != null) {
                    m2009i(b);
                }
            }
            if (savedState.f2055b != 3) {
                m2015a(savedState.f2055b, 3);
            }
            if (savedState.f2056c != 3) {
                m2015a(savedState.f2056c, 5);
            }
            if (savedState.f2057d != 3) {
                m2015a(savedState.f2057d, 8388611);
            }
            if (savedState.f2058e != 3) {
                m2015a(savedState.f2058e, 8388613);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        if (!f2013m) {
            Drawable drawable;
            int e = C0679r.m1932e(this);
            if (e == 0) {
                if (this.f2022I != null) {
                    m2002a(this.f2022I, e);
                    drawable = this.f2022I;
                }
                drawable = this.f2024K;
            } else {
                if (this.f2023J != null) {
                    m2002a(this.f2023J, e);
                    drawable = this.f2023J;
                }
                drawable = this.f2024K;
            }
            this.f2020G = drawable;
            e = C0679r.m1932e(this);
            if (e == 0) {
                if (this.f2023J != null) {
                    m2002a(this.f2023J, e);
                    drawable = this.f2023J;
                }
                drawable = this.f2025L;
            } else {
                if (this.f2022I != null) {
                    m2002a(this.f2022I, e);
                    drawable = this.f2022I;
                }
                drawable = this.f2025L;
            }
            this.f2021H = drawable;
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            Object obj = layoutParams.f2053d == 1 ? 1 : null;
            Object obj2 = layoutParams.f2053d == 2 ? 1 : null;
            if (obj != null || obj2 != null) {
                savedState.f2054a = layoutParams.f2050a;
                break;
            }
        }
        savedState.f2055b = this.f2046x;
        savedState.f2056c = this.f2047y;
        savedState.f2057d = this.f2048z;
        savedState.f2058e = this.f2014A;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f2027c.m2219b(motionEvent);
        this.f2028d.m2219b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f2017D = x;
                this.f2018E = y;
                this.f2015B = false;
                this.f2030f = false;
                break;
            case 1:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View b = this.f2027c.m2216b((int) x, (int) y);
                if (b != null && m2008h(b)) {
                    x -= this.f2017D;
                    y -= this.f2018E;
                    int i = this.f2027c.f2270b;
                    if ((x * x) + (y * y) < ((float) (i * i))) {
                        View f = m2006f();
                        if (f != null) {
                            z = m2013a(f) == 2;
                            m2001a(z);
                            this.f2015B = false;
                            break;
                        }
                    }
                }
                z = true;
                m2001a(z);
                this.f2015B = false;
            case 3:
                m2001a(true);
                this.f2015B = false;
                this.f2030f = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f2015B = z;
        if (z) {
            m2001a(true);
        }
    }

    public void requestLayout() {
        if (!this.f2044v) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f2037o = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2005e(childAt)) {
                C0679r.m1905a(childAt, this.f2037o);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0389c c0389c) {
        if (this.f2016C != null) {
            C0389c c0389c2 = this.f2016C;
            if (!(c0389c2 == null || this.f2031g == null)) {
                this.f2031g.remove(c0389c2);
            }
        }
        if (!(c0389c == null || c0389c == null)) {
            if (this.f2031g == null) {
                this.f2031g = new ArrayList();
            }
            this.f2031g.add(c0389c);
        }
        this.f2016C = c0389c;
    }

    public void setDrawerLockMode(int i) {
        m2015a(i, 3);
        m2015a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f2039q = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f2019F = i != 0 ? C0392a.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2019F = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f2019F = new ColorDrawable(i);
        invalidate();
    }
}
