package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p010b.p011a.C0130a;
import android.support.v4.p010b.p011a.C0427b;
import android.view.Menu;
import android.view.MenuItem;

public final class C0977q {
    public static Menu m2829a(Context context, C0130a c0130a) {
        return new C0978r(context, c0130a);
    }

    public static MenuItem m2830a(Context context, C0427b c0427b) {
        return VERSION.SDK_INT >= 16 ? new C0974l(context, c0427b) : new C0972k(context, c0427b);
    }
}
