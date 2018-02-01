package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.p017e.C0473f;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

final class C0238f {
    private static final boolean f958k = (VERSION.SDK_INT < 18);
    private static final Paint f959l = null;
    private boolean f960A;
    private boolean f961B;
    private Bitmap f962C;
    private Paint f963D;
    private float f964E;
    private float f965F;
    private float f966G;
    private float f967H;
    private int[] f968I;
    private boolean f969J;
    private final TextPaint f970K;
    private Interpolator f971L;
    private float f972M;
    private float f973N;
    private float f974O;
    private int f975P;
    private float f976Q;
    private float f977R;
    private float f978S;
    private int f979T;
    float f980a;
    int f981b = 16;
    int f982c = 16;
    float f983d = 15.0f;
    float f984e = 15.0f;
    ColorStateList f985f;
    Typeface f986g;
    Typeface f987h;
    CharSequence f988i;
    Interpolator f989j;
    private final View f990m;
    private boolean f991n;
    private final Rect f992o;
    private final Rect f993p;
    private final RectF f994q;
    private ColorStateList f995r;
    private float f996s;
    private float f997t;
    private float f998u;
    private float f999v;
    private float f1000w;
    private float f1001x;
    private Typeface f1002y;
    private CharSequence f1003z;

    public C0238f(View view) {
        this.f990m = view;
        this.f970K = new TextPaint(129);
        this.f993p = new Rect();
        this.f992o = new Rect();
        this.f994q = new RectF();
    }

