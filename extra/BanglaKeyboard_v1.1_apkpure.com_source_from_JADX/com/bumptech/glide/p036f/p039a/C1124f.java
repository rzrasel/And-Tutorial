package com.bumptech.glide.p036f.p039a;

import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.p036f.p039a.C1119c.C1121a;

public final class C1124f<R> implements C1119c<R> {
    private final C1115a f3356a;

    interface C1115a {
        Animation mo1297a();
    }

    C1124f(C1115a c1115a) {
        this.f3356a = c1115a;
    }

    public final boolean mo1299a(R r, C1121a c1121a) {
        View a = c1121a.m3038a();
        if (a != null) {
            a.clearAnimation();
            a.startAnimation(this.f3356a.mo1297a());
        }
        return false;
    }
}
