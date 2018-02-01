package com.orange.studio.banglatype;

import android.graphics.drawable.Drawable;
import android.support.v4.p006a.p007a.C0366a;
import android.view.MenuItem;

public final class av {
    public static void m7349a(MenuItem menuItem, int i) {
        if (menuItem != null) {
            Drawable icon = menuItem.getIcon();
            if (icon != null) {
                icon = C0366a.m1054g(icon);
                C0366a.m1041a(icon.mutate(), i);
                menuItem.setIcon(icon);
            }
        }
    }
}
