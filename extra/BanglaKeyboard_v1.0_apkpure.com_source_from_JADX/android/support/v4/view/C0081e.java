package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0056h;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

final class C0081e extends C0078b {
    C0081e() {
    }

    public final C0056h mo227a(Object obj, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = ((AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
        return accessibilityNodeProvider != null ? new C0056h(accessibilityNodeProvider) : null;
    }

    public final Object mo229a(C0075a c0075a) {
        return new C0087l(new C0083f(this, c0075a));
    }

    public final boolean mo232a(Object obj, View view, int i, Bundle bundle) {
        return ((AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
