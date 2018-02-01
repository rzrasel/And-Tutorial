package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.C0833j.C0829a;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

final class C0834g extends C0833j {

    class C0830a extends C0829a {
        final /* synthetic */ C0834g f2514b;

        C0830a(C0834g c0834g, Callback callback) {
            this.f2514b = c0834g;
            super(c0834g, callback);
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState g = this.f2514b.m2343g(0);
            if (g == null || g.f2420j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, g.f2420j, i);
            }
        }
    }

    C0834g(Context context, Window window, C0233d c0233d) {
        super(context, window, c0233d);
    }

    final Callback mo798a(Callback callback) {
        return new C0830a(this, callback);
    }
}
