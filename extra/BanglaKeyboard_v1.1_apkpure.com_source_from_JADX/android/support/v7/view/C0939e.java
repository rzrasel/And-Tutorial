package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.C0852b.C0806a;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0131h.C0155a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class C0939e extends C0852b implements C0155a {
    private Context f2884a;
    private ActionBarContextView f2885b;
    private C0806a f2886e;
    private WeakReference<View> f2887f;
    private boolean f2888g;
    private boolean f2889h;
    private C0131h f2890i;

    public C0939e(Context context, ActionBarContextView actionBarContextView, C0806a c0806a, boolean z) {
        this.f2884a = context;
        this.f2885b = actionBarContextView;
        this.f2886e = c0806a;
        C0131h c0131h = new C0131h(actionBarContextView.getContext());
        this.f2890i = c0131h;
        this.f2890i.mo73a((C0155a) this);
        this.f2889h = z;
    }

    public final MenuInflater mo826a() {
        return new C0944g(this.f2885b.getContext());
    }

    public final void mo827a(int i) {
        mo833b(this.f2884a.getString(i));
    }

    public final void mo828a(View view) {
        this.f2885b.setCustomView(view);
        this.f2887f = view != null ? new WeakReference(view) : null;
    }

    public final void mo829a(CharSequence charSequence) {
        this.f2885b.setSubtitle(charSequence);
    }

    public final void mo830a(boolean z) {
        super.mo830a(z);
        this.f2885b.setTitleOptional(z);
    }

    public final Menu mo831b() {
        return this.f2890i;
    }

    public final void mo832b(int i) {
        mo829a(this.f2884a.getString(i));
    }

    public final void mo833b(CharSequence charSequence) {
        this.f2885b.setTitle(charSequence);
    }

    public final void mo834c() {
        if (!this.f2888g) {
            this.f2888g = true;
            this.f2885b.sendAccessibilityEvent(32);
            this.f2886e.mo747a(this);
        }
    }

    public final void mo835d() {
        this.f2886e.mo750b(this, this.f2890i);
    }

    public final CharSequence mo836f() {
        return this.f2885b.getTitle();
    }

    public final CharSequence mo837g() {
        return this.f2885b.getSubtitle();
    }

    public final boolean mo838h() {
        return this.f2885b.isTitleOptional();
    }

    public final View mo839i() {
        return this.f2887f != null ? (View) this.f2887f.get() : null;
    }

    public final boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem) {
        return this.f2886e.mo749a((C0852b) this, menuItem);
    }

    public final void onMenuModeChange(C0131h c0131h) {
        mo835d();
        this.f2885b.showOverflowMenu();
    }
}
