package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p010b.p011a.C0427b;
import android.support.v4.p010b.p011a.C0428c;
import android.support.v4.p018f.C0478a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class C0953c<T> extends C0952d<T> {
    final Context f3000a;
    Map<C0427b, MenuItem> f3001b;
    Map<C0428c, SubMenu> f3002c;

    C0953c(Context context, T t) {
        super(t);
        this.f3000a = context;
    }

    final MenuItem m2772a(MenuItem menuItem) {
        if (!(menuItem instanceof C0427b)) {
            return menuItem;
        }
        C0427b c0427b = (C0427b) menuItem;
        if (this.f3001b == null) {
            this.f3001b = new C0478a();
        }
        MenuItem menuItem2 = (MenuItem) this.f3001b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = C0977q.m2830a(this.f3000a, c0427b);
        this.f3001b.put(c0427b, menuItem2);
        return menuItem2;
    }

    final SubMenu m2773a(SubMenu subMenu) {
        if (!(subMenu instanceof C0428c)) {
            return subMenu;
        }
        C0428c c0428c = (C0428c) subMenu;
        if (this.f3002c == null) {
            this.f3002c = new C0478a();
        }
        SubMenu subMenu2 = (SubMenu) this.f3002c.get(c0428c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = new C0982v(this.f3000a, c0428c);
        this.f3002c.put(c0428c, subMenu2);
        return subMenu2;
    }
}
