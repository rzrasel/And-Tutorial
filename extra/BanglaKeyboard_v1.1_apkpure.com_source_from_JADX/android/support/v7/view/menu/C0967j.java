package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.p010b.p011a.C0427b;
import android.support.v4.view.C0650b;
import android.support.v4.view.C0650b.C0645b;
import android.support.v7.p023c.p024a.C0862b;
import android.support.v7.view.menu.C0119p.C0117a;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class C0967j implements C0427b {
    static String f3063f;
    static String f3064g;
    static String f3065h;
    static String f3066i;
    private ColorStateList f3067A = null;
    private Mode f3068B = null;
    private boolean f3069C = false;
    private boolean f3070D = false;
    private boolean f3071E = false;
    private int f3072F = 16;
    private View f3073G;
    private OnActionExpandListener f3074H;
    private boolean f3075I = false;
    final int f3076a;
    C0131h f3077b;
    int f3078c = 0;
    public C0650b f3079d;
    ContextMenuInfo f3080e;
    private final int f3081j;
    private final int f3082k;
    private final int f3083l;
    private CharSequence f3084m;
    private CharSequence f3085n;
    private Intent f3086o;
    private char f3087p;
    private int f3088q = 4096;
    private char f3089r;
    private int f3090s = 4096;
    private Drawable f3091t;
    private int f3092u = 0;
    private C0146u f3093v;
    private Runnable f3094w;
    private OnMenuItemClickListener f3095x;
    private CharSequence f3096y;
    private CharSequence f3097z;

    class C09661 implements C0645b {
        final /* synthetic */ C0967j f3062a;

        C09661(C0967j c0967j) {
            this.f3062a = c0967j;
        }

        public final void mo933a() {
            this.f3062a.f3077b.m268f();
        }
    }

    C0967j(C0131h c0131h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3077b = c0131h;
        this.f3081j = i2;
        this.f3082k = i;
        this.f3083l = i3;
        this.f3076a = i4;
        this.f3084m = charSequence;
        this.f3078c = i5;
    }

    private Drawable m2806a(Drawable drawable) {
        if (drawable != null && this.f3071E && (this.f3069C || this.f3070D)) {
            drawable = C0366a.m1054g(drawable).mutate();
            if (this.f3069C) {
                C0366a.m1043a(drawable, this.f3067A);
            }
            if (this.f3070D) {
                C0366a.m1046a(drawable, this.f3068B);
            }
            this.f3071E = false;
        }
        return drawable;
    }

    private C0427b m2807a(View view) {
        this.f3073G = view;
        this.f3079d = null;
        if (view != null && view.getId() == -1 && this.f3081j > 0) {
            view.setId(this.f3081j);
        }
        this.f3077b.m269g();
        return this;
    }

    private void m2808e(boolean z) {
        int i = this.f3072F;
        this.f3072F = (z ? 2 : 0) | (this.f3072F & -3);
        if (i != this.f3072F) {
            this.f3077b.mo81a(false);
        }
    }

    public final C0427b mo895a(C0650b c0650b) {
        if (this.f3079d != null) {
            this.f3079d.reset();
        }
        this.f3073G = null;
        this.f3079d = c0650b;
        this.f3077b.mo81a(true);
        if (this.f3079d != null) {
            this.f3079d.setVisibilityListener(new C09661(this));
        }
        return this;
    }

    public final C0427b mo896a(CharSequence charSequence) {
        this.f3096y = charSequence;
        this.f3077b.mo81a(false);
        return this;
    }

    public final C0650b mo897a() {
        return this.f3079d;
    }

    final CharSequence m2812a(C0117a c0117a) {
        return (c0117a == null || !c0117a.mo43a()) ? getTitle() : getTitleCondensed();
    }

    public final void m2813a(C0146u c0146u) {
        this.f3093v = c0146u;
        c0146u.setHeaderTitle(getTitle());
    }

    public final void m2814a(boolean z) {
        this.f3072F = (z ? 4 : 0) | (this.f3072F & -5);
    }

    public final C0427b mo898b(CharSequence charSequence) {
        this.f3097z = charSequence;
        this.f3077b.mo81a(false);
        return this;
    }

    public final boolean m2816b() {
        if ((this.f3095x != null && this.f3095x.onMenuItemClick(this)) || this.f3077b.mo74a(this.f3077b, (MenuItem) this)) {
            return true;
        }
        if (this.f3094w != null) {
            this.f3094w.run();
            return true;
        }
        if (this.f3086o != null) {
            try {
                this.f3077b.f489a.startActivity(this.f3086o);
                return true;
            } catch (ActivityNotFoundException e) {
            }
        }
        return this.f3079d != null && this.f3079d.onPerformDefaultAction();
    }

    final boolean m2817b(boolean z) {
        int i = this.f3072F;
        this.f3072F = (z ? 0 : 8) | (this.f3072F & -9);
        return i != this.f3072F;
    }

    final char m2818c() {
        return this.f3077b.mo76b() ? this.f3089r : this.f3087p;
    }

    public final void m2819c(boolean z) {
        if (z) {
            this.f3072F |= 32;
        } else {
            this.f3072F &= -33;
        }
    }

    public final boolean collapseActionView() {
        return (this.f3078c & 8) == 0 ? false : this.f3073G == null ? true : (this.f3074H == null || this.f3074H.onMenuItemActionCollapse(this)) ? this.f3077b.mo77b(this) : false;
    }

    public final void m2820d(boolean z) {
        this.f3075I = z;
        this.f3077b.mo81a(false);
    }

    final boolean m2821d() {
        return this.f3077b.mo78c() && m2818c() != '\u0000';
    }

    public final boolean m2822e() {
        return (this.f3072F & 4) != 0;
    }

    public final boolean expandActionView() {
        return !m2826i() ? false : (this.f3074H == null || this.f3074H.onMenuItemActionExpand(this)) ? this.f3077b.mo75a(this) : false;
    }

    public final boolean m2823f() {
        return (this.f3072F & 32) == 32;
    }

    public final boolean m2824g() {
        return (this.f3078c & 1) == 1;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        if (this.f3073G != null) {
            return this.f3073G;
        }
        if (this.f3079d == null) {
            return null;
        }
        this.f3073G = this.f3079d.onCreateActionView(this);
        return this.f3073G;
    }

    public final int getAlphabeticModifiers() {
        return this.f3090s;
    }

    public final char getAlphabeticShortcut() {
        return this.f3089r;
    }

    public final CharSequence getContentDescription() {
        return this.f3096y;
    }

    public final int getGroupId() {
        return this.f3082k;
    }

    public final Drawable getIcon() {
        if (this.f3091t != null) {
            return m2806a(this.f3091t);
        }
        if (this.f3092u == 0) {
            return null;
        }
        Drawable b = C0862b.m2514b(this.f3077b.f489a, this.f3092u);
        this.f3092u = 0;
        this.f3091t = b;
        return m2806a(b);
    }

    public final ColorStateList getIconTintList() {
        return this.f3067A;
    }

    public final Mode getIconTintMode() {
        return this.f3068B;
    }

    public final Intent getIntent() {
        return this.f3086o;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f3081j;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.f3080e;
    }

    public final int getNumericModifiers() {
        return this.f3088q;
    }

    public final char getNumericShortcut() {
        return this.f3087p;
    }

    public final int getOrder() {
        return this.f3083l;
    }

    public final SubMenu getSubMenu() {
        return this.f3093v;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f3084m;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3085n != null ? this.f3085n : this.f3084m;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final CharSequence getTooltipText() {
        return this.f3097z;
    }

    public final boolean m2825h() {
        return (this.f3078c & 2) == 2;
    }

    public final boolean hasSubMenu() {
        return this.f3093v != null;
    }

    public final boolean m2826i() {
        if ((this.f3078c & 8) == 0) {
            return false;
        }
        if (this.f3073G == null && this.f3079d != null) {
            this.f3073G = this.f3079d.onCreateActionView(this);
        }
        return this.f3073G != null;
    }

    public final boolean isActionViewExpanded() {
        return this.f3075I;
    }

    public final boolean isCheckable() {
        return (this.f3072F & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f3072F & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f3072F & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f3079d == null || !this.f3079d.overridesItemVisibility()) ? (this.f3072F & 8) == 0 : (this.f3072F & 8) == 0 && this.f3079d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f3077b.f489a;
        m2807a(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        return m2807a(view);
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f3089r != c) {
            this.f3089r = Character.toLowerCase(c);
            this.f3077b.mo81a(false);
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (!(this.f3089r == c && this.f3090s == i)) {
            this.f3089r = Character.toLowerCase(c);
            this.f3090s = KeyEvent.normalizeMetaState(i);
            this.f3077b.mo81a(false);
        }
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f3072F;
        this.f3072F = (z ? 1 : 0) | (this.f3072F & -2);
        if (i != this.f3072F) {
            this.f3077b.mo81a(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f3072F & 4) != 0) {
            C0131h c0131h = this.f3077b;
            int groupId = getGroupId();
            int size = c0131h.f491c.size();
            c0131h.m265d();
            for (int i = 0; i < size; i++) {
                C0967j c0967j = (C0967j) c0131h.f491c.get(i);
                if (c0967j.getGroupId() == groupId && c0967j.m2822e() && c0967j.isCheckable()) {
                    c0967j.m2808e(c0967j == this);
                }
            }
            c0131h.m267e();
        } else {
            m2808e(z);
        }
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo896a(charSequence);
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f3072F |= 16;
        } else {
            this.f3072F &= -17;
        }
        this.f3077b.mo81a(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f3091t = null;
        this.f3092u = i;
        this.f3071E = true;
        this.f3077b.mo81a(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3092u = 0;
        this.f3091t = drawable;
        this.f3071E = true;
        this.f3077b.mo81a(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3067A = colorStateList;
        this.f3069C = true;
        this.f3071E = true;
        this.f3077b.mo81a(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f3068B = mode;
        this.f3070D = true;
        this.f3071E = true;
        this.f3077b.mo81a(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3086o = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f3087p != c) {
            this.f3087p = c;
            this.f3077b.mo81a(false);
        }
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (!(this.f3087p == c && this.f3088q == i)) {
            this.f3087p = c;
            this.f3088q = KeyEvent.normalizeMetaState(i);
            this.f3077b.mo81a(false);
        }
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f3074H = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f3095x = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f3087p = c;
        this.f3089r = Character.toLowerCase(c2);
        this.f3077b.mo81a(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3087p = c;
        this.f3088q = KeyEvent.normalizeMetaState(i);
        this.f3089r = Character.toLowerCase(c2);
        this.f3090s = KeyEvent.normalizeMetaState(i2);
        this.f3077b.mo81a(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f3078c = i;
                this.f3077b.m269g();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle(this.f3077b.f489a.getString(i));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3084m = charSequence;
        this.f3077b.mo81a(false);
        if (this.f3093v != null) {
            this.f3093v.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3085n = charSequence;
        this.f3077b.mo81a(false);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo898b(charSequence);
    }

    public final MenuItem setVisible(boolean z) {
        if (m2817b(z)) {
            this.f3077b.m268f();
        }
        return this;
    }

    public final String toString() {
        return this.f3084m != null ? this.f3084m.toString() : null;
    }
}