    private static float m610a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return C0215a.m594a(f, f2, f3);
    }

    private static int m611a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((f2 * ((float) Color.blue(i))) + (((float) Color.blue(i2)) * f)));
    }

    private static boolean m612a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static boolean m613a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    static boolean m614a(Typeface typeface, Typeface typeface2) {
        return !(typeface == null || typeface.equals(typeface2)) || (typeface == null && typeface2 != null);
    }

    private void m615b(float f) {
        this.f994q.left = C0238f.m610a((float) this.f992o.left, (float) this.f993p.left, f, this.f989j);
        this.f994q.top = C0238f.m610a(this.f996s, this.f997t, f, this.f989j);
        this.f994q.right = C0238f.m610a((float) this.f992o.right, (float) this.f993p.right, f, this.f989j);
        this.f994q.bottom = C0238f.m610a((float) this.f992o.bottom, (float) this.f993p.bottom, f, this.f989j);
        this.f1000w = C0238f.m610a(this.f998u, this.f999v, f, this.f989j);
        this.f1001x = C0238f.m610a(this.f996s, this.f997t, f, this.f989j);
        m617c(C0238f.m610a(this.f983d, this.f984e, f, this.f971L));
        if (this.f985f != this.f995r) {
            this.f970K.setColor(C0238f.m611a(this.f968I != null ? this.f995r.getColorForState(this.f968I, 0) : this.f995r.getDefaultColor(), m620e(), f));
        } else {
            this.f970K.setColor(m620e());
        }
        this.f970K.setShadowLayer(C0238f.m610a(this.f976Q, this.f972M, f, null), C0238f.m610a(this.f977R, this.f973N, f, null), C0238f.m610a(this.f978S, this.f974O, f, null), C0238f.m611a(this.f979T, this.f975P, f));
        C0679r.m1928c(this.f990m);
    }

    private void m616c() {
        boolean z = this.f993p.width() > 0 && this.f993p.height() > 0 && this.f992o.width() > 0 && this.f992o.height() > 0;
        this.f991n = z;
    }

    private void m617c(float f) {
        m619d(f);
        boolean z = f958k && this.f966G != 1.0f;
        this.f961B = z;
        if (this.f961B && this.f962C == null && !this.f992o.isEmpty() && !TextUtils.isEmpty(this.f1003z)) {
            m615b(0.0f);
            this.f964E = this.f970K.ascent();
            this.f965F = this.f970K.descent();
            int round = Math.round(this.f970K.measureText(this.f1003z, 0, this.f1003z.length()));
            int round2 = Math.round(this.f965F - this.f964E);
            if (round > 0 && round2 > 0) {
                this.f962C = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                new Canvas(this.f962C).drawText(this.f1003z, 0, this.f1003z.length(), 0.0f, ((float) round2) - this.f970K.descent(), this.f970K);
                if (this.f963D == null) {
                    this.f963D = new Paint(3);
                }
            }
        }
        C0679r.m1928c(this.f990m);
    }

    private void m618d() {
        m615b(this.f980a);
    }

    private void m619d(float f) {
        boolean z = true;
        if (this.f988i != null) {
            float f2;
            boolean z2;
            float width = (float) this.f993p.width();
            float width2 = (float) this.f992o.width();
            if (C0238f.m612a(f, this.f984e)) {
                f2 = this.f984e;
                this.f966G = 1.0f;
                if (C0238f.m614a(this.f1002y, this.f986g)) {
                    this.f1002y = this.f986g;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                f2 = this.f983d;
                if (C0238f.m614a(this.f1002y, this.f987h)) {
                    this.f1002y = this.f987h;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (C0238f.m612a(f, this.f983d)) {
                    this.f966G = 1.0f;
                } else {
                    this.f966G = f / this.f983d;
                }
                float f3 = this.f984e / this.f983d;
                width = width2 * f3 > width ? Math.min(width / f3, width2) : width2;
            }
            if (width > 0.0f) {
                z2 = this.f967H != f2 || this.f969J || z2;
                this.f967H = f2;
                this.f969J = false;
            }
            if (this.f1003z == null || r0) {
                this.f970K.setTextSize(this.f967H);
                this.f970K.setTypeface(this.f1002y);
                this.f970K.setLinearText(this.f966G != 1.0f);
                CharSequence ellipsize = TextUtils.ellipsize(this.f988i, this.f970K, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f1003z)) {
                    this.f1003z = ellipsize;
                    CharSequence charSequence = this.f1003z;
                    if (C0679r.m1932e(this.f990m) != 1) {
                        z = false;
                    }
                    this.f960A = (z ? C0473f.f1507d : C0473f.f1506c).mo473a(charSequence, charSequence.length());
                }
            }
        }
    }

    private int m620e() {
        return this.f968I != null ? this.f985f.getColorForState(this.f968I, 0) : this.f985f.getDefaultColor();
    }

    private Typeface m621e(int i) {
        TypedArray obtainStyledAttributes = this.f990m.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m622f() {
        if (this.f962C != null) {
            this.f962C.recycle();
            this.f962C = null;
        }
    }

    final Typeface m623a() {
        return this.f986g != null ? this.f986g : Typeface.DEFAULT;
    }

    final void m624a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f980a) {
            this.f980a = f;
            m618d();
        }
    }

    final void m625a(int i) {
        if (this.f981b != i) {
            this.f981b = i;
            m633b();
        }
    }

    final void m626a(int i, int i2, int i3, int i4) {
        if (!C0238f.m613a(this.f992o, i, i2, i3, i4)) {
            this.f992o.set(i, i2, i3, i4);
            this.f969J = true;
            m616c();
        }
    }

    final void m627a(ColorStateList colorStateList) {
        if (this.f985f != colorStateList) {
            this.f985f = colorStateList;
            m633b();
        }
    }

    public final void m628a(Canvas canvas) {
        int save = canvas.save();
        if (this.f1003z != null && this.f991n) {
            float f;
            float f2 = this.f1000w;
            float f3 = this.f1001x;
            int i = (!this.f961B || this.f962C == null) ? 0 : 1;
            if (i != 0) {
                f = this.f964E * this.f966G;
            } else {
                this.f970K.ascent();
                f = 0.0f;
                this.f970K.descent();
            }
            if (i != 0) {
                f3 += f;
            }
            if (this.f966G != 1.0f) {
                canvas.scale(this.f966G, this.f966G, f2, f3);
            }
            if (i != 0) {
                canvas.drawBitmap(this.f962C, f2, f3, this.f963D);
            } else {
                canvas.drawText(this.f1003z, 0, this.f1003z.length(), f2, f3, this.f970K);
            }
        }
        canvas.restoreToCount(save);
    }

    final void m629a(Typeface typeface) {
        this.f987h = typeface;
        this.f986g = typeface;
        m633b();
    }

    final void m630a(Interpolator interpolator) {
        this.f971L = interpolator;
        m633b();
    }

    final void m631a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f988i)) {
            this.f988i = charSequence;
            this.f1003z = null;
            m622f();
            m633b();
        }
    }

    final boolean m632a(int[] iArr) {
        this.f968I = iArr;
        boolean z = (this.f985f != null && this.f985f.isStateful()) || (this.f995r != null && this.f995r.isStateful());
        if (!z) {
            return false;
        }
        m633b();
        return true;
    }

    public final void m633b() {
        int i = 1;
        float f = 0.0f;
        if (this.f990m.getHeight() > 0 && this.f990m.getWidth() > 0) {
            float f2 = this.f967H;
            m619d(this.f984e);
            float measureText = this.f1003z != null ? this.f970K.measureText(this.f1003z, 0, this.f1003z.length()) : 0.0f;
            int a = C0656d.m1743a(this.f982c, this.f960A ? 1 : 0);
            switch (a & 112) {
                case 48:
                    this.f997t = ((float) this.f993p.top) - this.f970K.ascent();
                    break;
                case 80:
                    this.f997t = (float) this.f993p.bottom;
                    break;
                default:
                    this.f997t = (((this.f970K.descent() - this.f970K.ascent()) / 2.0f) - this.f970K.descent()) + ((float) this.f993p.centerY());
                    break;
            }
            switch (a & 8388615) {
                case 1:
                    this.f999v = ((float) this.f993p.centerX()) - (measureText / 2.0f);
                    break;
                case 5:
                    this.f999v = ((float) this.f993p.right) - measureText;
                    break;
                default:
                    this.f999v = (float) this.f993p.left;
                    break;
            }
            m619d(this.f983d);
            if (this.f1003z != null) {
                f = this.f970K.measureText(this.f1003z, 0, this.f1003z.length());
            }
            int i2 = this.f981b;
            if (!this.f960A) {
                i = 0;
            }
            i2 = C0656d.m1743a(i2, i);
            switch (i2 & 112) {
                case 48:
                    this.f996s = ((float) this.f992o.top) - this.f970K.ascent();
                    break;
                case 80:
                    this.f996s = (float) this.f992o.bottom;
                    break;
                default:
                    this.f996s = (((this.f970K.descent() - this.f970K.ascent()) / 2.0f) - this.f970K.descent()) + ((float) this.f992o.centerY());
                    break;
            }
            switch (i2 & 8388615) {
                case 1:
                    this.f998u = ((float) this.f992o.centerX()) - (f / 2.0f);
                    break;
                case 5:
                    this.f998u = ((float) this.f992o.right) - f;
                    break;
                default:
                    this.f998u = (float) this.f992o.left;
                    break;
            }
            m622f();
            m617c(f2);
            m618d();
        }
    }

    final void m634b(int i) {
        if (this.f982c != i) {
            this.f982c = i;
            m633b();
        }
    }

    final void m635b(int i, int i2, int i3, int i4) {
        if (!C0238f.m613a(this.f993p, i, i2, i3, i4)) {
            this.f993p.set(i, i2, i3, i4);
            this.f969J = true;
            m616c();
        }
    }

    final void m636b(ColorStateList colorStateList) {
        if (this.f995r != colorStateList) {
            this.f995r = colorStateList;
            m633b();
        }
    }

    final void m637c(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f990m.getContext(), i, C0779j.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0779j.TextAppearance_android_textColor)) {
            this.f985f = obtainStyledAttributes.getColorStateList(C0779j.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(C0779j.TextAppearance_android_textSize)) {
            this.f984e = (float) obtainStyledAttributes.getDimensionPixelSize(C0779j.TextAppearance_android_textSize, (int) this.f984e);
        }
        this.f975P = obtainStyledAttributes.getInt(C0779j.TextAppearance_android_shadowColor, 0);
        this.f973N = obtainStyledAttributes.getFloat(C0779j.TextAppearance_android_shadowDx, 0.0f);
        this.f974O = obtainStyledAttributes.getFloat(C0779j.TextAppearance_android_shadowDy, 0.0f);
        this.f972M = obtainStyledAttributes.getFloat(C0779j.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.f986g = m621e(i);
        }
        m633b();
    }

    final void m638d(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f990m.getContext(), i, C0779j.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0779j.TextAppearance_android_textColor)) {
            this.f995r = obtainStyledAttributes.getColorStateList(C0779j.TextAppearance_android_textColor);
        }
        if (obtainStyledAttributes.hasValue(C0779j.TextAppearance_android_textSize)) {
            this.f983d = (float) obtainStyledAttributes.getDimensionPixelSize(C0779j.TextAppearance_android_textSize, (int) this.f983d);
        }
        this.f979T = obtainStyledAttributes.getInt(C0779j.TextAppearance_android_shadowColor, 0);
        this.f977R = obtainStyledAttributes.getFloat(C0779j.TextAppearance_android_shadowDx, 0.0f);
        this.f978S = obtainStyledAttributes.getFloat(C0779j.TextAppearance_android_shadowDy, 0.0f);
        this.f976Q = obtainStyledAttributes.getFloat(C0779j.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.f987h = m621e(i);
        }
        m633b();
    }
}
