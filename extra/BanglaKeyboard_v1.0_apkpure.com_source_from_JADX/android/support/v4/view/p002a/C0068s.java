package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class C0068s extends AccessibilityNodeProvider {
    final /* synthetic */ C0063t f156a;

    C0068s(C0063t c0063t) {
        this.f156a = c0063t;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        this.f156a.mo196c();
        return null;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f156a.mo195b();
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        this.f156a.mo197d();
        return null;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f156a.mo194a();
    }
}
