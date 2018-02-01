package android.support.v4.view.p002a;

import android.view.accessibility.AccessibilityNodeInfo;

class C0053d extends C0052b {
    C0053d() {
    }

    public final void mo155b(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i);
    }

    public final void mo174h(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    public final void mo176i(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }

    public final int mo186r(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    public final boolean mo187s(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    public final boolean mo188t(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }
}
