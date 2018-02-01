package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.an;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

final class ah {
    private static final Interpolator f287a = C0101a.m584a();
    private final Paint f288b = new Paint();
    private final RectF f289c = new RectF();
    private float f290d;
    private long f291e;
    private long f292f;
    private boolean f293g;
    private int f294h;
    private int f295i;
    private int f296j;
    private int f297k;
    private View f298l;
    private Rect f299m = new Rect();

    public ah(View view) {
        this.f298l = view;
        this.f294h = -1291845632;
        this.f295i = Integer.MIN_VALUE;
        this.f296j = 1291845632;
        this.f297k = 436207616;
    }

    private void m608a(Canvas canvas, float f, float f2, int i, float f3) {
        this.f288b.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = f287a.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.f288b);
        canvas.restore();
    }

    private void m609a(Canvas canvas, int i, int i2) {
        this.f288b.setColor(this.f294h);
        canvas.drawCircle((float) i, (float) i2, ((float) i) * this.f290d, this.f288b);
    }

    final void m610a() {
        if (!this.f293g) {
            this.f290d = 0.0f;
            this.f291e = AnimationUtils.currentAnimationTimeMillis();
            this.f293g = true;
            this.f298l.postInvalidate();
        }
    }

    final void m611a(float f) {
        this.f290d = f;
        this.f291e = 0;
        an.m336c(this.f298l);
    }

    final void m612a(int i, int i2) {
        this.f299m.left = 0;
        this.f299m.top = 0;
        this.f299m.right = i;
        this.f299m.bottom = i2;
    }

    final void m613a(Canvas canvas) {
        int width = this.f299m.width();
        int height = this.f299m.height();
        int i = width / 2;
        int i2 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.f299m);
        if (this.f293g || this.f292f > 0) {
            Canvas canvas2;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = (currentAnimationTimeMillis - this.f291e) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - this.f291e) % 2000)) / 20.0f;
            Object obj;
            if (this.f293g) {
                obj = null;
            } else if (currentAnimationTimeMillis - this.f292f >= 1000) {
                this.f292f = 0;
                return;
            } else {
                float f2 = (((float) ((currentAnimationTimeMillis - this.f292f) % 1000)) / 10.0f) / 100.0f;
                f2 = f287a.getInterpolation(f2) * ((float) i);
                this.f289c.set(((float) i) - f2, 0.0f, f2 + ((float) i), (float) height);
                canvas.saveLayerAlpha(this.f289c, 0, 0);
                obj = 1;
            }
            if (j == 0) {
                canvas.drawColor(this.f294h);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(this.f297k);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(this.f294h);
            } else if (f < 50.0f || f >= 75.0f) {
                canvas.drawColor(this.f296j);
            } else {
                canvas.drawColor(this.f295i);
            }
            if (f >= 0.0f && f <= 25.0f) {
                canvas2 = canvas;
                m608a(canvas2, (float) i, (float) i2, this.f294h, ((25.0f + f) * 2.0f) / 100.0f);
            }
            if (f >= 0.0f && f <= 50.0f) {
                canvas2 = canvas;
                m608a(canvas2, (float) i, (float) i2, this.f295i, (2.0f * f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                canvas2 = canvas;
                m608a(canvas2, (float) i, (float) i2, this.f296j, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                canvas2 = canvas;
                m608a(canvas2, (float) i, (float) i2, this.f297k, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                canvas2 = canvas;
                m608a(canvas2, (float) i, (float) i2, this.f294h, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.f290d <= 0.0f || r9 == null) {
                width = save;
            } else {
                canvas.restoreToCount(save);
                width = canvas.save();
                canvas.clipRect(this.f299m);
                m609a(canvas, i, i2);
            }
            an.m336c(this.f298l);
            save = width;
        } else if (this.f290d > 0.0f && ((double) this.f290d) <= 1.0d) {
            m609a(canvas, i, i2);
        }
        canvas.restoreToCount(save);
    }

    final void m614b() {
        if (this.f293g) {
            this.f290d = 0.0f;
            this.f292f = AnimationUtils.currentAnimationTimeMillis();
            this.f293g = false;
            this.f298l.postInvalidate();
        }
    }
}
