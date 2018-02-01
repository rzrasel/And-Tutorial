package android.support.v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.p018f.C0499l;
import android.support.v4.view.p020b.C0648b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class C0735c extends Drawable implements Animatable {
    private static final Interpolator f2240b = new LinearInterpolator();
    private static final Interpolator f2241c = new C0648b();
    private static final int[] f2242d = new int[]{-16777216};
    final C0734a f2243a = new C0734a();
    private float f2244e;
    private Resources f2245f;
    private Animator f2246g;
    private float f2247h;
    private boolean f2248i;

    private static class C0734a {
        final RectF f2219a = new RectF();
        final Paint f2220b = new Paint();
        final Paint f2221c = new Paint();
        final Paint f2222d = new Paint();
        float f2223e = 0.0f;
        float f2224f = 0.0f;
        float f2225g = 0.0f;
        float f2226h = 5.0f;
        int[] f2227i;
        int f2228j;
        float f2229k;
        float f2230l;
        float f2231m;
        boolean f2232n;
        Path f2233o;
        float f2234p = 1.0f;
        float f2235q;
        int f2236r;
        int f2237s;
        int f2238t = 255;
        int f2239u;

        C0734a() {
            this.f2220b.setStrokeCap(Cap.SQUARE);
            this.f2220b.setAntiAlias(true);
            this.f2220b.setStyle(Style.STROKE);
            this.f2221c.setStyle(Style.FILL);
            this.f2221c.setAntiAlias(true);
            this.f2222d.setColor(0);
        }

        final int m2113a() {
            return (this.f2228j + 1) % this.f2227i.length;
        }

        final void m2114a(float f) {
            this.f2226h = f;
            this.f2220b.setStrokeWidth(f);
        }

        final void m2115a(int i) {
            this.f2228j = i;
            this.f2239u = this.f2227i[this.f2228j];
        }

        final void m2116a(boolean z) {
            if (this.f2232n != z) {
                this.f2232n = z;
            }
        }

        final void m2117a(int[] iArr) {
            this.f2227i = iArr;
            m2115a(0);
        }

        final int m2118b() {
            return this.f2227i[this.f2228j];
        }

        final void m2119c() {
            this.f2229k = this.f2223e;
            this.f2230l = this.f2224f;
            this.f2231m = this.f2225g;
        }

        final void m2120d() {
            this.f2229k = 0.0f;
            this.f2230l = 0.0f;
            this.f2231m = 0.0f;
            this.f2223e = 0.0f;
            this.f2224f = 0.0f;
            this.f2225g = 0.0f;
        }
    }

    public C0735c(Context context) {
        this.f2245f = ((Context) C0499l.m1295a(context)).getResources();
        this.f2243a.m2117a(f2242d);
        this.f2243a.m2114a(2.5f);
        invalidateSelf();
        final C0734a c0734a = this.f2243a;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ C0735c f2216b;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0735c.m2126b(floatValue, c0734a);
                C0735c.m2124a(this.f2216b, floatValue, c0734a, false);
                this.f2216b.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2240b);
        ofFloat.addListener(new AnimatorListener(this) {
            final /* synthetic */ C0735c f2218b;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
                C0735c.m2124a(this.f2218b, 1.0f, c0734a, true);
                c0734a.m2119c();
                C0734a c0734a = c0734a;
                c0734a.m2115a(c0734a.m2113a());
                if (this.f2218b.f2248i) {
                    this.f2218b.f2248i = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    c0734a.m2116a(false);
                    return;
                }
                this.f2218b.f2247h = this.f2218b.f2247h + 1.0f;
            }

            public final void onAnimationStart(Animator animator) {
                this.f2218b.f2247h = 0.0f;
            }
        });
        this.f2246g = ofFloat;
    }

    private void m2122a(float f, float f2, float f3, float f4) {
        C0734a c0734a = this.f2243a;
        float f5 = this.f2245f.getDisplayMetrics().density;
        c0734a.m2114a(f2 * f5);
        c0734a.f2235q = f * f5;
        c0734a.m2115a(0);
        float f6 = f3 * f5;
        f5 *= f4;
        c0734a.f2236r = (int) f6;
        c0734a.f2237s = (int) f5;
    }

    static /* synthetic */ void m2124a(C0735c c0735c, float f, C0734a c0734a, boolean z) {
        float floor;
        if (c0735c.f2248i) {
            C0735c.m2126b(f, c0734a);
            floor = (float) (Math.floor((double) (c0734a.f2231m / 0.8f)) + 1.0d);
            c0734a.f2223e = c0734a.f2229k + (((c0734a.f2230l - 0.01f) - c0734a.f2229k) * f);
            c0734a.f2224f = c0734a.f2230l;
            c0734a.f2225g = ((floor - c0734a.f2231m) * f) + c0734a.f2231m;
        } else if (f != 1.0f || z) {
            float f2;
            float f3 = c0734a.f2231m;
            if (f < 0.5f) {
                floor = f / 0.5f;
                f2 = c0734a.f2229k;
                floor = ((f2241c.getInterpolation(floor) * 0.79f) + 0.01f) + f2;
            } else {
                floor = c0734a.f2229k + 0.79f;
                f2 = floor - (((1.0f - f2241c.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            f3 += 0.20999998f * f;
            float f4 = 216.0f * (c0735c.f2247h + f);
            c0734a.f2223e = f2;
            c0734a.f2224f = floor;
            c0734a.f2225g = f3;
            c0735c.f2244e = f4;
        }
    }

    private static void m2126b(float f, C0734a c0734a) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int b = c0734a.m2118b();
            int i = c0734a.f2227i[c0734a.m2113a()];
            int i2 = (b >> 24) & 255;
            int i3 = (b >> 16) & 255;
            int i4 = (b >> 8) & 255;
            b &= 255;
            c0734a.f2239u = (((int) (f2 * ((float) ((i & 255) - b)))) + b) | ((((i2 + ((int) (((float) (((i >> 24) & 255) - i2)) * f2))) << 24) | ((i3 + ((int) (((float) (((i >> 16) & 255) - i3)) * f2))) << 16)) | ((((int) (((float) (((i >> 8) & 255) - i4)) * f2)) + i4) << 8));
            return;
        }
        c0734a.f2239u = c0734a.m2118b();
    }

    public final void m2129a(float f) {
        C0734a c0734a = this.f2243a;
        if (f != c0734a.f2234p) {
            c0734a.f2234p = f;
        }
        invalidateSelf();
    }

    public final void m2130a(int i) {
        if (i == 0) {
            m2122a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m2122a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m2131a(boolean z) {
        this.f2243a.m2116a(z);
        invalidateSelf();
    }

    public final void m2132b(float f) {
        this.f2243a.f2223e = 0.0f;
        this.f2243a.f2224f = f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2244e, bounds.exactCenterX(), bounds.exactCenterY());
        C0734a c0734a = this.f2243a;
        RectF rectF = c0734a.f2219a;
        float f = c0734a.f2235q + (c0734a.f2226h / 2.0f);
        if (c0734a.f2235q <= 0.0f) {
            f = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) c0734a.f2236r) * c0734a.f2234p) / 2.0f, c0734a.f2226h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f, ((float) bounds.centerY()) - f, ((float) bounds.centerX()) + f, f + ((float) bounds.centerY()));
        float f2 = (c0734a.f2223e + c0734a.f2225g) * 360.0f;
        float f3 = ((c0734a.f2224f + c0734a.f2225g) * 360.0f) - f2;
        c0734a.f2220b.setColor(c0734a.f2239u);
        c0734a.f2220b.setAlpha(c0734a.f2238t);
        f = c0734a.f2226h / 2.0f;
        rectF.inset(f, f);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c0734a.f2222d);
        rectF.inset(-f, -f);
        canvas.drawArc(rectF, f2, f3, false, c0734a.f2220b);
        if (c0734a.f2232n) {
            if (c0734a.f2233o == null) {
                c0734a.f2233o = new Path();
                c0734a.f2233o.setFillType(FillType.EVEN_ODD);
            } else {
                c0734a.f2233o.reset();
            }
            f = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f4 = (((float) c0734a.f2236r) * c0734a.f2234p) / 2.0f;
            c0734a.f2233o.moveTo(0.0f, 0.0f);
            c0734a.f2233o.lineTo(((float) c0734a.f2236r) * c0734a.f2234p, 0.0f);
            c0734a.f2233o.lineTo((((float) c0734a.f2236r) * c0734a.f2234p) / 2.0f, ((float) c0734a.f2237s) * c0734a.f2234p);
            c0734a.f2233o.offset((f + rectF.centerX()) - f4, rectF.centerY() + (c0734a.f2226h / 2.0f));
            c0734a.f2233o.close();
            c0734a.f2221c.setColor(c0734a.f2239u);
            c0734a.f2221c.setAlpha(c0734a.f2238t);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c0734a.f2233o, c0734a.f2221c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.f2243a.f2238t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f2246g.isRunning();
    }

    public final void setAlpha(int i) {
        this.f2243a.f2238t = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2243a.f2220b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.f2246g.cancel();
        this.f2243a.m2119c();
        if (this.f2243a.f2224f != this.f2243a.f2223e) {
            this.f2248i = true;
            this.f2246g.setDuration(666);
            this.f2246g.start();
            return;
        }
        this.f2243a.m2115a(0);
        this.f2243a.m2120d();
        this.f2246g.setDuration(1332);
        this.f2246g.start();
    }

    public final void stop() {
        this.f2246g.cancel();
        this.f2244e = 0.0f;
        this.f2243a.m2116a(false);
        this.f2243a.m2115a(0);
        this.f2243a.m2120d();
        invalidateSelf();
    }
}
