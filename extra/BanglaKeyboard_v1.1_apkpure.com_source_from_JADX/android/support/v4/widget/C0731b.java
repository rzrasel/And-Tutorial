package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.C0679r;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class C0731b extends ImageView {
    AnimationListener f2213a;
    int f2214b;

    private class C0730a extends OvalShape {
        final /* synthetic */ C0731b f2210a;
        private RadialGradient f2211b;
        private Paint f2212c = new Paint();

        C0730a(C0731b c0731b, int i) {
            this.f2210a = c0731b;
            c0731b.f2214b = i;
            m2111a((int) rect().width());
        }

        private void m2111a(int i) {
            this.f2211b = new RadialGradient((float) (i / 2), (float) (i / 2), (float) this.f2210a.f2214b, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f2212c.setShader(this.f2211b);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = this.f2210a.getWidth();
            int height = this.f2210a.getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (width / 2), this.f2212c);
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) ((width / 2) - this.f2210a.f2214b), paint);
        }

        protected final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2111a((int) f);
        }
    }

    C0731b(Context context) {
        Drawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f2214b = (int) (3.5f * f);
        if (C0731b.m2112a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0679r.m1905a((View) this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C0730a(this, this.f2214b));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f2214b, (float) i2, (float) i, 503316480);
            int i3 = this.f2214b;
            setPadding(i3, i3, i3, i3);
        }
        shapeDrawable.getPaint().setColor(-328966);
        C0679r.m1912a((View) this, shapeDrawable);
    }

    private static boolean m2112a() {
        return VERSION.SDK_INT >= 21;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f2213a != null) {
            this.f2213a.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f2213a != null) {
            this.f2213a.onAnimationStart(getAnimation());
        }
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!C0731b.m2112a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f2214b * 2), getMeasuredHeight() + (this.f2214b * 2));
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
