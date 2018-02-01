package android.support.v7.view;

import android.animation.TimeInterpolator;
import android.support.v4.view.C0691w;
import android.support.v4.view.C0693v;
import android.support.v4.view.C0694x;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class C0946h {
    public final ArrayList<C0693v> f2941a = new ArrayList();
    C0691w f2942b;
    boolean f2943c;
    private long f2944d = -1;
    private Interpolator f2945e;
    private final C0694x f2946f = new C09451(this);

    class C09451 extends C0694x {
        final /* synthetic */ C0946h f2938a;
        private boolean f2939b = false;
        private int f2940c = 0;

        C09451(C0946h c0946h) {
            this.f2938a = c0946h;
        }

        public final void onAnimationEnd(View view) {
            int i = this.f2940c + 1;
            this.f2940c = i;
            if (i == this.f2938a.f2941a.size()) {
                if (this.f2938a.f2942b != null) {
                    this.f2938a.f2942b.onAnimationEnd(null);
                }
                this.f2940c = 0;
                this.f2939b = false;
                this.f2938a.f2943c = false;
            }
        }

        public final void onAnimationStart(View view) {
            if (!this.f2939b) {
                this.f2939b = true;
                if (this.f2938a.f2942b != null) {
                    this.f2938a.f2942b.onAnimationStart(null);
                }
            }
        }
    }

    public final C0946h m2752a(C0693v c0693v) {
        if (!this.f2943c) {
            this.f2941a.add(c0693v);
        }
        return this;
    }

    public final C0946h m2753a(C0691w c0691w) {
        if (!this.f2943c) {
            this.f2942b = c0691w;
        }
        return this;
    }

    public final C0946h m2754a(Interpolator interpolator) {
        if (!this.f2943c) {
            this.f2945e = interpolator;
        }
        return this;
    }

    public final void m2755a() {
        if (!this.f2943c) {
            Iterator it = this.f2941a.iterator();
            while (it.hasNext()) {
                C0693v c0693v = (C0693v) it.next();
                if (this.f2944d >= 0) {
                    c0693v.m1984a(this.f2944d);
                }
                if (this.f2945e != null) {
                    TimeInterpolator timeInterpolator = this.f2945e;
                    View view = (View) c0693v.f1997a.get();
                    if (view != null) {
                        view.animate().setInterpolator(timeInterpolator);
                    }
                }
                if (this.f2942b != null) {
                    c0693v.m1985a(this.f2946f);
                }
                c0693v.m1989b();
            }
            this.f2943c = true;
        }
    }

    public final void m2756b() {
        if (this.f2943c) {
            Iterator it = this.f2941a.iterator();
            while (it.hasNext()) {
                ((C0693v) it.next()).m1987a();
            }
            this.f2943c = false;
        }
    }

    public final C0946h m2757c() {
        if (!this.f2943c) {
            this.f2944d = 250;
        }
        return this;
    }
}
