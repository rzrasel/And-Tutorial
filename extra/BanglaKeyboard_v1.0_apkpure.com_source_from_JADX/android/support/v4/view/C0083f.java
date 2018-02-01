package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0049a;
import android.support.v4.view.p002a.C0056h;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

final class C0083f implements C0082m {
    final /* synthetic */ C0075a f182a;
    final /* synthetic */ C0081e f183b;

    C0083f(C0081e c0081e, C0075a c0075a) {
        this.f183b = c0081e;
        this.f182a = c0075a;
    }

    public final Object mo251a(View view) {
        C0075a c0075a = this.f182a;
        C0056h a = C0075a.m298a(view);
        return a != null ? a.m259a() : null;
    }

    public final void mo252a(View view, int i) {
        C0075a c0075a = this.f182a;
        C0075a.m299a(view, i);
    }

    public final void mo253a(View view, Object obj) {
        this.f182a.mo239a(view, new C0049a(obj));
    }

    public final boolean mo254a(View view, int i, Bundle bundle) {
        return this.f182a.mo240a(view, i, bundle);
    }

    public final boolean mo255a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f182a.mo286b(view, accessibilityEvent);
    }

    public final boolean mo256a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f182a.mo285a(viewGroup, view, accessibilityEvent);
    }

    public final void mo257b(View view, AccessibilityEvent accessibilityEvent) {
        this.f182a.mo241d(view, accessibilityEvent);
    }

    public final void mo258c(View view, AccessibilityEvent accessibilityEvent) {
        C0075a c0075a = this.f182a;
        C0075a.m301c(view, accessibilityEvent);
    }

    public final void mo259d(View view, AccessibilityEvent accessibilityEvent) {
        C0075a c0075a = this.f182a;
        C0075a.m300a(view, accessibilityEvent);
    }
}
