package android.support.v4.view.p002a;

import android.view.accessibility.AccessibilityRecord;

class C0072v extends C0071z {
    C0072v() {
    }

    public final Object mo198a() {
        return AccessibilityRecord.obtain();
    }

    public final void mo199a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public final void mo200a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public final void mo201b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public final void mo202c(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
