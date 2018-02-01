package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import java.lang.ref.WeakReference;

public final class C0693v {
    public WeakReference<View> f1997a;
    Runnable f1998b = null;
    Runnable f1999c = null;
    int f2000d = -1;

    static class C0692a implements C0691w {
        C0693v f1995a;
        boolean f1996b;

        C0692a(C0693v c0693v) {
            this.f1995a = c0693v;
        }

        public final void onAnimationCancel(View view) {
            Object tag = view.getTag(2113929216);
            C0691w c0691w = tag instanceof C0691w ? (C0691w) tag : null;
            if (c0691w != null) {
                c0691w.onAnimationCancel(view);
            }
        }

        public final void onAnimationEnd(View view) {
            if (this.f1995a.f2000d >= 0) {
                view.setLayerType(this.f1995a.f2000d, null);
                this.f1995a.f2000d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f1996b) {
                if (this.f1995a.f1999c != null) {
                    Runnable runnable = this.f1995a.f1999c;
                    this.f1995a.f1999c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                C0691w c0691w = tag instanceof C0691w ? (C0691w) tag : null;
                if (c0691w != null) {
                    c0691w.onAnimationEnd(view);
                }
                this.f1996b = true;
            }
        }

        public final void onAnimationStart(View view) {
            this.f1996b = false;
            if (this.f1995a.f2000d >= 0) {
                view.setLayerType(2, null);
            }
            if (this.f1995a.f1998b != null) {
                Runnable runnable = this.f1995a.f1998b;
                this.f1995a.f1998b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            C0691w c0691w = tag instanceof C0691w ? (C0691w) tag : null;
            if (c0691w != null) {
                c0691w.onAnimationStart(view);
            }
        }
    }

    C0693v(View view) {
        this.f1997a = new WeakReference(view);
    }

    private void m1982a(final View view, final C0691w c0691w) {
        if (c0691w != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ C0693v f1991c;

                public final void onAnimationCancel(Animator animator) {
                    c0691w.onAnimationCancel(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    c0691w.onAnimationEnd(view);
                }

                public final void onAnimationStart(Animator animator) {
                    c0691w.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public final C0693v m1983a(float f) {
        View view = (View) this.f1997a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final C0693v m1984a(long j) {
        View view = (View) this.f1997a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final C0693v m1985a(C0691w c0691w) {
        View view = (View) this.f1997a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m1982a(view, c0691w);
            } else {
                view.setTag(2113929216, c0691w);
                m1982a(view, new C0692a(this));
            }
        }
        return this;
    }

    public final C0693v m1986a(final C0695y c0695y) {
        final View view = (View) this.f1997a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            AnimatorUpdateListener animatorUpdateListener = null;
            if (c0695y != null) {
                animatorUpdateListener = new AnimatorUpdateListener(this) {
                    final /* synthetic */ C0693v f1994c;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        c0695y.mo825a();
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public final void m1987a() {
        View view = (View) this.f1997a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final C0693v m1988b(float f) {
        View view = (View) this.f1997a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final void m1989b() {
        View view = (View) this.f1997a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
