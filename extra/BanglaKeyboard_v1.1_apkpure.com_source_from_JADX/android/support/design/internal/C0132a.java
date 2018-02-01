package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0967j;
import android.view.MenuItem;
import android.view.SubMenu;

public final class C0132a extends C0131h {
    public C0132a(Context context) {
        super(context);
    }

    protected final MenuItem mo64a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        m265d();
        MenuItem a = super.mo64a(i, i2, i3, charSequence);
        if (a instanceof C0967j) {
            ((C0967j) a).m2814a(true);
        }
        m267e();
        return a;
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
