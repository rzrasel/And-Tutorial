package com.bumptech.glide.load.resource.p053c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.view.Gravity;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.load.resource.p053c.C1349f.C1341b;
import com.bumptech.glide.p033b.C1091a;
import com.bumptech.glide.p033b.C1091a.C1090a;
import com.bumptech.glide.p033b.C1093c;

public class C1342b extends C1136b implements C1341b {
    public final C1340a f3763a;
    public final C1091a f3764b;
    final C1349f f3765c;
    boolean f3766d;
    private final Paint f3767e;
    private final Rect f3768f;
    private boolean f3769g;
    private boolean f3770h;
    private boolean f3771i;
    private int f3772j;
    private int f3773k;
    private boolean f3774l;

    static class C1340a extends ConstantState {
        C1093c f3754a;
        byte[] f3755b;
        Context f3756c;
        C1299g<Bitmap> f3757d;
        int f3758e;
        int f3759f;
        C1090a f3760g;
        C1187c f3761h;
        public Bitmap f3762i;

        public C1340a(C1093c c1093c, byte[] bArr, Context context, C1299g<Bitmap> c1299g, int i, int i2, C1090a c1090a, C1187c c1187c, Bitmap bitmap) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.f3754a = c1093c;
            this.f3755b = bArr;
            this.f3761h = c1187c;
            this.f3762i = bitmap;
            this.f3756c = context.getApplicationContext();
            this.f3757d = c1299g;
            this.f3758e = i;
            this.f3759f = i2;
            this.f3760g = c1090a;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new C1342b(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C1342b(Context context, C1090a c1090a, C1187c c1187c, C1299g<Bitmap> c1299g, int i, int i2, C1093c c1093c, byte[] bArr, Bitmap bitmap) {
        this(new C1340a(c1093c, bArr, context, c1299g, i, i2, c1090a, c1187c, bitmap));
    }

    C1342b(C1340a c1340a) {
        this.f3768f = new Rect();
        this.f3771i = true;
        this.f3773k = -1;
        if (c1340a == null) {
            throw new NullPointerException("GifState must not be null");
        }
        this.f3763a = c1340a;
        this.f3764b = new C1091a(c1340a.f3760g);
        this.f3767e = new Paint();
        this.f3764b.m2938a(c1340a.f3754a, c1340a.f3755b);
        this.f3765c = new C1349f(c1340a.f3756c, this, this.f3764b, c1340a.f3758e, c1340a.f3759f);
        C1349f c1349f = this.f3765c;
        if (c1340a.f3757d == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        c1349f.f3791e = c1349f.f3791e.mo1268a(r1);
    }

    public C1342b(C1342b c1342b, Bitmap bitmap, C1299g<Bitmap> c1299g) {
        this(new C1340a(c1342b.f3763a.f3754a, c1342b.f3763a.f3755b, c1342b.f3763a.f3756c, c1299g, c1342b.f3763a.f3758e, c1342b.f3763a.f3759f, c1342b.f3763a.f3760g, c1342b.f3763a.f3761h, bitmap));
    }

    private void m3493b() {
        this.f3765c.m3509a();
        invalidateSelf();
    }

    private void m3494c() {
        if (this.f3764b.f3205f.f3229c != 1) {
            if (!this.f3769g) {
                this.f3769g = true;
                C1349f c1349f = this.f3765c;
                if (!c1349f.f3789c) {
                    c1349f.f3789c = true;
                    c1349f.f3793g = false;
                    c1349f.m3510b();
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    private void m3495d() {
        this.f3769g = false;
        this.f3765c.f3789c = false;
    }

    public final void mo1314a(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            C1091a c1091a = this.f3764b;
            int i3 = c1091a.f3205f.f3239m == -1 ? 1 : c1091a.f3205f.f3239m == 0 ? 0 : c1091a.f3205f.f3239m + 1;
            if (i3 != 0) {
                i2 = i3;
            }
            this.f3773k = i2;
        } else {
            this.f3773k = i;
        }
    }

    public final boolean mo1315a() {
        return true;
    }

    @TargetApi(11)
    public final void mo1388b(int i) {
        if (VERSION.SDK_INT < 11 || getCallback() != null) {
            invalidateSelf();
            if (i == this.f3764b.f3205f.f3229c - 1) {
                this.f3772j++;
            }
            if (this.f3773k != -1 && this.f3772j >= this.f3773k) {
                stop();
                return;
            }
            return;
        }
        stop();
        m3493b();
    }

    public void draw(Canvas canvas) {
        if (!this.f3766d) {
            if (this.f3774l) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f3768f);
                this.f3774l = false;
            }
            C1349f c1349f = this.f3765c;
            Bitmap bitmap = c1349f.f3792f != null ? c1349f.f3792f.f3782b : null;
            if (bitmap == null) {
                bitmap = this.f3763a.f3762i;
            }
            canvas.drawBitmap(bitmap, null, this.f3768f, this.f3767e);
        }
    }

    public ConstantState getConstantState() {
        return this.f3763a;
    }

    public int getIntrinsicHeight() {
        return this.f3763a.f3762i.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3763a.f3762i.getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f3769g;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3774l = true;
    }

    public void setAlpha(int i) {
        this.f3767e.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3767e.setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        this.f3771i = z;
        if (!z) {
            m3495d();
        } else if (this.f3770h) {
            m3494c();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f3770h = true;
        this.f3772j = 0;
        if (this.f3771i) {
            m3494c();
        }
    }

    public void stop() {
        this.f3770h = false;
        m3495d();
        if (VERSION.SDK_INT < 11) {
            m3493b();
        }
    }
}
