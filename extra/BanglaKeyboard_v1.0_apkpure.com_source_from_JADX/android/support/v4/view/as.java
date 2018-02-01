package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class as extends ar {
    as() {
    }

    public final void mo213a(View view, C0075a c0075a) {
        view.setAccessibilityDelegate((AccessibilityDelegate) c0075a.m302a());
    }

    public final boolean mo215a(View view) {
        return view.canScrollVertically(-1);
    }

    public final boolean mo216a(View view, int i) {
        return view.canScrollHorizontally(i);
    }
}
