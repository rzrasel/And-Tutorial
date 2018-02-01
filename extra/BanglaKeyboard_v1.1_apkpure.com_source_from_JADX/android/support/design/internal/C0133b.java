package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0146u;
import android.support.v7.view.menu.C0967j;
import android.view.SubMenu;

public final class C0133b extends C0131h {
    public C0133b(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0967j c0967j = (C0967j) mo64a(i, i2, i3, charSequence);
        C0146u c0147d = new C0147d(this.f489a, this, c0967j);
        c0967j.m2813a(c0147d);
        return c0147d;
    }
}
