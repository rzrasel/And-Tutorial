package com.bumptech.glide.p036f.p037b;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p036f.p039a.C1119c;
import com.bumptech.glide.p036f.p039a.C1119c.C1121a;

public abstract class C1130c<Z> extends C1105j<ImageView, Z> implements C1121a {
    public C1130c(ImageView imageView) {
        super(imageView);
    }

    public void mo1281a(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void mo1283a(Exception exception, Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public abstract void mo1313a(Z z);

    public void mo1290a(Z z, C1119c<? super Z> c1119c) {
        if (c1119c == null || !c1119c.mo1299a(z, this)) {
            mo1313a((Object) z);
        }
    }

    public void mo1286b(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void mo1311c(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public final Drawable mo1312d() {
        return ((ImageView) this.a).getDrawable();
    }
}
