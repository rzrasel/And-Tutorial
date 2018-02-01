package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.app.NavUtils;
import android.support.v4.view.C0127n;
import android.support.v4.view.C0659e;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0693v;
import android.support.v4.view.C0694x;
import android.support.v4.view.C0696z;
import android.support.v4.widget.C0757j;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0772c;
import android.support.v7.p021a.C0780a.C0775f;
import android.support.v7.p021a.C0780a.C0776g;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.p023c.p024a.C0862b;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.view.C0938d;
import android.support.v7.view.C0939e;
import android.support.v7.view.menu.C0121o.C0803a;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0131h.C0155a;
import android.support.v7.view.menu.C0963f;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.OnAttachListener;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

class AppCompatDelegateImplV9 extends C0811f implements C0155a, Factory2 {
    private static final boolean f2456p = (VERSION.SDK_INT < 21);
    private boolean f2457A;
    private ViewGroup f2458B;
    private TextView f2459C;
    private View f2460D;
    private boolean f2461E;
    private boolean f2462F;
    private boolean f2463G;
    private PanelFeatureState[] f2464H;
    private PanelFeatureState f2465I;
    private boolean f2466J;
    private final Runnable f2467K = new C07951(this);
    private boolean f2468L;
    private Rect f2469M;
    private Rect f2470N;
    private C0838l f2471O;
    C0852b f2472q;
    ActionBarContextView f2473r;
    PopupWindow f2474s;
    Runnable f2475t;
    C0693v f2476u = null;
    boolean f2477v;
    int f2478w;
    private DecorContentParent f2479x;
    private C0804a f2480y;
    private C0809d f2481z;

    class C07951 implements Runnable {
        final /* synthetic */ AppCompatDelegateImplV9 f2401a;

        C07951(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2401a = appCompatDelegateImplV9;
        }

        public final void run() {
            if ((this.f2401a.f2478w & 1) != 0) {
                this.f2401a.m2346h(0);
            }
            if ((this.f2401a.f2478w & 4096) != 0) {
                this.f2401a.m2346h(108);
            }
            this.f2401a.f2477v = false;
            this.f2401a.f2478w = 0;
        }
    }

    class C07962 implements C0127n {
        final /* synthetic */ AppCompatDelegateImplV9 f2402a;

        C07962(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2402a = appCompatDelegateImplV9;
        }

        public final C0696z mo61a(View view, C0696z c0696z) {
            int b = c0696z.m1995b();
            int i = this.f2402a.m2347i(b);
            if (b != i) {
                c0696z = c0696z.m1994a(c0696z.m1993a(), i, c0696z.m1996c(), c0696z.m1997d());
            }
            return C0679r.m1904a(view, c0696z);
        }
    }

    class C07973 implements OnFitSystemWindowsListener {
        final /* synthetic */ AppCompatDelegateImplV9 f2403a;

        C07973(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2403a = appCompatDelegateImplV9;
        }

        public final void onFitSystemWindows(Rect rect) {
            rect.top = this.f2403a.m2347i(rect.top);
        }
    }

    class C07984 implements OnAttachListener {
        final /* synthetic */ AppCompatDelegateImplV9 f2404a;

        C07984(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2404a = appCompatDelegateImplV9;
        }

        public final void onAttachedFromWindow() {
        }

        public final void onDetachedFromWindow() {
            this.f2404a.m2353r();
        }
    }

    class C08005 implements Runnable {
        final /* synthetic */ AppCompatDelegateImplV9 f2406a;

        class C07991 extends C0694x {
            final /* synthetic */ C08005 f2405a;

            C07991(C08005 c08005) {
                this.f2405a = c08005;
            }

            public final void onAnimationEnd(View view) {
                this.f2405a.f2406a.f2473r.setAlpha(1.0f);
                this.f2405a.f2406a.f2476u.m1985a(null);
                this.f2405a.f2406a.f2476u = null;
            }

            public final void onAnimationStart(View view) {
                this.f2405a.f2406a.f2473r.setVisibility(0);
            }
        }

        C08005(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2406a = appCompatDelegateImplV9;
        }

        public final void run() {
            this.f2406a.f2474s.showAtLocation(this.f2406a.f2473r, 55, 0, 0);
            this.f2406a.m2351p();
            if (this.f2406a.m2350o()) {
                this.f2406a.f2473r.setAlpha(0.0f);
                this.f2406a.f2476u = C0679r.m1939l(this.f2406a.f2473r).m1983a(1.0f);
                this.f2406a.f2476u.m1985a(new C07991(this));
                return;
            }
            this.f2406a.f2473r.setAlpha(1.0f);
            this.f2406a.f2473r.setVisibility(0);
        }
    }

    class C08016 extends C0694x {
        final /* synthetic */ AppCompatDelegateImplV9 f2407a;

        C08016(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2407a = appCompatDelegateImplV9;
        }

        public final void onAnimationEnd(View view) {
            this.f2407a.f2473r.setAlpha(1.0f);
            this.f2407a.f2476u.m1985a(null);
            this.f2407a.f2476u = null;
        }

        public final void onAnimationStart(View view) {
            this.f2407a.f2473r.setVisibility(0);
            this.f2407a.f2473r.sendAccessibilityEvent(32);
            if (this.f2407a.f2473r.getParent() instanceof View) {
                C0679r.m1944q((View) this.f2407a.f2473r.getParent());
            }
        }
    }

    protected static final class PanelFeatureState {
        int f2411a;
        int f2412b;
        int f2413c;
        int f2414d;
        int f2415e;
        int f2416f;
        ViewGroup f2417g;
        View f2418h;
        View f2419i;
        C0131h f2420j;
        C0963f f2421k;
        Context f2422l;
        boolean f2423m;
        boolean f2424n;
        boolean f2425o;
        public boolean f2426p;
        boolean f2427q = false;
        boolean f2428r;
        Bundle f2429s;

        private static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new C08021();
            int f2408a;
            boolean f2409b;
            Bundle f2410c;

