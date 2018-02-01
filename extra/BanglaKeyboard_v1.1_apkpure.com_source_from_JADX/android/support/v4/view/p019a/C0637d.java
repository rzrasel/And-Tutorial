package android.support.v4.view.p019a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class C0637d {

    interface C0628a {
        boolean mo621a();

        List<Object> mo622b();

        Object mo623c();
    }

    static class C06361 extends AccessibilityNodeProvider {
        final /* synthetic */ C0628a f1925a;

        C06361(C0628a c0628a) {
            this.f1925a = c0628a;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            this.f1925a.mo623c();
            return null;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return this.f1925a.mo622b();
        }

        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1925a.mo621a();
        }
    }
}
