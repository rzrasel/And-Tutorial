package android.support.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

final class an {
    private static final aq f1291a;

    static {
        if (VERSION.SDK_INT >= 18) {
            f1291a = new ap();
        } else {
            f1291a = new ao();
        }
    }

    static am m903a(ViewGroup viewGroup) {
        return f1291a.mo239a(viewGroup);
    }

    static void m904a(ViewGroup viewGroup, boolean z) {
        f1291a.mo240a(viewGroup, z);
    }
}
