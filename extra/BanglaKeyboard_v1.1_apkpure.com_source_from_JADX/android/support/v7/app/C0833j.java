package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.C0832i.C0828a;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

class C0833j extends C0832i {
    private final UiModeManager f2519x;

    class C0829a extends C0828a {
        final /* synthetic */ C0833j f2513d;

        C0829a(C0833j c0833j, Callback callback) {
            this.f2513d = c0833j;
            super(c0833j, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (this.f2513d.f2515p) {
                switch (i) {
                    case 0:
                        return m2404a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    C0833j(Context context, Window window, C0233d c0233d) {
        super(context, window, c0233d);
        this.f2519x = (UiModeManager) context.getSystemService("uimode");
    }

    Callback mo798a(Callback callback) {
        return new C0829a(this, callback);
    }

    final int mo799f(int i) {
        return (i == 0 && this.f2519x.getNightMode() == 0) ? -1 : super.mo799f(i);
    }
}
