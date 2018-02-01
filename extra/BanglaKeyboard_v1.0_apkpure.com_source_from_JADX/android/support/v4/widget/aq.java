package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.C0097w;
import android.support.v4.view.aj;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public final class aq {
    private static final Interpolator f307v = new ar();
    private int f308a;
    private int f309b;
    private int f310c = -1;
    private float[] f311d;
    private float[] f312e;
    private float[] f313f;
    private float[] f314g;
    private int[] f315h;
    private int[] f316i;
    private int[] f317j;
    private int f318k;
    private VelocityTracker f319l;
    private float f320m;
    private float f321n;
    private int f322o;
    private int f323p;
    private C0119t f324q;
    private final at f325r;
    private View f326s;
    private boolean f327t;
    private final ViewGroup f328u;
    private final Runnable f329w = new as(this);

    private aq(Context context, ViewGroup viewGroup, at atVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (atVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f328u = viewGroup;
            this.f325r = atVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f322o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f309b = viewConfiguration.getScaledTouchSlop();
            this.f320m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f321n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f324q = new C0119t(context, f307v);
        }
    }

    private static float m615a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? 0.0f : abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private int m616a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f328u.getWidth();
        int i4 = width / 2;
        float sin = (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        return Math.min(i4 > 0 ? Math.round(Math.abs(sin / ((float) i4)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    public static aq m617a(ViewGroup viewGroup, float f, at atVar) {
        aq aqVar = new aq(viewGroup.getContext(), viewGroup, atVar);
        aqVar.f309b = (int) (((float) aqVar.f309b) * (1.0f / f));
        return aqVar;
    }

    private void m618a(float f, float f2, int i) {
        int i2 = 0;
        if (this.f311d == null || this.f311d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f311d != null) {
                System.arraycopy(this.f311d, 0, obj, 0, this.f311d.length);
                System.arraycopy(this.f312e, 0, obj2, 0, this.f312e.length);
                System.arraycopy(this.f313f, 0, obj3, 0, this.f313f.length);
                System.arraycopy(this.f314g, 0, obj4, 0, this.f314g.length);
                System.arraycopy(this.f315h, 0, obj5, 0, this.f315h.length);
                System.arraycopy(this.f316i, 0, obj6, 0, this.f316i.length);
                System.arraycopy(this.f317j, 0, obj7, 0, this.f317j.length);
            }
            this.f311d = obj;
            this.f312e = obj2;
            this.f313f = obj3;
            this.f314g = obj4;
            this.f315h = obj5;
            this.f316i = obj6;
            this.f317j = obj7;
        }
        float[] fArr = this.f311d;
        this.f313f[i] = f;
        fArr[i] = f;
        fArr = this.f312e;
        this.f314g[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f315h;
        int i3 = (int) f;
        int i4 = (int) f2;
        if (i3 < this.f328u.getLeft() + this.f322o) {
            i2 = 1;
        }
        if (i4 < this.f328u.getTop() + this.f322o) {
            i2 |= 4;
        }
        if (i3 > this.f328u.getRight() - this.f322o) {
            i2 |= 2;
        }
        if (i4 > this.f328u.getBottom() - this.f322o) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.f318k |= 1 << i;
    }

    private boolean m619a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f315h[i] & i2) != i2 || (this.f323p & i2) == 0 || (this.f317j[i] & i2) == i2 || (this.f316i[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.f309b) && abs2 <= ((float) this.f309b)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            at atVar = this.f325r;
        }
        return (this.f316i[i] & i2) == 0 && abs > ((float) this.f309b);
    }

    private boolean m620a(int i, int i2, int i3, int i4) {
        int left = this.f326s.getLeft();
        int top = this.f326s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f324q.m693c();
            m639b(0);
            return false;
        }
        View view = this.f326s;
        int b = m622b(i3, (int) this.f321n, (int) this.f320m);
        int b2 = m622b(i4, (int) this.f321n, (int) this.f320m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        float f = b != 0 ? ((float) abs3) / ((float) i7) : ((float) abs) / ((float) i8);
        float f2 = b2 != 0 ? ((float) abs4) / ((float) i7) : ((float) abs2) / ((float) i8);
        int a = m616a(i5, b, this.f325r.mo277c(view));
        at atVar = this.f325r;
        a = (int) ((f2 * ((float) m616a(i6, b2, 0))) + (f * ((float) a)));
        C0119t c0119t = this.f324q;
        c0119t.f347b.mo298a(c0119t.f346a, left, top, i5, i6, a);
        m639b(2);
        return true;
    }

    private boolean m621a(View view, float f) {
        if (view == null) {
            return false;
        }
        boolean z = this.f325r.mo277c(view) > 0;
        at atVar = this.f325r;
        return z && Math.abs(f) > ((float) this.f309b);
    }

    private static int m622b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        return abs < i2 ? 0 : abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private void m623b(float f) {
        this.f327t = true;
        this.f325r.mo272a(this.f326s, f);
        this.f327t = false;
        if (this.f308a == 1) {
            m639b(0);
        }
    }

    private void m624b(float f, float f2, int i) {
        int i2 = 1;
        if (!m619a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m619a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m619a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m619a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f316i;
            iArr[i] = iArr[i] | i2;
            this.f325r.mo271a(i2, i);
        }
    }

    private boolean m625b(View view, int i) {
        if (view == this.f326s && this.f310c == i) {
            return true;
        }
        if (view == null || !this.f325r.mo274a(view)) {
            return false;
        }
        this.f310c = i;
        m633a(view, i);
        return true;
    }

    public static boolean m626b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    private void m627c(int i) {
        if (this.f311d != null) {
            this.f311d[i] = 0.0f;
            this.f312e[i] = 0.0f;
            this.f313f[i] = 0.0f;
            this.f314g[i] = 0.0f;
            this.f315h[i] = 0;
            this.f316i[i] = 0;
            this.f317j[i] = 0;
            this.f318k &= (1 << i) ^ -1;
        }
    }

    private void m628c(MotionEvent motionEvent) {
        int c = C0097w.m495c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b = C0097w.m493b(motionEvent, i);
            float c2 = C0097w.m494c(motionEvent, i);
            float d = C0097w.m496d(motionEvent, i);
            this.f313f[b] = c2;
            this.f314g[b] = d;
        }
    }

    private void m629i() {
        this.f319l.computeCurrentVelocity(1000, this.f320m);
        float a = m615a(aj.m319a(this.f319l, this.f310c), this.f321n, this.f320m);
        m615a(aj.m320b(this.f319l, this.f310c), this.f321n, this.f320m);
        m623b(a);
    }

    public final int m630a() {
        return this.f308a;
    }

    public final void m631a(float f) {
        this.f321n = f;
    }

    public final void m632a(int i) {
        this.f323p = i;
    }

    public final void m633a(View view, int i) {
        if (view.getParent() != this.f328u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f328u + ")");
        }
        this.f326s = view;
        this.f310c = i;
        this.f325r.mo276b(view);
        m639b(1);
    }

    public final boolean m634a(int i, int i2) {
        if (this.f327t) {
            return m620a(i, i2, (int) aj.m319a(this.f319l, this.f310c), (int) aj.m320b(this.f319l, this.f310c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean m635a(MotionEvent motionEvent) {
        int a = C0097w.m490a(motionEvent);
        int b = C0097w.m492b(motionEvent);
        if (a == 0) {
            m643e();
        }
        if (this.f319l == null) {
            this.f319l = VelocityTracker.obtain();
        }
        this.f319l.addMovement(motionEvent);
        float y;
        int b2;
        at atVar;
        switch (a) {
            case 0:
                float x = motionEvent.getX();
                y = motionEvent.getY();
                b2 = C0097w.m493b(motionEvent, 0);
                m618a(x, y, b2);
                View b3 = m638b((int) x, (int) y);
                if (b3 == this.f326s && this.f308a == 2) {
                    m625b(b3, b2);
                }
                if ((this.f315h[b2] & this.f323p) != 0) {
                    atVar = this.f325r;
                    b = this.f323p;
                    atVar.mo287c();
                    break;
                }
                break;
            case 1:
            case 3:
                m643e();
                break;
            case 2:
                b = C0097w.m495c(motionEvent);
                a = 0;
                while (a < b) {
                    b2 = C0097w.m493b(motionEvent, a);
                    float c = C0097w.m494c(motionEvent, a);
                    float d = C0097w.m496d(motionEvent, a);
                    float f = c - this.f311d[b2];
                    m624b(f, d - this.f312e[b2], b2);
                    if (this.f308a != 1) {
                        View b4 = m638b((int) c, (int) d);
                        if (b4 == null || !m621a(b4, f) || !m625b(b4, b2)) {
                            a++;
                        }
                    }
                    m628c(motionEvent);
                    break;
                }
                m628c(motionEvent);
                break;
            case 5:
                a = C0097w.m493b(motionEvent, b);
                float c2 = C0097w.m494c(motionEvent, b);
                y = C0097w.m496d(motionEvent, b);
                m618a(c2, y, a);
                if (this.f308a != 0) {
                    if (this.f308a == 2) {
                        View b5 = m638b((int) c2, (int) y);
                        if (b5 == this.f326s) {
                            m625b(b5, a);
                            break;
                        }
                    }
                } else if ((this.f315h[a] & this.f323p) != 0) {
                    atVar = this.f325r;
                    b = this.f323p;
                    atVar.mo287c();
                    break;
                }
                break;
            case 6:
                m627c(C0097w.m493b(motionEvent, b));
                break;
        }
        return this.f308a == 1;
    }

    public final boolean m636a(View view, int i, int i2) {
        this.f326s = view;
        this.f310c = -1;
        return m620a(i, i2, 0, 0);
    }

    public final int m637b() {
        return this.f322o;
    }

    public final View m638b(int i, int i2) {
        for (int childCount = this.f328u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f328u;
            at atVar = this.f325r;
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    final void m639b(int i) {
        if (this.f308a != i) {
            this.f308a = i;
            this.f325r.mo270a(i);
            if (i == 0) {
                this.f326s = null;
            }
        }
    }

    public final void m640b(MotionEvent motionEvent) {
        int i = 0;
        int a = C0097w.m490a(motionEvent);
        int b = C0097w.m492b(motionEvent);
        if (a == 0) {
            m643e();
        }
        if (this.f319l == null) {
            this.f319l = VelocityTracker.obtain();
        }
        this.f319l.addMovement(motionEvent);
        float x;
        float y;
        View b2;
        at atVar;
        int i2;
        int top;
        switch (a) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = C0097w.m493b(motionEvent, 0);
                b2 = m638b((int) x, (int) y);
                m618a(x, y, i);
                m625b(b2, i);
                if ((this.f315h[i] & this.f323p) != 0) {
                    atVar = this.f325r;
                    i2 = this.f323p;
                    atVar.mo287c();
                    return;
                }
                return;
            case 1:
                if (this.f308a == 1) {
                    m629i();
                }
                m643e();
                return;
            case 2:
                if (this.f308a == 1) {
                    i = C0097w.m491a(motionEvent, this.f310c);
                    x = C0097w.m494c(motionEvent, i);
                    i2 = (int) (x - this.f313f[this.f310c]);
                    a = (int) (C0097w.m496d(motionEvent, i) - this.f314g[this.f310c]);
                    i = this.f326s.getLeft() + i2;
                    this.f326s.getTop();
                    b = this.f326s.getLeft();
                    top = this.f326s.getTop();
                    if (i2 != 0) {
                        i = this.f325r.mo275b(this.f326s, i);
                        this.f326s.offsetLeftAndRight(i - b);
                    }
                    if (a != 0) {
                        this.f326s.offsetTopAndBottom(this.f325r.mo278d(this.f326s) - top);
                    }
                    if (!(i2 == 0 && a == 0)) {
                        this.f325r.mo273a(this.f326s, i);
                    }
                    m628c(motionEvent);
                    return;
                }
                i2 = C0097w.m495c(motionEvent);
                while (i < i2) {
                    a = C0097w.m493b(motionEvent, i);
                    float c = C0097w.m494c(motionEvent, i);
                    float d = C0097w.m496d(motionEvent, i);
                    float f = c - this.f311d[a];
                    m624b(f, d - this.f312e[a], a);
                    if (this.f308a != 1) {
                        b2 = m638b((int) c, (int) d);
                        if (!m621a(b2, f) || !m625b(b2, a)) {
                            i++;
                        }
                    }
                    m628c(motionEvent);
                    return;
                }
                m628c(motionEvent);
                return;
            case 3:
                if (this.f308a == 1) {
                    m623b(0.0f);
                }
                m643e();
                return;
            case 5:
                i = C0097w.m493b(motionEvent, b);
                x = C0097w.m494c(motionEvent, b);
                y = C0097w.m496d(motionEvent, b);
                m618a(x, y, i);
                if (this.f308a == 0) {
                    m625b(m638b((int) x, (int) y), i);
                    if ((this.f315h[i] & this.f323p) != 0) {
                        atVar = this.f325r;
                        i2 = this.f323p;
                        atVar.mo287c();
                        return;
                    }
                    return;
                }
                if (m626b(this.f326s, (int) x, (int) y)) {
                    m625b(this.f326s, i);
                    return;
                }
                return;
            case 6:
                a = C0097w.m493b(motionEvent, b);
                if (this.f308a == 1 && a == this.f310c) {
                    b = C0097w.m495c(motionEvent);
                    while (i < b) {
                        top = C0097w.m493b(motionEvent, i);
                        if (top != this.f310c) {
                            if (m638b((int) C0097w.m494c(motionEvent, i), (int) C0097w.m496d(motionEvent, i)) == this.f326s && m625b(this.f326s, top)) {
                                i = this.f310c;
                                if (i == -1) {
                                    m629i();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m629i();
                    }
                }
                m627c(a);
                return;
            default:
                return;
        }
    }

    public final View m641c() {
        return this.f326s;
    }

    public final int m642d() {
        return this.f309b;
    }

    public final void m643e() {
        this.f310c = -1;
        if (this.f311d != null) {
            Arrays.fill(this.f311d, 0.0f);
            Arrays.fill(this.f312e, 0.0f);
            Arrays.fill(this.f313f, 0.0f);
            Arrays.fill(this.f314g, 0.0f);
            Arrays.fill(this.f315h, 0);
            Arrays.fill(this.f316i, 0);
            Arrays.fill(this.f317j, 0);
            this.f318k = 0;
        }
        if (this.f319l != null) {
            this.f319l.recycle();
            this.f319l = null;
        }
    }

    public final void m644f() {
        m643e();
        if (this.f308a == 2) {
            this.f324q.m691a();
            this.f324q.m692b();
            this.f324q.m693c();
            int a = this.f324q.m691a();
            this.f324q.m692b();
            this.f325r.mo273a(this.f326s, a);
        }
        m639b(0);
    }

    public final boolean m645g() {
        if (this.f308a == 2) {
            C0119t c0119t = this.f324q;
            boolean d = c0119t.f347b.mo302d(c0119t.f346a);
            int a = this.f324q.m691a();
            int b = this.f324q.m692b();
            int left = a - this.f326s.getLeft();
            int top = b - this.f326s.getTop();
            if (left != 0) {
                this.f326s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.f326s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f325r.mo273a(this.f326s, a);
            }
            if (d) {
                C0119t c0119t2 = this.f324q;
                if (a == c0119t2.f347b.mo304f(c0119t2.f346a)) {
                    C0119t c0119t3 = this.f324q;
                    if (b == c0119t3.f347b.mo305g(c0119t3.f346a)) {
                        this.f324q.m693c();
                        c0119t = this.f324q;
                        d = c0119t.f347b.mo299a(c0119t.f346a);
                    }
                }
            }
            if (!d) {
                this.f328u.post(this.f329w);
            }
        }
        return this.f308a == 2;
    }

    public final boolean m646h() {
        int length = this.f311d.length;
        for (int i = 0; i < length; i++) {
            boolean z;
            if ((this.f318k & (1 << i)) != 0) {
                float f = this.f313f[i] - this.f311d[i];
                float f2 = this.f314g[i] - this.f312e[i];
                z = (f * f) + (f2 * f2) > ((float) (this.f309b * this.f309b));
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
