package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class at extends as {
    at() {
    }

    public final void mo210a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    public final void mo214a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public void mo218b(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    public final void mo219c(View view) {
        view.postInvalidateOnAnimation();
    }

    public final int mo220d(View view) {
        return view.getImportantForAccessibility();
    }

    public final ViewParent mo223g(View view) {
        return view.getParentForAccessibility();
    }
}