            static class C08021 implements ClassLoaderCreator<SavedState> {
                C08021() {
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return SavedState.m2258a(parcel, null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m2258a(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            SavedState() {
            }

            static SavedState m2258a(Parcel parcel, ClassLoader classLoader) {
                boolean z = true;
                SavedState savedState = new SavedState();
                savedState.f2408a = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f2409b = z;
                if (savedState.f2409b) {
                    savedState.f2410c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2408a);
                parcel.writeInt(this.f2409b ? 1 : 0);
                if (this.f2409b) {
                    parcel.writeBundle(this.f2410c);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f2411a = i;
        }

        final void m2259a(C0131h c0131h) {
            if (c0131h != this.f2420j) {
                if (this.f2420j != null) {
                    this.f2420j.m259b(this.f2421k);
                }
                this.f2420j = c0131h;
                if (c0131h != null && this.f2421k != null) {
                    c0131h.m252a(this.f2421k);
                }
            }
        }
    }

    private final class C0804a implements C0803a {
        final /* synthetic */ AppCompatDelegateImplV9 f2430a;

        C0804a(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2430a = appCompatDelegateImplV9;
        }

        public final void onCloseMenu(C0131h c0131h, boolean z) {
            this.f2430a.m2327a(c0131h);
        }

        public final boolean onOpenSubMenu(C0131h c0131h) {
            Callback callback = this.f2430a.f2442c.getCallback();
            if (callback != null) {
                callback.onMenuOpened(108, c0131h);
            }
            return true;
        }
    }

    class C0807b implements C0806a {
        final /* synthetic */ AppCompatDelegateImplV9 f2432a;
        private C0806a f2433b;

        class C08051 extends C0694x {
            final /* synthetic */ C0807b f2431a;

            C08051(C0807b c0807b) {
                this.f2431a = c0807b;
            }

            public final void onAnimationEnd(View view) {
                this.f2431a.f2432a.f2473r.setVisibility(8);
                if (this.f2431a.f2432a.f2474s != null) {
                    this.f2431a.f2432a.f2474s.dismiss();
                } else if (this.f2431a.f2432a.f2473r.getParent() instanceof View) {
                    C0679r.m1944q((View) this.f2431a.f2432a.f2473r.getParent());
                }
                this.f2431a.f2432a.f2473r.removeAllViews();
                this.f2431a.f2432a.f2476u.m1985a(null);
                this.f2431a.f2432a.f2476u = null;
            }
        }

        public C0807b(AppCompatDelegateImplV9 appCompatDelegateImplV9, C0806a c0806a) {
            this.f2432a = appCompatDelegateImplV9;
            this.f2433b = c0806a;
        }

        public final void mo747a(C0852b c0852b) {
            this.f2433b.mo747a(c0852b);
            if (this.f2432a.f2474s != null) {
                this.f2432a.c.getDecorView().removeCallbacks(this.f2432a.f2475t);
            }
            if (this.f2432a.f2473r != null) {
                this.f2432a.m2351p();
                this.f2432a.f2476u = C0679r.m1939l(this.f2432a.f2473r).m1983a(0.0f);
                this.f2432a.f2476u.m1985a(new C08051(this));
            }
            if (this.f2432a.f != null) {
                this.f2432a.f.onSupportActionModeFinished(this.f2432a.f2472q);
            }
            this.f2432a.f2472q = null;
        }

        public final boolean mo748a(C0852b c0852b, Menu menu) {
            return this.f2433b.mo748a(c0852b, menu);
        }

        public final boolean mo749a(C0852b c0852b, MenuItem menuItem) {
            return this.f2433b.mo749a(c0852b, menuItem);
        }

        public final boolean mo750b(C0852b c0852b, Menu menu) {
            return this.f2433b.mo750b(c0852b, menu);
        }
    }

    private class C0808c extends ContentFrameLayout {
        final /* synthetic */ AppCompatDelegateImplV9 f2434a;

        public C0808c(AppCompatDelegateImplV9 appCompatDelegateImplV9, Context context) {
            this.f2434a = appCompatDelegateImplV9;
            super(context);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f2434a.mo768a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                boolean z = x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
                if (z) {
                    this.f2434a.m2352q();
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C0862b.m2514b(getContext(), i));
        }
    }

    private final class C0809d implements C0803a {
        final /* synthetic */ AppCompatDelegateImplV9 f2435a;

        C0809d(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2435a = appCompatDelegateImplV9;
        }

        public final void onCloseMenu(C0131h c0131h, boolean z) {
            Menu menu;
            Menu k = c0131h.mo79k();
            boolean z2 = k != c0131h;
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = this.f2435a;
            if (z2) {
                menu = k;
            }
            PanelFeatureState a = appCompatDelegateImplV9.m2319a(menu);
            if (a == null) {
                return;
            }
            if (z2) {
                this.f2435a.m2323a(a.f2411a, a, k);
                this.f2435a.m2326a(a, true);
                return;
            }
            this.f2435a.m2326a(a, z);
        }

        public final boolean onOpenSubMenu(C0131h c0131h) {
            if (c0131h == null && this.f2435a.i) {
                Callback callback = this.f2435a.f2442c.getCallback();
                if (!(callback == null || this.f2435a.f2454o)) {
                    callback.onMenuOpened(108, c0131h);
                }
            }
            return true;
        }
    }

    AppCompatDelegateImplV9(Context context, Window window, C0233d c0233d) {
        super(context, window, c0233d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2313a(android.support.v7.app.AppCompatDelegateImplV9.PanelFeatureState r11, android.view.KeyEvent r12) {
        /*
        r10 = this;
        r1 = -1;
        r2 = -2;
        r3 = 0;
        r9 = 1;
        r0 = r11.f2425o;
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r10.f2454o;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r11.f2411a;
        if (r0 != 0) goto L_0x0032;
    L_0x0011:
        r4 = r10.b;
        r0 = r4.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.screenLayout;
        r0 = r0 & 15;
        r5 = 4;
        if (r0 != r5) goto L_0x0048;
    L_0x0022:
        r0 = r9;
    L_0x0023:
        r4 = r4.getApplicationInfo();
        r4 = r4.targetSdkVersion;
        r5 = 11;
        if (r4 < r5) goto L_0x004a;
    L_0x002d:
        r4 = r9;
    L_0x002e:
        if (r0 == 0) goto L_0x0032;
    L_0x0030:
        if (r4 != 0) goto L_0x000c;
    L_0x0032:
        r0 = r10.f2442c;
        r0 = r0.getCallback();
        if (r0 == 0) goto L_0x004c;
    L_0x003a:
        r4 = r11.f2411a;
        r5 = r11.f2420j;
        r0 = r0.onMenuOpened(r4, r5);
        if (r0 != 0) goto L_0x004c;
    L_0x0044:
        r10.m2326a(r11, r9);
        goto L_0x000c;
    L_0x0048:
        r0 = r3;
        goto L_0x0023;
    L_0x004a:
        r4 = r3;
        goto L_0x002e;
    L_0x004c:
        r0 = r10.b;
        r4 = "window";
        r0 = r0.getSystemService(r4);
        r8 = r0;
        r8 = (android.view.WindowManager) r8;
        if (r8 == 0) goto L_0x000c;
    L_0x0059:
        r0 = r10.m2315b(r11, r12);
        if (r0 == 0) goto L_0x000c;
    L_0x005f:
        r0 = r11.f2417g;
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r11.f2427q;
        if (r0 == 0) goto L_0x01e4;
    L_0x0067:
        r0 = r11.f2417g;
        if (r0 != 0) goto L_0x0152;
    L_0x006b:
        r0 = r10.m2312n();
        r1 = new android.util.TypedValue;
        r1.<init>();
        r4 = r0.getResources();
        r4 = r4.newTheme();
        r5 = r0.getTheme();
        r4.setTo(r5);
        r5 = android.support.v7.p021a.C0780a.C0770a.actionBarPopupTheme;
        r4.resolveAttribute(r5, r1, r9);
        r5 = r1.resourceId;
        if (r5 == 0) goto L_0x0091;
    L_0x008c:
        r5 = r1.resourceId;
        r4.applyStyle(r5, r9);
    L_0x0091:
        r5 = android.support.v7.p021a.C0780a.C0770a.panelMenuListTheme;
        r4.resolveAttribute(r5, r1, r9);
        r5 = r1.resourceId;
        if (r5 == 0) goto L_0x014b;
    L_0x009a:
        r1 = r1.resourceId;
        r4.applyStyle(r1, r9);
    L_0x009f:
        r1 = new android.support.v7.view.d;
        r1.<init>(r0, r3);
        r0 = r1.getTheme();
        r0.setTo(r4);
        r11.f2422l = r1;
        r0 = android.support.v7.p021a.C0780a.C0779j.AppCompatTheme;
        r0 = r1.obtainStyledAttributes(r0);
        r1 = android.support.v7.p021a.C0780a.C0779j.AppCompatTheme_panelBackground;
        r1 = r0.getResourceId(r1, r3);
        r11.f2412b = r1;
        r1 = android.support.v7.p021a.C0780a.C0779j.AppCompatTheme_android_windowAnimationStyle;
        r1 = r0.getResourceId(r1, r3);
        r11.f2416f = r1;
        r0.recycle();
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$c;
        r1 = r11.f2422l;
        r0.<init>(r10, r1);
        r11.f2417g = r0;
        r0 = 81;
        r11.f2413c = r0;
        r0 = r11.f2417g;
        if (r0 == 0) goto L_0x000c;
    L_0x00d7:
        r0 = r11.f2419i;
        if (r0 == 0) goto L_0x0165;
    L_0x00db:
        r0 = r11.f2419i;
        r11.f2418h = r0;
        r0 = r9;
    L_0x00e0:
        if (r0 == 0) goto L_0x000c;
    L_0x00e2:
        r0 = r11.f2418h;
        if (r0 == 0) goto L_0x01e1;
    L_0x00e6:
        r0 = r11.f2419i;
        if (r0 == 0) goto L_0x01d2;
    L_0x00ea:
        r0 = r9;
    L_0x00eb:
        if (r0 == 0) goto L_0x000c;
    L_0x00ed:
        r0 = r11.f2418h;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x01f7;
    L_0x00f5:
        r0 = new android.view.ViewGroup$LayoutParams;
        r0.<init>(r2, r2);
        r1 = r0;
    L_0x00fb:
        r0 = r11.f2412b;
        r4 = r11.f2417g;
        r4.setBackgroundResource(r0);
        r0 = r11.f2418h;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x0115;
    L_0x010a:
        r4 = r0 instanceof android.view.ViewGroup;
        if (r4 == 0) goto L_0x0115;
    L_0x010e:
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.f2418h;
        r0.removeView(r4);
    L_0x0115:
        r0 = r11.f2417g;
        r4 = r11.f2418h;
        r0.addView(r4, r1);
        r0 = r11.f2418h;
        r0 = r0.hasFocus();
        if (r0 != 0) goto L_0x0129;
    L_0x0124:
        r0 = r11.f2418h;
        r0.requestFocus();
    L_0x0129:
        r1 = r2;
    L_0x012a:
        r11.f2424n = r3;
        r0 = new android.view.WindowManager$LayoutParams;
        r3 = r11.f2414d;
        r4 = r11.f2415e;
        r5 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r6 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r7 = -3;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.f2413c;
        r0.gravity = r1;
        r1 = r11.f2416f;
        r0.windowAnimations = r1;
        r1 = r11.f2417g;
        r8.addView(r1, r0);
        r11.f2425o = r9;
        goto L_0x000c;
    L_0x014b:
        r1 = android.support.v7.p021a.C0780a.C0778i.Theme_AppCompat_CompactMenu;
        r4.applyStyle(r1, r9);
        goto L_0x009f;
    L_0x0152:
        r0 = r11.f2427q;
        if (r0 == 0) goto L_0x00d7;
    L_0x0156:
        r0 = r11.f2417g;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x00d7;
    L_0x015e:
        r0 = r11.f2417g;
        r0.removeAllViews();
        goto L_0x00d7;
    L_0x0165:
        r0 = r11.f2420j;
        if (r0 == 0) goto L_0x01cf;
    L_0x0169:
        r0 = r10.f2481z;
        if (r0 != 0) goto L_0x0174;
    L_0x016d:
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$d;
        r0.<init>(r10);
        r10.f2481z = r0;
    L_0x0174:
        r0 = r10.f2481z;
        r1 = r11.f2420j;
        if (r1 != 0) goto L_0x0186;
    L_0x017a:
        r0 = 0;
    L_0x017b:
        r0 = (android.view.View) r0;
        r11.f2418h = r0;
        r0 = r11.f2418h;
        if (r0 == 0) goto L_0x01cf;
    L_0x0183:
        r0 = r9;
        goto L_0x00e0;
    L_0x0186:
        r1 = r11.f2421k;
        if (r1 != 0) goto L_0x01a1;
    L_0x018a:
        r1 = new android.support.v7.view.menu.f;
        r4 = r11.f2422l;
        r5 = android.support.v7.p021a.C0780a.C0776g.abc_list_menu_item_layout;
        r1.<init>(r4, r5);
        r11.f2421k = r1;
        r1 = r11.f2421k;
        r1.setCallback(r0);
        r0 = r11.f2420j;
        r1 = r11.f2421k;
        r0.m252a(r1);
    L_0x01a1:
        r1 = r11.f2421k;
        r0 = r11.f2417g;
        r4 = r1.f3045d;
        if (r4 != 0) goto L_0x01cc;
    L_0x01a9:
        r4 = r1.f3043b;
        r5 = android.support.v7.p021a.C0780a.C0776g.abc_expanded_menu_layout;
        r0 = r4.inflate(r5, r0, r3);
        r0 = (android.support.v7.view.menu.ExpandedMenuView) r0;
        r1.f3045d = r0;
        r0 = r1.f3049h;
        if (r0 != 0) goto L_0x01c0;
    L_0x01b9:
        r0 = new android.support.v7.view.menu.f$a;
        r0.<init>(r1);
        r1.f3049h = r0;
    L_0x01c0:
        r0 = r1.f3045d;
        r4 = r1.f3049h;
        r0.setAdapter(r4);
        r0 = r1.f3045d;
        r0.setOnItemClickListener(r1);
    L_0x01cc:
        r0 = r1.f3045d;
        goto L_0x017b;
    L_0x01cf:
        r0 = r3;
        goto L_0x00e0;
    L_0x01d2:
        r0 = r11.f2421k;
        r0 = r0.m2802a();
        r0 = r0.getCount();
        if (r0 <= 0) goto L_0x01e1;
    L_0x01de:
        r0 = r9;
        goto L_0x00eb;
    L_0x01e1:
        r0 = r3;
        goto L_0x00eb;
    L_0x01e4:
        r0 = r11.f2419i;
        if (r0 == 0) goto L_0x01f4;
    L_0x01e8:
        r0 = r11.f2419i;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x01f4;
    L_0x01f0:
        r0 = r0.width;
        if (r0 == r1) goto L_0x012a;
    L_0x01f4:
        r1 = r2;
        goto L_0x012a;
    L_0x01f7:
        r1 = r0;
        goto L_0x00fb;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.a(android.support.v7.app.AppCompatDelegateImplV9$PanelFeatureState, android.view.KeyEvent):void");
    }

    private boolean m2314a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        return keyEvent.isSystem() ? false : ((panelFeatureState.f2423m || m2315b(panelFeatureState, keyEvent)) && panelFeatureState.f2420j != null) ? panelFeatureState.f2420j.performShortcut(i, keyEvent, 1) : false;
    }

    private boolean m2315b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.f2454o) {
            return false;
        }
        if (panelFeatureState.f2423m) {
            return true;
        }
        if (!(this.f2465I == null || this.f2465I == panelFeatureState)) {
            m2326a(this.f2465I, false);
        }
        Callback callback = this.f2442c.getCallback();
        if (callback != null) {
            panelFeatureState.f2419i = callback.onCreatePanelView(panelFeatureState.f2411a);
        }
        boolean z = panelFeatureState.f2411a == 0 || panelFeatureState.f2411a == 108;
        if (z && this.f2479x != null) {
            this.f2479x.setMenuPrepared();
        }
        if (panelFeatureState.f2419i == null && !(z && (this.f2446g instanceof C0845n))) {
            if (panelFeatureState.f2420j == null || panelFeatureState.f2428r) {
                if (panelFeatureState.f2420j == null) {
                    Context c0938d;
                    C0131h c0131h;
                    Context context = this.b;
                    if ((panelFeatureState.f2411a == 0 || panelFeatureState.f2411a == 108) && this.f2479x != null) {
                        Theme newTheme;
                        TypedValue typedValue = new TypedValue();
                        Theme theme = context.getTheme();
                        theme.resolveAttribute(C0770a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme = context.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            newTheme.resolveAttribute(C0770a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(C0770a.actionBarWidgetTheme, typedValue, true);
                            newTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (newTheme == null) {
                                newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                            }
                            newTheme.applyStyle(typedValue.resourceId, true);
                        }
                        Theme theme2 = newTheme;
                        if (theme2 != null) {
                            c0938d = new C0938d(context, 0);
                            c0938d.getTheme().setTo(theme2);
                            c0131h = new C0131h(c0938d);
                            c0131h.mo73a((C0155a) this);
                            panelFeatureState.m2259a(c0131h);
                            if (panelFeatureState.f2420j == null) {
                                return false;
                            }
                        }
                    }
                    c0938d = context;
                    c0131h = new C0131h(c0938d);
                    c0131h.mo73a((C0155a) this);
                    panelFeatureState.m2259a(c0131h);
                    if (panelFeatureState.f2420j == null) {
                        return false;
                    }
                }
                if (z && this.f2479x != null) {
                    if (this.f2480y == null) {
                        this.f2480y = new C0804a(this);
                    }
                    this.f2479x.setMenu(panelFeatureState.f2420j, this.f2480y);
                }
                panelFeatureState.f2420j.m265d();
                if (callback.onCreatePanelMenu(panelFeatureState.f2411a, panelFeatureState.f2420j)) {
                    panelFeatureState.f2428r = false;
                } else {
                    panelFeatureState.m2259a(null);
                    if (!z || this.f2479x == null) {
                        return false;
                    }
                    this.f2479x.setMenu(null, this.f2480y);
                    return false;
                }
            }
            panelFeatureState.f2420j.m265d();
            if (panelFeatureState.f2429s != null) {
                panelFeatureState.f2420j.m266d(panelFeatureState.f2429s);
                panelFeatureState.f2429s = null;
            }
            if (callback.onPreparePanel(0, panelFeatureState.f2419i, panelFeatureState.f2420j)) {
                panelFeatureState.f2426p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
                panelFeatureState.f2420j.setQwertyMode(panelFeatureState.f2426p);
                panelFeatureState.f2420j.m267e();
            } else {
                if (z && this.f2479x != null) {
                    this.f2479x.setMenu(null, this.f2480y);
                }
                panelFeatureState.f2420j.m267e();
                return false;
            }
        }
        panelFeatureState.f2423m = true;
        panelFeatureState.f2424n = false;
        this.f2465I = panelFeatureState;
        return true;
    }

    private void mo799f(int i) {
        this.f2478w |= 1 << i;
        if (!this.f2477v) {
            C0679r.m1916a(this.c.getDecorView(), this.f2467K);
            this.f2477v = true;
        }
    }

    private void m2317s() {
        if (!this.f2457A) {
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(C0779j.AppCompatTheme);
            if (obtainStyledAttributes.hasValue(C0779j.AppCompatTheme_windowActionBar)) {
                View view;
                View view2;
                if (obtainStyledAttributes.getBoolean(C0779j.AppCompatTheme_windowNoTitle, false)) {
                    mo774c(1);
                } else if (obtainStyledAttributes.getBoolean(C0779j.AppCompatTheme_windowActionBar, false)) {
                    mo774c(108);
                }
                if (obtainStyledAttributes.getBoolean(C0779j.AppCompatTheme_windowActionBarOverlay, false)) {
                    mo774c(109);
                }
                if (obtainStyledAttributes.getBoolean(C0779j.AppCompatTheme_windowActionModeOverlay, false)) {
                    mo774c(10);
                }
                this.l = obtainStyledAttributes.getBoolean(C0779j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                this.c.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.b);
                if (this.m) {
                    view = this.k ? (ViewGroup) from.inflate(C0776g.abc_screen_simple_overlay_action_mode, null) : (ViewGroup) from.inflate(C0776g.abc_screen_simple, null);
                    if (VERSION.SDK_INT >= 21) {
                        C0679r.m1914a(view, new C07962(this));
                        view2 = view;
                    } else {
                        ((FitWindowsViewGroup) view).setOnFitSystemWindowsListener(new C07973(this));
                        view2 = view;
                    }
                } else if (this.l) {
                    r0 = (ViewGroup) from.inflate(C0776g.abc_dialog_title_material, null);
                    this.j = false;
                    this.i = false;
                    view2 = r0;
                } else if (this.i) {
                    TypedValue typedValue = new TypedValue();
                    this.b.getTheme().resolveAttribute(C0770a.actionBarTheme, typedValue, true);
                    r0 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0938d(this.b, typedValue.resourceId) : this.b).inflate(C0776g.abc_screen_toolbar, null);
                    this.f2479x = (DecorContentParent) r0.findViewById(C0775f.decor_content_parent);
                    this.f2479x.setWindowCallback(this.f2442c.getCallback());
                    if (this.j) {
                        this.f2479x.initFeature(109);
                    }
                    if (this.f2461E) {
                        this.f2479x.initFeature(2);
                    }
                    if (this.f2462F) {
                        this.f2479x.initFeature(5);
                    }
                    view2 = r0;
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.i + ", windowActionBarOverlay: " + this.j + ", android:windowIsFloating: " + this.l + ", windowActionModeOverlay: " + this.k + ", windowNoTitle: " + this.m + " }");
                }
                if (this.f2479x == null) {
                    this.f2459C = (TextView) view2.findViewById(C0775f.title);
                }
                ViewUtils.makeOptionalFitsSystemWindows(view2);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view2.findViewById(C0775f.action_bar_activity_content);
                ViewGroup viewGroup = (ViewGroup) this.c.findViewById(16908290);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout) viewGroup).setForeground(null);
                    }
                }
                this.c.setContentView(view2);
                contentFrameLayout.setAttachListener(new C07984(this));
                this.f2458B = view2;
                CharSequence title = this.f2443d instanceof Activity ? ((Activity) this.f2443d).getTitle() : this.f2453n;
                if (!TextUtils.isEmpty(title)) {
                    mo772b(title);
                }
                contentFrameLayout = (ContentFrameLayout) this.f2458B.findViewById(16908290);
                view = this.c.getDecorView();
                contentFrameLayout.setDecorPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                TypedArray obtainStyledAttributes2 = this.b.obtainStyledAttributes(C0779j.AppCompatTheme);
                obtainStyledAttributes2.getValue(C0779j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
                obtainStyledAttributes2.getValue(C0779j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
                if (obtainStyledAttributes2.hasValue(C0779j.AppCompatTheme_windowFixedWidthMajor)) {
                    obtainStyledAttributes2.getValue(C0779j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
                }
                if (obtainStyledAttributes2.hasValue(C0779j.AppCompatTheme_windowFixedWidthMinor)) {
                    obtainStyledAttributes2.getValue(C0779j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
                }
                if (obtainStyledAttributes2.hasValue(C0779j.AppCompatTheme_windowFixedHeightMajor)) {
                    obtainStyledAttributes2.getValue(C0779j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
                }
                if (obtainStyledAttributes2.hasValue(C0779j.AppCompatTheme_windowFixedHeightMinor)) {
                    obtainStyledAttributes2.getValue(C0779j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout.requestLayout();
                this.f2457A = true;
                PanelFeatureState g = m2343g(0);
                if (!this.f2454o) {
                    if (g == null || g.f2420j == null) {
                        mo799f(108);
                        return;
                    }
                    return;
                }
                return;
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    private void m2318t() {
        if (this.f2457A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    final PanelFeatureState m2319a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f2464H;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f2420j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    public final C0852b mo760a(C0806a c0806a) {
        if (c0806a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f2472q != null) {
            this.f2472q.mo834c();
        }
        C0806a c0807b = new C0807b(this, c0806a);
        ActionBar a = mo751a();
        if (a != null) {
            this.f2472q = a.mo840a(c0807b);
            if (!(this.f2472q == null || this.f == null)) {
                this.f.onSupportActionModeStarted(this.f2472q);
            }
        }
        if (this.f2472q == null) {
            this.f2472q = mo769b(c0807b);
        }
        return this.f2472q;
    }

    public final <T extends View> T mo761a(int i) {
        m2317s();
        return this.c.findViewById(i);
    }

    View mo797a(String str, Context context, AttributeSet attributeSet) {
        if (this.d instanceof Factory) {
            View onCreateView = ((Factory) this.d).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    final void m2323a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f2464H.length) {
                panelFeatureState = this.f2464H[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f2420j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f2425o) && !this.f2454o) {
            this.d.onPanelClosed(i, menu);
        }
    }

    public final void mo762a(Configuration configuration) {
        if (this.i && this.f2457A) {
            ActionBar a = mo751a();
            if (a != null) {
                a.mo804a(configuration);
            }
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.b);
        mo759k();
    }

    public void mo763a(Bundle bundle) {
        if ((this.d instanceof Activity) && NavUtils.getParentActivityName((Activity) this.d) != null) {
            ActionBar actionBar = this.f2446g;
            if (actionBar == null) {
                this.f2468L = true;
            } else {
                actionBar.mo817d(true);
            }
        }
    }

    final void m2326a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.f2411a == 0 && this.f2479x != null && this.f2479x.isOverflowMenuShowing()) {
            m2327a(panelFeatureState.f2420j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (!(windowManager == null || !panelFeatureState.f2425o || panelFeatureState.f2417g == null)) {
            windowManager.removeView(panelFeatureState.f2417g);
            if (z) {
                m2323a(panelFeatureState.f2411a, panelFeatureState, null);
            }
        }
        panelFeatureState.f2423m = false;
        panelFeatureState.f2424n = false;
        panelFeatureState.f2425o = false;
        panelFeatureState.f2418h = null;
        panelFeatureState.f2427q = true;
        if (this.f2465I == panelFeatureState) {
            this.f2465I = null;
        }
    }

    final void m2327a(C0131h c0131h) {
        if (!this.f2463G) {
            this.f2463G = true;
            this.f2479x.dismissPopups();
            Callback callback = this.f2442c.getCallback();
            if (!(callback == null || this.f2454o)) {
                callback.onPanelClosed(108, c0131h);
            }
            this.f2463G = false;
        }
    }

    public final void mo764a(Toolbar toolbar) {
        if (this.d instanceof Activity) {
            ActionBar a = mo751a();
            if (a instanceof C0854q) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.h = null;
            if (a != null) {
                a.mo824i();
            }
            if (toolbar != null) {
                ActionBar c0845n = new C0845n(toolbar, ((Activity) this.d).getTitle(), this.e);
                this.g = c0845n;
                this.c.setCallback(c0845n.f2551c);
            } else {
                this.g = null;
                this.c.setCallback(this.e);
            }
            mo778g();
        }
    }

    public final void mo765a(View view) {
        m2317s();
        ViewGroup viewGroup = (ViewGroup) this.f2458B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.d.onContentChanged();
    }

    public final void mo766a(View view, LayoutParams layoutParams) {
        m2317s();
        ViewGroup viewGroup = (ViewGroup) this.f2458B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.d.onContentChanged();
    }

    final boolean mo767a(int i, KeyEvent keyEvent) {
        ActionBar a = mo751a();
        if (a != null && a.mo808a(i, keyEvent)) {
            return true;
        }
        if (this.f2465I == null || !m2314a(this.f2465I, keyEvent.getKeyCode(), keyEvent)) {
            if (this.f2465I == null) {
                PanelFeatureState g = m2343g(0);
                m2315b(g, keyEvent);
                boolean a2 = m2314a(g, keyEvent.getKeyCode(), keyEvent);
                g.f2423m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        } else if (this.f2465I == null) {
            return true;
        } else {
            this.f2465I.f2424n = true;
            return true;
        }
    }

    final boolean mo768a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.d.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 4:
                    this.f2466J = (keyEvent.getFlags() & 128) != 0;
                    break;
                case 82:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    PanelFeatureState g = m2343g(0);
                    if (g.f2425o) {
                        return true;
                    }
                    m2315b(g, keyEvent);
                    return true;
            }
            if (VERSION.SDK_INT < 11) {
                mo767a(keyCode, keyEvent);
            }
            return false;
        }
        boolean z;
        PanelFeatureState g2;
        switch (keyCode) {
            case 4:
                z = this.f2466J;
                this.f2466J = false;
                g2 = m2343g(0);
                if (g2 == null || !g2.f2425o) {
                    if (this.f2472q != null) {
                        this.f2472q.mo834c();
                        z = true;
                    } else {
                        ActionBar a = mo751a();
                        z = a != null && a.mo823h();
                    }
                    if (z) {
                        return true;
                    }
                } else if (z) {
                    return true;
                } else {
                    m2326a(g2, true);
                    return true;
                }
                break;
            case 82:
                if (this.f2472q != null) {
                    return true;
                }
                g2 = m2343g(0);
                if (this.f2479x == null || !this.f2479x.canShowOverflowMenu() || ViewConfiguration.get(this.b).hasPermanentMenuKey()) {
                    if (g2.f2425o || g2.f2424n) {
                        z = g2.f2425o;
                        m2326a(g2, true);
                    } else {
                        if (g2.f2423m) {
                            if (g2.f2428r) {
                                g2.f2423m = false;
                                z = m2315b(g2, keyEvent);
                            } else {
                                z = true;
                            }
                            if (z) {
                                m2313a(g2, keyEvent);
                                z = true;
                            }
                        }
                        z = false;
                    }
                } else if (this.f2479x.isOverflowMenuShowing()) {
                    z = this.f2479x.hideOverflowMenu();
                } else {
                    if (!this.f2454o && m2315b(g2, keyEvent)) {
                        z = this.f2479x.showOverflowMenu();
                    }
                    z = false;
                }
                if (!z) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.b.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
        }
        return false;
    }

    final C0852b mo769b(C0806a c0806a) {
        C0852b onWindowStartingSupportActionMode;
        ViewStubCompat viewStubCompat;
        TypedValue typedValue;
        Theme theme;
        Context c0938d;
        C0852b c0939e;
        m2351p();
        if (this.f2472q != null) {
            this.f2472q.mo834c();
        }
        if (!(this.f == null || this.f2454o)) {
            try {
                onWindowStartingSupportActionMode = this.f.onWindowStartingSupportActionMode(c0806a);
            } catch (AbstractMethodError e) {
            }
            if (onWindowStartingSupportActionMode == null) {
                this.f2472q = onWindowStartingSupportActionMode;
            } else {
                if (this.f2473r == null) {
                    if (this.l) {
                        viewStubCompat = (ViewStubCompat) this.f2458B.findViewById(C0775f.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(m2312n()));
                            this.f2473r = (ActionBarContextView) viewStubCompat.inflate();
                        }
                    } else {
                        typedValue = new TypedValue();
                        theme = this.b.getTheme();
                        theme.resolveAttribute(C0770a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId == 0) {
                            Theme newTheme = this.b.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            c0938d = new C0938d(this.b, 0);
                            c0938d.getTheme().setTo(newTheme);
                        } else {
                            c0938d = this.b;
                        }
                        this.f2473r = new ActionBarContextView(c0938d);
                        this.f2474s = new PopupWindow(c0938d, null, C0770a.actionModePopupWindowStyle);
                        C0757j.m2173a(this.f2474s, 2);
                        this.f2474s.setContentView(this.f2473r);
                        this.f2474s.setWidth(-1);
                        c0938d.getTheme().resolveAttribute(C0770a.actionBarSize, typedValue, true);
                        this.f2473r.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0938d.getResources().getDisplayMetrics()));
                        this.f2474s.setHeight(-2);
                        this.f2475t = new C08005(this);
                    }
                }
                if (this.f2473r != null) {
                    m2351p();
                    this.f2473r.killMode();
                    c0939e = new C0939e(this.f2473r.getContext(), this.f2473r, c0806a, this.f2474s != null);
                    if (c0806a.mo748a(c0939e, c0939e.mo831b())) {
                        this.f2472q = null;
                    } else {
                        c0939e.mo835d();
                        this.f2473r.initForMode(c0939e);
                        this.f2472q = c0939e;
                        if (m2350o()) {
                            this.f2473r.setAlpha(1.0f);
                            this.f2473r.setVisibility(0);
                            this.f2473r.sendAccessibilityEvent(32);
                            if (this.f2473r.getParent() instanceof View) {
                                C0679r.m1944q((View) this.f2473r.getParent());
                            }
                        } else {
                            this.f2473r.setAlpha(0.0f);
                            this.f2476u = C0679r.m1939l(this.f2473r).m1983a(1.0f);
                            this.f2476u.m1985a(new C08016(this));
                        }
                        if (this.f2474s != null) {
                            this.c.getDecorView().post(this.f2475t);
                        }
                    }
                }
            }
            if (!(this.f2472q == null || this.f == null)) {
                this.f.onSupportActionModeStarted(this.f2472q);
            }
            return this.f2472q;
        }
        onWindowStartingSupportActionMode = null;
        if (onWindowStartingSupportActionMode == null) {
            if (this.f2473r == null) {
                if (this.l) {
                    viewStubCompat = (ViewStubCompat) this.f2458B.findViewById(C0775f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m2312n()));
                        this.f2473r = (ActionBarContextView) viewStubCompat.inflate();
                    }
                } else {
                    typedValue = new TypedValue();
                    theme = this.b.getTheme();
                    theme.resolveAttribute(C0770a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId == 0) {
                        c0938d = this.b;
                    } else {
                        Theme newTheme2 = this.b.getResources().newTheme();
                        newTheme2.setTo(theme);
                        newTheme2.applyStyle(typedValue.resourceId, true);
                        c0938d = new C0938d(this.b, 0);
                        c0938d.getTheme().setTo(newTheme2);
                    }
                    this.f2473r = new ActionBarContextView(c0938d);
                    this.f2474s = new PopupWindow(c0938d, null, C0770a.actionModePopupWindowStyle);
                    C0757j.m2173a(this.f2474s, 2);
                    this.f2474s.setContentView(this.f2473r);
                    this.f2474s.setWidth(-1);
                    c0938d.getTheme().resolveAttribute(C0770a.actionBarSize, typedValue, true);
                    this.f2473r.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0938d.getResources().getDisplayMetrics()));
                    this.f2474s.setHeight(-2);
                    this.f2475t = new C08005(this);
                }
            }
            if (this.f2473r != null) {
                m2351p();
                this.f2473r.killMode();
                if (this.f2474s != null) {
                }
                c0939e = new C0939e(this.f2473r.getContext(), this.f2473r, c0806a, this.f2474s != null);
                if (c0806a.mo748a(c0939e, c0939e.mo831b())) {
                    this.f2472q = null;
                } else {
                    c0939e.mo835d();
                    this.f2473r.initForMode(c0939e);
                    this.f2472q = c0939e;
                    if (m2350o()) {
                        this.f2473r.setAlpha(1.0f);
                        this.f2473r.setVisibility(0);
                        this.f2473r.sendAccessibilityEvent(32);
                        if (this.f2473r.getParent() instanceof View) {
                            C0679r.m1944q((View) this.f2473r.getParent());
                        }
                    } else {
                        this.f2473r.setAlpha(0.0f);
                        this.f2476u = C0679r.m1939l(this.f2473r).m1983a(1.0f);
                        this.f2476u.m1985a(new C08016(this));
                    }
                    if (this.f2474s != null) {
                        this.c.getDecorView().post(this.f2475t);
                    }
                }
            }
        } else {
            this.f2472q = onWindowStartingSupportActionMode;
        }
        this.f.onSupportActionModeStarted(this.f2472q);
        return this.f2472q;
    }

    public final void mo770b(int i) {
        m2317s();
        ViewGroup viewGroup = (ViewGroup) this.f2458B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.b).inflate(i, viewGroup);
        this.d.onContentChanged();
    }

    public final void mo771b(View view, LayoutParams layoutParams) {
        m2317s();
        ((ViewGroup) this.f2458B.findViewById(16908290)).addView(view, layoutParams);
        this.d.onContentChanged();
    }

    final void mo772b(CharSequence charSequence) {
        if (this.f2479x != null) {
            this.f2479x.setWindowTitle(charSequence);
        } else if (this.f2446g != null) {
            this.f2446g.mo812b(charSequence);
        } else if (this.f2459C != null) {
            this.f2459C.setText(charSequence);
        }
    }

    public final void mo773c() {
        m2317s();
    }

    public final boolean mo774c(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.m && i == 108) {
            return false;
        }
        if (this.i && i == 1) {
            this.i = false;
        }
        switch (i) {
            case 1:
                m2318t();
                this.m = true;
                return true;
            case 2:
                m2318t();
                this.f2461E = true;
                return true;
            case 5:
                m2318t();
                this.f2462F = true;
                return true;
            case 10:
                m2318t();
                this.k = true;
                return true;
            case 108:
                m2318t();
                this.i = true;
                return true;
            case 109:
                m2318t();
                this.j = true;
                return true;
            default:
                return this.c.requestFeature(i);
        }
    }

    final void mo775d(int i) {
        if (i == 108) {
            ActionBar a = mo751a();
            if (a != null) {
                a.mo820f(false);
            }
        } else if (i == 0) {
            PanelFeatureState g = m2343g(i);
            if (g.f2425o) {
                m2326a(g, false);
            }
        }
    }

    public void mo756e() {
        ActionBar a = mo751a();
        if (a != null) {
            a.mo818e(false);
        }
    }

    final boolean mo776e(int i) {
        if (i != 108) {
            return false;
        }
        ActionBar a = mo751a();
        if (a == null) {
            return true;
        }
        a.mo820f(true);
        return true;
    }

    public final void mo777f() {
        ActionBar a = mo751a();
        if (a != null) {
            a.mo818e(true);
        }
    }

    protected final PanelFeatureState m2343g(int i) {
        Object obj = this.f2464H;
        if (obj == null || obj.length <= i) {
            Object obj2 = new PanelFeatureState[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f2464H = obj2;
            obj = obj2;
        }
        PanelFeatureState panelFeatureState = obj[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        panelFeatureState = new PanelFeatureState(i);
        obj[i] = panelFeatureState;
        return panelFeatureState;
    }

    public final void mo778g() {
        ActionBar a = mo751a();
        if (a == null || !a.mo822g()) {
            mo799f(0);
        }
    }

    public void mo757h() {
        if (this.f2477v) {
            this.c.getDecorView().removeCallbacks(this.f2467K);
        }
        super.mo757h();
        if (this.g != null) {
            this.g.mo824i();
        }
    }

    final void m2346h(int i) {
        PanelFeatureState g = m2343g(i);
        if (g.f2420j != null) {
            Bundle bundle = new Bundle();
            g.f2420j.m263c(bundle);
            if (bundle.size() > 0) {
                g.f2429s = bundle;
            }
            g.f2420j.m265d();
            g.f2420j.clear();
        }
        g.f2428r = true;
        g.f2427q = true;
        if ((i == 108 || i == 0) && this.f2479x != null) {
            g = m2343g(0);
            if (g != null) {
                g.f2423m = false;
                m2315b(g, null);
            }
        }
    }

    final int m2347i(int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (this.f2473r == null || !(this.f2473r.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2473r.getLayoutParams();
            if (this.f2473r.isShown()) {
                if (this.f2469M == null) {
                    this.f2469M = new Rect();
                    this.f2470N = new Rect();
                }
                Rect rect = this.f2469M;
                Rect rect2 = this.f2470N;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(this.f2458B, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f2460D == null) {
                        this.f2460D = new View(this.b);
                        this.f2460D.setBackgroundColor(this.b.getResources().getColor(C0772c.abc_input_method_navigation_guard));
                        this.f2458B.addView(this.f2460D, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = this.f2460D.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2460D.setLayoutParams(layoutParams);
                        }
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                if (this.f2460D == null) {
                    i3 = 0;
                }
                if (!(this.k || i3 == 0)) {
                    i = 0;
                }
                int i6 = i5;
                i5 = i3;
                i3 = i6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i5 = 0;
            } else {
                i3 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                this.f2473r.setLayoutParams(marginLayoutParams);
            }
            i2 = i5;
        }
        if (this.f2460D != null) {
            View view = this.f2460D;
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }

    public final void mo779j() {
        LayoutInflater from = LayoutInflater.from(this.b);
        if (from.getFactory() == null) {
            C0659e.m1748b(from, this);
        } else {
            from.getFactory2();
        }
    }

    public final void mo780m() {
        m2317s();
        if (this.i && this.g == null) {
            if (this.d instanceof Activity) {
                this.g = new C0854q((Activity) this.d, this.j);
            } else if (this.d instanceof Dialog) {
                this.g = new C0854q((Dialog) this.d);
            }
            if (this.g != null) {
                this.g.mo817d(this.f2468L);
            }
        }
    }

    final boolean m2350o() {
        return this.f2457A && this.f2458B != null && C0679r.m1952y(this.f2458B);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
        r7 = this;
        r2 = 1;
        r3 = 0;
        r0 = r7.mo797a(r9, r10, r11);
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = r7.f2471O;
        if (r0 != 0) goto L_0x0014;
    L_0x000d:
        r0 = new android.support.v7.app.l;
        r0.<init>();
        r7.f2471O = r0;
    L_0x0014:
        r0 = f2456p;
        if (r0 == 0) goto L_0x0172;
    L_0x0018:
        r0 = r11 instanceof org.xmlpull.v1.XmlPullParser;
        if (r0 == 0) goto L_0x005d;
    L_0x001c:
        r0 = r11;
        r0 = (org.xmlpull.v1.XmlPullParser) r0;
        r0 = r0.getDepth();
        if (r0 <= r2) goto L_0x005b;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r7.f2471O;
        r1 = f2456p;
        r4 = android.support.v7.widget.VectorEnabledTintResources.shouldBeUsed();
        if (r0 == 0) goto L_0x016f;
    L_0x0030:
        if (r8 == 0) goto L_0x016f;
    L_0x0032:
        r0 = r8.getContext();
    L_0x0036:
        r0 = android.support.v7.app.C0838l.m2420a(r0, r11, r1);
        if (r4 == 0) goto L_0x0040;
    L_0x003c:
        r0 = android.support.v7.widget.TintContextWrapper.wrap(r0);
    L_0x0040:
        r1 = 0;
        r4 = -1;
        r6 = r9.hashCode();
        switch(r6) {
            case -1946472170: goto L_0x00f9;
            case -1455429095: goto L_0x00d5;
            case -1346021293: goto L_0x00ed;
            case -938935918: goto L_0x0085;
            case -937446323: goto L_0x00b6;
            case -658531749: goto L_0x0105;
            case -339785223: goto L_0x00ac;
            case 776382189: goto L_0x00ca;
            case 1125864064: goto L_0x008e;
            case 1413872058: goto L_0x00e1;
            case 1601505219: goto L_0x00c0;
            case 1666676343: goto L_0x00a2;
            case 2001146706: goto L_0x0098;
            default: goto L_0x0049;
        };
    L_0x0049:
        r3 = r4;
    L_0x004a:
        switch(r3) {
            case 0: goto L_0x0111;
            case 1: goto L_0x0118;
            case 2: goto L_0x011f;
            case 3: goto L_0x0126;
            case 4: goto L_0x012d;
            case 5: goto L_0x0134;
            case 6: goto L_0x013b;
            case 7: goto L_0x0142;
            case 8: goto L_0x0149;
            case 9: goto L_0x0150;
            case 10: goto L_0x0157;
            case 11: goto L_0x015e;
            case 12: goto L_0x0165;
            default: goto L_0x004d;
        };
    L_0x004d:
        if (r1 != 0) goto L_0x016c;
    L_0x004f:
        if (r10 == r0) goto L_0x016c;
    L_0x0051:
        r0 = r5.m2423a(r0, r9, r11);
    L_0x0055:
        if (r0 == 0) goto L_0x0008;
    L_0x0057:
        android.support.v7.app.C0838l.m2422a(r0, r11);
        goto L_0x0008;
    L_0x005b:
        r0 = r3;
        goto L_0x0026;
    L_0x005d:
        r0 = r8;
        r0 = (android.view.ViewParent) r0;
        if (r0 != 0) goto L_0x0064;
    L_0x0062:
        r0 = r3;
        goto L_0x0026;
    L_0x0064:
        r1 = r7.c;
        r4 = r1.getDecorView();
        r1 = r0;
    L_0x006b:
        if (r1 != 0) goto L_0x006f;
    L_0x006d:
        r0 = r2;
        goto L_0x0026;
    L_0x006f:
        if (r1 == r4) goto L_0x007e;
    L_0x0071:
        r0 = r1 instanceof android.view.View;
        if (r0 == 0) goto L_0x007e;
    L_0x0075:
        r0 = r1;
        r0 = (android.view.View) r0;
        r0 = android.support.v4.view.C0679r.m1901B(r0);
        if (r0 == 0) goto L_0x0080;
    L_0x007e:
        r0 = r3;
        goto L_0x0026;
    L_0x0080:
        r1 = r1.getParent();
        goto L_0x006b;
    L_0x0085:
        r2 = "TextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x008d:
        goto L_0x004a;
    L_0x008e:
        r3 = "ImageView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0049;
    L_0x0096:
        r3 = r2;
        goto L_0x004a;
    L_0x0098:
        r2 = "Button";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00a0:
        r3 = 2;
        goto L_0x004a;
    L_0x00a2:
        r2 = "EditText";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00aa:
        r3 = 3;
        goto L_0x004a;
    L_0x00ac:
        r2 = "Spinner";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00b4:
        r3 = 4;
        goto L_0x004a;
    L_0x00b6:
        r2 = "ImageButton";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00be:
        r3 = 5;
        goto L_0x004a;
    L_0x00c0:
        r2 = "CheckBox";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00c8:
        r3 = 6;
        goto L_0x004a;
    L_0x00ca:
        r2 = "RadioButton";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00d2:
        r3 = 7;
        goto L_0x004a;
    L_0x00d5:
        r2 = "CheckedTextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00dd:
        r3 = 8;
        goto L_0x004a;
    L_0x00e1:
        r2 = "AutoCompleteTextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00e9:
        r3 = 9;
        goto L_0x004a;
    L_0x00ed:
        r2 = "MultiAutoCompleteTextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00f5:
        r3 = 10;
        goto L_0x004a;
    L_0x00f9:
        r2 = "RatingBar";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x0101:
        r3 = 11;
        goto L_0x004a;
    L_0x0105:
        r2 = "SeekBar";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x010d:
        r3 = 12;
        goto L_0x004a;
    L_0x0111:
        r1 = new android.support.v7.widget.AppCompatTextView;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0118:
        r1 = new android.support.v7.widget.AppCompatImageView;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x011f:
        r1 = new android.support.v7.widget.AppCompatButton;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0126:
        r1 = new android.support.v7.widget.AppCompatEditText;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x012d:
        r1 = new android.support.v7.widget.AppCompatSpinner;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0134:
        r1 = new android.support.v7.widget.AppCompatImageButton;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x013b:
        r1 = new android.support.v7.widget.AppCompatCheckBox;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0142:
        r1 = new android.support.v7.widget.AppCompatRadioButton;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0149:
        r1 = new android.support.v7.widget.AppCompatCheckedTextView;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0150:
        r1 = new android.support.v7.widget.AppCompatAutoCompleteTextView;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0157:
        r1 = new android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x015e:
        r1 = new android.support.v7.widget.AppCompatRatingBar;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0165:
        r1 = new android.support.v7.widget.AppCompatSeekBar;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x016c:
        r0 = r1;
        goto L_0x0055;
    L_0x016f:
        r0 = r10;
        goto L_0x0036;
    L_0x0172:
        r0 = r3;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem) {
        Callback callback = this.f2442c.getCallback();
        if (!(callback == null || this.f2454o)) {
            PanelFeatureState a = m2319a(c0131h.mo79k());
            if (a != null) {
                return callback.onMenuItemSelected(a.f2411a, menuItem);
            }
        }
        return false;
    }

    public void onMenuModeChange(C0131h c0131h) {
        if (this.f2479x == null || !this.f2479x.canShowOverflowMenu() || (ViewConfiguration.get(this.b).hasPermanentMenuKey() && !this.f2479x.isOverflowMenuShowPending())) {
            PanelFeatureState g = m2343g(0);
            g.f2427q = true;
            m2326a(g, false);
            m2313a(g, null);
            return;
        }
        Callback callback = this.f2442c.getCallback();
        if (this.f2479x.isOverflowMenuShowing()) {
            this.f2479x.hideOverflowMenu();
            if (!this.f2454o) {
                callback.onPanelClosed(108, m2343g(0).f2420j);
            }
        } else if (callback != null && !this.f2454o) {
            if (this.f2477v && (this.f2478w & 1) != 0) {
                this.c.getDecorView().removeCallbacks(this.f2467K);
                this.f2467K.run();
            }
            PanelFeatureState g2 = m2343g(0);
            if (g2.f2420j != null && !g2.f2428r && callback.onPreparePanel(0, g2.f2419i, g2.f2420j)) {
                callback.onMenuOpened(108, g2.f2420j);
                this.f2479x.showOverflowMenu();
            }
        }
    }

    final void m2351p() {
        if (this.f2476u != null) {
            this.f2476u.m1987a();
        }
    }

    final void m2352q() {
        m2326a(m2343g(0), true);
    }

    final void m2353r() {
        if (this.f2479x != null) {
            this.f2479x.dismissPopups();
        }
        if (this.f2474s != null) {
            this.c.getDecorView().removeCallbacks(this.f2475t);
            if (this.f2474s.isShowing()) {
                try {
                    this.f2474s.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f2474s = null;
        }
        m2351p();
        PanelFeatureState g = m2343g(0);
        if (g != null && g.f2420j != null) {
            g.f2420j.close();
        }
    }
}
