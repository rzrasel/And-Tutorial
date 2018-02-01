package android.support.v4.view;

import android.support.v4.view.p002a.C0049a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class C0080c implements C0079j {
    final /* synthetic */ C0075a f180a;
    final /* synthetic */ C0078b f181b;

    C0080c(C0078b c0078b, C0075a c0075a) {
        this.f181b = c0078b;
        this.f180a = c0075a;
    }

    public final void mo244a(View view, int i) {
        C0075a c0075a = this.f180a;
        C0075a.m299a(view, i);
    }

    public final void mo245a(View view, Object obj) {
        this.f180a.mo239a(view, new C0049a(obj));
    }

    public final boolean mo246a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f180a.mo286b(view, accessibilityEvent);
    }

    public final boolean mo247a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f180a.mo285a(viewGroup, view, accessibilityEvent);
    }

    public final void mo248b(View view, AccessibilityEvent accessibilityEvent) {
        this.f180a.mo241d(view, accessibilityEvent);
    }

    public final void mo249c(View view, AccessibilityEvent accessibilityEvent) {
        C0075a c0075a = this.f180a;
        C0075a.m301c(view, accessibilityEvent);
    }

    public final void mo250d(View view, AccessibilityEvent accessibilityEvent) {
        C0075a c0075a = this.f180a;
        C0075a.m300a(view, accessibilityEvent);
    }
}
