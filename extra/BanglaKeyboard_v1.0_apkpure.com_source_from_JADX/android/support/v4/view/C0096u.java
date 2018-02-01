package android.support.v4.view;

import android.view.KeyEvent;

final class C0096u extends C0095t {
    C0096u() {
    }

    public final int mo264a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    public final boolean mo262b(int i) {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    public final boolean mo263c(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
