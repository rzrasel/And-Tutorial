package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@TargetApi(14)
@aqv
public final class xh implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static final long f7396b = ((Long) zzbv.zzen().m4217a(ado.aW)).longValue();
    HashSet<xl> f7397a = new HashSet();
    private final Context f7398c;
    private Application f7399d;
    private final WindowManager f7400e;
    private final PowerManager f7401f;
    private final KeyguardManager f7402g;
    private BroadcastReceiver f7403h;
    private WeakReference<ViewTreeObserver> f7404i;
    private WeakReference<View> f7405j;
    private xm f7406k;
    private hr f7407l = new hr(f7396b);
    private boolean f7408m = false;
    private int f7409n = -1;
    private DisplayMetrics f7410o;

    public xh(Context context, View view) {
        this.f7398c = context.getApplicationContext();
        this.f7400e = (WindowManager) context.getSystemService("window");
        this.f7401f = (PowerManager) this.f7398c.getSystemService("power");
        this.f7402g = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f7398c instanceof Application) {
            this.f7399d = (Application) this.f7398c;
            this.f7406k = new xm((Application) this.f7398c, this);
        }
        this.f7410o = context.getResources().getDisplayMetrics();
        View view2 = this.f7405j != null ? (View) this.f7405j.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m6987b(view2);
        }
        this.f7405j = new WeakReference(view);
        if (view != null) {
            if (zzbv.zzec().mo2113a(view)) {
                m6984a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect m6981a(Rect rect) {
        return new Rect(m6986b(rect.left), m6986b(rect.top), m6986b(rect.right), m6986b(rect.bottom));
    }

    private final void m6982a() {
        zzbv.zzea();
        gb.f6131a.post(new xi(this));
    }

    private final void m6983a(Activity activity, int i) {
        if (this.f7405j != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f7405j.get();
                if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                    this.f7409n = i;
                }
            }
        }
    }

    private final void m6984a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7404i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f7403h == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f7403h = new xj(this);
            this.f7398c.registerReceiver(this.f7403h, intentFilter);
        }
        if (this.f7399d != null) {
            try {
                this.f7399d.registerActivityLifecycleCallbacks(this.f7406k);
            } catch (Exception e) {
                id.m5372a(6);
            }
        }
    }

    private final int m6986b(int i) {
        return (int) (((float) i) / this.f7410o.density);
    }

    private final void m6987b(View view) {
        ViewTreeObserver viewTreeObserver;
        try {
            if (this.f7404i != null) {
                viewTreeObserver = (ViewTreeObserver) this.f7404i.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f7404i = null;
            }
        } catch (Exception e) {
            id.m5372a(6);
        }
        try {
            viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this);
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            id.m5372a(6);
        }
        if (this.f7403h != null) {
            try {
                this.f7398c.unregisterReceiver(this.f7403h);
            } catch (IllegalStateException e3) {
                id.m5372a(6);
            } catch (Throwable e4) {
                zzbv.zzee().m5336a(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f7403h = null;
        }
        if (this.f7399d != null) {
            try {
                this.f7399d.unregisterActivityLifecycleCallbacks(this.f7406k);
            } catch (Exception e5) {
                id.m5372a(6);
            }
        }
    }

    final void m6988a(int i) {
        if (this.f7397a.size() != 0 && this.f7405j != null) {
            boolean z;
            xk xkVar;
            Iterator it;
            View view = (View) this.f7405j.get();
            Object obj = i == 1 ? 1 : null;
            Object obj2 = view == null ? 1 : null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            boolean z2 = false;
            Rect rect3 = new Rect();
            boolean z3 = false;
            Rect rect4 = new Rect();
            Rect rect5 = new Rect();
            rect5.right = this.f7400e.getDefaultDisplay().getWidth();
            rect5.bottom = this.f7400e.getDefaultDisplay().getHeight();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                z2 = view.getGlobalVisibleRect(rect2);
                z3 = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    id.m5372a(6);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.f7409n != -1) {
                windowVisibility = this.f7409n;
            }
            if (obj2 == null) {
                zzbv.zzea();
                if (gb.m5460a(view, this.f7401f, this.f7402g) && z2 && z3 && r4 == 0) {
                    z = true;
                    if (obj != null || this.f7407l.m5599a() || z != this.f7408m) {
                        if (z || this.f7408m || i != 1) {
                            xkVar = new xk(zzbv.zzeg().mo1670b(), this.f7401f.isScreenOn(), view == null ? zzbv.zzec().mo2113a(view) : false, view == null ? view.getWindowVisibility() : 8, m6981a(rect5), m6981a(rect), m6981a(rect2), z2, m6981a(rect3), z3, m6981a(rect4), this.f7410o.density, z);
                            it = this.f7397a.iterator();
                            while (it.hasNext()) {
                                ((xl) it.next()).mo2085a(xkVar);
                            }
                            this.f7408m = z;
                        }
                        return;
                    }
                    return;
                }
            }
            z = false;
            if (obj != null) {
            }
            if (!z) {
            }
            if (view == null) {
            }
            if (view == null) {
            }
            xkVar = new xk(zzbv.zzeg().mo1670b(), this.f7401f.isScreenOn(), view == null ? zzbv.zzec().mo2113a(view) : false, view == null ? view.getWindowVisibility() : 8, m6981a(rect5), m6981a(rect), m6981a(rect2), z2, m6981a(rect3), z3, m6981a(rect4), this.f7410o.density, z);
            it = this.f7397a.iterator();
            while (it.hasNext()) {
                ((xl) it.next()).mo2085a(xkVar);
            }
            this.f7408m = z;
        }
    }

    public final void m6989a(xl xlVar) {
        this.f7397a.add(xlVar);
        m6988a(3);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m6983a(activity, 0);
        m6988a(3);
        m6982a();
    }

    public final void onActivityDestroyed(Activity activity) {
        m6988a(3);
        m6982a();
    }

    public final void onActivityPaused(Activity activity) {
        m6983a(activity, 4);
        m6988a(3);
        m6982a();
    }

    public final void onActivityResumed(Activity activity) {
        m6983a(activity, 0);
        m6988a(3);
        m6982a();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m6988a(3);
        m6982a();
    }

    public final void onActivityStarted(Activity activity) {
        m6983a(activity, 0);
        m6988a(3);
        m6982a();
    }

    public final void onActivityStopped(Activity activity) {
        m6988a(3);
        m6982a();
    }

    public final void onGlobalLayout() {
        m6988a(2);
        m6982a();
    }

    public final void onScrollChanged() {
        m6988a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f7409n = -1;
        m6984a(view);
        m6988a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f7409n = -1;
        m6988a(3);
        m6982a();
        m6987b(view);
    }
}
