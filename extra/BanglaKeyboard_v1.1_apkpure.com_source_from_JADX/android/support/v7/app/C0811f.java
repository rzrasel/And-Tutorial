package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C0819a.C0813a;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.view.C0826i;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.view.C0944g;
import android.support.v7.view.menu.C0131h;
import android.support.v7.widget.TintTypedArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;

abstract class C0811f extends C0810e {
    private static boolean f2438p = true;
    private static final boolean f2439q;
    private static final int[] f2440r = new int[]{16842836};
    final Context f2441b;
    final Window f2442c;
    final Callback f2443d = this.f2442c.getCallback();
    final Callback f2444e;
    final C0233d f2445f;
    ActionBar f2446g;
    MenuInflater f2447h;
    boolean f2448i;
    boolean f2449j;
    boolean f2450k;
    boolean f2451l;
    boolean f2452m;
    CharSequence f2453n;
    boolean f2454o;
    private boolean f2455s;

    private class C0825a implements C0813a {
        final /* synthetic */ C0811f f2509a;

        C0825a(C0811f c0811f) {
            this.f2509a = c0811f;
        }

        public final Drawable mo781a() {
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f2509a.m2312n(), null, new int[]{C0770a.homeAsUpIndicator});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public final void mo782a(int i) {
            ActionBar a = this.f2509a.mo751a();
            if (a != null) {
                a.mo811b(i);
            }
        }

        public final void mo783a(Drawable drawable, int i) {
            ActionBar a = this.f2509a.mo751a();
            if (a != null) {
                a.mo805a(drawable);
                a.mo811b(i);
            }
        }

        public final Context mo784b() {
            return this.f2509a.m2312n();
        }

        public final boolean mo785c() {
            ActionBar a = this.f2509a.mo751a();
            return (a == null || (a.mo814c() & 4) == 0) ? false : true;
        }
    }

    class C0827b extends C0826i {
        final /* synthetic */ C0811f f2511a;

        C0827b(C0811f c0811f, Callback callback) {
            this.f2511a = c0811f;
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f2511a.mo768a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || this.f2511a.mo767a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return (i != 0 || (menu instanceof C0131h)) ? super.onCreatePanelMenu(i, menu) : false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.f2511a.mo776e(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.f2511a.mo775d(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0131h c0131h = menu instanceof C0131h ? (C0131h) menu : null;
            if (i == 0 && c0131h == null) {
                return false;
            }
            if (c0131h != null) {
                c0131h.f499k = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0131h == null) {
                return onPreparePanel;
            }
            c0131h.f499k = false;
            return onPreparePanel;
        }
    }

    static {
        boolean z = VERSION.SDK_INT < 21;
        f2439q = z;
        if (z && !f2438p) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    Object obj = null;
                    if (th instanceof NotFoundException) {
                        String message = th.getMessage();
                        if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        Throwable notFoundException = new NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C0811f(Context context, Window window, C0233d c0233d) {
        this.f2441b = context;
        this.f2442c = window;
        this.f2445f = c0233d;
        if (this.f2443d instanceof C0827b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f2444e = mo798a(this.f2443d);
        this.f2442c.setCallback(this.f2444e);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, f2440r);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.f2442c.setBackgroundDrawable(drawableIfKnown);
        }
        obtainStyledAttributes.recycle();
    }

    public final ActionBar mo751a() {
        mo780m();
        return this.f2446g;
    }

    Callback mo798a(Callback callback) {
        return new C0827b(this, callback);
    }

    public final void mo752a(CharSequence charSequence) {
        this.f2453n = charSequence;
        mo772b(charSequence);
    }

    abstract boolean mo767a(int i, KeyEvent keyEvent);

    abstract boolean mo768a(KeyEvent keyEvent);

    abstract C0852b mo769b(C0806a c0806a);

    public final MenuInflater mo753b() {
        if (this.f2447h == null) {
            mo780m();
            this.f2447h = new C0944g(this.f2446g != null ? this.f2446g.mo816d() : this.f2441b);
        }
        return this.f2447h;
    }

    public void mo754b(Bundle bundle) {
    }

    abstract void mo772b(CharSequence charSequence);

    public void mo755d() {
        this.f2455s = true;
    }

    abstract void mo775d(int i);

    public void mo756e() {
        this.f2455s = false;
    }

    abstract boolean mo776e(int i);

    public void mo757h() {
        this.f2454o = true;
    }

    public final C0813a mo758i() {
        return new C0825a(this);
    }

    public boolean mo759k() {
        return false;
    }

    abstract void mo780m();

    final Context m2312n() {
        Context context = null;
        ActionBar a = mo751a();
        if (a != null) {
            context = a.mo816d();
        }
        return context == null ? this.f2441b : context;
    }
}
