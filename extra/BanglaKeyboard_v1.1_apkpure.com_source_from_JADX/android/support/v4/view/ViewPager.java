package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.C0392a;
import android.support.v4.view.p019a.C0626b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] f1829a = new int[]{16842931};
    private static final C0605h ai = new C0605h();
    private static final Comparator<C0601b> f1830f = new C05951();
    private static final Interpolator f1831g = new C05962();
    private boolean f1832A;
    private int f1833B = 1;
    private boolean f1834C;
    private boolean f1835D;
    private int f1836E;
    private int f1837F;
    private int f1838G;
    private float f1839H;
    private float f1840I;
    private float f1841J;
    private float f1842K;
    private int f1843L = -1;
    private VelocityTracker f1844M;
    private int f1845N;
    private int f1846O;
    private int f1847P;
    private int f1848Q;
    private boolean f1849R;
    private EdgeEffect f1850S;
    private EdgeEffect f1851T;
    private boolean f1852U = true;
    private boolean f1853V = false;
    private boolean f1854W;
    private int aa;
    private C0204e ab;
    private C0204e ac;
    private List<C0196d> ad;
    private C0603f ae;
    private int af;
    private int ag;
    private ArrayList<View> ah;
    private final Runnable aj = new C05973(this);
    private int ak = 0;
    C0404o f1855b;
    int f1856c;
    public List<C0204e> f1857d;
    private int f1858e;
    private final ArrayList<C0601b> f1859h = new ArrayList();
    private final C0601b f1860i = new C0601b();
    private final Rect f1861j = new Rect();
    private int f1862k = -1;
    private Parcelable f1863l = null;
    private ClassLoader f1864m = null;
    private Scroller f1865n;
    private boolean f1866o;
    private C0604g f1867p;
    private int f1868q;
    private Drawable f1869r;
    private int f1870s;
    private int f1871t;
    private float f1872u = -3.4028235E38f;
    private float f1873v = Float.MAX_VALUE;
    private int f1874w;
    private int f1875x;
    private boolean f1876y;
    private boolean f1877z;

    public interface C0196d {
        void mo167a(ViewPager viewPager, C0404o c0404o, C0404o c0404o2);
    }

    public interface C0204e {
        void mo168a(int i);

        void mo169a(int i, float f);

        void mo170b(int i);
    }

    static class C05951 implements Comparator<C0601b> {
        C05951() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C0601b) obj).f1823b - ((C0601b) obj2).f1823b;
        }
    }

    static class C05962 implements Interpolator {
        C05962() {
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    }

    class C05973 implements Runnable {
        final /* synthetic */ ViewPager f1810a;

        C05973(ViewPager viewPager) {
            this.f1810a = viewPager;
        }

        public final void run() {
            this.f1810a.setScrollState(0);
            this.f1810a.m1601b();
        }
    }

    class C05984 implements C0127n {
        final /* synthetic */ ViewPager f1811a;
        private final Rect f1812b = new Rect();

        C05984(ViewPager viewPager) {
            this.f1811a = viewPager;
        }

        public final C0696z mo61a(View view, C0696z c0696z) {
            C0696z a = C0679r.m1904a(view, c0696z);
            if (a.m1998e()) {
                return a;
            }
            Rect rect = this.f1812b;
            rect.left = a.m1993a();
            rect.top = a.m1995b();
            rect.right = a.m1996c();
            rect.bottom = a.m1997d();
            int childCount = this.f1811a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0696z b = C0679r.m1922b(this.f1811a.getChildAt(i), a);
                rect.left = Math.min(b.m1993a(), rect.left);
                rect.top = Math.min(b.m1995b(), rect.top);
                rect.right = Math.min(b.m1996c(), rect.right);
                rect.bottom = Math.min(b.m1997d(), rect.bottom);
            }
            return a.m1994a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean f1813a;
        public int f1814b;
        float f1815c = 0.0f;
        boolean f1816d;
        int f1817e;
        int f1818f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1829a);
            this.f1814b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05991();
        int f1819a;
        Parcelable f1820b;
        ClassLoader f1821c;

        static class C05991 implements ClassLoaderCreator<SavedState> {
            C05991() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f1819a = parcel.readInt();
            this.f1820b = parcel.readParcelable(classLoader);
            this.f1821c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1819a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1819a);
            parcel.writeParcelable(this.f1820b, i);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface C0600a {
    }

    static class C0601b {
        Object f1822a;
        int f1823b;
        boolean f1824c;
        float f1825d;
        float f1826e;

        C0601b() {
        }
    }

    class C0602c extends C0122a {
        final /* synthetic */ ViewPager f1827a;

        C0602c(ViewPager viewPager) {
            this.f1827a = viewPager;
        }

        private boolean m1572a() {
            return this.f1827a.f1855b != null && this.f1827a.f1855b.getCount() > 1;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m1572a());
            if (accessibilityEvent.getEventType() == 4096 && this.f1827a.f1855b != null) {
                accessibilityEvent.setItemCount(this.f1827a.f1855b.getCount());
                accessibilityEvent.setFromIndex(this.f1827a.f1856c);
                accessibilityEvent.setToIndex(this.f1827a.f1856c);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            c0626b.m1694b(ViewPager.class.getName());
            c0626b.m1708j(m1572a());
            if (this.f1827a.canScrollHorizontally(1)) {
                c0626b.m1684a(4096);
            }
            if (this.f1827a.canScrollHorizontally(-1)) {
                c0626b.m1684a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!this.f1827a.canScrollHorizontally(1)) {
                        return false;
                    }
                    this.f1827a.setCurrentItem(this.f1827a.f1856c + 1);
                    return true;
                case FragmentTransaction.TRANSIT_EXIT_MASK /*8192*/:
                    if (!this.f1827a.canScrollHorizontally(-1)) {
                        return false;
                    }
                    this.f1827a.setCurrentItem(this.f1827a.f1856c - 1);
                    return true;
                default:
                    return false;
            }
        }
    }

    public interface C0603f {
    }

    private class C0604g extends DataSetObserver {
        final /* synthetic */ ViewPager f1828a;

        C0604g(ViewPager viewPager) {
            this.f1828a = viewPager;
        }

        public final void onChanged() {
            this.f1828a.m1599a();
        }

        public final void onInvalidated() {
            this.f1828a.m1599a();
        }
    }

    static class C0605h implements Comparator<View> {
        C0605h() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            return layoutParams.f1813a != layoutParams2.f1813a ? layoutParams.f1813a ? 1 : -1 : layoutParams.f1817e - layoutParams2.f1817e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f1865n = new Scroller(context2, f1831g);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f1838G = viewConfiguration.getScaledPagingTouchSlop();
        this.f1845N = (int) (400.0f * f);
        this.f1846O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1850S = new EdgeEffect(context2);
        this.f1851T = new EdgeEffect(context2);
        this.f1847P = (int) (25.0f * f);
        this.f1848Q = (int) (2.0f * f);
        this.f1836E = (int) (16.0f * f);
        C0679r.m1913a((View) this, new C0602c(this));
        if (C0679r.m1930d(this) == 0) {
            C0679r.m1906a((View) this, 1);
        }
        C0679r.m1914a((View) this, new C05984(this));
    }

    private Rect m1573a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private C0601b m1574a(int i, int i2) {
        C0601b c0601b = new C0601b();
        c0601b.f1823b = i;
        c0601b.f1822a = this.f1855b.instantiateItem((ViewGroup) this, i);
        c0601b.f1825d = this.f1855b.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f1859h.size()) {
            this.f1859h.add(c0601b);
        } else {
            this.f1859h.add(i2, c0601b);
        }
        return c0601b;
    }

    private C0601b m1575a(View view) {
        for (int i = 0; i < this.f1859h.size(); i++) {
            C0601b c0601b = (C0601b) this.f1859h.get(i);
            if (this.f1855b.isViewFromObject(view, c0601b.f1822a)) {
                return c0601b;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1576a(int r18) {
        /*
        r17 = this;
        r2 = 0;
        r0 = r17;
        r3 = r0.f1856c;
        r0 = r18;
        if (r3 == r0) goto L_0x0318;
    L_0x0009:
        r0 = r17;
        r2 = r0.f1856c;
        r0 = r17;
        r2 = r0.m1587b(r2);
        r0 = r18;
        r1 = r17;
        r1.f1856c = r0;
        r3 = r2;
    L_0x001a:
        r0 = r17;
        r2 = r0.f1855b;
        if (r2 != 0) goto L_0x0024;
    L_0x0020:
        r17.m1589c();
    L_0x0023:
        return;
    L_0x0024:
        r0 = r17;
        r2 = r0.f1832A;
        if (r2 == 0) goto L_0x002e;
    L_0x002a:
        r17.m1589c();
        goto L_0x0023;
    L_0x002e:
        r2 = r17.getWindowToken();
        if (r2 == 0) goto L_0x0023;
    L_0x0034:
        r0 = r17;
        r2 = r0.f1855b;
        r0 = r17;
        r2.startUpdate(r0);
        r0 = r17;
        r2 = r0.f1833B;
        r4 = 0;
        r0 = r17;
        r5 = r0.f1856c;
        r5 = r5 - r2;
        r10 = java.lang.Math.max(r4, r5);
        r0 = r17;
        r4 = r0.f1855b;
        r11 = r4.getCount();
        r4 = r11 + -1;
        r0 = r17;
        r5 = r0.f1856c;
        r2 = r2 + r5;
        r12 = java.lang.Math.min(r4, r2);
        r0 = r17;
        r2 = r0.f1858e;
        if (r11 == r2) goto L_0x00c7;
    L_0x0064:
        r2 = r17.getResources();	 Catch:{ NotFoundException -> 0x00bd }
        r3 = r17.getId();	 Catch:{ NotFoundException -> 0x00bd }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00bd }
    L_0x0070:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4.<init>(r5);
        r0 = r17;
        r5 = r0.f1858e;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r11);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r17.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r17;
        r4 = r0.f1855b;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00bd:
        r2 = move-exception;
        r2 = r17.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x0070;
    L_0x00c7:
        r5 = 0;
        r2 = 0;
        r4 = r2;
    L_0x00ca:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.size();
        if (r4 >= r2) goto L_0x0315;
    L_0x00d4:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
        r6 = r2.f1823b;
        r0 = r17;
        r7 = r0.f1856c;
        if (r6 < r7) goto L_0x015a;
    L_0x00e6:
        r6 = r2.f1823b;
        r0 = r17;
        r7 = r0.f1856c;
        if (r6 != r7) goto L_0x0315;
    L_0x00ee:
        if (r2 != 0) goto L_0x0312;
    L_0x00f0:
        if (r11 <= 0) goto L_0x0312;
    L_0x00f2:
        r0 = r17;
        r2 = r0.f1856c;
        r0 = r17;
        r2 = r0.m1574a(r2, r4);
        r9 = r2;
    L_0x00fd:
        if (r9 == 0) goto L_0x0274;
    L_0x00ff:
        r8 = 0;
        r7 = r4 + -1;
        if (r7 < 0) goto L_0x015f;
    L_0x0104:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
    L_0x010e:
        r13 = r17.getClientWidth();
        if (r13 > 0) goto L_0x0161;
    L_0x0114:
        r5 = 0;
    L_0x0115:
        r0 = r17;
        r6 = r0.f1856c;
        r6 = r6 + -1;
        r15 = r6;
        r6 = r8;
        r8 = r15;
        r16 = r7;
        r7 = r4;
        r4 = r16;
    L_0x0123:
        if (r8 < 0) goto L_0x01a7;
    L_0x0125:
        r14 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r14 < 0) goto L_0x0171;
    L_0x0129:
        if (r8 >= r10) goto L_0x0171;
    L_0x012b:
        if (r2 == 0) goto L_0x01a7;
    L_0x012d:
        r14 = r2.f1823b;
        if (r8 != r14) goto L_0x0157;
    L_0x0131:
        r14 = r2.f1824c;
        if (r14 != 0) goto L_0x0157;
    L_0x0135:
        r0 = r17;
        r14 = r0.f1859h;
        r14.remove(r4);
        r0 = r17;
        r14 = r0.f1855b;
        r2 = r2.f1822a;
        r0 = r17;
        r14.destroyItem(r0, r8, r2);
        r4 = r4 + -1;
        r7 = r7 + -1;
        if (r4 < 0) goto L_0x016f;
    L_0x014d:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
    L_0x0157:
        r8 = r8 + -1;
        goto L_0x0123;
    L_0x015a:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x00ca;
    L_0x015f:
        r2 = 0;
        goto L_0x010e;
    L_0x0161:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r9.f1825d;
        r5 = r5 - r6;
        r6 = r17.getPaddingLeft();
        r6 = (float) r6;
        r14 = (float) r13;
        r6 = r6 / r14;
        r5 = r5 + r6;
        goto L_0x0115;
    L_0x016f:
        r2 = 0;
        goto L_0x0157;
    L_0x0171:
        if (r2 == 0) goto L_0x018b;
    L_0x0173:
        r14 = r2.f1823b;
        if (r8 != r14) goto L_0x018b;
    L_0x0177:
        r2 = r2.f1825d;
        r6 = r6 + r2;
        r4 = r4 + -1;
        if (r4 < 0) goto L_0x0189;
    L_0x017e:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
        goto L_0x0157;
    L_0x0189:
        r2 = 0;
        goto L_0x0157;
    L_0x018b:
        r2 = r4 + 1;
        r0 = r17;
        r2 = r0.m1574a(r8, r2);
        r2 = r2.f1825d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        if (r4 < 0) goto L_0x01a5;
    L_0x019a:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r4);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
        goto L_0x0157;
    L_0x01a5:
        r2 = 0;
        goto L_0x0157;
    L_0x01a7:
        r5 = r9.f1825d;
        r8 = r7 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x026f;
    L_0x01b1:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.size();
        if (r8 >= r2) goto L_0x0215;
    L_0x01bb:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
        r6 = r2;
    L_0x01c6:
        if (r13 > 0) goto L_0x0217;
    L_0x01c8:
        r2 = 0;
        r4 = r2;
    L_0x01ca:
        r0 = r17;
        r2 = r0.f1856c;
        r2 = r2 + 1;
        r15 = r2;
        r2 = r6;
        r6 = r8;
        r8 = r15;
    L_0x01d4:
        if (r8 >= r11) goto L_0x026f;
    L_0x01d6:
        r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r10 < 0) goto L_0x0225;
    L_0x01da:
        if (r8 <= r12) goto L_0x0225;
    L_0x01dc:
        if (r2 == 0) goto L_0x026f;
    L_0x01de:
        r10 = r2.f1823b;
        if (r8 != r10) goto L_0x030d;
    L_0x01e2:
        r10 = r2.f1824c;
        if (r10 != 0) goto L_0x030d;
    L_0x01e6:
        r0 = r17;
        r10 = r0.f1859h;
        r10.remove(r6);
        r0 = r17;
        r10 = r0.f1855b;
        r2 = r2.f1822a;
        r0 = r17;
        r10.destroyItem(r0, r8, r2);
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0223;
    L_0x0202:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
    L_0x020c:
        r15 = r5;
        r5 = r2;
        r2 = r15;
    L_0x020f:
        r8 = r8 + 1;
        r15 = r2;
        r2 = r5;
        r5 = r15;
        goto L_0x01d4;
    L_0x0215:
        r6 = 0;
        goto L_0x01c6;
    L_0x0217:
        r2 = r17.getPaddingRight();
        r2 = (float) r2;
        r4 = (float) r13;
        r2 = r2 / r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r4;
        r4 = r2;
        goto L_0x01ca;
    L_0x0223:
        r2 = 0;
        goto L_0x020c;
    L_0x0225:
        if (r2 == 0) goto L_0x024a;
    L_0x0227:
        r10 = r2.f1823b;
        if (r8 != r10) goto L_0x024a;
    L_0x022b:
        r2 = r2.f1825d;
        r5 = r5 + r2;
        r6 = r6 + 1;
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x0248;
    L_0x023a:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
    L_0x0244:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x020f;
    L_0x0248:
        r2 = 0;
        goto L_0x0244;
    L_0x024a:
        r0 = r17;
        r2 = r0.m1574a(r8, r6);
        r6 = r6 + 1;
        r2 = r2.f1825d;
        r5 = r5 + r2;
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.size();
        if (r6 >= r2) goto L_0x026d;
    L_0x025f:
        r0 = r17;
        r2 = r0.f1859h;
        r2 = r2.get(r6);
        r2 = (android.support.v4.view.ViewPager.C0601b) r2;
    L_0x0269:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x020f;
    L_0x026d:
        r2 = 0;
        goto L_0x0269;
    L_0x026f:
        r0 = r17;
        r0.m1582a(r9, r7, r3);
    L_0x0274:
        r0 = r17;
        r3 = r0.f1855b;
        r0 = r17;
        r4 = r0.f1856c;
        if (r9 == 0) goto L_0x02c3;
    L_0x027e:
        r2 = r9.f1822a;
    L_0x0280:
        r0 = r17;
        r3.setPrimaryItem(r0, r4, r2);
        r0 = r17;
        r2 = r0.f1855b;
        r0 = r17;
        r2.finishUpdate(r0);
        r4 = r17.getChildCount();
        r2 = 0;
        r3 = r2;
    L_0x0294:
        if (r3 >= r4) goto L_0x02c5;
    L_0x0296:
        r0 = r17;
        r5 = r0.getChildAt(r3);
        r2 = r5.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.LayoutParams) r2;
        r2.f1818f = r3;
        r6 = r2.f1813a;
        if (r6 != 0) goto L_0x02bf;
    L_0x02a8:
        r6 = r2.f1815c;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x02bf;
    L_0x02af:
        r0 = r17;
        r5 = r0.m1575a(r5);
        if (r5 == 0) goto L_0x02bf;
    L_0x02b7:
        r6 = r5.f1825d;
        r2.f1815c = r6;
        r5 = r5.f1823b;
        r2.f1817e = r5;
    L_0x02bf:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x0294;
    L_0x02c3:
        r2 = 0;
        goto L_0x0280;
    L_0x02c5:
        r17.m1589c();
        r2 = r17.hasFocus();
        if (r2 == 0) goto L_0x0023;
    L_0x02ce:
        r2 = r17.findFocus();
        if (r2 == 0) goto L_0x030b;
    L_0x02d4:
        r0 = r17;
        r2 = r0.m1588b(r2);
    L_0x02da:
        if (r2 == 0) goto L_0x02e4;
    L_0x02dc:
        r2 = r2.f1823b;
        r0 = r17;
        r3 = r0.f1856c;
        if (r2 == r3) goto L_0x0023;
    L_0x02e4:
        r2 = 0;
    L_0x02e5:
        r3 = r17.getChildCount();
        if (r2 >= r3) goto L_0x0023;
    L_0x02eb:
        r0 = r17;
        r3 = r0.getChildAt(r2);
        r0 = r17;
        r4 = r0.m1575a(r3);
        if (r4 == 0) goto L_0x0308;
    L_0x02f9:
        r4 = r4.f1823b;
        r0 = r17;
        r5 = r0.f1856c;
        if (r4 != r5) goto L_0x0308;
    L_0x0301:
        r4 = 2;
        r3 = r3.requestFocus(r4);
        if (r3 != 0) goto L_0x0023;
    L_0x0308:
        r2 = r2 + 1;
        goto L_0x02e5;
    L_0x030b:
        r2 = 0;
        goto L_0x02da;
    L_0x030d:
        r15 = r5;
        r5 = r2;
        r2 = r15;
        goto L_0x020f;
    L_0x0312:
        r9 = r2;
        goto L_0x00fd;
    L_0x0315:
        r2 = r5;
        goto L_0x00ee;
    L_0x0318:
        r3 = r2;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    private void m1577a(int i, float f) {
        int paddingLeft;
        int paddingRight;
        if (this.aa > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                int i3;
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1813a) {
                    int max;
                    switch (layoutParams.f1814b & 7) {
                        case 1:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                        case 3:
                            max = childAt.getWidth() + paddingLeft;
                            i3 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i3;
                            break;
                        case 5:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i3 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                        default:
                            max = paddingLeft;
                            i3 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i3;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i3 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i3;
                }
                i2++;
                i3 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i3;
            }
        }
        if (this.ab != null) {
            this.ab.mo169a(i, f);
        }
        if (this.f1857d != null) {
            paddingRight = this.f1857d.size();
            for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                C0204e c0204e = (C0204e) this.f1857d.get(paddingLeft);
                if (c0204e != null) {
                    c0204e.mo169a(i, f);
                }
            }
        }
        if (this.ac != null) {
            this.ac.mo169a(i, f);
        }
        if (this.ae != null) {
            getScrollX();
            paddingRight = getChildCount();
            for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((LayoutParams) childAt2.getLayoutParams()).f1813a) {
                    childAt2.getLeft();
                    getClientWidth();
                }
            }
        }
        this.f1854W = true;
    }

    private void m1578a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f1859h.isEmpty()) {
            C0601b b = m1587b(this.f1856c);
            int min = (int) ((b != null ? Math.min(b.f1826e, this.f1873v) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m1584a(false);
                scrollTo(min, getScrollY());
            }
        } else if (this.f1865n.isFinished()) {
            scrollTo((int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)))), getScrollY());
        } else {
            this.f1865n.setFinalX(getCurrentItem() * getClientWidth());
        }
    }

    private void m1579a(int i, boolean z, int i2, boolean z2) {
        C0601b b = m1587b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f1872u, Math.min(b.f1826e, this.f1873v))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int currX;
                int i3;
                Object obj = (this.f1865n == null || this.f1865n.isFinished()) ? null : 1;
                if (obj != null) {
                    currX = this.f1866o ? this.f1865n.getCurrX() : this.f1865n.getStartX();
                    this.f1865n.abortAnimation();
                    setScrollingCacheEnabled(false);
                    i3 = currX;
                } else {
                    i3 = getScrollX();
                }
                int scrollY = getScrollY();
                clientWidth -= i3;
                int i4 = 0 - scrollY;
                if (clientWidth == 0 && i4 == 0) {
                    m1584a(false);
                    m1601b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    currX = getClientWidth();
                    int i5 = currX / 2;
                    float sin = (((float) i5) * ((float) Math.sin((double) ((Math.min(1.0f, (1.0f * ((float) Math.abs(clientWidth))) / ((float) currX)) - 0.5f) * 0.47123894f)))) + ((float) i5);
                    int abs = Math.abs(i2);
                    i5 = Math.min(abs > 0 ? Math.round(1000.0f * Math.abs(sin / ((float) abs))) * 4 : (int) (((((float) Math.abs(clientWidth)) / ((((float) currX) * this.f1855b.getPageWidth(this.f1856c)) + ((float) this.f1868q))) + 1.0f) * 100.0f), 600);
                    this.f1866o = false;
                    this.f1865n.startScroll(i3, scrollY, clientWidth, i4, i5);
                    C0679r.m1928c(this);
                }
            }
            if (z2) {
                m1591d(i);
                return;
            }
            return;
        }
        if (z2) {
            m1591d(i);
        }
        m1584a(false);
        scrollTo(clientWidth, 0);
        m1590c(clientWidth);
    }

    private void m1580a(int i, boolean z, boolean z2) {
        m1581a(i, z, z2, 0);
    }

    private void m1581a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f1855b == null || this.f1855b.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f1856c != i || this.f1859h.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f1855b.getCount()) {
                i = this.f1855b.getCount() - 1;
            }
            int i3 = this.f1833B;
            if (i > this.f1856c + i3 || i < this.f1856c - i3) {
                for (int i4 = 0; i4 < this.f1859h.size(); i4++) {
                    ((C0601b) this.f1859h.get(i4)).f1824c = true;
                }
            }
            if (this.f1856c != i) {
                z3 = true;
            }
            if (this.f1852U) {
                this.f1856c = i;
                if (z3) {
                    m1591d(i);
                }
                requestLayout();
                return;
            }
            m1576a(i);
            m1579a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void m1582a(C0601b c0601b, int i, C0601b c0601b2) {
        float f;
        int i2;
        C0601b c0601b3;
        int i3;
        int count = this.f1855b.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.f1868q) / ((float) clientWidth) : 0.0f;
        if (c0601b2 != null) {
            clientWidth = c0601b2.f1823b;
            int i4;
            int i5;
            float f3;
            int i6;
            float pageWidth;
            if (clientWidth < c0601b.f1823b) {
                f = (c0601b2.f1826e + c0601b2.f1825d) + f2;
                i4 = 0;
                i2 = clientWidth + 1;
                while (i2 <= c0601b.f1823b && i4 < this.f1859h.size()) {
                    c0601b3 = (C0601b) this.f1859h.get(i4);
                    while (i2 > c0601b3.f1823b && i4 < this.f1859h.size() - 1) {
                        i4++;
                        c0601b3 = (C0601b) this.f1859h.get(i4);
                    }
                    i5 = i2;
                    f3 = f;
                    i6 = i5;
                    while (i6 < c0601b3.f1823b) {
                        pageWidth = (this.f1855b.getPageWidth(i6) + f2) + f3;
                        i6++;
                        f3 = pageWidth;
                    }
                    c0601b3.f1826e = f3;
                    f3 += c0601b3.f1825d + f2;
                    clientWidth = i6 + 1;
                    f = f3;
                    i2 = clientWidth;
                }
            } else if (clientWidth > c0601b.f1823b) {
                i4 = this.f1859h.size() - 1;
                f = c0601b2.f1826e;
                i2 = clientWidth - 1;
                while (i2 >= c0601b.f1823b && i4 >= 0) {
                    c0601b3 = (C0601b) this.f1859h.get(i4);
                    while (i2 < c0601b3.f1823b && i4 > 0) {
                        i4--;
                        c0601b3 = (C0601b) this.f1859h.get(i4);
                    }
                    i5 = i2;
                    f3 = f;
                    i6 = i5;
                    while (i6 > c0601b3.f1823b) {
                        pageWidth = f3 - (this.f1855b.getPageWidth(i6) + f2);
                        i6--;
                        f3 = pageWidth;
                    }
                    f3 -= c0601b3.f1825d + f2;
                    c0601b3.f1826e = f3;
                    clientWidth = i6 - 1;
                    f = f3;
                    i2 = clientWidth;
                }
            }
        }
        int size = this.f1859h.size();
        f = c0601b.f1826e;
        i2 = c0601b.f1823b - 1;
        this.f1872u = c0601b.f1823b == 0 ? c0601b.f1826e : -3.4028235E38f;
        this.f1873v = c0601b.f1823b == count + -1 ? (c0601b.f1826e + c0601b.f1825d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            c0601b3 = (C0601b) this.f1859h.get(i3);
            float f4 = f;
            while (i2 > c0601b3.f1823b) {
                f4 -= this.f1855b.getPageWidth(i2) + f2;
                i2--;
            }
            f = f4 - (c0601b3.f1825d + f2);
            c0601b3.f1826e = f;
            if (c0601b3.f1823b == 0) {
                this.f1872u = f;
            }
            i2--;
        }
        f = (c0601b.f1826e + c0601b.f1825d) + f2;
        i2 = c0601b.f1823b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            c0601b3 = (C0601b) this.f1859h.get(i3);
            f4 = f;
            while (i2 < c0601b3.f1823b) {
                f4 = (this.f1855b.getPageWidth(i2) + f2) + f4;
                i2++;
            }
            if (c0601b3.f1823b == count - 1) {
                this.f1873v = (c0601b3.f1825d + f4) - 1.0f;
            }
            c0601b3.f1826e = f4;
            f = f4 + (c0601b3.f1825d + f2);
            i2++;
        }
        this.f1853V = false;
    }

    private void m1583a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1843L) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f1839H = motionEvent.getX(actionIndex);
            this.f1843L = motionEvent.getPointerId(actionIndex);
            if (this.f1844M != null) {
                this.f1844M.clear();
            }
        }
    }

    private void m1584a(boolean z) {
        int scrollX;
        boolean z2 = this.ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f1865n.isFinished()) {
                this.f1865n.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1865n.getCurrX();
                int currY = this.f1865n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m1590c(currX);
                    }
                }
            }
        }
        this.f1832A = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.f1859h.size(); scrollX++) {
            C0601b c0601b = (C0601b) this.f1859h.get(scrollX);
            if (c0601b.f1824c) {
                c0601b.f1824c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0679r.m1916a((View) this, this.aj);
        } else {
            this.aj.run();
        }
    }

    private boolean m1585a(float f) {
        float f2;
        boolean z = true;
        float f3 = this.f1839H - f;
        this.f1839H = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.f1872u;
        float f5 = ((float) clientWidth) * this.f1873v;
        C0601b c0601b = (C0601b) this.f1859h.get(0);
        C0601b c0601b2 = (C0601b) this.f1859h.get(this.f1859h.size() - 1);
        if (c0601b.f1823b != 0) {
            f4 = c0601b.f1826e * ((float) clientWidth);
            int i = 0;
        } else {
            boolean z2 = true;
        }
        if (c0601b2.f1823b != this.f1855b.getCount() - 1) {
            f2 = c0601b2.f1826e * ((float) clientWidth);
            int i2 = 0;
        } else {
            f2 = f5;
            boolean z3 = true;
        }
        if (scrollX < f4) {
            if (i != 0) {
                this.f1850S.onPull(Math.abs(f4 - scrollX) / ((float) clientWidth));
            } else {
                z = false;
            }
        } else if (scrollX > f2) {
            if (i2 != 0) {
                this.f1851T.onPull(Math.abs(scrollX - f2) / ((float) clientWidth));
            } else {
                z = false;
            }
            f4 = f2;
        } else {
            f4 = scrollX;
            z = false;
        }
        this.f1839H += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        m1590c((int) f4);
        return z;
    }

    private boolean m1586a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m1586a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private C0601b m1587b(int i) {
        for (int i2 = 0; i2 < this.f1859h.size(); i2++) {
            C0601b c0601b = (C0601b) this.f1859h.get(i2);
            if (c0601b.f1823b == i) {
                return c0601b;
            }
        }
        return null;
    }

    private C0601b m1588b(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return m1575a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    private void m1589c() {
        if (this.ag != 0) {
            if (this.ah == null) {
                this.ah = new ArrayList();
            } else {
                this.ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ah.add(getChildAt(i));
            }
            Collections.sort(this.ah, ai);
        }
    }

    private boolean m1590c(int i) {
        if (this.f1859h.size() != 0) {
            C0601b f = m1595f();
            int clientWidth = getClientWidth();
            float f2 = ((float) this.f1868q) / ((float) clientWidth);
            int i2 = f.f1823b;
            float f3 = ((((float) i) / ((float) clientWidth)) - f.f1826e) / (f.f1825d + f2);
            this.f1854W = false;
            m1577a(i2, f3);
            if (this.f1854W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f1852U) {
            return false;
        } else {
            this.f1854W = false;
            m1577a(0, 0.0f);
            if (this.f1854W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private void m1591d(int i) {
        if (this.ab != null) {
            this.ab.mo170b(i);
        }
        if (this.f1857d != null) {
            int size = this.f1857d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0204e c0204e = (C0204e) this.f1857d.get(i2);
                if (c0204e != null) {
                    c0204e.mo170b(i);
                }
            }
        }
        if (this.ac != null) {
            this.ac.mo170b(i);
        }
    }

    private boolean m1592d() {
        this.f1843L = -1;
        this.f1834C = false;
        this.f1835D = false;
        if (this.f1844M != null) {
            this.f1844M.recycle();
            this.f1844M = null;
        }
        this.f1850S.onRelease();
        this.f1851T.onRelease();
        return this.f1850S.isFinished() || this.f1851T.isFinished();
    }

    private void m1593e() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1594e(int r10) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 66;
        r7 = 17;
        r4 = 1;
        r3 = 0;
        r2 = r9.findFocus();
        if (r2 != r9) goto L_0x003e;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r1 = android.view.FocusFinder.getInstance();
        r1 = r1.findNextFocus(r9, r0, r10);
        if (r1 == 0) goto L_0x00b1;
    L_0x0018:
        if (r1 == r0) goto L_0x00b1;
    L_0x001a:
        if (r10 != r7) goto L_0x0096;
    L_0x001c:
        r2 = r9.f1861j;
        r2 = r9.m1573a(r2, r1);
        r2 = r2.left;
        r3 = r9.f1861j;
        r3 = r9.m1573a(r3, r0);
        r3 = r3.left;
        if (r0 == 0) goto L_0x0091;
    L_0x002e:
        if (r2 < r3) goto L_0x0091;
    L_0x0030:
        r0 = r9.m1596g();
    L_0x0034:
        if (r0 == 0) goto L_0x003d;
    L_0x0036:
        r1 = android.view.SoundEffectConstants.getContantForFocusDirection(r10);
        r9.playSoundEffect(r1);
    L_0x003d:
        return r0;
    L_0x003e:
        if (r2 == 0) goto L_0x00c9;
    L_0x0040:
        r0 = r2.getParent();
    L_0x0044:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x00cc;
    L_0x0048:
        if (r0 != r9) goto L_0x007b;
    L_0x004a:
        r0 = r4;
    L_0x004b:
        if (r0 != 0) goto L_0x00c9;
    L_0x004d:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r2.getClass();
        r0 = r0.getSimpleName();
        r5.append(r0);
        r0 = r2.getParent();
    L_0x0061:
        r2 = r0 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x0080;
    L_0x0065:
        r2 = " => ";
        r2 = r5.append(r2);
        r6 = r0.getClass();
        r6 = r6.getSimpleName();
        r2.append(r6);
        r0 = r0.getParent();
        goto L_0x0061;
    L_0x007b:
        r0 = r0.getParent();
        goto L_0x0044;
    L_0x0080:
        r0 = new java.lang.StringBuilder;
        r2 = "arrowScroll tried to find focus based on non-child current focused view ";
        r0.<init>(r2);
        r2 = r5.toString();
        r0.append(r2);
        r0 = r1;
        goto L_0x000e;
    L_0x0091:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x0096:
        if (r10 != r8) goto L_0x00c6;
    L_0x0098:
        r2 = r9.f1861j;
        r2 = r9.m1573a(r2, r1);
        r2 = r2.left;
        r3 = r9.f1861j;
        r3 = r9.m1573a(r3, r0);
        r3 = r3.left;
        if (r0 == 0) goto L_0x00ac;
    L_0x00aa:
        if (r2 <= r3) goto L_0x00c0;
    L_0x00ac:
        r0 = r1.requestFocus();
        goto L_0x0034;
    L_0x00b1:
        if (r10 == r7) goto L_0x00b5;
    L_0x00b3:
        if (r10 != r4) goto L_0x00bb;
    L_0x00b5:
        r0 = r9.m1596g();
        goto L_0x0034;
    L_0x00bb:
        if (r10 == r8) goto L_0x00c0;
    L_0x00bd:
        r0 = 2;
        if (r10 != r0) goto L_0x00c6;
    L_0x00c0:
        r0 = r9.m1597h();
        goto L_0x0034;
    L_0x00c6:
        r0 = r3;
        goto L_0x0034;
    L_0x00c9:
        r0 = r2;
        goto L_0x000e;
    L_0x00cc:
        r0 = r3;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.e(int):boolean");
    }

    private C0601b m1595f() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f1868q) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        C0601b c0601b = null;
        while (i2 < this.f1859h.size()) {
            int i3;
            C0601b c0601b2;
            C0601b c0601b3 = (C0601b) this.f1859h.get(i2);
            C0601b c0601b4;
            if (obj != null || c0601b3.f1823b == i + 1) {
                c0601b4 = c0601b3;
                i3 = i2;
                c0601b2 = c0601b4;
            } else {
                c0601b3 = this.f1860i;
                c0601b3.f1826e = (f2 + f3) + f;
                c0601b3.f1823b = i + 1;
                c0601b3.f1825d = this.f1855b.getPageWidth(c0601b3.f1823b);
                c0601b4 = c0601b3;
                i3 = i2 - 1;
                c0601b2 = c0601b4;
            }
            f2 = c0601b2.f1826e;
            f3 = (c0601b2.f1825d + f2) + f;
            if (obj == null && scrollX < f2) {
                return c0601b;
            }
            if (scrollX < f3 || i3 == this.f1859h.size() - 1) {
                return c0601b2;
            }
            f3 = f2;
            i = c0601b2.f1823b;
            obj = null;
            f2 = c0601b2.f1825d;
            c0601b = c0601b2;
            i2 = i3 + 1;
        }
        return c0601b;
    }

    private boolean m1596g() {
        if (this.f1856c <= 0) {
            return false;
        }
        setCurrentItem$2563266(this.f1856c - 1);
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean m1597h() {
        if (this.f1855b == null || this.f1856c >= this.f1855b.getCount() - 1) {
            return false;
        }
        setCurrentItem$2563266(this.f1856c + 1);
        return true;
    }

    private void setCurrentItem$2563266(int i) {
        this.f1832A = false;
        m1580a(i, true, false);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1877z != z) {
            this.f1877z = z;
        }
    }

    final C0204e m1598a(C0204e c0204e) {
        C0204e c0204e2 = this.ac;
        this.ac = c0204e;
        return c0204e2;
    }

    final void m1599a() {
        int count = this.f1855b.getCount();
        this.f1858e = count;
        boolean z = this.f1859h.size() < (this.f1833B * 2) + 1 && this.f1859h.size() < count;
        boolean z2 = false;
        int i = this.f1856c;
        boolean z3 = z;
        int i2 = 0;
        while (i2 < this.f1859h.size()) {
            int i3;
            boolean z4;
            int max;
            boolean z5;
            C0601b c0601b = (C0601b) this.f1859h.get(i2);
            int itemPosition = this.f1855b.getItemPosition(c0601b.f1822a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f1859h.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f1855b.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f1855b.destroyItem((ViewGroup) this, c0601b.f1823b, c0601b.f1822a);
                    if (this.f1856c == c0601b.f1823b) {
                        i3 = i2;
                        z4 = z2;
                        max = Math.max(0, Math.min(this.f1856c, count - 1));
                        z5 = true;
                    } else {
                        i3 = i2;
                        z4 = z2;
                        max = i;
                        z5 = true;
                    }
                } else if (c0601b.f1823b != itemPosition) {
                    if (c0601b.f1823b == this.f1856c) {
                        i = itemPosition;
                    }
                    c0601b.f1823b = itemPosition;
                    i3 = i2;
                    z4 = z2;
                    max = i;
                    z5 = true;
                }
                z3 = z5;
                i = max;
                z2 = z4;
                i2 = i3 + 1;
            }
            i3 = i2;
            z4 = z2;
            max = i;
            z5 = z3;
            z3 = z5;
            i = max;
            z2 = z4;
            i2 = i3 + 1;
        }
        if (z2) {
            this.f1855b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f1859h, f1830f);
        if (z3) {
            max = getChildCount();
            for (i2 = 0; i2 < max; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.f1813a) {
                    layoutParams.f1815c = 0.0f;
                }
            }
            m1580a(i, false, true);
            requestLayout();
        }
    }

    public final void m1600a(C0196d c0196d) {
        if (this.ad == null) {
            this.ad = new ArrayList();
        }
        this.ad.add(c0196d);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0601b a = m1575a(childAt);
                    if (a != null && a.f1823b == this.f1856c) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0601b a = m1575a(childAt);
                if (a != null && a.f1823b == this.f1856c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) generateLayoutParams;
        layoutParams2.f1813a = (view.getClass().getAnnotation(C0600a.class) != null ? 1 : 0) | layoutParams2.f1813a;
        if (!this.f1876y) {
            super.addView(view, i, generateLayoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f1813a) {
            layoutParams2.f1816d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    final void m1601b() {
        m1576a(this.f1856c);
    }

    public final void m1602b(C0196d c0196d) {
        if (this.ad != null) {
            this.ad.remove(c0196d);
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f1855b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f1872u)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1873v));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f1866o = true;
        if (this.f1865n.isFinished() || !this.f1865n.computeScrollOffset()) {
            m1584a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1865n.getCurrX();
        int currY = this.f1865n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m1590c(currX)) {
                this.f1865n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0679r.m1928c(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
        r4 = this;
        r0 = 0;
        r3 = 2;
        r1 = 1;
        r2 = super.dispatchKeyEvent(r5);
        if (r2 != 0) goto L_0x0019;
    L_0x0009:
        r2 = r5.getAction();
        if (r2 != 0) goto L_0x0016;
    L_0x000f:
        r2 = r5.getKeyCode();
        switch(r2) {
            case 21: goto L_0x001b;
            case 22: goto L_0x002d;
            case 61: goto L_0x003f;
            default: goto L_0x0016;
        };
    L_0x0016:
        r2 = r0;
    L_0x0017:
        if (r2 == 0) goto L_0x001a;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        return r0;
    L_0x001b:
        r2 = r5.hasModifiers(r3);
        if (r2 == 0) goto L_0x0026;
    L_0x0021:
        r2 = r4.m1596g();
        goto L_0x0017;
    L_0x0026:
        r2 = 17;
        r2 = r4.m1594e(r2);
        goto L_0x0017;
    L_0x002d:
        r2 = r5.hasModifiers(r3);
        if (r2 == 0) goto L_0x0038;
    L_0x0033:
        r2 = r4.m1597h();
        goto L_0x0017;
    L_0x0038:
        r2 = 66;
        r2 = r4.m1594e(r2);
        goto L_0x0017;
    L_0x003f:
        r2 = r5.hasNoModifiers();
        if (r2 == 0) goto L_0x004a;
    L_0x0045:
        r2 = r4.m1594e(r3);
        goto L_0x0017;
    L_0x004a:
        r2 = r5.hasModifiers(r1);
        if (r2 == 0) goto L_0x0016;
    L_0x0050:
        r2 = r4.m1594e(r1);
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0601b a = m1575a(childAt);
                if (a != null && a.f1823b == this.f1856c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f1855b != null && this.f1855b.getCount() > 1)) {
            int width;
            if (!this.f1850S.isFinished()) {
                overScrollMode = canvas.save();
                i = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-i) + getPaddingTop()), this.f1872u * ((float) width));
                this.f1850S.setSize(i, width);
                i = this.f1850S.draw(canvas) | 0;
                canvas.restoreToCount(overScrollMode);
            }
            if (!this.f1851T.isFinished()) {
                overScrollMode = canvas.save();
                width = getWidth();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f1873v + 1.0f)) * ((float) width));
                this.f1851T.setSize(height, width);
                i |= this.f1851T.draw(canvas);
                canvas.restoreToCount(overScrollMode);
            }
        } else {
            this.f1850S.finish();
            this.f1851T.finish();
        }
        if (i != 0) {
            C0679r.m1928c(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1869r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0404o getAdapter() {
        return this.f1855b;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.ah.get(i2)).getLayoutParams()).f1818f;
    }

    public int getCurrentItem() {
        return this.f1856c;
    }

    public int getOffscreenPageLimit() {
        return this.f1833B;
    }

    public int getPageMargin() {
        return this.f1868q;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1852U = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.aj);
        if (!(this.f1865n == null || this.f1865n.isFinished())) {
            this.f1865n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1868q > 0 && this.f1869r != null && this.f1859h.size() > 0 && this.f1855b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.f1868q) / ((float) width);
            C0601b c0601b = (C0601b) this.f1859h.get(0);
            float f2 = c0601b.f1826e;
            int size = this.f1859h.size();
            int i = c0601b.f1823b;
            int i2 = ((C0601b) this.f1859h.get(size - 1)).f1823b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > c0601b.f1823b && i3 < size) {
                    i3++;
                    c0601b = (C0601b) this.f1859h.get(i3);
                }
                if (i4 == c0601b.f1823b) {
                    f3 = (c0601b.f1826e + c0601b.f1825d) * ((float) width);
                    f2 = (c0601b.f1826e + c0601b.f1825d) + f;
                } else {
                    float pageWidth = this.f1855b.getPageWidth(i4);
                    f3 = (f2 + pageWidth) * ((float) width);
                    f2 += pageWidth + f;
                }
                if (((float) this.f1868q) + f3 > ((float) scrollX)) {
                    this.f1869r.setBounds(Math.round(f3), this.f1870s, Math.round(((float) this.f1868q) + f3), this.f1871t);
                    this.f1869r.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m1592d();
            return false;
        }
        if (action != 0) {
            if (this.f1834C) {
                return true;
            }
            if (this.f1835D) {
                return false;
            }
        }
        float x;
        switch (action) {
            case 0:
                x = motionEvent.getX();
                this.f1841J = x;
                this.f1839H = x;
                x = motionEvent.getY();
                this.f1842K = x;
                this.f1840I = x;
                this.f1843L = motionEvent.getPointerId(0);
                this.f1835D = false;
                this.f1866o = true;
                this.f1865n.computeScrollOffset();
                if (this.ak == 2 && Math.abs(this.f1865n.getFinalX() - this.f1865n.getCurrX()) > this.f1848Q) {
                    this.f1865n.abortAnimation();
                    this.f1832A = false;
                    m1601b();
                    this.f1834C = true;
                    m1593e();
                    setScrollState(1);
                    break;
                }
                m1584a(false);
                this.f1834C = false;
                break;
                break;
            case 2:
                action = this.f1843L;
                if (action != -1) {
                    action = motionEvent.findPointerIndex(action);
                    float x2 = motionEvent.getX(action);
                    float f = x2 - this.f1839H;
                    float abs = Math.abs(f);
                    float y = motionEvent.getY(action);
                    float abs2 = Math.abs(y - this.f1842K);
                    if (f != 0.0f) {
                        x = this.f1839H;
                        boolean z = (x < ((float) this.f1837F) && f > 0.0f) || (x > ((float) (getWidth() - this.f1837F)) && f < 0.0f);
                        if (!z && m1586a(this, false, (int) f, (int) x2, (int) y)) {
                            this.f1839H = x2;
                            this.f1840I = y;
                            this.f1835D = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.f1838G) && 0.5f * abs > abs2) {
                        this.f1834C = true;
                        m1593e();
                        setScrollState(1);
                        this.f1839H = f > 0.0f ? this.f1841J + ((float) this.f1838G) : this.f1841J - ((float) this.f1838G);
                        this.f1840I = y;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.f1838G)) {
                        this.f1835D = true;
                    }
                    if (this.f1834C && m1585a(x2)) {
                        C0679r.m1928c(this);
                        break;
                    }
                }
                break;
            case 6:
                m1583a(motionEvent);
                break;
        }
        if (this.f1844M == null) {
            this.f1844M = VelocityTracker.obtain();
        }
        this.f1844M.addMovement(motionEvent);
        return this.f1834C;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            LayoutParams layoutParams;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1813a) {
                    int i9 = layoutParams.f1814b & 112;
                    switch (layoutParams.f1814b & 7) {
                        case 1:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case 48:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case 80:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams.f1813a) {
                    C0601b a = m1575a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.f1826e * ((float) max))) + paddingLeft;
                        if (layoutParams.f1816d) {
                            layoutParams.f1816d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f1815c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f1870s = paddingTop;
        this.f1871t = i6 - paddingBottom;
        this.aa = i7;
        if (this.f1852U) {
            m1579a(this.f1856c, false, 0, false);
        }
        this.f1852U = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1837F = Math.min(measuredWidth / 10, this.f1836E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams;
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f1813a) {
                    int i6 = layoutParams.f1814b & 7;
                    int i7 = layoutParams.f1814b & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (layoutParams.width != -2) {
                        i7 = 1073741824;
                        i3 = layoutParams.width != -1 ? layoutParams.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (layoutParams.height != -2) {
                        i5 = 1073741824;
                        if (layoutParams.height != -1) {
                            measuredWidth = layoutParams.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.f1874w = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f1875x = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f1876y = true;
        m1601b();
        this.f1876y = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams == null || !layoutParams.f1813a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (layoutParams.f1815c * ((float) paddingLeft)), 1073741824), this.f1875x);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                C0601b a = m1575a(childAt);
                if (a != null && a.f1823b == this.f1856c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.f1855b != null) {
                this.f1855b.restoreState(savedState.f1820b, savedState.f1821c);
                m1580a(savedState.f1819a, false, true);
                return;
            }
            this.f1862k = savedState.f1819a;
            this.f1863l = savedState.f1820b;
            this.f1864m = savedState.f1821c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1819a = this.f1856c;
        if (this.f1855b != null) {
            savedState.f1820b = this.f1855b.saveState();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m1578a(i, i3, this.f1868q, this.f1868q);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f1849R) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f1855b == null || this.f1855b.getCount() == 0) {
            return false;
        }
        if (this.f1844M == null) {
            this.f1844M = VelocityTracker.obtain();
        }
        this.f1844M.addMovement(motionEvent);
        float x;
        int i;
        float f;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f1865n.abortAnimation();
                this.f1832A = false;
                m1601b();
                x = motionEvent.getX();
                this.f1841J = x;
                this.f1839H = x;
                x = motionEvent.getY();
                this.f1842K = x;
                this.f1840I = x;
                this.f1843L = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f1834C) {
                    VelocityTracker velocityTracker = this.f1844M;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f1846O);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f1843L);
                    this.f1832A = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0601b f2 = m1595f();
                    float f3 = ((float) this.f1868q) / ((float) clientWidth);
                    i = f2.f1823b;
                    f = ((((float) scrollX) / ((float) clientWidth)) - f2.f1826e) / (f2.f1825d + f3);
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1843L)) - this.f1841J)) <= this.f1847P || Math.abs(xVelocity) <= this.f1845N) {
                        scrollX = i + ((int) ((i >= this.f1856c ? 0.4f : 0.6f) + f));
                    } else {
                        if (xVelocity <= 0) {
                            i++;
                        }
                        scrollX = i;
                    }
                    if (this.f1859h.size() > 0) {
                        scrollX = Math.max(((C0601b) this.f1859h.get(0)).f1823b, Math.min(scrollX, ((C0601b) this.f1859h.get(this.f1859h.size() - 1)).f1823b));
                    }
                    m1581a(scrollX, true, true, xVelocity);
                    z = m1592d();
                    break;
                }
                break;
            case 2:
                if (!this.f1834C) {
                    i = motionEvent.findPointerIndex(this.f1843L);
                    if (i == -1) {
                        z = m1592d();
                        break;
                    }
                    float x2 = motionEvent.getX(i);
                    f = Math.abs(x2 - this.f1839H);
                    float y = motionEvent.getY(i);
                    x = Math.abs(y - this.f1840I);
                    if (f > ((float) this.f1838G) && f > x) {
                        this.f1834C = true;
                        m1593e();
                        this.f1839H = x2 - this.f1841J > 0.0f ? this.f1841J + ((float) this.f1838G) : this.f1841J - ((float) this.f1838G);
                        this.f1840I = y;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f1834C) {
                    z = m1585a(motionEvent.getX(motionEvent.findPointerIndex(this.f1843L))) | 0;
                    break;
                }
                break;
            case 3:
                if (this.f1834C) {
                    m1579a(this.f1856c, true, 0, false);
                    z = m1592d();
                    break;
                }
                break;
            case 5:
                i = motionEvent.getActionIndex();
                this.f1839H = motionEvent.getX(i);
                this.f1843L = motionEvent.getPointerId(i);
                break;
            case 6:
                m1583a(motionEvent);
                this.f1839H = motionEvent.getX(motionEvent.findPointerIndex(this.f1843L));
                break;
        }
        if (z) {
            C0679r.m1928c(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f1876y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0404o c0404o) {
        int i = false;
        if (this.f1855b != null) {
            int i2;
            this.f1855b.setViewPagerObserver(null);
            this.f1855b.startUpdate((ViewGroup) this);
            for (i2 = 0; i2 < this.f1859h.size(); i2++) {
                C0601b c0601b = (C0601b) this.f1859h.get(i2);
                this.f1855b.destroyItem((ViewGroup) this, c0601b.f1823b, c0601b.f1822a);
            }
            this.f1855b.finishUpdate((ViewGroup) this);
            this.f1859h.clear();
            i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f1813a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f1856c = 0;
            scrollTo(0, 0);
        }
        C0404o c0404o2 = this.f1855b;
        this.f1855b = c0404o;
        this.f1858e = 0;
        if (this.f1855b != null) {
            if (this.f1867p == null) {
                this.f1867p = new C0604g(this);
            }
            this.f1855b.setViewPagerObserver(this.f1867p);
            this.f1832A = false;
            boolean z = this.f1852U;
            this.f1852U = true;
            this.f1858e = this.f1855b.getCount();
            if (this.f1862k >= 0) {
                this.f1855b.restoreState(this.f1863l, this.f1864m);
                m1580a(this.f1862k, false, true);
                this.f1862k = -1;
                this.f1863l = null;
                this.f1864m = null;
            } else if (z) {
                requestLayout();
            } else {
                m1601b();
            }
        }
        if (this.ad != null && !this.ad.isEmpty()) {
            int size = this.ad.size();
            while (i < size) {
                ((C0196d) this.ad.get(i)).mo167a(this, c0404o2, c0404o);
                i++;
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f1832A = false;
        m1580a(i, !this.f1852U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f1833B) {
            this.f1833B = i;
            m1601b();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0204e c0204e) {
        this.ab = c0204e;
    }

    public void setPageMargin(int i) {
        int i2 = this.f1868q;
        this.f1868q = i;
        int width = getWidth();
        m1578a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0392a.getDrawable(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1869r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        int i2 = 0;
        if (this.ak != i) {
            this.ak = i;
            if (this.ae != null) {
                int i3 = i != 0 ? 1 : 0;
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    getChildAt(i4).setLayerType(i3 != 0 ? this.af : 0, null);
                }
            }
            if (this.ab != null) {
                this.ab.mo168a(i);
            }
            if (this.f1857d != null) {
                int size = this.f1857d.size();
                while (i2 < size) {
                    C0204e c0204e = (C0204e) this.f1857d.get(i2);
                    if (c0204e != null) {
                        c0204e.mo168a(i);
                    }
                    i2++;
                }
            }
            if (this.ac != null) {
                this.ac.mo168a(i);
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1869r;
    }
}
