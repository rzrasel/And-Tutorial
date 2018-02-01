package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class C0679r {
    static final C0668j f1985a;

    static class C0668j {
        static Field f1973b;
        static boolean f1974c = false;
        private static Field f1975d;
        private static boolean f1976e;
        private static Field f1977f;
        private static boolean f1978g;
        private static WeakHashMap<View, String> f1979h;
        private static Method f1980i;
        WeakHashMap<View, C0693v> f1981a = null;

        C0668j() {
        }

        public static boolean m1793C(View view) {
            if (f1974c) {
                return false;
            }
            if (f1973b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f1973b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable th) {
                    f1974c = true;
                    return false;
                }
            }
            try {
                return f1973b.get(view) != null;
            } catch (Throwable th2) {
                f1974c = true;
                return false;
            }
        }

        private static void m1794D(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        public static void m1795a(View view, C0122a c0122a) {
            view.setAccessibilityDelegate(c0122a == null ? null : c0122a.getBridge());
        }

        public static void m1796a(ViewGroup viewGroup) {
            if (f1980i == null) {
                try {
                    f1980i = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e) {
                }
                f1980i.setAccessible(true);
            }
            try {
                f1980i.invoke(viewGroup, new Object[]{Boolean.valueOf(true)});
            } catch (IllegalAccessException e2) {
            } catch (IllegalArgumentException e3) {
            } catch (InvocationTargetException e4) {
            }
        }

        public Mode mo669A(View view) {
            return view instanceof C0167q ? ((C0167q) view).getSupportBackgroundTintMode() : null;
        }

        public float mo670B(View view) {
            return mo683w(view) + mo682v(view);
        }

        public C0696z mo671a(View view, C0696z c0696z) {
            return c0696z;
        }

        public void mo672a(View view, float f) {
        }

        public void mo641a(View view, int i) {
        }

        public void mo642a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidate(i, i2, i3, i4);
        }

        public void mo673a(View view, ColorStateList colorStateList) {
            if (view instanceof C0167q) {
                ((C0167q) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        public void mo656a(View view, Paint paint) {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }

        public void mo674a(View view, Mode mode) {
            if (view instanceof C0167q) {
                ((C0167q) view).setSupportBackgroundTintMode(mode);
            }
        }

        public void mo664a(View view, Rect rect) {
        }

        public void mo643a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        public void mo675a(View view, C0127n c0127n) {
        }

        public void mo688a(View view, C0667p c0667p) {
        }

        public void mo644a(View view, Runnable runnable) {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }

        public void mo645a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }

        public void mo676a(View view, String str) {
            if (f1979h == null) {
                f1979h = new WeakHashMap();
            }
            f1979h.put(view, str);
        }

        public void mo646a(View view, boolean z) {
        }

        public boolean mo640a(View view) {
            return false;
        }

        public C0696z mo677b(View view, C0696z c0696z) {
            return c0696z;
        }

        public void mo678b(View view, float f) {
        }

        public void mo679b(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                C0668j.m1794D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    C0668j.m1794D((View) parent);
                }
            }
        }

        public void mo657b(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        public boolean mo647b(View view) {
            return false;
        }

        public void mo648c(View view) {
            view.postInvalidate();
        }

        public void mo680c(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                C0668j.m1794D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    C0668j.m1794D((View) parent);
                }
            }
        }

        public int mo649d(View view) {
            return 0;
        }

        public void mo687d(View view, int i) {
        }

        public ViewParent mo650e(View view) {
            return view.getParent();
        }

        public int mo651f(View view) {
            if (!f1976e) {
                try {
                    Field declaredField = View.class.getDeclaredField("mMinWidth");
                    f1975d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                }
                f1976e = true;
            }
            if (f1975d != null) {
                try {
                    return ((Integer) f1975d.get(view)).intValue();
                } catch (Exception e2) {
                }
            }
            return 0;
        }

        public int mo652g(View view) {
            if (!f1978g) {
                try {
                    Field declaredField = View.class.getDeclaredField("mMinHeight");
                    f1977f = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                }
                f1978g = true;
            }
            if (f1977f != null) {
                try {
                    return ((Integer) f1977f.get(view)).intValue();
                } catch (Exception e2) {
                }
            }
            return 0;
        }

        public void mo653h(View view) {
        }

        public boolean mo654i(View view) {
            return false;
        }

        public boolean mo655j(View view) {
            return true;
        }

        public int mo658k(View view) {
            return 0;
        }

        public int mo659l(View view) {
            return view.getPaddingLeft();
        }

        public int mo660m(View view) {
            return view.getPaddingRight();
        }

        public int mo661n(View view) {
            return 0;
        }

        public boolean mo662o(View view) {
            return false;
        }

        public Display mo663p(View view) {
            return mo668t(view) ? ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay() : null;
        }

        public Rect mo665q(View view) {
            return null;
        }

        public void mo666r(View view) {
        }

        public boolean mo667s(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        public boolean mo668t(View view) {
            return view.getWindowToken() != null;
        }

        public String mo681u(View view) {
            return f1979h == null ? null : (String) f1979h.get(view);
        }

        public float mo682v(View view) {
            return 0.0f;
        }

        public float mo683w(View view) {
            return 0.0f;
        }

        public boolean mo684x(View view) {
            return view instanceof C0124h ? ((C0124h) view).isNestedScrollingEnabled() : false;
        }

        public void mo685y(View view) {
            if (view instanceof C0124h) {
                ((C0124h) view).stopNestedScroll();
            }
        }

        public ColorStateList mo686z(View view) {
            return view instanceof C0167q ? ((C0167q) view).getSupportBackgroundTintList() : null;
        }
    }

    static class C0669a extends C0668j {
        C0669a() {
        }

        public final boolean mo640a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class C0670b extends C0669a {
        C0670b() {
        }

        public void mo641a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        public final void mo642a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public final void mo643a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public final void mo644a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public final void mo645a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public final void mo646a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public final boolean mo647b(View view) {
            return view.hasTransientState();
        }

        public final void mo648c(View view) {
            view.postInvalidateOnAnimation();
        }

        public final int mo649d(View view) {
            return view.getImportantForAccessibility();
        }

        public final ViewParent mo650e(View view) {
            return view.getParentForAccessibility();
        }

        public final int mo651f(View view) {
            return view.getMinimumWidth();
        }

        public final int mo652g(View view) {
            return view.getMinimumHeight();
        }

        public void mo653h(View view) {
            view.requestFitSystemWindows();
        }

        public final boolean mo654i(View view) {
            return view.getFitsSystemWindows();
        }

        public final boolean mo655j(View view) {
            return view.hasOverlappingRendering();
        }
    }

    static class C0671c extends C0670b {
        C0671c() {
        }

        public final void mo656a(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public final void mo657b(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        public final int mo658k(View view) {
            return view.getLayoutDirection();
        }

        public final int mo659l(View view) {
            return view.getPaddingStart();
        }

        public final int mo660m(View view) {
            return view.getPaddingEnd();
        }

        public final int mo661n(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public final boolean mo662o(View view) {
            return view.isPaddingRelative();
        }

        public final Display mo663p(View view) {
            return view.getDisplay();
        }
    }

    static class C0672d extends C0671c {
        C0672d() {
        }

        public final void mo664a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        public final Rect mo665q(View view) {
            return view.getClipBounds();
        }
    }

    static class C0673e extends C0672d {
        C0673e() {
        }

        public final void mo641a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        public final void mo666r(View view) {
            view.setAccessibilityLiveRegion(1);
        }

        public final boolean mo667s(View view) {
            return view.isLaidOut();
        }

        public final boolean mo668t(View view) {
            return view.isAttachedToWindow();
        }
    }

    static class C0675f extends C0673e {
        private static ThreadLocal<Rect> f1984d;

        C0675f() {
        }

        private static Rect m1876a() {
            if (f1984d == null) {
                f1984d = new ThreadLocal();
            }
            Rect rect = (Rect) f1984d.get();
            if (rect == null) {
                rect = new Rect();
                f1984d.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        public final Mode mo669A(View view) {
            return view.getBackgroundTintMode();
        }

        public final float mo670B(View view) {
            return view.getZ();
        }

        public final C0696z mo671a(View view, C0696z c0696z) {
            Object obj = (WindowInsets) C0696z.m1992a(c0696z);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
            if (onApplyWindowInsets != obj) {
                obj = new WindowInsets(onApplyWindowInsets);
            }
            return C0696z.m1991a(obj);
        }

        public final void mo672a(View view, float f) {
            view.setElevation(f);
        }

        public final void mo673a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        public final void mo674a(View view, Mode mode) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        public final void mo675a(View view, final C0127n c0127n) {
            if (c0127n == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener(this) {
                    final /* synthetic */ C0675f f1983b;

                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) C0696z.m1992a(c0127n.mo61a(view, C0696z.m1991a((Object) windowInsets)));
                    }
                });
            }
        }

        public final void mo676a(View view, String str) {
            view.setTransitionName(str);
        }

        public final C0696z mo677b(View view, C0696z c0696z) {
            Object obj = (WindowInsets) C0696z.m1992a(c0696z);
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(obj);
            if (dispatchApplyWindowInsets != obj) {
                obj = new WindowInsets(dispatchApplyWindowInsets);
            }
            return C0696z.m1991a(obj);
        }

        public final void mo678b(View view, float f) {
            view.setTranslationZ(f);
        }

        public void mo679b(View view, int i) {
            Object obj;
            Rect a = C0675f.m1876a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
            } else {
                obj = null;
            }
            super.mo679b(view, i);
            if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        }

        public void mo680c(View view, int i) {
            Object obj;
            Rect a = C0675f.m1876a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
            } else {
                obj = null;
            }
            super.mo680c(view, i);
            if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        }

        public final void mo653h(View view) {
            view.requestApplyInsets();
        }

        public final String mo681u(View view) {
            return view.getTransitionName();
        }

        public final float mo682v(View view) {
            return view.getElevation();
        }

        public final float mo683w(View view) {
            return view.getTranslationZ();
        }

        public final boolean mo684x(View view) {
            return view.isNestedScrollingEnabled();
        }

        public final void mo685y(View view) {
            view.stopNestedScroll();
        }

        public final ColorStateList mo686z(View view) {
            return view.getBackgroundTintList();
        }
    }

    static class C0676g extends C0675f {
        C0676g() {
        }

        public final void mo679b(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        public final void mo680c(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        public final void mo687d(View view, int i) {
            view.setScrollIndicators(i, 3);
        }
    }

    static class C0677h extends C0676g {
        C0677h() {
        }

        public final void mo688a(View view, C0667p c0667p) {
            view.setPointerIcon((PointerIcon) (c0667p != null ? c0667p.f1972a : null));
        }
    }

    static class C0678i extends C0677h {
        C0678i() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1985a = new C0678i();
        } else if (VERSION.SDK_INT >= 24) {
            f1985a = new C0677h();
        } else if (VERSION.SDK_INT >= 23) {
            f1985a = new C0676g();
        } else if (VERSION.SDK_INT >= 21) {
            f1985a = new C0675f();
        } else if (VERSION.SDK_INT >= 19) {
            f1985a = new C0673e();
        } else if (VERSION.SDK_INT >= 18) {
            f1985a = new C0672d();
        } else if (VERSION.SDK_INT >= 17) {
            f1985a = new C0671c();
        } else if (VERSION.SDK_INT >= 16) {
            f1985a = new C0670b();
        } else if (VERSION.SDK_INT >= 15) {
            f1985a = new C0669a();
        } else {
            f1985a = new C0668j();
        }
    }

    public static Rect m1900A(View view) {
        return f1985a.mo665q(view);
    }

    public static boolean m1901B(View view) {
        return f1985a.mo668t(view);
    }

    public static boolean m1902C(View view) {
        return f1985a.mo640a(view);
    }

    public static Display m1903D(View view) {
        return f1985a.mo663p(view);
    }

    public static C0696z m1904a(View view, C0696z c0696z) {
        return f1985a.mo671a(view, c0696z);
    }

    public static void m1905a(View view, float f) {
        f1985a.mo672a(view, f);
    }

    public static void m1906a(View view, int i) {
        f1985a.mo641a(view, i);
    }

    public static void m1907a(View view, int i, int i2, int i3, int i4) {
        f1985a.mo642a(view, i, i2, i3, i4);
    }

    public static void m1908a(View view, ColorStateList colorStateList) {
        f1985a.mo673a(view, colorStateList);
    }

    public static void m1909a(View view, Paint paint) {
        f1985a.mo656a(view, paint);
    }

    public static void m1910a(View view, Mode mode) {
        f1985a.mo674a(view, mode);
    }

    public static void m1911a(View view, Rect rect) {
        f1985a.mo664a(view, rect);
    }

    public static void m1912a(View view, Drawable drawable) {
        f1985a.mo643a(view, drawable);
    }

    public static void m1913a(View view, C0122a c0122a) {
        C0668j.m1795a(view, c0122a);
    }

    public static void m1914a(View view, C0127n c0127n) {
        f1985a.mo675a(view, c0127n);
    }

    public static void m1915a(View view, C0667p c0667p) {
        f1985a.mo688a(view, c0667p);
    }

    public static void m1916a(View view, Runnable runnable) {
        f1985a.mo644a(view, runnable);
    }

    public static void m1917a(View view, Runnable runnable, long j) {
        f1985a.mo645a(view, runnable, j);
    }

    public static void m1918a(View view, String str) {
        f1985a.mo676a(view, str);
    }

    public static void m1919a(View view, boolean z) {
        f1985a.mo646a(view, z);
    }

    public static void m1920a(ViewGroup viewGroup) {
        C0668j.m1796a(viewGroup);
    }

    public static boolean m1921a(View view) {
        return C0668j.m1793C(view);
    }

    public static C0696z m1922b(View view, C0696z c0696z) {
        return f1985a.mo677b(view, c0696z);
    }

    public static void m1923b(View view, float f) {
        f1985a.mo678b(view, f);
    }

    public static void m1924b(View view, int i) {
        f1985a.mo680c(view, i);
    }

    public static void m1925b(View view, int i, int i2, int i3, int i4) {
        f1985a.mo657b(view, i, i2, i3, i4);
    }

    @Deprecated
    public static void m1926b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static boolean m1927b(View view) {
        return f1985a.mo647b(view);
    }

    public static void m1928c(View view) {
        f1985a.mo648c(view);
    }

    public static void m1929c(View view, int i) {
        f1985a.mo679b(view, i);
    }

    public static int m1930d(View view) {
        return f1985a.mo649d(view);
    }

    public static void m1931d(View view, int i) {
        f1985a.mo687d(view, i);
    }

    public static int m1932e(View view) {
        return f1985a.mo658k(view);
    }

    public static ViewParent m1933f(View view) {
        return f1985a.mo650e(view);
    }

    public static void m1934g(View view) {
        f1985a.mo666r(view);
    }

    public static int m1935h(View view) {
        return f1985a.mo659l(view);
    }

    public static int m1936i(View view) {
        return f1985a.mo660m(view);
    }

    public static int m1937j(View view) {
        return f1985a.mo651f(view);
    }

    public static int m1938k(View view) {
        return f1985a.mo652g(view);
    }

    public static C0693v m1939l(View view) {
        C0668j c0668j = f1985a;
        if (c0668j.f1981a == null) {
            c0668j.f1981a = new WeakHashMap();
        }
        C0693v c0693v = (C0693v) c0668j.f1981a.get(view);
        if (c0693v != null) {
            return c0693v;
        }
        c0693v = new C0693v(view);
        c0668j.f1981a.put(view, c0693v);
        return c0693v;
    }

    public static float m1940m(View view) {
        return f1985a.mo682v(view);
    }

    public static float m1941n(View view) {
        return f1985a.mo683w(view);
    }

    public static String m1942o(View view) {
        return f1985a.mo681u(view);
    }

    public static int m1943p(View view) {
        return f1985a.mo661n(view);
    }

    public static void m1944q(View view) {
        f1985a.mo653h(view);
    }

    public static boolean m1945r(View view) {
        return f1985a.mo654i(view);
    }

    public static boolean m1946s(View view) {
        return f1985a.mo655j(view);
    }

    public static boolean m1947t(View view) {
        return f1985a.mo662o(view);
    }

    public static ColorStateList m1948u(View view) {
        return f1985a.mo686z(view);
    }

    public static Mode m1949v(View view) {
        return f1985a.mo669A(view);
    }

    public static boolean m1950w(View view) {
        return f1985a.mo684x(view);
    }

    public static void m1951x(View view) {
        f1985a.mo685y(view);
    }

    public static boolean m1952y(View view) {
        return f1985a.mo667s(view);
    }

    public static float m1953z(View view) {
        return f1985a.mo670B(view);
    }
}
