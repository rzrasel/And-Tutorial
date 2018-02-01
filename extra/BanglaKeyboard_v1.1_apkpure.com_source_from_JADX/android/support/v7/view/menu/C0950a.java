package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.p010b.p011a.C0427b;
import android.support.v4.view.C0650b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class C0950a implements C0427b {
    private final int f2977a;
    private final int f2978b;
    private final int f2979c;
    private final int f2980d;
    private CharSequence f2981e;
    private CharSequence f2982f;
    private Intent f2983g;
    private char f2984h;
    private int f2985i = 4096;
    private char f2986j;
    private int f2987k = 4096;
    private Drawable f2988l;
    private int f2989m = 0;
    private Context f2990n;
    private OnMenuItemClickListener f2991o;
    private CharSequence f2992p;
    private CharSequence f2993q;
    private ColorStateList f2994r = null;
    private Mode f2995s = null;
    private boolean f2996t = false;
    private boolean f2997u = false;
    private int f2998v = 16;

    public C0950a(Context context, CharSequence charSequence) {
        this.f2990n = context;
        this.f2977a = 16908332;
        this.f2978b = 0;
        this.f2979c = 0;
        this.f2980d = 0;
        this.f2981e = charSequence;
    }

    private void m2767b() {
        if (this.f2988l == null) {
            return;
        }
        if (this.f2996t || this.f2997u) {
            this.f2988l = C0366a.m1054g(this.f2988l);
            this.f2988l = this.f2988l.mutate();
            if (this.f2996t) {
                C0366a.m1043a(this.f2988l, this.f2994r);
            }
            if (this.f2997u) {
                C0366a.m1046a(this.f2988l, this.f2995s);
            }
        }
    }

    public final C0427b mo895a(C0650b c0650b) {
        throw new UnsupportedOperationException();
    }

    public final C0427b mo896a(CharSequence charSequence) {
        this.f2992p = charSequence;
        return this;
    }

    public final C0650b mo897a() {
        return null;
    }

    public final C0427b mo898b(CharSequence charSequence) {
        this.f2993q = charSequence;
        return this;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f2987k;
    }

    public final char getAlphabeticShortcut() {
        return this.f2986j;
    }

    public final CharSequence getContentDescription() {
        return this.f2992p;
    }

    public final int getGroupId() {
        return this.f2978b;
    }

    public final Drawable getIcon() {
        return this.f2988l;
    }

    public final ColorStateList getIconTintList() {
        return this.f2994r;
    }

    public final Mode getIconTintMode() {
        return this.f2995s;
    }

    public final Intent getIntent() {
        return this.f2983g;
    }

    public final int getItemId() {
        return this.f2977a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f2985i;
    }

    public final char getNumericShortcut() {
        return this.f2984h;
    }

    public final int getOrder() {
        return this.f2980d;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f2981e;
    }

    public final CharSequence getTitleCondensed() {
        return this.f2982f != null ? this.f2982f : this.f2981e;
    }

    public final CharSequence getTooltipText() {
        return this.f2993q;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f2998v & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f2998v & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f2998v & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f2998v & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f2986j = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2986j = Character.toLowerCase(c);
        this.f2987k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f2998v = (z ? 1 : 0) | (this.f2998v & -2);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f2998v = (z ? 2 : 0) | (this.f2998v & -3);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f2992p = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f2998v = (z ? 16 : 0) | (this.f2998v & -17);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f2989m = i;
        this.f2988l = C0392a.getDrawable(this.f2990n, i);
        m2767b();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f2988l = drawable;
        this.f2989m = 0;
        m2767b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2994r = colorStateList;
        this.f2996t = true;
        m2767b();
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f2995s = mode;
        this.f2997u = true;
        m2767b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f2983g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f2984h = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f2984h = c;
        this.f2985i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2991o = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f2984h = c;
        this.f2986j = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2984h = c;
        this.f2985i = KeyEvent.normalizeMetaState(i);
        this.f2986j = Character.toLowerCase(c2);
        this.f2987k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f2981e = this.f2990n.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2981e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2982f = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f2993q = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        this.f2998v = (z ? 0 : 8) | (this.f2998v & 8);
        return this;
    }
}
