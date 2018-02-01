package com.bumptech.glide.p036f.p039a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.p036f.p039a.C1119c.C1121a;

public final class C1120b<T extends Drawable> implements C1119c<T> {
    private final C1119c<T> f3352a;
    private final int f3353b;

    public C1120b(C1119c<T> c1119c, int i) {
        this.f3352a = c1119c;
        this.f3353b = i;
    }

    public final /* synthetic */ boolean mo1299a(Object obj, C1121a c1121a) {
        Drawable drawable = (Drawable) obj;
        if (c1121a.mo1312d() != null) {
            Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{c1121a.mo1312d(), drawable});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(this.f3353b);
            c1121a.mo1311c(transitionDrawable);
            return true;
        }
        this.f3352a.mo1299a(drawable, c1121a);
        return false;
    }
}
