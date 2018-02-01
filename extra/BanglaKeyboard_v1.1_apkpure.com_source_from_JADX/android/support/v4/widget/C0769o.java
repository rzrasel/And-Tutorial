package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.C0679r;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public final class C0769o {
    private static final Interpolator f2268v = new C07671();
    int f2269a;
    public int f2270b;
    float[] f2271c;
    float[] f2272d;
    float[] f2273e;
    float[] f2274f;
    float f2275g;
    int f2276h;
    int f2277i;
    View f2278j;
    private int f2279k = -1;
    private int[] f2280l;
    private int[] f2281m;
    private int[] f2282n;
    private int f2283o;
    private VelocityTracker f2284p;
    private float f2285q;
    private OverScroller f2286r;
    private final C0161a f2287s;
    private boolean f2288t;
    private final ViewGroup f2289u;
    private final Runnable f2290w = new C07682(this);

    public static abstract class C0161a {
        public int mo113a() {
            return 0;
        }

        public int mo165a(View view) {
            return 0;
        }

        public void mo114a(int i) {
        }

        public void mo702a(int i, int i2) {
        }

        public void mo115a(View view, float f, float f2) {
        }

        public abstract boolean mo116a(View view, int i);

        public void mo117b(View view, int i) {
        }

        public int mo118c(View view, int i) {
            return 0;
        }

        public int mo119d(View view, int i) {
            return 0;
        }

        public void mo703d() {
        }

        public void mo166e(View view, int i) {
        }
    }

    static class C07671 implements Interpolator {
        C07671() {
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    }

    class C07682 implements Runnable {
        final /* synthetic */ C0769o f2267a;

        C07682(C0769o c0769o) {
            this.f2267a = c0769o;
        }

        public final void run() {
            this.f2267a.m2218b(0);
        }
    }

    private C0769o(Context context, ViewGroup viewGroup, C0161a c0161a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (c0161a == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f2289u = viewGroup;
            this.f2287s = c0161a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2276h = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2270b = viewConfiguration.getScaledTouchSlop();
            this.f2285q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2275g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2286r = new OverScroller(context, f2268v);
        }
    }

    private static float m2193a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? 0.0f : abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private int m2194a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f2289u.getWidth();
        int i4 = width / 2;
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        return Math.min(i4 > 0 ? Math.round(Math.abs(sin / ((float) i4)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    public static C0769o m2195a(ViewGroup viewGroup, float f, C0161a c0161a) {
        C0769o a = C0769o.m2196a(viewGroup, c0161a);
        a.f2270b = (int) (((float) a.f2270b) * (1.0f / f));
        return a;
    }

    public static C0769o m2196a(ViewGroup viewGroup, C0161a c0161a) {
        return new C0769o(viewGroup.getContext(), viewGroup, c0161a);
    }

    private void m2197a(float f, float f2) {
        this.f2288t = true;
        this.f2287s.mo115a(this.f2278j, f, f2);
        this.f2288t = false;
        if (this.f2269a == 1) {
            m2218b(0);
        }
    }

    private void m2198a(float f, float f2, int i) {
        int i2 = 0;
        if (this.f2271c == null || this.f2271c.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f2271c != null) {
                System.arraycopy(this.f2271c, 0, obj, 0, this.f2271c.length);
                System.arraycopy(this.f2272d, 0, obj2, 0, this.f2272d.length);
                System.arraycopy(this.f2273e, 0, obj3, 0, this.f2273e.length);
                System.arraycopy(this.f2274f, 0, obj4, 0, this.f2274f.length);
                System.arraycopy(this.f2280l, 0, obj5, 0, this.f2280l.length);
                System.arraycopy(this.f2281m, 0, obj6, 0, this.f2281m.length);
                System.arraycopy(this.f2282n, 0, obj7, 0, this.f2282n.length);
            }
            this.f2271c = obj;
            this.f2272d = obj2;
            this.f2273e = obj3;
            this.f2274f = obj4;
            this.f2280l = obj5;
            this.f2281m = obj6;
            this.f2282n = obj7;
        }
        float[] fArr = this.f2271c;
        this.f2273e[i] = f;
        fArr[i] = f;
        fArr = this.f2272d;
        this.f2274f[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f2280l;
        int i3 = (int) f;
        int i4 = (int) f2;
        if (i3 < this.f2289u.getLeft() + this.f2276h) {
            i2 = 1;
        }
        if (i4 < this.f2289u.getTop() + this.f2276h) {
            i2 |= 4;
        }
        if (i3 > this.f2289u.getRight() - this.f2276h) {
            i2 |= 2;
        }
        if (i4 > this.f2289u.getBottom() - this.f2276h) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.f2283o |= 1 << i;
    }

    private boolean m2199a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        return ((this.f2280l[i] & i2) != i2 || (this.f2277i & i2) == 0 || (this.f2282n[i] & i2) == i2 || (this.f2281m[i] & i2) == i2) ? false : (abs > ((float) this.f2270b) || Math.abs(f2) > ((float) this.f2270b)) && (this.f2281m[i] & i2) == 0 && abs > ((float) this.f2270b);
    }

    private boolean m2200a(int i, int i2, int i3, int i4) {
        int left = this.f2278j.getLeft();
        int top = this.f2278j.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2286r.abortAnimation();
            m2218b(0);
            return false;
        }
        View view = this.f2278j;
        int b = C0769o.m2202b(i3, (int) this.f2275g, (int) this.f2285q);
        int b2 = C0769o.m2202b(i4, (int) this.f2275g, (int) this.f2285q);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        this.f2286r.startScroll(left, top, i5, i6, (int) (((b2 != 0 ? ((float) abs4) / ((float) i7) : ((float) abs2) / ((float) i8)) * ((float) m2194a(i6, b2, this.f2287s.mo113a()))) + ((b != 0 ? ((float) abs3) / ((float) i7) : ((float) abs) / ((float) i8)) * ((float) m2194a(i5, b, this.f2287s.mo165a(view))))));
        m2218b(2);
        return true;
    }

    private boolean m2201a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f2287s.mo165a(view) > 0;
        boolean z2 = this.f2287s.mo113a() > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f2270b * this.f2270b)) : z ? Math.abs(f) > ((float) this.f2270b) : z2 && Math.abs(f2) > ((float) this.f2270b);
    }

    private static int m2202b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        return abs < i2 ? 0 : abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private void m2203b(float f, float f2, int i) {
        int i2 = 1;
        if (!m2199a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2199a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2199a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2199a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f2281m;
            iArr[i] = iArr[i] | i2;
            this.f2287s.mo702a(i2, i);
        }
    }

    private boolean m2204b(View view, int i) {
        if (view == this.f2278j && this.f2279k == i) {
            return true;
        }
        if (view == null || !this.f2287s.mo116a(view, i)) {
            return false;
        }
        this.f2279k = i;
        m2211a(view, i);
        return true;
    }

    public static boolean m2205b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    private void m2206c(int i) {
        if (this.f2271c != null && m2212a(i)) {
            this.f2271c[i] = 0.0f;
            this.f2272d[i] = 0.0f;
            this.f2273e[i] = 0.0f;
            this.f2274f[i] = 0.0f;
            this.f2280l[i] = 0;
            this.f2281m[i] = 0;
            this.f2282n[i] = 0;
            this.f2283o &= (1 << i) ^ -1;
        }
    }

    private void m2207c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2209d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2273e[pointerId] = x;
                this.f2274f[pointerId] = y;
            }
        }
    }

    private void m2208d() {
        this.f2284p.computeCurrentVelocity(1000, this.f2285q);
        m2197a(C0769o.m2193a(this.f2284p.getXVelocity(this.f2279k), this.f2275g, this.f2285q), C0769o.m2193a(this.f2284p.getYVelocity(this.f2279k), this.f2275g, this.f2285q));
    }

    private boolean m2209d(int i) {
        if (m2212a(i)) {
            return true;
        }
        new StringBuilder("Ignoring pointerId=").append(i).append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void m2210a() {
        this.f2279k = -1;
        if (this.f2271c != null) {
            Arrays.fill(this.f2271c, 0.0f);
            Arrays.fill(this.f2272d, 0.0f);
            Arrays.fill(this.f2273e, 0.0f);
            Arrays.fill(this.f2274f, 0.0f);
            Arrays.fill(this.f2280l, 0);
            Arrays.fill(this.f2281m, 0);
            Arrays.fill(this.f2282n, 0);
            this.f2283o = 0;
        }
        if (this.f2284p != null) {
            this.f2284p.recycle();
            this.f2284p = null;
        }
    }

    public final void m2211a(View view, int i) {
        if (view.getParent() != this.f2289u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2289u + ")");
        }
        this.f2278j = view;
        this.f2279k = i;
        this.f2287s.mo166e(view, i);
        m2218b(1);
    }

    public final boolean m2212a(int i) {
        return (this.f2283o & (1 << i)) != 0;
    }

    public final boolean m2213a(int i, int i2) {
        if (this.f2288t) {
            return m2200a(i, i2, (int) this.f2284p.getXVelocity(this.f2279k), (int) this.f2284p.getYVelocity(this.f2279k));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m2214a(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r14.getActionMasked();
        r1 = r14.getActionIndex();
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r13.m2210a();
    L_0x000d:
        r2 = r13.f2284p;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r13.f2284p = r2;
    L_0x0017:
        r2 = r13.f2284p;
        r2.addMovement(r14);
        switch(r0) {
            case 0: goto L_0x0026;
            case 1: goto L_0x011f;
            case 2: goto L_0x008c;
            case 3: goto L_0x011f;
            case 4: goto L_0x001f;
            case 5: goto L_0x0057;
            case 6: goto L_0x0116;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r13.f2269a;
        r1 = 1;
        if (r0 != r1) goto L_0x0124;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = r14.getX();
        r1 = r14.getY();
        r2 = 0;
        r2 = r14.getPointerId(r2);
        r13.m2198a(r0, r1, r2);
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r13.m2216b(r0, r1);
        r1 = r13.f2278j;
        if (r0 != r1) goto L_0x0048;
    L_0x0040:
        r1 = r13.f2269a;
        r3 = 2;
        if (r1 != r3) goto L_0x0048;
    L_0x0045:
        r13.m2204b(r0, r2);
    L_0x0048:
        r0 = r13.f2280l;
        r0 = r0[r2];
        r1 = r13.f2277i;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x0051:
        r0 = r13.f2287s;
        r0.mo703d();
        goto L_0x001f;
    L_0x0057:
        r0 = r14.getPointerId(r1);
        r2 = r14.getX(r1);
        r1 = r14.getY(r1);
        r13.m2198a(r2, r1, r0);
        r3 = r13.f2269a;
        if (r3 != 0) goto L_0x0079;
    L_0x006a:
        r1 = r13.f2280l;
        r0 = r1[r0];
        r1 = r13.f2277i;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x0073:
        r0 = r13.f2287s;
        r0.mo703d();
        goto L_0x001f;
    L_0x0079:
        r3 = r13.f2269a;
        r4 = 2;
        if (r3 != r4) goto L_0x001f;
    L_0x007e:
        r2 = (int) r2;
        r1 = (int) r1;
        r1 = r13.m2216b(r2, r1);
        r2 = r13.f2278j;
        if (r1 != r2) goto L_0x001f;
    L_0x0088:
        r13.m2204b(r1, r0);
        goto L_0x001f;
    L_0x008c:
        r0 = r13.f2271c;
        if (r0 == 0) goto L_0x001f;
    L_0x0090:
        r0 = r13.f2272d;
        if (r0 == 0) goto L_0x001f;
    L_0x0094:
        r2 = r14.getPointerCount();
        r0 = 0;
        r1 = r0;
    L_0x009a:
        if (r1 >= r2) goto L_0x0111;
    L_0x009c:
        r3 = r14.getPointerId(r1);
        r0 = r13.m2209d(r3);
        if (r0 == 0) goto L_0x010b;
    L_0x00a6:
        r0 = r14.getX(r1);
        r4 = r14.getY(r1);
        r5 = r13.f2271c;
        r5 = r5[r3];
        r5 = r0 - r5;
        r6 = r13.f2272d;
        r6 = r6[r3];
        r6 = r4 - r6;
        r0 = (int) r0;
        r4 = (int) r4;
        r4 = r13.m2216b(r0, r4);
        if (r4 == 0) goto L_0x010f;
    L_0x00c2:
        r0 = r13.m2201a(r4, r5, r6);
        if (r0 == 0) goto L_0x010f;
    L_0x00c8:
        r0 = 1;
    L_0x00c9:
        if (r0 == 0) goto L_0x00fb;
    L_0x00cb:
        r7 = r4.getLeft();
        r8 = (int) r5;
        r8 = r8 + r7;
        r9 = r13.f2287s;
        r8 = r9.mo119d(r4, r8);
        r9 = r4.getTop();
        r10 = (int) r6;
        r10 = r10 + r9;
        r11 = r13.f2287s;
        r10 = r11.mo118c(r4, r10);
        r11 = r13.f2287s;
        r11 = r11.mo165a(r4);
        r12 = r13.f2287s;
        r12 = r12.mo113a();
        if (r11 == 0) goto L_0x00f5;
    L_0x00f1:
        if (r11 <= 0) goto L_0x00fb;
    L_0x00f3:
        if (r8 != r7) goto L_0x00fb;
    L_0x00f5:
        if (r12 == 0) goto L_0x0111;
    L_0x00f7:
        if (r12 <= 0) goto L_0x00fb;
    L_0x00f9:
        if (r10 == r9) goto L_0x0111;
    L_0x00fb:
        r13.m2203b(r5, r6, r3);
        r5 = r13.f2269a;
        r6 = 1;
        if (r5 == r6) goto L_0x0111;
    L_0x0103:
        if (r0 == 0) goto L_0x010b;
    L_0x0105:
        r0 = r13.m2204b(r4, r3);
        if (r0 != 0) goto L_0x0111;
    L_0x010b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x009a;
    L_0x010f:
        r0 = 0;
        goto L_0x00c9;
    L_0x0111:
        r13.m2207c(r14);
        goto L_0x001f;
    L_0x0116:
        r0 = r14.getPointerId(r1);
        r13.m2206c(r0);
        goto L_0x001f;
    L_0x011f:
        r13.m2210a();
        goto L_0x001f;
    L_0x0124:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.o.a(android.view.MotionEvent):boolean");
    }

    public final boolean m2215a(View view, int i, int i2) {
        this.f2278j = view;
        this.f2279k = -1;
        boolean a = m2200a(i, i2, 0, 0);
        if (!(a || this.f2269a != 0 || this.f2278j == null)) {
            this.f2278j = null;
        }
        return a;
    }

    public final View m2216b(int i, int i2) {
        for (int childCount = this.f2289u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2289u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void m2217b() {
        m2210a();
        if (this.f2269a == 2) {
            this.f2286r.getCurrX();
            this.f2286r.getCurrY();
            this.f2286r.abortAnimation();
            int currX = this.f2286r.getCurrX();
            this.f2286r.getCurrY();
            this.f2287s.mo117b(this.f2278j, currX);
        }
        m2218b(0);
    }

    final void m2218b(int i) {
        this.f2289u.removeCallbacks(this.f2290w);
        if (this.f2269a != i) {
            this.f2269a = i;
            this.f2287s.mo114a(i);
            if (this.f2269a == 0) {
                this.f2278j = null;
            }
        }
    }

    public final void m2219b(MotionEvent motionEvent) {
        int i = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2210a();
        }
        if (this.f2284p == null) {
            this.f2284p = VelocityTracker.obtain();
        }
        this.f2284p.addMovement(motionEvent);
        float x;
        float y;
        View b;
        int left;
        switch (actionMasked) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                b = m2216b((int) x, (int) y);
                m2198a(x, y, i);
                m2204b(b, i);
                if ((this.f2280l[i] & this.f2277i) != 0) {
                    this.f2287s.mo703d();
                    return;
                }
                return;
            case 1:
                if (this.f2269a == 1) {
                    m2208d();
                }
                m2210a();
                return;
            case 2:
                int pointerCount;
                if (this.f2269a != 1) {
                    pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        actionMasked = motionEvent.getPointerId(i);
                        if (m2209d(actionMasked)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f2271c[actionMasked];
                            float f2 = y2 - this.f2272d[actionMasked];
                            m2203b(f, f2, actionMasked);
                            if (this.f2269a != 1) {
                                b = m2216b((int) x2, (int) y2);
                                if (m2201a(b, f, f2) && m2204b(b, actionMasked)) {
                                }
                            }
                            m2207c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m2207c(motionEvent);
                    return;
                } else if (m2209d(this.f2279k)) {
                    i = motionEvent.findPointerIndex(this.f2279k);
                    x = motionEvent.getX(i);
                    pointerCount = (int) (x - this.f2273e[this.f2279k]);
                    actionMasked = (int) (motionEvent.getY(i) - this.f2274f[this.f2279k]);
                    i = this.f2278j.getLeft() + pointerCount;
                    actionIndex = this.f2278j.getTop() + actionMasked;
                    left = this.f2278j.getLeft();
                    int top = this.f2278j.getTop();
                    if (pointerCount != 0) {
                        i = this.f2287s.mo119d(this.f2278j, i);
                        C0679r.m1929c(this.f2278j, i - left);
                    }
                    if (actionMasked != 0) {
                        C0679r.m1924b(this.f2278j, this.f2287s.mo118c(this.f2278j, actionIndex) - top);
                    }
                    if (!(pointerCount == 0 && actionMasked == 0)) {
                        this.f2287s.mo117b(this.f2278j, i);
                    }
                    m2207c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f2269a == 1) {
                    m2197a(0.0f, 0.0f);
                }
                m2210a();
                return;
            case 5:
                i = motionEvent.getPointerId(actionIndex);
                x = motionEvent.getX(actionIndex);
                y = motionEvent.getY(actionIndex);
                m2198a(x, y, i);
                if (this.f2269a == 0) {
                    m2204b(m2216b((int) x, (int) y), i);
                    if ((this.f2280l[i] & this.f2277i) != 0) {
                        this.f2287s.mo703d();
                        return;
                    }
                    return;
                }
                if (C0769o.m2205b(this.f2278j, (int) x, (int) y)) {
                    m2204b(this.f2278j, i);
                    return;
                }
                return;
            case 6:
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.f2269a == 1 && actionMasked == this.f2279k) {
                    actionIndex = motionEvent.getPointerCount();
                    while (i < actionIndex) {
                        left = motionEvent.getPointerId(i);
                        if (left != this.f2279k) {
                            if (m2216b((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f2278j && m2204b(this.f2278j, left)) {
                                i = this.f2279k;
                                if (i == -1) {
                                    m2208d();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m2208d();
                    }
                }
                m2206c(actionMasked);
                return;
            default:
                return;
        }
    }

    public final boolean m2220c() {
        if (this.f2269a == 2) {
            boolean computeScrollOffset = this.f2286r.computeScrollOffset();
            int currX = this.f2286r.getCurrX();
            int currY = this.f2286r.getCurrY();
            int left = currX - this.f2278j.getLeft();
            int top = currY - this.f2278j.getTop();
            if (left != 0) {
                C0679r.m1929c(this.f2278j, left);
            }
            if (top != 0) {
                C0679r.m1924b(this.f2278j, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f2287s.mo117b(this.f2278j, currX);
            }
            if (computeScrollOffset && currX == this.f2286r.getFinalX() && currY == this.f2286r.getFinalY()) {
                this.f2286r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2289u.post(this.f2290w);
            }
        }
        return this.f2269a == 2;
    }
}
