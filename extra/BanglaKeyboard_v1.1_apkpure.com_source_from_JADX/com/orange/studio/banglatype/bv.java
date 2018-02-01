package com.orange.studio.banglatype;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class bv {
    public static void m7436a(final Toolbar toolbar, final int i) {
        if (toolbar != null) {
            toolbar.post(new Runnable() {
                public final void run() {
                    Menu menu = toolbar.getMenu();
                    int i = i;
                    if (menu != null) {
                        int size = menu.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            MenuItem item = menu.getItem(i2);
                            av.m7349a(item, i);
                            if (item.hasSubMenu()) {
                                SubMenu subMenu = item.getSubMenu();
                                int size2 = subMenu.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    av.m7349a(subMenu.getItem(i3), i);
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
