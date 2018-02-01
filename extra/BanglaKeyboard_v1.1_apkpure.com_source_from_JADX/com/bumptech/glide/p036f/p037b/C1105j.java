package com.bumptech.glide.p036f.p037b;

import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.p036f.C1126b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class C1105j<T extends View, Z> extends C1104a<Z> {
    private static boolean f3306b = false;
    private static Integer f3307c = null;
    public final T f3308a;
    private final C1139a f3309d;

    private static class C1139a {
        final View f3399a;
        final List<C1127g> f3400b = new ArrayList();
        C1138a f3401c;
        private Point f3402d;

        private static class C1138a implements OnPreDrawListener {
            private final WeakReference<C1139a> f3398a;

            public C1138a(C1139a c1139a) {
                this.f3398a = new WeakReference(c1139a);
            }

            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    new StringBuilder("OnGlobalLayoutListener called listener=").append(this);
                }
                C1139a c1139a = (C1139a) this.f3398a.get();
                if (c1139a != null) {
                    C1139a.m3098a(c1139a);
                }
                return true;
            }
        }

        public C1139a(View view) {
            this.f3399a = view;
        }

        private int m3097a(int i, boolean z) {
            if (i != -2) {
                return i;
            }
            if (this.f3402d == null) {
                Display defaultDisplay = ((WindowManager) this.f3399a.getContext().getSystemService("window")).getDefaultDisplay();
                if (VERSION.SDK_INT >= 13) {
                    this.f3402d = new Point();
                    defaultDisplay.getSize(this.f3402d);
                } else {
                    this.f3402d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
                }
            }
            Point point = this.f3402d;
            return z ? point.y : point.x;
        }

        static /* synthetic */ void m3098a(C1139a c1139a) {
            if (!c1139a.f3400b.isEmpty()) {
                int b = c1139a.m3101b();
                int a = c1139a.m3100a();
                if (C1139a.m3099a(b) && C1139a.m3099a(a)) {
                    for (C1127g a2 : c1139a.f3400b) {
                        a2.mo1301a(b, a);
                    }
                    c1139a.f3400b.clear();
                    ViewTreeObserver viewTreeObserver = c1139a.f3399a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(c1139a.f3401c);
                    }
                    c1139a.f3401c = null;
                }
            }
        }

        static boolean m3099a(int i) {
            return i > 0 || i == -2;
        }

        final int m3100a() {
            LayoutParams layoutParams = this.f3399a.getLayoutParams();
            return C1139a.m3099a(this.f3399a.getHeight()) ? this.f3399a.getHeight() : layoutParams != null ? m3097a(layoutParams.height, true) : 0;
        }

        final int m3101b() {
            LayoutParams layoutParams = this.f3399a.getLayoutParams();
            return C1139a.m3099a(this.f3399a.getWidth()) ? this.f3399a.getWidth() : layoutParams != null ? m3097a(layoutParams.width, false) : 0;
        }
    }

    public C1105j(T t) {
        if (t == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.f3308a = t;
        this.f3309d = new C1139a(t);
    }

    public final T m2988a() {
        return this.f3308a;
    }

    public final void mo1289a(C1127g c1127g) {
        C1139a c1139a = this.f3309d;
        int b = c1139a.m3101b();
        int a = c1139a.m3100a();
        if (C1139a.m3099a(b) && C1139a.m3099a(a)) {
            c1127g.mo1301a(b, a);
            return;
        }
        if (!c1139a.f3400b.contains(c1127g)) {
            c1139a.f3400b.add(c1127g);
        }
        if (c1139a.f3401c == null) {
            ViewTreeObserver viewTreeObserver = c1139a.f3399a.getViewTreeObserver();
            c1139a.f3401c = new C1138a(c1139a);
            viewTreeObserver.addOnPreDrawListener(c1139a.f3401c);
        }
    }

    public final void mo1282a(C1126b c1126b) {
        if (f3307c == null) {
            f3306b = true;
            this.f3308a.setTag(c1126b);
            return;
        }
        this.f3308a.setTag(f3307c.intValue(), c1126b);
    }

    public final C1126b mo1288e() {
        Object tag = f3307c == null ? this.f3308a.getTag() : this.f3308a.getTag(f3307c.intValue());
        if (tag == null) {
            return null;
        }
        if (tag instanceof C1126b) {
            return (C1126b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        return "Target for: " + this.f3308a;
    }
}
