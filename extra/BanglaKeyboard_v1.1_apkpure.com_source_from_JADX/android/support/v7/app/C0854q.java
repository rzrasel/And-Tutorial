package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0691w;
import android.support.v4.view.C0693v;
import android.support.v4.view.C0694x;
import android.support.v4.view.C0695y;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0775f;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.view.C0852b;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.view.C0936a;
import android.support.v7.view.C0944g;
import android.support.v7.view.C0946h;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0131h.C0155a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class C0854q extends ActionBar implements ActionBarVisibilityCallback {
    static final /* synthetic */ boolean f2581s = (!C0854q.class.desiredAssertionStatus());
    private static final Interpolator f2582t = new AccelerateInterpolator();
    private static final Interpolator f2583u = new DecelerateInterpolator();
    private boolean f2584A;
    private boolean f2585B;
    private ArrayList<Object> f2586C = new ArrayList();
    private boolean f2587D;
    private int f2588E = 0;
    private boolean f2589F;
    private boolean f2590G = true;
    private boolean f2591H;
    Context f2592a;
    ActionBarOverlayLayout f2593b;
    ActionBarContainer f2594c;
    DecorToolbar f2595d;
    ActionBarContextView f2596e;
    View f2597f;
    ScrollingTabContainerView f2598g;
    C0853a f2599h;
    C0852b f2600i;
    C0806a f2601j;
    boolean f2602k = true;
    boolean f2603l;
    boolean f2604m;
    C0946h f2605n;
    boolean f2606o;
    final C0691w f2607p = new C08491(this);
    final C0691w f2608q = new C08502(this);
    final C0695y f2609r = new C08513(this);
    private Context f2610v;
    private Activity f2611w;
    private Dialog f2612x;
    private ArrayList<Object> f2613y = new ArrayList();
    private int f2614z = -1;

    class C08491 extends C0694x {
        final /* synthetic */ C0854q f2571a;

        C08491(C0854q c0854q) {
            this.f2571a = c0854q;
        }

        public final void onAnimationEnd(View view) {
            if (this.f2571a.f2602k && this.f2571a.f2597f != null) {
                this.f2571a.f2597f.setTranslationY(0.0f);
                this.f2571a.f2594c.setTranslationY(0.0f);
            }
            this.f2571a.f2594c.setVisibility(8);
            this.f2571a.f2594c.setTransitioning(false);
            this.f2571a.f2605n = null;
            C0854q c0854q = this.f2571a;
            if (c0854q.f2601j != null) {
                c0854q.f2601j.mo747a(c0854q.f2600i);
                c0854q.f2600i = null;
                c0854q.f2601j = null;
            }
            if (this.f2571a.f2593b != null) {
                C0679r.m1944q(this.f2571a.f2593b);
            }
        }
    }

    class C08502 extends C0694x {
        final /* synthetic */ C0854q f2572a;

        C08502(C0854q c0854q) {
            this.f2572a = c0854q;
        }

        public final void onAnimationEnd(View view) {
            this.f2572a.f2605n = null;
            this.f2572a.f2594c.requestLayout();
        }
    }

    class C08513 implements C0695y {
        final /* synthetic */ C0854q f2573a;

        C08513(C0854q c0854q) {
            this.f2573a = c0854q;
        }

        public final void mo825a() {
            ((View) this.f2573a.f2594c.getParent()).invalidate();
        }
    }

    public class C0853a extends C0852b implements C0155a {
        final C0131h f2576a;
        final /* synthetic */ C0854q f2577b;
        private final Context f2578e;
        private C0806a f2579f;
        private WeakReference<View> f2580g;

        public C0853a(C0854q c0854q, Context context, C0806a c0806a) {
            this.f2577b = c0854q;
            this.f2578e = context;
            this.f2579f = c0806a;
            C0131h c0131h = new C0131h(context);
            this.f2576a = c0131h;
            this.f2576a.mo73a((C0155a) this);
        }

        public final MenuInflater mo826a() {
            return new C0944g(this.f2578e);
        }

        public final void mo827a(int i) {
            mo833b(this.f2577b.f2592a.getResources().getString(i));
        }

        public final void mo828a(View view) {
            this.f2577b.f2596e.setCustomView(view);
            this.f2580g = new WeakReference(view);
        }

        public final void mo829a(CharSequence charSequence) {
            this.f2577b.f2596e.setSubtitle(charSequence);
        }

        public final void mo830a(boolean z) {
            super.mo830a(z);
            this.f2577b.f2596e.setTitleOptional(z);
        }

        public final Menu mo831b() {
            return this.f2576a;
        }

        public final void mo832b(int i) {
            mo829a(this.f2577b.f2592a.getResources().getString(i));
        }

        public final void mo833b(CharSequence charSequence) {
            this.f2577b.f2596e.setTitle(charSequence);
        }

        public final void mo834c() {
            if (this.f2577b.f2599h == this) {
                if (C0854q.m2488a(this.f2577b.f2603l, this.f2577b.f2604m, false)) {
                    this.f2579f.mo747a(this);
                } else {
                    this.f2577b.f2600i = this;
                    this.f2577b.f2601j = this.f2579f;
                }
                this.f2579f = null;
                this.f2577b.m2509g(false);
                this.f2577b.f2596e.closeMode();
                this.f2577b.f2595d.getViewGroup().sendAccessibilityEvent(32);
                this.f2577b.f2593b.setHideOnContentScrollEnabled(this.f2577b.f2606o);
                this.f2577b.f2599h = null;
            }
        }

        public final void mo835d() {
            if (this.f2577b.f2599h == this) {
                this.f2576a.m265d();
                try {
                    this.f2579f.mo750b(this, this.f2576a);
                } finally {
                    this.f2576a.m267e();
                }
            }
        }

        public final boolean m2481e() {
            this.f2576a.m265d();
            try {
                boolean a = this.f2579f.mo748a((C0852b) this, this.f2576a);
                return a;
            } finally {
                this.f2576a.m267e();
            }
        }

        public final CharSequence mo836f() {
            return this.f2577b.f2596e.getTitle();
        }

        public final CharSequence mo837g() {
            return this.f2577b.f2596e.getSubtitle();
        }

        public final boolean mo838h() {
            return this.f2577b.f2596e.isTitleOptional();
        }

        public final View mo839i() {
            return this.f2580g != null ? (View) this.f2580g.get() : null;
        }

        public final boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem) {
            return this.f2579f != null ? this.f2579f.mo749a((C0852b) this, menuItem) : false;
        }

        public final void onMenuModeChange(C0131h c0131h) {
            if (this.f2579f != null) {
                mo835d();
                this.f2577b.f2596e.showOverflowMenu();
            }
        }
    }

    public C0854q(Activity activity, boolean z) {
        this.f2611w = activity;
        View decorView = activity.getWindow().getDecorView();
        m2487a(decorView);
        if (!z) {
            this.f2597f = decorView.findViewById(16908290);
        }
    }

    public C0854q(Dialog dialog) {
        this.f2612x = dialog;
        m2487a(dialog.getWindow().getDecorView());
    }

    private void m2486a(int i, int i2) {
        int displayOptions = this.f2595d.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.f2584A = true;
        }
        this.f2595d.setDisplayOptions((displayOptions & (i2 ^ -1)) | (i & i2));
    }

    private void m2487a(View view) {
        DecorToolbar decorToolbar;
        this.f2593b = (ActionBarOverlayLayout) view.findViewById(C0775f.decor_content_parent);
        if (this.f2593b != null) {
            this.f2593b.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C0775f.action_bar);
        if (findViewById instanceof DecorToolbar) {
            decorToolbar = (DecorToolbar) findViewById;
        } else if (findViewById instanceof Toolbar) {
            decorToolbar = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException(new StringBuilder("Can't make a decor toolbar out of ").append(findViewById).toString() != null ? findViewById.getClass().getSimpleName() : "null");
        }
        this.f2595d = decorToolbar;
        this.f2596e = (ActionBarContextView) view.findViewById(C0775f.action_context_bar);
        this.f2594c = (ActionBarContainer) view.findViewById(C0775f.action_bar_container);
        if (this.f2595d == null || this.f2596e == null || this.f2594c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2592a = this.f2595d.getContext();
        boolean z = (this.f2595d.getDisplayOptions() & 4) != 0;
        if (z) {
            this.f2584A = true;
        }
        C0936a a = C0936a.m2719a(this.f2592a);
        boolean z2 = (a.f2878a.getApplicationInfo().targetSdkVersion < 14) || z;
        mo815c(z2);
        m2489h(a.m2721b());
        TypedArray obtainStyledAttributes = this.f2592a.obtainStyledAttributes(null, C0779j.ActionBar, C0770a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0779j.ActionBar_hideOnContentScroll, false)) {
            if (this.f2593b.isInOverlayMode()) {
                this.f2606o = true;
                this.f2593b.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0779j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            C0679r.m1905a(this.f2594c, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    static boolean m2488a(boolean z, boolean z2, boolean z3) {
        return z3 ? true : (z || z2) ? false : true;
    }

    private void m2489h(boolean z) {
        boolean z2 = true;
        this.f2587D = z;
        if (this.f2587D) {
            this.f2594c.setTabContainer(null);
            this.f2595d.setEmbeddedTabView(this.f2598g);
        } else {
            this.f2595d.setEmbeddedTabView(null);
            this.f2594c.setTabContainer(this.f2598g);
        }
        boolean z3 = this.f2595d.getNavigationMode() == 2;
        if (this.f2598g != null) {
            if (z3) {
                this.f2598g.setVisibility(0);
                if (this.f2593b != null) {
                    C0679r.m1944q(this.f2593b);
                }
            } else {
                this.f2598g.setVisibility(8);
            }
        }
        DecorToolbar decorToolbar = this.f2595d;
        boolean z4 = !this.f2587D && z3;
        decorToolbar.setCollapsible(z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2593b;
        if (this.f2587D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    private void m2490i(boolean z) {
        float f;
        C0946h c0946h;
        C0693v b;
        if (C0854q.m2488a(this.f2603l, this.f2604m, this.f2589F)) {
            if (!this.f2590G) {
                this.f2590G = true;
                if (this.f2605n != null) {
                    this.f2605n.m2756b();
                }
                this.f2594c.setVisibility(0);
                if (this.f2588E == 0 && (this.f2591H || z)) {
                    this.f2594c.setTranslationY(0.0f);
                    f = (float) (-this.f2594c.getHeight());
                    if (z) {
                        int[] iArr = new int[]{0, 0};
                        this.f2594c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f2594c.setTranslationY(f);
                    c0946h = new C0946h();
                    b = C0679r.m1939l(this.f2594c).m1988b(0.0f);
                    b.m1986a(this.f2609r);
                    c0946h.m2752a(b);
                    if (this.f2602k && this.f2597f != null) {
                        this.f2597f.setTranslationY(f);
                        c0946h.m2752a(C0679r.m1939l(this.f2597f).m1988b(0.0f));
                    }
                    c0946h.m2754a(f2583u);
                    c0946h.m2757c();
                    c0946h.m2753a(this.f2608q);
                    this.f2605n = c0946h;
                    c0946h.m2755a();
                } else {
                    this.f2594c.setAlpha(1.0f);
                    this.f2594c.setTranslationY(0.0f);
                    if (this.f2602k && this.f2597f != null) {
                        this.f2597f.setTranslationY(0.0f);
                    }
                    this.f2608q.onAnimationEnd(null);
                }
                if (this.f2593b != null) {
                    C0679r.m1944q(this.f2593b);
                }
            }
        } else if (this.f2590G) {
            this.f2590G = false;
            if (this.f2605n != null) {
                this.f2605n.m2756b();
            }
            if (this.f2588E == 0 && (this.f2591H || z)) {
                this.f2594c.setAlpha(1.0f);
                this.f2594c.setTransitioning(true);
                c0946h = new C0946h();
                f = (float) (-this.f2594c.getHeight());
                if (z) {
                    int[] iArr2 = new int[]{0, 0};
                    this.f2594c.getLocationInWindow(iArr2);
                    f -= (float) iArr2[1];
                }
                b = C0679r.m1939l(this.f2594c).m1988b(f);
                b.m1986a(this.f2609r);
                c0946h.m2752a(b);
                if (this.f2602k && this.f2597f != null) {
                    c0946h.m2752a(C0679r.m1939l(this.f2597f).m1988b(f));
                }
                c0946h.m2754a(f2582t);
                c0946h.m2757c();
                c0946h.m2753a(this.f2607p);
                this.f2605n = c0946h;
                c0946h.m2755a();
                return;
            }
            this.f2607p.onAnimationEnd(null);
        }
    }

    public final C0852b mo840a(C0806a c0806a) {
        if (this.f2599h != null) {
            this.f2599h.mo834c();
        }
        this.f2593b.setHideOnContentScrollEnabled(false);
        this.f2596e.killMode();
        C0852b c0853a = new C0853a(this, this.f2596e.getContext(), c0806a);
        if (!c0853a.m2481e()) {
            return null;
        }
        this.f2599h = c0853a;
        c0853a.mo835d();
        this.f2596e.initForMode(c0853a);
        m2509g(true);
        this.f2596e.sendAccessibilityEvent(32);
        return c0853a;
    }

    public final void mo802a() {
        m2486a(2, 2);
    }

    public final void mo803a(int i) {
        mo806a(this.f2592a.getString(i));
    }

    public final void mo804a(Configuration configuration) {
        m2489h(C0936a.m2719a(this.f2592a).m2721b());
    }

    public final void mo805a(Drawable drawable) {
        this.f2595d.setNavigationIcon(drawable);
    }

    public final void mo806a(CharSequence charSequence) {
        this.f2595d.setTitle(charSequence);
    }

    public final void mo807a(boolean z) {
        m2486a(z ? 4 : 0, 4);
    }

    public final boolean mo808a(int i, KeyEvent keyEvent) {
        if (this.f2599h == null) {
            return false;
        }
        Menu menu = this.f2599h.f2576a;
        if (menu == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i, keyEvent, 0);
    }

    public final void mo810b() {
        m2486a(0, 16);
    }

    public final void mo811b(int i) {
        this.f2595d.setNavigationContentDescription(i);
    }

    public final void mo812b(CharSequence charSequence) {
        this.f2595d.setWindowTitle(charSequence);
    }

    public final void mo813b(boolean z) {
        m2486a(z ? 8 : 0, 8);
    }

    public final int mo814c() {
        return this.f2595d.getDisplayOptions();
    }

    public final void mo815c(boolean z) {
        this.f2595d.setHomeButtonEnabled(z);
    }

    public final Context mo816d() {
        if (this.f2610v == null) {
            TypedValue typedValue = new TypedValue();
            this.f2592a.getTheme().resolveAttribute(C0770a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2610v = new ContextThemeWrapper(this.f2592a, i);
            } else {
                this.f2610v = this.f2592a;
            }
        }
        return this.f2610v;
    }

    public final void mo817d(boolean z) {
        if (!this.f2584A) {
            mo807a(z);
        }
    }

    public final void mo818e(boolean z) {
        this.f2591H = z;
        if (!z && this.f2605n != null) {
            this.f2605n.m2756b();
        }
    }

    public void enableContentAnimations(boolean z) {
        this.f2602k = z;
    }

    public final void mo820f(boolean z) {
        if (z != this.f2585B) {
            this.f2585B = z;
            int size = this.f2586C.size();
            for (int i = 0; i < size; i++) {
                this.f2586C.get(i);
            }
        }
    }

    public final void m2509g(boolean z) {
        if (z) {
            if (!this.f2589F) {
                this.f2589F = true;
                if (this.f2593b != null) {
                    this.f2593b.setShowingForActionMode(true);
                }
                m2490i(false);
            }
        } else if (this.f2589F) {
            this.f2589F = false;
            if (this.f2593b != null) {
                this.f2593b.setShowingForActionMode(false);
            }
            m2490i(false);
        }
        if (C0679r.m1952y(this.f2594c)) {
            C0693v c0693v;
            C0693v c0693v2;
            if (z) {
                c0693v = this.f2595d.setupAnimatorToVisibility(4, 100);
                c0693v2 = this.f2596e.setupAnimatorToVisibility(0, 200);
            } else {
                c0693v2 = this.f2595d.setupAnimatorToVisibility(0, 200);
                c0693v = this.f2596e.setupAnimatorToVisibility(8, 100);
            }
            C0946h c0946h = new C0946h();
            c0946h.f2941a.add(c0693v);
            View view = (View) c0693v.f1997a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            view = (View) c0693v2.f1997a.get();
            if (view != null) {
                view.animate().setStartDelay(duration);
            }
            c0946h.f2941a.add(c0693v2);
            c0946h.m2755a();
        } else if (z) {
            this.f2595d.setVisibility(4);
            this.f2596e.setVisibility(0);
        } else {
            this.f2595d.setVisibility(0);
            this.f2596e.setVisibility(8);
        }
    }

    public final boolean mo823h() {
        if (this.f2595d == null || !this.f2595d.hasExpandedActionView()) {
            return false;
        }
        this.f2595d.collapseActionView();
        return true;
    }

    public void hideForSystem() {
        if (!this.f2604m) {
            this.f2604m = true;
            m2490i(true);
        }
    }

    public void onContentScrollStarted() {
        if (this.f2605n != null) {
            this.f2605n.m2756b();
            this.f2605n = null;
        }
    }

    public void onContentScrollStopped() {
    }

    public void onWindowVisibilityChanged(int i) {
        this.f2588E = i;
    }

    public void showForSystem() {
        if (this.f2604m) {
            this.f2604m = false;
            m2490i(true);
        }
    }
}
