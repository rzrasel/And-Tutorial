package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.C0389c;
import android.support.v7.app.C0821b.C0820a;
import android.support.v7.p012d.p013a.C0866b;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.orange.studio.banglatype.R;

public class C0819a implements C0389c {
    public final DrawerLayout f2490a;
    public C0866b f2491b;
    public Drawable f2492c;
    public boolean f2493d;
    public boolean f2494e;
    public final int f2495f;
    public final int f2496g;
    public OnClickListener f2497h;
    private final C0813a f2498i;
    private boolean f2499j;
    private boolean f2500k;

    public interface C0794b {
        C0813a getDrawerToggleDelegate();
    }

    class C08121 implements OnClickListener {
        final /* synthetic */ C0819a f2482a;

        C08121(C0819a c0819a) {
            this.f2482a = c0819a;
        }

        public final void onClick(View view) {
            if (this.f2482a.f2493d) {
                this.f2482a.m2384b();
            } else if (this.f2482a.f2497h != null) {
                this.f2482a.f2497h.onClick(view);
            }
        }
    }

    public interface C0813a {
        Drawable mo781a();

        void mo782a(int i);

        void mo783a(Drawable drawable, int i);

        Context mo784b();

        boolean mo785c();
    }

    static class C0814c implements C0813a {
        final Activity f2483a;

        C0814c(Activity activity) {
            this.f2483a = activity;
        }

        public final Drawable mo781a() {
            return null;
        }

        public final void mo782a(int i) {
        }

        public final void mo783a(Drawable drawable, int i) {
        }

        public final Context mo784b() {
            return this.f2483a;
        }

        public final boolean mo785c() {
            return true;
        }
    }

    private static class C0815d implements C0813a {
        final Activity f2484a;
        C0820a f2485b;

        C0815d(Activity activity) {
            this.f2484a = activity;
        }

        public final Drawable mo781a() {
            return C0821b.m2386a(this.f2484a);
        }

        public final void mo782a(int i) {
            this.f2485b = C0821b.m2388a(this.f2485b, this.f2484a, i);
        }

        public final void mo783a(Drawable drawable, int i) {
            ActionBar actionBar = this.f2484a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.f2485b = C0821b.m2387a(this.f2484a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        public Context mo784b() {
            return this.f2484a;
        }

        public final boolean mo785c() {
            ActionBar actionBar = this.f2484a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    private static class C0816e extends C0815d {
        C0816e(Activity activity) {
            super(activity);
        }

        public final Context mo784b() {
            ActionBar actionBar = this.a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.a;
        }
    }

    private static class C0817f implements C0813a {
        final Activity f2486a;

        C0817f(Activity activity) {
            this.f2486a = activity;
        }

        public final Drawable mo781a() {
            TypedArray obtainStyledAttributes = mo784b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public final void mo782a(int i) {
            ActionBar actionBar = this.f2486a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        public final void mo783a(Drawable drawable, int i) {
            ActionBar actionBar = this.f2486a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        public final Context mo784b() {
            ActionBar actionBar = this.f2486a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f2486a;
        }

        public final boolean mo785c() {
            ActionBar actionBar = this.f2486a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    static class C0818g implements C0813a {
        final Toolbar f2487a;
        final Drawable f2488b;
        final CharSequence f2489c;

        C0818g(Toolbar toolbar) {
            this.f2487a = toolbar;
            this.f2488b = toolbar.getNavigationIcon();
            this.f2489c = toolbar.getNavigationContentDescription();
        }

        public final Drawable mo781a() {
            return this.f2488b;
        }

        public final void mo782a(int i) {
            if (i == 0) {
                this.f2487a.setNavigationContentDescription(this.f2489c);
            } else {
                this.f2487a.setNavigationContentDescription(i);
            }
        }

        public final void mo783a(Drawable drawable, int i) {
            this.f2487a.setNavigationIcon(drawable);
            mo782a(i);
        }

        public final Context mo784b() {
            return this.f2487a.getContext();
        }

        public final boolean mo785c() {
            return true;
        }
    }

    public C0819a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar) {
        this(activity, toolbar, drawerLayout);
    }

    private C0819a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout) {
        this.f2499j = true;
        this.f2493d = true;
        this.f2500k = false;
        if (toolbar != null) {
            this.f2498i = new C0818g(toolbar);
            toolbar.setNavigationOnClickListener(new C08121(this));
        } else if (activity instanceof C0794b) {
            this.f2498i = ((C0794b) activity).getDrawerToggleDelegate();
        } else if (VERSION.SDK_INT >= 18) {
            this.f2498i = new C0817f(activity);
        } else if (VERSION.SDK_INT >= 14) {
            this.f2498i = new C0816e(activity);
        } else if (VERSION.SDK_INT >= 11) {
            this.f2498i = new C0815d(activity);
        } else {
            this.f2498i = new C0814c(activity);
        }
        this.f2490a = drawerLayout;
        this.f2495f = R.string.navigation_drawer_open;
        this.f2496g = R.string.navigation_drawer_close;
        this.f2491b = new C0866b(this.f2498i.mo784b());
        this.f2492c = m2385c();
    }

    private void m2380a(float f) {
        if (f == 1.0f) {
            this.f2491b.m2526a(true);
        } else if (f == 0.0f) {
            this.f2491b.m2526a(false);
        }
        C0866b c0866b = this.f2491b;
        if (c0866b.f2632a != f) {
            c0866b.f2632a = f;
            c0866b.invalidateSelf();
        }
    }

    private void m2381a(int i) {
        this.f2498i.mo782a(i);
    }

    public final void m2382a() {
        if (this.f2490a.m2022c()) {
            m2380a(1.0f);
        } else {
            m2380a(0.0f);
        }
        if (this.f2493d) {
            m2383a(this.f2491b, this.f2490a.m2022c() ? this.f2496g : this.f2495f);
        }
    }

    public final void m2383a(Drawable drawable, int i) {
        if (!(this.f2500k || this.f2498i.mo785c())) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f2500k = true;
        }
        this.f2498i.mo783a(drawable, i);
    }

    public final void m2384b() {
        int a = this.f2490a.m2012a(8388611);
        if (this.f2490a.m2024d() && a != 2) {
            this.f2490a.m2020b();
        } else if (a != 1) {
            this.f2490a.m2014a();
        }
    }

    public final Drawable m2385c() {
        return this.f2498i.mo781a();
    }

    public void onDrawerClosed(View view) {
        m2380a(0.0f);
        if (this.f2493d) {
            m2381a(this.f2495f);
        }
    }

    public void onDrawerOpened(View view) {
        m2380a(1.0f);
        if (this.f2493d) {
            m2381a(this.f2496g);
        }
    }

    public void onDrawerSlide(View view, float f) {
        if (this.f2499j) {
            m2380a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m2380a(0.0f);
        }
    }

    public void onDrawerStateChanged(int i) {
    }
}
