package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class C0066p extends AccessibilityNodeProvider {
    final /* synthetic */ C0060q f155a;

    C0066p(C0060q c0060q) {
        this.f155a = c0060q;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        this.f155a.mo193c();
        return null;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f155a.mo192b();
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f155a.mo191a();
    }
}
