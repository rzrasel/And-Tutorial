package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p010b.p011a.C0428c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class C0982v extends C0978r implements SubMenu {
    C0982v(Context context, C0428c c0428c) {
        super(context, c0428c);
    }

    public final void clearHeader() {
        ((C0428c) this.d).clearHeader();
    }

    public final MenuItem getItem() {
        return m2772a(((C0428c) this.d).getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        ((C0428c) this.d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((C0428c) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        ((C0428c) this.d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((C0428c) this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((C0428c) this.d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        ((C0428c) this.d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((C0428c) this.d).setIcon(drawable);
        return this;
    }
}
