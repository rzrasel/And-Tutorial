package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.C0679r;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class C0729a implements OnTouchListener {
    private static final int f2192r = ViewConfiguration.getTapTimeout();
    final C0727a f2193a = new C0727a();
    final View f2194b;
    boolean f2195c;
    boolean f2196d;
    boolean f2197e;
    private final Interpolator f2198f = new AccelerateInterpolator();
    private Runnable f2199g;
    private float[] f2200h = new float[]{0.0f, 0.0f};
    private float[] f2201i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private int f2202j;
    private int f2203k;
    private float[] f2204l = new float[]{0.0f, 0.0f};
    private float[] f2205m = new float[]{0.0f, 0.0f};
    private float[] f2206n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean f2207o;
    private boolean f2208p;
    private boolean f2209q;

    private static class C0727a {
        int f2180a;
        int f2181b;
        float f2182c;
        float f2183d;
        long f2184e = Long.MIN_VALUE;
        long f2185f = 0;
        int f2186g = 0;
        int f2187h = 0;
        long f2188i = -1;
        float f2189j;
        int f2190k;

        C0727a() {
        }

        final float m2102a(long j) {
            if (j < this.f2184e) {
                return 0.0f;
            }
            if (this.f2188i < 0 || j < this.f2188i) {
                return C0729a.m2104a(((float) (j - this.f2184e)) / ((float) this.f2180a), 0.0f, 1.0f) * 0.5f;
            }
            long j2 = j - this.f2188i;
            return (C0729a.m2104a(((float) j2) / ((float) this.f2190k), 0.0f, 1.0f) * this.f2189j) + (1.0f - this.f2189j);
        }
    }

    private class C0728b implements Runnable {
        final /* synthetic */ C0729a f2191a;

        C0728b(C0729a c0729a) {
            this.f2191a = c0729a;
        }

        public final void run() {
            if (this.f2191a.f2197e) {
                if (this.f2191a.f2195c) {
                    this.f2191a.f2195c = false;
                    C0727a c0727a = this.f2191a.f2193a;
                    c0727a.f2184e = AnimationUtils.currentAnimationTimeMillis();
                    c0727a.f2188i = -1;
                    c0727a.f2185f = c0727a.f2184e;
                    c0727a.f2189j = 0.5f;
                    c0727a.f2186g = 0;
                    c0727a.f2187h = 0;
                }
                C0727a c0727a2 = this.f2191a.f2193a;
                boolean z = c0727a2.f2188i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0727a2.f2188i + ((long) c0727a2.f2190k);
                if (z || !this.f2191a.m2109a()) {
                    this.f2191a.f2197e = false;
                    return;
                }
                long uptimeMillis;
                if (this.f2191a.f2196d) {
                    this.f2191a.f2196d = false;
                    C0729a c0729a = this.f2191a;
                    uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    c0729a.f2194b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0727a2.f2185f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                uptimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = c0727a2.m2102a(uptimeMillis);
                a = (a * 4.0f) + ((-4.0f * a) * a);
                long j = uptimeMillis - c0727a2.f2185f;
                c0727a2.f2185f = uptimeMillis;
                c0727a2.f2186g = (int) ((((float) j) * a) * c0727a2.f2182c);
                c0727a2.f2187h = (int) ((((float) j) * a) * c0727a2.f2183d);
                this.f2191a.mo717a(c0727a2.f2187h);
                C0679r.m1916a(this.f2191a.f2194b, (Runnable) this);
            }
        }
    }

    public C0729a(View view) {
        this.f2194b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = (float) i;
        this.f2206n[0] = f / 1000.0f;
        this.f2206n[1] = f / 1000.0f;
        float f2 = (float) i2;
        this.f2205m[0] = f2 / 1000.0f;
        this.f2205m[1] = f2 / 1000.0f;
        this.f2202j = 1;
        this.f2201i[0] = Float.MAX_VALUE;
        this.f2201i[1] = Float.MAX_VALUE;
        this.f2200h[0] = 0.2f;
        this.f2200h[1] = 0.2f;
        this.f2204l[0] = 0.001f;
        this.f2204l[1] = 0.001f;
        this.f2203k = f2192r;
        this.f2193a.f2180a = 500;
        this.f2193a.f2181b = 500;
    }

    private float m2103a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f2202j) {
            case 0:
            case 1:
                return f < f2 ? f >= 0.0f ? 1.0f - (f / f2) : (this.f2197e && this.f2202j == 1) ? 1.0f : 0.0f : 0.0f;
            case 2:
                return f < 0.0f ? f / (-f2) : 0.0f;
            default:
                return 0.0f;
        }
    }

    static float m2104a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    private float m2105a(int i, float f, float f2, float f3) {
        float a = C0729a.m2104a(this.f2200h[i] * f2, 0.0f, this.f2201i[i]);
        a = m2103a(f2 - f, a) - m2103a(f, a);
        if (a < 0.0f) {
            a = -this.f2198f.getInterpolation(-a);
        } else if (a > 0.0f) {
            a = this.f2198f.getInterpolation(a);
        } else {
            a = 0.0f;
            if (a == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f2204l[i];
            float f5 = this.f2205m[i];
            float f6 = this.f2206n[i];
            f4 *= f3;
            return a <= 0.0f ? C0729a.m2104a(a * f4, f5, f6) : -C0729a.m2104a((-a) * f4, f5, f6);
        }
        a = C0729a.m2104a(a, -1.0f, 1.0f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f42 = this.f2204l[i];
        float f52 = this.f2205m[i];
        float f62 = this.f2206n[i];
        f42 *= f3;
        if (a <= 0.0f) {
        }
    }

    private void m2106b() {
        if (this.f2195c) {
            this.f2197e = false;
            return;
        }
        C0727a c0727a = this.f2193a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (currentAnimationTimeMillis - c0727a.f2184e);
        int i2 = c0727a.f2181b;
        if (i <= i2) {
            i2 = i < 0 ? 0 : i;
        }
        c0727a.f2190k = i2;
        c0727a.f2189j = c0727a.m2102a(currentAnimationTimeMillis);
        c0727a.f2188i = currentAnimationTimeMillis;
    }

    public final C0729a m2107a(boolean z) {
        if (this.f2208p && !z) {
            m2106b();
        }
        this.f2208p = z;
        return this;
    }

    public abstract void mo717a(int i);

    final boolean m2109a() {
        C0727a c0727a = this.f2193a;
        int abs = (int) (c0727a.f2183d / Math.abs(c0727a.f2183d));
        int abs2 = (int) (c0727a.f2182c / Math.abs(c0727a.f2182c));
        if (abs != 0 && mo718b(abs)) {
            return true;
        }
        if (abs2 != 0) {
        }
        return false;
    }

    public abstract boolean mo718b(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2208p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f2196d = true;
                this.f2207o = false;
                break;
            case 1:
            case 3:
                m2106b();
                break;
            case 2:
                break;
        }
        float a = m2105a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f2194b.getWidth());
        float a2 = m2105a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f2194b.getHeight());
        C0727a c0727a = this.f2193a;
        c0727a.f2182c = a;
        c0727a.f2183d = a2;
        if (!this.f2197e && m2109a()) {
            if (this.f2199g == null) {
                this.f2199g = new C0728b(this);
            }
            this.f2197e = true;
            this.f2195c = true;
            if (this.f2207o || this.f2203k <= 0) {
                this.f2199g.run();
            } else {
                C0679r.m1917a(this.f2194b, this.f2199g, (long) this.f2203k);
            }
            this.f2207o = true;
        }
        return this.f2209q && this.f2197e;
    }
}
