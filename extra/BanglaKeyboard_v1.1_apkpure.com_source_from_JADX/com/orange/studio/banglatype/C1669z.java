package com.orange.studio.banglatype;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.p036f.p037b.C1130c;
import com.bumptech.glide.p036f.p037b.C1137h;
import com.bumptech.glide.p036f.p039a.C1119c;

public class C1669z extends C1130c<C1136b> {
    private int f7870b;
    private C1136b f7871c;
    private ColorMatrix f7872d;

    public C1669z(ImageView imageView, ColorMatrix colorMatrix) {
        this(imageView, colorMatrix, (byte) 0);
    }

    private C1669z(ImageView imageView, ColorMatrix colorMatrix, byte b) {
        super(imageView);
        this.f7870b = -1;
        this.f7872d = colorMatrix;
    }

    private void m7131a(C1136b c1136b) {
        ((ImageView) this.a).setImageDrawable(c1136b);
    }

    public final void m7132a(ColorMatrix colorMatrix) {
        this.f7872d = colorMatrix;
        if (this.f7871c != null && colorMatrix != null) {
            ColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            this.f7871c.mutate();
            this.f7871c.setColorFilter(colorMatrixColorFilter);
            this.f7871c.mo1314a(this.f7870b);
            m7131a(this.f7871c);
        }
    }

    public final void mo1281a(Drawable drawable) {
        super.mo1281a(drawable);
    }

    public void mo2351a(C1136b c1136b, C1119c<? super C1136b> c1119c) {
        Object c1137h;
        if (!c1136b.mo1315a()) {
            float intrinsicWidth = ((float) c1136b.getIntrinsicWidth()) / ((float) c1136b.getIntrinsicHeight());
            if (Math.abs((((float) ((ImageView) this.a).getWidth()) / ((float) ((ImageView) this.a).getHeight())) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                c1137h = new C1137h(c1136b, ((ImageView) this.a).getWidth());
            }
        }
        if (!(c1137h == null || this.f7872d == null)) {
            ColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.f7872d);
            c1137h.mutate();
            c1137h.setColorFilter(colorMatrixColorFilter);
        }
        super.mo1290a(c1137h, (C1119c) c1119c);
        this.f7871c = c1137h;
        c1137h.mo1314a(this.f7870b);
        c1137h.start();
    }

    public void mo1283a(Exception exception, Drawable drawable) {
        super.mo1283a(exception, drawable);
    }

    public final void mo1285b() {
        if (this.f7871c != null) {
            this.f7871c.start();
        }
    }

    public void mo1286b(Drawable drawable) {
        super.mo1286b(drawable);
    }

    public final void mo1287c() {
        if (this.f7871c != null) {
            this.f7871c.stop();
        }
    }

    public final void mo1311c(Drawable drawable) {
        if (!(drawable == null || this.f7872d == null)) {
            ColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.f7872d);
            drawable.mutate();
            drawable.setColorFilter(colorMatrixColorFilter);
        }
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
