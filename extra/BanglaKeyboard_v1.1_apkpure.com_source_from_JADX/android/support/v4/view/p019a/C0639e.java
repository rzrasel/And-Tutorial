package android.support.v4.view.p019a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class C0639e {

    interface C0632a {
        boolean mo625a();

        List<Object> mo626b();

        Object mo627c();

        Object mo628d();
    }

    static class C06381 extends AccessibilityNodeProvider {
        final /* synthetic */ C0632a f1926a;

        C06381(C0632a c0632a) {
            this.f1926a = c0632a;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            this.f1926a.mo627c();
            return null;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return this.f1926a.mo626b();
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            this.f1926a.mo628d();
            return null;
        }

        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1926a.mo625a();
        }
    }
}
