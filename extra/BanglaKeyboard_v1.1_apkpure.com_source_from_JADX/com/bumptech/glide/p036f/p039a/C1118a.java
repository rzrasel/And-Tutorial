package com.bumptech.glide.p036f.p039a;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bumptech.glide.p036f.p039a.C1124f.C1115a;

public final class C1118a<T extends Drawable> implements C1117d<T> {
    private final C1125g<T> f3348a;
    private final int f3349b;
    private C1120b<T> f3350c;
    private C1120b<T> f3351d;

    private static class C1116a implements C1115a {
        private final int f3347a;

        C1116a(int i) {
            this.f3347a = i;
        }

        public final Animation mo1297a() {
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.f3347a);
            return alphaAnimation;
        }
    }

    public C1118a() {
        this(300);
    }

    public C1118a(int i) {
        this(new C1125g(new C1116a(i)), i);
    }

    private C1118a(C1125g<T> c1125g, int i) {
        this.f3348a = c1125g;
        this.f3349b = i;
    }

    public final C1119c<T> mo1298a(boolean z, boolean z2) {
        if (z) {
            return C1123e.m3043b();
        }
        if (z2) {
            if (this.f3350c == null) {
                this.f3350c = new C1120b(this.f3348a.mo1298a(false, true), this.f3349b);
            }
            return this.f3350c;
        }
        if (this.f3351d == null) {
            this.f3351d = new C1120b(this.f3348a.mo1298a(false, false), this.f3349b);
        }
        return this.f3351d;
    }
}
