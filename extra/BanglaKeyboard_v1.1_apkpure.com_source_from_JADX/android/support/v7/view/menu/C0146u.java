package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C0131h.C0155a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class C0146u extends C0131h implements SubMenu {
    public C0131h f538l;
    private C0967j f539m;

    public C0146u(Context context, C0131h c0131h, C0967j c0967j) {
        super(context);
        this.f538l = c0131h;
        this.f539m = c0967j;
    }

    public final String mo72a() {
        int itemId = this.f539m != null ? this.f539m.getItemId() : 0;
        return itemId == 0 ? null : super.mo72a() + ":" + itemId;
    }

    public final void mo73a(C0155a c0155a) {
        this.f538l.mo73a(c0155a);
    }

    final boolean mo74a(C0131h c0131h, MenuItem menuItem) {
        return super.mo74a(c0131h, menuItem) || this.f538l.mo74a(c0131h, menuItem);
    }

    public final boolean mo75a(C0967j c0967j) {
        return this.f538l.mo75a(c0967j);
    }

    public final boolean mo76b() {
        return this.f538l.mo76b();
    }

    public final boolean mo77b(C0967j c0967j) {
        return this.f538l.mo77b(c0967j);
    }

    public final boolean mo78c() {
        return this.f538l.mo78c();
    }

    public MenuItem getItem() {
        return this.f539m;
    }

    public final C0131h mo79k() {
        return this.f538l.mo79k();
    }

    public SubMenu setHeaderIcon(int i) {
        super.m249a(0, null, i, null, null);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m249a(0, null, 0, drawable, null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.m249a(i, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m249a(0, charSequence, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.m249a(0, null, 0, null, view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f539m.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f539m.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f538l.setQwertyMode(z);
    }
}
