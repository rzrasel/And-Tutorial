package com.bumptech.glide.load.resource.p040a;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p044b.C1241l;

public abstract class C1303a<T extends Drawable> implements C1241l<T> {
    public final T f3687a;

    public C1303a(T t) {
        if (t == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.f3687a = t;
    }

    public final /* synthetic */ Object mo1367a() {
        return this.f3687a.getConstantState().newDrawable();
    }
}
